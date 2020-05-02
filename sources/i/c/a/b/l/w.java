package i.c.a.b.l;

import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

public final class w<TResult> implements a0<TResult> {
    public final Executor a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f4018b = new Object();
    @GuardedBy("mLock")
    public e<? super TResult> c;

    public w(Executor executor, e<? super TResult> eVar) {
        this.a = executor;
        this.c = eVar;
    }

    public final void a(g<TResult> gVar) {
        if (gVar.d()) {
            synchronized (this.f4018b) {
                if (this.c != null) {
                    this.a.execute(new x(this, gVar));
                }
            }
        }
    }

    public final void cancel() {
        synchronized (this.f4018b) {
            this.c = null;
        }
    }
}
