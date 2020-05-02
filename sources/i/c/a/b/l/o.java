package i.c.a.b.l;

import java.util.concurrent.Executor;

public final class o<TResult, TContinuationResult> implements b, d, e<TContinuationResult>, a0<TResult> {
    public final Executor a;

    /* renamed from: b  reason: collision with root package name */
    public final a<TResult, g<TContinuationResult>> f4011b;
    public final d0<TContinuationResult> c;

    public o(Executor executor, a<TResult, g<TContinuationResult>> aVar, d0<TContinuationResult> d0Var) {
        this.a = executor;
        this.f4011b = aVar;
        this.c = d0Var;
    }

    public final void a(g<TResult> gVar) {
        this.a.execute(new p(this, gVar));
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
