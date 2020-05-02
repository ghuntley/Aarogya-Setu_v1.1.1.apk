package com.crashlytics.android.core;

import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;
import l.a.a.a.o.g.s;

public class CrashlyticsUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {
    public final CrashListener crashListener;
    public final Thread.UncaughtExceptionHandler defaultHandler;
    public final boolean firebaseCrashlyticsClientFlag;
    public final AtomicBoolean isHandlingException = new AtomicBoolean(false);
    public final SettingsDataProvider settingsDataProvider;

    public interface CrashListener {
        void onUncaughtException(SettingsDataProvider settingsDataProvider, Thread thread, Throwable th, boolean z);
    }

    public interface SettingsDataProvider {
        s getSettingsData();
    }

    public CrashlyticsUncaughtExceptionHandler(CrashListener crashListener2, SettingsDataProvider settingsDataProvider2, boolean z, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.crashListener = crashListener2;
        this.settingsDataProvider = settingsDataProvider2;
        this.firebaseCrashlyticsClientFlag = z;
        this.defaultHandler = uncaughtExceptionHandler;
    }

    public boolean isHandlingException() {
        return this.isHandlingException.get();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0049, code lost:
        if (l.a.a.a.f.a().a(com.crashlytics.android.core.CrashlyticsCore.TAG, 3) == false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001e, code lost:
        if (l.a.a.a.f.a().a(com.crashlytics.android.core.CrashlyticsCore.TAG, 3) != false) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0020, code lost:
        android.util.Log.d(com.crashlytics.android.core.CrashlyticsCore.TAG, "Crashlytics completed exception processing. Invoking default exception handler.", (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0023, code lost:
        r9.defaultHandler.uncaughtException(r10, r11);
        r9.isHandlingException.set(false);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void uncaughtException(java.lang.Thread r10, java.lang.Throwable r11) {
        /*
            r9 = this;
            java.lang.String r0 = "Crashlytics completed exception processing. Invoking default exception handler."
            java.lang.String r1 = "CrashlyticsCore"
            java.util.concurrent.atomic.AtomicBoolean r2 = r9.isHandlingException
            r3 = 1
            r2.set(r3)
            r2 = 0
            r3 = 0
            r4 = 3
            com.crashlytics.android.core.CrashlyticsUncaughtExceptionHandler$CrashListener r5 = r9.crashListener     // Catch:{ Exception -> 0x0030 }
            com.crashlytics.android.core.CrashlyticsUncaughtExceptionHandler$SettingsDataProvider r6 = r9.settingsDataProvider     // Catch:{ Exception -> 0x0030 }
            boolean r7 = r9.firebaseCrashlyticsClientFlag     // Catch:{ Exception -> 0x0030 }
            r5.onUncaughtException(r6, r10, r11, r7)     // Catch:{ Exception -> 0x0030 }
            l.a.a.a.c r5 = l.a.a.a.f.a()
            boolean r4 = r5.a(r1, r4)
            if (r4 == 0) goto L_0x0023
        L_0x0020:
            android.util.Log.d(r1, r0, r3)
        L_0x0023:
            java.lang.Thread$UncaughtExceptionHandler r0 = r9.defaultHandler
            r0.uncaughtException(r10, r11)
            java.util.concurrent.atomic.AtomicBoolean r10 = r9.isHandlingException
            r10.set(r2)
            goto L_0x004c
        L_0x002e:
            r5 = move-exception
            goto L_0x004d
        L_0x0030:
            r5 = move-exception
            l.a.a.a.c r6 = l.a.a.a.f.a()     // Catch:{ all -> 0x002e }
            java.lang.String r7 = "An error occurred in the uncaught exception handler"
            r8 = 6
            boolean r6 = r6.a(r1, r8)     // Catch:{ all -> 0x002e }
            if (r6 == 0) goto L_0x0041
            android.util.Log.e(r1, r7, r5)     // Catch:{ all -> 0x002e }
        L_0x0041:
            l.a.a.a.c r5 = l.a.a.a.f.a()
            boolean r4 = r5.a(r1, r4)
            if (r4 == 0) goto L_0x0023
            goto L_0x0020
        L_0x004c:
            return
        L_0x004d:
            l.a.a.a.c r6 = l.a.a.a.f.a()
            boolean r4 = r6.a(r1, r4)
            if (r4 == 0) goto L_0x005a
            android.util.Log.d(r1, r0, r3)
        L_0x005a:
            java.lang.Thread$UncaughtExceptionHandler r0 = r9.defaultHandler
            r0.uncaughtException(r10, r11)
            java.util.concurrent.atomic.AtomicBoolean r10 = r9.isHandlingException
            r10.set(r2)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crashlytics.android.core.CrashlyticsUncaughtExceptionHandler.uncaughtException(java.lang.Thread, java.lang.Throwable):void");
    }
}
