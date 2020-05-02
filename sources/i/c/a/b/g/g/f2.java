package i.c.a.b.g.g;

import i.a.a.a.a;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class f2<T> implements a2<T> {
    public volatile a2<T> e;

    /* renamed from: f  reason: collision with root package name */
    public volatile boolean f3272f;
    @NullableDecl

    /* renamed from: g  reason: collision with root package name */
    public T f3273g;

    public f2(a2<T> a2Var) {
        if (a2Var != null) {
            this.e = a2Var;
            return;
        }
        throw null;
    }

    public final T a() {
        if (!this.f3272f) {
            synchronized (this) {
                if (!this.f3272f) {
                    T a = this.e.a();
                    this.f3273g = a;
                    this.f3272f = true;
                    this.e = null;
                    return a;
                }
            }
        }
        return this.f3273g;
    }

    public final String toString() {
        Object obj = this.e;
        if (obj == null) {
            String valueOf = String.valueOf(this.f3273g);
            obj = a.a(valueOf.length() + 25, "<supplier that returned ", valueOf, ">");
        }
        String valueOf2 = String.valueOf(obj);
        return a.a(valueOf2.length() + 19, "Suppliers.memoize(", valueOf2, ")");
    }
}
