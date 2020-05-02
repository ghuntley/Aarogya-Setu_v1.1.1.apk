package com.google.firebase.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.firebase.FirebaseApp;
import i.c.a.b.d.l.q;
import i.c.a.b.l.d0;
import i.c.d.i.b;
import i.c.d.i.d;
import i.c.d.j.c;
import i.c.d.k.a1;
import i.c.d.k.c0;
import i.c.d.k.d1;
import i.c.d.k.e0;
import i.c.d.k.f1;
import i.c.d.k.s;
import i.c.d.k.s0;
import i.c.d.k.v;
import i.c.d.k.w0;
import i.c.d.k.x0;
import i.c.d.k.y0;
import i.c.d.k.z;
import i.c.d.m.g;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.firebase:firebase-iid@@20.1.2 */
public class FirebaseInstanceId {

    /* renamed from: j  reason: collision with root package name */
    public static final long f698j = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: k  reason: collision with root package name */
    public static z f699k;
    @GuardedBy("FirebaseInstanceId.class")

    /* renamed from: l  reason: collision with root package name */
    public static ScheduledExecutorService f700l;
    public final Executor a;

    /* renamed from: b  reason: collision with root package name */
    public final FirebaseApp f701b;
    public final s c;
    public final d1 d;
    public final v e;

    /* renamed from: f  reason: collision with root package name */
    public final e0 f702f;

    /* renamed from: g  reason: collision with root package name */
    public final g f703g;
    @GuardedBy("this")

    /* renamed from: h  reason: collision with root package name */
    public boolean f704h = false;

    /* renamed from: i  reason: collision with root package name */
    public final a f705i;

    /* compiled from: com.google.firebase:firebase-iid@@20.1.2 */
    public class a {
        public boolean a;

        /* renamed from: b  reason: collision with root package name */
        public final d f706b;
        @GuardedBy("this")
        public boolean c;
        @GuardedBy("this")
        public b<i.c.d.a> d;
        @GuardedBy("this")
        public Boolean e;

        public a(d dVar) {
            this.f706b = dVar;
        }

