package h.r.d;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import h.r.d.k;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: DefaultItemAnimator */
public class c implements Runnable {
    public final /* synthetic */ ArrayList e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ k f2089f;

    public c(k kVar, ArrayList arrayList) {
        this.f2089f = kVar;
        this.e = arrayList;
    }

    public void run() {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            k.b bVar = (k.b) it.next();
            k kVar = this.f2089f;
            RecyclerView.d0 d0Var = bVar.a;
            int i2 = bVar.f2110b;
            int i3 = bVar.c;
            int i4 = bVar.d;
            int i5 = bVar.e;
            if (kVar != null) {
                View view = d0Var.e;
                int i6 = i4 - i2;
                int i7 = i5 - i3;
                if (i6 != 0) {
                    view.animate().translationX(0.0f);
                }
                if (i7 != 0) {
                    view.animate().translationY(0.0f);
                }
                ViewPropertyAnimator animate = view.animate();
                kVar.f2106p.add(d0Var);
                animate.setDuration(kVar.e).setListener(new h(kVar, d0Var, i6, view, i7, animate)).start();
            } else {
                throw null;
            }
        }
        this.e.clear();
        this.f2089f.f2103m.remove(this.e);
    }
}
