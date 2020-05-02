package i.b.a.n.m;

import h.h.l.c;
import i.b.a.t.k.a;
import i.b.a.t.k.d;

/* compiled from: LockedResource */
public final class u<Z> implements v<Z>, a.d {

    /* renamed from: i  reason: collision with root package name */
    public static final c<u<?>> f2656i = i.b.a.t.k.a.a(20, new a());
    public final d e = new d.b();

    /* renamed from: f  reason: collision with root package name */
    public v<Z> f2657f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f2658g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2659h;

    /* compiled from: LockedResource */
    public class a implements a.b<u<?>> {
        public Object a() {
            return new u();
        }
    }

    public static <Z> u<Z> a(v<Z> vVar) {
        u<Z> a2 = f2656i.a();
        g.a.a.b.a.a(a2, "Argument must not be null");
        a2.f2659h = false;
        a2.f2658g = true;
        a2.f2657f = vVar;
        return a2;
    }

    public int b() {
        return this.f2657f.b();
    }

    public Class<Z> c() {
        return this.f2657f.c();
    }

    public synchronized void d() {
        this.e.a();
        this.f2659h = true;
        if (!this.f2658g) {
            this.f2657f.d();
            this.f2657f = null;
            f2656i.a(this);
        }
    }

    public d g() {
        return this.e;
    }

    public Z get() {
        return this.f2657f.get();
    }

    public synchronized void a() {
        this.e.a();
        if (this.f2658g) {
            this.f2658g = false;
            if (this.f2659h) {
                d();
            }
        } else {
            throw new IllegalStateException("Already unlocked");
        }
    }
}
