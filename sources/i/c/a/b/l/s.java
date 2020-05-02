package i.c.a.b.l;

import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

public final class s<TResult> implements a0<TResult> {
    public final Executor a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f4014b = new Object();
    @GuardedBy("mLock")
    public c<TResult> c;

    public s(Executor executor, c<TResult> cVar) {
        this.a = executor;
        this.c = cVar;
    }

    public final void a(g<TResult> gVar) {
        synchronized (this.f4014b) {
            if (this.c != null) {
                this.a.execute(new t(this, gVar));
            }
        }
    }

    public final void cancel() {
        synchronized (this.f4014b) {
            this.c = null;
        }
    }
}
