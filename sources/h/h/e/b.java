package h.h.e;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: ActivityRecreator */
public final class b {
    public static final Class<?> a;

    /* renamed from: b  reason: collision with root package name */
    public static final Field f1704b;
    public static final Field c;
    public static final Method d;
    public static final Method e;

    /* renamed from: f  reason: collision with root package name */
    public static final Method f1705f;

    /* renamed from: g  reason: collision with root package name */
    public static final Handler f1706g = new Handler(Looper.getMainLooper());

    /* compiled from: ActivityRecreator */
    public static class a implements Runnable {
        public final /* synthetic */ c e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Object f1707f;

        public a(c cVar, Object obj) {
            this.e = cVar;
            this.f1707f = obj;
        }

        public void run() {
            this.e.e = this.f1707f;
        }
    }

    /* renamed from: h.h.e.b$b  reason: collision with other inner class name */
    /* compiled from: ActivityRecreator */
    public static class C0044b implements Runnable {
        public final /* synthetic */ Application e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ c f1708f;

        public C0044b(Application application, c cVar) {
            this.e = application;
            this.f1708f = cVar;
        }

        public void run() {
            this.e.unregisterActivityLifecycleCallbacks(this.f1708f);
        }
    }

    /* compiled from: ActivityRecreator */
    public static final class c implements Application.ActivityLifecycleCallbacks {
        public Object e;

        /* renamed from: f  reason: collision with root package name */
        public Activity f1709f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f1710g = false;

        /* renamed from: h  reason: collision with root package name */
        public boolean f1711h = false;

        /* renamed from: i  reason: collision with root package name */
        public boolean f1712i = false;

        public c(Activity activity) {
            this.f1709f = activity;
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
            if (this.f1709f == activity) {
                this.f1709f = null;
                this.f1711h = true;
            }
        }

