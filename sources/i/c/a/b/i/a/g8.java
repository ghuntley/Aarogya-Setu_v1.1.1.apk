package i.c.a.b.i.a;

import android.os.RemoteException;
import i.c.a.b.g.g.nb;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class g8 implements Runnable {
    public final /* synthetic */ ea e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ nb f3687f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ z7 f3688g;

    public g8(z7 z7Var, ea eaVar, nb nbVar) {
        this.f3688g = z7Var;
        this.e = eaVar;
        this.f3687f = nbVar;
    }

    public final void run() {
        try {
            e4 e4Var = this.f3688g.d;
            if (e4Var == null) {
                this.f3688g.n().f3758f.a("Failed to get app instance id");
                return;
            }
            String d = e4Var.d(this.e);
            if (d != null) {
                this.f3688g.p().f3881g.set(d);
                this.f3688g.g().f3935l.a(d);
            }
            this.f3688g.D();
            this.f3688g.f().a(this.f3687f, d);
        } catch (RemoteException e2) {
            this.f3688g.n().f3758f.a("Failed to get app instance id", e2);
        } finally {
            this.f3688g.f().a(this.f3687f, (String) null);
        }
    }
}
