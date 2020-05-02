package q;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;

/* compiled from: Invocation */
public final class m {
    public final Method a;

    /* renamed from: b  reason: collision with root package name */
    public final List<?> f5726b;

    public m(Method method, List<?> list) {
        this.a = method;
        this.f5726b = Collections.unmodifiableList(list);
    }

    public String toString() {
        return String.format("%s.%s() %s", new Object[]{this.a.getDeclaringClass().getName(), this.a.getName(), this.f5726b});
    }
}
