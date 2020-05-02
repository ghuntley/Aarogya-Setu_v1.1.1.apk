package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import h.h.m.m;
import i.c.a.c.e0.n;
import i.c.a.c.k;
import i.c.a.c.l.g;
import i.c.a.c.y.d;
import i.c.a.c.y.e;
import i.c.a.c.y.h;
import i.c.a.c.z.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FloatingActionButton extends j implements i.c.a.c.x.a, n, CoordinatorLayout.b {

    /* renamed from: f  reason: collision with root package name */
    public ColorStateList f619f;

    /* renamed from: g  reason: collision with root package name */
    public PorterDuff.Mode f620g;

    /* renamed from: h  reason: collision with root package name */
    public ColorStateList f621h;

    /* renamed from: i  reason: collision with root package name */
    public PorterDuff.Mode f622i;

    /* renamed from: j  reason: collision with root package name */
    public ColorStateList f623j;

    /* renamed from: k  reason: collision with root package name */
    public int f624k;

    /* renamed from: l  reason: collision with root package name */
    public int f625l;

    /* renamed from: m  reason: collision with root package name */
    public int f626m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f627n;

    /* renamed from: o  reason: collision with root package name */
    public final Rect f628o;

    /* renamed from: p  reason: collision with root package name */
    public e f629p;

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static abstract class a {
        public void a(FloatingActionButton floatingActionButton) {
        }

        public void b(FloatingActionButton floatingActionButton) {
        }
    }

    public class b implements i.c.a.c.d0.b {
        public b() {
        }
    }

    public class c<T extends FloatingActionButton> implements e.C0126e {
        public final i.c.a.c.l.j<T> a;

        public c(i.c.a.c.l.j<T> jVar) {
            this.a = jVar;
        }

        public void a() {
            this.a.a(FloatingActionButton.this);
        }

        public void b() {
            this.a.b(FloatingActionButton.this);
        }

        public boolean equals(Object obj) {
            return (obj instanceof c) && ((c) obj).a.equals(this.a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }
    }

    private e getImpl() {
        if (this.f629p == null) {
            this.f629p = new h(this, new b());
        }
        return this.f629p;
    }

    public void b(a aVar, boolean z) {
        i.c.a.c.y.b bVar;
        e impl = getImpl();
        if (aVar == null) {
            bVar = null;
        } else {
            bVar = new i.c.a.c.y.b(this, aVar);
        }
        if (!impl.c()) {
            Animator animator = impl.f4250k;
            if (animator != null) {
                animator.cancel();
            }
            if (impl.j()) {
                if (impl.t.getVisibility() != 0) {
                    impl.t.setAlpha(0.0f);
                    impl.t.setScaleY(0.0f);
                    impl.t.setScaleX(0.0f);
                    impl.a(0.0f);
                }
                g gVar = impl.f4251l;
                if (gVar == null) {
                    if (impl.f4248i == null) {
                        impl.f4248i = g.a(impl.t.getContext(), i.c.a.c.a.design_fab_show_motion_spec);
                    }
                    gVar = impl.f4248i;
                    g.a.a.b.a.a(gVar);
                }
                AnimatorSet a2 = impl.a(gVar, 1.0f, 1.0f, 1.0f);
                a2.addListener(new d(impl, z, bVar));
                ArrayList<Animator.AnimatorListener> arrayList = impl.f4256q;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        a2.addListener(it.next());
                    }
                }
                a2.start();
                return;
            }
            impl.t.a(0, z);
            impl.t.setAlpha(1.0f);
            impl.t.setScaleY(1.0f);
            impl.t.setScaleX(1.0f);
            impl.a(1.0f);
            if (bVar != null) {
                bVar.a.b(bVar.f4241b);
            }
        }
    }

    public boolean c() {
        return getImpl().c();
    }

    public final void d() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            ColorStateList colorStateList = this.f621h;
            if (colorStateList == null) {
                g.a.a.b.a.a(drawable);
                return;
            }
            int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
            PorterDuff.Mode mode = this.f622i;
            if (mode == null) {
                mode = PorterDuff.Mode.SRC_IN;
            }
            drawable.mutate().setColorFilter(h.b.p.j.a(colorForState, mode));
        }
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().a(getDrawableState());
    }

    public ColorStateList getBackgroundTintList() {
        return this.f619f;
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f620g;
    }

    public CoordinatorLayout.c<FloatingActionButton> getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().a();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().f4245f;
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().f4246g;
    }

    public Drawable getContentBackground() {
        if (getImpl() != null) {
            return null;
        }
        throw null;
    }

    public int getCustomSize() {
        return this.f625l;
    }

    public int getExpandedComponentIdHint() {
        throw null;
    }

    public g getHideMotionSpec() {
        return getImpl().f4252m;
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f623j;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f623j;
    }

    public i.c.a.c.e0.j getShapeAppearanceModel() {
        i.c.a.c.e0.j jVar = getImpl().a;
        g.a.a.b.a.a(jVar);
        return jVar;
    }

    public g getShowMotionSpec() {
        return getImpl().f4251l;
    }

    public int getSize() {
        return this.f624k;
    }

    public int getSizeDimension() {
        return a(this.f624k);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.f621h;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f622i;
    }

    public boolean getUseCompatPadding() {
        return this.f627n;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().d();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        e impl = getImpl();
        if (impl.h()) {
            ViewTreeObserver viewTreeObserver = impl.t.getViewTreeObserver();
            if (impl.z == null) {
                impl.z = new i.c.a.c.y.g(impl);
            }
            viewTreeObserver.addOnPreDrawListener(impl.z);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e impl = getImpl();
        ViewTreeObserver viewTreeObserver = impl.t.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = impl.z;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            impl.z = null;
        }
    }

    public void onMeasure(int i2, int i3) {
        int sizeDimension = getSizeDimension();
        this.f626m = (sizeDimension + 0) / 2;
        getImpl().m();
        Math.min(a(sizeDimension, i2), a(sizeDimension, i3));
        throw null;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof i.c.a.c.g0.a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        i.c.a.c.g0.a aVar = (i.c.a.c.g0.a) parcelable;
        super.onRestoreInstanceState(aVar.e);
        Bundle orDefault = aVar.f4114g.getOrDefault("expandableWidgetHelper", null);
        g.a.a.b.a.a(orDefault);
        Bundle bundle = orDefault;
        throw null;
    }

    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            onSaveInstanceState = new Bundle();
        }
        new i.c.a.c.g0.a(onSaveInstanceState);
        throw null;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            a((Rect) null);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBackgroundColor(int i2) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundResource(int i2) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f619f != colorStateList) {
            this.f619f = colorStateList;
            if (getImpl() == null) {
                throw null;
            }
        }
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f620g != mode) {
            this.f620g = mode;
            if (getImpl() == null) {
                throw null;
            }
        }
    }

    public void setCompatElevation(float f2) {
        e impl = getImpl();
        if (impl.e != f2) {
            impl.e = f2;
            impl.a(f2, impl.f4245f, impl.f4246g);
        }
    }

    public void setCompatElevationResource(int i2) {
        setCompatElevation(getResources().getDimension(i2));
    }

    public void setCompatHoveredFocusedTranslationZ(float f2) {
        e impl = getImpl();
        if (impl.f4245f != f2) {
            impl.f4245f = f2;
            impl.a(impl.e, f2, impl.f4246g);
        }
    }

    public void setCompatHoveredFocusedTranslationZResource(int i2) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i2));
    }

    public void setCompatPressedTranslationZ(float f2) {
        e impl = getImpl();
        if (impl.f4246g != f2) {
            impl.f4246g = f2;
            impl.a(impl.e, impl.f4245f, f2);
        }
    }

    public void setCompatPressedTranslationZResource(int i2) {
        setCompatPressedTranslationZ(getResources().getDimension(i2));
    }

    public void setCustomSize(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        } else if (i2 != this.f625l) {
            this.f625l = i2;
            requestLayout();
        }
    }

    public void setElevation(float f2) {
        super.setElevation(f2);
        if (getImpl() == null) {
            throw null;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        if (z != getImpl().c) {
            getImpl().c = z;
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i2) {
        throw null;
    }

    public void setHideMotionSpec(g gVar) {
        getImpl().f4252m = gVar;
    }

    public void setHideMotionSpecResource(int i2) {
        setHideMotionSpec(g.a(getContext(), i2));
    }

    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            e impl = getImpl();
            impl.a(impl.f4254o);
            if (this.f621h != null) {
                d();
            }
        }
    }

    public void setImageResource(int i2) {
        throw null;
    }

    public void setRippleColor(int i2) {
        setRippleColor(ColorStateList.valueOf(i2));
    }

    public void setScaleX(float f2) {
        super.setScaleX(f2);
        getImpl().f();
    }

    public void setScaleY(float f2) {
        super.setScaleY(f2);
        getImpl().f();
    }

    public void setShadowPaddingEnabled(boolean z) {
        e impl = getImpl();
        impl.d = z;
        impl.m();
    }

    public void setShapeAppearanceModel(i.c.a.c.e0.j jVar) {
        getImpl().a = jVar;
    }

    public void setShowMotionSpec(g gVar) {
        getImpl().f4251l = gVar;
    }

    public void setShowMotionSpecResource(int i2) {
        setShowMotionSpec(g.a(getContext(), i2));
    }

    public void setSize(int i2) {
        this.f625l = 0;
        if (i2 != this.f624k) {
            this.f624k = i2;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f621h != colorStateList) {
            this.f621h = colorStateList;
            d();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f622i != mode) {
            this.f622i = mode;
            d();
        }
    }

    public void setTranslationX(float f2) {
        super.setTranslationX(f2);
        getImpl().g();
    }

    public void setTranslationY(float f2) {
        super.setTranslationY(f2);
        getImpl().g();
    }

    public void setTranslationZ(float f2) {
        super.setTranslationZ(f2);
        getImpl().g();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f627n != z) {
            this.f627n = z;
            getImpl().e();
        }
    }

    public void setVisibility(int i2) {
        super.setVisibility(i2);
    }

    public static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.c<T> {
        public Rect a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f630b;

        public BaseBehavior() {
            this.f630b = true;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            Rect rect2 = floatingActionButton.f628o;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        public boolean b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                a(coordinatorLayout, (AppBarLayout) view2, floatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.f ? ((CoordinatorLayout.f) layoutParams).a instanceof BottomSheetBehavior : false) {
                    b(view2, floatingActionButton);
                }
            }
            return false;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.FloatingActionButton_Behavior_Layout);
            this.f630b = obtainStyledAttributes.getBoolean(k.FloatingActionButton_Behavior_Layout_behavior_autoHide, true);
            obtainStyledAttributes.recycle();
        }

        public boolean a(CoordinatorLayout coordinatorLayout, View view, int i2) {
            int i3;
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            List<View> a2 = coordinatorLayout.a((View) floatingActionButton);
            int size = a2.size();
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                View view2 = a2.get(i5);
                if (!(view2 instanceof AppBarLayout)) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if ((layoutParams instanceof CoordinatorLayout.f ? ((CoordinatorLayout.f) layoutParams).a instanceof BottomSheetBehavior : false) && b(view2, floatingActionButton)) {
                        break;
                    }
                } else if (a(coordinatorLayout, (AppBarLayout) view2, floatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.b(floatingActionButton, i2);
            Rect rect = floatingActionButton.f628o;
            if (rect == null || rect.centerX() <= 0 || rect.centerY() <= 0) {
                return true;
            }
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) floatingActionButton.getLayoutParams();
            if (floatingActionButton.getRight() >= coordinatorLayout.getWidth() - fVar.rightMargin) {
                i3 = rect.right;
            } else {
                i3 = floatingActionButton.getLeft() <= fVar.leftMargin ? -rect.left : 0;
            }
            if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - fVar.bottomMargin) {
                i4 = rect.bottom;
            } else if (floatingActionButton.getTop() <= fVar.topMargin) {
                i4 = -rect.top;
            }
            if (i4 != 0) {
                m.e(floatingActionButton, i4);
            }
            if (i3 == 0) {
                return true;
            }
            m.d(floatingActionButton, i3);
            return true;
        }

        public final boolean b(View view, FloatingActionButton floatingActionButton) {
            if (!a(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((CoordinatorLayout.f) floatingActionButton.getLayoutParams()).topMargin) {
                floatingActionButton.a((a) null, false);
                return true;
            }
            floatingActionButton.b((a) null, false);
            return true;
        }

        public void a(CoordinatorLayout.f fVar) {
            if (fVar.f197h == 0) {
                fVar.f197h = 80;
            }
        }

        public final boolean a(View view, FloatingActionButton floatingActionButton) {
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) floatingActionButton.getLayoutParams();
            if (this.f630b && fVar.f195f == view.getId() && floatingActionButton.getUserSetVisibility() == 0) {
                return true;
            }
            return false;
        }

        public final boolean a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!a(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.a == null) {
                this.a = new Rect();
            }
            Rect rect = this.a;
            i.c.a.c.z.c.a((ViewGroup) coordinatorLayout, (View) appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.a((a) null, false);
                return true;
            }
            floatingActionButton.b((a) null, false);
            return true;
        }
    }

    public void a(a aVar, boolean z) {
        i.c.a.c.y.b bVar;
        e impl = getImpl();
        if (aVar == null) {
            bVar = null;
        } else {
            bVar = new i.c.a.c.y.b(this, aVar);
        }
        if (!impl.b()) {
            Animator animator = impl.f4250k;
            if (animator != null) {
                animator.cancel();
            }
            if (impl.j()) {
                g gVar = impl.f4252m;
                if (gVar == null) {
                    if (impl.f4249j == null) {
                        impl.f4249j = g.a(impl.t.getContext(), i.c.a.c.a.design_fab_hide_motion_spec);
                    }
                    gVar = impl.f4249j;
                    g.a.a.b.a.a(gVar);
                }
                AnimatorSet a2 = impl.a(gVar, 0.0f, 0.0f, 0.0f);
                a2.addListener(new i.c.a.c.y.c(impl, z, bVar));
                ArrayList<Animator.AnimatorListener> arrayList = impl.r;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        a2.addListener(it.next());
                    }
                }
                a2.start();
                return;
            }
            impl.t.a(z ? 8 : 4, z);
            if (bVar != null) {
                bVar.a.a(bVar.f4241b);
            }
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f623j != colorStateList) {
            this.f623j = colorStateList;
            getImpl().a(this.f623j);
        }
    }

    public void a(Animator.AnimatorListener animatorListener) {
        e impl = getImpl();
        if (impl.r == null) {
            impl.r = new ArrayList<>();
        }
        impl.r.add(animatorListener);
    }

    public boolean a() {
        throw null;
    }

    public final int a(int i2) {
        int i3 = this.f625l;
        if (i3 != 0) {
            return i3;
        }
        Resources resources = getResources();
        if (i2 != -1) {
            if (i2 != 1) {
                return resources.getDimensionPixelSize(i.c.a.c.d.design_fab_size_normal);
            }
            return resources.getDimensionPixelSize(i.c.a.c.d.design_fab_size_mini);
        } else if (Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470) {
            return a(1);
        } else {
            return a(0);
        }
    }

    public void b(Animator.AnimatorListener animatorListener) {
        e impl = getImpl();
        if (impl.f4256q == null) {
            impl.f4256q = new ArrayList<>();
        }
        impl.f4256q.add(animatorListener);
    }

    public boolean b() {
        return getImpl().b();
    }

    @Deprecated
    public boolean a(Rect rect) {
        if (!m.x(this)) {
            return false;
        }
        rect.set(0, 0, getWidth(), getHeight());
        throw null;
    }

    public static int a(int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(i2, size);
        }
        if (mode == 0) {
            return i2;
        }
        if (mode == 1073741824) {
            return size;
        }
        throw new IllegalArgumentException();
    }

    public void a(i.c.a.c.l.j<? extends FloatingActionButton> jVar) {
        e impl = getImpl();
        c cVar = new c(jVar);
        if (impl.s == null) {
            impl.s = new ArrayList<>();
        }
        impl.s.add(cVar);
    }
}
