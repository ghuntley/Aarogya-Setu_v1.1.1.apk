package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.c<V> {
    public int a = 0;

    /* renamed from: b  reason: collision with root package name */
    public int f548b = 2;
    public int c = 0;
    public ViewPropertyAnimator d;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        public void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.d = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
    }

    public boolean a(CoordinatorLayout coordinatorLayout, V v, int i2) {
        this.a = v.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v.getLayoutParams()).bottomMargin;
        return false;
    }

    public boolean a(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i2, int i3) {
        return i2 == 2;
    }

    public void a(CoordinatorLayout coordinatorLayout, V v, View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        if (i3 > 0) {
            if (this.f548b != 1) {
                ViewPropertyAnimator viewPropertyAnimator = this.d;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                    v.clearAnimation();
                }
                this.f548b = 1;
                a(v, this.a + this.c, 175, i.c.a.c.l.a.c);
            }
        } else if (i3 < 0 && this.f548b != 2) {
            ViewPropertyAnimator viewPropertyAnimator2 = this.d;
            if (viewPropertyAnimator2 != null) {
                viewPropertyAnimator2.cancel();
                v.clearAnimation();
            }
            this.f548b = 2;
            a(v, 0, 225, i.c.a.c.l.a.d);
        }
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void a(V v, int i2, long j2, TimeInterpolator timeInterpolator) {
        this.d = v.animate().translationY((float) i2).setInterpolator(timeInterpolator).setDuration(j2).setListener(new a());
    }
}
