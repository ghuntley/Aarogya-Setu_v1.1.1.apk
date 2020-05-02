package i.c.a.b.d.k.h;

import i.c.a.b.d.d;
import i.c.a.b.d.k.a;
import i.c.a.b.d.k.h.g;
import i.c.a.b.d.k.h.k;
import i.c.a.b.g.f.q;
import i.c.a.b.h.x;
import i.c.a.b.h.y;
import i.c.a.b.l.h;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class s0 extends p0<Boolean> {

    /* renamed from: b  reason: collision with root package name */
    public final k.a<?> f3081b;

    public s0(k.a<?> aVar, h<Boolean> hVar) {
        super(4, hVar);
        this.f3081b = aVar;
    }

    public final /* bridge */ /* synthetic */ void a(x0 x0Var, boolean z) {
    }

    public final d[] b(g.a<?> aVar) {
        d0 d0Var = aVar.f3056g.get(this.f3081b);
        if (d0Var == null) {
            return null;
        }
        return d0Var.a.f3074b;
    }

    public final boolean c(g.a<?> aVar) {
        d0 d0Var = aVar.f3056g.get(this.f3081b);
        return d0Var != null && d0Var.a.c;
    }

    public final void d(g.a<?> aVar) {
        d0 remove = aVar.f3056g.remove(this.f3081b);
        if (remove != null) {
            o<a.b, ?> oVar = remove.f3040b;
            a.f fVar = aVar.f3054b;
            h<T> hVar = this.a;
            x xVar = (x) oVar;
            if (xVar != null) {
                q qVar = (q) fVar;
                if (xVar.f3573b != null) {
                    y yVar = new y(hVar);
                    try {
                        qVar.A.a(xVar.a, yVar);
                    } catch (RuntimeException e) {
                        hVar.a.b((Exception) e);
                    }
                    remove.a.a.f3072b = null;
                    return;
                }
                throw null;
            }
            throw null;
        }
        this.a.a(false);
    }
}
