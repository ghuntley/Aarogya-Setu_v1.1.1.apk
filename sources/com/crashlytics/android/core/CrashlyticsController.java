package com.crashlytics.android.core;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Debug;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Log;
import com.crashlytics.android.answers.Answers;
import com.crashlytics.android.answers.EventLogger;
import com.crashlytics.android.core.CrashPromptDialog;
import com.crashlytics.android.core.CrashlyticsUncaughtExceptionHandler;
import com.crashlytics.android.core.LogFileManager;
import com.crashlytics.android.core.ReportUploader;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Thread;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import l.a.a.a.f;
import l.a.a.a.k;
import l.a.a.a.o.b.i;
import l.a.a.a.o.b.j;
import l.a.a.a.o.b.m;
import l.a.a.a.o.b.s;
import l.a.a.a.o.e.c;
import l.a.a.a.o.f.a;
import l.a.a.a.o.f.b;
import l.a.a.a.o.g.e;
import l.a.a.a.o.g.l;
import l.a.a.a.o.g.n;
import l.a.a.a.o.g.o;
import l.a.a.a.o.g.p;
import org.json.JSONObject;

public class CrashlyticsController {
    public static final int ANALYZER_VERSION = 1;
    public static final String COLLECT_CUSTOM_KEYS = "com.crashlytics.CollectCustomKeys";
    public static final String CRASHLYTICS_API_ENDPOINT = "com.crashlytics.ApiEndpoint";
    public static final String EVENT_TYPE_CRASH = "crash";
    public static final String EVENT_TYPE_LOGGED = "error";
    public static final String FATAL_SESSION_DIR = "fatal-sessions";
    public static final String FIREBASE_ANALYTICS_ORIGIN_CRASHLYTICS = "clx";
    public static final String FIREBASE_APPLICATION_EXCEPTION = "_ae";
    public static final String FIREBASE_CRASH_TYPE = "fatal";
    public static final int FIREBASE_CRASH_TYPE_FATAL = 1;
    public static final String FIREBASE_REALTIME = "_r";
    public static final String FIREBASE_TIMESTAMP = "timestamp";
    public static final String GENERATOR_FORMAT = "Crashlytics Android SDK/%s";
    public static final String[] INITIAL_SESSION_PART_TAGS = {SESSION_USER_TAG, SESSION_APP_TAG, SESSION_OS_TAG, SESSION_DEVICE_TAG};
    public static final String INVALID_CLS_CACHE_DIR = "invalidClsFiles";
    public static final Comparator<File> LARGEST_FILE_NAME_FIRST = new Comparator<File>() {
        public int compare(File file, File file2) {
            return file2.getName().compareTo(file.getName());
        }
    };
    public static final int MAX_INVALID_SESSIONS = 4;
    public static final int MAX_LOCAL_LOGGED_EXCEPTIONS = 64;
    public static final int MAX_OPEN_SESSIONS = 8;
    public static final int MAX_STACK_SIZE = 1024;
    public static final String NONFATAL_SESSION_DIR = "nonfatal-sessions";
    public static final int NUM_STACK_REPETITIONS_ALLOWED = 10;
    public static final Map<String, String> SEND_AT_CRASHTIME_HEADER = Collections.singletonMap("X-CRASHLYTICS-SEND-FLAGS", "1");
    public static final String SESSION_APP_TAG = "SessionApp";
    public static final FilenameFilter SESSION_BEGIN_FILE_FILTER = new FileNameContainsFilter(SESSION_BEGIN_TAG) {
        public boolean accept(File file, String str) {
            return super.accept(file, str) && str.endsWith(ClsFileOutputStream.SESSION_FILE_EXTENSION);
        }
    };
    public static final String SESSION_BEGIN_TAG = "BeginSession";
    public static final String SESSION_DEVICE_TAG = "SessionDevice";
    public static final FileFilter SESSION_DIRECTORY_FILTER = new FileFilter() {
        public boolean accept(File file) {
            return file.isDirectory() && file.getName().length() == 35;
        }
    };
    public static final String SESSION_EVENT_MISSING_BINARY_IMGS_TAG = "SessionMissingBinaryImages";
    public static final String SESSION_FATAL_TAG = "SessionCrash";
    public static final FilenameFilter SESSION_FILE_FILTER = new FilenameFilter() {
        public boolean accept(File file, String str) {
            return str.length() == 39 && str.endsWith(ClsFileOutputStream.SESSION_FILE_EXTENSION);
        }
    };
    public static final Pattern SESSION_FILE_PATTERN = Pattern.compile("([\\d|A-Z|a-z]{12}\\-[\\d|A-Z|a-z]{4}\\-[\\d|A-Z|a-z]{4}\\-[\\d|A-Z|a-z]{12}).+");
    public static final int SESSION_ID_LENGTH = 35;
    public static final String SESSION_JSON_SUFFIX = ".json";
    public static final String SESSION_NON_FATAL_TAG = "SessionEvent";
    public static final String SESSION_OS_TAG = "SessionOS";
    public static final String SESSION_USER_TAG = "SessionUser";
    public static final boolean SHOULD_PROMPT_BEFORE_SENDING_REPORTS_DEFAULT = false;
    public static final Comparator<File> SMALLEST_FILE_NAME_FIRST = new Comparator<File>() {
        public int compare(File file, File file2) {
            return file.getName().compareTo(file2.getName());
        }
    };
    public final AppData appData;
    public final AppMeasurementEventListenerRegistrar appMeasurementEventListenerRegistrar;
    public final CrashlyticsBackgroundWorker backgroundWorker;
    public CrashlyticsUncaughtExceptionHandler crashHandler;
    public final CrashlyticsCore crashlyticsCore;
    public final DevicePowerStateListener devicePowerStateListener;
    public final AtomicInteger eventCounter = new AtomicInteger(0);
    public final a fileStore;
    public final EventLogger firebaseAnalyticsLogger;
    public final ReportUploader.HandlingExceptionCheck handlingExceptionCheck;
    public final c httpRequestFactory;
    public final s idManager;
    public final LogFileDirectoryProvider logFileDirectoryProvider;
    public final LogFileManager logFileManager;
    public final PreferenceManager preferenceManager;
    public final ReportUploader.ReportFilesProvider reportFilesProvider;
    public final StackTraceTrimmingStrategy stackTraceTrimmingStrategy;
    public final String unityVersion;

    public static class AnySessionPartFileFilter implements FilenameFilter {
        public AnySessionPartFileFilter() {
        }

        public boolean accept(File file, String str) {
            return !CrashlyticsController.SESSION_FILE_FILTER.accept(file, str) && CrashlyticsController.SESSION_FILE_PATTERN.matcher(str).matches();
        }
    }

    public interface CodedOutputStreamWriteAction {
        void writeTo(CodedOutputStream codedOutputStream);
    }

    public static final class DefaultSettingsDataProvider implements CrashlyticsUncaughtExceptionHandler.SettingsDataProvider {
        public DefaultSettingsDataProvider() {
        }

        public l.a.a.a.o.g.s getSettingsData() {
            return p.b.a.a();
        }
    }

    public static class FileNameContainsFilter implements FilenameFilter {
        public final String string;

        public FileNameContainsFilter(String str) {
            this.string = str;
        }

        public boolean accept(File file, String str) {
            return str.contains(this.string) && !str.endsWith(ClsFileOutputStream.IN_PROGRESS_SESSION_FILE_EXTENSION);
        }
    }

    public interface FileOutputStreamWriteAction {
        void writeTo(FileOutputStream fileOutputStream);
    }

    public static class InvalidPartFileFilter implements FilenameFilter {
        public boolean accept(File file, String str) {
            return ClsFileOutputStream.TEMP_FILENAME_FILTER.accept(file, str) || str.contains(CrashlyticsController.SESSION_EVENT_MISSING_BINARY_IMGS_TAG);
        }
    }

    public static final class LogFileDirectoryProvider implements LogFileManager.DirectoryProvider {
        public static final String LOG_FILES_DIR = "log-files";
        public final a rootFileStore;

        public LogFileDirectoryProvider(a aVar) {
            this.rootFileStore = aVar;
        }

        public File getLogFileDir() {
            File file = new File(((b) this.rootFileStore).a(), LOG_FILES_DIR);
            if (!file.exists()) {
                file.mkdirs();
            }
            return file;
        }
    }

    public static final class PrivacyDialogCheck implements ReportUploader.SendCheck {
        public final k kit;
        public final PreferenceManager preferenceManager;
        public final n promptData;

        public PrivacyDialogCheck(k kVar, PreferenceManager preferenceManager2, n nVar) {
            this.kit = kVar;
            this.preferenceManager = preferenceManager2;
            this.promptData = nVar;
        }

        public boolean canSendReports() {
            WeakReference<Activity> weakReference = this.kit.getFabric().f5038h;
            Activity activity = weakReference != null ? (Activity) weakReference.get() : null;
            if (activity == null || activity.isFinishing()) {
                return true;
            }
            final CrashPromptDialog create = CrashPromptDialog.create(activity, this.promptData, new CrashPromptDialog.AlwaysSendCallback() {
                public void sendUserReportsWithoutPrompting(boolean z) {
                    PrivacyDialogCheck.this.preferenceManager.setShouldAlwaysSendReports(z);
                }
            });
            activity.runOnUiThread(new Runnable() {
                public void run() {
                    create.show();
                }
            });
            if (f.a().a(CrashlyticsCore.TAG, 3)) {
                Log.d(CrashlyticsCore.TAG, "Waiting for user opt-in.", (Throwable) null);
            }
            create.await();
            return create.getOptIn();
        }
    }

    public final class ReportUploaderFilesProvider implements ReportUploader.ReportFilesProvider {
        public ReportUploaderFilesProvider() {
        }

