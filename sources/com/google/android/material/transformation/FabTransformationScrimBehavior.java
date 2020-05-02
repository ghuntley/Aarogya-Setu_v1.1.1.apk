package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import i.c.a.b.d.l.q;
import i.c.a.c.l.h;
import java.util.ArrayList;
import java.util.List;

public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {
    public final h c = new h(75, 150);
    public final h d = new h(0, 150);

    public class a extends AnimatorListenerAdapter {
        public final /* synthetic */ boolean a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f687b;

        public a(FabTransformationScrimBehavior fabTransformationScrimBehavior, boolean z, View view) {
            this.a = z;
            this.f687b = view;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.a) {
                this.f687b.setVisibility(4);
            }
        }

        public void onAnimationStart(Animator animator) {
            if (this.a) {
                this.f687b.setVisibility(0);
            }
        }
    }

    public FabTransformationScrimBehavior() {
    }

    public boolean a(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return view2 instanceof FloatingActionButton;
    }

    public AnimatorSet b(View view, View view2, boolean z, boolean z2) {
        ObjectAnimator objectAnimator;
        ArrayList arrayList = new ArrayList();
        new ArrayList();
        h hVar = z ? this.c : this.d;
        if (z) {
            if (!z2) {
                view2.setAlpha(0.0f);
            }
            objectAnimator = ObjectAnimator.ofFloat(view2, View.ALPHA, new float[]{1.0f});
        } else {
            objectAnimator = ObjectAnimator.ofFloat(view2, View.ALPHA, new float[]{0.0f});
        }
        hVar.a(objectAnimator);
        arrayList.add(objectAnimator);
        AnimatorSet animatorSet = new AnimatorSet();
        q.a(animatorSet, (List<Animator>) arrayList);
        animatorSet.addListener(new a(this, z, view2));
        return animatorSet;
    }

    public boolean b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
