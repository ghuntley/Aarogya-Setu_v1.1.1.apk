package i.b.a.n.m;

import android.util.Log;
import i.b.a.g;
import i.b.a.n.k;
import i.b.a.n.m.c0.a;
import i.b.a.n.m.c0.e;
import i.b.a.n.m.c0.f;
import i.b.a.n.m.c0.h;
import i.b.a.n.m.c0.i;
import i.b.a.n.m.i;
import i.b.a.n.m.q;
import i.b.a.t.k.a;
import java.io.File;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: Engine */
public class l implements n, i.a, q.a {

    /* renamed from: i  reason: collision with root package name */
    public static final boolean f2616i = Log.isLoggable("Engine", 2);
    public final s a = new s();

    /* renamed from: b  reason: collision with root package name */
    public final p f2617b = new p();
    public final i c;
    public final b d;
    public final y e;

    /* renamed from: f  reason: collision with root package name */
    public final c f2618f;

    /* renamed from: g  reason: collision with root package name */
    public final a f2619g;

    /* renamed from: h  reason: collision with root package name */
    public final a f2620h;

    /* compiled from: Engine */
    public static class a {
        public final i.d a;

        /* renamed from: b  reason: collision with root package name */
        public final h.h.l.c<i<?>> f2621b = i.b.a.t.k.a.a(150, new C0087a());
        public int c;

        /* renamed from: i.b.a.n.m.l$a$a  reason: collision with other inner class name */
        /* compiled from: Engine */
        public class C0087a implements a.b<i<?>> {
            public C0087a() {
            }

            public Object a() {
                a aVar = a.this;
                return new i(aVar.a, aVar.f2621b);
            }
        }

        public a(i.d dVar) {
            this.a = dVar;
        }
    }

    /* compiled from: Engine */
    public static class b {
        public final i.b.a.n.m.d0.a a;

        /* renamed from: b  reason: collision with root package name */
        public final i.b.a.n.m.d0.a f2622b;
        public final i.b.a.n.m.d0.a c;
        public final i.b.a.n.m.d0.a d;
        public final n e;

        /* renamed from: f  reason: collision with root package name */
        public final q.a f2623f;

        /* renamed from: g  reason: collision with root package name */
        public final h.h.l.c<m<?>> f2624g = i.b.a.t.k.a.a(150, new a());

        /* compiled from: Engine */
        public class a implements a.b<m<?>> {
            public a() {
            }

            public Object a() {
                b bVar = b.this;
                return new m(bVar.a, bVar.f2622b, bVar.c, bVar.d, bVar.e, bVar.f2623f, bVar.f2624g);
            }
        }

        public b(i.b.a.n.m.d0.a aVar, i.b.a.n.m.d0.a aVar2, i.b.a.n.m.d0.a aVar3, i.b.a.n.m.d0.a aVar4, n nVar, q.a aVar5) {
            this.a = aVar;
            this.f2622b = aVar2;
            this.c = aVar3;
            this.d = aVar4;
            this.e = nVar;
            this.f2623f = aVar5;
        }
    }

    /* compiled from: Engine */
    public static class c implements i.d {
        public final a.C0083a a;

        /* renamed from: b  reason: collision with root package name */
        public volatile i.b.a.n.m.c0.a f2625b;

        public c(a.C0083a aVar) {
            this.a = aVar;
        }

        public i.b.a.n.m.c0.a a() {
            if (this.f2625b == null) {
                synchronized (this) {
                    if (this.f2625b == null) {
                        i.b.a.n.m.c0.d dVar = (i.b.a.n.m.c0.d) this.a;
                        f fVar = (f) dVar.f2552b;
                        File cacheDir = fVar.a.getCacheDir();
                        e eVar = null;
                        if (cacheDir == null) {
                            cacheDir = null;
                        } else if (fVar.f2554b != null) {
                            cacheDir = new File(cacheDir, fVar.f2554b);
                        }
                        if (cacheDir != null) {
                            if (!cacheDir.mkdirs()) {
                                if (cacheDir.exists()) {
                                    if (!cacheDir.isDirectory()) {
                                    }
                                }
                            }
                            eVar = new e(cacheDir, dVar.a);
                        }
                        this.f2625b = eVar;
                    }
                    if (this.f2625b == null) {
                        this.f2625b = new i.b.a.n.m.c0.b();
                    }
                }
            }
            return this.f2625b;
        }
    }

