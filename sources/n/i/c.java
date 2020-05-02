package n.i;

import java.util.Iterator;

/* compiled from: Iterators.kt */
public abstract class c implements Iterator<Integer> {
    public abstract int b();

    public Object next() {
        return Integer.valueOf(b());
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
