package h.l.d;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.Fragment;
import h.l.d.h0;
import h.l.d.r;

/* compiled from: FragmentAnim */
public final class g implements Animation.AnimationListener {
    public final /* synthetic */ ViewGroup a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Fragment f1968b;
    public final /* synthetic */ h0.a c;
    public final /* synthetic */ h.h.i.a d;

    /* compiled from: FragmentAnim */
    public class a implements Runnable {
        public a() {
        }

        public void run() {
            if (g.this.f1968b.g() != null) {
                g.this.f1968b.a((View) null);
                g gVar = g.this;
                ((r.b) gVar.c).a(gVar.f1968b, gVar.d);
            }
        }
    }

    public g(ViewGroup viewGroup, Fragment fragment, h0.a aVar, h.h.i.a aVar2) {
        this.a = viewGroup;
        this.f1968b = fragment;
        this.c = aVar;
        this.d = aVar2;
    }

    public void onAnimationEnd(Animation animation) {
        this.a.post(new a());
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }
}
