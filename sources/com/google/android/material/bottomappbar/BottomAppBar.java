package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import h.h.m.m;
import i.c.a.b.d.l.q;
import i.c.a.c.l.j;
import i.c.a.c.o.b;
import i.c.a.c.o.c;
import i.c.a.c.o.d;
import i.c.a.c.o.e;
import i.c.a.c.o.f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class BottomAppBar extends Toolbar implements CoordinatorLayout.b {
    public Animator R;
    public Animator S;
    public int T;
    public int U;
    public boolean V;
    public int W;
    public boolean a0;
    public Behavior b0;
    public AnimatorListenerAdapter c0;

    public static class a extends h.j.a.a {
        public static final Parcelable.Creator<a> CREATOR = new C0016a();

        /* renamed from: g  reason: collision with root package name */
        public int f560g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f561h;

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$a$a  reason: collision with other inner class name */
        public static class C0016a implements Parcelable.ClassLoaderCreator<a> {
            public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new a(parcel, classLoader);
            }

            public Object[] newArray(int i2) {
                return new a[i2];
            }

            public Object createFromParcel(Parcel parcel) {
                return new a(parcel, (ClassLoader) null);
            }
        }

        public a(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeParcelable(this.e, i2);
            parcel.writeInt(this.f560g);
            parcel.writeInt(this.f561h ? 1 : 0);
        }

        public a(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f560g = parcel.readInt();
            this.f561h = parcel.readInt() != 0;
        }
    }

    private ActionMenuView getActionMenuView() {
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    private int getBottomInset() {
        return 0;
    }

    /* access modifiers changed from: private */
    public float getFabTranslationX() {
        return b(this.T);
    }

    private float getFabTranslationY() {
        return -getTopEdgeTreatment().f4173g;
    }

    private int getLeftInset() {
        return 0;
    }

    private int getRightInset() {
        return 0;
    }

    private f getTopEdgeTreatment() {
        throw null;
    }

    public ColorStateList getBackgroundTint() {
        throw null;
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().f4173g;
    }

    public int getFabAlignmentMode() {
        return this.T;
    }

    public int getFabAnimationMode() {
        return this.U;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().f4172f;
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().e;
    }

    public boolean getHideOnScroll() {
        return this.V;
    }

    public final FloatingActionButton h() {
        View i2 = i();
        if (i2 instanceof FloatingActionButton) {
            return (FloatingActionButton) i2;
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View i() {
        /*
            r4 = this;
            android.view.ViewParent r0 = r4.getParent()
            boolean r0 = r0 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout
            r1 = 0
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            android.view.ViewParent r0 = r4.getParent()
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            java.util.List r0 = r0.b((android.view.View) r4)
            java.util.Iterator r0 = r0.iterator()
        L_0x0018:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x002d
            java.lang.Object r2 = r0.next()
            android.view.View r2 = (android.view.View) r2
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton
            if (r3 != 0) goto L_0x002c
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
            if (r3 == 0) goto L_0x0018
        L_0x002c:
            return r2
        L_0x002d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomappbar.BottomAppBar.i():android.view.View");
    }

    public final boolean j() {
        FloatingActionButton h2 = h();
        return h2 != null && h2.c();
    }

    public final void k() {
        getTopEdgeTreatment().f4174h = getFabTranslationX();
        i();
        if (this.a0) {
            boolean j2 = j();
        }
        throw null;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        throw null;
    }

    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        if (z) {
            Animator animator = this.S;
            if (animator != null) {
                animator.cancel();
            }
            Animator animator2 = this.R;
            if (animator2 != null) {
                animator2.cancel();
            }
            k();
            throw null;
        }
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null) {
            actionMenuView.setAlpha(1.0f);
            if (!j()) {
                actionMenuView.setTranslationX((float) a(actionMenuView, 0, false));
            } else {
                actionMenuView.setTranslationX((float) a(actionMenuView, this.T, this.a0));
            }
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.e);
        this.T = aVar.f560g;
        this.a0 = aVar.f561h;
    }

    public Parcelable onSaveInstanceState() {
        a aVar = new a(super.onSaveInstanceState());
        aVar.f560g = this.T;
        aVar.f561h = this.a0;
        return aVar;
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        throw null;
    }

    public void setCradleVerticalOffset(float f2) {
        if (f2 != getCradleVerticalOffset()) {
            f topEdgeTreatment = getTopEdgeTreatment();
            if (topEdgeTreatment == null) {
                throw null;
            } else if (f2 >= 0.0f) {
                topEdgeTreatment.f4173g = f2;
                throw null;
            } else {
                throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
            }
        }
    }

    public void setElevation(float f2) {
        throw null;
    }

    public void setFabAlignmentMode(int i2) {
        int i3;
        if (this.T != i2 && m.x(this)) {
            Animator animator = this.R;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (this.U == 1) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(h(), "translationX", new float[]{b(i2)});
                ofFloat.setDuration(300);
                arrayList.add(ofFloat);
            } else {
                FloatingActionButton h2 = h();
                if (h2 != null && !h2.b()) {
                    this.W++;
                    h2.a((FloatingActionButton.a) new b(this, i2), true);
                }
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            this.R = animatorSet;
            animatorSet.addListener(new i.c.a.c.o.a(this));
            this.R.start();
        }
        boolean z = this.a0;
        if (m.x(this)) {
            Animator animator2 = this.S;
            if (animator2 != null) {
                animator2.cancel();
            }
            ArrayList arrayList2 = new ArrayList();
            if (!j()) {
                z = false;
                i3 = 0;
            } else {
                i3 = i2;
            }
            ActionMenuView actionMenuView = getActionMenuView();
            if (actionMenuView != null) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", new float[]{1.0f});
                if (Math.abs(actionMenuView.getTranslationX() - ((float) a(actionMenuView, i3, z))) > 1.0f) {
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(actionMenuView, "alpha", new float[]{0.0f});
                    ofFloat3.addListener(new d(this, actionMenuView, i3, z));
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    animatorSet2.setDuration(150);
                    animatorSet2.playSequentially(new Animator[]{ofFloat3, ofFloat2});
                    arrayList2.add(animatorSet2);
                } else if (actionMenuView.getAlpha() < 1.0f) {
                    arrayList2.add(ofFloat2);
                }
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.playTogether(arrayList2);
            this.S = animatorSet3;
            animatorSet3.addListener(new c(this));
            this.S.start();
        }
        this.T = i2;
    }

    public void setFabAnimationMode(int i2) {
        this.U = i2;
    }

    public void setFabCradleMargin(float f2) {
        if (f2 != getFabCradleMargin()) {
            getTopEdgeTreatment().f4172f = f2;
            throw null;
        }
    }

    public void setFabCradleRoundedCornerRadius(float f2) {
        if (f2 != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().e = f2;
            throw null;
        }
    }

    public void setHideOnScroll(boolean z) {
        this.V = z;
    }

    public void setSubtitle(CharSequence charSequence) {
    }

    public void setTitle(CharSequence charSequence) {
    }

    public static /* synthetic */ void a(BottomAppBar bottomAppBar) {
        bottomAppBar.W--;
    }

    public final float b(int i2) {
        boolean a2 = q.a((View) this);
        int i3 = 1;
        if (i2 != 1) {
            return 0.0f;
        }
        int measuredWidth = (getMeasuredWidth() / 2) + 0;
        if (a2) {
            i3 = -1;
        }
        return (float) (measuredWidth * i3);
    }

    public Behavior getBehavior() {
        if (this.b0 == null) {
            this.b0 = new Behavior();
        }
        return this.b0;
    }

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {
        public final Rect e = new Rect();

        /* renamed from: f  reason: collision with root package name */
        public WeakReference<BottomAppBar> f557f;

        /* renamed from: g  reason: collision with root package name */
        public int f558g;

        /* renamed from: h  reason: collision with root package name */
        public final View.OnLayoutChangeListener f559h = new a();

        public class a implements View.OnLayoutChangeListener {
            public a() {
            }

            public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                if (((BottomAppBar) Behavior.this.f557f.get()) == null || !(view instanceof FloatingActionButton)) {
                    view.removeOnLayoutChangeListener(this);
                    return;
                }
                FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                Behavior.this.e.set(0, 0, floatingActionButton.getMeasuredWidth(), floatingActionButton.getMeasuredHeight());
                throw null;
            }
        }

        public Behavior() {
        }

        public boolean a(CoordinatorLayout coordinatorLayout, View view, int i2) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            this.f557f = new WeakReference<>(bottomAppBar);
            View c = bottomAppBar.i();
            if (c == null || m.x(c)) {
                coordinatorLayout.b(bottomAppBar, i2);
                this.a = bottomAppBar.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) bottomAppBar.getLayoutParams()).bottomMargin;
                return false;
            }
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) c.getLayoutParams();
            fVar.d = 49;
            this.f558g = fVar.bottomMargin;
            if (c instanceof FloatingActionButton) {
                FloatingActionButton floatingActionButton = (FloatingActionButton) c;
                floatingActionButton.addOnLayoutChangeListener(this.f559h);
                if (bottomAppBar != null) {
                    floatingActionButton.a((Animator.AnimatorListener) null);
                    floatingActionButton.b(new e(bottomAppBar));
                    floatingActionButton.a((j<? extends FloatingActionButton>) null);
                } else {
                    throw null;
                }
            }
            bottomAppBar.k();
            throw null;
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public boolean a(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i2, int i3) {
            if (!((BottomAppBar) view).getHideOnScroll()) {
                return false;
            }
            return i2 == 2;
        }
    }

    public int a(ActionMenuView actionMenuView, int i2, boolean z) {
        if (i2 != 1 || !z) {
            return 0;
        }
        boolean a2 = q.a((View) this);
        int measuredWidth = a2 ? getMeasuredWidth() : 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if ((childAt.getLayoutParams() instanceof Toolbar.e) && (((Toolbar.e) childAt.getLayoutParams()).a & 8388615) == 8388611) {
                if (a2) {
                    measuredWidth = Math.min(measuredWidth, childAt.getLeft());
                } else {
                    measuredWidth = Math.max(measuredWidth, childAt.getRight());
                }
            }
        }
        return measuredWidth - ((a2 ? actionMenuView.getRight() : actionMenuView.getLeft()) + 0);
    }
}
