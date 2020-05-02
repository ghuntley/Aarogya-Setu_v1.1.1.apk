package h.e;

import h.e.g;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: ArrayMap */
public class a<K, V> extends h<K, V> implements Map<K, V> {

    /* renamed from: l  reason: collision with root package name */
    public g<K, V> f1539l;

    /* renamed from: h.e.a$a  reason: collision with other inner class name */
    /* compiled from: ArrayMap */
    public class C0041a extends g<K, V> {
        public C0041a() {
        }

        public Object a(int i2, int i3) {
            return a.this.f1569f[(i2 << 1) + i3];
        }

        public int b(Object obj) {
            return a.this.b(obj);
        }

        public int c() {
            return a.this.f1570g;
        }

        public int a(Object obj) {
            return a.this.a(obj);
        }

        public Map<K, V> b() {
            return a.this;
        }

        public void a(K k2, V v) {
            a.this.put(k2, v);
        }

        public V a(int i2, V v) {
            return a.this.a(i2, v);
        }

        public void a(int i2) {
            a.this.d(i2);
        }

        public void a() {
            a.this.clear();
        }
    }

    public a() {
    }

    public final g<K, V> b() {
        if (this.f1539l == null) {
            this.f1539l = new C0041a();
        }
        return this.f1539l;
    }

    public Set<Map.Entry<K, V>> entrySet() {
        g b2 = b();
        if (b2.a == null) {
            b2.a = new g.b();
        }
        return b2.a;
    }

    public Set<K> keySet() {
        g b2 = b();
        if (b2.f1557b == null) {
            b2.f1557b = new g.c();
        }
        return b2.f1557b;
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        b(map.size() + this.f1570g);
        for (Map.Entry next : map.entrySet()) {
            put(next.getKey(), next.getValue());
        }
    }

    public Collection<V> values() {
        g b2 = b();
        if (b2.c == null) {
            b2.c = new g.e();
        }
        return b2.c;
    }

    public a(int i2) {
        super(i2);
    }

    public a(h hVar) {
        if (hVar != null) {
            a(hVar);
        }
    }
}
