package i.c.a.d.a.a;

import android.os.RemoteException;
import i.c.a.d.a.c.e;
import i.c.a.d.a.c.k;
import i.c.a.d.a.e.g;

public final class h extends k {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ String f4297f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ g f4298g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ f f4299h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(f fVar, g gVar, String str, g gVar2) {
        super(gVar);
        this.f4299h = fVar;
        this.f4297f = str;
        this.f4298g = gVar2;
    }

    public final void a() {
        try {
            ((e) this.f4299h.a.f4310k).a(this.f4299h.f4293b, f.a(this.f4299h, this.f4297f), new k(this.f4299h, this.f4298g, this.f4297f));
        } catch (RemoteException e) {
            f.d.a((Throwable) e, "requestUpdateInfo(%s)", this.f4297f);
            g gVar = this.f4298g;
            gVar.a.a((Exception) new RuntimeException(e));
        }
    }
}
