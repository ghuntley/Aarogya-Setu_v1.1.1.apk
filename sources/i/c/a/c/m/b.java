package i.c.a.c.m;

import android.animation.ValueAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* compiled from: AppBarLayout */
public class b implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ CoordinatorLayout a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f4154b;
    public final /* synthetic */ AppBarLayout.BaseBehavior c;

    public b(AppBarLayout.BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
        this.c = baseBehavior;
        this.a = coordinatorLayout;
        this.f4154b = appBarLayout;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.c.c(this.a, this.f4154b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
