package h.w;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: Transition */
public class k extends AnimatorListenerAdapter {
    public final /* synthetic */ i a;

    public k(i iVar) {
        this.a = iVar;
    }

    public void onAnimationEnd(Animator animator) {
        this.a.b();
        animator.removeListener(this);
    }
}
