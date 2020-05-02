package i.c.a.b.i.a;

import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
public final class a6 implements Callable<List<na>> {
    public final /* synthetic */ ea e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ String f3577f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ String f3578g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ t5 f3579h;

    public a6(t5 t5Var, ea eaVar, String str, String str2) {
        this.f3579h = t5Var;
        this.e = eaVar;
        this.f3577f = str;
        this.f3578g = str2;
    }

    public final /* synthetic */ Object call() {
        this.f3579h.a.o();
        return this.f3579h.a.d().b(this.e.e, this.f3577f, this.f3578g);
    }
}
