package i.c.a.b.i.a;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class x7 implements Runnable {
    public final /* synthetic */ boolean e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ long f3948f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ w7 f3949g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ w7 f3950h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ y7 f3951i;

    public x7(y7 y7Var, boolean z, long j2, w7 w7Var, w7 w7Var2) {
        this.f3951i = y7Var;
        this.e = z;
        this.f3948f = j2;
        this.f3949g = w7Var;
        this.f3950h = w7Var2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005d, code lost:
        if (i.c.a.b.i.a.ca.c(r10.f3949g.a, r10.f3950h.a) != false) goto L_0x0060;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            i.c.a.b.i.a.y7 r0 = r10.f3951i
            i.c.a.b.i.a.s5 r0 = r0.a
            i.c.a.b.i.a.pa r0 = r0.f3861g
            i.c.a.b.i.a.f4<java.lang.Boolean> r1 = i.c.a.b.i.a.o.c0
            boolean r0 = r0.a((i.c.a.b.i.a.f4<java.lang.Boolean>) r1)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0029
            boolean r0 = r10.e
            if (r0 == 0) goto L_0x001c
            i.c.a.b.i.a.y7 r0 = r10.f3951i
            i.c.a.b.i.a.w7 r0 = r0.c
            if (r0 == 0) goto L_0x001c
            r0 = 1
            goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            if (r0 == 0) goto L_0x0039
            i.c.a.b.i.a.y7 r3 = r10.f3951i
            i.c.a.b.i.a.w7 r4 = r3.c
            long r5 = r10.f3948f
            i.c.a.b.i.a.y7.a(r3, r4, r1, r5)
            goto L_0x0039
        L_0x0029:
            boolean r0 = r10.e
            if (r0 == 0) goto L_0x0038
            i.c.a.b.i.a.y7 r0 = r10.f3951i
            i.c.a.b.i.a.w7 r3 = r0.c
            if (r3 == 0) goto L_0x0038
            long r4 = r10.f3948f
            i.c.a.b.i.a.y7.a(r0, r3, r1, r4)
        L_0x0038:
            r0 = 0
        L_0x0039:
            i.c.a.b.i.a.w7 r3 = r10.f3949g
            if (r3 == 0) goto L_0x005f
            long r4 = r3.c
            i.c.a.b.i.a.w7 r6 = r10.f3950h
            long r7 = r6.c
            int r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r9 != 0) goto L_0x005f
            java.lang.String r3 = r3.f3927b
            java.lang.String r4 = r6.f3927b
            boolean r3 = i.c.a.b.i.a.ca.c((java.lang.String) r3, (java.lang.String) r4)
            if (r3 == 0) goto L_0x005f
            i.c.a.b.i.a.w7 r3 = r10.f3949g
            java.lang.String r3 = r3.a
            i.c.a.b.i.a.w7 r4 = r10.f3950h
            java.lang.String r4 = r4.a
            boolean r3 = i.c.a.b.i.a.ca.c((java.lang.String) r3, (java.lang.String) r4)
            if (r3 != 0) goto L_0x0060
        L_0x005f:
            r2 = 1
        L_0x0060:
            if (r2 == 0) goto L_0x00d8
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>()
            i.c.a.b.i.a.w7 r2 = r10.f3950h
            i.c.a.b.i.a.y7.a((i.c.a.b.i.a.w7) r2, (android.os.Bundle) r8, (boolean) r1)
            i.c.a.b.i.a.w7 r1 = r10.f3949g
            if (r1 == 0) goto L_0x008b
            java.lang.String r1 = r1.a
            if (r1 == 0) goto L_0x0079
            java.lang.String r2 = "_pn"
            r8.putString(r2, r1)
        L_0x0079:
            i.c.a.b.i.a.w7 r1 = r10.f3949g
            java.lang.String r1 = r1.f3927b
            java.lang.String r2 = "_pc"
            r8.putString(r2, r1)
            i.c.a.b.i.a.w7 r1 = r10.f3949g
            long r1 = r1.c
            java.lang.String r3 = "_pi"
            r8.putLong(r3, r1)
        L_0x008b:
            i.c.a.b.i.a.y7 r1 = r10.f3951i
            i.c.a.b.i.a.s5 r1 = r1.a
            i.c.a.b.i.a.pa r1 = r1.f3861g
            i.c.a.b.i.a.f4<java.lang.Boolean> r2 = i.c.a.b.i.a.o.c0
            boolean r1 = r1.a((i.c.a.b.i.a.f4<java.lang.Boolean>) r2)
            if (r1 == 0) goto L_0x00b6
            if (r0 == 0) goto L_0x00b6
            i.c.a.b.i.a.y7 r0 = r10.f3951i
            i.c.a.b.i.a.g9 r0 = r0.u()
            i.c.a.b.i.a.m9 r0 = r0.e
            long r0 = r0.a()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x00b6
            i.c.a.b.i.a.y7 r2 = r10.f3951i
            i.c.a.b.i.a.ca r2 = r2.f()
            r2.a((android.os.Bundle) r8, (long) r0)
        L_0x00b6:
            i.c.a.b.i.a.y7 r0 = r10.f3951i
            i.c.a.b.i.a.t6 r3 = r0.p()
            r3.a()
            r3.c()
            i.c.a.b.i.a.s5 r0 = r3.a
            i.c.a.b.d.o.b r0 = r0.f3868n
            i.c.a.b.d.o.c r0 = (i.c.a.b.d.o.c) r0
            if (r0 == 0) goto L_0x00d6
            long r6 = java.lang.System.currentTimeMillis()
            java.lang.String r4 = "auto"
            java.lang.String r5 = "_vs"
            r3.a((java.lang.String) r4, (java.lang.String) r5, (long) r6, (android.os.Bundle) r8)
            goto L_0x00d8
        L_0x00d6:
            r0 = 0
            throw r0
        L_0x00d8:
            i.c.a.b.i.a.y7 r0 = r10.f3951i
            i.c.a.b.i.a.w7 r1 = r10.f3950h
            r0.c = r1
            i.c.a.b.i.a.z7 r0 = r0.r()
            i.c.a.b.i.a.w7 r1 = r10.f3950h
            r0.c()
            r0.w()
            i.c.a.b.i.a.i8 r2 = new i.c.a.b.i.a.i8
            r2.<init>(r0, r1)
            r0.a((java.lang.Runnable) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.a.b.i.a.x7.run():void");
    }
}
