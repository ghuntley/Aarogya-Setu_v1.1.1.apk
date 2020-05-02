package com.google.firebase;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.UserManager;
import android.util.Base64;
import android.util.Log;
import com.crashlytics.android.core.DefaultAppMeasurementEventListenerRegistrar;
import i.c.a.b.d.k.h.c;
import i.c.a.b.d.l.q;
import i.c.d.f.m;
import i.c.d.f.t;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.firebase:firebase-common@@19.3.0 */
public class FirebaseApp {

    /* renamed from: i  reason: collision with root package name */
    public static final Object f689i = new Object();

    /* renamed from: j  reason: collision with root package name */
    public static final Executor f690j = new d((a) null);
    @GuardedBy("LOCK")

    /* renamed from: k  reason: collision with root package name */
    public static final Map<String, FirebaseApp> f691k = new h.e.a();
    public final Context a;

    /* renamed from: b  reason: collision with root package name */
    public final String f692b;
    public final i.c.d.c c;
    public final m d;
    public final AtomicBoolean e = new AtomicBoolean(false);

    /* renamed from: f  reason: collision with root package name */
    public final AtomicBoolean f693f = new AtomicBoolean();

    /* renamed from: g  reason: collision with root package name */
    public final t<i.c.d.n.a> f694g;

    /* renamed from: h  reason: collision with root package name */
    public final List<b> f695h = new CopyOnWriteArrayList();

    /* compiled from: com.google.firebase:firebase-common@@19.3.0 */
    public interface b {
        void a(boolean z);
    }

    /* compiled from: com.google.firebase:firebase-common@@19.3.0 */
    public static class d implements Executor {
        public static final Handler e = new Handler(Looper.getMainLooper());

        public /* synthetic */ d(a aVar) {
        }

        public void execute(Runnable runnable) {
            e.post(runnable);
        }
    }

    @TargetApi(24)
    /* compiled from: com.google.firebase:firebase-common@@19.3.0 */
    public static class e extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        public static AtomicReference<e> f696b = new AtomicReference<>();
        public final Context a;

        public e(Context context) {
            this.a = context;
        }

