package i.c.d.k;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.firebase:firebase-iid@@20.1.2 */
public final class s0 {
    public static final Executor a = u0.e;

    public static ExecutorService a() {
        return new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), r0.a);
    }

    public static final /* synthetic */ Thread a(Runnable runnable) {
        return new Thread(runnable, "firebase-iid-executor");
    }
}
