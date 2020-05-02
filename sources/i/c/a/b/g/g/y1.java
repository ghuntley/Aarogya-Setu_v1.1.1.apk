package i.c.a.b.g.g;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class y1<T> extends z1<T> {
    public static final y1<Object> e = new y1<>();

    public final boolean a() {
        return false;
    }

    public final T b() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    public final boolean equals(@NullableDecl Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
