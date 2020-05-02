package i.c.a.b.l;

import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

public final class q<TResult> implements a0<TResult> {
    public final Executor a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f4013b = new Object();
    @GuardedBy("mLock")
    public b c;

    public q(Executor executor, b bVar) {
        this.a = executor;
        this.c = bVar;
    }

    public final void a(g gVar) {
        if (((d0) gVar).d) {
            synchronized (this.f4013b) {
                if (this.c != null) {
                    this.a.execute(new r(this));
                }
            }
        }
    }

    public final void cancel() {
        synchronized (this.f4013b) {
            this.c = null;
        }
    }
}
