package i.c.f;

import i.c.f.j;
import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: SmallSortedMap */
public class s<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public List<s<K, V>.defpackage.c> f4967f = Collections.emptyList();

    /* renamed from: g  reason: collision with root package name */
    public Map<K, V> f4968g = Collections.emptyMap();

    /* renamed from: h  reason: collision with root package name */
    public boolean f4969h;

    /* renamed from: i  reason: collision with root package name */
    public volatile s<K, V>.defpackage.e f4970i;

    /* compiled from: SmallSortedMap */
    public static class a extends s<FieldDescriptorType, Object> {
        public a(int i2) {
            super(i2, (a) null);
        }

        public void e() {
            if (!this.f4969h) {
                for (int i2 = 0; i2 < b(); i2++) {
                    Map.Entry a = a(i2);
                    if (((j.a) a.getKey()).i()) {
                        a.setValue(Collections.unmodifiableList((List) a.getValue()));
                    }
                }
                for (Map.Entry entry : c()) {
                    if (((j.a) entry.getKey()).i()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            s.super.e();
        }

        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return s.super.put((j.a) obj, obj2);
        }
    }

    /* compiled from: SmallSortedMap */
    public static class b {
        public static final Iterator<Object> a = new a();

        /* renamed from: b  reason: collision with root package name */
        public static final Iterable<Object> f4971b = new C0143b();

        /* compiled from: SmallSortedMap */
        public static class a implements Iterator<Object> {
            public boolean hasNext() {
                return false;
            }

            public Object next() {
                throw new NoSuchElementException();
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        /* renamed from: i.c.f.s$b$b  reason: collision with other inner class name */
        /* compiled from: SmallSortedMap */
        public static class C0143b implements Iterable<Object> {
            public Iterator<Object> iterator() {
                return b.a;
            }
        }
    }

    /* compiled from: SmallSortedMap */
    public class d implements Iterator<Map.Entry<K, V>> {
        public int e = -1;

        /* renamed from: f  reason: collision with root package name */
        public boolean f4974f;

        /* renamed from: g  reason: collision with root package name */
        public Iterator<Map.Entry<K, V>> f4975g;

        public /* synthetic */ d(a aVar) {
        }

        public final Iterator<Map.Entry<K, V>> b() {
            if (this.f4975g == null) {
                this.f4975g = s.this.f4968g.entrySet().iterator();
            }
            return this.f4975g;
        }

        public boolean hasNext() {
            if (this.e + 1 < s.this.f4967f.size() || b().hasNext()) {
                return true;
            }
            return false;
        }

        public Object next() {
            this.f4974f = true;
            int i2 = this.e + 1;
            this.e = i2;
            if (i2 < s.this.f4967f.size()) {
                return s.this.f4967f.get(this.e);
            }
            return (Map.Entry) b().next();
        }

        public void remove() {
            if (this.f4974f) {
                this.f4974f = false;
                s.this.a();
                if (this.e < s.this.f4967f.size()) {
                    s sVar = s.this;
                    int i2 = this.e;
                    this.e = i2 - 1;
                    sVar.b(i2);
                    return;
                }
                b().remove();
                return;
            }
            throw new IllegalStateException("remove() was called before next()");
        }
    }

    /* compiled from: SmallSortedMap */
    public class e extends AbstractSet<Map.Entry<K, V>> {
        public /* synthetic */ e(a aVar) {
        }

        public boolean add(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (contains(entry)) {
                return false;
            }
            s.this.put((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        public void clear() {
            s.this.clear();
        }

        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = s.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new d((a) null);
        }

        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            s.this.remove(entry.getKey());
            return true;
        }

        public int size() {
            return s.this.size();
        }
    }

    public /* synthetic */ s(int i2, a aVar) {
        this.e = i2;
    }

    public static <FieldDescriptorType extends j.a<FieldDescriptorType>> s<FieldDescriptorType, Object> c(int i2) {
        return new a(i2);
    }

    public int b() {
        return this.f4967f.size();
    }

    public void clear() {
        a();
        if (!this.f4967f.isEmpty()) {
            this.f4967f.clear();
        }
        if (!this.f4968g.isEmpty()) {
            this.f4968g.clear();
        }
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f4968g.containsKey(comparable);
    }

    public final SortedMap<K, V> d() {
        a();
        if (this.f4968g.isEmpty() && !(this.f4968g instanceof TreeMap)) {
            this.f4968g = new TreeMap();
        }
        return (SortedMap) this.f4968g;
    }

    public void e() {
        Map<K, V> map;
        if (!this.f4969h) {
            if (this.f4968g.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = Collections.unmodifiableMap(this.f4968g);
            }
            this.f4968g = map;
            this.f4969h = true;
        }
    }

    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f4970i == null) {
            this.f4970i = new e((a) null);
        }
        return this.f4970i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return super.equals(obj);
        }
        s sVar = (s) obj;
        int size = size();
        if (size != sVar.size()) {
            return false;
        }
        int b2 = b();
        if (b2 != sVar.b()) {
            return entrySet().equals(sVar.entrySet());
        }
        for (int i2 = 0; i2 < b2; i2++) {
            if (!a(i2).equals(sVar.a(i2))) {
                return false;
            }
        }
        if (b2 != size) {
            return this.f4968g.equals(sVar.f4968g);
        }
        return true;
    }

    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a2 = a(comparable);
        if (a2 >= 0) {
            return this.f4967f.get(a2).f4972f;
        }
        return this.f4968g.get(comparable);
    }

    public int hashCode() {
        int b2 = b();
        int i2 = 0;
        for (int i3 = 0; i3 < b2; i3++) {
            i2 += this.f4967f.get(i3).hashCode();
        }
        return this.f4968g.size() > 0 ? i2 + this.f4968g.hashCode() : i2;
    }

    public V remove(Object obj) {
        a();
        Comparable comparable = (Comparable) obj;
        int a2 = a(comparable);
        if (a2 >= 0) {
            return b(a2);
        }
        if (this.f4968g.isEmpty()) {
            return null;
        }
        return this.f4968g.remove(comparable);
    }

    public int size() {
        return this.f4968g.size() + this.f4967f.size();
    }

    public Map.Entry<K, V> a(int i2) {
        return this.f4967f.get(i2);
    }

    public final V b(int i2) {
        a();
        V v = this.f4967f.remove(i2).f4972f;
        if (!this.f4968g.isEmpty()) {
            Iterator it = d().entrySet().iterator();
            this.f4967f.add(new c(this, (Map.Entry) it.next()));
            it.remove();
        }
        return v;
    }

    public Iterable<Map.Entry<K, V>> c() {
        if (this.f4968g.isEmpty()) {
            return b.f4971b;
        }
        return this.f4968g.entrySet();
    }

    /* renamed from: a */
    public V put(K k2, V v) {
        a();
        int a2 = a(k2);
        if (a2 >= 0) {
            c cVar = this.f4967f.get(a2);
            s.this.a();
            V v2 = cVar.f4972f;
            cVar.f4972f = v;
            return v2;
        }
        a();
        if (this.f4967f.isEmpty() && !(this.f4967f instanceof ArrayList)) {
            this.f4967f = new ArrayList(this.e);
        }
        int i2 = -(a2 + 1);
        if (i2 >= this.e) {
            return d().put(k2, v);
        }
        int size = this.f4967f.size();
        int i3 = this.e;
        if (size == i3) {
            c remove = this.f4967f.remove(i3 - 1);
            d().put(remove.e, remove.f4972f);
        }
        this.f4967f.add(i2, new c(k2, v));
        return null;
    }

    /* compiled from: SmallSortedMap */
    public class c implements Map.Entry<K, V>, Comparable<s<K, V>.defpackage.c> {
        public final K e;

        /* renamed from: f  reason: collision with root package name */
        public V f4972f;

        public c(s sVar, Map.Entry<K, V> entry) {
            V value = entry.getValue();
            s.this = sVar;
            this.e = (Comparable) entry.getKey();
            this.f4972f = value;
        }

        public int compareTo(Object obj) {
            return this.e.compareTo(((c) obj).e);
        }

        public boolean equals(Object obj) {
            boolean z;
            boolean z2;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            K k2 = this.e;
            Object key = entry.getKey();
            if (k2 == null) {
                z = key == null;
            } else {
                z = k2.equals(key);
            }
            if (z) {
                V v = this.f4972f;
                Object value = entry.getValue();
                if (v == null) {
                    z2 = value == null;
                } else {
                    z2 = v.equals(value);
                }
                if (z2) {
                    return true;
                }
            }
            return false;
        }

        public Object getKey() {
            return this.e;
        }

        public V getValue() {
            return this.f4972f;
        }

        public int hashCode() {
            K k2 = this.e;
            int i2 = 0;
            int hashCode = k2 == null ? 0 : k2.hashCode();
            V v = this.f4972f;
            if (v != null) {
                i2 = v.hashCode();
            }
            return hashCode ^ i2;
        }

        public V setValue(V v) {
            s.this.a();
            V v2 = this.f4972f;
            this.f4972f = v;
            return v2;
        }

        public String toString() {
            return this.e + "=" + this.f4972f;
        }

        public c(K k2, V v) {
            this.e = k2;
            this.f4972f = v;
        }
    }

    public final int a(K k2) {
        int size = this.f4967f.size() - 1;
        if (size >= 0) {
            int compareTo = k2.compareTo(this.f4967f.get(size).e);
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
            int compareTo2 = k2.compareTo(this.f4967f.get(i3).e);
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

    public final void a() {
        if (this.f4969h) {
            throw new UnsupportedOperationException();
        }
    }
}