        public void onActivityPaused(Activity activity) {
            if (this.f1711h && !this.f1712i && !this.f1710g) {
                Object obj = this.e;
                boolean z = false;
                try {
                    Object obj2 = b.c.get(activity);
                    if (obj2 == obj) {
                        b.f1706g.postAtFrontOfQueue(new c(b.f1704b.get(activity), obj2));
                        z = true;
                    }
                } catch (Throwable th) {
                    Log.e("ActivityRecreator", "Exception while fetching field values", th);
                }
                if (z) {
                    this.f1712i = true;
                    this.e = null;
                }
            }
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
            if (this.f1709f == activity) {
                this.f1710g = true;
            }
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x005d A[SYNTHETIC, Splitter:B:25:0x005d] */
    static {
        /*
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            f1706g = r0
            r0 = 0
            java.lang.String r1 = "android.app.ActivityThread"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ all -> 0x0013 }
            goto L_0x0014
        L_0x0013:
            r1 = r0
        L_0x0014:
            a = r1
            r1 = 1
            java.lang.Class<android.app.Activity> r2 = android.app.Activity.class
            java.lang.String r3 = "mMainThread"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch:{ all -> 0x0023 }
            r2.setAccessible(r1)     // Catch:{ all -> 0x0023 }
            goto L_0x0024
        L_0x0023:
            r2 = r0
        L_0x0024:
            f1704b = r2
            java.lang.Class<android.app.Activity> r2 = android.app.Activity.class
            java.lang.String r3 = "mToken"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch:{ all -> 0x0032 }
            r2.setAccessible(r1)     // Catch:{ all -> 0x0032 }
            goto L_0x0033
        L_0x0032:
            r2 = r0
        L_0x0033:
            c = r2
            java.lang.Class<?> r2 = a
            r3 = 3
            java.lang.String r4 = "performStopActivity"
            r5 = 2
            r6 = 0
            if (r2 != 0) goto L_0x0040
        L_0x003e:
            r2 = r0
            goto L_0x0055
        L_0x0040:
            java.lang.Class[] r7 = new java.lang.Class[r3]     // Catch:{ all -> 0x003e }
            java.lang.Class<android.os.IBinder> r8 = android.os.IBinder.class
            r7[r6] = r8     // Catch:{ all -> 0x003e }
            java.lang.Class r8 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x003e }
            r7[r1] = r8     // Catch:{ all -> 0x003e }
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r7[r5] = r8     // Catch:{ all -> 0x003e }
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r4, r7)     // Catch:{ all -> 0x003e }
            r2.setAccessible(r1)     // Catch:{ all -> 0x003e }
        L_0x0055:
            d = r2
            java.lang.Class<?> r2 = a
            if (r2 != 0) goto L_0x005d
        L_0x005b:
            r2 = r0
            goto L_0x006e
        L_0x005d:
            java.lang.Class[] r7 = new java.lang.Class[r5]     // Catch:{ all -> 0x005b }
            java.lang.Class<android.os.IBinder> r8 = android.os.IBinder.class
            r7[r6] = r8     // Catch:{ all -> 0x005b }
            java.lang.Class r8 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x005b }
            r7[r1] = r8     // Catch:{ all -> 0x005b }
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r4, r7)     // Catch:{ all -> 0x005b }
            r2.setAccessible(r1)     // Catch:{ all -> 0x005b }
        L_0x006e:
            e = r2
            java.lang.Class<?> r2 = a
            boolean r4 = a()
            if (r4 == 0) goto L_0x00b3
            if (r2 != 0) goto L_0x007b
            goto L_0x00b3
        L_0x007b:
            java.lang.String r4 = "requestRelaunchActivity"
            r7 = 9
            java.lang.Class[] r7 = new java.lang.Class[r7]     // Catch:{ all -> 0x00b3 }
            java.lang.Class<android.os.IBinder> r8 = android.os.IBinder.class
            r7[r6] = r8     // Catch:{ all -> 0x00b3 }
            java.lang.Class<java.util.List> r6 = java.util.List.class
            r7[r1] = r6     // Catch:{ all -> 0x00b3 }
            java.lang.Class<java.util.List> r6 = java.util.List.class
            r7[r5] = r6     // Catch:{ all -> 0x00b3 }
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch:{ all -> 0x00b3 }
            r7[r3] = r5     // Catch:{ all -> 0x00b3 }
            r3 = 4
            java.lang.Class r5 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x00b3 }
            r7[r3] = r5     // Catch:{ all -> 0x00b3 }
            r3 = 5
            java.lang.Class<android.content.res.Configuration> r5 = android.content.res.Configuration.class
            r7[r3] = r5     // Catch:{ all -> 0x00b3 }
            r3 = 6
            java.lang.Class<android.content.res.Configuration> r5 = android.content.res.Configuration.class
            r7[r3] = r5     // Catch:{ all -> 0x00b3 }
            r3 = 7
            java.lang.Class r5 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x00b3 }
            r7[r3] = r5     // Catch:{ all -> 0x00b3 }
            r3 = 8
            java.lang.Class r5 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x00b3 }
            r7[r3] = r5     // Catch:{ all -> 0x00b3 }
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r4, r7)     // Catch:{ all -> 0x00b3 }
            r2.setAccessible(r1)     // Catch:{ all -> 0x00b3 }
            r0 = r2
        L_0x00b3:
            f1705f = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h.h.e.b.<clinit>():void");
    }

    public static boolean a(Activity activity) {
        Object obj;
        Application application;
        c cVar;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        } else if (a() && f1705f == null) {
            return false;
        } else {
            if (e == null && d == null) {
                return false;
            }
            try {
                Object obj2 = c.get(activity);
                if (obj2 == null || (obj = f1704b.get(activity)) == null) {
                    return false;
                }
                application = activity.getApplication();
                cVar = new c(activity);
                application.registerActivityLifecycleCallbacks(cVar);
                f1706g.post(new a(cVar, obj2));
                if (a()) {
                    f1705f.invoke(obj, new Object[]{obj2, null, null, 0, false, null, null, false, false});
                } else {
                    activity.recreate();
                }
                f1706g.post(new C0044b(application, cVar));
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
    }

    public static boolean a() {
        int i2 = Build.VERSION.SDK_INT;
        return i2 == 26 || i2 == 27;
    }
}
