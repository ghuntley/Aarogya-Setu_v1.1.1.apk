package i.c.d.q;

import i.c.a.b.d.l.q;
import i.c.a.b.l.a;
import i.c.a.b.l.g;
import i.c.d.q.m.f;

/* compiled from: com.google.firebase:firebase-config@@19.1.3 */
public final /* synthetic */ class d implements a {
    public final g a;

    /* renamed from: b  reason: collision with root package name */
    public final g f4772b;
    public final g c;

    public d(g gVar, g gVar2, g gVar3) {
        this.a = gVar;
        this.f4772b = gVar2;
        this.c = gVar3;
    }

    public Object a(g gVar) {
        g gVar2 = this.a;
        g gVar3 = this.f4772b;
        g gVar4 = this.c;
        boolean z = false;
        if (!gVar3.d() || gVar3.b() == null) {
            return q.b(false);
        }
        f fVar = (f) gVar3.b();
        if (gVar4.d()) {
            f fVar2 = (f) gVar4.b();
            if (fVar2 == null || !fVar.c.equals(fVar2.c)) {
                z = true;
            }
            if (!z) {
                return q.b(false);
            }
        }
        return gVar2.e.a(fVar).a(gVar2.c, new b(gVar2));
    }
}
