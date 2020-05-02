package i.b.a.n.m;

import i.b.a.n.e;

/* compiled from: EngineResource */
public class q<Z> implements v<Z> {
    public final boolean e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f2648f;

    /* renamed from: g  reason: collision with root package name */
    public final v<Z> f2649g;

    /* renamed from: h  reason: collision with root package name */
    public final a f2650h;

    /* renamed from: i  reason: collision with root package name */
    public final e f2651i;

    /* renamed from: j  reason: collision with root package name */
    public int f2652j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f2653k;

    /* compiled from: EngineResource */
    public interface a {
        void a(e eVar, q<?> qVar);
    }

    public q(v<Z> vVar, boolean z, boolean z2, e eVar, a aVar) {
        g.a.a.b.a.a(vVar, "Argument must not be null");
        this.f2649g = vVar;
        this.e = z;
        this.f2648f = z2;
        this.f2651i = eVar;
        g.a.a.b.a.a(aVar, "Argument must not be null");
        this.f2650h = aVar;
    }

    public synchronized void a() {
        if (!this.f2653k) {
            this.f2652j++;
        } else {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
    }

    public int b() {
        return this.f2649g.b();
    }

    public Class<Z> c() {
        return this.f2649g.c();
    }

    public synchronized void d() {
        if (this.f2652j > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        } else if (!this.f2653k) {
            this.f2653k = true;
            if (this.f2648f) {
                this.f2649g.d();
            }
        } else {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
    }

    public void e() {
        boolean z;
        synchronized (this) {
            if (this.f2652j > 0) {
                z = true;
                int i2 = this.f2652j - 1;
                this.f2652j = i2;
                if (i2 != 0) {
                    z = false;
                }
            } else {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
        }
        if (z) {
            this.f2650h.a(this.f2651i, this);
        }
    }

    public Z get() {
        return this.f2649g.get();
    }

    public synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.e + ", listener=" + this.f2650h + ", key=" + this.f2651i + ", acquired=" + this.f2652j + ", isRecycled=" + this.f2653k + ", resource=" + this.f2649g + '}';
    }
}
