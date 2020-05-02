package i.c.a.b.g.f;

import i.c.a.b.d.k.a;
import i.c.a.b.d.l.q;
import i.c.a.b.h.c;
import i.c.a.b.h.d;
import i.c.a.b.h.f;

public final class y extends c.a<f> {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ d f3203m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ String f3204n = null;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y(i.c.a.b.d.k.c cVar, d dVar) {
        super(cVar);
        this.f3203m = dVar;
    }

    public final /* synthetic */ void a(a.b bVar) {
        q qVar = (q) bVar;
        d dVar = this.f3203m;
        String str = this.f3204n;
        qVar.l();
        q.a(dVar != null, (Object) "locationSettingsRequest can't be null nor empty.");
        q.a(true, (Object) "listener can't be null.");
        ((g) qVar.q()).a(dVar, new s(this), str);
    }
}
