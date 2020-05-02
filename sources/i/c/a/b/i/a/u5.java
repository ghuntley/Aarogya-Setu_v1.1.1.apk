package i.c.a.b.i.a;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class u5 implements Runnable {
    public final /* synthetic */ u6 e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ s5 f3906f;

    public u5(s5 s5Var, u6 u6Var) {
        this.f3906f = s5Var;
        this.e = u6Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x01ec, code lost:
        if (android.text.TextUtils.isEmpty(r1.f3730l) == false) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0349, code lost:
        if (android.text.TextUtils.isEmpty(r1.f3730l) == false) goto L_0x034b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r12 = this;
            i.c.a.b.i.a.s5 r0 = r12.f3906f
            i.c.a.b.i.a.u6 r1 = r12.e
            i.c.a.b.i.a.m5 r2 = r0.k()
            r2.c()
            i.c.a.b.i.a.g r2 = new i.c.a.b.i.a.g
            r2.<init>(r0)
            r2.p()
            r0.u = r2
            i.c.a.b.i.a.j4 r2 = new i.c.a.b.i.a.j4
            long r3 = r1.f3908f
            r2.<init>(r0, r3)
            r2.x()
            r0.v = r2
            i.c.a.b.i.a.i4 r1 = new i.c.a.b.i.a.i4
            r1.<init>(r0)
            r1.x()
            r0.s = r1
            i.c.a.b.i.a.z7 r1 = new i.c.a.b.i.a.z7
            r1.<init>(r0)
            r1.x()
            r0.t = r1
            i.c.a.b.i.a.ca r1 = r0.f3866l
            r1.q()
            i.c.a.b.i.a.x4 r1 = r0.f3862h
            r1.q()
            i.c.a.b.i.a.e5 r1 = new i.c.a.b.i.a.e5
            r1.<init>(r0)
            r0.w = r1
            i.c.a.b.i.a.j4 r1 = r0.v
            boolean r3 = r1.f3606b
            if (r3 != 0) goto L_0x03be
            r1.v()
            i.c.a.b.i.a.s5 r3 = r1.a
            java.util.concurrent.atomic.AtomicInteger r3 = r3.E
            r3.incrementAndGet()
            r3 = 1
            r1.f3606b = r3
            i.c.a.b.i.a.m4 r1 = r0.n()
            i.c.a.b.i.a.o4 r1 = r1.f3764l
            i.c.a.b.i.a.pa r4 = r0.f3861g
            r4.o()
            r4 = 25001(0x61a9, double:1.2352E-319)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.String r5 = "App measurement initialized, version"
            r1.a(r5, r4)
            i.c.a.b.i.a.m4 r1 = r0.n()
            i.c.a.b.i.a.o4 r1 = r1.f3764l
            java.lang.String r4 = "To enable debug logging run: adb shell setprop log.tag.FA VERBOSE"
            r1.a(r4)
            r2.w()
            java.lang.String r1 = r2.c
            java.lang.String r2 = r0.f3859b
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x00bc
            i.c.a.b.i.a.ca r2 = r0.p()
            boolean r2 = r2.d(r1)
            if (r2 == 0) goto L_0x009a
            i.c.a.b.i.a.m4 r1 = r0.n()
            i.c.a.b.i.a.o4 r1 = r1.f3764l
            java.lang.String r2 = "Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none."
            goto L_0x00b9
        L_0x009a:
            i.c.a.b.i.a.m4 r2 = r0.n()
            i.c.a.b.i.a.o4 r2 = r2.f3764l
            java.lang.String r4 = "To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app "
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r5 = r1.length()
            if (r5 == 0) goto L_0x00b1
            java.lang.String r1 = r4.concat(r1)
            goto L_0x00b6
        L_0x00b1:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r4)
        L_0x00b6:
            r11 = r2
            r2 = r1
            r1 = r11
        L_0x00b9:
            r1.a(r2)
        L_0x00bc:
            i.c.a.b.i.a.m4 r1 = r0.n()
            i.c.a.b.i.a.o4 r1 = r1.f3765m
            java.lang.String r2 = "Debug-level message logging enabled"
            r1.a(r2)
            int r1 = r0.D
            java.util.concurrent.atomic.AtomicInteger r2 = r0.E
            int r2 = r2.get()
            if (r1 == r2) goto L_0x00ec
            i.c.a.b.i.a.m4 r1 = r0.n()
            i.c.a.b.i.a.o4 r1 = r1.f3758f
            int r2 = r0.D
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.util.concurrent.atomic.AtomicInteger r4 = r0.E
            int r4 = r4.get()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r5 = "Not all components initialized"
            r1.a(r5, r2, r4)
        L_0x00ec:
            r0.x = r3
            i.c.a.b.i.a.s5 r0 = r12.f3906f
            i.c.a.b.i.a.m5 r1 = r0.k()
            r1.c()
            i.c.a.b.i.a.x4 r1 = r0.i()
            i.c.a.b.i.a.d5 r1 = r1.e
            long r1 = r1.a()
            r4 = 0
            r6 = 0
            int r7 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r7 != 0) goto L_0x011d
            i.c.a.b.i.a.x4 r1 = r0.i()
            i.c.a.b.i.a.d5 r1 = r1.e
            i.c.a.b.d.o.b r2 = r0.f3868n
            i.c.a.b.d.o.c r2 = (i.c.a.b.d.o.c) r2
            if (r2 == 0) goto L_0x011c
            long r7 = java.lang.System.currentTimeMillis()
            r1.a(r7)
            goto L_0x011d
        L_0x011c:
            throw r6
        L_0x011d:
            i.c.a.b.i.a.x4 r1 = r0.i()
            i.c.a.b.i.a.d5 r1 = r1.f3933j
            long r1 = r1.a()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            long r1 = r1.longValue()
            int r7 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r7 != 0) goto L_0x014f
            i.c.a.b.i.a.m4 r1 = r0.n()
            i.c.a.b.i.a.o4 r1 = r1.f3766n
            long r4 = r0.F
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            java.lang.String r4 = "Persisting first open"
            r1.a(r4, r2)
            i.c.a.b.i.a.x4 r1 = r0.i()
            i.c.a.b.i.a.d5 r1 = r1.f3933j
            long r4 = r0.F
            r1.a(r4)
        L_0x014f:
            boolean r1 = r0.e()
            if (r1 != 0) goto L_0x01d0
            boolean r1 = r0.b()
            if (r1 == 0) goto L_0x039b
            i.c.a.b.i.a.ca r1 = r0.p()
            java.lang.String r2 = "android.permission.INTERNET"
            boolean r1 = r1.c(r2)
            if (r1 != 0) goto L_0x0172
            i.c.a.b.i.a.m4 r1 = r0.n()
            i.c.a.b.i.a.o4 r1 = r1.f3758f
            java.lang.String r2 = "App is missing INTERNET permission"
            r1.a(r2)
        L_0x0172:
            i.c.a.b.i.a.ca r1 = r0.p()
            java.lang.String r2 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r1 = r1.c(r2)
            if (r1 != 0) goto L_0x0189
            i.c.a.b.i.a.m4 r1 = r0.n()
            i.c.a.b.i.a.o4 r1 = r1.f3758f
            java.lang.String r2 = "App is missing ACCESS_NETWORK_STATE permission"
            r1.a(r2)
        L_0x0189:
            android.content.Context r1 = r0.a
            i.c.a.b.d.p.b r1 = i.c.a.b.d.p.c.b(r1)
            boolean r1 = r1.a()
            if (r1 != 0) goto L_0x01c3
            i.c.a.b.i.a.pa r1 = r0.f3861g
            boolean r1 = r1.t()
            if (r1 != 0) goto L_0x01c3
            android.content.Context r1 = r0.a
            boolean r1 = i.c.a.b.i.a.j5.a(r1)
            if (r1 != 0) goto L_0x01b0
            i.c.a.b.i.a.m4 r1 = r0.n()
            i.c.a.b.i.a.o4 r1 = r1.f3758f
            java.lang.String r2 = "AppMeasurementReceiver not registered/enabled"
            r1.a(r2)
        L_0x01b0:
            android.content.Context r1 = r0.a
            boolean r1 = i.c.a.b.i.a.ca.a((android.content.Context) r1)
            if (r1 != 0) goto L_0x01c3
            i.c.a.b.i.a.m4 r1 = r0.n()
            i.c.a.b.i.a.o4 r1 = r1.f3758f
            java.lang.String r2 = "AppMeasurementService not registered/enabled"
            r1.a(r2)
        L_0x01c3:
            i.c.a.b.i.a.m4 r1 = r0.n()
            i.c.a.b.i.a.o4 r1 = r1.f3758f
            java.lang.String r2 = "Uploading is not possible. App measurement disabled"
            r1.a(r2)
            goto L_0x039b
        L_0x01d0:
            i.c.a.b.i.a.j4 r1 = r0.v()
            r1.w()
            java.lang.String r1 = r1.f3729k
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x01ee
            i.c.a.b.i.a.j4 r1 = r0.v()
            r1.w()
            java.lang.String r1 = r1.f3730l
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x02cc
        L_0x01ee:
            r0.p()
            i.c.a.b.i.a.j4 r1 = r0.v()
            r1.w()
            java.lang.String r1 = r1.f3729k
            i.c.a.b.i.a.x4 r2 = r0.i()
            r2.c()
            android.content.SharedPreferences r2 = r2.t()
            java.lang.String r4 = "gmp_app_id"
            java.lang.String r2 = r2.getString(r4, r6)
            i.c.a.b.i.a.j4 r5 = r0.v()
            r5.w()
            java.lang.String r5 = r5.f3730l
            i.c.a.b.i.a.x4 r7 = r0.i()
            r7.c()
            android.content.SharedPreferences r7 = r7.t()
            java.lang.String r8 = "admob_app_id"
            java.lang.String r7 = r7.getString(r8, r6)
            boolean r1 = i.c.a.b.i.a.ca.a((java.lang.String) r1, (java.lang.String) r2, (java.lang.String) r5, (java.lang.String) r7)
            if (r1 == 0) goto L_0x0290
            i.c.a.b.i.a.m4 r1 = r0.n()
            i.c.a.b.i.a.o4 r1 = r1.f3764l
            java.lang.String r2 = "Rechecking which service to use due to a GMP App Id change"
            r1.a(r2)
            i.c.a.b.i.a.x4 r1 = r0.i()
            r1.c()
            java.lang.Boolean r2 = r1.u()
            android.content.SharedPreferences r5 = r1.t()
            android.content.SharedPreferences$Editor r5 = r5.edit()
            r5.clear()
            r5.apply()
            if (r2 == 0) goto L_0x0268
            boolean r2 = r2.booleanValue()
            r1.c()
            android.content.SharedPreferences r1 = r1.t()
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r5 = "measurement_enabled"
            r1.putBoolean(r5, r2)
            r1.apply()
        L_0x0268:
            i.c.a.b.i.a.i4 r1 = r0.s
            i.c.a.b.i.a.s5.a((i.c.a.b.i.a.c3) r1)
            i.c.a.b.i.a.i4 r1 = r0.s
            r1.z()
            i.c.a.b.i.a.z7 r1 = r0.t
            r1.B()
            i.c.a.b.i.a.z7 r1 = r0.t
            r1.A()
            i.c.a.b.i.a.x4 r1 = r0.i()
            i.c.a.b.i.a.d5 r1 = r1.f3933j
            long r9 = r0.F
            r1.a(r9)
            i.c.a.b.i.a.x4 r1 = r0.i()
            i.c.a.b.i.a.f5 r1 = r1.f3935l
            r1.a(r6)
        L_0x0290:
            i.c.a.b.i.a.x4 r1 = r0.i()
            i.c.a.b.i.a.j4 r2 = r0.v()
            r2.w()
            java.lang.String r2 = r2.f3729k
            r1.c()
            android.content.SharedPreferences r1 = r1.t()
            android.content.SharedPreferences$Editor r1 = r1.edit()
            r1.putString(r4, r2)
            r1.apply()
            i.c.a.b.i.a.x4 r1 = r0.i()
            i.c.a.b.i.a.j4 r2 = r0.v()
            r2.w()
            java.lang.String r2 = r2.f3730l
            r1.c()
            android.content.SharedPreferences r1 = r1.t()
            android.content.SharedPreferences$Editor r1 = r1.edit()
            r1.putString(r8, r2)
            r1.apply()
        L_0x02cc:
            i.c.a.b.i.a.t6 r1 = r0.o()
            i.c.a.b.i.a.x4 r2 = r0.i()
            i.c.a.b.i.a.f5 r2 = r2.f3935l
            java.lang.String r2 = r2.a()
            java.util.concurrent.atomic.AtomicReference<java.lang.String> r1 = r1.f3881g
            r1.set(r2)
            boolean r1 = i.c.a.b.g.g.m8.b()
            r2 = 0
            if (r1 == 0) goto L_0x032d
            i.c.a.b.i.a.pa r1 = r0.f3861g
            i.c.a.b.i.a.f4<java.lang.Boolean> r4 = i.c.a.b.i.a.o.R0
            boolean r1 = r1.a((i.c.a.b.i.a.f4<java.lang.Boolean>) r4)
            if (r1 == 0) goto L_0x032d
            i.c.a.b.i.a.ca r1 = r0.p()
            if (r1 == 0) goto L_0x032c
            i.c.a.b.i.a.s5 r1 = r1.a     // Catch:{ ClassNotFoundException -> 0x0304 }
            android.content.Context r1 = r1.a     // Catch:{ ClassNotFoundException -> 0x0304 }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0304 }
            java.lang.String r4 = "com.google.firebase.remoteconfig.FirebaseRemoteConfig"
            r1.loadClass(r4)     // Catch:{ ClassNotFoundException -> 0x0304 }
            goto L_0x0305
        L_0x0304:
            r3 = 0
        L_0x0305:
            if (r3 != 0) goto L_0x032d
            i.c.a.b.i.a.x4 r1 = r0.i()
            i.c.a.b.i.a.f5 r1 = r1.B
            java.lang.String r1 = r1.a()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x032d
            i.c.a.b.i.a.m4 r1 = r0.n()
            i.c.a.b.i.a.o4 r1 = r1.f3761i
            java.lang.String r3 = "Remote config removed with active feature rollouts"
            r1.a(r3)
            i.c.a.b.i.a.x4 r1 = r0.i()
            i.c.a.b.i.a.f5 r1 = r1.B
            r1.a(r6)
            goto L_0x032d
        L_0x032c:
            throw r6
        L_0x032d:
            i.c.a.b.i.a.j4 r1 = r0.v()
            r1.w()
            java.lang.String r1 = r1.f3729k
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x034b
            i.c.a.b.i.a.j4 r1 = r0.v()
            r1.w()
            java.lang.String r1 = r1.f3730l
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x039b
        L_0x034b:
            boolean r1 = r0.b()
            i.c.a.b.i.a.x4 r3 = r0.i()
            android.content.SharedPreferences r3 = r3.c
            java.lang.String r4 = "deferred_analytics_collection"
            boolean r3 = r3.contains(r4)
            if (r3 != 0) goto L_0x036e
            i.c.a.b.i.a.pa r3 = r0.f3861g
            boolean r3 = r3.q()
            if (r3 != 0) goto L_0x036e
            i.c.a.b.i.a.x4 r3 = r0.i()
            r4 = r1 ^ 1
            r3.a((boolean) r4)
        L_0x036e:
            if (r1 == 0) goto L_0x0377
            i.c.a.b.i.a.t6 r1 = r0.o()
            r1.A()
        L_0x0377:
            i.c.a.b.i.a.g9 r1 = r0.m()
            i.c.a.b.i.a.o9 r1 = r1.d
            r1.a()
            i.c.a.b.i.a.z7 r1 = r0.t()
            java.util.concurrent.atomic.AtomicReference r3 = new java.util.concurrent.atomic.AtomicReference
            r3.<init>()
            r1.c()
            r1.w()
            i.c.a.b.i.a.ea r2 = r1.a((boolean) r2)
            i.c.a.b.i.a.h8 r4 = new i.c.a.b.i.a.h8
            r4.<init>(r1, r3, r2)
            r1.a((java.lang.Runnable) r4)
        L_0x039b:
            i.c.a.b.i.a.x4 r1 = r0.i()
            i.c.a.b.i.a.z4 r1 = r1.t
            i.c.a.b.i.a.pa r2 = r0.f3861g
            i.c.a.b.i.a.f4<java.lang.Boolean> r3 = i.c.a.b.i.a.o.j0
            boolean r2 = r2.a((i.c.a.b.i.a.f4<java.lang.Boolean>) r3)
            r1.a(r2)
            i.c.a.b.i.a.x4 r1 = r0.i()
            i.c.a.b.i.a.z4 r1 = r1.u
            i.c.a.b.i.a.pa r0 = r0.f3861g
            i.c.a.b.i.a.f4<java.lang.Boolean> r2 = i.c.a.b.i.a.o.k0
            boolean r0 = r0.a((i.c.a.b.i.a.f4<java.lang.Boolean>) r2)
            r1.a(r0)
            return
        L_0x03be:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Can't initialize twice"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.a.b.i.a.u5.run():void");
    }
}
