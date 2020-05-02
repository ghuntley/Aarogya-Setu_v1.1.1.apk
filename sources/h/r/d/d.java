package h.r.d;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import h.r.d.k;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: DefaultItemAnimator */
public class d implements Runnable {
    public final /* synthetic */ ArrayList e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ k f2090f;

    public d(k kVar, ArrayList arrayList) {
        this.f2090f = kVar;
        this.e = arrayList;
    }

    public void run() {
        View view;
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            k.a aVar = (k.a) it.next();
            k kVar = this.f2090f;
            View view2 = null;
            if (kVar != null) {
                RecyclerView.d0 d0Var = aVar.a;
                if (d0Var == null) {
                    view = null;
                } else {
                    view = d0Var.e;
                }
                RecyclerView.d0 d0Var2 = aVar.f2108b;
                if (d0Var2 != null) {
                    view2 = d0Var2.e;
                }
                if (view != null) {
                    ViewPropertyAnimator duration = view.animate().setDuration(kVar.f312f);
                    kVar.r.add(aVar.a);
                    duration.translationX((float) (aVar.e - aVar.c));
                    duration.translationY((float) (aVar.f2109f - aVar.d));
                    duration.alpha(0.0f).setListener(new i(kVar, aVar, duration, view)).start();
                }
                if (view2 != null) {
                    ViewPropertyAnimator animate = view2.animate();
                    kVar.r.add(aVar.f2108b);
                    animate.translationX(0.0f).translationY(0.0f).setDuration(kVar.f312f).alpha(1.0f).setListener(new j(kVar, aVar, animate, view2)).start();
                }
            } else {
                throw null;
            }
        }
        this.e.clear();
        this.f2090f.f2104n.remove(this.e);
    }
}
