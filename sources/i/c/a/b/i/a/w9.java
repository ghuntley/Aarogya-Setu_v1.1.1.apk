package i.c.a.b.i.a;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
public final class w9 implements Callable<String> {
    public final /* synthetic */ ea e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ t9 f3928f;

    public w9(t9 t9Var, ea eaVar) {
        this.f3928f = t9Var;
        this.e = eaVar;
    }

    public final /* synthetic */ Object call() {
        c5 b2 = this.f3928f.b(this.e);
        if (b2 != null) {
            return b2.h();
        }
        this.f3928f.n().f3761i.a("App info was null when attempting to get app instance id");
        return null;
    }
}
