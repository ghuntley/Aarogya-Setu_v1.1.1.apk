package q;

import java.util.concurrent.CompletableFuture;
import q.h;
import retrofit2.HttpException;

/* compiled from: CompletableFutureCallAdapterFactory */
public class g implements f<R> {
    public final /* synthetic */ CompletableFuture a;

    public g(h.a aVar, CompletableFuture completableFuture) {
        this.a = completableFuture;
    }

    public void a(d<R> dVar, d0<R> d0Var) {
        if (d0Var.a()) {
            this.a.complete(d0Var.f5713b);
        } else {
            this.a.completeExceptionally(new HttpException(d0Var));
        }
    }

    public void a(d<R> dVar, Throwable th) {
        this.a.completeExceptionally(th);
    }
}
