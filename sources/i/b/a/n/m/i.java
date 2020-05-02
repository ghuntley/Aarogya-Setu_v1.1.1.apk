package i.b.a.n.m;

import android.os.Build;
import android.util.Log;
import com.bumptech.glide.load.engine.GlideException;
import i.b.a.n.m.g;
import i.b.a.n.m.j;
import i.b.a.n.m.l;
import i.b.a.t.k.a;
import i.b.a.t.k.d;
import java.util.ArrayList;
import java.util.List;

/* compiled from: DecodeJob */
public class i<R> implements g.a, Runnable, Comparable<i<?>>, a.d {
    public Thread A;
    public i.b.a.n.e B;
    public i.b.a.n.e C;
    public Object D;
    public i.b.a.n.a E;
    public i.b.a.n.l.d<?> F;
    public volatile g G;
    public volatile boolean H;
    public volatile boolean I;
    public final h<R> e = new h<>();

    /* renamed from: f  reason: collision with root package name */
    public final List<Throwable> f2590f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    public final i.b.a.t.k.d f2591g = new d.b();

    /* renamed from: h  reason: collision with root package name */
    public final d f2592h;

    /* renamed from: i  reason: collision with root package name */
    public final h.h.l.c<i<?>> f2593i;

    /* renamed from: j  reason: collision with root package name */
    public final c<?> f2594j = new c<>();

    /* renamed from: k  reason: collision with root package name */
    public final e f2595k = new e();

    /* renamed from: l  reason: collision with root package name */
    public i.b.a.e f2596l;

    /* renamed from: m  reason: collision with root package name */
    public i.b.a.n.e f2597m;

    /* renamed from: n  reason: collision with root package name */
    public i.b.a.g f2598n;

    /* renamed from: o  reason: collision with root package name */
    public o f2599o;

    /* renamed from: p  reason: collision with root package name */
    public int f2600p;

    /* renamed from: q  reason: collision with root package name */
    public int f2601q;
    public k r;
    public i.b.a.n.g s;
    public a<R> t;
    public int u;
    public g v;
    public f w;
    public long x;
    public boolean y;
    public Object z;

    /* compiled from: DecodeJob */
    public interface a<R> {
    }

    /* compiled from: DecodeJob */
    public final class b<Z> implements j.a<Z> {
        public final i.b.a.n.a a;

        public b(i.b.a.n.a aVar) {
            this.a = aVar;
        }
    }

    /* compiled from: DecodeJob */
    public static class c<Z> {
        public i.b.a.n.e a;

        /* renamed from: b  reason: collision with root package name */
        public i.b.a.n.j<Z> f2603b;
        public u<Z> c;
    }

    /* compiled from: DecodeJob */
    public interface d {
    }

    /* compiled from: DecodeJob */
    public enum f {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    /* compiled from: DecodeJob */
    public enum g {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    public i(d dVar, h.h.l.c<i<?>> cVar) {
        this.f2592h = dVar;
        this.f2593i = cVar;
    }

