package f.a;

import i.a.a.a.a;
import i.c.d.p.e;
import n.h;
import n.m.b.b;
import n.m.c.f;

/* compiled from: CancellableContinuationImpl.kt */
public final class m0 extends d {
    public final b<Throwable, h> e;

    public m0(b<? super Throwable, h> bVar) {
        if (bVar != null) {
            this.e = bVar;
        } else {
            f.a("handler");
            throw null;
        }
    }

    public /* bridge */ /* synthetic */ Object a(Object obj) {
        a((Throwable) obj);
        return h.a;
    }

    public String toString() {
        StringBuilder a = a.a("InvokeOnCancel[");
        a.append(e.b((Object) this.e));
        a.append('@');
        a.append(e.c((Object) this));
        a.append(']');
        return a.toString();
    }

    public void a(Throwable th) {
        this.e.a(th);
    }
}
