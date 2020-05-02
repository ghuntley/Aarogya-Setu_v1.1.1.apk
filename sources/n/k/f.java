package n.k;

import n.k.e;
import n.m.b.c;
import n.m.c.g;

/* compiled from: CoroutineContext.kt */
public final class f extends g implements c<e, e.a, e> {
    public static final f e = new f();

    public f() {
        super(2);
    }

    public Object a(Object obj, Object obj2) {
        e eVar = (e) obj;
        e.a aVar = (e.a) obj2;
        if (eVar == null) {
            n.m.c.f.a("acc");
            throw null;
        } else if (aVar != null) {
            e minusKey = eVar.minusKey(aVar.getKey());
            if (minusKey == g.e) {
                return aVar;
            }
            d dVar = (d) minusKey.get(d.f5208b);
            if (dVar == null) {
                return new b(minusKey, aVar);
            }
            e minusKey2 = minusKey.minusKey(d.f5208b);
            if (minusKey2 == g.e) {
                return new b(aVar, dVar);
            }
            return new b(new b(minusKey2, aVar), dVar);
        } else {
            n.m.c.f.a("element");
            throw null;
        }
    }
}
