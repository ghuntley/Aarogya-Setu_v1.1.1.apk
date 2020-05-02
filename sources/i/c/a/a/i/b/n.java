package i.c.a.a.i.b;

import i.c.a.a.i.b.m;
import i.c.d.h.c;
import i.c.d.h.d;

/* compiled from: com.google.android.datatransport:transport-backend-cct@@2.2.0 */
public final class n implements c<f> {
    public void a(Object obj, Object obj2) {
        f fVar = (f) obj;
        d dVar = (d) obj2;
        m.a aVar = fVar.a;
        if (aVar != null) {
            dVar.a("clientType", (Object) aVar.name());
        }
        a aVar2 = fVar.f2889b;
        if (aVar2 != null) {
            dVar.a("androidClientInfo", (Object) aVar2);
        }
    }
}
