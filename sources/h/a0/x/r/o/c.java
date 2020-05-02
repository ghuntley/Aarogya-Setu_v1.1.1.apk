package h.a0.x.r.o;

import h.a0.x.r.o.a;

/* compiled from: SettableFuture */
public final class c<V> extends a<V> {
    public boolean a(Throwable th) {
        if (th != null) {
            if (!a.f1103j.a((a<?>) this, (Object) null, (Object) new a.d(th))) {
                return false;
            }
            a.a((a<?>) this);
            return true;
        }
        throw null;
    }

    public boolean b(i.c.b.a.a.a<? extends V> aVar) {
        a.g gVar;
        a.d dVar;
        if (aVar != null) {
            Object obj = this.e;
            if (obj == null) {
                if (aVar.isDone()) {
                    if (!a.f1103j.a((a<?>) this, (Object) null, a.a((i.c.b.a.a.a<?>) aVar))) {
                        return false;
                    }
                    a.a((a<?>) this);
                } else {
                    gVar = new a.g(this, aVar);
                    if (a.f1103j.a((a<?>) this, (Object) null, (Object) gVar)) {
                        try {
                            ((a) aVar).a(gVar, b.INSTANCE);
                        } catch (Throwable unused) {
                            dVar = a.d.f1108b;
                        }
                    } else {
                        obj = this.e;
                    }
                }
                return true;
            }
            if (!(obj instanceof a.c)) {
                return false;
            }
            aVar.cancel(((a.c) obj).a);
            return false;
        }
        throw null;
        a.f1103j.a((a<?>) this, (Object) gVar, (Object) dVar);
        return true;
    }

    public boolean c(V v) {
        if (v == null) {
            v = a.f1104k;
        }
        if (!a.f1103j.a((a<?>) this, (Object) null, (Object) v)) {
            return false;
        }
        a.a((a<?>) this);
        return true;
    }
}
