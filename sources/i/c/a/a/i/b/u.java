package i.c.a.a.i.b;

import i.c.a.a.i.b.t;
import i.c.d.h.c;
import i.c.d.h.d;

/* compiled from: com.google.android.datatransport:transport-backend-cct@@2.2.0 */
public final class u implements c<j> {
    public void a(Object obj, Object obj2) {
        j jVar = (j) obj;
        d dVar = (d) obj2;
        t.a aVar = jVar.f2899b;
        if (aVar != null) {
            dVar.a("mobileSubtype", (Object) aVar.name());
        }
        t.b bVar = jVar.a;
        if (bVar != null) {
            dVar.a("networkType", (Object) bVar.name());
        }
    }
}
