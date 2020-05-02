package i.c.a.b.l;

import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

public final class u<TResult> implements a0<TResult> {
    public final Executor a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f4016b = new Object();
    @GuardedBy("mLock")
    public d c;

    public u(Executor executor, d dVar) {
        this.a = executor;
        this.c = dVar;
    }

    public final void a(g<TResult> gVar) {
        if (!gVar.d() && !((d0) gVar).d) {
            synchronized (this.f4016b) {
                if (this.c != null) {
                    this.a.execute(new v(this, gVar));
                }
            }
        }
    }

    public final void cancel() {
        synchronized (this.f4016b) {
            this.c = null;
        }
    }
}
