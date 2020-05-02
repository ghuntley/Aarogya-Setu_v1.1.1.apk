package h.r.d;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: DefaultItemAnimator */
public class g extends AnimatorListenerAdapter {
    public final /* synthetic */ RecyclerView.d0 a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f2093b;
    public final /* synthetic */ ViewPropertyAnimator c;
    public final /* synthetic */ k d;

    public g(k kVar, RecyclerView.d0 d0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.d = kVar;
        this.a = d0Var;
        this.f2093b = view;
        this.c = viewPropertyAnimator;
    }

    public void onAnimationCancel(Animator animator) {
        this.f2093b.setAlpha(1.0f);
    }

    public void onAnimationEnd(Animator animator) {
        this.c.setListener((Animator.AnimatorListener) null);
        this.d.a(this.a);
        this.d.f2105o.remove(this.a);
        this.d.d();
    }

    public void onAnimationStart(Animator animator) {
        if (this.d == null) {
            throw null;
        }
    }
}
