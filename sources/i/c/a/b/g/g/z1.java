package i.c.a.b.g.g;

import java.io.Serializable;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public abstract class z1<T> implements Serializable {
    public static <T> z1<T> a(T t) {
        if (t != null) {
            return new c2(t);
        }
        throw null;
    }

    public abstract boolean a();

    public abstract T b();
}
