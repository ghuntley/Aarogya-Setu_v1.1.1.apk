package i.c.a.a.j.r;

import android.content.Context;
import i.c.a.a.j.r.h.d;
import i.c.a.a.j.r.h.f;
import i.c.a.a.j.r.h.r;
import i.c.a.a.j.r.i.c;
import i.c.d.p.e;
import j.a.b;
import m.a.a;

/* compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
public final class g implements b<r> {
    public final a<Context> a;

    /* renamed from: b  reason: collision with root package name */
    public final a<c> f2969b;
    public final a<f> c;
    public final a<i.c.a.a.j.t.a> d;

    public g(a<Context> aVar, a<c> aVar2, a<f> aVar3, a<i.c.a.a.j.t.a> aVar4) {
        this.a = aVar;
        this.f2969b = aVar2;
        this.c = aVar3;
        this.d = aVar4;
    }

    public Object get() {
        i.c.a.a.j.t.a aVar = this.d.get();
        d dVar = new d(this.a.get(), this.f2969b.get(), this.c.get());
        e.a(dVar, "Cannot return null from a non-@Nullable @Provides method");
        return dVar;
    }
}
