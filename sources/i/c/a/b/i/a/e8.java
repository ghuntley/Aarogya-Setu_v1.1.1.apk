package i.c.a.b.i.a;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class e8 implements Runnable {
    public final /* synthetic */ ea e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ z7 f3647f;

    public e8(z7 z7Var, ea eaVar) {
        this.f3647f = z7Var;
        this.e = eaVar;
    }

    public final void run() {
        z7 z7Var = this.f3647f;
        e4 e4Var = z7Var.d;
        if (e4Var == null) {
            z7Var.n().f3758f.a("Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            e4Var.b(this.e);
        } catch (RemoteException e2) {
            this.f3647f.n().f3758f.a("Failed to reset data on the service: remote exception", e2);
        }
        this.f3647f.D();
    }
}
