package i.c.a.b.i.a;

import android.os.Bundle;
import android.os.RemoteException;
import i.c.a.b.g.g.nb;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class t8 implements Runnable {
    public final /* synthetic */ String e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ String f3887f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ boolean f3888g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ ea f3889h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ nb f3890i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ z7 f3891j;

    public t8(z7 z7Var, String str, String str2, boolean z, ea eaVar, nb nbVar) {
        this.f3891j = z7Var;
        this.e = str;
        this.f3887f = str2;
        this.f3888g = z;
        this.f3889h = eaVar;
        this.f3890i = nbVar;
    }

    public final void run() {
        Bundle bundle = new Bundle();
        try {
            e4 e4Var = this.f3891j.d;
            if (e4Var == null) {
                this.f3891j.n().f3758f.a("Failed to get user properties; not connected to service", this.e, this.f3887f);
                return;
            }
            bundle = ca.a(e4Var.a(this.e, this.f3887f, this.f3888g, this.f3889h));
            this.f3891j.D();
            this.f3891j.f().a(this.f3890i, bundle);
        } catch (RemoteException e2) {
            this.f3891j.n().f3758f.a("Failed to get user properties; remote exception", this.e, e2);
        } finally {
            this.f3891j.f().a(this.f3890i, bundle);
        }
    }
}
