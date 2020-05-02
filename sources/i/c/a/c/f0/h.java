package i.c.a.c.f0;

import android.animation.ValueAnimator;
import com.google.android.material.snackbar.BaseTransientBottomBar;

/* compiled from: BaseTransientBottomBar */
public class h implements ValueAnimator.AnimatorUpdateListener {
    public int a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ BaseTransientBottomBar f4110b;

    public h(BaseTransientBottomBar baseTransientBottomBar) {
        this.f4110b = baseTransientBottomBar;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        this.f4110b.c.setTranslationY((float) intValue);
        this.a = intValue;
    }
}
