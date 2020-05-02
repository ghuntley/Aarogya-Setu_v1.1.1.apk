package com.google.android.material.appbar;

import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import h.h.m.m;
import h.h.m.w.b;
import i.c.a.b.d.l.q;
import i.c.a.c.e0.g;
import i.c.a.c.k;
import i.c.a.c.m.c;
import i.c.a.c.m.d;
import i.c.a.c.m.e;
import i.c.a.c.m.f;
import java.lang.ref.WeakReference;
import java.util.List;

public class AppBarLayout extends LinearLayout implements CoordinatorLayout.b {
    public int e;

    /* renamed from: f  reason: collision with root package name */
    public int f525f;

    /* renamed from: g  reason: collision with root package name */
    public int f526g;

    /* renamed from: h  reason: collision with root package name */
    public int f527h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f528i;

    /* renamed from: j  reason: collision with root package name */
    public int f529j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f530k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f531l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f532m;

    /* renamed from: n  reason: collision with root package name */
    public int f533n;

    /* renamed from: o  reason: collision with root package name */
    public WeakReference<View> f534o;

    /* renamed from: p  reason: collision with root package name */
    public ValueAnimator f535p;

    /* renamed from: q  reason: collision with root package name */
    public int[] f536q;
    public Drawable r;

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class ScrollingViewBehavior extends f {
        public ScrollingViewBehavior() {
        }

        public boolean a(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        public boolean b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            CoordinatorLayout.c cVar = ((CoordinatorLayout.f) view2.getLayoutParams()).a;
            if (cVar instanceof BaseBehavior) {
                m.e(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) cVar).f537k) + this.f4164f) - a(view2));
            }
            if (!(view2 instanceof AppBarLayout)) {
                return false;
            }
            AppBarLayout appBarLayout = (AppBarLayout) view2;
            if (!appBarLayout.f532m) {
                return false;
            }
            appBarLayout.a(appBarLayout.a(view));
            return false;
        }

        public void c(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                m.f(coordinatorLayout, b.a.f1825f.a());
                m.f(coordinatorLayout, b.a.f1826g.a());
            }
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.ScrollingViewBehavior_Layout);
            this.f4165g = obtainStyledAttributes.getDimensionPixelSize(k.ScrollingViewBehavior_Layout_behavior_overlapTop, 0);
            obtainStyledAttributes.recycle();
        }

        public boolean a(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout a = a(coordinatorLayout.a(view));
            if (a != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.d;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    a.a(false, !z);
                    return true;
                }
            }
            return false;
        }

        public AppBarLayout a(List<View> list) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = list.get(i2);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }
    }

    public void a(boolean z, boolean z2) {
        this.f529j = (z ? 1 : 2) | (z2 ? 4 : 0) | 8;
        requestLayout();
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.r != null && getTopInset() > 0) {
            int save = canvas.save();
            canvas.translate(0.0f, (float) (-this.e));
            this.r.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.r;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new a(-1, -2);
    }

    public CoordinatorLayout.c<AppBarLayout> getBehavior() {
        return new Behavior();
    }

    public int getDownNestedPreScrollRange() {
        int i2;
        int l2;
        int i3 = this.f526g;
        if (i3 != -1) {
            return i3;
        }
        int i4 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            a aVar = (a) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i5 = aVar.a;
            if ((i5 & 5) == 5) {
                int i6 = aVar.topMargin + aVar.bottomMargin;
                if ((i5 & 8) != 0) {
                    l2 = m.l(childAt);
                } else if ((i5 & 2) != 0) {
                    l2 = measuredHeight - m.l(childAt);
                } else {
                    i2 = i6 + measuredHeight;
                    if (childCount == 0 && m.h(childAt)) {
                        i2 = Math.min(i2, measuredHeight - getTopInset());
                    }
                    i4 += i2;
                }
                i2 = l2 + i6;
                i2 = Math.min(i2, measuredHeight - getTopInset());
                i4 += i2;
            } else if (i4 > 0) {
                break;
            }
        }
        int max = Math.max(0, i4);
        this.f526g = max;
        return max;
    }

    public int getDownNestedScrollRange() {
        int i2 = this.f527h;
        if (i2 != -1) {
            return i2;
        }
        int childCount = getChildCount();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= childCount) {
                break;
            }
            View childAt = getChildAt(i3);
            a aVar = (a) childAt.getLayoutParams();
            int measuredHeight = aVar.topMargin + aVar.bottomMargin + childAt.getMeasuredHeight();
            int i5 = aVar.a;
            if ((i5 & 1) == 0) {
                break;
            }
            i4 += measuredHeight;
            if ((i5 & 2) != 0) {
                i4 -= m.l(childAt);
                break;
            }
            i3++;
        }
        int max = Math.max(0, i4);
        this.f527h = max;
        return max;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.f533n;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int l2 = m.l(this);
        if (l2 == 0) {
            int childCount = getChildCount();
            l2 = childCount >= 1 ? getChildAt(childCount - 1).getMinimumHeight() : 0;
            if (l2 == 0) {
                return getHeight() / 3;
            }
        }
        return (l2 * 2) + topInset;
    }

    public int getPendingAction() {
        return this.f529j;
    }

    public Drawable getStatusBarForeground() {
        return this.r;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    public final int getTopInset() {
        return 0;
    }

    public final int getTotalScrollRange() {
        int i2 = this.f525f;
        if (i2 != -1) {
            return i2;
        }
        int childCount = getChildCount();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= childCount) {
                break;
            }
            View childAt = getChildAt(i3);
            a aVar = (a) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i5 = aVar.a;
            if ((i5 & 1) == 0) {
                break;
            }
            int i6 = measuredHeight + aVar.topMargin + aVar.bottomMargin + i4;
            if (i3 == 0 && m.h(childAt)) {
                i6 -= getTopInset();
            }
            i4 = i6;
            if ((i5 & 2) != 0) {
                i4 -= m.l(childAt);
                break;
            }
            i3++;
        }
        int max = Math.max(0, i4);
        this.f525f = max;
        return max;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof g) {
            q.a((View) this, (g) background);
        }
    }

    public int[] onCreateDrawableState(int i2) {
        if (this.f536q == null) {
            this.f536q = new int[4];
        }
        int[] iArr = this.f536q;
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + iArr.length);
        iArr[0] = this.f530k ? i.c.a.c.b.state_liftable : -i.c.a.c.b.state_liftable;
        iArr[1] = (!this.f530k || !this.f531l) ? -i.c.a.c.b.state_lifted : i.c.a.c.b.state_lifted;
        iArr[2] = this.f530k ? i.c.a.c.b.state_collapsible : -i.c.a.c.b.state_collapsible;
        iArr[3] = (!this.f530k || !this.f531l) ? -i.c.a.c.b.state_collapsed : i.c.a.c.b.state_collapsed;
        return LinearLayout.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference<View> weakReference = this.f534o;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f534o = null;
    }

    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        boolean z2;
        super.onLayout(z, i2, i3, i4, i5);
        boolean z3 = true;
        if (m.h(this) && a()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                m.e(getChildAt(childCount), topInset);
            }
        }
        this.f525f = -1;
        this.f526g = -1;
        this.f527h = -1;
        this.f528i = false;
        int childCount2 = getChildCount();
        int i6 = 0;
        while (true) {
            if (i6 >= childCount2) {
                break;
            } else if (((a) getChildAt(i6).getLayoutParams()).f547b != null) {
                this.f528i = true;
                break;
            } else {
                i6++;
            }
        }
        Drawable drawable = this.r;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (!this.f532m) {
            int childCount3 = getChildCount();
            int i7 = 0;
            while (true) {
                if (i7 >= childCount3) {
                    z2 = false;
                    break;
                }
                int i8 = ((a) getChildAt(i7).getLayoutParams()).a;
                if ((i8 & 1) == 1 && (i8 & 10) != 0) {
                    z2 = true;
                    break;
                }
                i7++;
            }
            if (!z2) {
                z3 = false;
            }
        }
        if (this.f530k != z3) {
            this.f530k = z3;
            refreshDrawableState();
        }
    }

    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        int mode = View.MeasureSpec.getMode(i3);
        if (mode != 1073741824 && m.h(this) && a()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = g.a.a.b.a.a(getTopInset() + getMeasuredHeight(), 0, View.MeasureSpec.getSize(i3));
            } else if (mode == 0) {
                measuredHeight += getTopInset();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        this.f525f = -1;
        this.f526g = -1;
        this.f527h = -1;
    }

    public void setElevation(float f2) {
        super.setElevation(f2);
        q.a((View) this, f2);
    }

    public void setExpanded(boolean z) {
        a(z, m.x(this));
    }

    public void setLiftOnScroll(boolean z) {
        this.f532m = z;
    }

    public void setLiftOnScrollTargetViewId(int i2) {
        this.f533n = i2;
        WeakReference<View> weakReference = this.f534o;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f534o = null;
    }

    public void setOrientation(int i2) {
        if (i2 == 1) {
            super.setOrientation(i2);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.r;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.r = drawable3;
            boolean z = false;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.r.setState(getDrawableState());
                }
                g.a.a.b.a.a(this.r, m.k(this));
                this.r.setVisible(getVisibility() == 0, false);
                this.r.setCallback(this);
            }
            if (this.r != null && getTopInset() > 0) {
                z = true;
            }
            setWillNotDraw(!z);
            m.B(this);
        }
    }

    public void setStatusBarForegroundColor(int i2) {
        setStatusBarForeground(new ColorDrawable(i2));
    }

    public void setStatusBarForegroundResource(int i2) {
        setStatusBarForeground(h.b.l.a.a.c(getContext(), i2));
    }

    @Deprecated
    public void setTargetElevation(float f2) {
        int integer = getResources().getInteger(i.c.a.c.g.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j2 = (long) integer;
        stateListAnimator.addState(new int[]{16842766, i.c.a.c.b.state_liftable, -i.c.a.c.b.state_lifted}, ObjectAnimator.ofFloat(this, "elevation", new float[]{0.0f}).setDuration(j2));
        stateListAnimator.addState(new int[]{16842766}, ObjectAnimator.ofFloat(this, "elevation", new float[]{f2}).setDuration(j2));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(this, "elevation", new float[]{0.0f}).setDuration(0));
        setStateListAnimator(stateListAnimator);
    }

    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z = i2 == 0;
        Drawable drawable = this.r;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.r;
    }

    public static class BaseBehavior<T extends AppBarLayout> extends e<T> {

        /* renamed from: k  reason: collision with root package name */
        public int f537k;

        /* renamed from: l  reason: collision with root package name */
        public int f538l;

        /* renamed from: m  reason: collision with root package name */
        public ValueAnimator f539m;

        /* renamed from: n  reason: collision with root package name */
        public int f540n = -1;

        /* renamed from: o  reason: collision with root package name */
        public boolean f541o;

        /* renamed from: p  reason: collision with root package name */
        public float f542p;

        /* renamed from: q  reason: collision with root package name */
        public WeakReference<View> f543q;

        public BaseBehavior() {
        }

        public static boolean a(int i2, int i3) {
            return (i2 & i3) == i3;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, View view, int i2) {
            int i3;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            super.a(coordinatorLayout, appBarLayout, i2);
            int pendingAction = appBarLayout.getPendingAction();
            int i4 = this.f540n;
            if (i4 >= 0 && (pendingAction & 8) == 0) {
                View childAt = appBarLayout.getChildAt(i4);
                int i5 = -childAt.getBottom();
                if (this.f541o) {
                    i3 = appBarLayout.getTopInset() + childAt.getMinimumHeight() + i5;
                } else {
                    i3 = Math.round(((float) childAt.getHeight()) * this.f542p) + i5;
                }
                c(coordinatorLayout, appBarLayout, i3);
            } else if (pendingAction != 0) {
                boolean z = (pendingAction & 4) != 0;
                if ((pendingAction & 2) != 0) {
                    int i6 = -appBarLayout.getUpNestedPreScrollRange();
                    if (z) {
                        a(coordinatorLayout, appBarLayout, i6, 0.0f);
                    } else {
                        c(coordinatorLayout, appBarLayout, i6);
                    }
                } else if ((pendingAction & 1) != 0) {
                    if (z) {
                        a(coordinatorLayout, appBarLayout, 0, 0.0f);
                    } else {
                        c(coordinatorLayout, appBarLayout, 0);
                    }
                }
            }
            appBarLayout.f529j = 0;
            this.f540n = -1;
            a(g.a.a.b.a.a(b(), -appBarLayout.getTotalScrollRange(), 0));
            a(coordinatorLayout, appBarLayout, b(), 0, true);
            appBarLayout.e = b();
            if (!appBarLayout.willNotDraw()) {
                m.B(appBarLayout);
            }
            b(coordinatorLayout, appBarLayout);
            return true;
        }

        /* JADX WARNING: Removed duplicated region for block: B:38:0x00b0  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x00d2  */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x00d7  */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x00da  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int b(androidx.coordinatorlayout.widget.CoordinatorLayout r8, android.view.View r9, int r10, int r11, int r12) {
            /*
                r7 = this;
                com.google.android.material.appbar.AppBarLayout r9 = (com.google.android.material.appbar.AppBarLayout) r9
                int r0 = r7.c()
                r1 = 0
                if (r11 == 0) goto L_0x00e5
                if (r0 < r11) goto L_0x00e5
                if (r0 > r12) goto L_0x00e5
                int r3 = g.a.a.b.a.a((int) r10, (int) r11, (int) r12)
                if (r0 == r3) goto L_0x00e7
                boolean r10 = r9.f528i
                if (r10 == 0) goto L_0x0086
                int r10 = java.lang.Math.abs(r3)
                int r11 = r9.getChildCount()
                r12 = 0
            L_0x0020:
                if (r12 >= r11) goto L_0x0086
                android.view.View r2 = r9.getChildAt(r12)
                android.view.ViewGroup$LayoutParams r4 = r2.getLayoutParams()
                com.google.android.material.appbar.AppBarLayout$a r4 = (com.google.android.material.appbar.AppBarLayout.a) r4
                android.view.animation.Interpolator r5 = r4.f547b
                int r6 = r2.getTop()
                if (r10 < r6) goto L_0x0083
                int r6 = r2.getBottom()
                if (r10 > r6) goto L_0x0083
                if (r5 == 0) goto L_0x0086
                int r11 = r4.a
                r12 = r11 & 1
                if (r12 == 0) goto L_0x0057
                int r12 = r2.getHeight()
                int r6 = r4.topMargin
                int r12 = r12 + r6
                int r4 = r4.bottomMargin
                int r12 = r12 + r4
                int r12 = r12 + r1
                r11 = r11 & 2
                if (r11 == 0) goto L_0x0058
                int r11 = h.h.m.m.l(r2)
                int r12 = r12 - r11
                goto L_0x0058
            L_0x0057:
                r12 = 0
            L_0x0058:
                boolean r11 = h.h.m.m.h(r2)
                if (r11 == 0) goto L_0x0063
                int r11 = r9.getTopInset()
                int r12 = r12 - r11
            L_0x0063:
                if (r12 <= 0) goto L_0x0086
                int r11 = r2.getTop()
                int r10 = r10 - r11
                float r11 = (float) r12
                float r10 = (float) r10
                float r10 = r10 / r11
                float r10 = r5.getInterpolation(r10)
                float r10 = r10 * r11
                int r10 = java.lang.Math.round(r10)
                int r11 = java.lang.Integer.signum(r3)
                int r12 = r2.getTop()
                int r12 = r12 + r10
                int r12 = r12 * r11
                goto L_0x0087
            L_0x0083:
                int r12 = r12 + 1
                goto L_0x0020
            L_0x0086:
                r12 = r3
            L_0x0087:
                boolean r10 = r7.a(r12)
                int r11 = r0 - r3
                int r12 = r3 - r12
                r7.f537k = r12
                if (r10 != 0) goto L_0x00c6
                boolean r10 = r9.f528i
                if (r10 == 0) goto L_0x00c6
                h.g.d.a<android.view.View> r10 = r8.f182f
                h.e.h<T, java.util.ArrayList<T>> r10 = r10.f1700b
                r12 = 0
                java.lang.Object r10 = r10.getOrDefault(r9, r12)
                java.util.List r10 = (java.util.List) r10
                if (r10 == 0) goto L_0x00c6
                boolean r12 = r10.isEmpty()
                if (r12 != 0) goto L_0x00c6
            L_0x00aa:
                int r12 = r10.size()
                if (r1 >= r12) goto L_0x00c6
                java.lang.Object r12 = r10.get(r1)
                android.view.View r12 = (android.view.View) r12
                android.view.ViewGroup$LayoutParams r2 = r12.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$f r2 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r2
                androidx.coordinatorlayout.widget.CoordinatorLayout$c r2 = r2.a
                if (r2 == 0) goto L_0x00c3
                r2.b((androidx.coordinatorlayout.widget.CoordinatorLayout) r8, r12, (android.view.View) r9)
            L_0x00c3:
                int r1 = r1 + 1
                goto L_0x00aa
            L_0x00c6:
                int r10 = r7.b()
                r9.e = r10
                boolean r10 = r9.willNotDraw()
                if (r10 != 0) goto L_0x00d5
                h.h.m.m.B(r9)
            L_0x00d5:
                if (r3 >= r0) goto L_0x00da
                r10 = -1
                r4 = -1
                goto L_0x00dc
            L_0x00da:
                r10 = 1
                r4 = 1
            L_0x00dc:
                r5 = 0
                r0 = r7
                r1 = r8
                r2 = r9
                r0.a((androidx.coordinatorlayout.widget.CoordinatorLayout) r1, r2, (int) r3, (int) r4, (boolean) r5)
                r1 = r11
                goto L_0x00e7
            L_0x00e5:
                r7.f537k = r1
            L_0x00e7:
                r7.b(r8, r9)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.b(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int, int, int):int");
        }

        public int c() {
            return b() + this.f537k;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public static class a extends h.j.a.a {
            public static final Parcelable.Creator<a> CREATOR = new C0015a();

            /* renamed from: g  reason: collision with root package name */
            public int f544g;

            /* renamed from: h  reason: collision with root package name */
            public float f545h;

            /* renamed from: i  reason: collision with root package name */
            public boolean f546i;

            /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$a$a  reason: collision with other inner class name */
            public static class C0015a implements Parcelable.ClassLoaderCreator<a> {
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

            public a(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f544g = parcel.readInt();
                this.f545h = parcel.readFloat();
                this.f546i = parcel.readByte() != 0;
            }

            public void writeToParcel(Parcel parcel, int i2) {
                parcel.writeParcelable(this.e, i2);
                parcel.writeInt(this.f544g);
                parcel.writeFloat(this.f545h);
                parcel.writeByte(this.f546i ? (byte) 1 : 0);
            }

            public a(Parcelable parcelable) {
                super(parcelable);
            }
        }

        public boolean a(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4, int i5) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((CoordinatorLayout.f) appBarLayout.getLayoutParams()).height != -2) {
                return false;
            }
            coordinatorLayout.a((View) appBarLayout, i2, i3, View.MeasureSpec.makeMeasureSpec(0, 0), i5);
            return true;
        }

        public /* bridge */ /* synthetic */ void a(CoordinatorLayout coordinatorLayout, View view, View view2, int i2, int i3, int[] iArr, int i4) {
            a(coordinatorLayout, (AppBarLayout) view, view2, i3, iArr);
        }

        public void a(CoordinatorLayout coordinatorLayout, View view, View view2, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i5 < 0) {
                iArr[1] = a(coordinatorLayout, appBarLayout, i5, -appBarLayout.getDownNestedScrollRange(), 0);
            }
            if (i5 == 0) {
                b(coordinatorLayout, appBarLayout);
            }
        }

        public void a(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (parcelable instanceof a) {
                a aVar = (a) parcelable;
                Parcelable parcelable2 = aVar.e;
                this.f540n = aVar.f544g;
                this.f542p = aVar.f545h;
                this.f541o = aVar.f546i;
                return;
            }
            this.f540n = -1;
        }

        public final void b(CoordinatorLayout coordinatorLayout, T t) {
            m.f(coordinatorLayout, b.a.f1825f.a());
            m.f(coordinatorLayout, b.a.f1826g.a());
            View a2 = a(coordinatorLayout);
            if (a2 != null && t.getTotalScrollRange() != 0 && (((CoordinatorLayout.f) a2.getLayoutParams()).a instanceof ScrollingViewBehavior)) {
                if (c() != (-t.getTotalScrollRange()) && a2.canScrollVertically(1)) {
                    m.a(coordinatorLayout, b.a.f1825f, (CharSequence) null, new d(this, t, false));
                }
                if (c() == 0) {
                    return;
                }
                if (a2.canScrollVertically(-1)) {
                    int i2 = -t.getDownNestedPreScrollRange();
                    if (i2 != 0) {
                        m.a(coordinatorLayout, b.a.f1826g, (CharSequence) null, new c(this, coordinatorLayout, t, a2, i2));
                        return;
                    }
                    return;
                }
                m.a(coordinatorLayout, b.a.f1826g, (CharSequence) null, new d(this, t, true));
            }
        }

        public Parcelable a(CoordinatorLayout coordinatorLayout, View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            int b2 = b();
            int childCount = appBarLayout.getChildCount();
            boolean z = false;
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = appBarLayout.getChildAt(i2);
                int bottom = childAt.getBottom() + b2;
                if (childAt.getTop() + b2 > 0 || bottom < 0) {
                    i2++;
                } else {
                    a aVar = new a(absSavedState);
                    aVar.f544g = i2;
                    if (bottom == appBarLayout.getTopInset() + m.l(childAt)) {
                        z = true;
                    }
                    aVar.f546i = z;
                    aVar.f545h = ((float) bottom) / ((float) childAt.getHeight());
                    return aVar;
                }
            }
            return absSavedState;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
            if (((r3.getTotalScrollRange() != 0) && r2.getHeight() - r4.getHeight() <= r3.getHeight()) != false) goto L_0x002b;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean a(androidx.coordinatorlayout.widget.CoordinatorLayout r2, android.view.View r3, android.view.View r4, android.view.View r5, int r6, int r7) {
            /*
                r1 = this;
                com.google.android.material.appbar.AppBarLayout r3 = (com.google.android.material.appbar.AppBarLayout) r3
                r5 = r6 & 2
                r6 = 0
                r0 = 1
                if (r5 == 0) goto L_0x002c
                boolean r5 = r3.f532m
                if (r5 != 0) goto L_0x002b
                int r5 = r3.getTotalScrollRange()
                if (r5 == 0) goto L_0x0014
                r5 = 1
                goto L_0x0015
            L_0x0014:
                r5 = 0
            L_0x0015:
                if (r5 == 0) goto L_0x0028
                int r2 = r2.getHeight()
                int r4 = r4.getHeight()
                int r2 = r2 - r4
                int r3 = r3.getHeight()
                if (r2 > r3) goto L_0x0028
                r2 = 1
                goto L_0x0029
            L_0x0028:
                r2 = 0
            L_0x0029:
                if (r2 == 0) goto L_0x002c
            L_0x002b:
                r6 = 1
            L_0x002c:
                if (r6 == 0) goto L_0x0035
                android.animation.ValueAnimator r2 = r1.f539m
                if (r2 == 0) goto L_0x0035
                r2.cancel()
            L_0x0035:
                r2 = 0
                r1.f543q = r2
                r1.f538l = r7
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.a(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, android.view.View, int, int):boolean");
        }

        public void a(CoordinatorLayout coordinatorLayout, View view, View view2, int i2) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.f538l == 0 || i2 == 1) {
                a(coordinatorLayout, appBarLayout);
                if (appBarLayout.f532m) {
                    appBarLayout.a(appBarLayout.a(view2));
                }
            }
            this.f543q = new WeakReference<>(view2);
        }

        public void a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i2, int[] iArr) {
            int i3;
            int i4;
            if (i2 != 0) {
                if (i2 < 0) {
                    int i5 = -appBarLayout.getTotalScrollRange();
                    i4 = i5;
                    i3 = appBarLayout.getDownNestedPreScrollRange() + i5;
                } else {
                    i4 = -appBarLayout.getUpNestedPreScrollRange();
                    i3 = 0;
                }
                if (i4 != i3) {
                    iArr[1] = a(coordinatorLayout, appBarLayout, i2, i4, i3);
                }
            }
            if (appBarLayout.f532m) {
                appBarLayout.a(appBarLayout.a(view));
            }
        }

        public final void a(CoordinatorLayout coordinatorLayout, T t, int i2, float f2) {
            int i3;
            int abs = Math.abs(c() - i2);
            float abs2 = Math.abs(f2);
            if (abs2 > 0.0f) {
                i3 = Math.round((((float) abs) / abs2) * 1000.0f) * 3;
            } else {
                i3 = (int) (((((float) abs) / ((float) t.getHeight())) + 1.0f) * 150.0f);
            }
            int c = c();
            if (c == i2) {
                ValueAnimator valueAnimator = this.f539m;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f539m.cancel();
                    return;
                }
                return;
            }
            ValueAnimator valueAnimator2 = this.f539m;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f539m = valueAnimator3;
                valueAnimator3.setInterpolator(i.c.a.c.l.a.e);
                this.f539m.addUpdateListener(new i.c.a.c.m.b(this, coordinatorLayout, t));
            } else {
                valueAnimator2.cancel();
            }
            this.f539m.setDuration((long) Math.min(i3, 600));
            this.f539m.setIntValues(new int[]{c, i2});
            this.f539m.start();
        }

        public final void a(CoordinatorLayout coordinatorLayout, T t) {
            int c = c();
            int childCount = t.getChildCount();
            int i2 = 0;
            while (true) {
                if (i2 >= childCount) {
                    i2 = -1;
                    break;
                }
                View childAt = t.getChildAt(i2);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                a aVar = (a) childAt.getLayoutParams();
                if (a(aVar.a, 32)) {
                    top -= aVar.topMargin;
                    bottom += aVar.bottomMargin;
                }
                int i3 = -c;
                if (top <= i3 && bottom >= i3) {
                    break;
                }
                i2++;
            }
            if (i2 >= 0) {
                View childAt2 = t.getChildAt(i2);
                a aVar2 = (a) childAt2.getLayoutParams();
                int i4 = aVar2.a;
                if ((i4 & 17) == 17) {
                    int i5 = -childAt2.getTop();
                    int i6 = -childAt2.getBottom();
                    if (i2 == t.getChildCount() - 1) {
                        i6 += t.getTopInset();
                    }
                    if (a(i4, 2)) {
                        i6 += m.l(childAt2);
                    } else if (a(i4, 5)) {
                        int l2 = m.l(childAt2) + i6;
                        if (c < l2) {
                            i5 = l2;
                        } else {
                            i6 = l2;
                        }
                    }
                    if (a(i4, 32)) {
                        i5 += aVar2.topMargin;
                        i6 -= aVar2.bottomMargin;
                    }
                    if (c < (i6 + i5) / 2) {
                        i5 = i6;
                    }
                    a(coordinatorLayout, t, g.a.a.b.a.a(i5, -t.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:25:0x0061  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x006f  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(androidx.coordinatorlayout.widget.CoordinatorLayout r7, T r8, int r9, int r10, boolean r11) {
            /*
                r6 = this;
                int r0 = java.lang.Math.abs(r9)
                int r1 = r8.getChildCount()
                r2 = 0
                r3 = 0
            L_0x000a:
                if (r3 >= r1) goto L_0x0020
                android.view.View r4 = r8.getChildAt(r3)
                int r5 = r4.getTop()
                if (r0 < r5) goto L_0x001d
                int r5 = r4.getBottom()
                if (r0 > r5) goto L_0x001d
                goto L_0x0021
            L_0x001d:
                int r3 = r3 + 1
                goto L_0x000a
            L_0x0020:
                r4 = 0
            L_0x0021:
                if (r4 == 0) goto L_0x009e
                android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
                com.google.android.material.appbar.AppBarLayout$a r0 = (com.google.android.material.appbar.AppBarLayout.a) r0
                int r0 = r0.a
                r1 = r0 & 1
                r3 = 1
                if (r1 == 0) goto L_0x0049
                int r1 = h.h.m.m.l(r4)
                if (r10 <= 0) goto L_0x004b
                r10 = r0 & 12
                if (r10 == 0) goto L_0x004b
                int r9 = -r9
                int r10 = r4.getBottom()
                int r10 = r10 - r1
                int r0 = r8.getTopInset()
                int r10 = r10 - r0
                if (r9 < r10) goto L_0x0049
            L_0x0047:
                r9 = 1
                goto L_0x005d
            L_0x0049:
                r9 = 0
                goto L_0x005d
            L_0x004b:
                r10 = r0 & 2
                if (r10 == 0) goto L_0x0049
                int r9 = -r9
                int r10 = r4.getBottom()
                int r10 = r10 - r1
                int r0 = r8.getTopInset()
                int r10 = r10 - r0
                if (r9 < r10) goto L_0x0049
                goto L_0x0047
            L_0x005d:
                boolean r10 = r8.f532m
                if (r10 == 0) goto L_0x0069
                android.view.View r9 = r6.a(r7)
                boolean r9 = r8.a((android.view.View) r9)
            L_0x0069:
                boolean r9 = r8.a((boolean) r9)
                if (r11 != 0) goto L_0x009b
                if (r9 == 0) goto L_0x009e
                java.util.List r7 = r7.b((android.view.View) r8)
                int r9 = r7.size()
                r10 = 0
            L_0x007a:
                if (r10 >= r9) goto L_0x0099
                java.lang.Object r11 = r7.get(r10)
                android.view.View r11 = (android.view.View) r11
                android.view.ViewGroup$LayoutParams r11 = r11.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$f r11 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r11
                androidx.coordinatorlayout.widget.CoordinatorLayout$c r11 = r11.a
                boolean r0 = r11 instanceof com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior
                if (r0 == 0) goto L_0x0096
                com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior r11 = (com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior) r11
                int r7 = r11.f4165g
                if (r7 == 0) goto L_0x0099
                r2 = 1
                goto L_0x0099
            L_0x0096:
                int r10 = r10 + 1
                goto L_0x007a
            L_0x0099:
                if (r2 == 0) goto L_0x009e
            L_0x009b:
                r8.jumpDrawablesToCurrentState()
            L_0x009e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.a(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, int, int, boolean):void");
        }

        public final View a(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = coordinatorLayout.getChildAt(i2);
                if ((childAt instanceof h.h.m.f) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }
    }

    /* renamed from: generateDefaultLayoutParams  reason: collision with other method in class */
    public LinearLayout.LayoutParams m4generateDefaultLayoutParams() {
        return new a(-1, -2);
    }

    public boolean a(boolean z) {
        if (this.f531l == z) {
            return false;
        }
        this.f531l = z;
        refreshDrawableState();
        if (this.f532m && (getBackground() instanceof g)) {
            g gVar = (g) getBackground();
            float dimension = getResources().getDimension(i.c.a.c.d.design_appbar_elevation);
            float f2 = z ? 0.0f : dimension;
            if (!z) {
                dimension = 0.0f;
            }
            ValueAnimator valueAnimator = this.f535p;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f2, dimension});
            this.f535p = ofFloat;
            ofFloat.setDuration((long) getResources().getInteger(i.c.a.c.g.app_bar_elevation_anim_duration));
            this.f535p.setInterpolator(i.c.a.c.l.a.a);
            this.f535p.addUpdateListener(new i.c.a.c.m.a(this, gVar));
            this.f535p.start();
        }
        return true;
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    /* renamed from: generateLayoutParams  reason: collision with other method in class */
    public LinearLayout.LayoutParams m5generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    public a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return new a((LinearLayout.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new a((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new a(layoutParams);
    }

    public static class a extends LinearLayout.LayoutParams {
        public int a = 1;

        /* renamed from: b  reason: collision with root package name */
        public Interpolator f547b;

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.AppBarLayout_Layout);
            this.a = obtainStyledAttributes.getInt(k.AppBarLayout_Layout_layout_scrollFlags, 0);
            if (obtainStyledAttributes.hasValue(k.AppBarLayout_Layout_layout_scrollInterpolator)) {
                this.f547b = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(k.AppBarLayout_Layout_layout_scrollInterpolator, 0));
            }
            obtainStyledAttributes.recycle();
        }

        public a(int i2, int i3) {
            super(i2, i3);
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public a(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: android.view.View} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(android.view.View r5) {
        /*
            r4 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r4.f534o
            r1 = 0
            r2 = -1
            if (r0 != 0) goto L_0x0031
            int r0 = r4.f533n
            if (r0 == r2) goto L_0x0031
            if (r5 == 0) goto L_0x0011
            android.view.View r0 = r5.findViewById(r0)
            goto L_0x0012
        L_0x0011:
            r0 = r1
        L_0x0012:
            if (r0 != 0) goto L_0x0028
            android.view.ViewParent r3 = r4.getParent()
            boolean r3 = r3 instanceof android.view.ViewGroup
            if (r3 == 0) goto L_0x0028
            android.view.ViewParent r0 = r4.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r3 = r4.f533n
            android.view.View r0 = r0.findViewById(r3)
        L_0x0028:
            if (r0 == 0) goto L_0x0031
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r3.<init>(r0)
            r4.f534o = r3
        L_0x0031:
            java.lang.ref.WeakReference<android.view.View> r0 = r4.f534o
            if (r0 == 0) goto L_0x003c
            java.lang.Object r0 = r0.get()
            r1 = r0
            android.view.View r1 = (android.view.View) r1
        L_0x003c:
            if (r1 != 0) goto L_0x003f
            goto L_0x0040
        L_0x003f:
            r5 = r1
        L_0x0040:
            if (r5 == 0) goto L_0x0050
            boolean r0 = r5.canScrollVertically(r2)
            if (r0 != 0) goto L_0x004e
            int r5 = r5.getScrollY()
            if (r5 <= 0) goto L_0x0050
        L_0x004e:
            r5 = 1
            goto L_0x0051
        L_0x0050:
            r5 = 0
        L_0x0051:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.a(android.view.View):boolean");
    }

    public final boolean a() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        if (childAt.getVisibility() == 8 || m.h(childAt)) {
            return false;
        }
        return true;
    }
}
