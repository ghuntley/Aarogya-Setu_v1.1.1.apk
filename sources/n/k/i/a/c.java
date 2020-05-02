package n.k.i.a;

import n.k.e;
import n.m.c.f;

/* compiled from: ContinuationImpl.kt */
public abstract class c extends a {

    /* renamed from: f  reason: collision with root package name */
    public transient n.k.c<Object> f5210f;

    /* renamed from: g  reason: collision with root package name */
    public final e f5211g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(n.k.c<Object> cVar) {
        super(cVar);
        e c = cVar != null ? cVar.c() : null;
        this.f5211g = c;
    }

    public e c() {
        e eVar = this.f5211g;
        if (eVar != null) {
            return eVar;
        }
        f.a();
        throw null;
    }
}
