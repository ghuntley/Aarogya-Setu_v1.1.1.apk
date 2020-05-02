package h.a0.x.o.e;

import android.content.Context;
import android.os.Build;
import h.a0.m;
import h.a0.x.o.b;
import h.a0.x.o.f.g;
import h.a0.x.q.p;
import h.a0.x.r.p.a;

/* compiled from: NetworkConnectedController */
public class d extends c<b> {
    public d(Context context, a aVar) {
        super(g.a(context, aVar).c);
    }

    public boolean a(p pVar) {
        return pVar.f1065j.a == m.CONNECTED;
    }

    public boolean b(Object obj) {
        b bVar = (b) obj;
        if (Build.VERSION.SDK_INT < 26) {
            return true ^ bVar.a;
        }
        if (!bVar.a || !bVar.f1021b) {
            return true;
        }
        return false;
    }
}
