package b.a.a.l;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: ExecutorHelper */
public class x {
    public static int a = Runtime.getRuntime().availableProcessors();

    public static ThreadPoolExecutor a() {
        int i2 = a;
        return new ThreadPoolExecutor(i2 * 2, i2 * 2, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());
    }
}
