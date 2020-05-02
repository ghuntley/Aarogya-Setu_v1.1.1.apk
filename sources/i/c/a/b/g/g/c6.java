package i.c.a.b.g.g;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.3.0 */
public class c6 extends AbstractSet<Map.Entry<K, V>> {
    public final /* synthetic */ x5 e;

    public /* synthetic */ c6(x5 x5Var, w5 w5Var) {
        this.e = x5Var;
    }

    public /* synthetic */ boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.e.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    public void clear() {
        this.e.clear();
    }

    public boolean contains(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.e.get(entry.getKey());
        Object value = entry.getValue();
        if (obj2 != value) {
            return obj2 != null && obj2.equals(value);
        }
        return true;
    }

    public Iterator<Map.Entry<K, V>> iterator() {
        return new d6(this.e, (w5) null);
    }

    public boolean remove(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.e.remove(entry.getKey());
        return true;
    }

    public int size() {
        return this.e.size();
    }
}
