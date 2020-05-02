package q;

import n.h;
import n.m.b.b;
import n.m.c.g;

/* compiled from: KotlinExtensions.kt */
public final class r extends g implements b<Throwable, h> {
    public final /* synthetic */ d e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r(d dVar) {
        super(1);
        this.e = dVar;
    }

    public Object a(Object obj) {
        Throwable th = (Throwable) obj;
        this.e.cancel();
        return h.a;
    }
}
