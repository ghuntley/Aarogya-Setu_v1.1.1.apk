package i.c.a.c.h0;

import android.animation.ValueAnimator;

/* compiled from: DropdownMenuEndIconDelegate */
public class m implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ h a;

    public m(h hVar) {
        this.a = hVar;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
