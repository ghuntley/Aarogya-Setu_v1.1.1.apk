package i.c.a.c.k0;

import android.animation.ValueAnimator;
import android.view.View;
import com.google.android.material.transformation.FabTransformationBehavior;

/* compiled from: FabTransformationBehavior */
public class a implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ View a;

    public a(FabTransformationBehavior fabTransformationBehavior, View view) {
        this.a = view;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.invalidate();
    }
}
