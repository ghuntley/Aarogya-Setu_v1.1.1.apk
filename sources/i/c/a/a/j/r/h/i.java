package i.c.a.a.j.r.h;

import i.c.a.a.j.h;
import i.c.a.a.j.p.b;
import i.c.a.a.j.p.g;
import i.c.a.a.j.s.a;

/* compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
public final /* synthetic */ class i implements a.C0107a {
    public final l a;

    /* renamed from: b  reason: collision with root package name */
    public final g f2982b;
    public final Iterable c;
    public final h d;
    public final int e;

    public i(l lVar, g gVar, Iterable iterable, h hVar, int i2) {
        this.a = lVar;
        this.f2982b = gVar;
        this.c = iterable;
        this.d = hVar;
        this.e = i2;
    }

    public Object f() {
        l lVar = this.a;
        g gVar = this.f2982b;
        Iterable iterable = this.c;
        h hVar = this.d;
        int i2 = this.e;
        b bVar = (b) gVar;
        if (bVar.a == g.a.TRANSIENT_ERROR) {
            lVar.c.b((Iterable<i.c.a.a.j.r.i.g>) iterable);
            lVar.d.a(hVar, i2 + 1);
            return null;
        }
        lVar.c.a((Iterable<i.c.a.a.j.r.i.g>) iterable);
        if (bVar.a == g.a.OK) {
            lVar.c.a(hVar, lVar.f2986g.a() + bVar.f2952b);
        }
        if (!lVar.c.b(hVar)) {
            return null;
        }
        lVar.d.a(hVar, 1);
        return null;
    }
}
