package i.b.a.t;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* compiled from: Executors */
public final class e {
    public static final Executor a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final Executor f2867b = new b();

    /* compiled from: Executors */
    public class a implements Executor {
        public final Handler e = new Handler(Looper.getMainLooper());

        public void execute(Runnable runnable) {
            this.e.post(runnable);
        }
    }

    /* compiled from: Executors */
    public class b implements Executor {
        public void execute(Runnable runnable) {
            runnable.run();
        }
    }
}
