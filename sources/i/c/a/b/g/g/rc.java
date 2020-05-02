package i.c.a.b.g.g;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import i.c.a.b.d.l.q;
import i.c.a.b.i.a.r6;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.3.0 */
public class rc {

    /* renamed from: h  reason: collision with root package name */
    public static volatile rc f3428h = null;

    /* renamed from: i  reason: collision with root package name */
    public static Boolean f3429i = null;

    /* renamed from: j  reason: collision with root package name */
    public static Boolean f3430j = null;

    /* renamed from: k  reason: collision with root package name */
    public static boolean f3431k = false;

    /* renamed from: l  reason: collision with root package name */
    public static Boolean f3432l;
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final i.c.a.b.d.o.b f3433b;
    public final ExecutorService c;
    public List<Pair<r6, b>> d;
    public int e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f3434f;

    /* renamed from: g  reason: collision with root package name */
    public ma f3435g;

    /* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.3.0 */
    public abstract class a implements Runnable {
        public final long e;

        /* renamed from: f  reason: collision with root package name */
        public final long f3436f;

        /* renamed from: g  reason: collision with root package name */
        public final boolean f3437g;

        public a(boolean z) {
            if (((i.c.a.b.d.o.c) rc.this.f3433b) != null) {
                this.e = System.currentTimeMillis();
                if (((i.c.a.b.d.o.c) rc.this.f3433b) != null) {
                    this.f3436f = SystemClock.elapsedRealtime();
                    this.f3437g = z;
                    return;
                }
                throw null;
            }
            throw null;
        }

        public abstract void a();

        public void b() {
        }

