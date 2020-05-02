package i.c.a.c.h0;

import android.animation.ValueAnimator;

/* compiled from: ClearTextEndIconDelegate */
public class e implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ a a;

    public e(a aVar) {
        this.a = aVar;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.a.c.setScaleX(floatValue);
        this.a.c.setScaleY(floatValue);
    }
}
