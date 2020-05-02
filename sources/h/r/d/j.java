package h.r.d;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import h.r.d.k;

/* compiled from: DefaultItemAnimator */
public class j extends AnimatorListenerAdapter {
    public final /* synthetic */ k.a a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f2097b;
    public final /* synthetic */ View c;
    public final /* synthetic */ k d;

    public j(k kVar, k.a aVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.d = kVar;
        this.a = aVar;
        this.f2097b = viewPropertyAnimator;
        this.c = view;
    }

    public void onAnimationEnd(Animator animator) {
        this.f2097b.setListener((Animator.AnimatorListener) null);
        this.c.setAlpha(1.0f);
        this.c.setTranslationX(0.0f);
        this.c.setTranslationY(0.0f);
        this.d.a(this.a.f2108b);
        this.d.r.remove(this.a.f2108b);
        this.d.d();
    }

    public void onAnimationStart(Animator animator) {
        k kVar = this.d;
        RecyclerView.d0 d0Var = this.a.f2108b;
        if (kVar == null) {
            throw null;
        }
    }
}
