package h.r.d;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: DefaultItemAnimator */
public class f extends AnimatorListenerAdapter {
    public final /* synthetic */ RecyclerView.d0 a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f2092b;
    public final /* synthetic */ View c;
    public final /* synthetic */ k d;

    public f(k kVar, RecyclerView.d0 d0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.d = kVar;
        this.a = d0Var;
        this.f2092b = viewPropertyAnimator;
        this.c = view;
    }

    public void onAnimationEnd(Animator animator) {
        this.f2092b.setListener((Animator.AnimatorListener) null);
        this.c.setAlpha(1.0f);
        this.d.a(this.a);
        this.d.f2107q.remove(this.a);
        this.d.d();
    }

    public void onAnimationStart(Animator animator) {
        if (this.d == null) {
            throw null;
        }
    }
}
