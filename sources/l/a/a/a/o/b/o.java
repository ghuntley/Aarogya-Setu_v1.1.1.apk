package l.a.a.a.o.b;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: ExecutorUtils */
public final class o implements ThreadFactory {
    public final /* synthetic */ String a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AtomicLong f5083b;

    /* compiled from: ExecutorUtils */
    public class a extends h {
        public final /* synthetic */ Runnable e;

        public a(o oVar, Runnable runnable) {
            this.e = runnable;
        }

        public void onRun() {
            this.e.run();
        }
    }

    public o(String str, AtomicLong atomicLong) {
        this.a = str;
        this.f5083b = atomicLong;
    }

    public Thread newThread(Runnable runnable) {
        Thread newThread = Executors.defaultThreadFactory().newThread(new a(this, runnable));
        newThread.setName(this.a + this.f5083b.getAndIncrement());
        return newThread;
    }
}
