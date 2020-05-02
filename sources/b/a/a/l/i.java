package b.a.a.l;

import n.h;
import n.m.b.a;
import n.m.c.g;

/* compiled from: AuthUtility.kt */
public final class i extends g implements a<h> {
    public final /* synthetic */ k e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Exception f428f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ d f429g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(k kVar, Exception exc, d dVar) {
        super(0);
        this.e = kVar;
        this.f428f = exc;
        this.f429g = dVar;
    }

    public Object invoke() {
        k kVar = this.e;
        if (kVar != null) {
            kVar.a(this.f428f, this.f429g);
        }
        return h.a;
    }
}
