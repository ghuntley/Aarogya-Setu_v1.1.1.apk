package i.c.a.c.f0;

import android.animation.ValueAnimator;
import com.google.android.material.snackbar.BaseTransientBottomBar;

/* compiled from: BaseTransientBottomBar */
public class c implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ BaseTransientBottomBar a;

    public c(BaseTransientBottomBar baseTransientBottomBar) {
        this.a = baseTransientBottomBar;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
