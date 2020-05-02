package h.a0.x.r.p;

import android.os.Handler;
import android.os.Looper;
import h.a0.x.r.h;
import java.util.concurrent.Executor;

/* compiled from: WorkManagerTaskExecutor */
public class b implements a {
    public final h a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f1114b = new Handler(Looper.getMainLooper());
    public final Executor c = new a();

    /* compiled from: WorkManagerTaskExecutor */
    public class a implements Executor {
        public a() {
        }

        public void execute(Runnable runnable) {
            b.this.f1114b.post(runnable);
        }
    }

    public b(Executor executor) {
        this.a = new h(executor);
    }
}
