package i.c.a.b.g.g;

import i.a.a.a.a;
import java.io.Serializable;
import java.util.Arrays;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class e2<T> implements a2<T>, Serializable {
    @NullableDecl
    public final T e;

    public e2(@NullableDecl T t) {
        this.e = t;
    }

    public final T a() {
        return this.e;
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (!(obj instanceof e2)) {
            return false;
        }
        T t = this.e;
        T t2 = ((e2) obj).e;
        if (t == t2) {
            return true;
        }
        if (t == null || !t.equals(t2)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.e});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.e);
        return a.a(valueOf.length() + 22, "Suppliers.ofInstance(", valueOf, ")");
    }
}
