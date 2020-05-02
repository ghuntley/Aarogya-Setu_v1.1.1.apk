package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {

    /* renamed from: b  reason: collision with root package name */
    public AnimatorSet f681b;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        public void onAnimationEnd(Animator animator) {
            ExpandableTransformationBehavior.this.f681b = null;
        }
    }

    public ExpandableTransformationBehavior() {
    }

    public boolean a(View view, View view2, boolean z, boolean z2) {
        boolean z3 = this.f681b != null;
        if (z3) {
            this.f681b.cancel();
        }
        AnimatorSet b2 = b(view, view2, z, z3);
        this.f681b = b2;
        b2.addListener(new a());
        this.f681b.start();
        if (!z2) {
            this.f681b.end();
        }
        return true;
    }

    public abstract AnimatorSet b(View view, View view2, boolean z, boolean z2);

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
