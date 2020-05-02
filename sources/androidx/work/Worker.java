package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.work.ListenableWorker;
import h.a0.x.r.o.c;

public abstract class Worker extends ListenableWorker {

    /* renamed from: h  reason: collision with root package name */
    public c<ListenableWorker.a> f368h;

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            try {
                Worker.this.f368h.c(Worker.this.d());
            } catch (Throwable th) {
                Worker.this.f368h.a(th);
            }
        }
    }

    @SuppressLint({"BanKeepAnnotation"})
    @Keep
    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public final i.c.b.a.a.a<ListenableWorker.a> b() {
        this.f368h = new c<>();
        this.f366f.c.execute(new a());
        return this.f368h;
    }

    public abstract ListenableWorker.a d();
}
