package i.c.a.c.f0;

import android.animation.ValueAnimator;
import com.google.android.material.snackbar.BaseTransientBottomBar;

/* compiled from: BaseTransientBottomBar */
public class d implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ BaseTransientBottomBar a;

    public d(BaseTransientBottomBar baseTransientBottomBar) {
        this.a = baseTransientBottomBar;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.a.c.setScaleX(floatValue);
        this.a.c.setScaleY(floatValue);
    }
}
