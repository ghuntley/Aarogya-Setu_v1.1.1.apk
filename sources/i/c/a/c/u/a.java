package i.c.a.c.u;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: CircularRevealCompat */
public final class a extends AnimatorListenerAdapter {
    public final /* synthetic */ c a;

    public a(c cVar) {
        this.a = cVar;
    }

    public void onAnimationEnd(Animator animator) {
        this.a.b();
    }

    public void onAnimationStart(Animator animator) {
        this.a.a();
    }
}
