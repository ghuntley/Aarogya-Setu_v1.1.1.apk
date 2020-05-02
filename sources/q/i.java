package q;

import java.util.concurrent.CompletableFuture;
import q.h;

/* compiled from: CompletableFutureCallAdapterFactory */
public class i implements f<R> {
    public final /* synthetic */ CompletableFuture a;

    public i(h.c cVar, CompletableFuture completableFuture) {
        this.a = completableFuture;
    }

    public void a(d<R> dVar, d0<R> d0Var) {
        this.a.complete(d0Var);
    }

    public void a(d<R> dVar, Throwable th) {
        this.a.completeExceptionally(th);
    }
}
