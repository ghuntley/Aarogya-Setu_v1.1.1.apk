package i.c.a.a.i.b;

import com.google.firebase.encoders.EncodingException;
import i.c.d.h.c;
import i.c.d.h.d;

/* compiled from: com.google.android.datatransport:transport-backend-cct@@2.2.0 */
public final class r implements c<h> {
    public void a(Object obj, Object obj2) {
        h hVar = (h) obj;
        d dVar = (d) obj2;
        dVar.a("requestTimeMs", hVar.a).a("requestUptimeMs", hVar.f2896b);
        m mVar = hVar.c;
        if (mVar != null) {
            dVar.a("clientInfo", (Object) mVar);
        }
        String str = hVar.e;
        if (str != null) {
            dVar.a("logSourceName", (Object) str);
        } else {
            int i2 = hVar.d;
            if (i2 != Integer.MIN_VALUE) {
                dVar.a("logSource", i2);
            } else {
                throw new EncodingException("Log request must have either LogSourceName or LogSource");
            }
        }
        if (!hVar.f2897f.isEmpty()) {
            dVar.a("logEvent", (Object) hVar.f2897f);
        }
    }
}
