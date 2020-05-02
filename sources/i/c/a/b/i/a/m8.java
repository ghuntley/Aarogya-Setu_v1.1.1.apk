package i.c.a.b.i.a;

import android.os.RemoteException;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class m8 implements Runnable {
    public final /* synthetic */ boolean e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ boolean f3775f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ m f3776g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ ea f3777h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ String f3778i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ z7 f3779j;

    public m8(z7 z7Var, boolean z, boolean z2, m mVar, ea eaVar, String str) {
        this.f3779j = z7Var;
        this.e = z;
        this.f3775f = z2;
        this.f3776g = mVar;
        this.f3777h = eaVar;
        this.f3778i = str;
    }

    public final void run() {
        z7 z7Var = this.f3779j;
        e4 e4Var = z7Var.d;
        if (e4Var == null) {
            z7Var.n().f3758f.a("Discarding data. Failed to send event to service");
            return;
        }
        if (this.e) {
            z7Var.a(e4Var, this.f3775f ? null : this.f3776g, this.f3777h);
        } else {
            try {
                if (TextUtils.isEmpty(this.f3778i)) {
                    e4Var.a(this.f3776g, this.f3777h);
                } else {
                    e4Var.a(this.f3776g, this.f3778i, this.f3779j.n().A());
                }
            } catch (RemoteException e2) {
                this.f3779j.n().f3758f.a("Failed to send event to the service", e2);
            }
        }
        this.f3779j.D();
    }
}
