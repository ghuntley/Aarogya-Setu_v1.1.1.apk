package i.c.a.c.m;

import android.animation.ValueAnimator;
import com.google.android.material.appbar.AppBarLayout;
import i.c.a.c.e0.g;

/* compiled from: AppBarLayout */
public class a implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ g a;

    public a(AppBarLayout appBarLayout, g gVar) {
        this.a = gVar;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
