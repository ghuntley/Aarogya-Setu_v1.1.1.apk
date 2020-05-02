package i.c.a.b.g.g;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.3.0 */
public final class k6 extends AbstractList<String> implements l4, RandomAccess {
    public final l4 e;

    public k6(l4 l4Var) {
        this.e = l4Var;
    }

    public final void a(u2 u2Var) {
        throw new UnsupportedOperationException();
    }

    public final Object b(int i2) {
        return this.e.b(i2);
    }

    public final l4 g() {
        return this;
    }

    public final /* synthetic */ Object get(int i2) {
        return (String) this.e.get(i2);
    }

    public final Iterator<String> iterator() {
        return new m6(this);
    }

    public final ListIterator<String> listIterator(int i2) {
        return new j6(this, i2);
    }

    public final int size() {
        return this.e.size();
    }

    public final List<?> b() {
        return this.e.b();
    }
}
