package n.m.c;

import java.io.Serializable;
import n.o.e;

/* compiled from: CallableReference */
public abstract class a implements n.o.a, Serializable {

    /* renamed from: g  reason: collision with root package name */
    public static final Object f5214g = C0151a.e;
    public transient n.o.a e;

    /* renamed from: f  reason: collision with root package name */
    public final Object f5215f = f5214g;

    /* renamed from: n.m.c.a$a  reason: collision with other inner class name */
    /* compiled from: CallableReference */
    public static class C0151a implements Serializable {
        public static final C0151a e = new C0151a();
    }

    public n.o.a a() {
        n.o.a aVar = this.e;
        if (aVar != null) {
            return aVar;
        }
        h hVar = (h) this;
        k.a(hVar);
        this.e = hVar;
        return hVar;
    }

    public Object a(Object... objArr) {
        j jVar = (j) this;
        n.o.a a = jVar.a();
        if (a != jVar) {
            return ((e) a).a(objArr);
        }
        throw new n.m.a();
    }
}
