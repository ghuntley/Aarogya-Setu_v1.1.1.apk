package b.a.a.l;

import android.content.Context;
import b.a.a.j.c;
import b.a.a.k.a;
import b.a.a.l.o;
import i.c.d.p.e;
import i.c.e.j;
import i.c.e.l;
import i.c.e.t.r;
import nic.goi.aarogyasetu.CoronaApplication;
import nic.goi.aarogyasetu.views.MainActivity;
import q.d;
import q.d0;
import q.f;

/* compiled from: CorUtility.kt */
public final class s implements f<j> {
    public final /* synthetic */ MainActivity.b a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f438b;

    public s(MainActivity.b bVar, Context context) {
        this.a = bVar;
        this.f438b = context;
    }

    public void a(d<j> dVar, d0<j> d0Var) {
        T t;
        V v = null;
        if (dVar == null) {
            n.m.c.f.a("call");
            throw null;
        } else if (d0Var == null) {
            n.m.c.f.a("response");
            throw null;
        } else if (!d0Var.a() || (t = d0Var.f5713b) == null) {
            this.a.b();
        } else {
            o.a aVar = o.f436b;
            MainActivity.b bVar = this.a;
            if (t != null) {
                try {
                    n.m.c.f.a((Object) t, "response.body()!!");
                    r.e<String, j> a2 = ((j) t).d().a.a((Object) "data");
                    if (a2 != null) {
                        v = a2.f4887k;
                    }
                    j a3 = ((l) v).a("did");
                    n.m.c.f.a((Object) a3, "asJsonObject.get(nic.goi…lity.Constants.UNIQUE_ID)");
                    a.b(CoronaApplication.f5224g, "unique_id", a3.f());
                } catch (Exception e) {
                    e.a(e);
                    if (bVar != null) {
                        bVar.b();
                    }
                }
                String a4 = a.a((Context) CoronaApplication.f5224g, "unique_id", "");
                if (!(a4 == null || a4.length() == 0)) {
                    this.a.a();
                    o.f436b.b(this.f438b);
                    return;
                }
                o.a aVar2 = o.f436b;
                Context context = this.f438b;
                MainActivity.b bVar2 = this.a;
                if (h.c.a()) {
                    ((c) e.a(false, false, true, "").a(c.class)).a(aVar2.a(false)).a(new n(context, bVar2));
                    return;
                }
                return;
            }
            n.m.c.f.a();
            throw null;
        }
    }

    public void a(d<j> dVar, Throwable th) {
        if (dVar == null) {
            n.m.c.f.a("call");
            throw null;
        } else if (th != null) {
            e.a(new Exception(th));
            this.a.b();
        } else {
            n.m.c.f.a("t");
            throw null;
        }
    }
}
