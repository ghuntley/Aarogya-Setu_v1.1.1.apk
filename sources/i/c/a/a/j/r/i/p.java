package i.c.a.a.j.r.i;

import android.content.Context;
import j.a.b;
import m.a.a;

/* compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
public final class p implements b<o> {
    public final a<Context> a;

    /* renamed from: b  reason: collision with root package name */
    public final a<Integer> f3006b;

    public p(a<Context> aVar, a<Integer> aVar2) {
        this.a = aVar;
        this.f3006b = aVar2;
    }

    public Object get() {
        return new o(this.a.get(), this.f3006b.get().intValue());
    }
}
