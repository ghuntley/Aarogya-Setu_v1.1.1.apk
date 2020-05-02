package h.b.k;

import android.view.View;
import h.h.m.m;
import h.h.m.s;
import h.h.m.t;

/* compiled from: AppCompatDelegateImpl */
public class p extends t {
    public final /* synthetic */ k a;

    public p(k kVar) {
        this.a = kVar;
    }

    public void a(View view) {
        this.a.s.setAlpha(1.0f);
        this.a.v.a((s) null);
        this.a.v = null;
    }

    public void b(View view) {
        this.a.s.setVisibility(0);
        this.a.s.sendAccessibilityEvent(32);
        if (this.a.s.getParent() instanceof View) {
            m.C((View) this.a.s.getParent());
        }
    }
}
