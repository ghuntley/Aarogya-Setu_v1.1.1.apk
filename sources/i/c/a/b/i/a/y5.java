package i.c.a.b.i.a;

import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
public final class y5 implements Callable<List<da>> {
    public final /* synthetic */ ea e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ String f3954f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ String f3955g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ t5 f3956h;

    public y5(t5 t5Var, ea eaVar, String str, String str2) {
        this.f3956h = t5Var;
        this.e = eaVar;
        this.f3954f = str;
        this.f3955g = str2;
    }

    public final /* synthetic */ Object call() {
        this.f3956h.a.o();
        return this.f3956h.a.d().a(this.e.e, this.f3954f, this.f3955g);
    }
}
