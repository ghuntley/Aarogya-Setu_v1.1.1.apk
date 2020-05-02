package f.a.a;

import f.a.x;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import n.m.c.e;
import n.m.c.f;

/* compiled from: LockFreeTaskQueue.kt */
public final class j<E> {
    public static final AtomicReferenceFieldUpdater e;

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f795f;

    /* renamed from: g  reason: collision with root package name */
    public static final n f796g = new n("REMOVE_FROZEN");

    /* renamed from: h  reason: collision with root package name */
    public static final a f797h = new a((e) null);
    public volatile Object _next = null;
    public volatile /* synthetic */ long _state$internal = 0;
    public final int a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ AtomicReferenceArray f798b = new AtomicReferenceArray(this.c);
    public final int c;
    public final boolean d;

    /* compiled from: LockFreeTaskQueue.kt */
    public static final class a {
        public /* synthetic */ a(e eVar) {
        }

        public final long a(long j2, int i2) {
            return (j2 & -1073741824) | (((long) i2) << 0);
        }
    }

    /* compiled from: LockFreeTaskQueue.kt */
    public static final class b {
        public final int a;

        public b(int i2) {
            this.a = i2;
        }
    }

    static {
        Class<j> cls = j.class;
        e = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "_next");
        f795f = AtomicLongFieldUpdater.newUpdater(cls, "_state$internal");
    }

    public j(int i2, boolean z) {
        this.c = i2;
        this.d = z;
        boolean z2 = true;
        this.a = i2 - 1;
        if (this.a <= 1073741823) {
            if (!((this.c & this.a) != 0 ? false : z2)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final boolean a() {
        long j2;
        do {
            j2 = this._state$internal;
            if ((j2 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j2) != 0) {
                return false;
            }
        } while (!f795f.compareAndSet(this, j2, j2 | 2305843009213693952L));
        return true;
    }

    public final boolean b() {
        long j2 = this._state$internal;
        return ((int) ((1073741823 & j2) >> 0)) == ((int) ((j2 & 1152921503533105152L) >> 30));
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final f.a.a.j<E> c() {
        /*
            r10 = this;
        L_0x0000:
            long r2 = r10._state$internal
            r0 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r4 = r2 & r0
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x000d
            goto L_0x001a
        L_0x000d:
            long r6 = r2 | r0
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = f795f
            r1 = r10
            r4 = r6
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L_0x0000
            r2 = r6
        L_0x001a:
            java.lang.Object r0 = r10._next
            f.a.a.j r0 = (f.a.a.j) r0
            if (r0 == 0) goto L_0x0021
            return r0
        L_0x0021:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = e
            r1 = 0
            f.a.a.j r4 = new f.a.a.j
            int r5 = r10.c
            int r5 = r5 * 2
            boolean r6 = r10.d
            r4.<init>(r5, r6)
            r5 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r5 = r5 & r2
            r7 = 0
            long r5 = r5 >> r7
            int r6 = (int) r5
            r7 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r7 = r7 & r2
            r5 = 30
            long r7 = r7 >> r5
            int r5 = (int) r7
        L_0x0040:
            int r7 = r10.a
            r8 = r6 & r7
            r7 = r7 & r5
            if (r8 == r7) goto L_0x0060
            java.util.concurrent.atomic.AtomicReferenceArray r7 = r10.f798b
            java.lang.Object r7 = r7.get(r8)
            if (r7 == 0) goto L_0x0050
            goto L_0x0055
        L_0x0050:
            f.a.a.j$b r7 = new f.a.a.j$b
            r7.<init>(r6)
        L_0x0055:
            java.util.concurrent.atomic.AtomicReferenceArray r8 = r4.f798b
            int r9 = r4.a
            r9 = r9 & r6
            r8.set(r9, r7)
            int r6 = r6 + 1
            goto L_0x0040
        L_0x0060:
            r5 = -1152921504606846977(0xefffffffffffffff, double:-3.1050361846014175E231)
            long r5 = r5 & r2
            r4._state$internal = r5
            r0.compareAndSet(r10, r1, r4)
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: f.a.a.j.c():f.a.a.j");
    }

    public final int a(E e2) {
        E e3 = e2;
        if (e3 != null) {
            while (true) {
                long j2 = this._state$internal;
                if ((3458764513820540928L & j2) != 0) {
                    return (2305843009213693952L & j2) != 0 ? 2 : 1;
                }
                int i2 = (int) ((1073741823 & j2) >> 0);
                int i3 = (int) ((1152921503533105152L & j2) >> 30);
                int i4 = this.a;
                if (((i3 + 2) & i4) == (i2 & i4)) {
                    return 1;
                }
                if (this.d || this.f798b.get(i3 & i4) == null) {
                    if (f795f.compareAndSet(this, j2, (-1152921503533105153L & j2) | (((long) ((i3 + 1) & 1073741823)) << 30))) {
                        this.f798b.set(i3 & i4, e3);
                        j jVar = this;
                        while ((jVar._state$internal & 1152921504606846976L) != 0) {
                            jVar = jVar.c();
                            Object obj = jVar.f798b.get(jVar.a & i3);
                            if (!(obj instanceof b) || ((b) obj).a != i3) {
                                jVar = null;
                                continue;
                            } else {
                                jVar.f798b.set(jVar.a & i3, e3);
                                continue;
                            }
                            if (jVar == null) {
                                break;
                            }
                        }
                        return 0;
                    }
                } else {
                    int i5 = this.c;
                    if (i5 < 1024 || ((i3 - i2) & 1073741823) > (i5 >> 1)) {
                        return 1;
                    }
                }
            }
            return 1;
        }
        f.a("element");
        throw null;
    }

    public static final /* synthetic */ j a(j jVar, int i2, int i3) {
        long j2;
        int i4;
        do {
            j2 = jVar._state$internal;
            boolean z = false;
            i4 = (int) ((1073741823 & j2) >> 0);
            if (x.a) {
                if (i4 == i2) {
                    z = true;
                }
                if (!z) {
                    throw new AssertionError();
                }
            }
            if ((1152921504606846976L & j2) != 0) {
                return jVar.c();
            }
        } while (!f795f.compareAndSet(jVar, j2, f797h.a(j2, i3)));
        jVar.f798b.set(jVar.a & i4, (Object) null);
        return null;
    }
}
