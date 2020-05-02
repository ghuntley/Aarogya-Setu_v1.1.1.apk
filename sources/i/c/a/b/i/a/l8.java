package i.c.a.b.i.a;

import android.os.RemoteException;
import i.c.a.b.g.g.nb;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class l8 implements Runnable {
    public final /* synthetic */ m e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ String f3750f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ nb f3751g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ z7 f3752h;

    public l8(z7 z7Var, m mVar, String str, nb nbVar) {
        this.f3752h = z7Var;
        this.e = mVar;
        this.f3750f = str;
        this.f3751g = nbVar;
    }

    public final void run() {
        byte[] bArr = null;
        try {
            e4 e4Var = this.f3752h.d;
            if (e4Var == null) {
                this.f3752h.n().f3758f.a("Discarding data. Failed to send event to service to bundle");
                return;
            }
            bArr = e4Var.a(this.e, this.f3750f);
            this.f3752h.D();
            this.f3752h.f().a(this.f3751g, bArr);
        } catch (RemoteException e2) {
            this.f3752h.n().f3758f.a("Failed to send event to the service to bundle", e2);
        } finally {
            this.f3752h.f().a(this.f3751g, bArr);
        }
    }
}
