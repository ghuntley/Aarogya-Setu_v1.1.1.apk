package i.b.a.n.m;

import com.bumptech.glide.load.engine.GlideException;
import i.b.a.n.m.i;
import i.b.a.n.m.q;
import i.b.a.r.f;
import i.b.a.r.g;
import i.b.a.t.k.a;
import i.b.a.t.k.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: EngineJob */
public class m<R> implements i.a<R>, a.d {
    public static final c C = new c();
    public i<R> A;
    public volatile boolean B;
    public final e e = new e();

    /* renamed from: f  reason: collision with root package name */
    public final i.b.a.t.k.d f2627f = new d.b();

    /* renamed from: g  reason: collision with root package name */
    public final q.a f2628g;

    /* renamed from: h  reason: collision with root package name */
    public final h.h.l.c<m<?>> f2629h;

    /* renamed from: i  reason: collision with root package name */
    public final c f2630i;

    /* renamed from: j  reason: collision with root package name */
    public final n f2631j;

    /* renamed from: k  reason: collision with root package name */
    public final i.b.a.n.m.d0.a f2632k;

    /* renamed from: l  reason: collision with root package name */
    public final i.b.a.n.m.d0.a f2633l;

    /* renamed from: m  reason: collision with root package name */
    public final i.b.a.n.m.d0.a f2634m;

    /* renamed from: n  reason: collision with root package name */
    public final i.b.a.n.m.d0.a f2635n;

    /* renamed from: o  reason: collision with root package name */
    public final AtomicInteger f2636o = new AtomicInteger();

    /* renamed from: p  reason: collision with root package name */
    public i.b.a.n.e f2637p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f2638q;
    public boolean r;
    public boolean s;
    public boolean t;
    public v<?> u;
    public i.b.a.n.a v;
    public boolean w;
    public GlideException x;
    public boolean y;
    public q<?> z;

    /* compiled from: EngineJob */
    public class a implements Runnable {
        public final f e;

        public a(f fVar) {
            this.e = fVar;
        }

        public void run() {
            g gVar = (g) this.e;
            gVar.f2832b.a();
            synchronized (gVar.c) {
                synchronized (m.this) {
                    if (m.this.e.e.contains(new d(this.e, i.b.a.t.e.f2867b))) {
                        m mVar = m.this;
                        f fVar = this.e;
                        if (mVar != null) {
                            try {
                                ((g) fVar).a(mVar.x, 5);
                            } catch (Throwable th) {
                                throw new c(th);
                            }
                        } else {
                            throw null;
                        }
                    }
                    m.this.a();
                }
            }
        }
    }

    /* compiled from: EngineJob */
    public class b implements Runnable {
        public final f e;

        public b(f fVar) {
            this.e = fVar;
        }

        public void run() {
            g gVar = (g) this.e;
            gVar.f2832b.a();
            synchronized (gVar.c) {
                synchronized (m.this) {
                    if (m.this.e.e.contains(new d(this.e, i.b.a.t.e.f2867b))) {
                        m.this.z.a();
                        m mVar = m.this;
                        f fVar = this.e;
                        if (mVar != null) {
                            try {
                                ((g) fVar).a((v<?>) mVar.z, mVar.v);
                                m.this.a(this.e);
                            } catch (Throwable th) {
                                throw new c(th);
                            }
                        } else {
                            throw null;
                        }
                    }
                    m.this.a();
                }
            }
        }
    }

    /* compiled from: EngineJob */
    public static class c {
    }

    /* compiled from: EngineJob */
    public static final class d {
        public final f a;

        /* renamed from: b  reason: collision with root package name */
        public final Executor f2641b;

        public d(f fVar, Executor executor) {
            this.a = fVar;
            this.f2641b = executor;
        }

        public boolean equals(Object obj) {
            if (obj instanceof d) {
                return this.a.equals(((d) obj).a);
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }
    }

    /* compiled from: EngineJob */
    public static final class e implements Iterable<d> {
        public final List<d> e = new ArrayList(2);

        public boolean isEmpty() {
            return this.e.isEmpty();
        }

        public Iterator<d> iterator() {
            return this.e.iterator();
        }
    }

    public m(i.b.a.n.m.d0.a aVar, i.b.a.n.m.d0.a aVar2, i.b.a.n.m.d0.a aVar3, i.b.a.n.m.d0.a aVar4, n nVar, q.a aVar5, h.h.l.c<m<?>> cVar) {
        c cVar2 = C;
        this.f2632k = aVar;
        this.f2633l = aVar2;
        this.f2634m = aVar3;
        this.f2635n = aVar4;
        this.f2631j = nVar;
        this.f2628g = aVar5;
        this.f2629h = cVar;
        this.f2630i = cVar2;
    }

