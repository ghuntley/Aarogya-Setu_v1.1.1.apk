package i.c.a.b.i.a;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final /* synthetic */ class j9 implements Runnable {
    public final k9 e;

    public j9(k9 k9Var) {
        this.e = k9Var;
    }

    public final void run() {
        k9 k9Var = this.e;
        h9 h9Var = k9Var.f3740f;
        long j2 = k9Var.e;
        h9Var.f3697b.c();
        h9Var.f3697b.n().f3765m.a("Application going to the background");
        h9Var.f3697b.p().a("auto", "_ab", j2, new Bundle());
    }
}
