package i.c.e.t;

import java.lang.reflect.Method;

/* compiled from: UnsafeAllocator */
public class u extends x {
    public final /* synthetic */ Method a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f4890b;

    public u(Method method, int i2) {
        this.a = method;
        this.f4890b = i2;
    }

    public <T> T a(Class<T> cls) {
        x.b(cls);
        return this.a.invoke((Object) null, new Object[]{cls, Integer.valueOf(this.f4890b)});
    }
}
