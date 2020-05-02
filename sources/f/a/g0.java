package f.a;

import f.a.a.c;
import f.a.a.j;
import f.a.a.p;
import f.a.a.q;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import n.k.e;
import n.m.c.f;

/* compiled from: EventLoop.common.kt */
public abstract class g0 extends h0 {

    /* renamed from: h  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f850h;

    /* renamed from: i  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f851i;
    public volatile Object _delayed = null;
    public volatile Object _queue = null;
    public volatile boolean isCompleted;

    /* compiled from: EventLoop.common.kt */
    public static final class b extends p<a> {

        /* renamed from: b  reason: collision with root package name */
        public long f854b;

        public b(long j2) {
            this.f854b = j2;
        }
    }

    static {
        Class<Object> cls = Object.class;
        Class<g0> cls2 = g0.class;
        f850h = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_queue");
        f851i = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_delayed");
    }

    public final void a(e eVar, Runnable runnable) {
        if (eVar == null) {
            f.a("context");
            throw null;
        } else if (runnable != null) {
            a(runnable);
        } else {
            f.a("block");
            throw null;
        }
    }

    public final boolean b(Runnable runnable) {
        while (true) {
            Object obj = this._queue;
            if (this.isCompleted) {
                return false;
            }
            if (obj == null) {
                if (f850h.compareAndSet(this, (Object) null, runnable)) {
                    return true;
                }
            } else if (obj instanceof j) {
                j jVar = (j) obj;
                int a2 = jVar.a(runnable);
                if (a2 == 0) {
                    return true;
                }
                if (a2 == 1) {
                    f850h.compareAndSet(this, obj, jVar.c());
                } else if (a2 == 2) {
                    return false;
                }
            } else if (obj == i0.f856b) {
                return false;
            } else {
                j jVar2 = new j(8, true);
                jVar2.a((Runnable) obj);
                jVar2.a(runnable);
                if (f850h.compareAndSet(this, obj, jVar2)) {
                    return true;
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x001e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long s() {
        /*
            r7 = this;
            f.a.a.c<f.a.b0<?>> r0 = r7.f849g
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r3 = 0
            if (r0 == 0) goto L_0x0019
            int r5 = r0.f791b
            int r0 = r0.c
            if (r5 != r0) goto L_0x0013
            r0 = 1
            goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            if (r0 == 0) goto L_0x0017
            goto L_0x0019
        L_0x0017:
            r5 = r3
            goto L_0x001a
        L_0x0019:
            r5 = r1
        L_0x001a:
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x001f
            return r3
        L_0x001f:
            java.lang.Object r0 = r7._queue
            if (r0 != 0) goto L_0x0024
            goto L_0x0031
        L_0x0024:
            boolean r5 = r0 instanceof f.a.a.j
            if (r5 == 0) goto L_0x004e
            f.a.a.j r0 = (f.a.a.j) r0
            boolean r0 = r0.b()
            if (r0 != 0) goto L_0x0031
            return r3
        L_0x0031:
            java.lang.Object r0 = r7._delayed
            f.a.g0$b r0 = (f.a.g0.b) r0
            if (r0 == 0) goto L_0x004d
            f.a.a.q r0 = r0.b()
            f.a.g0$a r0 = (f.a.g0.a) r0
            if (r0 == 0) goto L_0x004d
            long r0 = r0.f853g
            long r5 = java.lang.System.nanoTime()
            long r0 = r0 - r5
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 >= 0) goto L_0x004b
            goto L_0x004c
        L_0x004b:
            r3 = r0
        L_0x004c:
            return r3
        L_0x004d:
            return r1
        L_0x004e:
            f.a.a.n r5 = f.a.i0.f856b
            if (r0 != r5) goto L_0x0053
            return r1
        L_0x0053:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: f.a.g0.s():long");
    }

    public boolean t() {
        c<b0<?>> cVar = this.f849g;
        if (!(cVar == null || cVar.f791b == cVar.c)) {
            return false;
        }
        b bVar = (b) this._delayed;
        if (bVar != null) {
            if (!(bVar._size == 0)) {
                return false;
            }
        }
        Object obj = this._queue;
        if (obj == null) {
            return true;
        }
        if (obj instanceof j) {
            return ((j) obj).b();
        }
        if (obj == i0.f856b) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x008c, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00ba, code lost:
        r4 = r11;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long u() {
        /*
            r13 = this;
            boolean r0 = r13.o()
            if (r0 == 0) goto L_0x000b
            long r0 = r13.s()
            return r0
        L_0x000b:
            java.lang.Object r0 = r13._delayed
            f.a.g0$b r0 = (f.a.g0.b) r0
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L_0x0049
            int r3 = r0._size
            if (r3 != 0) goto L_0x0019
            r3 = 1
            goto L_0x001a
        L_0x0019:
            r3 = 0
        L_0x001a:
            if (r3 != 0) goto L_0x0049
            long r3 = java.lang.System.nanoTime()
        L_0x0020:
            monitor-enter(r0)
            f.a.a.q r5 = r0.a()     // Catch:{ all -> 0x0046 }
            if (r5 == 0) goto L_0x003f
            f.a.g0$a r5 = (f.a.g0.a) r5     // Catch:{ all -> 0x0046 }
            boolean r6 = r5.a((long) r3)     // Catch:{ all -> 0x0046 }
            if (r6 == 0) goto L_0x0034
            boolean r5 = r13.b(r5)     // Catch:{ all -> 0x0046 }
            goto L_0x0035
        L_0x0034:
            r5 = 0
        L_0x0035:
            if (r5 == 0) goto L_0x003c
            f.a.a.q r5 = r0.a((int) r2)     // Catch:{ all -> 0x0046 }
            goto L_0x003d
        L_0x003c:
            r5 = r1
        L_0x003d:
            monitor-exit(r0)
            goto L_0x0041
        L_0x003f:
            monitor-exit(r0)
            r5 = r1
        L_0x0041:
            f.a.g0$a r5 = (f.a.g0.a) r5
            if (r5 == 0) goto L_0x0049
            goto L_0x0020
        L_0x0046:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x0049:
            java.lang.Object r0 = r13._queue
            if (r0 != 0) goto L_0x004f
            goto L_0x00de
        L_0x004f:
            boolean r3 = r0 instanceof f.a.a.j
            if (r3 == 0) goto L_0x00ce
            r3 = r0
            f.a.a.j r3 = (f.a.a.j) r3
        L_0x0056:
            long r6 = r3._state$internal
            r4 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r4 = r4 & r6
            r8 = 0
            int r10 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r10 == 0) goto L_0x0064
            f.a.a.n r4 = f.a.a.j.f796g
            goto L_0x00bb
        L_0x0064:
            r4 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r4 = r4 & r6
            long r4 = r4 >> r2
            int r10 = (int) r4
            r4 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r4 = r4 & r6
            r8 = 30
            long r4 = r4 >> r8
            int r5 = (int) r4
            int r4 = r3.a
            r5 = r5 & r4
            r4 = r4 & r10
            if (r5 != r4) goto L_0x007b
            goto L_0x008c
        L_0x007b:
            java.util.concurrent.atomic.AtomicReferenceArray r5 = r3.f798b
            java.lang.Object r11 = r5.get(r4)
            if (r11 != 0) goto L_0x0088
            boolean r4 = r3.d
            if (r4 == 0) goto L_0x0056
            goto L_0x008c
        L_0x0088:
            boolean r4 = r11 instanceof f.a.a.j.b
            if (r4 == 0) goto L_0x008e
        L_0x008c:
            r4 = r1
            goto L_0x00bb
        L_0x008e:
            int r4 = r10 + 1
            r5 = 1073741823(0x3fffffff, float:1.9999999)
            r12 = r4 & r5
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = f.a.a.j.f795f
            f.a.a.j$a r5 = f.a.a.j.f797h
            long r8 = r5.a(r6, r12)
            r5 = r3
            boolean r4 = r4.compareAndSet(r5, r6, r8)
            if (r4 == 0) goto L_0x00ad
            java.util.concurrent.atomic.AtomicReferenceArray r4 = r3.f798b
            int r5 = r3.a
            r5 = r5 & r10
            r4.set(r5, r1)
            goto L_0x00ba
        L_0x00ad:
            boolean r4 = r3.d
            if (r4 != 0) goto L_0x00b2
            goto L_0x0056
        L_0x00b2:
            r4 = r3
        L_0x00b3:
            f.a.a.j r4 = f.a.a.j.a(r4, r10, r12)
            if (r4 == 0) goto L_0x00ba
            goto L_0x00b3
        L_0x00ba:
            r4 = r11
        L_0x00bb:
            f.a.a.n r5 = f.a.a.j.f796g
            if (r4 == r5) goto L_0x00c3
            r1 = r4
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            goto L_0x00de
        L_0x00c3:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = f850h
            f.a.a.j r3 = r3.c()
            r4.compareAndSet(r13, r0, r3)
            goto L_0x0049
        L_0x00ce:
            f.a.a.n r3 = f.a.i0.f856b
            if (r0 != r3) goto L_0x00d3
            goto L_0x00de
        L_0x00d3:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = f850h
            boolean r3 = r3.compareAndSet(r13, r0, r1)
            if (r3 == 0) goto L_0x0049
            r1 = r0
            java.lang.Runnable r1 = (java.lang.Runnable) r1
        L_0x00de:
            if (r1 == 0) goto L_0x00e3
            r1.run()
        L_0x00e3:
            long r0 = r13.s()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f.a.g0.u():long");
    }

    public final void a(Runnable runnable) {
        if (runnable == null) {
            f.a("task");
            throw null;
        } else if (b(runnable)) {
            Thread q2 = q();
            if (Thread.currentThread() != q2) {
                LockSupport.unpark(q2);
            }
        } else {
            y.f867k.a(runnable);
        }
    }

    /* compiled from: EventLoop.common.kt */
    public static abstract class a implements Runnable, Comparable<a>, d0, q {
        public Object e;

        /* renamed from: f  reason: collision with root package name */
        public int f852f;

        /* renamed from: g  reason: collision with root package name */
        public long f853g;

        public void a(p<?> pVar) {
            if (this.e != i0.a) {
                this.e = pVar;
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        public final synchronized void f() {
            Object obj = this.e;
            if (obj != i0.a) {
                if (!(obj instanceof b)) {
                    obj = null;
                }
                b bVar = (b) obj;
                if (bVar != null) {
                    bVar.b(this);
                }
                this.e = i0.a;
            }
        }

        public p<?> g() {
            Object obj = this.e;
            if (!(obj instanceof p)) {
                obj = null;
            }
            return (p) obj;
        }

        public int h() {
            return this.f852f;
        }

        public String toString() {
            StringBuilder a = i.a.a.a.a.a("Delayed[nanos=");
            a.append(this.f853g);
            a.append(']');
            return a.toString();
        }

        public void a(int i2) {
            this.f852f = i2;
        }

        /* renamed from: a */
        public int compareTo(a aVar) {
            if (aVar != null) {
                int i2 = ((this.f853g - aVar.f853g) > 0 ? 1 : ((this.f853g - aVar.f853g) == 0 ? 0 : -1));
                if (i2 > 0) {
                    return 1;
                }
                return i2 < 0 ? -1 : 0;
            }
            f.a("other");
            throw null;
        }

        public final boolean a(long j2) {
            return j2 - this.f853g >= 0;
        }

        public final synchronized int a(long j2, b bVar, g0 g0Var) {
            if (bVar == null) {
                f.a("delayed");
                throw null;
            } else if (g0Var == null) {
                f.a("eventLoop");
                throw null;
            } else if (this.e == i0.a) {
                return 2;
            } else {
                synchronized (bVar) {
                    a aVar = (a) bVar.a();
                    if (g0Var.isCompleted) {
                        return 1;
                    }
                    if (aVar == null) {
                        bVar.f854b = j2;
                    } else {
                        long j3 = aVar.f853g;
                        if (j3 - j2 < 0) {
                            j2 = j3;
                        }
                        if (j2 - bVar.f854b > 0) {
                            bVar.f854b = j2;
                        }
                    }
                    if (this.f853g - bVar.f854b < 0) {
                        this.f853g = bVar.f854b;
                    }
                    bVar.a(this);
                    return 0;
                }
            }
        }
    }
}
