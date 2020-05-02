package i.c.a.a.j.p;

import android.content.Context;
import j.a.b;
import m.a.a;

/* compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
public final class j implements b<i> {
    public final a<Context> a;

    /* renamed from: b  reason: collision with root package name */
    public final a<i.c.a.a.j.t.a> f2958b;
    public final a<i.c.a.a.j.t.a> c;

    public j(a<Context> aVar, a<i.c.a.a.j.t.a> aVar2, a<i.c.a.a.j.t.a> aVar3) {
        this.a = aVar;
        this.f2958b = aVar2;
        this.c = aVar3;
    }

    public Object get() {
        return new i(this.a.get(), this.f2958b.get(), this.c.get());
    }
}
