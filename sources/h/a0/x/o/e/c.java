package h.a0.x.o.e;

import h.a0.x.o.f.d;
import h.a0.x.q.p;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ConstraintController */
public abstract class c<T> implements h.a0.x.o.a<T> {
    public final List<String> a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public T f1023b;
    public d<T> c;
    public a d;

    /* compiled from: ConstraintController */
    public interface a {
    }

    public c(d<T> dVar) {
        this.c = dVar;
    }

    public void a(Iterable<p> iterable) {
        this.a.clear();
        for (p next : iterable) {
            if (a(next)) {
                this.a.add(next.a);
            }
        }
        if (this.a.isEmpty()) {
            this.c.b(this);
        } else {
            this.c.a(this);
        }
        a(this.d, this.f1023b);
    }

    public abstract boolean a(p pVar);

    public abstract boolean b(T t);

    public final void a(a aVar, T t) {
        if (!this.a.isEmpty() && aVar != null) {
            if (t == null || b(t)) {
                ((h.a0.x.o.d) aVar).b(this.a);
                return;
            }
            ((h.a0.x.o.d) aVar).a(this.a);
        }
    }

    public void a(T t) {
        this.f1023b = t;
        a(this.d, t);
    }
}
