package i.b.a.t;

import h.e.a;
import h.e.h;

/* compiled from: CachedHashCodeArrayMap */
public final class b<K, V> extends a<K, V> {

    /* renamed from: m  reason: collision with root package name */
    public int f2863m;

    public V a(int i2, V v) {
        this.f2863m = 0;
        int i3 = (i2 << 1) + 1;
        V[] vArr = this.f1569f;
        V v2 = vArr[i3];
        vArr[i3] = v;
        return v2;
    }

    public void clear() {
        this.f2863m = 0;
        super.clear();
    }

    public V d(int i2) {
        this.f2863m = 0;
        return super.d(i2);
    }

    public int hashCode() {
        if (this.f2863m == 0) {
            this.f2863m = super.hashCode();
        }
        return this.f2863m;
    }

    public V put(K k2, V v) {
        this.f2863m = 0;
        return super.put(k2, v);
    }

    public void a(h<? extends K, ? extends V> hVar) {
        this.f2863m = 0;
        super.a(hVar);
    }
}
