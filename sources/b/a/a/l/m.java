package b.a.a.l;

import b.a.a.k.a;
import b.a.a.l.o;
import i.c.e.j;
import i.c.e.l;
import nic.goi.aarogyasetu.CoronaApplication;
import q.d;
import q.d0;
import q.f;

/* compiled from: CorUtility.kt */
public final class m implements f<j> {
    public void a(d<j> dVar, d0<j> d0Var) {
        T t;
        if (dVar == null) {
            n.m.c.f.a("call");
            throw null;
        } else if (d0Var == null) {
            n.m.c.f.a("response");
            throw null;
        } else if (d0Var.a() && (t = d0Var.f5713b) != null) {
            if (t != null) {
                try {
                    n.m.c.f.a((Object) t, "response.body()!!");
                    l d = ((j) t).d();
                    if (d.b("f_upgrade_android")) {
                        o.a aVar = o.f436b;
                        String jVar = d.a("f_upgrade_android").toString();
                        n.m.c.f.a((Object) jVar, "jsonObject.get(Constants.FORCE_UPGRADE).toString()");
                        aVar.a(jVar);
                    }
                    if (d.b("max_data_persisting_days")) {
                        a.b(CoronaApplication.f5224g, "max_data_persisting_days", d.a("max_data_persisting_days").toString());
                    }
                } catch (Exception unused) {
                    o.f436b.a();
                }
            } else {
                n.m.c.f.a();
                throw null;
            }
        }
    }

    public void a(d<j> dVar, Throwable th) {
        if (dVar == null) {
            n.m.c.f.a("call");
            throw null;
        } else if (th != null) {
            o.f436b.a();
        } else {
            n.m.c.f.a("t");
            throw null;
        }
    }
}
