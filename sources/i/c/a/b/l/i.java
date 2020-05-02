package i.c.a.b.l;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

public final class i {
    public static final Executor a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final Executor f4004b = new c0();

    public static final class a implements Executor {
        public final Handler e = new Handler(Looper.getMainLooper());

        public final void execute(Runnable runnable) {
            this.e.post(runnable);
        }
    }
}
