package i.c.a.b.i.a;

import android.os.RemoteException;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class p8 implements Runnable {
    public final /* synthetic */ boolean e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ boolean f3836f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ na f3837g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ ea f3838h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ na f3839i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ z7 f3840j;

    public p8(z7 z7Var, boolean z, boolean z2, na naVar, ea eaVar, na naVar2) {
        this.f3840j = z7Var;
        this.e = z;
        this.f3836f = z2;
        this.f3837g = naVar;
        this.f3838h = eaVar;
        this.f3839i = naVar2;
    }

    public final void run() {
        z7 z7Var = this.f3840j;
        e4 e4Var = z7Var.d;
        if (e4Var == null) {
            z7Var.n().f3758f.a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        if (this.e) {
            z7Var.a(e4Var, this.f3836f ? null : this.f3837g, this.f3838h);
        } else {
            try {
                if (TextUtils.isEmpty(this.f3839i.e)) {
                    e4Var.a(this.f3837g, this.f3838h);
                } else {
                    e4Var.a(this.f3837g);
                }
            } catch (RemoteException e2) {
                this.f3840j.n().f3758f.a("Failed to send conditional user property to the service", e2);
            }
        }
        this.f3840j.D();
    }
}