    /* compiled from: Engine */
    public class d {
        public final m<?> a;

        /* renamed from: b  reason: collision with root package name */
        public final i.b.a.r.f f2626b;

        public d(i.b.a.r.f fVar, m<?> mVar) {
            this.f2626b = fVar;
            this.a = mVar;
        }

        public void a() {
            synchronized (l.this) {
                this.a.a(this.f2626b);
            }
        }
    }

    public l(i.b.a.n.m.c0.i iVar, a.C0083a aVar, i.b.a.n.m.d0.a aVar2, i.b.a.n.m.d0.a aVar3, i.b.a.n.m.d0.a aVar4, i.b.a.n.m.d0.a aVar5, boolean z) {
        this.c = iVar;
        this.f2618f = new c(aVar);
        a aVar6 = new a(z);
        this.f2620h = aVar6;
        aVar6.a((q.a) this);
        this.d = new b(aVar2, aVar3, aVar4, aVar5, this, this);
        this.f2619g = new a(this.f2618f);
        this.e = new y();
        ((h) iVar).d = this;
    }

    public synchronized void a(m<?> mVar, i.b.a.n.e eVar, q<?> qVar) {
        if (qVar != null) {
            if (qVar.e) {
                this.f2620h.a(eVar, qVar);
            }
        }
        s sVar = this.a;
        if (sVar != null) {
            Map<i.b.a.n.e, m<?>> a2 = sVar.a(mVar.t);
            if (mVar.equals(a2.get(eVar))) {
                a2.remove(eVar);
            }
        } else {
            throw null;
        }
    }

    public <R> d a(i.b.a.e eVar, Object obj, i.b.a.n.e eVar2, int i2, int i3, Class<?> cls, Class<R> cls2, g gVar, k kVar, Map<Class<?>, k<?>> map, boolean z, boolean z2, i.b.a.n.g gVar2, boolean z3, boolean z4, boolean z5, boolean z6, i.b.a.r.f fVar, Executor executor) {
        long a2 = f2616i ? i.b.a.t.f.a() : 0;
        if (this.f2617b != null) {
            o oVar = new o(obj, eVar2, i2, i3, map, cls, cls2, gVar2);
            synchronized (this) {
                q<?> a3 = a(oVar, z3, a2);
                if (a3 == null) {
                    d a4 = a(eVar, obj, eVar2, i2, i3, cls, cls2, gVar, kVar, map, z, z2, gVar2, z3, z4, z5, z6, fVar, executor, oVar, a2);
                    return a4;
                }
                ((i.b.a.r.g) fVar).a((v<?>) a3, i.b.a.n.a.MEMORY_CACHE);
                return null;
            }
        }
        throw null;
    }

