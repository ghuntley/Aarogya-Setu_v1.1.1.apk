package i.c.a.d.a.a;

import android.os.Bundle;
import android.os.RemoteException;
import i.c.a.d.a.c.e;
import i.c.a.d.a.c.k;

public final class g extends k {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ i.c.a.d.a.e.g f4294f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ String f4295g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ f f4296h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(f fVar, i.c.a.d.a.e.g gVar, i.c.a.d.a.e.g gVar2, String str) {
        super(gVar);
        this.f4296h = fVar;
        this.f4294f = gVar2;
        this.f4295g = str;
    }

    public final void a() {
        try {
            String str = this.f4296h.f4293b;
            Bundle bundle = new Bundle();
            bundle.putInt("playcore.version.code", 10600);
            ((e) this.f4296h.a.f4310k).b(str, bundle, new i(this.f4296h, this.f4294f));
        } catch (RemoteException e) {
            f.d.a((Throwable) e, "completeUpdate(%s)", this.f4295g);
            i.c.a.d.a.e.g gVar = this.f4294f;
            gVar.a.a((Exception) new RuntimeException(e));
        }
    }
}
