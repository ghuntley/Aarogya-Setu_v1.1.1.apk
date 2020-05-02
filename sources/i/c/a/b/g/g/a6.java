package i.c.a.b.g.g;

import i.a.a.a.a;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.3.0 */
public final class a6 implements Comparable<a6>, Map.Entry<K, V> {
    public final K e;

    /* renamed from: f  reason: collision with root package name */
    public V f3208f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ x5 f3209g;

    public a6(x5 x5Var, Map.Entry<K, V> entry) {
        V value = entry.getValue();
        this.f3209g = x5Var;
        this.e = (Comparable) entry.getKey();
        this.f3208f = value;
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return this.e.compareTo(((a6) obj).e);
    }

    public final boolean equals(Object obj) {
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
            V v = this.f3208f;
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

    public final /* synthetic */ Object getKey() {
        return this.e;
    }

    public final V getValue() {
        return this.f3208f;
    }

    public final int hashCode() {
        K k2 = this.e;
        int i2 = 0;
        int hashCode = k2 == null ? 0 : k2.hashCode();
        V v = this.f3208f;
        if (v != null) {
            i2 = v.hashCode();
        }
        return hashCode ^ i2;
    }

    public final V setValue(V v) {
        this.f3209g.d();
        V v2 = this.f3208f;
        this.f3208f = v;
        return v2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.e);
        String valueOf2 = String.valueOf(this.f3208f);
        return a.a(valueOf2.length() + valueOf.length() + 1, valueOf, "=", valueOf2);
    }

    public a6(x5 x5Var, K k2, V v) {
        this.f3209g = x5Var;
        this.e = k2;
        this.f3208f = v;
    }
}
