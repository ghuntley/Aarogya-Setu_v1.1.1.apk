package l.a.a.a.o.c;

import android.annotation.TargetApi;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PriorityThreadPoolExecutor */
public class k extends ThreadPoolExecutor {
    public static final int e;

    /* renamed from: f  reason: collision with root package name */
    public static final int f5144f;

    /* renamed from: g  reason: collision with root package name */
    public static final int f5145g;

    /* compiled from: PriorityThreadPoolExecutor */
    public static final class a implements ThreadFactory {
        public final int a;

        public a(int i2) {
            this.a = i2;
        }

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setPriority(this.a);
            thread.setName("Queue");
            return thread;
        }
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        e = availableProcessors;
        f5144f = availableProcessors + 1;
        f5145g = (availableProcessors * 2) + 1;
    }

    public <T extends Runnable & b & l & i> k(int i2, int i3, long j2, TimeUnit timeUnit, c<T> cVar, ThreadFactory threadFactory) {
        super(i2, i3, j2, timeUnit, cVar, threadFactory);
        prestartAllCoreThreads();
    }

    public void afterExecute(Runnable runnable, Throwable th) {
        l lVar = (l) runnable;
        lVar.setFinished(true);
        lVar.setError(th);
        ((c) super.getQueue()).c();
        super.afterExecute(runnable, th);
    }

    @TargetApi(9)
    public void execute(Runnable runnable) {
        if (j.isProperDelegate(runnable)) {
            super.execute(runnable);
        } else {
            super.execute(new h(runnable, null));
        }
    }

    public BlockingQueue getQueue() {
        return (c) super.getQueue();
    }

    public <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
        return new h(runnable, t);
    }

    public <T> RunnableFuture<T> newTaskFor(Callable<T> callable) {
        return new h(callable);
    }
}
