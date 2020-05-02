package n.k;

import n.m.b.c;
import n.m.c.f;

/* compiled from: CoroutineContext.kt */
public interface e {

    /* compiled from: CoroutineContext.kt */
    public interface b<E extends a> {
    }

    <R> R fold(R r, c<? super R, ? super a, ? extends R> cVar);

    <E extends a> E get(b<E> bVar);

    e minusKey(b<?> bVar);

    /* compiled from: CoroutineContext.kt */
    public interface a extends e {
        <E extends a> E get(b<E> bVar);

        b<?> getKey();

        /* renamed from: n.k.e$a$a  reason: collision with other inner class name */
        /* compiled from: CoroutineContext.kt */
        public static final class C0149a {
            public static e a(a aVar, e eVar) {
                if (eVar != null) {
                    return eVar == g.e ? aVar : (e) eVar.fold(aVar, f.e);
                }
                f.a("context");
                throw null;
            }

            public static e b(a aVar, b<?> bVar) {
                if (bVar != null) {
                    return f.a((Object) aVar.getKey(), (Object) bVar) ? g.e : aVar;
                }
                f.a("key");
                throw null;
            }

            public static <E extends a> E a(a aVar, b<E> bVar) {
                if (bVar == null) {
                    f.a("key");
                    throw null;
                } else if (f.a((Object) aVar.getKey(), (Object) bVar)) {
                    return aVar;
                } else {
                    return null;
                }
            }

            public static <R> R a(a aVar, R r, c<? super R, ? super a, ? extends R> cVar) {
                if (cVar != null) {
                    return cVar.a(r, aVar);
                }
                f.a("operation");
                throw null;
            }
        }
    }
}
