package q;

import f.a.e;
import n.m.c.f;
import retrofit2.HttpException;

/* compiled from: KotlinExtensions.kt */
public final class q implements f<T> {
    public final /* synthetic */ e a;

    public q(e eVar) {
        this.a = eVar;
    }

    public void a(d<T> dVar, d0<T> d0Var) {
        if (dVar == null) {
            f.a("call");
            throw null;
        } else if (d0Var == null) {
            f.a("response");
            throw null;
        } else if (d0Var.a()) {
            this.a.a(d0Var.f5713b);
        } else {
            this.a.a(i.c.d.p.e.a((Throwable) new HttpException(d0Var)));
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
