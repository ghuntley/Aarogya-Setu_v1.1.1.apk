package i.c.f;

import i.c.f.l;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ProtobufArrayList */
public final class r<E> extends c<E> {

    /* renamed from: g  reason: collision with root package name */
    public static final r<Object> f4965g;

    /* renamed from: f  reason: collision with root package name */
    public final List<E> f4966f;

    static {
        r<Object> rVar = new r<>();
        f4965g = rVar;
        rVar.e = false;
    }

    public r() {
        this.f4966f = new ArrayList(10);
    }

    public void add(int i2, E e) {
        c();
        this.f4966f.add(i2, e);
        this.modCount++;
    }

    public l.b c(int i2) {
        if (i2 >= size()) {
            ArrayList arrayList = new ArrayList(i2);
            arrayList.addAll(this.f4966f);
            return new r(arrayList);
        }
        throw new IllegalArgumentException();
    }

    public E get(int i2) {
        return this.f4966f.get(i2);
    }

    public E remove(int i2) {
        c();
        E remove = this.f4966f.remove(i2);
        this.modCount++;
        return remove;
    }

    public E set(int i2, E e) {
        c();
        E e2 = this.f4966f.set(i2, e);
        this.modCount++;
        return e2;
    }

    public int size() {
        return this.f4966f.size();
    }

    public r(List<E> list) {
        this.f4966f = list;
    }
}
