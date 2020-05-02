package n.m.c;

import n.o.b;
import n.o.f;

/* compiled from: Reflection */
public class k {
    public static final l a;

    static {
        l lVar = null;
        try {
            lVar = (l) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (lVar == null) {
            lVar = new l();
        }
        a = lVar;
    }

    public static b a(Class cls) {
        if (a != null) {
            return new c(cls);
        }
        throw null;
    }

    public static f a(h hVar) {
        if (a != null) {
            return hVar;
        }
        throw null;
    }
}
