package i.c.e.t;

import i.a.a.a.a;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/* compiled from: ConstructorConstructor */
public class h implements s<T> {
    public final /* synthetic */ Constructor a;

    public h(g gVar, Constructor constructor) {
        this.a = constructor;
    }

    public T a() {
        try {
            return this.a.newInstance((Object[]) null);
        } catch (InstantiationException e) {
            StringBuilder a2 = a.a("Failed to invoke ");
            a2.append(this.a);
            a2.append(" with no args");
            throw new RuntimeException(a2.toString(), e);
        } catch (InvocationTargetException e2) {
            StringBuilder a3 = a.a("Failed to invoke ");
            a3.append(this.a);
            a3.append(" with no args");
            throw new RuntimeException(a3.toString(), e2.getTargetException());
        } catch (IllegalAccessException e3) {
            throw new AssertionError(e3);
        }
    }
}