        public void run() {
            if (rc.this.f3434f) {
                b();
                return;
            }
            try {
                a();
            } catch (Exception e2) {
                rc.this.a(e2, false, this.f3437g);
                b();
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.3.0 */
    public static class b extends lc {
        public final r6 a;

        public b(r6 r6Var) {
            this.a = r6Var;
        }

        public final void a(String str, String str2, Bundle bundle, long j2) {
            this.a.onEvent(str, str2, bundle, j2);
        }

        public final int a() {
            return System.identityHashCode(this.a);
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.3.0 */
    public class c implements Application.ActivityLifecycleCallbacks {
        public c() {
        }

        public final void onActivityCreated(Activity activity, Bundle bundle) {
            rc rcVar = rc.this;
            rcVar.c.execute(new t(this, activity, bundle));
        }

        public final void onActivityDestroyed(Activity activity) {
            rc rcVar = rc.this;
            rcVar.c.execute(new y(this, activity));
        }

        public final void onActivityPaused(Activity activity) {
            rc rcVar = rc.this;
            rcVar.c.execute(new x(this, activity));
        }

        public final void onActivityResumed(Activity activity) {
            rc rcVar = rc.this;
            rcVar.c.execute(new u(this, activity));
        }

        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            k8 k8Var = new k8();
            rc rcVar = rc.this;
            rcVar.c.execute(new z(this, activity, k8Var));
            Bundle b2 = k8Var.b(50);
            if (b2 != null) {
                bundle.putAll(b2);
            }
        }

        public final void onActivityStarted(Activity activity) {
            rc rcVar = rc.this;
            rcVar.c.execute(new v(this, activity));
        }

        public final void onActivityStopped(Activity activity) {
            rc rcVar = rc.this;
            rcVar.c.execute(new w(this, activity));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0054  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public rc(android.content.Context r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, android.os.Bundle r12) {
        /*
            r7 = this;
            r7.<init>()
            if (r9 == 0) goto L_0x000f
            boolean r0 = a(r10, r11)
            if (r0 != 0) goto L_0x000c
            goto L_0x000f
        L_0x000c:
            r7.a = r9
            goto L_0x0013
        L_0x000f:
            java.lang.String r9 = "FA"
            r7.a = r9
        L_0x0013:
            i.c.a.b.d.o.c r9 = i.c.a.b.d.o.c.a
            r7.f3433b = r9
            java.util.concurrent.ThreadPoolExecutor r9 = new java.util.concurrent.ThreadPoolExecutor
            r1 = 0
            r2 = 1
            r3 = 30
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.LinkedBlockingQueue r6 = new java.util.concurrent.LinkedBlockingQueue
            r6.<init>()
            r0 = r9
            r0.<init>(r1, r2, r3, r5, r6)
            r7.c = r9
            r9 = 0
            r0 = 1
            i.c.a.b.d.k.h.h.a((android.content.Context) r8)     // Catch:{ IllegalStateException -> 0x0037 }
            java.lang.String r1 = i.c.a.b.d.k.h.h.a()     // Catch:{ IllegalStateException -> 0x0037 }
            if (r1 == 0) goto L_0x0037
            r1 = 1
            goto L_0x0038
        L_0x0037:
            r1 = 0
        L_0x0038:
            if (r1 == 0) goto L_0x0047
            java.lang.String r1 = "com.google.firebase.analytics.FirebaseAnalytics"
            java.lang.Class.forName(r1)     // Catch:{ ClassNotFoundException -> 0x0041 }
            r1 = 1
            goto L_0x0042
        L_0x0041:
            r1 = 0
        L_0x0042:
            if (r1 == 0) goto L_0x0045
            goto L_0x0047
        L_0x0045:
            r1 = 0
            goto L_0x0048
        L_0x0047:
            r1 = 1
        L_0x0048:
            if (r1 != 0) goto L_0x0054
            r7.f3434f = r0
            java.lang.String r8 = r7.a
            java.lang.String r9 = "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection."
            android.util.Log.w(r8, r9)
            return
        L_0x0054:
            boolean r1 = a(r10, r11)
            if (r1 != 0) goto L_0x0078
            if (r10 == 0) goto L_0x0066
            if (r11 == 0) goto L_0x0066
            java.lang.String r9 = r7.a
            java.lang.String r0 = "Deferring to Google Analytics for Firebase for event data collection. https://goo.gl/J1sWQy"
            android.util.Log.v(r9, r0)
            goto L_0x0078
        L_0x0066:
            if (r10 != 0) goto L_0x006a
            r1 = 1
            goto L_0x006b
        L_0x006a:
            r1 = 0
        L_0x006b:
            if (r11 != 0) goto L_0x006e
            r9 = 1
        L_0x006e:
            r9 = r9 ^ r1
            if (r9 == 0) goto L_0x0078
            java.lang.String r9 = r7.a
            java.lang.String r0 = "Specified origin or custom app id is null. Both parameters will be ignored."
            android.util.Log.w(r9, r0)
        L_0x0078:
            i.c.a.b.g.g.b r9 = new i.c.a.b.g.g.b
            r1 = r9
            r2 = r7
            r3 = r10
            r4 = r11
            r5 = r8
            r6 = r12
            r1.<init>(r2, r3, r4, r5, r6)
            java.util.concurrent.ExecutorService r10 = r7.c
            r10.execute(r9)
            android.content.Context r8 = r8.getApplicationContext()
            android.app.Application r8 = (android.app.Application) r8
            if (r8 != 0) goto L_0x0098
            java.lang.String r8 = r7.a
            java.lang.String r9 = "Unable to register lifecycle notifications. Application null."
            android.util.Log.w(r8, r9)
            return
        L_0x0098:
            i.c.a.b.g.g.rc$c r9 = new i.c.a.b.g.g.rc$c
            r9.<init>()
            r8.registerActivityLifecycleCallbacks(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.a.b.g.g.rc.<init>(android.content.Context, java.lang.String, java.lang.String, java.lang.String, android.os.Bundle):void");
    }

    public static rc a(Context context, String str, String str2, String str3, Bundle bundle) {
        q.a(context);
        if (f3428h == null) {
            synchronized (rc.class) {
                if (f3428h == null) {
                    f3428h = new rc(context, str, str2, str3, bundle);
                }
            }
        }
        return f3428h;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0032 A[SYNTHETIC, Splitter:B:24:0x0032] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0040  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void b(android.content.Context r6) {
        /*
            java.lang.Class<i.c.a.b.g.g.rc> r0 = i.c.a.b.g.g.rc.class
            monitor-enter(r0)
            r1 = 0
            java.lang.Boolean r2 = f3429i     // Catch:{ Exception -> 0x0072 }
            if (r2 == 0) goto L_0x000e
            java.lang.Boolean r2 = f3430j     // Catch:{ Exception -> 0x0072 }
            if (r2 == 0) goto L_0x000e
            monitor-exit(r0)     // Catch:{ all -> 0x0070 }
            return
        L_0x000e:
            java.lang.String r2 = "app_measurement_internal_disable_startup_flags"
            i.c.a.b.d.l.q.b((java.lang.String) r2)     // Catch:{ Exception -> 0x0072 }
            i.c.a.b.d.p.b r3 = i.c.a.b.d.p.c.b(r6)     // Catch:{ NameNotFoundException -> 0x002f }
            java.lang.String r4 = r6.getPackageName()     // Catch:{ NameNotFoundException -> 0x002f }
            r5 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r3 = r3.a(r4, r5)     // Catch:{ NameNotFoundException -> 0x002f }
            if (r3 == 0) goto L_0x002f
            android.os.Bundle r4 = r3.metaData     // Catch:{ NameNotFoundException -> 0x002f }
            if (r4 != 0) goto L_0x0028
            goto L_0x002f
        L_0x0028:
            android.os.Bundle r3 = r3.metaData     // Catch:{ NameNotFoundException -> 0x002f }
            boolean r2 = r3.getBoolean(r2)     // Catch:{ NameNotFoundException -> 0x002f }
            goto L_0x0030
        L_0x002f:
            r2 = 0
        L_0x0030:
            if (r2 == 0) goto L_0x0040
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r1)     // Catch:{ Exception -> 0x0072 }
            f3429i = r6     // Catch:{ Exception -> 0x0072 }
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r1)     // Catch:{ Exception -> 0x0072 }
            f3430j = r6     // Catch:{ Exception -> 0x0072 }
            monitor-exit(r0)     // Catch:{ all -> 0x0070 }
            return
        L_0x0040:
            java.lang.String r2 = "com.google.android.gms.measurement.prefs"
            android.content.SharedPreferences r6 = r6.getSharedPreferences(r2, r1)     // Catch:{ Exception -> 0x0072 }
            java.lang.String r2 = "use_dynamite_api"
            boolean r2 = r6.getBoolean(r2, r1)     // Catch:{ Exception -> 0x0072 }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch:{ Exception -> 0x0072 }
            f3429i = r2     // Catch:{ Exception -> 0x0072 }
            java.lang.String r2 = "allow_remote_dynamite"
            boolean r2 = r6.getBoolean(r2, r1)     // Catch:{ Exception -> 0x0072 }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch:{ Exception -> 0x0072 }
            f3430j = r2     // Catch:{ Exception -> 0x0072 }
            android.content.SharedPreferences$Editor r6 = r6.edit()     // Catch:{ Exception -> 0x0072 }
            java.lang.String r2 = "use_dynamite_api"
            r6.remove(r2)     // Catch:{ Exception -> 0x0072 }
            java.lang.String r2 = "allow_remote_dynamite"
            r6.remove(r2)     // Catch:{ Exception -> 0x0072 }
            r6.apply()     // Catch:{ Exception -> 0x0072 }
            goto L_0x0086
        L_0x0070:
            r6 = move-exception
            goto L_0x0088
        L_0x0072:
            r6 = move-exception
            java.lang.String r2 = "FA"
            java.lang.String r3 = "Exception reading flag from SharedPreferences."
            android.util.Log.e(r2, r3, r6)     // Catch:{ all -> 0x0070 }
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x0070 }
            f3429i = r6     // Catch:{ all -> 0x0070 }
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x0070 }
            f3430j = r6     // Catch:{ all -> 0x0070 }
        L_0x0086:
            monitor-exit(r0)     // Catch:{ all -> 0x0070 }
            return
        L_0x0088:
            monitor-exit(r0)     // Catch:{ all -> 0x0070 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.a.b.g.g.rc.b(android.content.Context):void");
    }

    public final void a(Exception exc, boolean z, boolean z2) {
        this.f3434f |= z;
        if (z) {
            Log.w(this.a, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z2) {
            this.c.execute(new m(this, "Error with data collection. Data lost.", exc));
        }
        Log.w(this.a, "Error with data collection. Data lost.", exc);
    }

    public static boolean a(String str, String str2) {
        boolean z;
        if (!(str2 == null || str == null)) {
            try {
                Class.forName("com.google.firebase.analytics.FirebaseAnalytics");
                z = true;
            } catch (ClassNotFoundException unused) {
                z = false;
            }
            if (!z) {
                return true;
            }
        }
        return false;
    }

    public final void a(String str, String str2, Bundle bundle, boolean z, boolean z2, Long l2) {
        this.c.execute(new r(this, l2, str, str2, bundle, z, z2));
    }

    public final void a(String str, String str2, Object obj, boolean z) {
        this.c.execute(new p(this, str, str2, obj, z));
    }

    public static boolean a(Context context) {
        Class<String> cls = String.class;
        b(context);
        synchronized (rc.class) {
            if (!f3431k) {
                try {
                    String str = (String) Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{cls, cls}).invoke((Object) null, new Object[]{"measurement.dynamite.enabled", ""});
                    if ("true".equals(str)) {
                        f3432l = true;
                    } else if ("false".equals(str)) {
                        f3432l = false;
                    } else {
                        f3432l = null;
                    }
                    f3431k = true;
                } catch (Exception e2) {
                    try {
                        Log.e("FA", "Unable to call SystemProperties.get()", e2);
                        f3432l = null;
                    } finally {
                        f3431k = true;
                    }
                }
            }
        }
        Boolean bool = f3432l;
        if (bool == null) {
            bool = f3429i;
        }
        return bool.booleanValue();
    }
}
