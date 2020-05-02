package i.c.a.a.j;

import i.c.d.p.e;
import j.a.b;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
public final class g implements b<Executor> {
    public static final g a = new g();

    public Object get() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        e.a(newSingleThreadExecutor, "Cannot return null from a non-@Nullable @Provides method");
        return newSingleThreadExecutor;
    }
}