        public File[] getCompleteSessionFiles() {
            return CrashlyticsController.this.listCompleteSessionFiles();
        }

        public File[] getInvalidSessionFiles() {
            return CrashlyticsController.this.getInvalidFilesDir().listFiles();
        }

        public File[] getNativeReportFiles() {
            return CrashlyticsController.this.listNativeSessionFileDirectories();
        }
    }

    public final class ReportUploaderHandlingExceptionCheck implements ReportUploader.HandlingExceptionCheck {
        public ReportUploaderHandlingExceptionCheck() {
        }

        public boolean isHandlingException() {
            return CrashlyticsController.this.isHandlingException();
        }
    }

    public static final class SendReportRunnable implements Runnable {
        public final Context context;
        public final Report report;
        public final ReportUploader reportUploader;

        public SendReportRunnable(Context context2, Report report2, ReportUploader reportUploader2) {
            this.context = context2;
            this.report = report2;
            this.reportUploader = reportUploader2;
        }

        public void run() {
            if (i.a(this.context)) {
                if (f.a().a(CrashlyticsCore.TAG, 3)) {
                    Log.d(CrashlyticsCore.TAG, "Attempting to send crash report at time of crash...", (Throwable) null);
                }
                this.reportUploader.forceUpload(this.report);
            }
        }
    }

    public static class SessionPartFileFilter implements FilenameFilter {
        public final String sessionId;

        public SessionPartFileFilter(String str) {
            this.sessionId = str;
        }

        public boolean accept(File file, String str) {
            if (!str.equals(this.sessionId + ClsFileOutputStream.SESSION_FILE_EXTENSION) && str.contains(this.sessionId) && !str.endsWith(ClsFileOutputStream.IN_PROGRESS_SESSION_FILE_EXTENSION)) {
                return true;
            }
            return false;
        }
    }

    public CrashlyticsController(CrashlyticsCore crashlyticsCore2, CrashlyticsBackgroundWorker crashlyticsBackgroundWorker, c cVar, s sVar, PreferenceManager preferenceManager2, a aVar, AppData appData2, UnityVersionProvider unityVersionProvider, AppMeasurementEventListenerRegistrar appMeasurementEventListenerRegistrar2, EventLogger eventLogger) {
        this.crashlyticsCore = crashlyticsCore2;
        this.backgroundWorker = crashlyticsBackgroundWorker;
        this.httpRequestFactory = cVar;
        this.idManager = sVar;
        this.preferenceManager = preferenceManager2;
        this.fileStore = aVar;
        this.appData = appData2;
        this.unityVersion = unityVersionProvider.getUnityVersion();
        this.appMeasurementEventListenerRegistrar = appMeasurementEventListenerRegistrar2;
        this.firebaseAnalyticsLogger = eventLogger;
        Context context = crashlyticsCore2.getContext();
        this.logFileDirectoryProvider = new LogFileDirectoryProvider(aVar);
        this.logFileManager = new LogFileManager(context, this.logFileDirectoryProvider);
        this.reportFilesProvider = new ReportUploaderFilesProvider();
        this.handlingExceptionCheck = new ReportUploaderHandlingExceptionCheck();
        this.devicePowerStateListener = new DevicePowerStateListener(context);
        this.stackTraceTrimmingStrategy = new MiddleOutFallbackStrategy(1024, new RemoveRepeatsStrategy(10));
    }

    private void closeOpenSessions(File[] fileArr, int i2, int i3) {
        if (f.a().a(CrashlyticsCore.TAG, 3)) {
            Log.d(CrashlyticsCore.TAG, "Closing open sessions.", (Throwable) null);
        }
        while (i2 < fileArr.length) {
            File file = fileArr[i2];
            String sessionIdFromSessionFile = getSessionIdFromSessionFile(file);
            l.a.a.a.c a = f.a();
            String b2 = i.a.a.a.a.b("Closing session: ", sessionIdFromSessionFile);
            if (a.a(CrashlyticsCore.TAG, 3)) {
                Log.d(CrashlyticsCore.TAG, b2, (Throwable) null);
            }
            writeSessionPartsToSessionFile(file, sessionIdFromSessionFile, i3);
            i2++;
        }
    }

    private void closeWithoutRenamingOrLog(ClsFileOutputStream clsFileOutputStream) {
        if (clsFileOutputStream != null) {
            try {
                clsFileOutputStream.closeInProgressStream();
            } catch (IOException e) {
                if (f.a().a(CrashlyticsCore.TAG, 6)) {
                    Log.e(CrashlyticsCore.TAG, "Error closing session file stream in the presence of an exception", e);
                }
            }
        }
    }

    public static void copyToCodedOutputStream(InputStream inputStream, CodedOutputStream codedOutputStream, int i2) {
        byte[] bArr = new byte[i2];
        int i3 = 0;
        while (i3 < i2) {
            int read = inputStream.read(bArr, i3, i2 - i3);
            if (read < 0) {
                break;
            }
            i3 += read;
        }
        codedOutputStream.writeRawBytes(bArr);
    }

    private void deleteSessionPartFilesFor(String str) {
        for (File delete : listSessionPartFilesFor(str)) {
            delete.delete();
        }
    }

