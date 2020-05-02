package h.c.a.a;

import java.util.concurrent.Executor;

/* compiled from: ArchTaskExecutor */
public class a extends c {
    public static volatile a c;
    public static final Executor d = new C0039a();
    public c a;

    /* renamed from: b  reason: collision with root package name */
    public c f1521b;

    /* renamed from: h.c.a.a.a$a  reason: collision with other inner class name */
    /* compiled from: ArchTaskExecutor */
    public static class C0039a implements Executor {
        public void execute(Runnable runnable) {
            a.b().a.a(runnable);
        }
    }

    public a() {
        b bVar = new b();
        this.f1521b = bVar;
        this.a = bVar;
    }

    public static a b() {
        if (c != null) {
            return c;
        }
        synchronized (a.class) {
            if (c == null) {
                c = new a();
            }
        }
        return c;
    }

    public void a(Runnable runnable) {
        this.a.a(runnable);
    }

    public boolean a() {
        return this.a.a();
    }

    public void b(Runnable runnable) {
        this.a.b(runnable);
    }
}
