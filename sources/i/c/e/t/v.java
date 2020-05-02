package i.c.e.t;

import java.lang.reflect.Method;

/* compiled from: UnsafeAllocator */
public class v extends x {
    public final /* synthetic */ Method a;

    public v(Method method) {
        this.a = method;
    }

    public <T> T a(Class<T> cls) {
        x.b(cls);
        return this.a.invoke((Object) null, new Object[]{cls, Object.class});
    }
}
