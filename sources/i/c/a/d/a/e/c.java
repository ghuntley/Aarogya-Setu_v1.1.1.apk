package i.c.a.d.a.e;

import java.util.concurrent.Executor;

public final class c<TResult> implements f<TResult> {
    public final Executor a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f4317b = new Object();
    public a<? super TResult> c;

    public c(Executor executor, a<? super TResult> aVar) {
        this.a = executor;
        this.c = aVar;
    }

    public final void a(h<TResult> hVar) {
        if (hVar.c()) {
            synchronized (this.f4317b) {
                if (this.c != null) {
                    this.a.execute(new d(this, hVar));
                }
            }
        }
    }
}
