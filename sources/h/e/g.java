package h.e;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: MapCollections */
public abstract class g<K, V> {
    public g<K, V>.b a;

    /* renamed from: b  reason: collision with root package name */
    public g<K, V>.defpackage.c f1557b;
    public g<K, V>.defpackage.e c;

    /* compiled from: MapCollections */
    public final class a<T> implements Iterator<T> {
        public final int e;

        /* renamed from: f  reason: collision with root package name */
        public int f1558f;

        /* renamed from: g  reason: collision with root package name */
        public int f1559g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f1560h = false;

        public a(int i2) {
            this.e = i2;
            this.f1558f = g.this.c();
        }

        public boolean hasNext() {
            return this.f1559g < this.f1558f;
        }

        public T next() {
            if (hasNext()) {
                T a = g.this.a(this.f1559g, this.e);
                this.f1559g++;
                this.f1560h = true;
                return a;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            if (this.f1560h) {
                int i2 = this.f1559g - 1;
                this.f1559g = i2;
                this.f1558f--;
                this.f1560h = false;
                g.this.a(i2);
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* compiled from: MapCollections */
    public final class b implements Set<Map.Entry<K, V>> {
        public b() {
        }

        public boolean add(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int c = g.this.c();
            for (Map.Entry entry : collection) {
                g.this.a(entry.getKey(), entry.getValue());
            }
            return c != g.this.c();
        }

        public void clear() {
            g.this.a();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int a = g.this.a(entry.getKey());
            if (a < 0) {
                return false;
            }
            return d.a(g.this.a(a, 1), entry.getValue());
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object obj) {
            return g.a(this, obj);
        }

        public int hashCode() {
            int i2;
            int i3;
            int i4 = 0;
            for (int c = g.this.c() - 1; c >= 0; c--) {
                Object a = g.this.a(c, 0);
                Object a2 = g.this.a(c, 1);
                if (a == null) {
                    i2 = 0;
                } else {
                    i2 = a.hashCode();
                }
                if (a2 == null) {
                    i3 = 0;
                } else {
                    i3 = a2.hashCode();
                }
                i4 += i2 ^ i3;
            }
            return i4;
        }

        public boolean isEmpty() {
            return g.this.c() == 0;
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new d();
        }

        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public int size() {
            return g.this.c();
        }

        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: MapCollections */
    public final class c implements Set<K> {
        public c() {
        }

        public boolean add(K k2) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            g.this.a();
        }

        public boolean contains(Object obj) {
            return g.this.a(obj) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            Map b2 = g.this.b();
            for (Object containsKey : collection) {
                if (!b2.containsKey(containsKey)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object obj) {
            return g.a(this, obj);
        }

        public int hashCode() {
            int i2;
            int i3 = 0;
            for (int c = g.this.c() - 1; c >= 0; c--) {
                Object a = g.this.a(c, 0);
                if (a == null) {
                    i2 = 0;
                } else {
                    i2 = a.hashCode();
                }
                i3 += i2;
            }
            return i3;
        }

        public boolean isEmpty() {
            return g.this.c() == 0;
        }

        public Iterator<K> iterator() {
            return new a(0);
        }

        public boolean remove(Object obj) {
            int a = g.this.a(obj);
            if (a < 0) {
                return false;
            }
            g.this.a(a);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            Map b2 = g.this.b();
            int size = b2.size();
            for (Object remove : collection) {
                b2.remove(remove);
            }
            return size != b2.size();
        }

        public boolean retainAll(Collection<?> collection) {
            return g.a(g.this.b(), collection);
        }

        public int size() {
            return g.this.c();
        }

        public Object[] toArray() {
            return g.this.b(0);
        }

        public <T> T[] toArray(T[] tArr) {
            return g.this.a(tArr, 0);
        }
    }

    /* compiled from: MapCollections */
    public final class d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {
        public int e;

        /* renamed from: f  reason: collision with root package name */
        public int f1562f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f1563g = false;

        public d() {
            this.e = g.this.c() - 1;
            this.f1562f = -1;
        }

        public boolean equals(Object obj) {
            if (!this.f1563g) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            } else if (!(obj instanceof Map.Entry)) {
                return false;
            } else {
                Map.Entry entry = (Map.Entry) obj;
                if (!d.a(entry.getKey(), g.this.a(this.f1562f, 0)) || !d.a(entry.getValue(), g.this.a(this.f1562f, 1))) {
                    return false;
                }
                return true;
            }
        }

        public K getKey() {
            if (this.f1563g) {
                return g.this.a(this.f1562f, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public V getValue() {
            if (this.f1563g) {
                return g.this.a(this.f1562f, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public boolean hasNext() {
            return this.f1562f < this.e;
        }

        public int hashCode() {
            int i2;
            if (this.f1563g) {
                int i3 = 0;
                Object a = g.this.a(this.f1562f, 0);
                Object a2 = g.this.a(this.f1562f, 1);
                if (a == null) {
                    i2 = 0;
                } else {
                    i2 = a.hashCode();
                }
                if (a2 != null) {
                    i3 = a2.hashCode();
                }
                return i2 ^ i3;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public Object next() {
            if (hasNext()) {
                this.f1562f++;
                this.f1563g = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            if (this.f1563g) {
                g.this.a(this.f1562f);
                this.f1562f--;
                this.e--;
                this.f1563g = false;
                return;
            }
            throw new IllegalStateException();
        }

        public V setValue(V v) {
            if (this.f1563g) {
                return g.this.a(this.f1562f, v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* compiled from: MapCollections */
    public final class e implements Collection<V> {
        public e() {
        }

        public boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            g.this.a();
        }

        public boolean contains(Object obj) {
            return g.this.b(obj) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public boolean isEmpty() {
            return g.this.c() == 0;
        }

        public Iterator<V> iterator() {
            return new a(1);
        }

        public boolean remove(Object obj) {
            int b2 = g.this.b(obj);
            if (b2 < 0) {
                return false;
            }
            g.this.a(b2);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            int c = g.this.c();
            int i2 = 0;
            boolean z = false;
            while (i2 < c) {
                if (collection.contains(g.this.a(i2, 1))) {
                    g.this.a(i2);
                    i2--;
                    c--;
                    z = true;
                }
                i2++;
            }
            return z;
        }

        public boolean retainAll(Collection<?> collection) {
            int c = g.this.c();
            int i2 = 0;
            boolean z = false;
            while (i2 < c) {
                if (!collection.contains(g.this.a(i2, 1))) {
                    g.this.a(i2);
                    i2--;
                    c--;
                    z = true;
                }
                i2++;
            }
            return z;
        }

        public int size() {
            return g.this.c();
        }

        public Object[] toArray() {
            return g.this.b(1);
        }

        public <T> T[] toArray(T[] tArr) {
            return g.this.a(tArr, 1);
        }
    }

    public static <K, V> boolean a(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    public abstract int a(Object obj);

    public abstract Object a(int i2, int i3);

    public abstract V a(int i2, V v);

    public abstract void a();

    public abstract void a(int i2);

    public abstract void a(K k2, V v);

    public abstract int b(Object obj);

    public abstract Map<K, V> b();

    public Object[] b(int i2) {
        int c2 = c();
        Object[] objArr = new Object[c2];
        for (int i3 = 0; i3 < c2; i3++) {
            objArr[i3] = a(i3, i2);
        }
        return objArr;
    }

    public abstract int c();

    public <T> T[] a(T[] tArr, int i2) {
        int c2 = c();
        if (tArr.length < c2) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), c2);
        }
        for (int i3 = 0; i3 < c2; i3++) {
            tArr[i3] = a(i3, i2);
        }
        if (tArr.length > c2) {
            tArr[c2] = null;
        }
        return tArr;
    }

    public static <T> boolean a(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() != set2.size() || !set.containsAll(set2)) {
                    return false;
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }
}
