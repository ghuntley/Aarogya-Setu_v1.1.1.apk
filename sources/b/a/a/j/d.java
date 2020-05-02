package b.a.a.j;

import android.content.Context;
import b.a.a.l.h;
import java.io.IOException;
import nic.goi.aarogyasetu.CoronaApplication;
import o.f0;
import o.g;
import o.j0;
import o.m0;
import o.o0.h.f;
import o.z;

/* compiled from: SupportInterceptor.kt */
public final class d implements z, g {
    public j0 a(z.a aVar) {
        if (aVar != null) {
            f fVar = (f) aVar;
            f0 f0Var = fVar.e;
            if (f0Var != null) {
                f0.a aVar2 = new f0.a(f0Var);
                String a = fVar.e.c.a("Authorization");
                boolean z = false;
                if (a == null || n.q.d.b(a)) {
                    String b2 = h.b();
                    if (b2 == null || n.q.d.b(b2)) {
                        z = true;
                    }
                    if (!z) {
                        aVar2.c.a("Authorization", b2);
                    }
                }
                aVar2.c.a("pt", "9cf23ec2-d83c-4778-aca5-d7fb64ae1b2d");
                aVar2.c.a("ver", String.valueOf(1045));
                j0 a2 = fVar.a(aVar2.a());
                n.m.c.f.a((Object) a2, "chain.proceed(request)");
                return a2;
            }
            throw null;
        }
        n.m.c.f.a("chain");
        throw null;
    }

    public f0 a(m0 m0Var, j0 j0Var) {
        boolean z;
        boolean z2 = false;
        int i2 = 0;
        while (true) {
            if (i2 > 2) {
                break;
            }
            try {
                h.c();
                z = true;
            } catch (IOException unused) {
                z = false;
            }
            if (z) {
                z2 = true;
                break;
            }
            i2++;
        }
        if (z2) {
            if (j0Var != null) {
                try {
                    f0 f0Var = j0Var.e;
                    if (f0Var != null) {
                        f0.a aVar = new f0.a(f0Var);
                        String b2 = h.b();
                        if (b2 == null) {
                            b2 = "";
                        }
                        aVar.c.a("Authorization", b2);
                        return aVar.a();
                    }
                } catch (IOException e) {
                    CoronaApplication coronaApplication = CoronaApplication.f5224g;
                    n.m.c.f.a((Object) coronaApplication, "CoronaApplication.instance");
                    h.a((Context) coronaApplication, true);
                    throw e;
                }
            }
            return null;
        }
        throw new IOException();
    }
}
