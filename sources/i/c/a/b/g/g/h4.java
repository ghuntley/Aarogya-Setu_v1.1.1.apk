package i.c.a.b.g.g;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.3.0 */
public final class h4<K> implements Map.Entry<K, Object> {
    public Map.Entry<K, f4> e;

    public /* synthetic */ h4(Map.Entry entry, i4 i4Var) {
        this.e = entry;
    }

    public final K getKey() {
        return this.e.getKey();
    }

    public final Object getValue() {
        if (this.e.getValue() == null) {
            return null;
        }
        f4.c();
        throw null;
    }

    public final Object setValue(Object obj) {
        if (obj instanceof f5) {
            f4 value = this.e.getValue();
            f5 f5Var = value.a;
            value.f3324b = null;
            value.a = (f5) obj;
            return f5Var;
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
