package i.c.a.b.i.a;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class i8 implements Runnable {
    public final /* synthetic */ w7 e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ z7 f3719f;

    public i8(z7 z7Var, w7 w7Var) {
        this.f3719f = z7Var;
        this.e = w7Var;
    }

    public final void run() {
        z7 z7Var = this.f3719f;
        e4 e4Var = z7Var.d;
        if (e4Var == null) {
            z7Var.n().f3758f.a("Failed to send current screen to service");
            return;
        }
        try {
            if (this.e == null) {
                e4Var.a(0, (String) null, (String) null, z7Var.a.a.getPackageName());
            } else {
                e4Var.a(this.e.c, this.e.a, this.e.f3927b, z7Var.a.a.getPackageName());
            }
            this.f3719f.D();
        } catch (RemoteException e2) {
            this.f3719f.n().f3758f.a("Failed to send current screen to the service", e2);
        }
    }
}
