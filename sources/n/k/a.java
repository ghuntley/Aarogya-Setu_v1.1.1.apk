package n.k;

import n.k.e;
import n.m.b.c;
import n.m.c.f;

/* compiled from: CoroutineContextImpl.kt */
public abstract class a implements e.a {
    public final e.b<?> key;

    public a(e.b<?> bVar) {
        if (bVar != null) {
            this.key = bVar;
        } else {
            f.a("key");
            throw null;
        }
    }

    public <R> R fold(R r, c<? super R, ? super e.a, ? extends R> cVar) {
        if (cVar != null) {
            return e.a.C0149a.a(this, r, cVar);
        }
        f.a("operation");
        throw null;
    }

    public <E extends e.a> E get(e.b<E> bVar) {
        if (bVar != null) {
            return e.a.C0149a.a((e.a) this, bVar);
        }
        f.a("key");
        throw null;
    }

    public e.b<?> getKey() {
        return this.key;
    }

    public e minusKey(e.b<?> bVar) {
        if (bVar != null) {
            return e.a.C0149a.b(this, bVar);
        }
        f.a("key");
        throw null;
    }

    public e plus(e eVar) {
        if (eVar != null) {
            return e.a.C0149a.a((e.a) this, eVar);
        }
        f.a("context");
        throw null;
    }
}
