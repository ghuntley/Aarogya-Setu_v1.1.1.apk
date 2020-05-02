package i.c.e.t;

import java.lang.reflect.Method;

/* compiled from: UnsafeAllocator */
public class t extends x {
    public final /* synthetic */ Method a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f4889b;

    public t(Method method, Object obj) {
        this.a = method;
        this.f4889b = obj;
    }

    public <T> T a(Class<T> cls) {
        x.b(cls);
        return this.a.invoke(this.f4889b, new Object[]{cls});
    }
}
