package n.k;

import java.io.Serializable;
import kotlin.TypeCastException;
import n.k.e;
import n.m.b.c;
import n.m.c.f;
import n.m.c.g;

/* compiled from: CoroutineContextImpl.kt */
public final class b implements e, Serializable {
    public final e e;

    /* renamed from: f  reason: collision with root package name */
    public final e.a f5207f;

    /* compiled from: CoroutineContextImpl.kt */
    public static final class a extends g implements c<String, e.a, String> {
        public static final a e = new a();

        public a() {
            super(2);
        }

        public Object a(Object obj, Object obj2) {
            String str = (String) obj;
            e.a aVar = (e.a) obj2;
            if (str == null) {
                f.a("acc");
                throw null;
            } else if (aVar != null) {
                if (str.length() == 0) {
                    return aVar.toString();
                }
                return str + ", " + aVar;
            } else {
                f.a("element");
                throw null;
            }
        }
    }

    public b(e eVar, e.a aVar) {
        if (eVar == null) {
            f.a("left");
            throw null;
        } else if (aVar != null) {
            this.e = eVar;
            this.f5207f = aVar;
        } else {
            f.a("element");
            throw null;
        }
    }

    public final int b() {
        int i2 = 2;
        b bVar = this;
        while (true) {
            e eVar = bVar.e;
            if (!(eVar instanceof b)) {
                eVar = null;
            }
            bVar = (b) eVar;
            if (bVar == null) {
                return i2;
            }
            i2++;
        }
    }

    public boolean equals(Object obj) {
        boolean z;
        if (this != obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (bVar.b() != b()) {
                return false;
            }
            if (bVar != null) {
                b bVar2 = this;
                while (true) {
                    e.a aVar = bVar2.f5207f;
                    if (!f.a((Object) bVar.get(aVar.getKey()), (Object) aVar)) {
                        z = false;
                        break;
                    }
                    e eVar = bVar2.e;
                    if (eVar instanceof b) {
                        bVar2 = (b) eVar;
                    } else if (eVar != null) {
                        e.a aVar2 = (e.a) eVar;
                        z = f.a((Object) bVar.get(aVar2.getKey()), (Object) aVar2);
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                    }
                }
                if (z) {
                    return true;
                }
                return false;
            }
            throw null;
        }
        return true;
    }

    public <R> R fold(R r, c<? super R, ? super e.a, ? extends R> cVar) {
        if (cVar != null) {
            return cVar.a(this.e.fold(r, cVar), this.f5207f);
        }
        f.a("operation");
        throw null;
    }

    public <E extends e.a> E get(e.b<E> bVar) {
        if (bVar != null) {
            b bVar2 = this;
            while (true) {
                E e2 = bVar2.f5207f.get(bVar);
                if (e2 != null) {
                    return e2;
                }
                e eVar = bVar2.e;
                if (!(eVar instanceof b)) {
                    return eVar.get(bVar);
                }
                bVar2 = (b) eVar;
            }
        } else {
            f.a("key");
            throw null;
        }
    }

    public int hashCode() {
        return this.f5207f.hashCode() + this.e.hashCode();
    }

    public e minusKey(e.b<?> bVar) {
        if (bVar == null) {
            f.a("key");
            throw null;
        } else if (this.f5207f.get(bVar) != null) {
            return this.e;
        } else {
            e minusKey = this.e.minusKey(bVar);
            if (minusKey == this.e) {
                return this;
            }
            if (minusKey == g.e) {
                return this.f5207f;
            }
            return new b(minusKey, this.f5207f);
        }
    }

    public String toString() {
        return i.a.a.a.a.a(i.a.a.a.a.a("["), (String) fold("", a.e), "]");
    }
}
