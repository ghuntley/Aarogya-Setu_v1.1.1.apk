package h.l.d;

import android.animation.Animator;
import android.view.View;
import androidx.fragment.app.Fragment;
import h.h.i.a;

/* compiled from: FragmentAnim */
public final class f implements a.C0045a {
    public final /* synthetic */ Fragment a;

    public f(Fragment fragment) {
        this.a = fragment;
    }

    public void a() {
        if (this.a.g() != null) {
            View g2 = this.a.g();
            this.a.a((View) null);
            g2.clearAnimation();
        }
        this.a.a((Animator) null);
    }
}
