package h.c.a.b;

import h.c.a.b.b;
import java.util.HashMap;

/* compiled from: FastSafeIterableMap */
public class a<K, V> extends b<K, V> {

    /* renamed from: i  reason: collision with root package name */
    public HashMap<K, b.c<K, V>> f1523i = new HashMap<>();

    public b.c<K, V> a(K k2) {
        return this.f1523i.get(k2);
    }

    public V b(K k2, V v) {
        b.c cVar = this.f1523i.get(k2);
        if (cVar != null) {
            return cVar.f1527f;
        }
        this.f1523i.put(k2, a(k2, v));
        return null;
    }

    public boolean contains(K k2) {
        return this.f1523i.containsKey(k2);
    }

    public V remove(K k2) {
        V remove = super.remove(k2);
        this.f1523i.remove(k2);
        return remove;
    }
}
