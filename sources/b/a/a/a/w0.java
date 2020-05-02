package b.a.a.a;

import android.content.Context;
import b.a.a.k.a;
import b.a.a.l.o;
import i.c.e.j;
import i.c.e.l;
import nic.goi.aarogyasetu.CoronaApplication;
import q.d;
import q.d0;
import q.f;

/* compiled from: SplashActivity.kt */
public final class w0 implements f<j> {
    public final /* synthetic */ Context a;

    public w0(Context context) {
        this.a = context;
    }

    public void a(d<j> dVar, Throwable th) {
        if (dVar == null) {
            n.m.c.f.a("call");
            throw null;
        } else if (th == null) {
            n.m.c.f.a("t");
            throw null;
        }
    }

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
                n.m.c.f.a((Object) t, "response.body()!!");
                l d = ((j) t).d();
                if (d.b("p")) {
                    j a2 = d.a("p");
                    n.m.c.f.a((Object) a2, "jsonObject.get(Constants.PUSH_P)");
                    if (a2.c() == 1) {
                        a.a(this.a, "p", true);
                        o.f436b.h(this.a);
                        if (d.b("did")) {
                            CoronaApplication coronaApplication = CoronaApplication.f5224g;
                            j a3 = d.a("did");
                            n.m.c.f.a((Object) a3, "jsonObject.get(Constants.UNIQUE_ID)");
                            a.b(coronaApplication, "unique_id", a3.f());
                            return;
                        }
                        return;
                    }
                }
                a.a(this.a, "p", false);
                return;
            }
            n.m.c.f.a();
            throw null;
        }
    }
}
