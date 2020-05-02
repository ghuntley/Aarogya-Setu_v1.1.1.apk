package n.k;

import java.io.Serializable;
import n.k.e;
import n.m.b.c;
import n.m.c.f;

/* compiled from: CoroutineContextImpl.kt */
public final class g implements e, Serializable {
    public static final g e = new g();

    public <R> R fold(R r, c<? super R, ? super e.a, ? extends R> cVar) {
        if (cVar != null) {
            return r;
        }
        f.a("operation");
        throw null;
    }

    public <E extends e.a> E get(e.b<E> bVar) {
        if (bVar != null) {
            return null;
        }
        f.a("key");
        throw null;
    }

    public int hashCode() {
        return 0;
    }

    public e minusKey(e.b<?> bVar) {
        if (bVar != null) {
            return this;
        }
        f.a("key");
        throw null;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }
}
