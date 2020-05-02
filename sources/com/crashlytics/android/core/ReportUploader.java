package com.crashlytics.android.core;

import android.util.Log;
import i.a.a.a.a;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import l.a.a.a.c;
import l.a.a.a.f;
import l.a.a.a.o.b.h;

public class ReportUploader {
    public static final Map<String, String> HEADER_INVALID_CLS_FILE = Collections.singletonMap("X-CRASHLYTICS-INVALID-SESSION", "1");
    public static final short[] RETRY_INTERVALS = {10, 20, 30, 60, 120, 300};
    public final String apiKey;
    public final CreateReportSpiCall createReportCall;
    public final Object fileAccessLock = new Object();
    public final HandlingExceptionCheck handlingExceptionCheck;
    public final ReportFilesProvider reportFilesProvider;
    public Thread uploadThread;

    public static final class AlwaysSendCheck implements SendCheck {
        public boolean canSendReports() {
            return true;
        }
    }

    public interface HandlingExceptionCheck {
        boolean isHandlingException();
    }

    public interface ReportFilesProvider {
        File[] getCompleteSessionFiles();

        File[] getInvalidSessionFiles();

        File[] getNativeReportFiles();
    }

    public interface SendCheck {
        boolean canSendReports();
    }

    public class Worker extends h {
        public final float delay;
        public final SendCheck sendCheck;

        public Worker(float f2, SendCheck sendCheck2) {
            this.delay = f2;
            this.sendCheck = sendCheck2;
        }

