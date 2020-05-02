package i.c.a.b.l;

import java.util.concurrent.Executor;

public final class m<TResult, TContinuationResult> implements a0<TResult> {
    public final Executor a;

    /* renamed from: b  reason: collision with root package name */
    public final a<TResult, TContinuationResult> f4009b;
    public final d0<TContinuationResult> c;

    public m(Executor executor, a<TResult, TContinuationResult> aVar, d0<TContinuationResult> d0Var) {
        this.a = executor;
        this.f4009b = aVar;
        this.c = d0Var;
    }

    public final void a(g<TResult> gVar) {
        this.a.execute(new n(this, gVar));
    }

    public final void cancel() {
        throw new UnsupportedOperationException();
    }
}