    public final <R> d a(i.b.a.e eVar, Object obj, i.b.a.n.e eVar2, int i2, int i3, Class<?> cls, Class<R> cls2, g gVar, k kVar, Map<Class<?>, k<?>> map, boolean z, boolean z2, i.b.a.n.g gVar2, boolean z3, boolean z4, boolean z5, boolean z6, i.b.a.r.f fVar, Executor executor, o oVar, long j2) {
        i.b.a.e eVar3 = eVar;
        Object obj2 = obj;
        i.b.a.n.e eVar4 = eVar2;
        int i4 = i2;
        int i5 = i3;
        g gVar3 = gVar;
        k kVar2 = kVar;
        i.b.a.n.g gVar4 = gVar2;
        boolean z7 = z6;
        i.b.a.r.f fVar2 = fVar;
        Executor executor2 = executor;
        o oVar2 = oVar;
        long j3 = j2;
        s sVar = this.a;
        m mVar = (z7 ? sVar.f2654b : sVar.a).get(oVar2);
        if (mVar != null) {
            mVar.a(fVar2, executor2);
            if (f2616i) {
                a("Added to existing load", j3, (i.b.a.n.e) oVar2);
            }
            return new d(fVar2, mVar);
        }
        m a2 = this.d.f2624g.a();
        g.a.a.b.a.a(a2, "Argument must not be null");
        m mVar2 = a2;
        a2.a(oVar, z3, z4, z5, z6);
        a aVar = this.f2619g;
        i a3 = aVar.f2621b.a();
        g.a.a.b.a.a(a3, "Argument must not be null");
        int i6 = aVar.c;
        aVar.c = i6 + 1;
        h<R> hVar = a3.e;
        i.d dVar = a3.f2592h;
        hVar.c = eVar3;
        hVar.d = obj2;
        hVar.f2586n = eVar4;
        hVar.e = i4;
        hVar.f2578f = i5;
        hVar.f2588p = kVar2;
        hVar.f2579g = cls;
        hVar.f2580h = dVar;
        hVar.f2583k = cls2;
        hVar.f2587o = gVar3;
        hVar.f2581i = gVar4;
        hVar.f2582j = map;
        hVar.f2589q = z;
        hVar.r = z2;
        a3.f2596l = eVar3;
        a3.f2597m = eVar4;
        a3.f2598n = gVar3;
        o oVar3 = oVar;
        a3.f2599o = oVar3;
        a3.f2600p = i4;
        a3.f2601q = i5;
        a3.r = kVar2;
        a3.y = z6;
        a3.s = gVar4;
        m mVar3 = mVar2;
        a3.t = mVar3;
        a3.u = i6;
        a3.w = i.f.INITIALIZE;
        a3.z = obj2;
        s sVar2 = this.a;
        if (sVar2 != null) {
            sVar2.a(mVar3.t).put(oVar3, mVar3);
            i.b.a.r.f fVar3 = fVar;
            mVar3.a(fVar3, executor);
            mVar3.b(a3);
            if (f2616i) {
                a("Started new load", j2, (i.b.a.n.e) oVar3);
            }
            return new d(fVar3, mVar3);
        }
        throw null;
    }

    public static void a(String str, long j2, i.b.a.n.e eVar) {
        StringBuilder a2 = i.a.a.a.a.a(str, " in ");
        a2.append(i.b.a.t.f.a(j2));
        a2.append("ms, key: ");
        a2.append(eVar);
        Log.v("Engine", a2.toString());
    }

    public final q<?> a(o oVar, boolean z, long j2) {
        q<?> qVar;
        if (!z) {
            return null;
        }
        q<?> b2 = this.f2620h.b(oVar);
        if (b2 != null) {
            b2.a();
        }
        if (b2 != null) {
            if (f2616i) {
                a("Loaded resource from active resources", j2, (i.b.a.n.e) oVar);
            }
            return b2;
        }
        v a2 = ((h) this.c).a(oVar);
        if (a2 == null) {
            qVar = null;
        } else if (a2 instanceof q) {
            qVar = (q) a2;
        } else {
            qVar = new q<>(a2, true, true, oVar, this);
        }
        if (qVar != null) {
            qVar.a();
            this.f2620h.a(oVar, qVar);
        }
        if (qVar == null) {
            return null;
        }
        if (f2616i) {
            a("Loaded resource from cache", j2, (i.b.a.n.e) oVar);
        }
        return qVar;
    }

    public void a(v<?> vVar) {
        if (vVar instanceof q) {
            ((q) vVar).e();
            return;
        }
        throw new IllegalArgumentException("Cannot release anything but an EngineResource");
    }

    public synchronized void a(m<?> mVar, i.b.a.n.e eVar) {
        s sVar = this.a;
        if (sVar != null) {
            Map<i.b.a.n.e, m<?>> a2 = sVar.a(mVar.t);
            if (mVar.equals(a2.get(eVar))) {
                a2.remove(eVar);
            }
        } else {
            throw null;
        }
    }

    public void a(i.b.a.n.e eVar, q<?> qVar) {
        this.f2620h.a(eVar);
        if (qVar.e) {
            ((h) this.c).a(eVar, (v) qVar);
        } else {
            this.e.a(qVar, false);
        }
    }
}
