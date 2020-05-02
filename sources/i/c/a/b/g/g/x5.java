package i.c.a.b.g.g;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.3.0 */
public class x5<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public List<a6> f3520f = Collections.emptyList();

    /* renamed from: g  reason: collision with root package name */
    public Map<K, V> f3521g = Collections.emptyMap();

    /* renamed from: h  reason: collision with root package name */
    public boolean f3522h;

    /* renamed from: i  reason: collision with root package name */
    public volatile c6 f3523i;

    /* renamed from: j  reason: collision with root package name */
    public Map<K, V> f3524j = Collections.emptyMap();

    public /* synthetic */ x5(int i2, w5 w5Var) {
        this.e = i2;
    }

    public static <FieldDescriptorType extends q3<FieldDescriptorType>> x5<FieldDescriptorType, Object> c(int i2) {
        return new w5(i2);
    }

    public void a() {
        Map<K, V> map;
        Map<K, V> map2;
        if (!this.f3522h) {
            if (this.f3521g.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = Collections.unmodifiableMap(this.f3521g);
            }
            this.f3521g = map;
            if (this.f3524j.isEmpty()) {
                map2 = Collections.emptyMap();
            } else {
                map2 = Collections.unmodifiableMap(this.f3524j);
            }
            this.f3524j = map2;
            this.f3522h = true;
        }
    }

    public final int b() {
        return this.f3520f.size();
    }

    public void clear() {
        d();
        if (!this.f3520f.isEmpty()) {
            this.f3520f.clear();
        }
        if (!this.f3521g.isEmpty()) {
            this.f3521g.clear();
        }
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f3521g.containsKey(comparable);
    }

    public final void d() {
        if (this.f3522h) {
            throw new UnsupportedOperationException();
        }
    }

    public final SortedMap<K, V> e() {
        d();
        if (this.f3521g.isEmpty() && !(this.f3521g instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f3521g = treeMap;
            this.f3524j = treeMap.descendingMap();
        }
        return (SortedMap) this.f3521g;
    }

    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f3523i == null) {
            this.f3523i = new c6(this, (w5) null);
        }
        return this.f3523i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x5)) {
            return super.equals(obj);
        }
        x5 x5Var = (x5) obj;
        int size = size();
        if (size != x5Var.size()) {
            return false;
        }
        int b2 = b();
        if (b2 != x5Var.b()) {
            return entrySet().equals(x5Var.entrySet());
        }
        for (int i2 = 0; i2 < b2; i2++) {
            if (!a(i2).equals(x5Var.a(i2))) {
                return false;
            }
        }
        if (b2 != size) {
            return this.f3521g.equals(x5Var.f3521g);
        }
        return true;
    }

    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a = a(comparable);
        if (a >= 0) {
            return this.f3520f.get(a).f3208f;
        }
        return this.f3521g.get(comparable);
    }

    public int hashCode() {
        int b2 = b();
        int i2 = 0;
        for (int i3 = 0; i3 < b2; i3++) {
            i2 += this.f3520f.get(i3).hashCode();
        }
        return this.f3521g.size() > 0 ? i2 + this.f3521g.hashCode() : i2;
    }

    public V remove(Object obj) {
        d();
        Comparable comparable = (Comparable) obj;
        int a = a(comparable);
        if (a >= 0) {
            return b(a);
        }
        if (this.f3521g.isEmpty()) {
            return null;
        }
        return this.f3521g.remove(comparable);
    }

    public int size() {
        return this.f3521g.size() + this.f3520f.size();
    }

    public final V b(int i2) {
        d();
        V v = this.f3520f.remove(i2).f3208f;
        if (!this.f3521g.isEmpty()) {
            Iterator it = e().entrySet().iterator();
            this.f3520f.add(new a6(this, (Map.Entry) it.next()));
            it.remove();
        }
        return v;
    }

    public final Iterable<Map.Entry<K, V>> c() {
        if (this.f3521g.isEmpty()) {
            return z5.f3552b;
        }
        return this.f3521g.entrySet();
    }

    public final Map.Entry<K, V> a(int i2) {
        return this.f3520f.get(i2);
    }

    /* renamed from: a */
    public final V put(K k2, V v) {
        d();
        int a = a(k2);
        if (a >= 0) {
            a6 a6Var = this.f3520f.get(a);
            a6Var.f3209g.d();
            V v2 = a6Var.f3208f;
            a6Var.f3208f = v;
            return v2;
        }
        d();
        if (this.f3520f.isEmpty() && !(this.f3520f instanceof ArrayList)) {
            this.f3520f = new ArrayList(this.e);
        }
        int i2 = -(a + 1);
        if (i2 >= this.e) {
            return e().put(k2, v);
        }
        int size = this.f3520f.size();
        int i3 = this.e;
        if (size == i3) {
            a6 remove = this.f3520f.remove(i3 - 1);
            e().put(remove.e, remove.f3208f);
        }
        this.f3520f.add(i2, new a6(this, k2, v));
        return null;
    }

    public final int a(K k2) {
        int size = this.f3520f.size() - 1;
        if (size >= 0) {
            int compareTo = k2.compareTo(this.f3520f.get(size).e);
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) / 2;
            int compareTo2 = k2.compareTo(this.f3520f.get(i3).e);
            if (compareTo2 < 0) {
                size = i3 - 1;
            } else if (compareTo2 <= 0) {
                return i3;
            } else {
                i2 = i3 + 1;
            }
        }
        return -(i2 + 1);
    }
}
