package i.c.a.c.p;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import i.c.a.c.e0.g;

/* compiled from: BottomSheetBehavior */
public class a implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ BottomSheetBehavior a;

    public a(BottomSheetBehavior bottomSheetBehavior) {
        this.a = bottomSheetBehavior;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        g gVar = this.a.f566i;
        if (gVar != null) {
            gVar.b(floatValue);
        }
    }
}
