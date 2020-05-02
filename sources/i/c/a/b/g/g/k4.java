package i.c.a.b.g.g;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.3.0 */
public final class k4<K> implements Iterator<Map.Entry<K, Object>> {
    public Iterator<Map.Entry<K, Object>> e;

    public k4(Iterator<Map.Entry<K, Object>> it) {
        this.e = it;
    }

    public final boolean hasNext() {
        return this.e.hasNext();
    }

    public final /* synthetic */ Object next() {
        Map.Entry next = this.e.next();
        return next.getValue() instanceof f4 ? new h4(next, (i4) null) : next;
    }

    public final void remove() {
        this.e.remove();
    }
}
