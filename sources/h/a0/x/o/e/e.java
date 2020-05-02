package h.a0.x.o.e;

import android.content.Context;
import android.os.Build;
import h.a0.l;
import h.a0.m;
import h.a0.x.o.b;
import h.a0.x.o.f.g;
import h.a0.x.q.p;
import h.a0.x.r.p.a;

/* compiled from: NetworkMeteredController */
public class e extends c<b> {
    public static final String e = l.a("NetworkMeteredCtrlr");

    public e(Context context, a aVar) {
        super(g.a(context, aVar).c);
    }

    public boolean a(p pVar) {
        return pVar.f1065j.a == m.METERED;
    }

    public boolean b(Object obj) {
        b bVar = (b) obj;
        boolean z = true;
        if (Build.VERSION.SDK_INT < 26) {
            l.a().a(e, "Metered network constraint is not supported before API 26, only checking for connected state.", new Throwable[0]);
            return !bVar.a;
        }
        if (bVar.a && bVar.c) {
            z = false;
        }
        return z;
    }
}