    /* access modifiers changed from: private */
    public void doOpenSession() {
        Date date = new Date();
        String clsuuid = new CLSUUID(this.idManager).toString();
        l.a.a.a.c a = f.a();
        String b2 = i.a.a.a.a.b("Opening a new session with ID ", clsuuid);
        if (a.a(CrashlyticsCore.TAG, 3)) {
            Log.d(CrashlyticsCore.TAG, b2, (Throwable) null);
        }
        writeBeginSession(clsuuid, date);
        writeSessionApp(clsuuid);
        writeSessionOS(clsuuid);
        writeSessionDevice(clsuuid);
        this.logFileManager.setCurrentSession(clsuuid);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00af A[Catch:{ all -> 0x00d0 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void doWriteNonFatal(java.util.Date r17, java.lang.Thread r18, java.lang.Throwable r19) {
        /*
            r16 = this;
            r8 = r16
            java.lang.String r9 = "Failed to close non-fatal file output stream."
            java.lang.String r10 = "Failed to flush to non-fatal file."
            java.lang.String r11 = r16.getCurrentSessionId()
            r12 = 6
            java.lang.String r13 = "CrashlyticsCore"
            r1 = 0
            if (r11 != 0) goto L_0x0020
            l.a.a.a.c r0 = l.a.a.a.f.a()
            boolean r0 = r0.a(r13, r12)
            if (r0 == 0) goto L_0x001f
            java.lang.String r0 = "Tried to write a non-fatal exception while no session was open."
            android.util.Log.e(r13, r0, r1)
        L_0x001f:
            return
        L_0x0020:
            java.lang.Class r0 = r19.getClass()
            java.lang.String r0 = r0.getName()
            recordLoggedExceptionAnswersEvent(r11, r0)
            l.a.a.a.c r0 = l.a.a.a.f.a()     // Catch:{ Exception -> 0x00a1, all -> 0x009e }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00a1, all -> 0x009e }
            r2.<init>()     // Catch:{ Exception -> 0x00a1, all -> 0x009e }
            java.lang.String r3 = "Crashlytics is logging non-fatal exception \""
            r2.append(r3)     // Catch:{ Exception -> 0x00a1, all -> 0x009e }
            r5 = r19
            r2.append(r5)     // Catch:{ Exception -> 0x00a1, all -> 0x009e }
            java.lang.String r3 = "\" from thread "
            r2.append(r3)     // Catch:{ Exception -> 0x00a1, all -> 0x009e }
            java.lang.String r3 = r18.getName()     // Catch:{ Exception -> 0x00a1, all -> 0x009e }
            r2.append(r3)     // Catch:{ Exception -> 0x00a1, all -> 0x009e }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x00a1, all -> 0x009e }
            r3 = 3
            boolean r0 = r0.a(r13, r3)     // Catch:{ Exception -> 0x00a1, all -> 0x009e }
            if (r0 == 0) goto L_0x0058
            android.util.Log.d(r13, r2, r1)     // Catch:{ Exception -> 0x00a1, all -> 0x009e }
        L_0x0058:
            java.util.concurrent.atomic.AtomicInteger r0 = r8.eventCounter     // Catch:{ Exception -> 0x00a1, all -> 0x009e }
            int r0 = r0.getAndIncrement()     // Catch:{ Exception -> 0x00a1, all -> 0x009e }
            java.lang.String r0 = l.a.a.a.o.b.i.b((int) r0)     // Catch:{ Exception -> 0x00a1, all -> 0x009e }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00a1, all -> 0x009e }
            r2.<init>()     // Catch:{ Exception -> 0x00a1, all -> 0x009e }
            r2.append(r11)     // Catch:{ Exception -> 0x00a1, all -> 0x009e }
            java.lang.String r3 = "SessionEvent"
            r2.append(r3)     // Catch:{ Exception -> 0x00a1, all -> 0x009e }
            r2.append(r0)     // Catch:{ Exception -> 0x00a1, all -> 0x009e }
            java.lang.String r0 = r2.toString()     // Catch:{ Exception -> 0x00a1, all -> 0x009e }
            com.crashlytics.android.core.ClsFileOutputStream r14 = new com.crashlytics.android.core.ClsFileOutputStream     // Catch:{ Exception -> 0x00a1, all -> 0x009e }
            java.io.File r2 = r16.getFilesDir()     // Catch:{ Exception -> 0x00a1, all -> 0x009e }
            r14.<init>((java.io.File) r2, (java.lang.String) r0)     // Catch:{ Exception -> 0x00a1, all -> 0x009e }
            com.crashlytics.android.core.CodedOutputStream r15 = com.crashlytics.android.core.CodedOutputStream.newInstance((java.io.OutputStream) r14)     // Catch:{ Exception -> 0x009c }
            java.lang.String r6 = "error"
            r7 = 0
            r1 = r16
            r2 = r15
            r3 = r17
            r4 = r18
            r5 = r19
            r1.writeSessionEvent(r2, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x0099, all -> 0x0096 }
            l.a.a.a.o.b.i.a((java.io.Flushable) r15, (java.lang.String) r10)
            goto L_0x00b5
        L_0x0096:
            r0 = move-exception
            r1 = r15
            goto L_0x00d1
        L_0x0099:
            r0 = move-exception
            r1 = r15
            goto L_0x00a3
        L_0x009c:
            r0 = move-exception
            goto L_0x00a3
        L_0x009e:
            r0 = move-exception
            r14 = r1
            goto L_0x00d1
        L_0x00a1:
            r0 = move-exception
            r14 = r1
        L_0x00a3:
            l.a.a.a.c r2 = l.a.a.a.f.a()     // Catch:{ all -> 0x00d0 }
            java.lang.String r3 = "An error occurred in the non-fatal exception logger"
            boolean r2 = r2.a(r13, r12)     // Catch:{ all -> 0x00d0 }
            if (r2 == 0) goto L_0x00b2
            android.util.Log.e(r13, r3, r0)     // Catch:{ all -> 0x00d0 }
        L_0x00b2:
            l.a.a.a.o.b.i.a((java.io.Flushable) r1, (java.lang.String) r10)
        L_0x00b5:
            l.a.a.a.o.b.i.a((java.io.Closeable) r14, (java.lang.String) r9)
            r0 = 64
            r8.trimSessionEventFiles(r11, r0)     // Catch:{ Exception -> 0x00be }
            goto L_0x00cf
        L_0x00be:
            r0 = move-exception
            r1 = r0
            l.a.a.a.c r0 = l.a.a.a.f.a()
            boolean r0 = r0.a(r13, r12)
            if (r0 == 0) goto L_0x00cf
            java.lang.String r0 = "An error occurred when trimming non-fatal files."
            android.util.Log.e(r13, r0, r1)
        L_0x00cf:
            return
        L_0x00d0:
            r0 = move-exception
        L_0x00d1:
            l.a.a.a.o.b.i.a((java.io.Flushable) r1, (java.lang.String) r10)
            l.a.a.a.o.b.i.a((java.io.Closeable) r14, (java.lang.String) r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crashlytics.android.core.CrashlyticsController.doWriteNonFatal(java.util.Date, java.lang.Thread, java.lang.Throwable):void");
    }

    private File[] ensureFileArrayNotNull(File[] fileArr) {
        return fileArr == null ? new File[0] : fileArr;
    }

    /* access modifiers changed from: private */
    public void finalizeMostRecentNativeCrash(Context context, File file, String str) {
        byte[] minidumpFromDirectory = NativeFileUtils.minidumpFromDirectory(file);
        byte[] metadataJsonFromDirectory = NativeFileUtils.metadataJsonFromDirectory(file);
        byte[] binaryImagesJsonFromDirectory = NativeFileUtils.binaryImagesJsonFromDirectory(file, context);
        if (minidumpFromDirectory == null || minidumpFromDirectory.length == 0) {
            String str2 = "No minidump data found in directory " + file;
            if (f.a().a(CrashlyticsCore.TAG, 5)) {
                Log.w(CrashlyticsCore.TAG, str2, (Throwable) null);
                return;
            }
            return;
        }
        recordFatalExceptionAnswersEvent(str, "<native-crash: minidump>");
        byte[] readFile = readFile(str, "BeginSession.json");
        byte[] readFile2 = readFile(str, "SessionApp.json");
        byte[] readFile3 = readFile(str, "SessionDevice.json");
        byte[] readFile4 = readFile(str, "SessionOS.json");
        byte[] readFile5 = NativeFileUtils.readFile(new MetaDataStore(getFilesDir()).getUserDataFileForSession(str));
        LogFileManager logFileManager2 = new LogFileManager(this.crashlyticsCore.getContext(), this.logFileDirectoryProvider, str);
        byte[] bytesForLog = logFileManager2.getBytesForLog();
        logFileManager2.clearLog();
        byte[] readFile6 = NativeFileUtils.readFile(new MetaDataStore(getFilesDir()).getKeysFileForSession(str));
        File file2 = new File(((b) this.fileStore).a(), str);
        if (file2.mkdir()) {
            gzipIfNotEmpty(minidumpFromDirectory, new File(file2, "minidump"));
            gzipIfNotEmpty(metadataJsonFromDirectory, new File(file2, "metadata"));
            gzipIfNotEmpty(binaryImagesJsonFromDirectory, new File(file2, "binaryImages"));
            gzipIfNotEmpty(readFile, new File(file2, "session"));
            gzipIfNotEmpty(readFile2, new File(file2, "app"));
            gzipIfNotEmpty(readFile3, new File(file2, "device"));
            gzipIfNotEmpty(readFile4, new File(file2, "os"));
            gzipIfNotEmpty(readFile5, new File(file2, MetaDataStore.USERDATA_SUFFIX));
            gzipIfNotEmpty(bytesForLog, new File(file2, "logs"));
            gzipIfNotEmpty(readFile6, new File(file2, MetaDataStore.KEYDATA_SUFFIX));
        } else if (f.a().a(CrashlyticsCore.TAG, 3)) {
            Log.d(CrashlyticsCore.TAG, "Couldn't create native sessions directory", (Throwable) null);
        }
    }

    private boolean firebaseCrashExists() {
        try {
            Class.forName("com.google.firebase.crash.FirebaseCrash");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private CreateReportSpiCall getCreateReportSpiCall(String str, String str2) {
        String a = i.a(this.crashlyticsCore.getContext(), "com.crashlytics.ApiEndpoint");
        return new CompositeCreateReportSpiCall(new DefaultCreateReportSpiCall(this.crashlyticsCore, a, str, this.httpRequestFactory), new NativeCreateReportSpiCall(this.crashlyticsCore, a, str2, this.httpRequestFactory));
    }

    /* access modifiers changed from: private */
    public String getCurrentSessionId() {
        File[] listSortedSessionBeginFiles = listSortedSessionBeginFiles();
        if (listSortedSessionBeginFiles.length > 0) {
            return getSessionIdFromSessionFile(listSortedSessionBeginFiles[0]);
        }
        return null;
    }

    /* access modifiers changed from: private */
    public String getPreviousSessionId() {
        File[] listSortedSessionBeginFiles = listSortedSessionBeginFiles();
        if (listSortedSessionBeginFiles.length > 1) {
            return getSessionIdFromSessionFile(listSortedSessionBeginFiles[1]);
        }
        return null;
    }

    public static String getSessionIdFromSessionFile(File file) {
        return file.getName().substring(0, 35);
    }

    private File[] getTrimmedNonFatalFiles(String str, File[] fileArr, int i2) {
        if (fileArr.length <= i2) {
            return fileArr;
        }
        l.a.a.a.c a = f.a();
        String format = String.format(Locale.US, "Trimming down to %d logged exceptions.", new Object[]{Integer.valueOf(i2)});
        if (a.a(CrashlyticsCore.TAG, 3)) {
            Log.d(CrashlyticsCore.TAG, format, (Throwable) null);
        }
        trimSessionEventFiles(str, i2);
        return listFilesMatching((FilenameFilter) new FileNameContainsFilter(i.a.a.a.a.b(str, SESSION_NON_FATAL_TAG)));
    }

    private UserMetaData getUserMetaData(String str) {
        if (isHandlingException()) {
            return new UserMetaData(this.crashlyticsCore.getUserIdentifier(), this.crashlyticsCore.getUserName(), this.crashlyticsCore.getUserEmail());
        }
        return new MetaDataStore(getFilesDir()).readUserData(str);
    }

    private void gzip(byte[] bArr, File file) {
        GZIPOutputStream gZIPOutputStream = null;
        try {
            GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(new FileOutputStream(file));
            try {
                gZIPOutputStream2.write(bArr);
                gZIPOutputStream2.finish();
                i.a((Closeable) gZIPOutputStream2);
            } catch (Throwable th) {
                th = th;
                gZIPOutputStream = gZIPOutputStream2;
                i.a((Closeable) gZIPOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            i.a((Closeable) gZIPOutputStream);
            throw th;
        }
    }

    private void gzipIfNotEmpty(byte[] bArr, File file) {
        if (bArr != null && bArr.length > 0) {
            gzip(bArr, file);
        }
    }

    private File[] listFiles(File file) {
        return ensureFileArrayNotNull(file.listFiles());
    }

    private File[] listFilesMatching(FileFilter fileFilter) {
        return ensureFileArrayNotNull(getFilesDir().listFiles(fileFilter));
    }

    private File[] listSessionPartFilesFor(String str) {
        return listFilesMatching((FilenameFilter) new SessionPartFileFilter(str));
    }

    private File[] listSortedSessionBeginFiles() {
        File[] listSessionBeginFiles = listSessionBeginFiles();
        Arrays.sort(listSessionBeginFiles, LARGEST_FILE_NAME_FIRST);
        return listSessionBeginFiles;
    }

    private byte[] readFile(String str, String str2) {
        return NativeFileUtils.readFile(new File(getFilesDir(), i.a.a.a.a.b(str, str2)));
    }

    public static void recordFatalExceptionAnswersEvent(String str, String str2) {
        Answers answers = (Answers) f.a(Answers.class);
        if (answers != null) {
            answers.onException(new j.a(str, str2));
        } else if (f.a().a(CrashlyticsCore.TAG, 3)) {
            Log.d(CrashlyticsCore.TAG, "Answers is not available", (Throwable) null);
        }
    }

    /* access modifiers changed from: private */
    public void recordFatalFirebaseEvent(long j2) {
        if (firebaseCrashExists()) {
            if (f.a().a(CrashlyticsCore.TAG, 3)) {
                Log.d(CrashlyticsCore.TAG, "Skipping logging Crashlytics event to Firebase, FirebaseCrash exists", (Throwable) null);
            }
        } else if (this.firebaseAnalyticsLogger != null) {
            if (f.a().a(CrashlyticsCore.TAG, 3)) {
                Log.d(CrashlyticsCore.TAG, "Logging Crashlytics event to Firebase", (Throwable) null);
            }
            Bundle bundle = new Bundle();
            bundle.putInt(FIREBASE_REALTIME, 1);
            bundle.putInt(FIREBASE_CRASH_TYPE, 1);
            bundle.putLong("timestamp", j2);
            this.firebaseAnalyticsLogger.logEvent(FIREBASE_ANALYTICS_ORIGIN_CRASHLYTICS, FIREBASE_APPLICATION_EXCEPTION, bundle);
        } else if (f.a().a(CrashlyticsCore.TAG, 3)) {
            Log.d(CrashlyticsCore.TAG, "Skipping logging Crashlytics event to Firebase, no Firebase Analytics", (Throwable) null);
        }
    }

    public static void recordLoggedExceptionAnswersEvent(String str, String str2) {
        Answers answers = (Answers) f.a(Answers.class);
        if (answers != null) {
            answers.onException(new j.b(str, str2));
        } else if (f.a().a(CrashlyticsCore.TAG, 3)) {
            Log.d(CrashlyticsCore.TAG, "Answers is not available", (Throwable) null);
        }
    }

    /* access modifiers changed from: private */
    public void recursiveDelete(Set<File> set) {
        for (File recursiveDelete : set) {
            recursiveDelete(recursiveDelete);
        }
    }

    private void retainSessions(File[] fileArr, Set<String> set) {
        for (File file : fileArr) {
            String name = file.getName();
            Matcher matcher = SESSION_FILE_PATTERN.matcher(name);
            if (!matcher.matches()) {
                l.a.a.a.c a = f.a();
                String b2 = i.a.a.a.a.b("Deleting unknown file: ", name);
                if (a.a(CrashlyticsCore.TAG, 3)) {
                    Log.d(CrashlyticsCore.TAG, b2, (Throwable) null);
                }
                file.delete();
            } else if (!set.contains(matcher.group(1))) {
                l.a.a.a.c a2 = f.a();
                String b3 = i.a.a.a.a.b("Trimming session file: ", name);
                if (a2.a(CrashlyticsCore.TAG, 3)) {
                    Log.d(CrashlyticsCore.TAG, b3, (Throwable) null);
                }
                file.delete();
            }
        }
    }

    /* access modifiers changed from: private */
    public void sendSessionReports(l.a.a.a.o.g.s sVar) {
        if (sVar != null) {
            Context context = this.crashlyticsCore.getContext();
            e eVar = sVar.a;
            ReportUploader reportUploader = new ReportUploader(this.appData.apiKey, getCreateReportSpiCall(eVar.c, eVar.d), this.reportFilesProvider, this.handlingExceptionCheck);
            for (File sessionReport : listCompleteSessionFiles()) {
                this.backgroundWorker.submit((Runnable) new SendReportRunnable(context, new SessionReport(sessionReport, SEND_AT_CRASHTIME_HEADER), reportUploader));
            }
        } else if (f.a().a(CrashlyticsCore.TAG, 5)) {
            Log.w(CrashlyticsCore.TAG, "Cannot send reports. Settings are unavailable.", (Throwable) null);
        }
    }

    /* access modifiers changed from: private */
    public boolean shouldPromptUserBeforeSendingCrashReports(l.a.a.a.o.g.s sVar) {
        if (sVar != null && sVar.d.a && !this.preferenceManager.shouldAlwaysSendReports()) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00af A[Catch:{ all -> 0x00b9 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void synthesizeSessionFile(java.io.File r17, java.lang.String r18, java.io.File[] r19, java.io.File r20) {
        /*
            r16 = this;
            r1 = r16
            r2 = r18
            r0 = r20
            java.lang.String r3 = "Failed to close CLS file"
            java.lang.String r4 = "CrashlyticsCore"
            java.lang.String r5 = "Error flushing session file stream"
            r6 = 1
            if (r0 == 0) goto L_0x0011
            r7 = 1
            goto L_0x0012
        L_0x0011:
            r7 = 0
        L_0x0012:
            if (r7 == 0) goto L_0x0019
            java.io.File r8 = r16.getFatalSessionFilesDir()
            goto L_0x001d
        L_0x0019:
            java.io.File r8 = r16.getNonFatalSessionFilesDir()
        L_0x001d:
            boolean r9 = r8.exists()
            if (r9 != 0) goto L_0x0026
            r8.mkdirs()
        L_0x0026:
            r9 = 0
            com.crashlytics.android.core.ClsFileOutputStream r10 = new com.crashlytics.android.core.ClsFileOutputStream     // Catch:{ Exception -> 0x0091, all -> 0x008e }
            r10.<init>((java.io.File) r8, (java.lang.String) r2)     // Catch:{ Exception -> 0x0091, all -> 0x008e }
            com.crashlytics.android.core.CodedOutputStream r8 = com.crashlytics.android.core.CodedOutputStream.newInstance((java.io.OutputStream) r10)     // Catch:{ Exception -> 0x008c }
            l.a.a.a.c r11 = l.a.a.a.f.a()     // Catch:{ Exception -> 0x0089, all -> 0x0086 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0089, all -> 0x0086 }
            r12.<init>()     // Catch:{ Exception -> 0x0089, all -> 0x0086 }
            java.lang.String r13 = "Collecting SessionStart data for session ID "
            r12.append(r13)     // Catch:{ Exception -> 0x0089, all -> 0x0086 }
            r12.append(r2)     // Catch:{ Exception -> 0x0089, all -> 0x0086 }
            java.lang.String r12 = r12.toString()     // Catch:{ Exception -> 0x0089, all -> 0x0086 }
            r13 = 3
            boolean r11 = r11.a(r4, r13)     // Catch:{ Exception -> 0x0089, all -> 0x0086 }
            if (r11 == 0) goto L_0x004f
            android.util.Log.d(r4, r12, r9)     // Catch:{ Exception -> 0x0089, all -> 0x0086 }
        L_0x004f:
            r9 = r17
            writeToCosFromFile(r8, r9)     // Catch:{ Exception -> 0x0089, all -> 0x0086 }
            r9 = 4
            java.util.Date r11 = new java.util.Date     // Catch:{ Exception -> 0x0089, all -> 0x0086 }
            r11.<init>()     // Catch:{ Exception -> 0x0089, all -> 0x0086 }
            long r11 = r11.getTime()     // Catch:{ Exception -> 0x0089, all -> 0x0086 }
            r14 = 1000(0x3e8, double:4.94E-321)
            long r11 = r11 / r14
            r8.writeUInt64(r9, r11)     // Catch:{ Exception -> 0x0089, all -> 0x0086 }
            r9 = 5
            r8.writeBool(r9, r7)     // Catch:{ Exception -> 0x0089, all -> 0x0086 }
            r9 = 11
            r8.writeUInt32(r9, r6)     // Catch:{ Exception -> 0x0089, all -> 0x0086 }
            r6 = 12
            r8.writeEnum(r6, r13)     // Catch:{ Exception -> 0x0089, all -> 0x0086 }
            r1.writeInitialPartsTo(r8, r2)     // Catch:{ Exception -> 0x0089, all -> 0x0086 }
            r6 = r19
            writeNonFatalEventsTo(r8, r6, r2)     // Catch:{ Exception -> 0x0089, all -> 0x0086 }
            if (r7 == 0) goto L_0x007f
            writeToCosFromFile(r8, r0)     // Catch:{ Exception -> 0x0089, all -> 0x0086 }
        L_0x007f:
            l.a.a.a.o.b.i.a((java.io.Flushable) r8, (java.lang.String) r5)
            l.a.a.a.o.b.i.a((java.io.Closeable) r10, (java.lang.String) r3)
            goto L_0x00b8
        L_0x0086:
            r0 = move-exception
            r9 = r8
            goto L_0x00ba
        L_0x0089:
            r0 = move-exception
            r9 = r8
            goto L_0x0093
        L_0x008c:
            r0 = move-exception
            goto L_0x0093
        L_0x008e:
            r0 = move-exception
            r10 = r9
            goto L_0x00ba
        L_0x0091:
            r0 = move-exception
            r10 = r9
        L_0x0093:
            l.a.a.a.c r6 = l.a.a.a.f.a()     // Catch:{ all -> 0x00b9 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b9 }
            r7.<init>()     // Catch:{ all -> 0x00b9 }
            java.lang.String r8 = "Failed to write session file for session ID: "
            r7.append(r8)     // Catch:{ all -> 0x00b9 }
            r7.append(r2)     // Catch:{ all -> 0x00b9 }
            java.lang.String r2 = r7.toString()     // Catch:{ all -> 0x00b9 }
            r7 = 6
            boolean r6 = r6.a(r4, r7)     // Catch:{ all -> 0x00b9 }
            if (r6 == 0) goto L_0x00b2
            android.util.Log.e(r4, r2, r0)     // Catch:{ all -> 0x00b9 }
        L_0x00b2:
            l.a.a.a.o.b.i.a((java.io.Flushable) r9, (java.lang.String) r5)
            r1.closeWithoutRenamingOrLog(r10)
        L_0x00b8:
            return
        L_0x00b9:
            r0 = move-exception
        L_0x00ba:
            l.a.a.a.o.b.i.a((java.io.Flushable) r9, (java.lang.String) r5)
            l.a.a.a.o.b.i.a((java.io.Closeable) r10, (java.lang.String) r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crashlytics.android.core.CrashlyticsController.synthesizeSessionFile(java.io.File, java.lang.String, java.io.File[], java.io.File):void");
    }

    private void trimInvalidSessionFiles() {
        File invalidFilesDir = getInvalidFilesDir();
        if (invalidFilesDir.exists()) {
            File[] listFilesMatching = listFilesMatching(invalidFilesDir, new InvalidPartFileFilter());
            Arrays.sort(listFilesMatching, Collections.reverseOrder());
            HashSet hashSet = new HashSet();
            for (int i2 = 0; i2 < listFilesMatching.length && hashSet.size() < 4; i2++) {
                hashSet.add(getSessionIdFromSessionFile(listFilesMatching[i2]));
            }
            retainSessions(listFiles(invalidFilesDir), hashSet);
        }
    }

    private void trimOpenSessions(int i2) {
        HashSet hashSet = new HashSet();
        File[] listSortedSessionBeginFiles = listSortedSessionBeginFiles();
        int min = Math.min(i2, listSortedSessionBeginFiles.length);
        for (int i3 = 0; i3 < min; i3++) {
            hashSet.add(getSessionIdFromSessionFile(listSortedSessionBeginFiles[i3]));
        }
        this.logFileManager.discardOldLogFiles(hashSet);
        retainSessions(listFilesMatching((FilenameFilter) new AnySessionPartFileFilter()), hashSet);
    }

    private void trimSessionEventFiles(String str, int i2) {
        Utils.capFileCount(getFilesDir(), new FileNameContainsFilter(i.a.a.a.a.b(str, SESSION_NON_FATAL_TAG)), i2, SMALLEST_FILE_NAME_FIRST);
    }

    private void writeBeginSession(String str, Date date) {
        final String str2 = str;
        final String format = String.format(Locale.US, GENERATOR_FORMAT, new Object[]{this.crashlyticsCore.getVersion()});
        final long time = date.getTime() / 1000;
        writeSessionPartFile(str, SESSION_BEGIN_TAG, new CodedOutputStreamWriteAction() {
            public void writeTo(CodedOutputStream codedOutputStream) {
                SessionProtobufHelper.writeBeginSession(codedOutputStream, str2, format, time);
            }
        });
        writeFile(str, "BeginSession.json", new FileOutputStreamWriteAction() {
            public void writeTo(FileOutputStream fileOutputStream) {
                fileOutputStream.write(new JSONObject(new HashMap<String, Object>() {
                    {
                        put("session_id", str2);
                        put("generator", format);
                        put("started_at_seconds", Long.valueOf(time));
                    }
                }).toString().getBytes());
            }
        });
    }

    /* access modifiers changed from: private */
    public void writeFatal(Date date, Thread thread, Throwable th) {
        ClsFileOutputStream clsFileOutputStream;
        CodedOutputStream codedOutputStream = null;
        try {
            String currentSessionId = getCurrentSessionId();
            if (currentSessionId == null) {
                if (f.a().a(CrashlyticsCore.TAG, 6)) {
                    Log.e(CrashlyticsCore.TAG, "Tried to write a fatal exception while no session was open.", (Throwable) null);
                }
                i.a((Flushable) null, "Failed to flush to session begin file.");
                i.a((Closeable) null, "Failed to close fatal exception file output stream.");
                return;
            }
            recordFatalExceptionAnswersEvent(currentSessionId, th.getClass().getName());
            clsFileOutputStream = new ClsFileOutputStream(getFilesDir(), currentSessionId + SESSION_FATAL_TAG);
            try {
                codedOutputStream = CodedOutputStream.newInstance((OutputStream) clsFileOutputStream);
                writeSessionEvent(codedOutputStream, date, thread, th, "crash", true);
            } catch (Exception e) {
                e = e;
            }
            i.a((Flushable) codedOutputStream, "Failed to flush to session begin file.");
            i.a((Closeable) clsFileOutputStream, "Failed to close fatal exception file output stream.");
        } catch (Exception e2) {
            e = e2;
            clsFileOutputStream = null;
            try {
                if (f.a().a(CrashlyticsCore.TAG, 6)) {
                    Log.e(CrashlyticsCore.TAG, "An error occurred in the fatal exception logger", e);
                }
                i.a((Flushable) codedOutputStream, "Failed to flush to session begin file.");
                i.a((Closeable) clsFileOutputStream, "Failed to close fatal exception file output stream.");
            } catch (Throwable th2) {
                th = th2;
                i.a((Flushable) codedOutputStream, "Failed to flush to session begin file.");
                i.a((Closeable) clsFileOutputStream, "Failed to close fatal exception file output stream.");
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            clsFileOutputStream = null;
            i.a((Flushable) codedOutputStream, "Failed to flush to session begin file.");
            i.a((Closeable) clsFileOutputStream, "Failed to close fatal exception file output stream.");
            throw th;
        }
    }

    private void writeFile(String str, String str2, FileOutputStreamWriteAction fileOutputStreamWriteAction) {
        FileOutputStream fileOutputStream = null;
        try {
            File filesDir = getFilesDir();
            FileOutputStream fileOutputStream2 = new FileOutputStream(new File(filesDir, str + str2));
            try {
                fileOutputStreamWriteAction.writeTo(fileOutputStream2);
                i.a((Closeable) fileOutputStream2, "Failed to close " + str2 + " file.");
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                i.a((Closeable) fileOutputStream, "Failed to close " + str2 + " file.");
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            i.a((Closeable) fileOutputStream, "Failed to close " + str2 + " file.");
            throw th;
        }
    }

    private void writeInitialPartsTo(CodedOutputStream codedOutputStream, String str) {
        for (String str2 : INITIAL_SESSION_PART_TAGS) {
            File[] listFilesMatching = listFilesMatching((FilenameFilter) new FileNameContainsFilter(i.a.a.a.a.a(str, str2, ClsFileOutputStream.SESSION_FILE_EXTENSION)));
            if (listFilesMatching.length == 0) {
                String str3 = "Can't find " + str2 + " data for session ID " + str;
                if (f.a().a(CrashlyticsCore.TAG, 6)) {
                    Log.e(CrashlyticsCore.TAG, str3, (Throwable) null);
                }
            } else {
                String str4 = "Collecting " + str2 + " data for session ID " + str;
                if (f.a().a(CrashlyticsCore.TAG, 3)) {
                    Log.d(CrashlyticsCore.TAG, str4, (Throwable) null);
                }
                writeToCosFromFile(codedOutputStream, listFilesMatching[0]);
            }
        }
    }

    public static void writeNonFatalEventsTo(CodedOutputStream codedOutputStream, File[] fileArr, String str) {
        Arrays.sort(fileArr, i.d);
        for (File file : fileArr) {
            try {
                l.a.a.a.c a = f.a();
                String format = String.format(Locale.US, "Found Non Fatal for session ID %s in %s ", new Object[]{str, file.getName()});
                if (a.a(CrashlyticsCore.TAG, 3)) {
                    Log.d(CrashlyticsCore.TAG, format, (Throwable) null);
                }
                writeToCosFromFile(codedOutputStream, file);
            } catch (Exception e) {
                if (f.a().a(CrashlyticsCore.TAG, 6)) {
                    Log.e(CrashlyticsCore.TAG, "Error writting non-fatal to session.", e);
                }
            }
        }
    }

    private void writeSessionApp(String str) {
        s sVar = this.idManager;
        String str2 = sVar.f5091f;
        AppData appData2 = this.appData;
        String str3 = appData2.versionCode;
        String str4 = appData2.versionName;
        final String str5 = str2;
        final String str6 = str3;
        final String str7 = str4;
        final String b2 = sVar.b();
        final int i2 = m.a(this.appData.installerPackageName).e;
        writeSessionPartFile(str, SESSION_APP_TAG, new CodedOutputStreamWriteAction() {
            public void writeTo(CodedOutputStream codedOutputStream) {
                SessionProtobufHelper.writeSessionApp(codedOutputStream, str5, CrashlyticsController.this.appData.apiKey, str6, str7, b2, i2, CrashlyticsController.this.unityVersion);
            }
        });
        writeFile(str, "SessionApp.json", new FileOutputStreamWriteAction() {
            public void writeTo(FileOutputStream fileOutputStream) {
                fileOutputStream.write(new JSONObject(new HashMap<String, Object>() {
                    {
                        put("app_identifier", str5);
                        put("api_key", CrashlyticsController.this.appData.apiKey);
                        put("version_code", str6);
                        put("version_name", str7);
                        put("install_uuid", b2);
                        put("delivery_mechanism", Integer.valueOf(i2));
                        put("unity_version", TextUtils.isEmpty(CrashlyticsController.this.unityVersion) ? "" : CrashlyticsController.this.unityVersion);
                    }
                }).toString().getBytes());
            }
        });
    }

    private void writeSessionDevice(String str) {
        String str2 = str;
        Context context = this.crashlyticsCore.getContext();
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        int a = i.a();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long b2 = i.b();
        long blockCount = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        boolean h2 = i.h(context);
        Map<s.a, String> c = this.idManager.c();
        boolean h3 = i.h(context);
        boolean z = true;
        if (i.i(context)) {
            h3 |= true;
        }
        if (!Debug.isDebuggerConnected() && !Debug.waitingForDebugger()) {
            z = false;
        }
        boolean z2 = z ? h3 | true : h3;
        final int i2 = a;
        final int i3 = availableProcessors;
        final long j2 = b2;
        final long j3 = blockCount;
        final boolean z3 = h2;
        final Map<s.a, String> map = c;
        long j4 = b2;
        AnonymousClass23 r15 = r0;
        final boolean z4 = z2;
        final int i4 = z4 ? 1 : 0;
        AnonymousClass23 r0 = new CodedOutputStreamWriteAction() {
            public void writeTo(CodedOutputStream codedOutputStream) {
                SessionProtobufHelper.writeSessionDevice(codedOutputStream, i2, Build.MODEL, i3, j2, j3, z3, map, i4, Build.MANUFACTURER, Build.PRODUCT);
            }
        };
        writeSessionPartFile(str2, SESSION_DEVICE_TAG, r15);
        final long j5 = j4;
        writeFile(str2, "SessionDevice.json", new FileOutputStreamWriteAction() {
            public void writeTo(FileOutputStream fileOutputStream) {
                fileOutputStream.write(new JSONObject(new HashMap<String, Object>() {
                    {
                        put("arch", Integer.valueOf(i2));
                        put("build_model", Build.MODEL);
                        put("available_processors", Integer.valueOf(i3));
                        put("total_ram", Long.valueOf(j5));
                        put("disk_space", Long.valueOf(j3));
                        put("is_emulator", Boolean.valueOf(z3));
                        put("ids", map);
                        put("state", Integer.valueOf(z4));
                        put("build_manufacturer", Build.MANUFACTURER);
                        put("build_product", Build.PRODUCT);
                    }
                }).toString().getBytes());
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: java.util.TreeMap} */
    /* JADX WARNING: type inference failed for: r10v2, types: [boolean] */
    /* JADX WARNING: type inference failed for: r10v6 */
    /* JADX WARNING: type inference failed for: r10v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void writeSessionEvent(com.crashlytics.android.core.CodedOutputStream r24, java.util.Date r25, java.lang.Thread r26, java.lang.Throwable r27, java.lang.String r28, boolean r29) {
        /*
            r23 = this;
            r0 = r23
            com.crashlytics.android.core.TrimmedThrowableData r5 = new com.crashlytics.android.core.TrimmedThrowableData
            com.crashlytics.android.core.StackTraceTrimmingStrategy r1 = r0.stackTraceTrimmingStrategy
            r2 = r27
            r5.<init>(r2, r1)
            com.crashlytics.android.core.CrashlyticsCore r1 = r0.crashlyticsCore
            android.content.Context r1 = r1.getContext()
            long r2 = r25.getTime()
            r6 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r6
            java.lang.Float r16 = l.a.a.a.o.b.i.d(r1)
            com.crashlytics.android.core.DevicePowerStateListener r4 = r0.devicePowerStateListener
            boolean r4 = r4.isPowerConnected()
            java.lang.Float r6 = l.a.a.a.o.b.i.d(r1)
            if (r4 == 0) goto L_0x004d
            if (r6 != 0) goto L_0x002b
            goto L_0x004d
        L_0x002b:
            float r4 = r6.floatValue()
            double r9 = (double) r4
            r11 = 4636666922610458624(0x4058c00000000000, double:99.0)
            int r4 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r4 < 0) goto L_0x003d
            r4 = 3
            r17 = 3
            goto L_0x004f
        L_0x003d:
            float r4 = r6.floatValue()
            double r9 = (double) r4
            int r4 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r4 >= 0) goto L_0x004a
            r4 = 2
            r17 = 2
            goto L_0x004f
        L_0x004a:
            r17 = 0
            goto L_0x004f
        L_0x004d:
            r17 = 1
        L_0x004f:
            boolean r4 = l.a.a.a.o.b.i.h(r1)
            if (r4 == 0) goto L_0x0058
            r18 = 0
            goto L_0x006d
        L_0x0058:
            java.lang.String r4 = "sensor"
            java.lang.Object r4 = r1.getSystemService(r4)
            android.hardware.SensorManager r4 = (android.hardware.SensorManager) r4
            r6 = 8
            android.hardware.Sensor r4 = r4.getDefaultSensor(r6)
            if (r4 == 0) goto L_0x006a
            r4 = 1
            goto L_0x006b
        L_0x006a:
            r4 = 0
        L_0x006b:
            r18 = r4
        L_0x006d:
            android.content.res.Resources r4 = r1.getResources()
            android.content.res.Configuration r4 = r4.getConfiguration()
            int r13 = r4.orientation
            long r9 = l.a.a.a.o.b.i.b()
            android.app.ActivityManager$MemoryInfo r4 = new android.app.ActivityManager$MemoryInfo
            r4.<init>()
            java.lang.String r6 = "activity"
            java.lang.Object r11 = r1.getSystemService(r6)
            android.app.ActivityManager r11 = (android.app.ActivityManager) r11
            r11.getMemoryInfo(r4)
            long r11 = r4.availMem
            long r19 = r9 - r11
            java.io.File r4 = android.os.Environment.getDataDirectory()
            java.lang.String r4 = r4.getPath()
            android.os.StatFs r9 = new android.os.StatFs
            r9.<init>(r4)
            int r4 = r9.getBlockSize()
            long r10 = (long) r4
            int r4 = r9.getBlockCount()
            long r14 = (long) r4
            long r14 = r14 * r10
            int r4 = r9.getAvailableBlocks()
            long r7 = (long) r4
            long r10 = r10 * r7
            long r21 = r14 - r10
            java.lang.String r4 = r1.getPackageName()
            java.lang.Object r6 = r1.getSystemService(r6)
            android.app.ActivityManager r6 = (android.app.ActivityManager) r6
            java.util.List r6 = r6.getRunningAppProcesses()
            if (r6 == 0) goto L_0x00db
            java.util.Iterator r6 = r6.iterator()
        L_0x00c5:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x00db
            java.lang.Object r7 = r6.next()
            android.app.ActivityManager$RunningAppProcessInfo r7 = (android.app.ActivityManager.RunningAppProcessInfo) r7
            java.lang.String r8 = r7.processName
            boolean r8 = r8.equals(r4)
            if (r8 == 0) goto L_0x00c5
            r12 = r7
            goto L_0x00dd
        L_0x00db:
            r4 = 0
            r12 = r4
        L_0x00dd:
            java.util.LinkedList r9 = new java.util.LinkedList
            r9.<init>()
            java.lang.StackTraceElement[] r7 = r5.stacktrace
            com.crashlytics.android.core.AppData r4 = r0.appData
            java.lang.String r15 = r4.buildId
            l.a.a.a.o.b.s r4 = r0.idManager
            java.lang.String r14 = r4.f5091f
            if (r29 == 0) goto L_0x012a
            java.util.Map r4 = java.lang.Thread.getAllStackTraces()
            int r6 = r4.size()
            java.lang.Thread[] r6 = new java.lang.Thread[r6]
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
            r8 = 0
        L_0x0101:
            boolean r10 = r4.hasNext()
            if (r10 == 0) goto L_0x0127
            java.lang.Object r10 = r4.next()
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10
            java.lang.Object r11 = r10.getKey()
            java.lang.Thread r11 = (java.lang.Thread) r11
            r6[r8] = r11
            com.crashlytics.android.core.StackTraceTrimmingStrategy r11 = r0.stackTraceTrimmingStrategy
            java.lang.Object r10 = r10.getValue()
            java.lang.StackTraceElement[] r10 = (java.lang.StackTraceElement[]) r10
            java.lang.StackTraceElement[] r10 = r11.getTrimmedStackTrace(r10)
            r9.add(r10)
            r10 = 1
            int r8 = r8 + r10
            goto L_0x0101
        L_0x0127:
            r10 = 1
            r8 = r6
            goto L_0x012f
        L_0x012a:
            r4 = 0
            r10 = 1
            java.lang.Thread[] r4 = new java.lang.Thread[r4]
            r8 = r4
        L_0x012f:
            java.lang.String r4 = "com.crashlytics.CollectCustomKeys"
            boolean r1 = l.a.a.a.o.b.i.a((android.content.Context) r1, (java.lang.String) r4, (boolean) r10)
            if (r1 != 0) goto L_0x013d
            java.util.TreeMap r1 = new java.util.TreeMap
            r1.<init>()
            goto L_0x0152
        L_0x013d:
            com.crashlytics.android.core.CrashlyticsCore r1 = r0.crashlyticsCore
            java.util.Map r1 = r1.getAttributes()
            if (r1 == 0) goto L_0x0152
            int r4 = r1.size()
            if (r4 <= r10) goto L_0x0152
            java.util.TreeMap r4 = new java.util.TreeMap
            r4.<init>(r1)
            r10 = r4
            goto L_0x0153
        L_0x0152:
            r10 = r1
        L_0x0153:
            com.crashlytics.android.core.LogFileManager r11 = r0.logFileManager
            r1 = r24
            r4 = r28
            r6 = r26
            com.crashlytics.android.core.SessionProtobufHelper.writeSessionEvent(r1, r2, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r21)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crashlytics.android.core.CrashlyticsController.writeSessionEvent(com.crashlytics.android.core.CodedOutputStream, java.util.Date, java.lang.Thread, java.lang.Throwable, java.lang.String, boolean):void");
    }

    private void writeSessionOS(String str) {
        final boolean i2 = i.i(this.crashlyticsCore.getContext());
        writeSessionPartFile(str, SESSION_OS_TAG, new CodedOutputStreamWriteAction() {
            public void writeTo(CodedOutputStream codedOutputStream) {
                SessionProtobufHelper.writeSessionOS(codedOutputStream, Build.VERSION.RELEASE, Build.VERSION.CODENAME, i2);
            }
        });
        writeFile(str, "SessionOS.json", new FileOutputStreamWriteAction() {
            public void writeTo(FileOutputStream fileOutputStream) {
                fileOutputStream.write(new JSONObject(new HashMap<String, Object>() {
                    {
                        put("version", Build.VERSION.RELEASE);
                        put("build_version", Build.VERSION.CODENAME);
                        put("is_rooted", Boolean.valueOf(i2));
                    }
                }).toString().getBytes());
            }
        });
    }

    private void writeSessionPartFile(String str, String str2, CodedOutputStreamWriteAction codedOutputStreamWriteAction) {
        ClsFileOutputStream clsFileOutputStream;
        CodedOutputStream codedOutputStream = null;
        try {
            clsFileOutputStream = new ClsFileOutputStream(getFilesDir(), str + str2);
            try {
                codedOutputStream = CodedOutputStream.newInstance((OutputStream) clsFileOutputStream);
                codedOutputStreamWriteAction.writeTo(codedOutputStream);
                i.a((Flushable) codedOutputStream, "Failed to flush to session " + str2 + " file.");
                i.a((Closeable) clsFileOutputStream, "Failed to close session " + str2 + " file.");
            } catch (Throwable th) {
                th = th;
                i.a((Flushable) codedOutputStream, "Failed to flush to session " + str2 + " file.");
                i.a((Closeable) clsFileOutputStream, "Failed to close session " + str2 + " file.");
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            clsFileOutputStream = null;
            i.a((Flushable) codedOutputStream, "Failed to flush to session " + str2 + " file.");
            i.a((Closeable) clsFileOutputStream, "Failed to close session " + str2 + " file.");
            throw th;
        }
    }

    private void writeSessionPartsToSessionFile(File file, String str, int i2) {
        File file2;
        File file3;
        String str2 = str;
        l.a.a.a.c a = f.a();
        String b2 = i.a.a.a.a.b("Collecting session parts for ID ", str2);
        if (a.a(CrashlyticsCore.TAG, 3)) {
            Log.d(CrashlyticsCore.TAG, b2, (Throwable) null);
        }
        File[] listFilesMatching = listFilesMatching((FilenameFilter) new FileNameContainsFilter(i.a.a.a.a.b(str2, SESSION_FATAL_TAG)));
        boolean z = listFilesMatching != null && listFilesMatching.length > 0;
        l.a.a.a.c a2 = f.a();
        String format = String.format(Locale.US, "Session %s has fatal exception: %s", new Object[]{str2, Boolean.valueOf(z)});
        if (a2.a(CrashlyticsCore.TAG, 3)) {
            Log.d(CrashlyticsCore.TAG, format, (Throwable) null);
        }
        File[] listFilesMatching2 = listFilesMatching((FilenameFilter) new FileNameContainsFilter(i.a.a.a.a.b(str2, SESSION_NON_FATAL_TAG)));
        boolean z2 = listFilesMatching2 != null && listFilesMatching2.length > 0;
        l.a.a.a.c a3 = f.a();
        String format2 = String.format(Locale.US, "Session %s has non-fatal exceptions: %s", new Object[]{str2, Boolean.valueOf(z2)});
        if (a3.a(CrashlyticsCore.TAG, 3)) {
            Log.d(CrashlyticsCore.TAG, format2, (Throwable) null);
        }
        if (z || z2) {
            File[] trimmedNonFatalFiles = getTrimmedNonFatalFiles(str2, listFilesMatching2, i2);
            if (z) {
                file3 = listFilesMatching[0];
                file2 = file;
            } else {
                file2 = file;
                file3 = null;
            }
            synthesizeSessionFile(file2, str2, trimmedNonFatalFiles, file3);
        } else {
            l.a.a.a.c a4 = f.a();
            String b3 = i.a.a.a.a.b("No events present for session ID ", str2);
            if (a4.a(CrashlyticsCore.TAG, 3)) {
                Log.d(CrashlyticsCore.TAG, b3, (Throwable) null);
            }
        }
        l.a.a.a.c a5 = f.a();
        String b4 = i.a.a.a.a.b("Removing session part files for ID ", str2);
        if (a5.a(CrashlyticsCore.TAG, 3)) {
            Log.d(CrashlyticsCore.TAG, b4, (Throwable) null);
        }
        deleteSessionPartFilesFor(str2);
    }

    private void writeSessionUser(String str) {
        final UserMetaData userMetaData = getUserMetaData(str);
        writeSessionPartFile(str, SESSION_USER_TAG, new CodedOutputStreamWriteAction() {
            public void writeTo(CodedOutputStream codedOutputStream) {
                UserMetaData userMetaData = userMetaData;
                SessionProtobufHelper.writeSessionUser(codedOutputStream, userMetaData.id, userMetaData.name, userMetaData.email);
            }
        });
    }

    public static void writeToCosFromFile(CodedOutputStream codedOutputStream, File file) {
        FileInputStream fileInputStream = null;
        if (!file.exists()) {
            l.a.a.a.c a = f.a();
            StringBuilder a2 = i.a.a.a.a.a("Tried to include a file that doesn't exist: ");
            a2.append(file.getName());
            String sb = a2.toString();
            if (a.a(CrashlyticsCore.TAG, 6)) {
                Log.e(CrashlyticsCore.TAG, sb, (Throwable) null);
                return;
            }
            return;
        }
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                copyToCodedOutputStream(fileInputStream2, codedOutputStream, (int) file.length());
                i.a((Closeable) fileInputStream2, "Failed to close file input stream.");
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                i.a((Closeable) fileInputStream, "Failed to close file input stream.");
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            i.a((Closeable) fileInputStream, "Failed to close file input stream.");
            throw th;
        }
    }

    public void cacheKeyData(final Map<String, String> map) {
        this.backgroundWorker.submit(new Callable<Void>() {
            public Void call() {
                new MetaDataStore(CrashlyticsController.this.getFilesDir()).writeKeyData(CrashlyticsController.this.getCurrentSessionId(), map);
                return null;
            }
        });
    }

    public void cacheUserData(final String str, final String str2, final String str3) {
        this.backgroundWorker.submit(new Callable<Void>() {
            public Void call() {
                new MetaDataStore(CrashlyticsController.this.getFilesDir()).writeUserData(CrashlyticsController.this.getCurrentSessionId(), new UserMetaData(str, str2, str3));
                return null;
            }
        });
    }

    public void cleanInvalidTempFiles() {
        this.backgroundWorker.submit((Runnable) new Runnable() {
            public void run() {
                CrashlyticsController crashlyticsController = CrashlyticsController.this;
                crashlyticsController.doCleanInvalidTempFiles(crashlyticsController.listFilesMatching((FilenameFilter) new InvalidPartFileFilter()));
            }
        });
    }

    public void doCleanInvalidTempFiles(File[] fileArr) {
        final HashSet hashSet = new HashSet();
        for (File file : fileArr) {
            String str = "Found invalid session part file: " + file;
            if (f.a().a(CrashlyticsCore.TAG, 3)) {
                Log.d(CrashlyticsCore.TAG, str, (Throwable) null);
            }
            hashSet.add(getSessionIdFromSessionFile(file));
        }
        if (!hashSet.isEmpty()) {
            File invalidFilesDir = getInvalidFilesDir();
            if (!invalidFilesDir.exists()) {
                invalidFilesDir.mkdir();
            }
            for (File file2 : listFilesMatching((FilenameFilter) new FilenameFilter() {
                public boolean accept(File file, String str) {
                    if (str.length() < 35) {
                        return false;
                    }
                    return hashSet.contains(str.substring(0, 35));
                }
            })) {
                String str2 = "Moving session file: " + file2;
                if (f.a().a(CrashlyticsCore.TAG, 3)) {
                    Log.d(CrashlyticsCore.TAG, str2, (Throwable) null);
                }
                if (!file2.renameTo(new File(invalidFilesDir, file2.getName()))) {
                    String str3 = "Could not move session file. Deleting " + file2;
                    if (f.a().a(CrashlyticsCore.TAG, 3)) {
                        Log.d(CrashlyticsCore.TAG, str3, (Throwable) null);
                    }
                    file2.delete();
                }
            }
            trimInvalidSessionFiles();
        }
    }

    public void doCloseSessions(o oVar) {
        doCloseSessions(oVar, false);
    }

    public void enableExceptionHandling(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, boolean z) {
        openSession();
        CrashlyticsUncaughtExceptionHandler crashlyticsUncaughtExceptionHandler = new CrashlyticsUncaughtExceptionHandler(new CrashlyticsUncaughtExceptionHandler.CrashListener() {
            public void onUncaughtException(CrashlyticsUncaughtExceptionHandler.SettingsDataProvider settingsDataProvider, Thread thread, Throwable th, boolean z) {
                CrashlyticsController.this.handleUncaughtException(settingsDataProvider, thread, th, z);
            }
        }, new DefaultSettingsDataProvider(), z, uncaughtExceptionHandler);
        this.crashHandler = crashlyticsUncaughtExceptionHandler;
        Thread.setDefaultUncaughtExceptionHandler(crashlyticsUncaughtExceptionHandler);
    }

    public boolean finalizeNativeReport(final CrashlyticsNdkData crashlyticsNdkData) {
        if (crashlyticsNdkData == null) {
            return true;
        }
        return ((Boolean) this.backgroundWorker.submitAndWait(new Callable<Boolean>() {
            public Boolean call() {
                File first;
                TreeSet<File> treeSet = crashlyticsNdkData.timestampedDirectories;
                String access$1600 = CrashlyticsController.this.getPreviousSessionId();
                if (!(access$1600 == null || treeSet.isEmpty() || (first = treeSet.first()) == null)) {
                    CrashlyticsController crashlyticsController = CrashlyticsController.this;
                    crashlyticsController.finalizeMostRecentNativeCrash(crashlyticsController.crashlyticsCore.getContext(), first, access$1600);
                }
                CrashlyticsController.this.recursiveDelete((Set<File>) treeSet);
                return Boolean.TRUE;
            }
        })).booleanValue();
    }

    public boolean finalizeSessions(final o oVar) {
        return ((Boolean) this.backgroundWorker.submitAndWait(new Callable<Boolean>() {
            public Boolean call() {
                if (CrashlyticsController.this.isHandlingException()) {
                    if (f.a().a(CrashlyticsCore.TAG, 3)) {
                        Log.d(CrashlyticsCore.TAG, "Skipping session finalization because a crash has already occurred.", (Throwable) null);
                    }
                    return Boolean.FALSE;
                }
                if (f.a().a(CrashlyticsCore.TAG, 3)) {
                    Log.d(CrashlyticsCore.TAG, "Finalizing previously open sessions.", (Throwable) null);
                }
                CrashlyticsController.this.doCloseSessions(oVar, true);
                if (f.a().a(CrashlyticsCore.TAG, 3)) {
                    Log.d(CrashlyticsCore.TAG, "Closed all previously open sessions", (Throwable) null);
                }
                return Boolean.TRUE;
            }
        })).booleanValue();
    }

    public File getFatalSessionFilesDir() {
        return new File(getFilesDir(), FATAL_SESSION_DIR);
    }

    public File getFilesDir() {
        return ((b) this.fileStore).a();
    }

    public File getInvalidFilesDir() {
        return new File(getFilesDir(), INVALID_CLS_CACHE_DIR);
    }

    public File getNonFatalSessionFilesDir() {
        return new File(getFilesDir(), NONFATAL_SESSION_DIR);
    }

    public synchronized void handleUncaughtException(CrashlyticsUncaughtExceptionHandler.SettingsDataProvider settingsDataProvider, Thread thread, Throwable th, boolean z) {
        String str = "Crashlytics is handling uncaught exception \"" + th + "\" from thread " + thread.getName();
        if (f.a().a(CrashlyticsCore.TAG, 3)) {
            Log.d(CrashlyticsCore.TAG, str, (Throwable) null);
        }
        this.devicePowerStateListener.dispose();
        final Date date = new Date();
        final Thread thread2 = thread;
        final Throwable th2 = th;
        final CrashlyticsUncaughtExceptionHandler.SettingsDataProvider settingsDataProvider2 = settingsDataProvider;
        final boolean z2 = z;
        this.backgroundWorker.submitAndWait(new Callable<Void>() {
            public Void call() {
                l lVar;
                o oVar;
                CrashlyticsController.this.crashlyticsCore.createCrashMarker();
                CrashlyticsController.this.writeFatal(date, thread2, th2);
                l.a.a.a.o.g.s settingsData = settingsDataProvider2.getSettingsData();
                if (settingsData != null) {
                    oVar = settingsData.f5189b;
                    lVar = settingsData.d;
                } else {
                    oVar = null;
                    lVar = null;
                }
                boolean z = false;
                if ((lVar == null || lVar.d) || z2) {
                    CrashlyticsController.this.recordFatalFirebaseEvent(date.getTime());
                }
                CrashlyticsController.this.doCloseSessions(oVar);
                CrashlyticsController.this.doOpenSession();
                if (oVar != null) {
                    CrashlyticsController.this.trimSessionFiles(oVar.f5184b);
                }
                if (l.a.a.a.o.b.l.a(CrashlyticsController.this.crashlyticsCore.getContext()).a() && !CrashlyticsController.this.shouldPromptUserBeforeSendingCrashReports(settingsData)) {
                    z = true;
                }
                if (z) {
                    CrashlyticsController.this.sendSessionReports(settingsData);
                }
                return null;
            }
        });
    }

    public boolean hasOpenSession() {
        return listSessionBeginFiles().length > 0;
    }

    public boolean isHandlingException() {
        CrashlyticsUncaughtExceptionHandler crashlyticsUncaughtExceptionHandler = this.crashHandler;
        return crashlyticsUncaughtExceptionHandler != null && crashlyticsUncaughtExceptionHandler.isHandlingException();
    }

    public File[] listCompleteSessionFiles() {
        LinkedList linkedList = new LinkedList();
        Collections.addAll(linkedList, listFilesMatching(getFatalSessionFilesDir(), SESSION_FILE_FILTER));
        Collections.addAll(linkedList, listFilesMatching(getNonFatalSessionFilesDir(), SESSION_FILE_FILTER));
        Collections.addAll(linkedList, listFilesMatching(getFilesDir(), SESSION_FILE_FILTER));
        return (File[]) linkedList.toArray(new File[linkedList.size()]);
    }

    public File[] listNativeSessionFileDirectories() {
        return listFilesMatching(SESSION_DIRECTORY_FILTER);
    }

    public File[] listSessionBeginFiles() {
        return listFilesMatching(SESSION_BEGIN_FILE_FILTER);
    }

    public void openSession() {
        this.backgroundWorker.submit(new Callable<Void>() {
            public Void call() {
                CrashlyticsController.this.doOpenSession();
                return null;
            }
        });
    }

    public void registerAnalyticsEventListener(l.a.a.a.o.g.s sVar) {
        if (sVar.d.d) {
            boolean register = this.appMeasurementEventListenerRegistrar.register();
            String str = "Registered Firebase Analytics event listener for breadcrumbs: " + register;
            if (f.a().a(CrashlyticsCore.TAG, 3)) {
                Log.d(CrashlyticsCore.TAG, str, (Throwable) null);
            }
        }
    }

    public void registerDevicePowerStateListener() {
        this.devicePowerStateListener.initialize();
    }

    public void submitAllReports(float f2, l.a.a.a.o.g.s sVar) {
        if (sVar != null) {
            e eVar = sVar.a;
            new ReportUploader(this.appData.apiKey, getCreateReportSpiCall(eVar.c, eVar.d), this.reportFilesProvider, this.handlingExceptionCheck).uploadReports(f2, shouldPromptUserBeforeSendingCrashReports(sVar) ? new PrivacyDialogCheck(this.crashlyticsCore, this.preferenceManager, sVar.c) : new ReportUploader.AlwaysSendCheck());
        } else if (f.a().a(CrashlyticsCore.TAG, 5)) {
            Log.w(CrashlyticsCore.TAG, "Could not send reports. Settings are not available.", (Throwable) null);
        }
    }

    public void trimSessionFiles(int i2) {
        int capFileCount = i2 - Utils.capFileCount(getFatalSessionFilesDir(), i2, SMALLEST_FILE_NAME_FIRST);
        Utils.capFileCount(getFilesDir(), SESSION_FILE_FILTER, capFileCount - Utils.capFileCount(getNonFatalSessionFilesDir(), capFileCount, SMALLEST_FILE_NAME_FIRST), SMALLEST_FILE_NAME_FIRST);
    }

    public void writeNonFatalException(final Thread thread, final Throwable th) {
        final Date date = new Date();
        this.backgroundWorker.submit((Runnable) new Runnable() {
            public void run() {
                if (!CrashlyticsController.this.isHandlingException()) {
                    CrashlyticsController.this.doWriteNonFatal(date, thread, th);
                }
            }
        });
    }

    public void writeToLog(final long j2, final String str) {
        this.backgroundWorker.submit(new Callable<Void>() {
            public Void call() {
                if (CrashlyticsController.this.isHandlingException()) {
                    return null;
                }
                CrashlyticsController.this.logFileManager.writeToLog(j2, str);
                return null;
            }
        });
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [boolean, int] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void doCloseSessions(l.a.a.a.o.g.o r6, boolean r7) {
        /*
            r5 = this;
            int r0 = r7 + 8
            r5.trimOpenSessions(r0)
            java.io.File[] r0 = r5.listSortedSessionBeginFiles()
            int r1 = r0.length
            r2 = 0
            r3 = 3
            java.lang.String r4 = "CrashlyticsCore"
            if (r1 > r7) goto L_0x0020
            l.a.a.a.c r6 = l.a.a.a.f.a()
            boolean r6 = r6.a(r4, r3)
            if (r6 == 0) goto L_0x001f
            java.lang.String r6 = "No open sessions to be closed."
            android.util.Log.d(r4, r6, r2)
        L_0x001f:
            return
        L_0x0020:
            r1 = r0[r7]
            java.lang.String r1 = getSessionIdFromSessionFile(r1)
            r5.writeSessionUser(r1)
            if (r6 != 0) goto L_0x003b
            l.a.a.a.c r6 = l.a.a.a.f.a()
            boolean r6 = r6.a(r4, r3)
            if (r6 == 0) goto L_0x003a
            java.lang.String r6 = "Unable to close session. Settings are not loaded."
            android.util.Log.d(r4, r6, r2)
        L_0x003a:
            return
        L_0x003b:
            int r6 = r6.a
            r5.closeOpenSessions(r0, r7, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crashlytics.android.core.CrashlyticsController.doCloseSessions(l.a.a.a.o.g.o, boolean):void");
    }

    /* access modifiers changed from: private */
    public File[] listFilesMatching(FilenameFilter filenameFilter) {
        return listFilesMatching(getFilesDir(), filenameFilter);
    }

    private File[] listFilesMatching(File file, FilenameFilter filenameFilter) {
        return ensureFileArrayNotNull(file.listFiles(filenameFilter));
    }

    private void recursiveDelete(File file) {
        if (file.isDirectory()) {
            for (File recursiveDelete : file.listFiles()) {
                recursiveDelete(recursiveDelete);
            }
        }
        file.delete();
    }
}
