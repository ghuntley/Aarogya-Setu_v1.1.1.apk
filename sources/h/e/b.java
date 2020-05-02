package h.e;

import java.util.Map;

/* compiled from: ArraySet */
public class b extends g<E, E> {
    public final /* synthetic */ c d;

    public b(c cVar) {
        this.d = cVar;
    }

    public Object a(int i2, int i3) {
        return this.d.f1546f[i2];
    }

    public int b(Object obj) {
        return this.d.indexOf(obj);
    }

    public int c() {
        return this.d.f1547g;
    }

    public int a(Object obj) {
        return this.d.indexOf(obj);
    }

    public Map<E, E> b() {
        throw new UnsupportedOperationException("not a map");
    }

    public void a(E e, E e2) {
        this.d.add(e);
    }

    public E a(int i2, E e) {
        throw new UnsupportedOperationException("not a map");
    }

    public void a(int i2) {
        this.d.d(i2);
    }

    public void a() {
        this.d.clear();
    }
}
