package i.c.a.b.g.g;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.3.0 */
public abstract class p2<E> extends AbstractList<E> implements d4<E> {
    public boolean e = true;

    public boolean a() {
        return this.e;
    }

    public boolean add(E e2) {
        c();
        return super.add(e2);
    }

    public boolean addAll(Collection<? extends E> collection) {
        c();
        return super.addAll(collection);
    }

    public final void c() {
        if (!this.e) {
            throw new UnsupportedOperationException();
        }
    }

    public void clear() {
        c();
        super.clear();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i2 = 0; i2 < size; i2++) {
            if (!get(i2).equals(list.get(i2))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int size = size();
        int i2 = 1;
        for (int i3 = 0; i3 < size; i3++) {
            i2 = (i2 * 31) + get(i3).hashCode();
        }
        return i2;
    }

    public final void l() {
        this.e = false;
    }

    public boolean remove(Object obj) {
        c();
        return super.remove(obj);
    }

    public boolean removeAll(Collection<?> collection) {
        c();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection<?> collection) {
        c();
        return super.retainAll(collection);
    }

    public boolean addAll(int i2, Collection<? extends E> collection) {
        c();
        return super.addAll(i2, collection);
    }
}
