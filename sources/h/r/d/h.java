package h.r.d;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: DefaultItemAnimator */
public class h extends AnimatorListenerAdapter {
    public final /* synthetic */ RecyclerView.d0 a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f2094b;
    public final /* synthetic */ View c;
    public final /* synthetic */ int d;
    public final /* synthetic */ ViewPropertyAnimator e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ k f2095f;

    public h(k kVar, RecyclerView.d0 d0Var, int i2, View view, int i3, ViewPropertyAnimator viewPropertyAnimator) {
        this.f2095f = kVar;
        this.a = d0Var;
        this.f2094b = i2;
        this.c = view;
        this.d = i3;
        this.e = viewPropertyAnimator;
    }

    public void onAnimationCancel(Animator animator) {
        if (this.f2094b != 0) {
            this.c.setTranslationX(0.0f);
        }
        if (this.d != 0) {
            this.c.setTranslationY(0.0f);
        }
    }

    public void onAnimationEnd(Animator animator) {
        this.e.setListener((Animator.AnimatorListener) null);
        this.f2095f.a(this.a);
        this.f2095f.f2106p.remove(this.a);
        this.f2095f.d();
    }

    public void onAnimationStart(Animator animator) {
        if (this.f2095f == null) {
            throw null;
        }
    }
}
