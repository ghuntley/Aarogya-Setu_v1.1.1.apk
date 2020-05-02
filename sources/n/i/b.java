package n.i;

import i.a.a.a.a;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.TypeCastException;
import n.m.c.d;
import n.m.c.f;

/* compiled from: Collections.kt */
public final class b implements List, Serializable, RandomAccess {
    public static final b e = new b();

    public /* synthetic */ void add(int i2, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i2, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean contains(Object obj) {
        if (!(obj instanceof Void) || ((Void) obj) != null) {
            return false;
        }
        f.a("element");
        throw null;
    }

    public boolean containsAll(Collection collection) {
        if (collection != null) {
            return collection.isEmpty();
        }
        f.a("elements");
        throw null;
    }

    public boolean equals(Object obj) {
        return (obj instanceof List) && ((List) obj).isEmpty();
    }

    public Object get(int i2) {
        throw new IndexOutOfBoundsException("Empty list doesn't contain element at index " + i2 + '.');
    }

    public int hashCode() {
        return 1;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Void) || ((Void) obj) != null) {
            return -1;
        }
        f.a("element");
        throw null;
    }

    public boolean isEmpty() {
        return true;
    }

    public Iterator iterator() {
        return a.e;
    }

    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Void) || ((Void) obj) != null) {
            return -1;
        }
        f.a("element");
        throw null;
    }

    public ListIterator listIterator() {
        return a.e;
    }

    public /* synthetic */ Object remove(int i2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ Object set(int i2, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final int size() {
        return 0;
    }

    public List subList(int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return this;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i2 + ", toIndex: " + i3);
    }

    public Object[] toArray() {
        int size = size();
        if (size != 0) {
            Iterator it = iterator();
            if (it.hasNext()) {
                Object[] objArr = new Object[size];
                int i2 = 0;
                while (true) {
                    int i3 = i2 + 1;
                    objArr[i2] = it.next();
                    if (i3 >= objArr.length) {
                        if (!it.hasNext()) {
                            return objArr;
                        }
                        int i4 = ((i3 * 3) + 1) >>> 1;
                        if (i4 <= i3) {
                            if (i3 < 2147483645) {
                                i4 = 2147483645;
                            } else {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArr = Arrays.copyOf(objArr, i4);
                        f.a((Object) objArr, "Arrays.copyOf(result, newSize)");
                    } else if (!it.hasNext()) {
                        Object[] copyOf = Arrays.copyOf(objArr, i3);
                        f.a((Object) copyOf, "Arrays.copyOf(result, size)");
                        return copyOf;
                    }
                    i2 = i3;
                }
            }
        }
        return d.a;
    }

    public String toString() {
        return "[]";
    }

    public ListIterator listIterator(int i2) {
        if (i2 == 0) {
            return a.e;
        }
        throw new IndexOutOfBoundsException(a.b("Index: ", i2));
    }

    public <T> T[] toArray(T[] tArr) {
        T[] tArr2;
        if (tArr != null) {
            int size = size();
            int i2 = 0;
            if (size != 0) {
                Iterator it = iterator();
                if (it.hasNext()) {
                    if (size <= tArr.length) {
                        tArr2 = tArr;
                    } else {
                        Object newInstance = Array.newInstance(tArr.getClass().getComponentType(), size);
                        if (newInstance != null) {
                            tArr2 = (Object[]) newInstance;
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                        }
                    }
                    while (true) {
                        int i3 = i2 + 1;
                        tArr2[i2] = it.next();
                        if (i3 >= tArr2.length) {
                            if (!it.hasNext()) {
                                return tArr2;
                            }
                            int i4 = ((i3 * 3) + 1) >>> 1;
                            if (i4 <= i3) {
                                if (i3 < 2147483645) {
                                    i4 = 2147483645;
                                } else {
                                    throw new OutOfMemoryError();
                                }
                            }
                            tArr2 = Arrays.copyOf(tArr2, i4);
                            f.a((Object) tArr2, "Arrays.copyOf(result, newSize)");
                        } else if (!it.hasNext()) {
                            if (tArr2 == tArr) {
                                tArr[i3] = null;
                                return tArr;
                            }
                            T[] copyOf = Arrays.copyOf(tArr2, i3);
                            f.a((Object) copyOf, "Arrays.copyOf(result, size)");
                            return copyOf;
                        }
                        i2 = i3;
                    }
                } else if (tArr.length <= 0) {
                    return tArr;
                } else {
                    tArr[0] = null;
                    return tArr;
                }
            } else if (tArr.length <= 0) {
                return tArr;
            } else {
                tArr[0] = null;
                return tArr;
            }
        } else {
            throw null;
        }
    }
}
