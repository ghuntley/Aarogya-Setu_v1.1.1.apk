package i.c.a.a.j.t;

import i.c.d.p.e;
import j.a.b;

/* compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
public final class c implements b<a> {
    public static final c a = new c();

    public Object get() {
        d dVar = new d();
        e.a(dVar, "Cannot return null from a non-@Nullable @Provides method");
        return dVar;
    }
}
