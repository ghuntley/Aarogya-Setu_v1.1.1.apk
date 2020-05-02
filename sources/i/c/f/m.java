package i.c.f;

import java.util.Iterator;
import java.util.Map;

/* compiled from: LazyField */
public class m extends n {

    /* compiled from: LazyField */
    public static class b<K> implements Map.Entry<K, Object> {
        public Map.Entry<K, m> e;

        public /* synthetic */ b(Map.Entry entry, a aVar) {
            this.e = entry;
        }

        public K getKey() {
            return this.e.getKey();
        }

        public Object getValue() {
            m value = this.e.getValue();
            if (value == null) {
                return null;
            }
            return value.a();
        }

        public Object setValue(Object obj) {
            if (obj instanceof o) {
                m value = this.e.getValue();
                o oVar = value.f4964b;
                value.a = null;
                value.f4964b = (o) obj;
                return oVar;
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
    }

    /* compiled from: LazyField */
    public static class c<K> implements Iterator<Map.Entry<K, Object>> {
        public Iterator<Map.Entry<K, Object>> e;

        public c(Iterator<Map.Entry<K, Object>> it) {
            this.e = it;
        }

        public boolean hasNext() {
            return this.e.hasNext();
        }

        public Object next() {
            Map.Entry next = this.e.next();
            return next.getValue() instanceof m ? new b(next, (a) null) : next;
        }

        public void remove() {
            this.e.remove();
        }
    }

    public o a() {
        a((o) null);
        return this.f4964b;
    }

    public boolean equals(Object obj) {
        return a().equals(obj);
    }

    public int hashCode() {
        return a().hashCode();
    }

    public String toString() {
        return a().toString();
    }
}
