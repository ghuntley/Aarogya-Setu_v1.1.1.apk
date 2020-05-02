package i.c.a.d.a.e;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

public final class b {
    public static final Executor a = new a();

    public static final class a implements Executor {
        public final Handler e = new Handler(Looper.getMainLooper());

        public final void execute(Runnable runnable) {
            this.e.post(runnable);
        }
    }
}
