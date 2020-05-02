package com.crashlytics.android.core;

import android.content.Context;
import android.util.Log;
import i.a.a.a.a;
import io.fabric.sdk.android.services.network.HttpRequest;
import java.net.URL;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.net.ssl.HttpsURLConnection;
import l.a.a.a.f;
import l.a.a.a.k;
import l.a.a.a.o.b.i;
import l.a.a.a.o.c.d;
import l.a.a.a.o.c.e;
import l.a.a.a.o.c.g;
import l.a.a.a.o.c.l;
import l.a.a.a.o.e.b;
import l.a.a.a.o.e.c;
import l.a.a.a.o.g.p;
import l.a.a.a.o.g.s;

@d({CrashlyticsNdkDataProvider.class})
public class CrashlyticsCore extends k<Void> {
    public static final float CLS_DEFAULT_PROCESS_DELAY = 1.0f;
    public static final String CRASHLYTICS_REQUIRE_BUILD_ID = "com.crashlytics.RequireBuildId";
    public static final boolean CRASHLYTICS_REQUIRE_BUILD_ID_DEFAULT = true;
    public static final String CRASH_MARKER_FILE_NAME = "crash_marker";
    public static final int DEFAULT_MAIN_HANDLER_TIMEOUT_SEC = 4;
    public static final String INITIALIZATION_MARKER_FILE_NAME = "initialization_marker";
    public static final int MAX_ATTRIBUTES = 64;
    public static final int MAX_ATTRIBUTE_SIZE = 1024;
    public static final String MISSING_BUILD_ID_MSG = "The Crashlytics build ID is missing. This occurs when Crashlytics tooling is absent from your app's build configuration. Please review Crashlytics onboarding instructions and ensure you have a valid Crashlytics account.";
    public static final String PREFERENCE_STORE_NAME = "com.crashlytics.android.core.CrashlyticsCore";
    public static final String TAG = "CrashlyticsCore";
    public final ConcurrentHashMap<String, String> attributes;
    public CrashlyticsBackgroundWorker backgroundWorker;
    public CrashlyticsController controller;
    public CrashlyticsFileMarker crashMarker;
    public CrashlyticsNdkDataProvider crashlyticsNdkDataProvider;
    public float delay;
    public boolean disabled;
    public c httpRequestFactory;
    public CrashlyticsFileMarker initializationMarker;
    public CrashlyticsListener listener;
    public final PinningInfoProvider pinningInfo;
    public final long startTime;
    public String userEmail;
    public String userId;
    public String userName;

    public static class Builder {
        public float delay = -1.0f;
        public boolean disabled = false;
        public CrashlyticsListener listener;
        public PinningInfoProvider pinningInfoProvider;

        public CrashlyticsCore build() {
            if (this.delay < 0.0f) {
                this.delay = 1.0f;
            }
            return new CrashlyticsCore(this.delay, this.listener, this.pinningInfoProvider, this.disabled);
        }

        public Builder delay(float f2) {
            if (f2 <= 0.0f) {
                throw new IllegalArgumentException("delay must be greater than 0");
            } else if (this.delay <= 0.0f) {
                this.delay = f2;
                return this;
            } else {
                throw new IllegalStateException("delay already set.");
            }
        }

        public Builder disabled(boolean z) {
            this.disabled = z;
            return this;
        }

        public Builder listener(CrashlyticsListener crashlyticsListener) {
            if (crashlyticsListener == null) {
                throw new IllegalArgumentException("listener must not be null.");
            } else if (this.listener == null) {
                this.listener = crashlyticsListener;
                return this;
            } else {
                throw new IllegalStateException("listener already set.");
            }
        }

        @Deprecated
        public Builder pinningInfo(PinningInfoProvider pinningInfoProvider2) {
            if (pinningInfoProvider2 == null) {
                throw new IllegalArgumentException("pinningInfoProvider must not be null.");
            } else if (this.pinningInfoProvider == null) {
                this.pinningInfoProvider = pinningInfoProvider2;
                return this;
            } else {
                throw new IllegalStateException("pinningInfoProvider already set.");
            }
        }
    }

    public static final class CrashMarkerCheck implements Callable<Boolean> {
        public final CrashlyticsFileMarker crashMarker;

        public CrashMarkerCheck(CrashlyticsFileMarker crashlyticsFileMarker) {
            this.crashMarker = crashlyticsFileMarker;
        }

