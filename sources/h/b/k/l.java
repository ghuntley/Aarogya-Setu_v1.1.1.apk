package h.b.k;

import android.graphics.Rect;
import android.view.View;
import android.view.WindowInsets;
import h.h.m.k;
import h.h.m.m;
import h.h.m.v;

/* compiled from: AppCompatDelegateImpl */
public class l implements k {
    public final /* synthetic */ k a;

    public l(k kVar) {
        this.a = kVar;
    }

    public v a(View view, v vVar) {
        int d = vVar.d();
        int a2 = this.a.a(vVar, (Rect) null);
        if (d != a2) {
            vVar = new v(((WindowInsets) vVar.a).replaceSystemWindowInsets(vVar.b(), a2, vVar.c(), vVar.a()));
        }
        return m.a(view, vVar);
    }
}