        public void onReceive(Context context, Intent intent) {
            synchronized (FirebaseApp.f689i) {
                for (FirebaseApp c : FirebaseApp.f691k.values()) {
                    c.c();
                }
            }
            this.a.unregisterReceiver(this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0189  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public FirebaseApp(android.content.Context r13, java.lang.String r14, i.c.d.c r15) {
        /*
            r12 = this;
            r12.<init>()
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            r12.e = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            r12.f693f = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r12.f695h = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            i.c.a.b.d.l.q.a(r13)
            r12.a = r13
            i.c.a.b.d.l.q.b((java.lang.String) r14)
            r12.f692b = r14
            i.c.a.b.d.l.q.a(r15)
            r12.c = r15
            java.lang.Class<com.google.firebase.components.ComponentDiscoveryService> r14 = com.google.firebase.components.ComponentDiscoveryService.class
            i.c.d.f.g r0 = new i.c.d.f.g
            r2 = 0
            r0.<init>(r14, r2)
            java.lang.String r14 = "ComponentDiscovery"
            android.content.pm.PackageManager r3 = r13.getPackageManager()     // Catch:{ NameNotFoundException -> 0x006c }
            if (r3 != 0) goto L_0x0043
            java.lang.String r0 = "Context has no PackageManager."
            android.util.Log.w(r14, r0)     // Catch:{ NameNotFoundException -> 0x006c }
            goto L_0x0071
        L_0x0043:
            android.content.ComponentName r4 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x006c }
            java.lang.Class<? extends android.app.Service> r5 = r0.a     // Catch:{ NameNotFoundException -> 0x006c }
            r4.<init>(r13, r5)     // Catch:{ NameNotFoundException -> 0x006c }
            r5 = 128(0x80, float:1.794E-43)
            android.content.pm.ServiceInfo r3 = r3.getServiceInfo(r4, r5)     // Catch:{ NameNotFoundException -> 0x006c }
            if (r3 != 0) goto L_0x0069
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ NameNotFoundException -> 0x006c }
            r3.<init>()     // Catch:{ NameNotFoundException -> 0x006c }
            java.lang.Class<? extends android.app.Service> r0 = r0.a     // Catch:{ NameNotFoundException -> 0x006c }
            r3.append(r0)     // Catch:{ NameNotFoundException -> 0x006c }
            java.lang.String r0 = " has no service info."
            r3.append(r0)     // Catch:{ NameNotFoundException -> 0x006c }
            java.lang.String r0 = r3.toString()     // Catch:{ NameNotFoundException -> 0x006c }
            android.util.Log.w(r14, r0)     // Catch:{ NameNotFoundException -> 0x006c }
            goto L_0x0071
        L_0x0069:
            android.os.Bundle r0 = r3.metaData     // Catch:{ NameNotFoundException -> 0x006c }
            goto L_0x0072
        L_0x006c:
            java.lang.String r0 = "Application info not found."
            android.util.Log.w(r14, r0)
        L_0x0071:
            r0 = r2
        L_0x0072:
            java.lang.String r3 = "com.google.firebase.components.ComponentRegistrar"
            if (r0 != 0) goto L_0x0080
            java.lang.String r0 = "Could not retrieve metadata, returning empty list of registrars."
            android.util.Log.w(r14, r0)
            java.util.List r0 = java.util.Collections.emptyList()
            goto L_0x00b6
        L_0x0080:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Set r5 = r0.keySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x008d:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x00b5
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r0.get(r6)
            boolean r7 = r3.equals(r7)
            if (r7 == 0) goto L_0x008d
            java.lang.String r7 = "com.google.firebase.components:"
            boolean r7 = r6.startsWith(r7)
            if (r7 == 0) goto L_0x008d
            r7 = 31
            java.lang.String r6 = r6.substring(r7)
            r4.add(r6)
            goto L_0x008d
        L_0x00b5:
            r0 = r4
        L_0x00b6:
            java.lang.String r4 = "Could not instantiate %s"
            java.lang.String r5 = "Could not instantiate %s."
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x00c3:
            boolean r7 = r0.hasNext()
            r8 = 1
            r9 = 2
            if (r7 == 0) goto L_0x0142
            java.lang.Object r7 = r0.next()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Class r10 = java.lang.Class.forName(r7)     // Catch:{ ClassNotFoundException -> 0x0133, IllegalAccessException -> 0x0126, InstantiationException -> 0x0119, NoSuchMethodException -> 0x010c, InvocationTargetException -> 0x00ff }
            java.lang.Class<i.c.d.f.i> r11 = i.c.d.f.i.class
            boolean r11 = r11.isAssignableFrom(r10)     // Catch:{ ClassNotFoundException -> 0x0133, IllegalAccessException -> 0x0126, InstantiationException -> 0x0119, NoSuchMethodException -> 0x010c, InvocationTargetException -> 0x00ff }
            if (r11 != 0) goto L_0x00ed
            java.lang.String r10 = "Class %s is not an instance of %s"
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch:{ ClassNotFoundException -> 0x0133, IllegalAccessException -> 0x0126, InstantiationException -> 0x0119, NoSuchMethodException -> 0x010c, InvocationTargetException -> 0x00ff }
            r9[r1] = r7     // Catch:{ ClassNotFoundException -> 0x0133, IllegalAccessException -> 0x0126, InstantiationException -> 0x0119, NoSuchMethodException -> 0x010c, InvocationTargetException -> 0x00ff }
            r9[r8] = r3     // Catch:{ ClassNotFoundException -> 0x0133, IllegalAccessException -> 0x0126, InstantiationException -> 0x0119, NoSuchMethodException -> 0x010c, InvocationTargetException -> 0x00ff }
            java.lang.String r9 = java.lang.String.format(r10, r9)     // Catch:{ ClassNotFoundException -> 0x0133, IllegalAccessException -> 0x0126, InstantiationException -> 0x0119, NoSuchMethodException -> 0x010c, InvocationTargetException -> 0x00ff }
            android.util.Log.w(r14, r9)     // Catch:{ ClassNotFoundException -> 0x0133, IllegalAccessException -> 0x0126, InstantiationException -> 0x0119, NoSuchMethodException -> 0x010c, InvocationTargetException -> 0x00ff }
            goto L_0x00c3
        L_0x00ed:
            java.lang.Class[] r9 = new java.lang.Class[r1]     // Catch:{ ClassNotFoundException -> 0x0133, IllegalAccessException -> 0x0126, InstantiationException -> 0x0119, NoSuchMethodException -> 0x010c, InvocationTargetException -> 0x00ff }
            java.lang.reflect.Constructor r9 = r10.getDeclaredConstructor(r9)     // Catch:{ ClassNotFoundException -> 0x0133, IllegalAccessException -> 0x0126, InstantiationException -> 0x0119, NoSuchMethodException -> 0x010c, InvocationTargetException -> 0x00ff }
            java.lang.Object[] r10 = new java.lang.Object[r1]     // Catch:{ ClassNotFoundException -> 0x0133, IllegalAccessException -> 0x0126, InstantiationException -> 0x0119, NoSuchMethodException -> 0x010c, InvocationTargetException -> 0x00ff }
            java.lang.Object r9 = r9.newInstance(r10)     // Catch:{ ClassNotFoundException -> 0x0133, IllegalAccessException -> 0x0126, InstantiationException -> 0x0119, NoSuchMethodException -> 0x010c, InvocationTargetException -> 0x00ff }
            i.c.d.f.i r9 = (i.c.d.f.i) r9     // Catch:{ ClassNotFoundException -> 0x0133, IllegalAccessException -> 0x0126, InstantiationException -> 0x0119, NoSuchMethodException -> 0x010c, InvocationTargetException -> 0x00ff }
            r6.add(r9)     // Catch:{ ClassNotFoundException -> 0x0133, IllegalAccessException -> 0x0126, InstantiationException -> 0x0119, NoSuchMethodException -> 0x010c, InvocationTargetException -> 0x00ff }
            goto L_0x00c3
        L_0x00ff:
            r9 = move-exception
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r8[r1] = r7
            java.lang.String r7 = java.lang.String.format(r4, r8)
            android.util.Log.w(r14, r7, r9)
            goto L_0x00c3
        L_0x010c:
            r9 = move-exception
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r8[r1] = r7
            java.lang.String r7 = java.lang.String.format(r4, r8)
            android.util.Log.w(r14, r7, r9)
            goto L_0x00c3
        L_0x0119:
            r9 = move-exception
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r8[r1] = r7
            java.lang.String r7 = java.lang.String.format(r5, r8)
            android.util.Log.w(r14, r7, r9)
            goto L_0x00c3
        L_0x0126:
            r9 = move-exception
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r8[r1] = r7
            java.lang.String r7 = java.lang.String.format(r5, r8)
            android.util.Log.w(r14, r7, r9)
            goto L_0x00c3
        L_0x0133:
            r9 = move-exception
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r8[r1] = r7
            java.lang.String r7 = "Class %s is not an found."
            java.lang.String r7 = java.lang.String.format(r7, r8)
            android.util.Log.w(r14, r7, r9)
            goto L_0x00c3
        L_0x0142:
            n.a r14 = n.a.f5197i     // Catch:{ NoClassDefFoundError -> 0x0149 }
            java.lang.String r14 = r14.toString()     // Catch:{ NoClassDefFoundError -> 0x0149 }
            goto L_0x014a
        L_0x0149:
            r14 = r2
        L_0x014a:
            i.c.d.f.m r0 = new i.c.d.f.m
            java.util.concurrent.Executor r3 = f690j
            r4 = 8
            i.c.d.f.d[] r4 = new i.c.d.f.d[r4]
            java.lang.Class<android.content.Context> r5 = android.content.Context.class
            java.lang.Class[] r7 = new java.lang.Class[r1]
            i.c.d.f.d r5 = i.c.d.f.d.a(r13, r5, r7)
            r4[r1] = r5
            java.lang.Class<com.google.firebase.FirebaseApp> r5 = com.google.firebase.FirebaseApp.class
            java.lang.Class[] r7 = new java.lang.Class[r1]
            i.c.d.f.d r5 = i.c.d.f.d.a(r12, r5, r7)
            r4[r8] = r5
            java.lang.Class<i.c.d.c> r5 = i.c.d.c.class
            java.lang.Class[] r7 = new java.lang.Class[r1]
            i.c.d.f.d r15 = i.c.d.f.d.a(r15, r5, r7)
            r4[r9] = r15
            r15 = 3
            java.lang.String r5 = "fire-android"
            java.lang.String r7 = ""
            i.c.d.f.d r5 = i.c.d.p.e.a((java.lang.String) r5, (java.lang.String) r7)
            r4[r15] = r5
            r15 = 4
            java.lang.String r5 = "fire-core"
            java.lang.String r7 = "19.3.0"
            i.c.d.f.d r5 = i.c.d.p.e.a((java.lang.String) r5, (java.lang.String) r7)
            r4[r15] = r5
            r15 = 5
            if (r14 == 0) goto L_0x018f
            java.lang.String r2 = "kotlin"
            i.c.d.f.d r2 = i.c.d.p.e.a((java.lang.String) r2, (java.lang.String) r14)
        L_0x018f:
            r4[r15] = r2
            r14 = 6
            java.lang.Class<i.c.d.p.g> r15 = i.c.d.p.g.class
            i.c.d.f.d$b r15 = i.c.d.f.d.a(r15)
            java.lang.Class<i.c.d.p.f> r2 = i.c.d.p.f.class
            i.c.d.f.q r5 = new i.c.d.f.q
            r5.<init>(r2, r9, r1)
            r15.a((i.c.d.f.q) r5)
            i.c.d.p.b r1 = i.c.d.p.b.a
            r15.a(r1)
            i.c.d.f.d r15 = r15.a()
            r4[r14] = r15
            r14 = 7
            java.lang.Class<i.c.d.j.c> r15 = i.c.d.j.c.class
            i.c.d.f.d$b r15 = i.c.d.f.d.a(r15)
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            i.c.d.f.q r1 = i.c.d.f.q.b(r1)
            r15.a((i.c.d.f.q) r1)
            i.c.d.j.a r1 = i.c.d.j.a.a
            r15.a(r1)
            i.c.d.f.d r15 = r15.a()
            r4[r14] = r15
            r0.<init>(r3, r6, r4)
            r12.d = r0
            i.c.d.f.t r14 = new i.c.d.f.t
            i.c.d.b r15 = new i.c.d.b
            r15.<init>(r12, r13)
            r14.<init>(r15)
            r12.f694g = r14
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.FirebaseApp.<init>(android.content.Context, java.lang.String, i.c.d.c):void");
    }

    public static FirebaseApp a(Context context) {
        synchronized (f689i) {
            if (f691k.containsKey("[DEFAULT]")) {
                FirebaseApp instance = getInstance();
                return instance;
            }
            i.c.d.c a2 = i.c.d.c.a(context);
            if (a2 == null) {
                Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                return null;
            }
            FirebaseApp a3 = a(context, a2, "[DEFAULT]");
            return a3;
        }
    }

    public static FirebaseApp getInstance() {
        FirebaseApp firebaseApp;
        synchronized (f689i) {
            firebaseApp = f691k.get("[DEFAULT]");
            if (firebaseApp == null) {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + i.c.a.b.d.o.e.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
        }
        return firebaseApp;
    }

    public String b() {
        String str;
        StringBuilder sb = new StringBuilder();
        a();
        byte[] bytes = this.f692b.getBytes(Charset.defaultCharset());
        String str2 = null;
        if (bytes == null) {
            str = null;
        } else {
            str = Base64.encodeToString(bytes, 11);
        }
        sb.append(str);
        sb.append("+");
        a();
        byte[] bytes2 = this.c.f4636b.getBytes(Charset.defaultCharset());
        if (bytes2 != null) {
            str2 = Base64.encodeToString(bytes2, 11);
        }
        sb.append(str2);
        return sb.toString();
    }

    public final void c() {
        if (!(Build.VERSION.SDK_INT >= 24 ? ((UserManager) this.a.getSystemService(UserManager.class)).isUserUnlocked() : true)) {
            Context context = this.a;
            if (e.f696b.get() == null) {
                e eVar = new e(context);
                if (e.f696b.compareAndSet((Object) null, eVar)) {
                    context.registerReceiver(eVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                    return;
                }
                return;
            }
            return;
        }
        m mVar = this.d;
        boolean d2 = d();
        for (Map.Entry next : mVar.a.entrySet()) {
            i.c.d.f.d dVar = (i.c.d.f.d) next.getKey();
            t tVar = (t) next.getValue();
            boolean z = false;
            if (!(dVar.c == 1)) {
                if (dVar.c == 2) {
                    z = true;
                }
                if (z) {
                    if (!d2) {
                    }
                }
            }
            tVar.get();
        }
        mVar.d.a();
    }

    public boolean d() {
        a();
        return "[DEFAULT]".equals(this.f692b);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof FirebaseApp)) {
            return false;
        }
        String str = this.f692b;
        FirebaseApp firebaseApp = (FirebaseApp) obj;
        firebaseApp.a();
        return str.equals(firebaseApp.f692b);
    }

    public int hashCode() {
        return this.f692b.hashCode();
    }

    public boolean isDataCollectionDefaultEnabled() {
        a();
        return this.f694g.get().c.get();
    }

    public String toString() {
        q.a c2 = q.c((Object) this);
        c2.a(DefaultAppMeasurementEventListenerRegistrar.NAME, this.f692b);
        c2.a("options", this.c);
        return c2.toString();
    }

    @TargetApi(14)
    /* compiled from: com.google.firebase:firebase-common@@19.3.0 */
    public static class c implements c.a {
        public static AtomicReference<c> a = new AtomicReference<>();

        public void a(boolean z) {
            synchronized (FirebaseApp.f689i) {
                Iterator it = new ArrayList(FirebaseApp.f691k.values()).iterator();
                while (it.hasNext()) {
                    FirebaseApp firebaseApp = (FirebaseApp) it.next();
                    if (firebaseApp.e.get()) {
                        Log.d("FirebaseApp", "Notifying background state change listeners.");
                        for (b a2 : firebaseApp.f695h) {
                            a2.a(z);
                        }
                    }
                }
            }
        }

        public static /* synthetic */ void a(Context context) {
            if (context.getApplicationContext() instanceof Application) {
                Application application = (Application) context.getApplicationContext();
                if (a.get() == null) {
                    c cVar = new c();
                    if (a.compareAndSet((Object) null, cVar)) {
                        i.c.a.b.d.k.h.c.a(application);
                        i.c.a.b.d.k.h.c.f3035i.a((c.a) cVar);
                    }
                }
            }
        }
    }

    public static FirebaseApp a(Context context, i.c.d.c cVar, String str) {
        FirebaseApp firebaseApp;
        c.a(context);
        String trim = str.trim();
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f689i) {
            boolean z = !f691k.containsKey(trim);
            q.b(z, (Object) "FirebaseApp name " + trim + " already exists!");
            q.a(context, (Object) "Application context cannot be null.");
            firebaseApp = new FirebaseApp(context, trim, cVar);
            f691k.put(trim, firebaseApp);
        }
        firebaseApp.c();
        return firebaseApp;
    }

    public static /* synthetic */ i.c.d.n.a a(FirebaseApp firebaseApp, Context context) {
        return new i.c.d.n.a(context, firebaseApp.b(), (i.c.d.i.c) firebaseApp.d.a(i.c.d.i.c.class));
    }

    public final void a() {
        q.b(!this.f693f.get(), (Object) "FirebaseApp was deleted");
    }
}
