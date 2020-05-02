package h.l.d;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import h.h.i.a;
import h.l.d.h0;
import h.l.d.r;

/* compiled from: FragmentAnim */
public final class h extends AnimatorListenerAdapter {
    public final /* synthetic */ ViewGroup a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f1980b;
    public final /* synthetic */ Fragment c;
    public final /* synthetic */ h0.a d;
    public final /* synthetic */ a e;

    public h(ViewGroup viewGroup, View view, Fragment fragment, h0.a aVar, a aVar2) {
        this.a = viewGroup;
        this.f1980b = view;
        this.c = fragment;
        this.d = aVar;
        this.e = aVar2;
    }

    public void onAnimationEnd(Animator animator) {
        Animator animator2;
        this.a.endViewTransition(this.f1980b);
        Fragment.b bVar = this.c.N;
        if (bVar == null) {
            animator2 = null;
        } else {
            animator2 = bVar.f240b;
        }
        this.c.a((Animator) null);
        if (animator2 != null && this.a.indexOfChild(this.f1980b) < 0) {
            ((r.b) this.d).a(this.c, this.e);
        }
    }
}
