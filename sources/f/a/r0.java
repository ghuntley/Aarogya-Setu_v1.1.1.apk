package f.a;

import f.a.p0;
import n.m.c.f;

/* compiled from: JobSupport.kt */
public abstract class r0<J extends p0> extends p implements d0, l0 {

    /* renamed from: h  reason: collision with root package name */
    public final J f863h;

    public r0(J j2) {
        if (j2 != null) {
            this.f863h = j2;
        } else {
            f.a("job");
            throw null;
        }
    }

    public boolean a() {
        return true;
    }

    public u0 b() {
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x001f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x000f A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void f() {
        /*
            r9 = this;
            J r0 = r9.f863h
            if (r0 == 0) goto L_0x00cc
            f.a.s0 r0 = (f.a.s0) r0
            r1 = 0
        L_0x0007:
            java.lang.Object r2 = r0.b()
            boolean r3 = r2 instanceof f.a.r0
            if (r3 == 0) goto L_0x001f
            if (r2 == r9) goto L_0x0013
            goto L_0x00cb
        L_0x0013:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = f.a.s0.e
            f.a.e0 r4 = f.a.t0.a
            boolean r2 = r3.compareAndSet(r0, r2, r4)
            if (r2 == 0) goto L_0x0007
            goto L_0x00cb
        L_0x001f:
            boolean r0 = r2 instanceof f.a.l0
            if (r0 == 0) goto L_0x00cb
            f.a.l0 r2 = (f.a.l0) r2
            f.a.u0 r0 = r2.b()
            if (r0 == 0) goto L_0x00cb
        L_0x002b:
            java.lang.Object r0 = r9.d()
            boolean r2 = r0 instanceof f.a.a.l
            if (r2 == 0) goto L_0x0035
            goto L_0x00cb
        L_0x0035:
            if (r0 != r9) goto L_0x0039
            goto L_0x00cb
        L_0x0039:
            java.lang.String r2 = "null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */"
            if (r0 == 0) goto L_0x00c5
            r3 = r0
            f.a.a.h r3 = (f.a.a.h) r3
            java.lang.Object r4 = r3._removedRef
            f.a.a.l r4 = (f.a.a.l) r4
            if (r4 == 0) goto L_0x0047
            goto L_0x0051
        L_0x0047:
            f.a.a.l r4 = new f.a.a.l
            r4.<init>(r3)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = f.a.a.h.f793g
            r5.lazySet(r3, r4)
        L_0x0051:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = f.a.a.h.e
            boolean r0 = r5.compareAndSet(r9, r0, r4)
            if (r0 == 0) goto L_0x002b
            f.a.a.h r0 = r9.g()
            java.lang.Object r4 = r9._next
            if (r4 == 0) goto L_0x00bd
            f.a.a.l r4 = (f.a.a.l) r4
            f.a.a.h r4 = r4.a
        L_0x0065:
            r5 = r4
            r4 = r1
        L_0x0067:
            java.lang.Object r6 = r5.d()
            boolean r7 = r6 instanceof f.a.a.l
            if (r7 == 0) goto L_0x0077
            r5.g()
            f.a.a.l r6 = (f.a.a.l) r6
            f.a.a.h r5 = r6.a
            goto L_0x0067
        L_0x0077:
            java.lang.Object r6 = r0.d()
            boolean r7 = r6 instanceof f.a.a.l
            if (r7 == 0) goto L_0x0097
            if (r4 == 0) goto L_0x0090
            r0.g()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = f.a.a.h.e
            f.a.a.l r6 = (f.a.a.l) r6
            f.a.a.h r6 = r6.a
            r7.compareAndSet(r4, r0, r6)
            r0 = r4
            r4 = r5
            goto L_0x0065
        L_0x0090:
            java.lang.Object r0 = r0._prev
            f.a.a.h r0 = f.a.a.g.a(r0)
            goto L_0x0067
        L_0x0097:
            if (r6 == r9) goto L_0x00ab
            if (r6 == 0) goto L_0x00a5
            r4 = r6
            f.a.a.h r4 = (f.a.a.h) r4
            if (r4 != r5) goto L_0x00a1
            goto L_0x00b3
        L_0x00a1:
            r8 = r4
            r4 = r0
            r0 = r8
            goto L_0x0067
        L_0x00a5:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            r0.<init>(r2)
            throw r0
        L_0x00ab:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = f.a.a.h.e
            boolean r6 = r6.compareAndSet(r0, r9, r5)
            if (r6 == 0) goto L_0x0067
        L_0x00b3:
            java.lang.Object r0 = r9._prev
            f.a.a.h r0 = f.a.a.g.a(r0)
            r3.a(r0, r1)
            goto L_0x00cb
        L_0x00bd:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type kotlinx.coroutines.internal.Removed"
            r0.<init>(r1)
            throw r0
        L_0x00c5:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            r0.<init>(r2)
            throw r0
        L_0x00cb:
            return
        L_0x00cc:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type kotlinx.coroutines.JobSupport"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f.a.r0.f():void");
    }
}
