package i.c.a.a.j.r;

import i.c.a.a.j.p.e;
import i.c.a.a.j.r.h.r;
import i.c.a.a.j.r.i.c;
import j.a.b;
import java.util.concurrent.Executor;
import m.a.a;

/* compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
public final class d implements b<c> {
    public final a<Executor> a;

    /* renamed from: b  reason: collision with root package name */
    public final a<e> f2968b;
    public final a<r> c;
    public final a<c> d;
    public final a<i.c.a.a.j.s.a> e;

    public d(a<Executor> aVar, a<e> aVar2, a<r> aVar3, a<c> aVar4, a<i.c.a.a.j.s.a> aVar5) {
        this.a = aVar;
        this.f2968b = aVar2;
        this.c = aVar3;
        this.d = aVar4;
        this.e = aVar5;
    }

    public Object get() {
        return new c(this.a.get(), this.f2968b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
