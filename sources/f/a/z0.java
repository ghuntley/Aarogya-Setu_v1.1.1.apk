package f.a;

import n.m.c.f;

/* compiled from: EventLoop.common.kt */
public final class z0 {
    public static final ThreadLocal<f0> a = new ThreadLocal<>();

    /* renamed from: b  reason: collision with root package name */
    public static final z0 f873b = null;

    public static final f0 a() {
        f0 f0Var = a.get();
        if (f0Var != null) {
            return f0Var;
        }
        Thread currentThread = Thread.currentThread();
        f.a((Object) currentThread, "Thread.currentThread()");
        c cVar = new c(currentThread);
        a.set(cVar);
        return cVar;
    }
}
