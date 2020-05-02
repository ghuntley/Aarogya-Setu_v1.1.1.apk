package n.i;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: Collections.kt */
public final class a implements ListIterator {
    public static final a e = new a();

    public /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean hasNext() {
        return false;
    }

    public boolean hasPrevious() {
        return false;
    }

    public Object next() {
        throw new NoSuchElementException();
    }

    public int nextIndex() {
        return 0;
    }

    public Object previous() {
        throw new NoSuchElementException();
    }

    public int previousIndex() {
        return -1;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
