package i.b.a.p;

import java.lang.reflect.InvocationTargetException;

@Deprecated
/* compiled from: ManifestParser */
public final class e {
    public static c a(String str) {
        try {
            Class<?> cls = Class.forName(str);
            try {
                Object newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                if (newInstance instanceof c) {
                    return (c) newInstance;
                }
                throw new RuntimeException("Expected instanceof GlideModule, but found: " + newInstance);
            } catch (InstantiationException e) {
                a(cls, e);
                throw null;
            } catch (IllegalAccessException e2) {
                a(cls, e2);
                throw null;
            } catch (NoSuchMethodException e3) {
                a(cls, e3);
                throw null;
            } catch (InvocationTargetException e4) {
                a(cls, e4);
                throw null;
            }
        } catch (ClassNotFoundException e5) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e5);
        }
    }

    public static void a(Class<?> cls, Exception exc) {
        throw new RuntimeException("Unable to instantiate GlideModule implementation for " + cls, exc);
    }
}
