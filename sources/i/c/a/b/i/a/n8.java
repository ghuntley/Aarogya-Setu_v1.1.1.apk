package i.c.a.b.i.a;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class n8 implements Runnable {
    public final /* synthetic */ ea e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ z7 f3789f;

    public n8(z7 z7Var, ea eaVar) {
        this.f3789f = z7Var;
        this.e = eaVar;
    }

    public final void run() {
        z7 z7Var = this.f3789f;
        e4 e4Var = z7Var.d;
        if (e4Var == null) {
            z7Var.n().f3758f.a("Failed to send measurementEnabled to service");
            return;
        }
        try {
            e4Var.a(this.e);
            this.f3789f.D();
        } catch (RemoteException e2) {
            this.f3789f.n().f3758f.a("Failed to send measurementEnabled to the service", e2);
        }
    }
}
