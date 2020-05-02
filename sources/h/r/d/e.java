package h.r.d;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: DefaultItemAnimator */
public class e implements Runnable {
    public final /* synthetic */ ArrayList e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ k f2091f;

    public e(k kVar, ArrayList arrayList) {
        this.f2091f = kVar;
        this.e = arrayList;
    }

    public void run() {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            RecyclerView.d0 d0Var = (RecyclerView.d0) it.next();
            k kVar = this.f2091f;
            if (kVar != null) {
                View view = d0Var.e;
                ViewPropertyAnimator animate = view.animate();
                kVar.f2105o.add(d0Var);
                animate.alpha(1.0f).setDuration(kVar.c).setListener(new g(kVar, d0Var, view, animate)).start();
            } else {
                throw null;
            }
        }
        this.e.clear();
        this.f2091f.f2102l.remove(this.e);
    }
}
