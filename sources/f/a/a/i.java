package f.a.a;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import n.m.c.f;

/* compiled from: LockFreeTaskQueue.kt */
public class i<E> {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "_cur$internal");
    public volatile /* synthetic */ Object _cur$internal;

    public i(boolean z) {
        this._cur$internal = new j(8, z);
    }

    public final boolean a(E e) {
        if (e != null) {
            while (true) {
                j jVar = (j) this._cur$internal;
                int a2 = jVar.a(e);
                if (a2 == 0) {
                    return true;
                }
                if (a2 == 1) {
                    a.compareAndSet(this, jVar, jVar.c());
                } else if (a2 == 2) {
                    return false;
                }
            }
        } else {
            f.a("element");
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006d, code lost:
        r7 = r9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final E a() {
        /*
            r11 = this;
        L_0x0000:
            java.lang.Object r0 = r11._cur$internal
            f.a.a.j r0 = (f.a.a.j) r0
        L_0x0004:
            long r3 = r0._state$internal
            r1 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            r5 = 0
            r7 = 0
            int r8 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r8 == 0) goto L_0x0013
            f.a.a.n r7 = f.a.a.j.f796g
            goto L_0x006e
        L_0x0013:
            f.a.a.j$a r1 = f.a.a.j.f797h
            r1 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r1 = r1 & r3
            r5 = 0
            long r1 = r1 >> r5
            int r8 = (int) r1
            r1 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r1 = r1 & r3
            r5 = 30
            long r1 = r1 >> r5
            int r2 = (int) r1
            int r1 = r0.a
            r2 = r2 & r1
            r5 = r8 & r1
            if (r2 != r5) goto L_0x002e
            goto L_0x006e
        L_0x002e:
            java.util.concurrent.atomic.AtomicReferenceArray r2 = r0.f798b
            r1 = r1 & r8
            java.lang.Object r9 = r2.get(r1)
            if (r9 != 0) goto L_0x003c
            boolean r1 = r0.d
            if (r1 == 0) goto L_0x0004
            goto L_0x006e
        L_0x003c:
            boolean r1 = r9 instanceof f.a.a.j.b
            if (r1 == 0) goto L_0x0041
            goto L_0x006e
        L_0x0041:
            int r1 = r8 + 1
            r2 = 1073741823(0x3fffffff, float:1.9999999)
            r10 = r1 & r2
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = f.a.a.j.f795f
            f.a.a.j$a r2 = f.a.a.j.f797h
            long r5 = r2.a(r3, r10)
            r2 = r0
            boolean r1 = r1.compareAndSet(r2, r3, r5)
            if (r1 == 0) goto L_0x0060
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r0.f798b
            int r2 = r0.a
            r2 = r2 & r8
            r1.set(r2, r7)
            goto L_0x006d
        L_0x0060:
            boolean r1 = r0.d
            if (r1 != 0) goto L_0x0065
            goto L_0x0004
        L_0x0065:
            r1 = r0
        L_0x0066:
            f.a.a.j r1 = f.a.a.j.a(r1, r8, r10)
            if (r1 == 0) goto L_0x006d
            goto L_0x0066
        L_0x006d:
            r7 = r9
        L_0x006e:
            f.a.a.n r1 = f.a.a.j.f796g
            if (r7 == r1) goto L_0x0073
            return r7
        L_0x0073:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = a
            f.a.a.j r2 = r0.c()
            r1.compareAndSet(r11, r0, r2)
            goto L_0x0000
        */
        throw new UnsupportedOperationException("Method not decompiled: f.a.a.i.a():java.lang.Object");
    }
}
