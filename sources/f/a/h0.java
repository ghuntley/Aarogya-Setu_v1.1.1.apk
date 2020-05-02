package f.a;

/* compiled from: EventLoop.kt */
public abstract class h0 extends f0 {
    /* JADX WARNING: type inference failed for: r7v5, types: [f.a.a.q] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(long r7, f.a.g0.a r9) {
        /*
            r6 = this;
            r0 = 0
            if (r9 == 0) goto L_0x0078
            boolean r1 = f.a.x.a
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0019
            f.a.y r1 = f.a.y.f867k
            if (r6 == r1) goto L_0x000f
            r1 = 1
            goto L_0x0010
        L_0x000f:
            r1 = 0
        L_0x0010:
            if (r1 == 0) goto L_0x0013
            goto L_0x0019
        L_0x0013:
            java.lang.AssertionError r7 = new java.lang.AssertionError
            r7.<init>()
            throw r7
        L_0x0019:
            f.a.y r1 = f.a.y.f867k
            boolean r4 = r1.isCompleted
            if (r4 == 0) goto L_0x0021
            r4 = 1
            goto L_0x003c
        L_0x0021:
            java.lang.Object r4 = r1._delayed
            f.a.g0$b r4 = (f.a.g0.b) r4
            if (r4 == 0) goto L_0x0028
            goto L_0x0038
        L_0x0028:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = f.a.g0.f851i
            f.a.g0$b r5 = new f.a.g0$b
            r5.<init>(r7)
            r4.compareAndSet(r1, r0, r5)
            java.lang.Object r4 = r1._delayed
            if (r4 == 0) goto L_0x0074
            f.a.g0$b r4 = (f.a.g0.b) r4
        L_0x0038:
            int r4 = r9.a(r7, r4, r1)
        L_0x003c:
            if (r4 == 0) goto L_0x0054
            if (r4 == r3) goto L_0x0050
            r7 = 2
            if (r4 != r7) goto L_0x0044
            goto L_0x0073
        L_0x0044:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "unexpected result"
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L_0x0050:
            r1.a(r7, r9)
            goto L_0x0073
        L_0x0054:
            java.lang.Object r7 = r1._delayed
            f.a.g0$b r7 = (f.a.g0.b) r7
            if (r7 == 0) goto L_0x0061
            f.a.a.q r7 = r7.b()
            r0 = r7
            f.a.g0$a r0 = (f.a.g0.a) r0
        L_0x0061:
            if (r0 != r9) goto L_0x0064
            r2 = 1
        L_0x0064:
            if (r2 == 0) goto L_0x0073
            java.lang.Thread r7 = r1.q()
            java.lang.Thread r8 = java.lang.Thread.currentThread()
            if (r8 == r7) goto L_0x0073
            java.util.concurrent.locks.LockSupport.unpark(r7)
        L_0x0073:
            return
        L_0x0074:
            n.m.c.f.a()
            throw r0
        L_0x0078:
            java.lang.String r7 = "delayedTask"
            n.m.c.f.a((java.lang.String) r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f.a.h0.a(long, f.a.g0$a):void");
    }

    public abstract Thread q();
}
