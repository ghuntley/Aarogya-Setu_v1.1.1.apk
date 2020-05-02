package i.c.a.c.k0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.transformation.FabTransformationBehavior;
import i.c.a.c.u.c;

/* compiled from: FabTransformationBehavior */
public class c extends AnimatorListenerAdapter {
    public final /* synthetic */ i.c.a.c.u.c a;

    public c(FabTransformationBehavior fabTransformationBehavior, i.c.a.c.u.c cVar) {
        this.a = cVar;
    }

    public void onAnimationEnd(Animator animator) {
        c.e revealInfo = this.a.getRevealInfo();
        revealInfo.c = Float.MAX_VALUE;
        this.a.setRevealInfo(revealInfo);
    }
}
