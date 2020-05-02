package i.c.a.a.i.b;

import i.c.d.h.c;
import i.c.d.h.d;

/* compiled from: com.google.android.datatransport:transport-backend-cct@@2.2.0 */
public final class p implements c<g> {
    public void a(Object obj, Object obj2) {
        g gVar = (g) obj;
        d dVar = (d) obj2;
        dVar.a("eventTimeMs", gVar.a).a("eventUptimeMs", gVar.c).a("timezoneOffsetSeconds", gVar.f2891f);
        byte[] bArr = gVar.d;
        if (bArr != null) {
            dVar.a("sourceExtension", (Object) bArr);
        }
        String str = gVar.e;
        if (str != null) {
            dVar.a("sourceExtensionJsonProto3", (Object) str);
        }
        int i2 = gVar.f2890b;
        if (i2 != Integer.MIN_VALUE) {
            dVar.a("eventCode", i2);
        }
        t tVar = gVar.f2892g;
        if (tVar != null) {
            dVar.a("networkConnectionInfo", (Object) tVar);
        }
    }
}
