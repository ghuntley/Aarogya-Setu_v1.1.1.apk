package i.c.a.b.l;

import java.util.concurrent.Executor;

public abstract class g<TResult> {
    public g<TResult> a(Executor executor, c<TResult> cVar) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public abstract g<TResult> a(Executor executor, d dVar);

    public abstract g<TResult> a(Executor executor, e<? super TResult> eVar);

    public abstract Exception a();

    public abstract <X extends Throwable> TResult a(Class<X> cls);

    public <TContinuationResult> g<TContinuationResult> b(Executor executor, a<TResult, g<TContinuationResult>> aVar) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    public abstract TResult b();

    public abstract boolean c();

    public abstract boolean d();

    public g<TResult> a(Executor executor, b bVar) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    public <TContinuationResult> g<TContinuationResult> a(Executor executor, a<TResult, TContinuationResult> aVar) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public <TContinuationResult> g<TContinuationResult> a(Executor executor, f<TResult, TContinuationResult> fVar) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }
}
