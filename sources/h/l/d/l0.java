package h.l.d;

import android.view.View;
import h.h.m.m;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: FragmentTransitionImpl */
public class l0 implements Runnable {
    public final /* synthetic */ ArrayList e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Map f2000f;

    public l0(m0 m0Var, ArrayList arrayList, Map map) {
        this.e = arrayList;
        this.f2000f = map;
    }

    public void run() {
        int size = this.e.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = (View) this.e.get(i2);
            view.setTransitionName((String) this.f2000f.get(m.q(view)));
        }
    }
}