    public final g a(g gVar) {
        int ordinal = gVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return this.y ? g.FINISHED : g.SOURCE;
                }
                if (ordinal == 3 || ordinal == 5) {
                    return g.FINISHED;
                }
                throw new IllegalArgumentException("Unrecognized stage: " + gVar);
            } else if (this.r.a()) {
                return g.DATA_CACHE;
            } else {
                return a(g.DATA_CACHE);
            }
        } else if (this.r.b()) {
            return g.RESOURCE_CACHE;
        } else {
            return a(g.RESOURCE_CACHE);
        }
    }

    public int compareTo(Object obj) {
        i iVar = (i) obj;
        int ordinal = this.f2598n.ordinal() - iVar.f2598n.ordinal();
        return ordinal == 0 ? this.u - iVar.u : ordinal;
    }

    public void f() {
        this.w = f.SWITCH_TO_SOURCE_SERVICE;
        ((m) this.t).a((i<?>) this);
    }

    public i.b.a.t.k.d g() {
        return this.f2591g;
    }

    public final void h() {
        u<R> uVar;
        u<R> uVar2;
        u<R> uVar3;
        c<?> cVar;
        if (Log.isLoggable("DecodeJob", 2)) {
            long j2 = this.x;
            StringBuilder a2 = i.a.a.a.a.a("data: ");
            a2.append(this.D);
            a2.append(", cache key: ");
            a2.append(this.B);
            a2.append(", fetcher: ");
            a2.append(this.F);
            a("Retrieved data", j2, a2.toString());
        }
        try {
            uVar = a(this.F, this.D, this.E);
        } catch (GlideException e2) {
            i.b.a.n.e eVar = this.C;
            i.b.a.n.a aVar = this.E;
            e2.f450f = eVar;
            e2.f451g = aVar;
            e2.f452h = null;
            this.f2590f.add(e2);
            uVar = null;
        }
        if (uVar != null) {
            i.b.a.n.a aVar2 = this.E;
            if (uVar instanceof r) {
                ((r) uVar).a();
            }
            boolean z2 = true;
            if (this.f2594j.c != null) {
                uVar3 = u.a(uVar);
                uVar2 = uVar3;
            } else {
                uVar2 = null;
                uVar3 = uVar;
            }
            q();
            ((m) this.t).a(uVar3, aVar2);
            this.v = g.ENCODE;
            try {
                if (this.f2594j.c == null) {
                    z2 = false;
                }
                if (z2) {
                    cVar = this.f2594j;
                    d dVar = this.f2592h;
                    i.b.a.n.g gVar = this.s;
                    if (cVar != null) {
                        ((l.c) dVar).a().a(cVar.a, new f(cVar.f2603b, cVar.c, gVar));
                        cVar.c.a();
                    } else {
                        throw null;
                    }
                }
                if (uVar2 != null) {
                    uVar2.a();
                }
                if (this.f2595k.a()) {
                    m();
                }
            } catch (Throwable th) {
                if (uVar2 != null) {
                    uVar2.a();
                }
                throw th;
            }
        } else {
            o();
        }
    }

    public final g j() {
        int ordinal = this.v.ordinal();
        if (ordinal == 1) {
            return new w(this.e, this);
        }
        if (ordinal == 2) {
            return new d(this.e, this);
        }
        if (ordinal == 3) {
            return new a0(this.e, this);
        }
        if (ordinal == 5) {
            return null;
        }
        StringBuilder a2 = i.a.a.a.a.a("Unrecognized stage: ");
        a2.append(this.v);
        throw new IllegalStateException(a2.toString());
    }

    public final void l() {
        q();
        ((m) this.t).a(new GlideException("Failed to load resource", (List<Throwable>) new ArrayList(this.f2590f)));
        if (this.f2595k.b()) {
            m();
        }
    }

    public final void m() {
        this.f2595k.c();
        c<?> cVar = this.f2594j;
        cVar.a = null;
        cVar.f2603b = null;
        cVar.c = null;
        h<R> hVar = this.e;
        hVar.c = null;
        hVar.d = null;
        hVar.f2586n = null;
        hVar.f2579g = null;
        hVar.f2583k = null;
        hVar.f2581i = null;
        hVar.f2587o = null;
        hVar.f2582j = null;
        hVar.f2588p = null;
        hVar.a.clear();
        hVar.f2584l = false;
        hVar.f2577b.clear();
        hVar.f2585m = false;
        this.H = false;
        this.f2596l = null;
        this.f2597m = null;
        this.s = null;
        this.f2598n = null;
        this.f2599o = null;
        this.t = null;
        this.v = null;
        this.G = null;
        this.A = null;
        this.B = null;
        this.D = null;
        this.E = null;
        this.F = null;
        this.x = 0;
        this.I = false;
        this.z = null;
        this.f2590f.clear();
        this.f2593i.a(this);
    }

    public final void o() {
        this.A = Thread.currentThread();
        this.x = i.b.a.t.f.a();
        boolean z2 = false;
        while (!this.I && this.G != null && !(z2 = this.G.a())) {
            this.v = a(this.v);
            this.G = j();
            if (this.v == g.SOURCE) {
                this.w = f.SWITCH_TO_SOURCE_SERVICE;
                ((m) this.t).a((i<?>) this);
                return;
            }
        }
        if ((this.v == g.FINISHED || this.I) && !z2) {
            l();
        }
    }

    public final void p() {
        int ordinal = this.w.ordinal();
        if (ordinal == 0) {
            this.v = a(g.INITIALIZE);
            this.G = j();
            o();
        } else if (ordinal == 1) {
            o();
        } else if (ordinal == 2) {
            h();
        } else {
            StringBuilder a2 = i.a.a.a.a.a("Unrecognized run reason: ");
            a2.append(this.w);
            throw new IllegalStateException(a2.toString());
        }
    }

    public final void q() {
        Throwable th;
        this.f2591g.a();
        if (this.H) {
            if (this.f2590f.isEmpty()) {
                th = null;
            } else {
                List<Throwable> list = this.f2590f;
                th = list.get(list.size() - 1);
            }
            throw new IllegalStateException("Already notified", th);
        }
        this.H = true;
    }

    public void run() {
        i.b.a.n.l.d<?> dVar = this.F;
        try {
            if (this.I) {
                l();
                if (dVar != null) {
                    dVar.b();
                    return;
                }
                return;
            }
            p();
            if (dVar != null) {
                dVar.b();
            }
        } catch (c e2) {
            throw e2;
        } catch (Throwable th) {
            if (dVar != null) {
                dVar.b();
            }
            throw th;
        }
    }

    /* compiled from: DecodeJob */
    public static class e {
        public boolean a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f2604b;
        public boolean c;

        public synchronized boolean a() {
            this.f2604b = true;
            return a(false);
        }

        public synchronized boolean b(boolean z) {
            this.a = true;
            return a(z);
        }

        public synchronized void c() {
            this.f2604b = false;
            this.a = false;
            this.c = false;
        }

        public final boolean a(boolean z) {
            return (this.c || z || this.f2604b) && this.a;
        }

        public synchronized boolean b() {
            this.c = true;
            return a(false);
        }
    }

    public void a(i.b.a.n.e eVar, Object obj, i.b.a.n.l.d<?> dVar, i.b.a.n.a aVar, i.b.a.n.e eVar2) {
        this.B = eVar;
        this.D = obj;
        this.F = dVar;
        this.E = aVar;
        this.C = eVar2;
        if (Thread.currentThread() != this.A) {
            this.w = f.DECODE_DATA;
            ((m) this.t).a((i<?>) this);
            return;
        }
        h();
    }

    public void a(i.b.a.n.e eVar, Exception exc, i.b.a.n.l.d<?> dVar, i.b.a.n.a aVar) {
        dVar.b();
        GlideException glideException = new GlideException("Fetching data failed", (Throwable) exc);
        Class<?> a2 = dVar.a();
        glideException.f450f = eVar;
        glideException.f451g = aVar;
        glideException.f452h = a2;
        this.f2590f.add(glideException);
        if (Thread.currentThread() != this.A) {
            this.w = f.SWITCH_TO_SOURCE_SERVICE;
            ((m) this.t).a((i<?>) this);
            return;
        }
        o();
    }

    public final <Data> v<R> a(i.b.a.n.l.d<?> dVar, Data data, i.b.a.n.a aVar) {
        if (data == null) {
            dVar.b();
            return null;
        }
        try {
            long a2 = i.b.a.t.f.a();
            v<R> a3 = a(data, aVar);
            if (Log.isLoggable("DecodeJob", 2)) {
                a("Decoded result " + a3, a2, (String) null);
            }
            return a3;
        } finally {
            dVar.b();
        }
    }

    public final <Data> v<R> a(Data data, i.b.a.n.a aVar) {
        t<Data, ?, R> a2 = this.e.a(data.getClass());
        i.b.a.n.g gVar = this.s;
        if (Build.VERSION.SDK_INT >= 26) {
            boolean z2 = aVar == i.b.a.n.a.RESOURCE_DISK_CACHE || this.e.r;
            Boolean bool = (Boolean) gVar.a(i.b.a.n.o.c.l.f2742i);
            if (bool == null || (bool.booleanValue() && !z2)) {
                gVar = new i.b.a.n.g();
                gVar.a(this.s);
                gVar.f2498b.put(i.b.a.n.o.c.l.f2742i, Boolean.valueOf(z2));
            }
        }
        i.b.a.n.g gVar2 = gVar;
        i.b.a.n.l.e a3 = this.f2596l.f2409b.e.a(data);
        try {
            return a2.a(a3, gVar2, this.f2600p, this.f2601q, new b(aVar));
        } finally {
            a3.b();
        }
    }

    public final void a(String str, long j2, String str2) {
        StringBuilder a2 = i.a.a.a.a.a(str, " in ");
        a2.append(i.b.a.t.f.a(j2));
        a2.append(", load key: ");
        a2.append(this.f2599o);
        a2.append(str2 != null ? i.a.a.a.a.b(", ", str2) : "");
        a2.append(", thread: ");
        a2.append(Thread.currentThread().getName());
        Log.v("DecodeJob", a2.toString());
    }
}
