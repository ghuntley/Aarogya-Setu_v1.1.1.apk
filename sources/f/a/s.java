package f.a;

import n.k.a;
import n.k.c;
import n.k.d;
import n.k.e;
import n.k.g;
import n.m.c.f;

/* compiled from: CoroutineDispatcher.kt */
public abstract class s extends a implements d {
    public s() {
        super(d.f5208b);
    }

    public void a(c<?> cVar) {
        if (cVar == null) {
            f.a("continuation");
            throw null;
        }
    }

    public abstract void a(e eVar, Runnable runnable);

    public final <T> c<T> b(c<? super T> cVar) {
        if (cVar != null) {
            return new z(this, cVar);
        }
        f.a("continuation");
        throw null;
    }

    public <E extends e.a> E get(e.b<E> bVar) {
        if (bVar == null) {
            f.a("key");
            throw null;
        } else if (bVar == d.f5208b) {
            return this;
        } else {
            return null;
        }
    }

    public e minusKey(e.b<?> bVar) {
        if (bVar != null) {
            return bVar == d.f5208b ? g.e : this;
        }
        f.a("key");
        throw null;
    }

    public String toString() {
        return i.c.d.p.e.b((Object) this) + '@' + i.c.d.p.e.c((Object) this);
    }

    public boolean b(e eVar) {
        if (eVar != null) {
            return true;
        }
        f.a("context");
        throw null;
    }
}
