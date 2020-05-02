package i.c.e.t;

import i.a.a.a.a;
import java.lang.reflect.Modifier;

/* compiled from: UnsafeAllocator */
public abstract class x {
    public static void b(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            StringBuilder a = a.a("Interface can't be instantiated! Interface name: ");
            a.append(cls.getName());
            throw new UnsupportedOperationException(a.toString());
        } else if (Modifier.isAbstract(modifiers)) {
            StringBuilder a2 = a.a("Abstract class can't be instantiated! Class name: ");
            a2.append(cls.getName());
            throw new UnsupportedOperationException(a2.toString());
        }
    }

    public abstract <T> T a(Class<T> cls);
}
