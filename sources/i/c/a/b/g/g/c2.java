package i.c.a.b.g.g;

import i.a.a.a.a;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class c2<T> extends z1<T> {
    public final T e;

    public c2(T t) {
        this.e = t;
    }

    public final boolean a() {
        return true;
    }

    public final T b() {
        return this.e;
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (obj instanceof c2) {
            return this.e.equals(((c2) obj).e);
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + 1502476572;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.e);
        return a.a(valueOf.length() + 13, "Optional.of(", valueOf, ")");
    }
}
