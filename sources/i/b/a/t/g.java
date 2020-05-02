package i.b.a.t;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: LruCache */
public class g<T, Y> {
    public final Map<T, Y> a = new LinkedHashMap(100, 0.75f, true);

    /* renamed from: b  reason: collision with root package name */
    public long f2868b;
    public long c;

    public g(long j2) {
        this.f2868b = j2;
    }

    public synchronized long a() {
        return this.f2868b;
    }

    public void a(T t, Y y) {
    }

    public int b(Y y) {
        return 1;
    }

    public synchronized Y b(T t, Y y) {
        long b2 = (long) b(y);
        if (b2 >= this.f2868b) {
            a(t, y);
            return null;
        }
        if (y != null) {
            this.c += b2;
        }
        Y put = this.a.put(t, y);
        if (put != null) {
            this.c -= (long) b(put);
            if (!put.equals(y)) {
                a(t, put);
            }
        }
        a(this.f2868b);
        return put;
    }

    public synchronized Y c(T t) {
        Y remove;
        remove = this.a.remove(t);
        if (remove != null) {
            this.c -= (long) b(remove);
        }
        return remove;
    }

    public synchronized Y a(T t) {
        return this.a.get(t);
    }

    public synchronized void a(long j2) {
        while (this.c > j2) {
            Iterator<Map.Entry<T, Y>> it = this.a.entrySet().iterator();
            Map.Entry next = it.next();
            Object value = next.getValue();
            this.c -= (long) b(value);
            Object key = next.getKey();
            it.remove();
            a(key, value);
        }
    }
}
