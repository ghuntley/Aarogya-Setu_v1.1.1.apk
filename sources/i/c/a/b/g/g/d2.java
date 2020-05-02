package i.c.a.b.g.g;

import i.a.a.a.a;
import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class d2<T> implements a2<T>, Serializable {
    public final a2<T> e;

    /* renamed from: f  reason: collision with root package name */
    public volatile transient boolean f3251f;
    @NullableDecl

    /* renamed from: g  reason: collision with root package name */
    public transient T f3252g;

    public d2(a2<T> a2Var) {
        if (a2Var != null) {
            this.e = a2Var;
            return;
        }
        throw null;
    }

    public final T a() {
        if (!this.f3251f) {
            synchronized (this) {
                if (!this.f3251f) {
                    T a = this.e.a();
                    this.f3252g = a;
                    this.f3251f = true;
                    return a;
                }
            }
        }
        return this.f3252g;
    }

    public final String toString() {
        Object obj;
        if (this.f3251f) {
            String valueOf = String.valueOf(this.f3252g);
            obj = a.a(valueOf.length() + 25, "<supplier that returned ", valueOf, ">");
        } else {
            obj = this.e;
        }
        String valueOf2 = String.valueOf(obj);
        return a.a(valueOf2.length() + 19, "Suppliers.memoize(", valueOf2, ")");
    }
}
