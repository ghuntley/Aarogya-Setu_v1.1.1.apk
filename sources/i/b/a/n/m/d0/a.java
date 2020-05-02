package i.b.a.n.m.d0;

import android.os.Process;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: GlideExecutor */
public final class a implements ExecutorService {

    /* renamed from: f  reason: collision with root package name */
    public static final long f2571f = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: g  reason: collision with root package name */
    public static volatile int f2572g;
    public final ExecutorService e;

    /* renamed from: i.b.a.n.m.d0.a$a  reason: collision with other inner class name */
    /* compiled from: GlideExecutor */
    public static final class C0084a implements ThreadFactory {
        public final String a;

        /* renamed from: b  reason: collision with root package name */
        public final b f2573b;
        public final boolean c;
        public int d;

        /* renamed from: i.b.a.n.m.d0.a$a$a  reason: collision with other inner class name */
        /* compiled from: GlideExecutor */
        public class C0085a extends Thread {
            public C0085a(Runnable runnable, String str) {
                super(runnable, str);
            }

            public void run() {
                Process.setThreadPriority(9);
                if (C0084a.this.c) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    super.run();
                } catch (Throwable th) {
                    C0084a.this.f2573b.a(th);
                }
            }
        }

        public C0084a(String str, b bVar, boolean z) {
            this.a = str;
            this.f2573b = bVar;
            this.c = z;
        }

        public synchronized Thread newThread(Runnable runnable) {
            C0085a aVar;
            aVar = new C0085a(runnable, "glide-" + this.a + "-thread-" + this.d);
            this.d = this.d + 1;
            return aVar;
        }
    }

    /* compiled from: GlideExecutor */
    public interface b {
        public static final b a = new C0086a();

        /* renamed from: b  reason: collision with root package name */
        public static final b f2574b = a;

        /* renamed from: i.b.a.n.m.d0.a$b$a  reason: collision with other inner class name */
        /* compiled from: GlideExecutor */
        public class C0086a implements b {
            public void a(Throwable th) {
                if (th != null && Log.isLoggable("GlideExecutor", 6)) {
                    Log.e("GlideExecutor", "Request threw uncaught throwable", th);
                }
            }
        }

        void a(Throwable th);
    }

    public a(ExecutorService executorService) {
        this.e = executorService;
    }

    public static int a() {
        if (f2572g == 0) {
            f2572g = Math.min(4, Runtime.getRuntime().availableProcessors());
        }
        return f2572g;
    }

    public static a b() {
        b bVar = b.f2574b;
        if (!TextUtils.isEmpty("disk-cache")) {
            return new a(new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new C0084a("disk-cache", bVar, true)));
        }
        throw new IllegalArgumentException(i.a.a.a.a.b("Name must be non-null and non-empty, but given: ", "disk-cache"));
    }

    public static a c() {
        b bVar = b.f2574b;
        int a = a();
        if (!TextUtils.isEmpty("source")) {
            return new a(new ThreadPoolExecutor(a, a, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new C0084a("source", bVar, false)));
        }
        throw new IllegalArgumentException(i.a.a.a.a.b("Name must be non-null and non-empty, but given: ", "source"));
    }

    public boolean awaitTermination(long j2, TimeUnit timeUnit) {
        return this.e.awaitTermination(j2, timeUnit);
    }

    public void execute(Runnable runnable) {
        this.e.execute(runnable);
    }

    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) {
        return this.e.invokeAll(collection);
    }

    public <T> T invokeAny(Collection<? extends Callable<T>> collection) {
        return this.e.invokeAny(collection);
    }

    public boolean isShutdown() {
        return this.e.isShutdown();
    }

    public boolean isTerminated() {
        return this.e.isTerminated();
    }

    public void shutdown() {
        this.e.shutdown();
    }

    public List<Runnable> shutdownNow() {
        return this.e.shutdownNow();
    }

    public Future<?> submit(Runnable runnable) {
        return this.e.submit(runnable);
    }

    public String toString() {
        return this.e.toString();
    }

    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j2, TimeUnit timeUnit) {
        return this.e.invokeAll(collection, j2, timeUnit);
    }

    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j2, TimeUnit timeUnit) {
        return this.e.invokeAny(collection, j2, timeUnit);
    }

    public <T> Future<T> submit(Runnable runnable, T t) {
        return this.e.submit(runnable, t);
    }

    public <T> Future<T> submit(Callable<T> callable) {
        return this.e.submit(callable);
    }
}