    public synchronized m<R> a(i.b.a.n.e eVar, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.f2637p = eVar;
        this.f2638q = z2;
        this.r = z3;
        this.s = z4;
        this.t = z5;
        return this;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0019  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void b(i.b.a.n.m.i<R> r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            r2.A = r3     // Catch:{ all -> 0x0035 }
            if (r3 == 0) goto L_0x0033
            i.b.a.n.m.i$g r0 = i.b.a.n.m.i.g.INITIALIZE     // Catch:{ all -> 0x0035 }
            i.b.a.n.m.i$g r0 = r3.a(r0)     // Catch:{ all -> 0x0035 }
            i.b.a.n.m.i$g r1 = i.b.a.n.m.i.g.RESOURCE_CACHE     // Catch:{ all -> 0x0035 }
            if (r0 == r1) goto L_0x0016
            i.b.a.n.m.i$g r1 = i.b.a.n.m.i.g.DATA_CACHE     // Catch:{ all -> 0x0035 }
            if (r0 != r1) goto L_0x0014
            goto L_0x0016
        L_0x0014:
            r0 = 0
            goto L_0x0017
        L_0x0016:
            r0 = 1
        L_0x0017:
            if (r0 == 0) goto L_0x001c
            i.b.a.n.m.d0.a r0 = r2.f2632k     // Catch:{ all -> 0x0035 }
            goto L_0x002c
        L_0x001c:
            boolean r0 = r2.r     // Catch:{ all -> 0x0035 }
            if (r0 == 0) goto L_0x0023
            i.b.a.n.m.d0.a r0 = r2.f2634m     // Catch:{ all -> 0x0035 }
            goto L_0x002c
        L_0x0023:
            boolean r0 = r2.s     // Catch:{ all -> 0x0035 }
            if (r0 == 0) goto L_0x002a
            i.b.a.n.m.d0.a r0 = r2.f2635n     // Catch:{ all -> 0x0035 }
            goto L_0x002c
        L_0x002a:
            i.b.a.n.m.d0.a r0 = r2.f2633l     // Catch:{ all -> 0x0035 }
        L_0x002c:
            java.util.concurrent.ExecutorService r0 = r0.e     // Catch:{ all -> 0x0035 }
            r0.execute(r3)     // Catch:{ all -> 0x0035 }
            monitor-exit(r2)
            return
        L_0x0033:
            r3 = 0
            throw r3     // Catch:{ all -> 0x0035 }
        L_0x0035:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: i.b.a.n.m.m.b(i.b.a.n.m.i):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0035, code lost:
        ((i.b.a.n.m.l) r5.f2631j).a((i.b.a.n.m.m<?>) r5, r1, (i.b.a.n.m.q<?>) null);
        r0 = r4.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0044, code lost:
        if (r0.hasNext() == false) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0046, code lost:
        r1 = (i.b.a.n.m.m.d) r0.next();
        r1.f2641b.execute(new i.b.a.n.m.m.a(r5, r1.a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0059, code lost:
        a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c() {
        /*
            r5 = this;
            monitor-enter(r5)
            i.b.a.t.k.d r0 = r5.f2627f     // Catch:{ all -> 0x006e }
            r0.a()     // Catch:{ all -> 0x006e }
            boolean r0 = r5.B     // Catch:{ all -> 0x006e }
            if (r0 == 0) goto L_0x000f
            r5.e()     // Catch:{ all -> 0x006e }
            monitor-exit(r5)     // Catch:{ all -> 0x006e }
            return
        L_0x000f:
            i.b.a.n.m.m$e r0 = r5.e     // Catch:{ all -> 0x006e }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x006e }
            if (r0 != 0) goto L_0x0066
            boolean r0 = r5.y     // Catch:{ all -> 0x006e }
            if (r0 != 0) goto L_0x005e
            r0 = 1
            r5.y = r0     // Catch:{ all -> 0x006e }
            i.b.a.n.e r1 = r5.f2637p     // Catch:{ all -> 0x006e }
            i.b.a.n.m.m$e r2 = r5.e     // Catch:{ all -> 0x006e }
            r3 = 0
            if (r2 == 0) goto L_0x005d
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x006e }
            java.util.List<i.b.a.n.m.m$d> r2 = r2.e     // Catch:{ all -> 0x006e }
            r4.<init>(r2)     // Catch:{ all -> 0x006e }
            int r2 = r4.size()     // Catch:{ all -> 0x006e }
            int r2 = r2 + r0
            r5.a((int) r2)     // Catch:{ all -> 0x006e }
            monitor-exit(r5)     // Catch:{ all -> 0x006e }
            i.b.a.n.m.n r0 = r5.f2631j
            i.b.a.n.m.l r0 = (i.b.a.n.m.l) r0
            r0.a((i.b.a.n.m.m<?>) r5, (i.b.a.n.e) r1, (i.b.a.n.m.q<?>) r3)
            java.util.Iterator r0 = r4.iterator()
        L_0x0040:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0059
            java.lang.Object r1 = r0.next()
            i.b.a.n.m.m$d r1 = (i.b.a.n.m.m.d) r1
            java.util.concurrent.Executor r2 = r1.f2641b
            i.b.a.n.m.m$a r3 = new i.b.a.n.m.m$a
            i.b.a.r.f r1 = r1.a
            r3.<init>(r1)
            r2.execute(r3)
            goto L_0x0040
        L_0x0059:
            r5.a()
            return
        L_0x005d:
            throw r3     // Catch:{ all -> 0x006e }
        L_0x005e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x006e }
            java.lang.String r1 = "Already failed once"
            r0.<init>(r1)     // Catch:{ all -> 0x006e }
            throw r0     // Catch:{ all -> 0x006e }
        L_0x0066:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x006e }
            java.lang.String r1 = "Received an exception without any callbacks to notify"
            r0.<init>(r1)     // Catch:{ all -> 0x006e }
            throw r0     // Catch:{ all -> 0x006e }
        L_0x006e:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x006e }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i.b.a.n.m.m.c():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0051, code lost:
        ((i.b.a.n.m.l) r8.f2631j).a((i.b.a.n.m.m<?>) r8, r0, r1);
        r0 = r2.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0060, code lost:
        if (r0.hasNext() == false) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0062, code lost:
        r1 = (i.b.a.n.m.m.d) r0.next();
        r1.f2641b.execute(new i.b.a.n.m.m.b(r8, r1.a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0075, code lost:
        a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0078, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d() {
        /*
            r8 = this;
            monitor-enter(r8)
            i.b.a.t.k.d r0 = r8.f2627f     // Catch:{ all -> 0x008b }
            r0.a()     // Catch:{ all -> 0x008b }
            boolean r0 = r8.B     // Catch:{ all -> 0x008b }
            if (r0 == 0) goto L_0x0014
            i.b.a.n.m.v<?> r0 = r8.u     // Catch:{ all -> 0x008b }
            r0.d()     // Catch:{ all -> 0x008b }
            r8.e()     // Catch:{ all -> 0x008b }
            monitor-exit(r8)     // Catch:{ all -> 0x008b }
            return
        L_0x0014:
            i.b.a.n.m.m$e r0 = r8.e     // Catch:{ all -> 0x008b }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x008b }
            if (r0 != 0) goto L_0x0083
            boolean r0 = r8.w     // Catch:{ all -> 0x008b }
            if (r0 != 0) goto L_0x007b
            i.b.a.n.m.m$c r0 = r8.f2630i     // Catch:{ all -> 0x008b }
            i.b.a.n.m.v<?> r2 = r8.u     // Catch:{ all -> 0x008b }
            boolean r3 = r8.f2638q     // Catch:{ all -> 0x008b }
            i.b.a.n.e r5 = r8.f2637p     // Catch:{ all -> 0x008b }
            i.b.a.n.m.q$a r6 = r8.f2628g     // Catch:{ all -> 0x008b }
            r7 = 0
            if (r0 == 0) goto L_0x007a
            i.b.a.n.m.q r0 = new i.b.a.n.m.q     // Catch:{ all -> 0x008b }
            r4 = 1
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x008b }
            r8.z = r0     // Catch:{ all -> 0x008b }
            r0 = 1
            r8.w = r0     // Catch:{ all -> 0x008b }
            i.b.a.n.m.m$e r1 = r8.e     // Catch:{ all -> 0x008b }
            if (r1 == 0) goto L_0x0079
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x008b }
            java.util.List<i.b.a.n.m.m$d> r1 = r1.e     // Catch:{ all -> 0x008b }
            r2.<init>(r1)     // Catch:{ all -> 0x008b }
            int r1 = r2.size()     // Catch:{ all -> 0x008b }
            int r1 = r1 + r0
            r8.a((int) r1)     // Catch:{ all -> 0x008b }
            i.b.a.n.e r0 = r8.f2637p     // Catch:{ all -> 0x008b }
            i.b.a.n.m.q<?> r1 = r8.z     // Catch:{ all -> 0x008b }
            monitor-exit(r8)     // Catch:{ all -> 0x008b }
            i.b.a.n.m.n r3 = r8.f2631j
            i.b.a.n.m.l r3 = (i.b.a.n.m.l) r3
            r3.a((i.b.a.n.m.m<?>) r8, (i.b.a.n.e) r0, (i.b.a.n.m.q<?>) r1)
            java.util.Iterator r0 = r2.iterator()
        L_0x005c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0075
            java.lang.Object r1 = r0.next()
            i.b.a.n.m.m$d r1 = (i.b.a.n.m.m.d) r1
            java.util.concurrent.Executor r2 = r1.f2641b
            i.b.a.n.m.m$b r3 = new i.b.a.n.m.m$b
            i.b.a.r.f r1 = r1.a
            r3.<init>(r1)
            r2.execute(r3)
            goto L_0x005c
        L_0x0075:
            r8.a()
            return
        L_0x0079:
            throw r7     // Catch:{ all -> 0x008b }
        L_0x007a:
            throw r7     // Catch:{ all -> 0x008b }
        L_0x007b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x008b }
            java.lang.String r1 = "Already have resource"
            r0.<init>(r1)     // Catch:{ all -> 0x008b }
            throw r0     // Catch:{ all -> 0x008b }
        L_0x0083:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x008b }
            java.lang.String r1 = "Received a resource without any callbacks to notify"
            r0.<init>(r1)     // Catch:{ all -> 0x008b }
            throw r0     // Catch:{ all -> 0x008b }
        L_0x008b:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x008b }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i.b.a.n.m.m.d():void");
    }

    public final synchronized void e() {
        if (this.f2637p != null) {
            this.e.e.clear();
            this.f2637p = null;
            this.z = null;
            this.u = null;
            this.y = false;
            this.B = false;
            this.w = false;
            i<R> iVar = this.A;
            if (iVar.f2595k.b(false)) {
                iVar.m();
            }
            this.A = null;
            this.x = null;
            this.v = null;
            this.f2629h.a(this);
        } else {
            throw new IllegalArgumentException();
        }
    }

    public i.b.a.t.k.d g() {
        return this.f2627f;
    }

    public synchronized void a(f fVar, Executor executor) {
        this.f2627f.a();
        this.e.e.add(new d(fVar, executor));
        boolean z2 = true;
        if (this.w) {
            a(1);
            executor.execute(new b(fVar));
        } else if (this.y) {
            a(1);
            executor.execute(new a(fVar));
        } else {
            if (this.B) {
                z2 = false;
            }
            g.a.a.b.a.a(z2, "Cannot add callbacks to a cancelled EngineJob");
        }
    }

    public final boolean b() {
        return this.y || this.w || this.B;
    }

    public synchronized void a(f fVar) {
        this.f2627f.a();
        this.e.e.remove(new d(fVar, i.b.a.t.e.f2867b));
        if (this.e.isEmpty()) {
            boolean z2 = true;
            if (!b()) {
                this.B = true;
                i<R> iVar = this.A;
                iVar.I = true;
                g gVar = iVar.G;
                if (gVar != null) {
                    gVar.cancel();
                }
                ((l) this.f2631j).a((m<?>) this, this.f2637p);
            }
            if (!this.w) {
                if (!this.y) {
                    z2 = false;
                }
            }
            if (z2 && this.f2636o.get() == 0) {
                e();
            }
        }
    }

    public void a(i<?> iVar) {
        i.b.a.n.m.d0.a aVar;
        if (this.r) {
            aVar = this.f2634m;
        } else {
            aVar = this.s ? this.f2635n : this.f2633l;
        }
        aVar.e.execute(iVar);
    }

    public synchronized void a(int i2) {
        g.a.a.b.a.a(b(), "Not yet complete!");
        if (this.f2636o.getAndAdd(i2) == 0 && this.z != null) {
            this.z.a();
        }
    }

    public void a() {
        q<?> qVar;
        synchronized (this) {
            this.f2627f.a();
            g.a.a.b.a.a(b(), "Not yet complete!");
            int decrementAndGet = this.f2636o.decrementAndGet();
            g.a.a.b.a.a(decrementAndGet >= 0, "Can't decrement below 0");
            if (decrementAndGet == 0) {
                qVar = this.z;
                e();
            } else {
                qVar = null;
            }
        }
        if (qVar != null) {
            qVar.e();
        }
    }

    public void a(v<R> vVar, i.b.a.n.a aVar) {
        synchronized (this) {
            this.u = vVar;
            this.v = aVar;
        }
        d();
    }

    public void a(GlideException glideException) {
        synchronized (this) {
            this.x = glideException;
        }
        c();
    }
}
