package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import h.b.f;
import h.b.k.v;
import h.b.o.i.m;
import h.b.p.c0;
import h.b.p.d0;
import h.b.p.d1;
import h.h.m.h;
import h.h.m.i;
import h.h.m.j;
import h.h.m.m;

public class ActionBarOverlayLayout extends ViewGroup implements c0, h, i {
    public static final int[] F = {h.b.a.actionBarSize, 16842841};
    public ViewPropertyAnimator A;
    public final AnimatorListenerAdapter B;
    public final Runnable C;
    public final Runnable D;
    public final j E;
    public int e;

    /* renamed from: f  reason: collision with root package name */
    public int f104f;

    /* renamed from: g  reason: collision with root package name */
    public ContentFrameLayout f105g;

    /* renamed from: h  reason: collision with root package name */
    public ActionBarContainer f106h;

    /* renamed from: i  reason: collision with root package name */
    public d0 f107i;

    /* renamed from: j  reason: collision with root package name */
    public Drawable f108j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f109k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f110l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f111m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f112n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f113o;

    /* renamed from: p  reason: collision with root package name */
    public int f114p;

    /* renamed from: q  reason: collision with root package name */
    public int f115q;
    public final Rect r;
    public final Rect s;
    public final Rect t;
    public final Rect u;
    public final Rect v;
    public final Rect w;
    public final Rect x;
    public d y;
    public OverScroller z;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.A = null;
            actionBarOverlayLayout.f113o = false;
        }

        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.A = null;
            actionBarOverlayLayout.f113o = false;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public void run() {
            ActionBarOverlayLayout.this.c();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.A = actionBarOverlayLayout.f106h.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.B);
        }
    }

    public class c implements Runnable {
        public c() {
        }

        public void run() {
            ActionBarOverlayLayout.this.c();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.A = actionBarOverlayLayout.f106h.animate().translationY((float) (-ActionBarOverlayLayout.this.f106h.getHeight())).setListener(ActionBarOverlayLayout.this.B);
        }
    }

    public interface d {
    }

    public static class e extends ViewGroup.MarginLayoutParams {
        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(int i2, int i3) {
            super(i2, i3);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public final void a(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(F);
        boolean z2 = false;
        this.e = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f108j = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z2 = true;
        }
        this.f109k = z2;
        this.z = new OverScroller(context);
    }

    public void a(View view, int i2, int i3, int[] iArr, int i4) {
    }

    public boolean b(View view, View view2, int i2, int i3) {
        return i3 == 0 && onStartNestedScroll(view, view2, i2);
    }

    public void c() {
        removeCallbacks(this.C);
        removeCallbacks(this.D);
        ViewPropertyAnimator viewPropertyAnimator = this.A;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    public boolean d() {
        i();
        return this.f107i.d();
    }

    public void draw(Canvas canvas) {
        int i2;
        super.draw(canvas);
        if (this.f108j != null && !this.f109k) {
            if (this.f106h.getVisibility() == 0) {
                i2 = (int) (this.f106h.getTranslationY() + ((float) this.f106h.getBottom()) + 0.5f);
            } else {
                i2 = 0;
            }
            this.f108j.setBounds(0, i2, getWidth(), this.f108j.getIntrinsicHeight() + i2);
            this.f108j.draw(canvas);
        }
    }

    public boolean e() {
        i();
        return this.f107i.e();
    }

    public void f() {
        i();
        this.f107i.f();
    }

    public boolean fitSystemWindows(Rect rect) {
        i();
        boolean a2 = a((View) this.f106h, rect, true, true, false, true);
        this.u.set(rect);
        d1.a(this, this.u, this.r);
        if (!this.v.equals(this.u)) {
            this.v.set(this.u);
            a2 = true;
        }
        if (!this.s.equals(this.r)) {
            this.s.set(this.r);
            a2 = true;
        }
        if (a2) {
            requestLayout();
        }
        return true;
    }

    public boolean g() {
        i();
        return this.f107i.g();
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f106h;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    public int getNestedScrollAxes() {
        return this.E.a();
    }

    public CharSequence getTitle() {
        i();
        return this.f107i.getTitle();
    }

    public void h() {
        i();
        this.f107i.h();
    }

    public void i() {
        d0 d0Var;
        if (this.f105g == null) {
            this.f105g = (ContentFrameLayout) findViewById(f.action_bar_activity_content);
            this.f106h = (ActionBarContainer) findViewById(f.action_bar_container);
            View findViewById = findViewById(f.action_bar);
            if (findViewById instanceof d0) {
                d0Var = (d0) findViewById;
            } else if (findViewById instanceof Toolbar) {
                d0Var = ((Toolbar) findViewById).getWrapper();
            } else {
                StringBuilder a2 = i.a.a.a.a.a("Can't make a decor toolbar out of ");
                a2.append(findViewById.getClass().getSimpleName());
                throw new IllegalStateException(a2.toString());
            }
            this.f107i = d0Var;
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        a(getContext());
        m.C(this);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c();
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i7 = eVar.leftMargin + paddingLeft;
                int i8 = eVar.topMargin + paddingTop;
                childAt.layout(i7, i8, measuredWidth + i7, measuredHeight + i8);
            }
        }
    }

    public void onMeasure(int i2, int i3) {
        int i4;
        i();
        measureChildWithMargins(this.f106h, i2, 0, i3, 0);
        e eVar = (e) this.f106h.getLayoutParams();
        int max = Math.max(0, this.f106h.getMeasuredWidth() + eVar.leftMargin + eVar.rightMargin);
        int max2 = Math.max(0, this.f106h.getMeasuredHeight() + eVar.topMargin + eVar.bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f106h.getMeasuredState());
        boolean z2 = (m.r(this) & 256) != 0;
        if (z2) {
            i4 = this.e;
            if (this.f111m && this.f106h.getTabContainer() != null) {
                i4 += this.e;
            }
        } else {
            i4 = this.f106h.getVisibility() != 8 ? this.f106h.getMeasuredHeight() : 0;
        }
        this.t.set(this.r);
        this.w.set(this.u);
        if (this.f110l || z2) {
            Rect rect = this.w;
            rect.top += i4;
            rect.bottom += 0;
        } else {
            Rect rect2 = this.t;
            rect2.top += i4;
            rect2.bottom += 0;
        }
        a((View) this.f105g, this.t, true, true, true, true);
        if (!this.x.equals(this.w)) {
            this.x.set(this.w);
            this.f105g.a(this.w);
        }
        measureChildWithMargins(this.f105g, i2, 0, i3, 0);
        e eVar2 = (e) this.f105g.getLayoutParams();
        int max3 = Math.max(max, this.f105g.getMeasuredWidth() + eVar2.leftMargin + eVar2.rightMargin);
        int max4 = Math.max(max2, this.f105g.getMeasuredHeight() + eVar2.topMargin + eVar2.bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f105g.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i2, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i3, combineMeasuredStates2 << 16));
    }

    public boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        boolean z3 = false;
        if (!this.f112n || !z2) {
            return false;
        }
        this.z.fling(0, 0, 0, (int) f3, 0, 0, RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE);
        if (this.z.getFinalY() > this.f106h.getHeight()) {
            z3 = true;
        }
        if (z3) {
            c();
            this.D.run();
        } else {
            c();
            this.C.run();
        }
        this.f113o = true;
        return true;
    }

    public boolean onNestedPreFling(View view, float f2, float f3) {
        return false;
    }

    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
    }

    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        int i6 = this.f114p + i3;
        this.f114p = i6;
        setActionBarHideOffset(i6);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0011, code lost:
        r1 = (h.b.k.v) r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onNestedScrollAccepted(android.view.View r1, android.view.View r2, int r3) {
        /*
            r0 = this;
            h.h.m.j r1 = r0.E
            r1.a = r3
            int r1 = r0.getActionBarHideOffset()
            r0.f114p = r1
            r0.c()
            androidx.appcompat.widget.ActionBarOverlayLayout$d r1 = r0.y
            if (r1 == 0) goto L_0x001d
            h.b.k.v r1 = (h.b.k.v) r1
            h.b.o.g r2 = r1.u
            if (r2 == 0) goto L_0x001d
            r2.a()
            r2 = 0
            r1.u = r2
        L_0x001d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.onNestedScrollAccepted(android.view.View, android.view.View, int):void");
    }

    public boolean onStartNestedScroll(View view, View view2, int i2) {
        if ((i2 & 2) == 0 || this.f106h.getVisibility() != 0) {
            return false;
        }
        return this.f112n;
    }

    public void onStopNestedScroll(View view) {
        if (this.f112n && !this.f113o) {
            if (this.f114p <= this.f106h.getHeight()) {
                c();
                postDelayed(this.C, 600);
            } else {
                c();
                postDelayed(this.D, 600);
            }
        }
        d dVar = this.y;
        if (dVar != null && ((v) dVar) == null) {
            throw null;
        }
    }

    public void onWindowSystemUiVisibilityChanged(int i2) {
        super.onWindowSystemUiVisibilityChanged(i2);
        i();
        int i3 = this.f115q ^ i2;
        this.f115q = i2;
        boolean z2 = (i2 & 4) == 0;
        boolean z3 = (i2 & 256) != 0;
        d dVar = this.y;
        if (dVar != null) {
            ((v) dVar).f1172p = !z3;
            if (z2 || !z3) {
                v vVar = (v) this.y;
                if (vVar.r) {
                    vVar.r = false;
                    vVar.f(true);
                }
            } else {
                v vVar2 = (v) dVar;
                if (!vVar2.r) {
                    vVar2.r = true;
                    vVar2.f(true);
                }
            }
        }
        if ((i3 & 256) != 0 && this.y != null) {
            m.C(this);
        }
    }

    public void onWindowVisibilityChanged(int i2) {
        super.onWindowVisibilityChanged(i2);
        this.f104f = i2;
        d dVar = this.y;
        if (dVar != null) {
            ((v) dVar).f1171o = i2;
        }
    }

    public void setActionBarHideOffset(int i2) {
        c();
        this.f106h.setTranslationY((float) (-Math.max(0, Math.min(i2, this.f106h.getHeight()))));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.y = dVar;
        if (getWindowToken() != null) {
            ((v) this.y).f1171o = this.f104f;
            int i2 = this.f115q;
            if (i2 != 0) {
                onWindowSystemUiVisibilityChanged(i2);
                m.C(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z2) {
        this.f111m = z2;
    }

    public void setHideOnContentScrollEnabled(boolean z2) {
        if (z2 != this.f112n) {
            this.f112n = z2;
            if (!z2) {
                c();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i2) {
        i();
        this.f107i.setIcon(i2);
    }

    public void setLogo(int i2) {
        i();
        this.f107i.b(i2);
    }

    public void setOverlayMode(boolean z2) {
        this.f110l = z2;
        this.f109k = z2 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z2) {
    }

    public void setUiOptions(int i2) {
    }

    public void setWindowCallback(Window.Callback callback) {
        i();
        this.f107i.setWindowCallback(callback);
    }

    public void setWindowTitle(CharSequence charSequence) {
        i();
        this.f107i.setWindowTitle(charSequence);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f104f = 0;
        this.r = new Rect();
        this.s = new Rect();
        this.t = new Rect();
        this.u = new Rect();
        this.v = new Rect();
        this.w = new Rect();
        this.x = new Rect();
        this.B = new a();
        this.C = new b();
        this.D = new c();
        a(context);
        this.E = new j();
    }

    public boolean b() {
        i();
        return this.f107i.b();
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        i();
        this.f107i.setIcon(drawable);
    }

    public final boolean a(View view, Rect rect, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6;
        int i2;
        int i3;
        int i4;
        int i5;
        e eVar = (e) view.getLayoutParams();
        if (!z2 || eVar.leftMargin == (i5 = rect.left)) {
            z6 = false;
        } else {
            eVar.leftMargin = i5;
            z6 = true;
        }
        if (z3 && eVar.topMargin != (i4 = rect.top)) {
            eVar.topMargin = i4;
            z6 = true;
        }
        if (z5 && eVar.rightMargin != (i3 = rect.right)) {
            eVar.rightMargin = i3;
            z6 = true;
        }
        if (!z4 || eVar.bottomMargin == (i2 = rect.bottom)) {
            return z6;
        }
        eVar.bottomMargin = i2;
        return true;
    }

    public void a(View view, View view2, int i2, int i3) {
        if (i3 == 0) {
            onNestedScrollAccepted(view, view2, i2);
        }
    }

    public void a(View view, int i2) {
        if (i2 == 0) {
            onStopNestedScroll(view);
        }
    }

    public void a(View view, int i2, int i3, int i4, int i5, int i6) {
        if (i6 == 0) {
            int i7 = this.f114p + i3;
            this.f114p = i7;
            setActionBarHideOffset(i7);
        }
    }

    public void a(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        if (i6 == 0) {
            int i7 = this.f114p + i3;
            this.f114p = i7;
            setActionBarHideOffset(i7);
        }
    }

    public void a(int i2) {
        i();
        if (i2 == 2) {
            this.f107i.l();
        } else if (i2 == 5) {
            this.f107i.n();
        } else if (i2 == 109) {
            setOverlayMode(true);
        }
    }

    public boolean a() {
        i();
        return this.f107i.a();
    }

    public void a(Menu menu, m.a aVar) {
        i();
        this.f107i.a(menu, aVar);
    }
}