        private void attemptUploadWithRetry() {
            c a = f.a();
            StringBuilder a2 = a.a("Starting report processing in ");
            a2.append(this.delay);
            a2.append(" second(s)...");
            String sb = a2.toString();
            if (a.a(CrashlyticsCore.TAG, 3)) {
                Log.d(CrashlyticsCore.TAG, sb, (Throwable) null);
            }
            float f2 = this.delay;
            if (f2 > 0.0f) {
                try {
                    Thread.sleep((long) (f2 * 1000.0f));
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
            List<Report> findReports = ReportUploader.this.findReports();
            if (!ReportUploader.this.handlingExceptionCheck.isHandlingException()) {
                if (findReports.isEmpty() || this.sendCheck.canSendReports()) {
                    int i2 = 0;
                    while (!findReports.isEmpty() && !ReportUploader.this.handlingExceptionCheck.isHandlingException()) {
                        c a3 = f.a();
                        StringBuilder a4 = a.a("Attempting to send ");
                        a4.append(findReports.size());
                        a4.append(" report(s)");
                        String sb2 = a4.toString();
                        if (a3.a(CrashlyticsCore.TAG, 3)) {
                            Log.d(CrashlyticsCore.TAG, sb2, (Throwable) null);
                        }
                        for (Report forceUpload : findReports) {
                            ReportUploader.this.forceUpload(forceUpload);
                        }
                        findReports = ReportUploader.this.findReports();
                        if (!findReports.isEmpty()) {
                            int i3 = i2 + 1;
                            long j2 = (long) ReportUploader.RETRY_INTERVALS[Math.min(i2, ReportUploader.RETRY_INTERVALS.length - 1)];
                            String str = "Report submisson: scheduling delayed retry in " + j2 + " seconds";
                            if (f.a().a(CrashlyticsCore.TAG, 3)) {
                                Log.d(CrashlyticsCore.TAG, str, (Throwable) null);
                            }
                            try {
                                Thread.sleep(j2 * 1000);
                                i2 = i3;
                            } catch (InterruptedException unused2) {
                                Thread.currentThread().interrupt();
                                return;
                            }
                        }
                    }
                    return;
                }
                c a5 = f.a();
                StringBuilder a6 = a.a("User declined to send. Removing ");
                a6.append(findReports.size());
                a6.append(" Report(s).");
                String sb3 = a6.toString();
                if (a5.a(CrashlyticsCore.TAG, 3)) {
                    Log.d(CrashlyticsCore.TAG, sb3, (Throwable) null);
                }
                for (Report remove : findReports) {
                    remove.remove();
                }
            }
        }

        public void onRun() {
            try {
                attemptUploadWithRetry();
            } catch (Exception e) {
                if (f.a().a(CrashlyticsCore.TAG, 6)) {
                    Log.e(CrashlyticsCore.TAG, "An unexpected error occurred while attempting to upload crash reports.", e);
                }
            }
            Thread unused = ReportUploader.this.uploadThread = null;
        }
    }

    public ReportUploader(String str, CreateReportSpiCall createReportSpiCall, ReportFilesProvider reportFilesProvider2, HandlingExceptionCheck handlingExceptionCheck2) {
        if (createReportSpiCall != null) {
            this.createReportCall = createReportSpiCall;
            this.apiKey = str;
            this.reportFilesProvider = reportFilesProvider2;
            this.handlingExceptionCheck = handlingExceptionCheck2;
            return;
        }
        throw new IllegalArgumentException("createReportCall must not be null.");
    }

    public List<Report> findReports() {
        File[] completeSessionFiles;
        File[] invalidSessionFiles;
        File[] nativeReportFiles;
        if (f.a().a(CrashlyticsCore.TAG, 3)) {
            Log.d(CrashlyticsCore.TAG, "Checking for crash reports...", (Throwable) null);
        }
        synchronized (this.fileAccessLock) {
            completeSessionFiles = this.reportFilesProvider.getCompleteSessionFiles();
            invalidSessionFiles = this.reportFilesProvider.getInvalidSessionFiles();
            nativeReportFiles = this.reportFilesProvider.getNativeReportFiles();
        }
        LinkedList linkedList = new LinkedList();
        if (completeSessionFiles != null) {
            for (File file : completeSessionFiles) {
                c a = f.a();
                StringBuilder a2 = a.a("Found crash report ");
                a2.append(file.getPath());
                String sb = a2.toString();
                if (a.a(CrashlyticsCore.TAG, 3)) {
                    Log.d(CrashlyticsCore.TAG, sb, (Throwable) null);
                }
                linkedList.add(new SessionReport(file));
            }
        }
        HashMap hashMap = new HashMap();
        if (invalidSessionFiles != null) {
            for (File file2 : invalidSessionFiles) {
                String sessionIdFromSessionFile = CrashlyticsController.getSessionIdFromSessionFile(file2);
                if (!hashMap.containsKey(sessionIdFromSessionFile)) {
                    hashMap.put(sessionIdFromSessionFile, new LinkedList());
                }
                ((List) hashMap.get(sessionIdFromSessionFile)).add(file2);
            }
        }
        for (String str : hashMap.keySet()) {
            c a3 = f.a();
            String b2 = a.b("Found invalid session: ", str);
            if (a3.a(CrashlyticsCore.TAG, 3)) {
                Log.d(CrashlyticsCore.TAG, b2, (Throwable) null);
            }
            List list = (List) hashMap.get(str);
            linkedList.add(new InvalidSessionReport(str, (File[]) list.toArray(new File[list.size()])));
        }
        if (nativeReportFiles != null) {
            for (File nativeSessionReport : nativeReportFiles) {
                linkedList.add(new NativeSessionReport(nativeSessionReport));
            }
        }
        if (linkedList.isEmpty() && f.a().a(CrashlyticsCore.TAG, 3)) {
            Log.d(CrashlyticsCore.TAG, "No reports found.", (Throwable) null);
        }
        return linkedList;
    }

    public boolean forceUpload(Report report) {
        boolean z;
        synchronized (this.fileAccessLock) {
            z = false;
            try {
                boolean invoke = this.createReportCall.invoke(new CreateReportRequest(this.apiKey, report));
                c a = f.a();
                StringBuilder sb = new StringBuilder();
                sb.append("Crashlytics report upload ");
                sb.append(invoke ? "complete: " : "FAILED: ");
                sb.append(report.getIdentifier());
                String sb2 = sb.toString();
                if (a.a(CrashlyticsCore.TAG, 4)) {
                    Log.i(CrashlyticsCore.TAG, sb2, (Throwable) null);
                }
                if (invoke) {
                    report.remove();
                    z = true;
                }
            } catch (Exception e) {
                String str = "Error occurred sending report " + report;
                if (f.a().a(CrashlyticsCore.TAG, 6)) {
                    Log.e(CrashlyticsCore.TAG, str, e);
                }
            }
        }
        return z;
    }

    public boolean isUploading() {
        return this.uploadThread != null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void uploadReports(float r3, com.crashlytics.android.core.ReportUploader.SendCheck r4) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.lang.Thread r0 = r2.uploadThread     // Catch:{ all -> 0x002d }
            if (r0 == 0) goto L_0x001a
            l.a.a.a.c r3 = l.a.a.a.f.a()     // Catch:{ all -> 0x002d }
            java.lang.String r4 = "CrashlyticsCore"
            java.lang.String r0 = "Report upload has already been started."
            r1 = 3
            boolean r3 = r3.a(r4, r1)     // Catch:{ all -> 0x002d }
            if (r3 == 0) goto L_0x0018
            r3 = 0
            android.util.Log.d(r4, r0, r3)     // Catch:{ all -> 0x002d }
        L_0x0018:
            monitor-exit(r2)
            return
        L_0x001a:
            com.crashlytics.android.core.ReportUploader$Worker r0 = new com.crashlytics.android.core.ReportUploader$Worker     // Catch:{ all -> 0x002d }
            r0.<init>(r3, r4)     // Catch:{ all -> 0x002d }
            java.lang.Thread r3 = new java.lang.Thread     // Catch:{ all -> 0x002d }
            java.lang.String r4 = "Crashlytics Report Uploader"
            r3.<init>(r0, r4)     // Catch:{ all -> 0x002d }
            r2.uploadThread = r3     // Catch:{ all -> 0x002d }
            r3.start()     // Catch:{ all -> 0x002d }
            monitor-exit(r2)
            return
        L_0x002d:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crashlytics.android.core.ReportUploader.uploadReports(float, com.crashlytics.android.core.ReportUploader$SendCheck):void");
    }
}
