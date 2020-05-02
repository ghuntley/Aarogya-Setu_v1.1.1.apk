package i.c.a.b.i.a;

import android.os.Bundle;
import android.os.RemoteException;
import i.c.a.b.g.g.nb;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class r8 implements Runnable {
    public final /* synthetic */ String e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ String f3854f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ ea f3855g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ nb f3856h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ z7 f3857i;

    public r8(z7 z7Var, String str, String str2, ea eaVar, nb nbVar) {
        this.f3857i = z7Var;
        this.e = str;
        this.f3854f = str2;
        this.f3855g = eaVar;
        this.f3856h = nbVar;
    }

    public final void run() {
        ArrayList<Bundle> arrayList = new ArrayList<>();
        try {
            e4 e4Var = this.f3857i.d;
            if (e4Var == null) {
                this.f3857i.n().f3758f.a("Failed to get conditional properties; not connected to service", this.e, this.f3854f);
                return;
            }
            arrayList = ca.b(e4Var.a(this.e, this.f3854f, this.f3855g));
            this.f3857i.D();
            this.f3857i.f().a(this.f3856h, arrayList);
        } catch (RemoteException e2) {
            this.f3857i.n().f3758f.a("Failed to get conditional properties; remote exception", this.e, this.f3854f, e2);
        } finally {
            this.f3857i.f().a(this.f3856h, arrayList);
        }
    }
}
