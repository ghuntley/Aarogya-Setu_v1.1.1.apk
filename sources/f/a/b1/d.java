package f.a.b1;

import f.a.a.i;

/* compiled from: Tasks.kt */
public class d extends i<h> {
    public d() {
        super(false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007e, code lost:
        r2 = r9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final f.a.b1.h a(f.a.b1.k r12) {
        /*
            r11 = this;
            r0 = 0
            if (r12 == 0) goto L_0x0091
        L_0x0003:
            java.lang.Object r1 = r11._cur$internal
            f.a.a.j r1 = (f.a.a.j) r1
        L_0x0007:
            long r4 = r1._state$internal
            r2 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r2 = r2 & r4
            r6 = 0
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x0016
            f.a.a.n r2 = f.a.a.j.f796g
            goto L_0x007f
        L_0x0016:
            f.a.a.j$a r2 = f.a.a.j.f797h
            r2 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r2 = r2 & r4
            r6 = 0
            long r2 = r2 >> r6
            int r8 = (int) r2
            r2 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r2 = r2 & r4
            r7 = 30
            long r2 = r2 >> r7
            int r3 = (int) r2
            int r2 = r1.a
            r3 = r3 & r2
            r7 = r8 & r2
            if (r3 != r7) goto L_0x0032
        L_0x0030:
            r2 = r0
            goto L_0x007f
        L_0x0032:
            java.util.concurrent.atomic.AtomicReferenceArray r3 = r1.f798b
            r2 = r2 & r8
            java.lang.Object r9 = r3.get(r2)
            if (r9 != 0) goto L_0x0040
            boolean r2 = r1.d
            if (r2 == 0) goto L_0x0007
            goto L_0x0030
        L_0x0040:
            boolean r2 = r9 instanceof f.a.a.j.b
            if (r2 == 0) goto L_0x0045
            goto L_0x0030
        L_0x0045:
            r2 = r9
            f.a.b1.h r2 = (f.a.b1.h) r2
            f.a.b1.k r2 = r2.d()
            if (r2 != r12) goto L_0x004f
            r6 = 1
        L_0x004f:
            if (r6 != 0) goto L_0x0052
            goto L_0x0030
        L_0x0052:
            int r2 = r8 + 1
            r3 = 1073741823(0x3fffffff, float:1.9999999)
            r10 = r2 & r3
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = f.a.a.j.f795f
            f.a.a.j$a r3 = f.a.a.j.f797h
            long r6 = r3.a(r4, r10)
            r3 = r1
            boolean r2 = r2.compareAndSet(r3, r4, r6)
            if (r2 == 0) goto L_0x0071
            java.util.concurrent.atomic.AtomicReferenceArray r2 = r1.f798b
            int r3 = r1.a
            r3 = r3 & r8
            r2.set(r3, r0)
            goto L_0x007e
        L_0x0071:
            boolean r2 = r1.d
            if (r2 != 0) goto L_0x0076
            goto L_0x0007
        L_0x0076:
            r2 = r1
        L_0x0077:
            f.a.a.j r2 = f.a.a.j.a(r2, r8, r10)
            if (r2 == 0) goto L_0x007e
            goto L_0x0077
        L_0x007e:
            r2 = r9
        L_0x007f:
            f.a.a.n r3 = f.a.a.j.f796g
            if (r2 == r3) goto L_0x0086
            f.a.b1.h r2 = (f.a.b1.h) r2
            return r2
        L_0x0086:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = f.a.a.i.a
            f.a.a.j r3 = r1.c()
            r2.compareAndSet(r11, r1, r3)
            goto L_0x0003
        L_0x0091:
            java.lang.String r12 = "mode"
            n.m.c.f.a((java.lang.String) r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f.a.b1.d.a(f.a.b1.k):f.a.b1.h");
    }
}
