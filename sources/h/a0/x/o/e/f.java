package h.a0.x.o.e;

import android.content.Context;
import android.os.Build;
import h.a0.l;
import h.a0.m;
import h.a0.x.o.b;
import h.a0.x.o.f.g;
import h.a0.x.q.p;
import h.a0.x.r.p.a;

/* compiled from: NetworkNotRoamingController */
public class f extends c<b> {
    public static final String e = l.a("NetworkNotRoamingCtrlr");

    public f(Context context, a aVar) {
        super(g.a(context, aVar).c);
    }

    public boolean a(p pVar) {
        return pVar.f1065j.a == m.NOT_ROAMING;
    }

    public boolean b(Object obj) {
        b bVar = (b) obj;
        boolean z = true;
        if (Build.VERSION.SDK_INT < 24) {
            l.a().a(e, "Not-roaming network constraint is not supported before API 24, only checking for connected state.", new Throwable[0]);
            return !bVar.a;
        }
        if (bVar.a && bVar.d) {
            z = false;
        }
        return z;
    }
}
