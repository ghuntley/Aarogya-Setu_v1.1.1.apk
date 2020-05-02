package i.c.a.a.j.r.h;

import i.c.a.a.j.r.i.c;
import j.a.b;
import java.util.concurrent.Executor;
import m.a.a;

/* compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
public final class q implements b<p> {
    public final a<Executor> a;

    /* renamed from: b  reason: collision with root package name */
    public final a<c> f2991b;
    public final a<r> c;
    public final a<i.c.a.a.j.s.a> d;

    public q(a<Executor> aVar, a<c> aVar2, a<r> aVar3, a<i.c.a.a.j.s.a> aVar4) {
        this.a = aVar;
        this.f2991b = aVar2;
        this.c = aVar3;
        this.d = aVar4;
    }

    public Object get() {
        return new p(this.a.get(), this.f2991b.get(), this.c.get(), this.d.get());
    }
}