        public Boolean call() {
            if (!this.crashMarker.isPresent()) {
                return Boolean.FALSE;
            }
            if (f.a().a(CrashlyticsCore.TAG, 3)) {
                Log.d(CrashlyticsCore.TAG, "Found previous crash marker.", (Throwable) null);
            }
            this.crashMarker.remove();
            return Boolean.TRUE;
        }
    }

    public static final class NoOpListener implements CrashlyticsListener {
        public NoOpListener() {
        }

        public void crashlyticsDidDetectCrashDuringPreviousExecution() {
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CrashlyticsCore(float r10, com.crashlytics.android.core.CrashlyticsListener r11, com.crashlytics.android.core.PinningInfoProvider r12, boolean r13) {
        /*
            r9 = this;
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r1 = 1
            r0.<init>(r1)
            l.a.a.a.o.b.o r1 = new l.a.a.a.o.b.o
            java.lang.String r2 = "Crashlytics Exception Handler"
            r1.<init>(r2, r0)
            java.util.concurrent.ExecutorService r8 = java.util.concurrent.Executors.newSingleThreadExecutor(r1)
            i.c.d.p.e.a((java.lang.String) r2, (java.util.concurrent.ExecutorService) r8)
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            r3.<init>(r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crashlytics.android.core.CrashlyticsCore.<init>(float, com.crashlytics.android.core.CrashlyticsListener, com.crashlytics.android.core.PinningInfoProvider, boolean):void");
    }

    private void checkForPreviousCrash() {
        if (Boolean.TRUE.equals((Boolean) this.backgroundWorker.submitAndWait(new CrashMarkerCheck(this.crashMarker)))) {
            try {
                this.listener.crashlyticsDidDetectCrashDuringPreviousExecution();
            } catch (Exception e) {
                if (f.a().a(TAG, 6)) {
                    Log.e(TAG, "Exception thrown by CrashlyticsListener while notifying of previous crash.", e);
                }
            }
        }
    }

    private void doLog(int i2, String str, String str2) {
        if (!this.disabled && ensureFabricWithCalled("prior to logging messages.")) {
            this.controller.writeToLog(System.currentTimeMillis() - this.startTime, formatLogMessage(i2, str, str2));
        }
    }

    public static boolean ensureFabricWithCalled(String str) {
        CrashlyticsCore instance = getInstance();
        if (instance != null && instance.controller != null) {
            return true;
        }
        l.a.a.a.c a = f.a();
        String b2 = a.b("Crashlytics must be initialized by calling Fabric.with(Context) ", str);
        if (!a.a(TAG, 6)) {
            return false;
        }
        Log.e(TAG, b2, (Throwable) null);
        return false;
    }

    private void finishInitSynchronously() {
        AnonymousClass1 r0 = new g<Void>() {
            public e getPriority() {
                return e.IMMEDIATE;
            }

            public Void call() {
                return CrashlyticsCore.this.doInBackground();
            }
        };
        for (l addDependency : getDependencies()) {
            r0.addDependency(addDependency);
        }
        Future submit = getFabric().c.submit(r0);
        if (f.a().a(TAG, 3)) {
            Log.d(TAG, "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.", (Throwable) null);
        }
        try {
            submit.get(4, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            if (f.a().a(TAG, 6)) {
                Log.e(TAG, "Crashlytics was interrupted during initialization.", e);
            }
        } catch (ExecutionException e2) {
            if (f.a().a(TAG, 6)) {
                Log.e(TAG, "Problem encountered during Crashlytics initialization.", e2);
            }
        } catch (TimeoutException e3) {
            if (f.a().a(TAG, 6)) {
                Log.e(TAG, "Crashlytics timed out during initialization.", e3);
            }
        }
    }

    public static String formatLogMessage(int i2, String str, String str2) {
        return i.a(i2) + "/" + str + " " + str2;
    }

    public static CrashlyticsCore getInstance() {
        return (CrashlyticsCore) f.a(CrashlyticsCore.class);
    }

    public static boolean isBuildIdValid(String str, boolean z) {
        if (!z) {
            if (f.a().a(TAG, 3)) {
                Log.d(TAG, "Configured not to require a build ID.", (Throwable) null);
            }
            return true;
        } else if (!i.a(str)) {
            return true;
        } else {
            Log.e(TAG, ".");
            Log.e(TAG, ".     |  | ");
            Log.e(TAG, ".     |  |");
            Log.e(TAG, ".     |  |");
            Log.e(TAG, ".   \\ |  | /");
            Log.e(TAG, ".    \\    /");
            Log.e(TAG, ".     \\  /");
            Log.e(TAG, ".      \\/");
            Log.e(TAG, ".");
            Log.e(TAG, MISSING_BUILD_ID_MSG);
            Log.e(TAG, ".");
            Log.e(TAG, ".      /\\");
            Log.e(TAG, ".     /  \\");
            Log.e(TAG, ".    /    \\");
            Log.e(TAG, ".   / |  | \\");
            Log.e(TAG, ".     |  |");
            Log.e(TAG, ".     |  |");
            Log.e(TAG, ".     |  |");
            Log.e(TAG, ".");
            return false;
        }
    }

    public static String sanitizeAttribute(String str) {
        if (str == null) {
            return str;
        }
        String trim = str.trim();
        return trim.length() > 1024 ? trim.substring(0, 1024) : trim;
    }

    public void crash() {
        new CrashTest().indexOutOfBounds();
    }

    public void createCrashMarker() {
        this.crashMarker.create();
    }

    public boolean didPreviousInitializationFail() {
        return this.initializationMarker.isPresent();
    }

    public Map<String, String> getAttributes() {
        return Collections.unmodifiableMap(this.attributes);
    }

    public CrashlyticsController getController() {
        return this.controller;
    }

    public String getIdentifier() {
        return "com.crashlytics.sdk.android.crashlytics-core";
    }

    public CrashlyticsNdkData getNativeCrashData() {
        CrashlyticsNdkDataProvider crashlyticsNdkDataProvider2 = this.crashlyticsNdkDataProvider;
        if (crashlyticsNdkDataProvider2 != null) {
            return crashlyticsNdkDataProvider2.getCrashlyticsNdkData();
        }
        return null;
    }

    public PinningInfoProvider getPinningInfoProvider() {
        if (!this.disabled) {
            return this.pinningInfo;
        }
        return null;
    }

    public String getUserEmail() {
        if (getIdManager().d) {
            return this.userEmail;
        }
        return null;
    }

    public String getUserIdentifier() {
        if (getIdManager().d) {
            return this.userId;
        }
        return null;
    }

    public String getUserName() {
        if (getIdManager().d) {
            return this.userName;
        }
        return null;
    }

    public String getVersion() {
        return "2.7.0.33";
    }

    public boolean internalVerifyPinning(URL url) {
        if (getPinningInfoProvider() == null) {
            return false;
        }
        c cVar = this.httpRequestFactory;
        b bVar = b.GET;
        String url2 = url.toString();
        l.a.a.a.o.e.a aVar = (l.a.a.a.o.e.a) cVar;
        if (aVar != null) {
            HttpRequest a = aVar.a(bVar, url2, Collections.emptyMap());
            ((HttpsURLConnection) a.d()).setInstanceFollowRedirects(false);
            a.c();
            return true;
        }
        throw null;
    }

    public void log(String str) {
        doLog(3, TAG, str);
    }

    public void logException(Throwable th) {
        if (this.disabled || !ensureFabricWithCalled("prior to logging exceptions.")) {
            return;
        }
        if (th != null) {
            this.controller.writeNonFatalException(Thread.currentThread(), th);
        } else if (f.a().a(TAG, 5)) {
            Log.println(5, TAG, "Crashlytics is ignoring a request to log a null exception.");
        }
    }

    public void markInitializationComplete() {
        this.backgroundWorker.submit(new Callable<Boolean>() {
            public Boolean call() {
                try {
                    boolean remove = CrashlyticsCore.this.initializationMarker.remove();
                    String str = "Initialization marker file removed: " + remove;
                    if (f.a().a(CrashlyticsCore.TAG, 3)) {
                        Log.d(CrashlyticsCore.TAG, str, (Throwable) null);
                    }
                    return Boolean.valueOf(remove);
                } catch (Exception e) {
                    if (f.a().a(CrashlyticsCore.TAG, 6)) {
                        Log.e(CrashlyticsCore.TAG, "Problem encountered deleting Crashlytics initialization marker.", e);
                    }
                    return false;
                }
            }
        });
    }

    public void markInitializationStarted() {
        this.backgroundWorker.submitAndWait(new Callable<Void>() {
            public Void call() {
                CrashlyticsCore.this.initializationMarker.create();
                if (f.a().a(CrashlyticsCore.TAG, 3)) {
                    Log.d(CrashlyticsCore.TAG, "Initialization marker file created.", (Throwable) null);
                }
                return null;
            }
        });
    }

    public boolean onPreExecute() {
        return onPreExecute(super.getContext());
    }

    public void setBool(String str, boolean z) {
        setString(str, Boolean.toString(z));
    }

    public void setCrashlyticsNdkDataProvider(CrashlyticsNdkDataProvider crashlyticsNdkDataProvider2) {
        this.crashlyticsNdkDataProvider = crashlyticsNdkDataProvider2;
    }

    public void setDouble(String str, double d) {
        setString(str, Double.toString(d));
    }

    public void setFloat(String str, float f2) {
        setString(str, Float.toString(f2));
    }

    public void setInt(String str, int i2) {
        setString(str, Integer.toString(i2));
    }

    @Deprecated
    public synchronized void setListener(CrashlyticsListener crashlyticsListener) {
        if (f.a().a(TAG, 5)) {
            Log.w(TAG, "Use of setListener is deprecated.", (Throwable) null);
        }
        if (crashlyticsListener != null) {
            this.listener = crashlyticsListener;
        } else {
            throw new IllegalArgumentException("listener must not be null.");
        }
    }

    public void setLong(String str, long j2) {
        setString(str, Long.toString(j2));
    }

    public void setString(String str, String str2) {
        String str3;
        if (this.disabled || !ensureFabricWithCalled("prior to setting keys.")) {
            return;
        }
        if (str == null) {
            Context context = getContext();
            if (context != null && i.f(context)) {
                throw new IllegalArgumentException("Custom attribute key must not be null.");
            } else if (f.a().a(TAG, 6)) {
                Log.e(TAG, "Attempting to set custom attribute with null key, ignoring.", (Throwable) null);
            }
        } else {
            String sanitizeAttribute = sanitizeAttribute(str);
            if (this.attributes.size() < 64 || this.attributes.containsKey(sanitizeAttribute)) {
                if (str2 == null) {
                    str3 = "";
                } else {
                    str3 = sanitizeAttribute(str2);
                }
                this.attributes.put(sanitizeAttribute, str3);
                this.controller.cacheKeyData(this.attributes);
            } else if (f.a().a(TAG, 3)) {
                Log.d(TAG, "Exceeded maximum number of custom attributes (64)", (Throwable) null);
            }
        }
    }

    public void setUserEmail(String str) {
        if (!this.disabled && ensureFabricWithCalled("prior to setting user data.")) {
            String sanitizeAttribute = sanitizeAttribute(str);
            this.userEmail = sanitizeAttribute;
            this.controller.cacheUserData(this.userId, this.userName, sanitizeAttribute);
        }
    }

    public void setUserIdentifier(String str) {
        if (!this.disabled && ensureFabricWithCalled("prior to setting user data.")) {
            String sanitizeAttribute = sanitizeAttribute(str);
            this.userId = sanitizeAttribute;
            this.controller.cacheUserData(sanitizeAttribute, this.userName, this.userEmail);
        }
    }

    public void setUserName(String str) {
        if (!this.disabled && ensureFabricWithCalled("prior to setting user data.")) {
            String sanitizeAttribute = sanitizeAttribute(str);
            this.userName = sanitizeAttribute;
            this.controller.cacheUserData(this.userId, sanitizeAttribute, this.userEmail);
        }
    }

    public boolean verifyPinning(URL url) {
        try {
            return internalVerifyPinning(url);
        } catch (Exception e) {
            if (!f.a().a(TAG, 6)) {
                return false;
            }
            Log.e(TAG, "Could not verify SSL pinning", e);
            return false;
        }
    }

    public Void doInBackground() {
        markInitializationStarted();
        this.controller.cleanInvalidTempFiles();
        try {
            this.controller.registerDevicePowerStateListener();
            s a = p.b.a.a();
            if (a == null) {
                if (f.a().a(TAG, 5)) {
                    Log.w(TAG, "Received null settings, skipping report submission!", (Throwable) null);
                }
                markInitializationComplete();
                return null;
            }
            this.controller.registerAnalyticsEventListener(a);
            if (!a.d.f5179b) {
                if (f.a().a(TAG, 3)) {
                    Log.d(TAG, "Collection of crash reports disabled in Crashlytics settings.", (Throwable) null);
                }
                markInitializationComplete();
                return null;
            } else if (!l.a.a.a.o.b.l.a(getContext()).a()) {
                if (f.a().a(TAG, 3)) {
                    Log.d(TAG, "Automatic collection of crash reports disabled by Firebase settings.", (Throwable) null);
                }
                markInitializationComplete();
                return null;
            } else {
                CrashlyticsNdkData nativeCrashData = getNativeCrashData();
                if (nativeCrashData != null && !this.controller.finalizeNativeReport(nativeCrashData) && f.a().a(TAG, 3)) {
                    Log.d(TAG, "Could not finalize previous NDK sessions.", (Throwable) null);
                }
                if (!this.controller.finalizeSessions(a.f5189b) && f.a().a(TAG, 3)) {
                    Log.d(TAG, "Could not finalize previous sessions.", (Throwable) null);
                }
                this.controller.submitAllReports(this.delay, a);
                markInitializationComplete();
                return null;
            }
        } catch (Exception e) {
            if (f.a().a(TAG, 6)) {
                Log.e(TAG, "Crashlytics encountered a problem during asynchronous initialization.", e);
            }
        } catch (Throwable th) {
            markInitializationComplete();
            throw th;
        }
    }

    public void log(int i2, String str, String str2) {
        doLog(i2, str, str2);
        l.a.a.a.c a = f.a();
        String b2 = a.b("", str);
        String b3 = a.b("", str2);
        if (a != null) {
            Log.println(i2, b2, b3);
            return;
        }
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x013a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onPreExecute(android.content.Context r20) {
        /*
            r19 = this;
            r12 = r19
            r0 = r20
            l.a.a.a.o.b.l r1 = l.a.a.a.o.b.l.a(r20)
            boolean r1 = r1.a()
            r13 = 1
            r14 = 0
            r15 = 3
            java.lang.String r11 = "CrashlyticsCore"
            if (r1 != 0) goto L_0x0024
            l.a.a.a.c r1 = l.a.a.a.f.a()
            boolean r1 = r1.a(r11, r15)
            if (r1 == 0) goto L_0x0022
            java.lang.String r1 = "Crashlytics is disabled, because data collection is disabled by Firebase."
            android.util.Log.d(r11, r1, r14)
        L_0x0022:
            r12.disabled = r13
        L_0x0024:
            boolean r1 = r12.disabled
            r16 = 0
            if (r1 == 0) goto L_0x002b
            return r16
        L_0x002b:
            l.a.a.a.o.b.g r1 = new l.a.a.a.o.b.g
            r1.<init>()
            java.lang.String r1 = r1.c(r0)
            if (r1 != 0) goto L_0x0037
            return r16
        L_0x0037:
            java.lang.String r2 = l.a.a.a.o.b.i.j(r20)
            java.lang.String r3 = "com.crashlytics.RequireBuildId"
            boolean r3 = l.a.a.a.o.b.i.a((android.content.Context) r0, (java.lang.String) r3, (boolean) r13)
            boolean r3 = isBuildIdValid(r2, r3)
            if (r3 == 0) goto L_0x0143
            l.a.a.a.c r3 = l.a.a.a.f.a()     // Catch:{ Exception -> 0x012d }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x012d }
            r4.<init>()     // Catch:{ Exception -> 0x012d }
            java.lang.String r5 = "Initializing Crashlytics Core "
            r4.append(r5)     // Catch:{ Exception -> 0x012d }
            java.lang.String r5 = r19.getVersion()     // Catch:{ Exception -> 0x012d }
            r4.append(r5)     // Catch:{ Exception -> 0x012d }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x012d }
            r5 = 4
            boolean r3 = r3.a(r11, r5)     // Catch:{ Exception -> 0x012d }
            if (r3 == 0) goto L_0x006a
            android.util.Log.i(r11, r4, r14)     // Catch:{ Exception -> 0x012d }
        L_0x006a:
            l.a.a.a.o.f.b r7 = new l.a.a.a.o.f.b     // Catch:{ Exception -> 0x012d }
            r7.<init>(r12)     // Catch:{ Exception -> 0x012d }
            com.crashlytics.android.core.CrashlyticsFileMarker r3 = new com.crashlytics.android.core.CrashlyticsFileMarker     // Catch:{ Exception -> 0x012d }
            java.lang.String r4 = "crash_marker"
            r3.<init>(r4, r7)     // Catch:{ Exception -> 0x012d }
            r12.crashMarker = r3     // Catch:{ Exception -> 0x012d }
            com.crashlytics.android.core.CrashlyticsFileMarker r3 = new com.crashlytics.android.core.CrashlyticsFileMarker     // Catch:{ Exception -> 0x012d }
            java.lang.String r4 = "initialization_marker"
            r3.<init>(r4, r7)     // Catch:{ Exception -> 0x012d }
            r12.initializationMarker = r3     // Catch:{ Exception -> 0x012d }
            l.a.a.a.o.f.d r3 = new l.a.a.a.o.f.d     // Catch:{ Exception -> 0x012d }
            android.content.Context r4 = r19.getContext()     // Catch:{ Exception -> 0x012d }
            java.lang.String r5 = "com.crashlytics.android.core.CrashlyticsCore"
            r3.<init>(r4, r5)     // Catch:{ Exception -> 0x012d }
            com.crashlytics.android.core.PreferenceManager r6 = com.crashlytics.android.core.PreferenceManager.create(r3, r12)     // Catch:{ Exception -> 0x012d }
            com.crashlytics.android.core.PinningInfoProvider r3 = r12.pinningInfo     // Catch:{ Exception -> 0x012d }
            if (r3 == 0) goto L_0x009c
            com.crashlytics.android.core.CrashlyticsPinningInfoProvider r3 = new com.crashlytics.android.core.CrashlyticsPinningInfoProvider     // Catch:{ Exception -> 0x012d }
            com.crashlytics.android.core.PinningInfoProvider r4 = r12.pinningInfo     // Catch:{ Exception -> 0x012d }
            r3.<init>(r4)     // Catch:{ Exception -> 0x012d }
            goto L_0x009d
        L_0x009c:
            r3 = r14
        L_0x009d:
            l.a.a.a.o.e.a r4 = new l.a.a.a.o.e.a     // Catch:{ Exception -> 0x012d }
            l.a.a.a.c r5 = l.a.a.a.f.a()     // Catch:{ Exception -> 0x012d }
            r4.<init>(r5)     // Catch:{ Exception -> 0x012d }
            r12.httpRequestFactory = r4     // Catch:{ Exception -> 0x012d }
            com.crashlytics.android.core.CrashlyticsPinningInfoProvider r5 = r4.f5152b     // Catch:{ Exception -> 0x012d }
            if (r5 == r3) goto L_0x00b1
            r4.f5152b = r3     // Catch:{ Exception -> 0x012d }
            r4.c()     // Catch:{ Exception -> 0x012d }
        L_0x00b1:
            l.a.a.a.o.b.s r5 = r19.getIdManager()     // Catch:{ Exception -> 0x012d }
            com.crashlytics.android.core.AppData r8 = com.crashlytics.android.core.AppData.create(r0, r5, r1, r2)     // Catch:{ Exception -> 0x012d }
            com.crashlytics.android.core.ResourceUnityVersionProvider r9 = new com.crashlytics.android.core.ResourceUnityVersionProvider     // Catch:{ Exception -> 0x012d }
            com.crashlytics.android.core.ManifestUnityVersionProvider r1 = new com.crashlytics.android.core.ManifestUnityVersionProvider     // Catch:{ Exception -> 0x012d }
            java.lang.String r2 = r8.packageName     // Catch:{ Exception -> 0x012d }
            r1.<init>(r0, r2)     // Catch:{ Exception -> 0x012d }
            r9.<init>(r0, r1)     // Catch:{ Exception -> 0x012d }
            com.crashlytics.android.core.DefaultAppMeasurementEventListenerRegistrar r10 = new com.crashlytics.android.core.DefaultAppMeasurementEventListenerRegistrar     // Catch:{ Exception -> 0x012d }
            r10.<init>(r12)     // Catch:{ Exception -> 0x012d }
            com.crashlytics.android.answers.EventLogger r17 = com.crashlytics.android.answers.AppMeasurementEventLogger.getEventLogger(r20)     // Catch:{ Exception -> 0x012d }
            com.crashlytics.android.core.CrashlyticsController r4 = new com.crashlytics.android.core.CrashlyticsController     // Catch:{ Exception -> 0x012d }
            com.crashlytics.android.core.CrashlyticsBackgroundWorker r3 = r12.backgroundWorker     // Catch:{ Exception -> 0x012d }
            l.a.a.a.o.e.c r2 = r12.httpRequestFactory     // Catch:{ Exception -> 0x012d }
            r1 = r4
            r18 = r2
            r2 = r19
            r13 = r4
            r4 = r18
            r14 = r11
            r11 = r17
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x0119 }
            r12.controller = r13     // Catch:{ Exception -> 0x0119 }
            boolean r1 = r19.didPreviousInitializationFail()     // Catch:{ Exception -> 0x0119 }
            r19.checkForPreviousCrash()     // Catch:{ Exception -> 0x0119 }
            l.a.a.a.o.b.r r2 = new l.a.a.a.o.b.r     // Catch:{ Exception -> 0x0119 }
            r2.<init>()     // Catch:{ Exception -> 0x0119 }
            boolean r2 = r2.a(r0)     // Catch:{ Exception -> 0x0119 }
            com.crashlytics.android.core.CrashlyticsController r3 = r12.controller     // Catch:{ Exception -> 0x0119 }
            java.lang.Thread$UncaughtExceptionHandler r4 = java.lang.Thread.getDefaultUncaughtExceptionHandler()     // Catch:{ Exception -> 0x0119 }
            r3.enableExceptionHandling(r4, r2)     // Catch:{ Exception -> 0x0119 }
            if (r1 == 0) goto L_0x011b
            boolean r0 = l.a.a.a.o.b.i.a((android.content.Context) r20)     // Catch:{ Exception -> 0x0119 }
            if (r0 == 0) goto L_0x011b
            l.a.a.a.c r0 = l.a.a.a.f.a()     // Catch:{ Exception -> 0x0119 }
            java.lang.String r1 = "Crashlytics did not finish previous background initialization. Initializing synchronously."
            boolean r0 = r0.a(r14, r15)     // Catch:{ Exception -> 0x0119 }
            if (r0 == 0) goto L_0x0115
            r2 = 0
            android.util.Log.d(r14, r1, r2)     // Catch:{ Exception -> 0x0119 }
        L_0x0115:
            r19.finishInitSynchronously()     // Catch:{ Exception -> 0x0119 }
            return r16
        L_0x0119:
            r0 = move-exception
            goto L_0x012f
        L_0x011b:
            l.a.a.a.c r0 = l.a.a.a.f.a()
            boolean r0 = r0.a(r14, r15)
            if (r0 == 0) goto L_0x012b
            java.lang.String r0 = "Exception handling initialization successful"
            r1 = 0
            android.util.Log.d(r14, r0, r1)
        L_0x012b:
            r0 = 1
            return r0
        L_0x012d:
            r0 = move-exception
            r14 = r11
        L_0x012f:
            l.a.a.a.c r1 = l.a.a.a.f.a()
            r2 = 6
            boolean r1 = r1.a(r14, r2)
            if (r1 == 0) goto L_0x013f
            java.lang.String r1 = "Crashlytics was not started due to an exception during initialization"
            android.util.Log.e(r14, r1, r0)
        L_0x013f:
            r1 = 0
            r12.controller = r1
            return r16
        L_0x0143:
            io.fabric.sdk.android.services.concurrency.UnmetDependencyException r0 = new io.fabric.sdk.android.services.concurrency.UnmetDependencyException
            java.lang.String r1 = "The Crashlytics build ID is missing. This occurs when Crashlytics tooling is absent from your app's build configuration. Please review Crashlytics onboarding instructions and ensure you have a valid Crashlytics account."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crashlytics.android.core.CrashlyticsCore.onPreExecute(android.content.Context):boolean");
    }

    public CrashlyticsCore() {
        this(1.0f, (CrashlyticsListener) null, (PinningInfoProvider) null, false);
    }

    public CrashlyticsCore(float f2, CrashlyticsListener crashlyticsListener, PinningInfoProvider pinningInfoProvider, boolean z, ExecutorService executorService) {
        this.userId = null;
        this.userEmail = null;
        this.userName = null;
        this.delay = f2;
        this.listener = crashlyticsListener == null ? new NoOpListener() : crashlyticsListener;
        this.pinningInfo = pinningInfoProvider;
        this.disabled = z;
        this.backgroundWorker = new CrashlyticsBackgroundWorker(executorService);
        this.attributes = new ConcurrentHashMap<>();
        this.startTime = System.currentTimeMillis();
    }
}
