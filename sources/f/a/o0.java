package f.a;

import i.a.a.a.a;
import i.c.d.p.e;
import n.h;
import n.m.b.b;
import n.m.c.f;

/* compiled from: JobSupport.kt */
public final class o0 extends r0<p0> {

    /* renamed from: i  reason: collision with root package name */
    public final b<Throwable, h> f862i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o0(p0 p0Var, b<? super Throwable, h> bVar) {
        super(p0Var);
        if (p0Var == null) {
            f.a("job");
            throw null;
        } else if (bVar != null) {
            this.f862i = bVar;
        } else {
            f.a("handler");
            throw null;
        }
    }

    public Object a(Object obj) {
        this.f862i.a((Throwable) obj);
        return h.a;
    }

    public String toString() {
        StringBuilder a = a.a("InvokeOnCompletion[");
        a.append(e.b((Object) this));
        a.append('@');
        a.append(e.c((Object) this));
        a.append(']');
        return a.toString();
    }
}
