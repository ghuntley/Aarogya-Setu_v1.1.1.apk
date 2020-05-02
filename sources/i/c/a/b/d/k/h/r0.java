package i.c.a.b.d.k.h;

import i.c.a.b.d.d;
import i.c.a.b.d.k.a;
import i.c.a.b.d.k.h.g;
import i.c.a.b.d.k.h.k;
import i.c.a.b.g.f.q;
import i.c.a.b.h.a;
import i.c.a.b.h.w;
import i.c.a.b.l.h;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class r0 extends p0<Void> {

    /* renamed from: b  reason: collision with root package name */
    public final m<a.b, ?> f3080b;
    public final o<a.b, ?> c;

    public r0(d0 d0Var, h<Void> hVar) {
        super(3, hVar);
        this.f3080b = d0Var.a;
        this.c = d0Var.f3040b;
    }

    public final /* bridge */ /* synthetic */ void a(x0 x0Var, boolean z) {
    }

    public final d[] b(g.a<?> aVar) {
        return this.f3080b.f3074b;
    }

    public final boolean c(g.a<?> aVar) {
        return this.f3080b.c;
    }

    public final void d(g.a<?> aVar) {
        m<a.b, ?> mVar = this.f3080b;
        a.f fVar = aVar.f3054b;
        h<T> hVar = this.a;
        w wVar = (w) mVar;
        if (wVar != null) {
            ((q) fVar).a(wVar.d, wVar.e, new a.C0115a(hVar));
            m<a.b, ?> mVar2 = this.f3080b;
            k.a<L> aVar2 = mVar2.a.c;
            if (aVar2 != null) {
                aVar.f3056g.put(aVar2, new d0(mVar2, this.c));
                return;
            }
            return;
        }
        throw null;
    }
}
