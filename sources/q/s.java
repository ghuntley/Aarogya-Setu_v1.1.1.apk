package q;

import f.a.e;
import n.m.c.f;

/* compiled from: KotlinExtensions.kt */
public final class s implements f<T> {
    public final /* synthetic */ e a;

    public s(e eVar) {
        this.a = eVar;
    }

    public void a(d<T> dVar, d0<T> d0Var) {
        if (dVar == null) {
            f.a("call");
            throw null;
        } else if (d0Var != null) {
            this.a.a(d0Var);
        } else {
            f.a("response");
            throw null;
        }
    }

    public void a(d<T> dVar, Throwable th) {
        if (dVar == null) {
            f.a("call");
            throw null;
        } else if (th != null) {
            this.a.a(i.c.d.p.e.a(th));
        } else {
            f.a("t");
            throw null;
        }
    }
}
