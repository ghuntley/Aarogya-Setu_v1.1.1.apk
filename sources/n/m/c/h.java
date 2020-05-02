package n.m.c;

import n.o.a;
import n.o.e;
import n.o.f;

/* compiled from: PropertyReference1 */
public abstract class h extends j implements f {
    public Object a(Object obj) {
        return get(obj);
    }

    public f.a c() {
        a a = a();
        if (a != this) {
            return ((f) ((e) a)).c();
        }
        throw new n.m.a();
    }
}