        public final synchronized boolean a() {
            b();
            if (this.e == null) {
                return this.a && FirebaseInstanceId.this.f701b.isDataCollectionDefaultEnabled();
            }
            return this.e.booleanValue();
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(3:10|11|(1:15)) */
        /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
            r1 = r4.f707f.f701b;
            r1.a();
            r1 = r1.a;
            r2 = new android.content.Intent("com.google.firebase.MESSAGING_EVENT");
            r2.setPackage(r1.getPackageName());
            r3 = false;
            r1 = r1.getPackageManager().resolveService(r2, 0);
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x000f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final synchronized void b() {
            /*
                r4 = this;
                monitor-enter(r4)
                boolean r0 = r4.c     // Catch:{ all -> 0x0056 }
                if (r0 == 0) goto L_0x0007
                monitor-exit(r4)
                return
            L_0x0007:
                r0 = 1
                java.lang.String r1 = "com.google.firebase.messaging.FirebaseMessaging"
                java.lang.Class.forName(r1)     // Catch:{ ClassNotFoundException -> 0x000f }
            L_0x000d:
                r3 = 1
                goto L_0x0036
            L_0x000f:
                com.google.firebase.iid.FirebaseInstanceId r1 = com.google.firebase.iid.FirebaseInstanceId.this     // Catch:{ all -> 0x0056 }
                com.google.firebase.FirebaseApp r1 = r1.f701b     // Catch:{ all -> 0x0056 }
                r1.a()     // Catch:{ all -> 0x0056 }
                android.content.Context r1 = r1.a     // Catch:{ all -> 0x0056 }
                android.content.Intent r2 = new android.content.Intent     // Catch:{ all -> 0x0056 }
                java.lang.String r3 = "com.google.firebase.MESSAGING_EVENT"
                r2.<init>(r3)     // Catch:{ all -> 0x0056 }
                java.lang.String r3 = r1.getPackageName()     // Catch:{ all -> 0x0056 }
                r2.setPackage(r3)     // Catch:{ all -> 0x0056 }
                android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch:{ all -> 0x0056 }
                r3 = 0
                android.content.pm.ResolveInfo r1 = r1.resolveService(r2, r3)     // Catch:{ all -> 0x0056 }
                if (r1 == 0) goto L_0x0036
                android.content.pm.ServiceInfo r1 = r1.serviceInfo     // Catch:{ all -> 0x0056 }
                if (r1 == 0) goto L_0x0036
                goto L_0x000d
            L_0x0036:
                r4.a = r3     // Catch:{ all -> 0x0056 }
                java.lang.Boolean r1 = r4.c()     // Catch:{ all -> 0x0056 }
                r4.e = r1     // Catch:{ all -> 0x0056 }
                if (r1 != 0) goto L_0x0052
                boolean r1 = r4.a     // Catch:{ all -> 0x0056 }
                if (r1 == 0) goto L_0x0052
                i.c.d.k.c1 r1 = new i.c.d.k.c1     // Catch:{ all -> 0x0056 }
                r1.<init>(r4)     // Catch:{ all -> 0x0056 }
                r4.d = r1     // Catch:{ all -> 0x0056 }
                i.c.d.i.d r2 = r4.f706b     // Catch:{ all -> 0x0056 }
                java.lang.Class<i.c.d.a> r3 = i.c.d.a.class
                r2.a(r3, r1)     // Catch:{ all -> 0x0056 }
            L_0x0052:
                r4.c = r0     // Catch:{ all -> 0x0056 }
                monitor-exit(r4)
                return
            L_0x0056:
                r0 = move-exception
                monitor-exit(r4)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.FirebaseInstanceId.a.b():void");
        }

        public final Boolean c() {
            ApplicationInfo applicationInfo;
            FirebaseApp firebaseApp = FirebaseInstanceId.this.f701b;
            firebaseApp.a();
            Context context = firebaseApp.a;
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || applicationInfo.metaData == null || !applicationInfo.metaData.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }
    }

    public FirebaseInstanceId(FirebaseApp firebaseApp, s sVar, Executor executor, Executor executor2, d dVar, i.c.d.p.g gVar, c cVar, g gVar2) {
        FirebaseApp firebaseApp2 = firebaseApp;
        Executor executor3 = executor2;
        if (s.a(firebaseApp) != null) {
            synchronized (FirebaseInstanceId.class) {
                if (f699k == null) {
                    firebaseApp.a();
                    f699k = new z(firebaseApp2.a);
                }
            }
            this.f701b = firebaseApp2;
            s sVar2 = sVar;
            this.c = sVar2;
            this.d = new d1(firebaseApp, sVar2, executor, gVar, cVar, gVar2);
            this.a = executor3;
            this.f702f = new e0(f699k);
            this.f705i = new a(dVar);
            Executor executor4 = executor;
            this.e = new v(executor);
            this.f703g = gVar2;
            executor2.execute(new w0(this));
            return;
        }
        throw new IllegalStateException("FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID");
    }

    public static FirebaseInstanceId g() {
        return getInstance(FirebaseApp.getInstance());
    }

    @Keep
    public static FirebaseInstanceId getInstance(FirebaseApp firebaseApp) {
        firebaseApp.a();
        return (FirebaseInstanceId) firebaseApp.d.a(FirebaseInstanceId.class);
    }

    public static boolean h() {
        if (!Log.isLoggable("FirebaseInstanceId", 3)) {
            return Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseInstanceId", 3);
        }
        return true;
    }

    public final synchronized void a(boolean z) {
        this.f704h = z;
    }

    public final String b() {
        String a2 = s.a(this.f701b);
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return ((i.c.d.k.a) a(a(a2, "*"))).a();
        }
        throw new IOException("MAIN_THREAD");
    }

    public final synchronized void c() {
        f699k.b();
        if (this.f705i.a()) {
            e();
        }
    }

    public final void d() {
        if (a(a()) || this.f702f.a()) {
            e();
        }
    }

    public final synchronized void e() {
        if (!this.f704h) {
            a(0);
        }
    }

    public final String f() {
        try {
            f699k.b(this.f701b.b());
            i.c.a.b.l.g<String> d2 = this.f703g.d();
            q.a(d2, (Object) "Task must not be null");
            CountDownLatch countDownLatch = new CountDownLatch(1);
            d0 d0Var = (d0) d2;
            d0Var.f4000b.a(new i.c.a.b.l.s(x0.e, new a1(countDownLatch)));
            d0Var.f();
            countDownLatch.await(30000, TimeUnit.MILLISECONDS);
            if (d2.d()) {
                return d2.b();
            }
            if (((d0) d2).d) {
                throw new CancellationException("Task is already canceled");
            }
            throw new IllegalStateException(d2.a());
        } catch (InterruptedException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public final synchronized void a(long j2) {
        a((Runnable) new c0(this, this.f702f, Math.min(Math.max(30, j2 << 1), f698j)), j2);
        this.f704h = true;
    }

    public final void b(String str) {
        i.c.d.k.d0 a2 = a();
        if (!a(a2)) {
            String f2 = f();
            d1 d1Var = this.d;
            String str2 = a2.a;
            if (d1Var != null) {
                Bundle bundle = new Bundle();
                String valueOf = String.valueOf(str);
                bundle.putString("gcm.topic", valueOf.length() != 0 ? "/topics/".concat(valueOf) : new String("/topics/"));
                bundle.putString("delete", "1");
                String valueOf2 = String.valueOf(str);
                a(d1Var.a(d1Var.a(f2, str2, valueOf2.length() != 0 ? "/topics/".concat(valueOf2) : new String("/topics/"), bundle)).a(s0.a, new f1()));
                return;
            }
            throw null;
        }
        throw new IOException("token not available");
    }

    public static void a(Runnable runnable, long j2) {
        synchronized (FirebaseInstanceId.class) {
            if (f700l == null) {
                f700l = new ScheduledThreadPoolExecutor(1, new i.c.a.b.d.o.h.a("FirebaseInstanceId"));
            }
            f700l.schedule(runnable, j2, TimeUnit.SECONDS);
        }
    }

    public final i.c.d.k.d0 a() {
        return f699k.a("", s.a(this.f701b), "*");
    }

    public final <T> T a(i.c.a.b.l.g<T> gVar) {
        try {
            return q.a(gVar, 30000, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof IOException) {
                if ("INSTANCE_ID_RESET".equals(cause.getMessage())) {
                    c();
                }
                throw ((IOException) cause);
            } else if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else {
                throw new IOException(e2);
            }
        } catch (InterruptedException | TimeoutException unused) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }

    public final void a(String str) {
        i.c.d.k.d0 a2 = a();
        if (!a(a2)) {
            String f2 = f();
            String str2 = a2.a;
            d1 d1Var = this.d;
            if (d1Var != null) {
                Bundle bundle = new Bundle();
                String valueOf = String.valueOf(str);
                bundle.putString("gcm.topic", valueOf.length() != 0 ? "/topics/".concat(valueOf) : new String("/topics/"));
                String valueOf2 = String.valueOf(str);
                a(d1Var.a(d1Var.a(f2, str2, valueOf2.length() != 0 ? "/topics/".concat(valueOf2) : new String("/topics/"), bundle)).a(s0.a, new f1()));
                return;
            }
            throw null;
        }
        throw new IOException("token not available");
    }

    public static void a(FirebaseApp firebaseApp) {
        String str;
        firebaseApp.a();
        if (TextUtils.isEmpty(firebaseApp.c.f4638g)) {
            firebaseApp.a();
            str = firebaseApp.c.e;
        } else {
            firebaseApp.a();
            str = firebaseApp.c.f4638g;
        }
        q.a(str, (Object) "FirebaseApp should have a non-empty projectId.");
        firebaseApp.a();
        q.a(firebaseApp.c.f4636b, (Object) "FirebaseApp should have a non-empty applicationId.");
        firebaseApp.a();
        q.a(firebaseApp.c.a, (Object) "FirebaseApp should have a non-empty apiKey.");
    }

    public final i.c.a.b.l.g<i.c.d.k.a> a(String str, String str2) {
        if (str2.isEmpty() || str2.equalsIgnoreCase("fcm") || str2.equalsIgnoreCase("gcm")) {
            str2 = "*";
        }
        return q.b(null).b(this.a, new y0(this, str, str2));
    }

    public final boolean a(i.c.d.k.d0 d0Var) {
        if (d0Var != null) {
            if (System.currentTimeMillis() > d0Var.c + i.c.d.k.d0.d || !this.c.b().equals(d0Var.f4686b)) {
                return true;
            }
            return false;
        }
        return true;
    }
}
