package i.c.a.c.n;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import h.h.m.m;
import h.h.m.w.d;
import i.c.a.c.f0.l;

/* compiled from: SwipeDismissBehavior */
public class a implements d {
    public final /* synthetic */ SwipeDismissBehavior a;

    public a(SwipeDismissBehavior swipeDismissBehavior) {
        this.a = swipeDismissBehavior;
    }

    public boolean a(View view, d.a aVar) {
        boolean z = false;
        if (!this.a.a(view)) {
            return false;
        }
        boolean z2 = m.k(view) == 1;
        if ((this.a.e == 0 && z2) || (this.a.e == 1 && !z2)) {
            z = true;
        }
        int width = view.getWidth();
        if (z) {
            width = -width;
        }
        m.d(view, width);
        view.setAlpha(0.0f);
        SwipeDismissBehavior.b bVar = this.a.f549b;
        if (bVar != null) {
            ((l) bVar).a(view);
        }
        return true;
    }
}
