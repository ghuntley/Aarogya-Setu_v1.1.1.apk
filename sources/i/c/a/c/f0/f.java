package i.c.a.c.f0;

import android.animation.ValueAnimator;
import com.google.android.material.snackbar.BaseTransientBottomBar;

/* compiled from: BaseTransientBottomBar */
public class f implements ValueAnimator.AnimatorUpdateListener {
    public int a = this.f4108b;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f4108b;
    public final /* synthetic */ BaseTransientBottomBar c;

    public f(BaseTransientBottomBar baseTransientBottomBar, int i2) {
        this.c = baseTransientBottomBar;
        this.f4108b = i2;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        this.c.c.setTranslationY((float) intValue);
        this.a = intValue;
    }
}
