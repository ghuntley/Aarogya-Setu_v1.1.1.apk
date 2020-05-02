package h.l.d;

import android.view.View;
import h.h.m.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* compiled from: FragmentTransitionImpl */
public class k0 implements Runnable {
    public final /* synthetic */ ArrayList e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Map f1997f;

    public k0(m0 m0Var, ArrayList arrayList, Map map) {
        this.e = arrayList;
        this.f1997f = map;
    }

    public void run() {
        String str;
        int size = this.e.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = (View) this.e.get(i2);
            String q2 = m.q(view);
            if (q2 != null) {
                Iterator it = this.f1997f.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        str = null;
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    if (q2.equals(entry.getValue())) {
                        str = (String) entry.getKey();
                        break;
                    }
                }
                view.setTransitionName(str);
            }
        }
    }
}
