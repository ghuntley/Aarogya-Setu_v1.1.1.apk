package i.c.a.b.l;

import java.util.concurrent.Executor;

public final class y<TResult, TContinuationResult> implements b, d, e<TContinuationResult>, a0<TResult> {
    public final Executor a;

    /* renamed from: b  reason: collision with root package name */
    public final f<TResult, TContinuationResult> f4020b;
    public final d0<TContinuationResult> c;

    public y(Executor executor, f<TResult, TContinuationResult> fVar, d0<TContinuationResult> d0Var) {
        this.a = executor;
        this.f4020b = fVar;
        this.c = d0Var;
    }

    public final void a(g<TResult> gVar) {
        this.a.execute(new z(this, gVar));
    }

    public final void cancel() {
        throw new UnsupportedOperationException();
    }

    public final void a(TContinuationResult tcontinuationresult) {
        this.c.a(tcontinuationresult);
    }

    public final void a(Exception exc) {
        this.c.a(exc);
    }

    public final void a() {
        this.c.e();
    }
}
