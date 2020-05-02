package i.c.a.b.g.g;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.3.0 */
public final class d6 implements Iterator<Map.Entry<K, V>> {
    public int e = -1;

    /* renamed from: f  reason: collision with root package name */
    public boolean f3253f;

    /* renamed from: g  reason: collision with root package name */
    public Iterator<Map.Entry<K, V>> f3254g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ x5 f3255h;

    public /* synthetic */ d6(x5 x5Var, w5 w5Var) {
        this.f3255h = x5Var;
    }

    public final Iterator<Map.Entry<K, V>> a() {
        if (this.f3254g == null) {
            this.f3254g = this.f3255h.f3521g.entrySet().iterator();
        }
        return this.f3254g;
    }

    public final boolean hasNext() {
        if (this.e + 1 < this.f3255h.f3520f.size() || (!this.f3255h.f3521g.isEmpty() && a().hasNext())) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ Object next() {
        this.f3253f = true;
        int i2 = this.e + 1;
        this.e = i2;
        if (i2 < this.f3255h.f3520f.size()) {
            return this.f3255h.f3520f.get(this.e);
        }
        return (Map.Entry) a().next();
    }

    public final void remove() {
        if (this.f3253f) {
            this.f3253f = false;
            this.f3255h.d();
            if (this.e < this.f3255h.f3520f.size()) {
                x5 x5Var = this.f3255h;
                int i2 = this.e;
                this.e = i2 - 1;
                x5Var.b(i2);
                return;
            }
            a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
