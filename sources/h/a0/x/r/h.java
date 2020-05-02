package h.a0.x.r;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* compiled from: SerialExecutor */
public class h implements Executor {
    public final ArrayDeque<a> e = new ArrayDeque<>();

    /* renamed from: f  reason: collision with root package name */
    public final Executor f1088f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f1089g = new Object();

    /* renamed from: h  reason: collision with root package name */
    public volatile Runnable f1090h;

    /* compiled from: SerialExecutor */
    public static class a implements Runnable {
        public final h e;

        /* renamed from: f  reason: collision with root package name */
        public final Runnable f1091f;

        public a(h hVar, Runnable runnable) {
            this.e = hVar;
            this.f1091f = runnable;
        }

        public void run() {
            try {
                this.f1091f.run();
            } finally {
                this.e.b();
            }
        }
    }

    public h(Executor executor) {
        this.f1088f = executor;
    }

    public boolean a() {
        boolean z;
        synchronized (this.f1089g) {
            z = !this.e.isEmpty();
        }
        return z;
    }

    public void b() {
        synchronized (this.f1089g) {
            Runnable poll = this.e.poll();
            this.f1090h = poll;
            if (poll != null) {
                this.f1088f.execute(this.f1090h);
            }
        }
    }

    public void execute(Runnable runnable) {
        synchronized (this.f1089g) {
            this.e.add(new a(this, runnable));
            if (this.f1090h == null) {
                b();
            }
        }
    }
}
