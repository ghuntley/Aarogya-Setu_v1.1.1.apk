package f.a;

import f.a.a.b;
import i.a.a.a.a;
import n.k.c;
import n.k.e;
import n.k.i.a.d;
import n.m.c.f;

/* compiled from: Dispatched.kt */
public final class z<T> extends b0<T> implements d, c<T> {

    /* renamed from: h  reason: collision with root package name */
    public Object f868h;

    /* renamed from: i  reason: collision with root package name */
    public final d f869i;

    /* renamed from: j  reason: collision with root package name */
    public final Object f870j;

    /* renamed from: k  reason: collision with root package name */
    public final s f871k;

    /* renamed from: l  reason: collision with root package name */
    public final c<T> f872l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z(s sVar, c<? super T> cVar) {
        super(0);
        if (sVar == null) {
            f.a("dispatcher");
            throw null;
        } else if (cVar != null) {
            this.f871k = sVar;
            this.f872l = cVar;
            this.f868h = a0.a;
            this.f869i = (d) (!(cVar instanceof d) ? null : cVar);
            this.f870j = b.a(c());
        } else {
            f.a("continuation");
            throw null;
        }
    }

    public d a() {
        return this.f869i;
    }

    public StackTraceElement b() {
        return null;
    }

    public e c() {
        return this.f872l.c();
    }

    public c<T> e() {
        return this;
    }

    public Object f() {
        Object obj = this.f868h;
        if (x.a) {
            if (!(obj != a0.a)) {
                throw new AssertionError();
            }
        }
        this.f868h = a0.a;
        return obj;
    }

    public String toString() {
        StringBuilder a = a.a("DispatchedContinuation[");
        a.append(this.f871k);
        a.append(", ");
        a.append(i.c.d.p.e.b((c<?>) this.f872l));
        a.append(']');
        return a.toString();
    }

    public void a(Object obj) {
        e c;
        Object b2;
        e c2 = this.f872l.c();
        Object f2 = i.c.d.p.e.f(obj);
        if (this.f871k.b(c2)) {
            this.f868h = f2;
            this.f800g = 0;
            this.f871k.a(c2, this);
            return;
        }
        z0 z0Var = z0.f873b;
        f0 a = z0.a();
        if (a.m()) {
            this.f868h = f2;
            this.f800g = 0;
            a.a((b0<?>) this);
            return;
        }
        a.c(true);
        try {
            c = c();
            b2 = b.b(c, this.f870j);
            this.f872l.a(obj);
            b.a(c, b2);
            do {
            } while (a.o());
        } catch (Throwable th) {
            try {
                a(th, (Throwable) null);
            } catch (Throwable th2) {
                a.a(true);
                throw th2;
            }
        }
        a.a(true);
    }
}
