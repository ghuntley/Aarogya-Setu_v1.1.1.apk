package h.c.a.a;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: DefaultTaskExecutor */
public class b extends c {
    public final Object a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final ExecutorService f1522b = Executors.newFixedThreadPool(4, new a(this));
    public volatile Handler c;

    /* compiled from: DefaultTaskExecutor */
    public class a implements ThreadFactory {
        public final AtomicInteger a = new AtomicInteger(0);

        public a(b bVar) {
        }

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format("arch_disk_io_%d", new Object[]{Integer.valueOf(this.a.getAndIncrement())}));
            return thread;
        }
    }

    public void a(Runnable runnable) {
        this.f1522b.execute(runnable);
    }

    public void b(Runnable runnable) {
        if (this.c == null) {
            synchronized (this.a) {
                if (this.c == null) {
                    this.c = a(Looper.getMainLooper());
                }
            }
        }
        this.c.post(runnable);
    }

    public boolean a() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public static Handler a(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return Handler.createAsync(looper);
        }
        Class<Handler> cls = Handler.class;
        try {
            return cls.getDeclaredConstructor(new Class[]{Looper.class, Handler.Callback.class, Boolean.TYPE}).newInstance(new Object[]{looper, null, true});
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }
}
