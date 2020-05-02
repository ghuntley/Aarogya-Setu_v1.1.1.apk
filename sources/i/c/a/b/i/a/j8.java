package i.c.a.b.i.a;

import android.os.RemoteException;
import i.c.a.b.d.l.w.a;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class j8 implements Runnable {
    public final /* synthetic */ ea e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ boolean f3734f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ z7 f3735g;

    public j8(z7 z7Var, ea eaVar, boolean z) {
        this.f3735g = z7Var;
        this.e = eaVar;
        this.f3734f = z;
    }

    public final void run() {
        z7 z7Var = this.f3735g;
        e4 e4Var = z7Var.d;
        if (e4Var == null) {
            z7Var.n().f3758f.a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            e4Var.c(this.e);
            if (this.f3734f) {
                this.f3735g.t().A();
            }
            this.f3735g.a(e4Var, (a) null, this.e);
            this.f3735g.D();
        } catch (RemoteException e2) {
            this.f3735g.n().f3758f.a("Failed to send app launch to the service", e2);
        }
    }
}
