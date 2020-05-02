package i.c.d.f;

import java.util.Set;

/* compiled from: com.google.firebase:firebase-components@@16.0.0 */
public abstract class a implements e {
    public <T> T a(Class<T> cls) {
        i.c.d.l.a<T> b2 = b(cls);
        if (b2 == null) {
            return null;
        }
        return b2.get();
    }

    public <T> Set<T> c(Class<T> cls) {
        return d(cls).get();
    }
}
