package i.c.d.m;

import i.c.a.b.l.h;
import i.c.d.m.a;
import i.c.d.m.o.a;
import i.c.d.m.o.c;
import i.c.d.m.o.d;

/* compiled from: com.google.firebase:firebase-installations@@16.1.0 */
public class i implements m {
    public final n a;

    /* renamed from: b  reason: collision with root package name */
    public final h<k> f4731b;

    public i(n nVar, h<k> hVar) {
        this.a = nVar;
        this.f4731b = hVar;
    }

    public boolean a(d dVar, Exception exc) {
        if (!dVar.a() && !dVar.b() && !dVar.c()) {
            return false;
        }
        this.f4731b.a.b(exc);
        return true;
    }

    public boolean a(d dVar) {
        if (dVar != null) {
            a aVar = (a) dVar;
            if (!(aVar.f4733b == c.a.f4743h) || this.a.a(dVar)) {
                return false;
            }
            h<k> hVar = this.f4731b;
            String str = aVar.c;
            if (str != null) {
                Long valueOf = Long.valueOf(aVar.e);
                Long valueOf2 = Long.valueOf(aVar.f4734f);
                String str2 = "";
                if (valueOf == null) {
                    str2 = i.a.a.a.a.b(str2, " tokenExpirationTimestamp");
                }
                if (valueOf2 == null) {
                    str2 = i.a.a.a.a.b(str2, " tokenCreationTimestamp");
                }
                if (str2.isEmpty()) {
                    hVar.a.a(new a(str, valueOf.longValue(), valueOf2.longValue(), (a.C0131a) null));
                    return true;
                }
                throw new IllegalStateException(i.a.a.a.a.b("Missing required properties:", str2));
            }
            throw new NullPointerException("Null token");
        }
        throw null;
    }
}
