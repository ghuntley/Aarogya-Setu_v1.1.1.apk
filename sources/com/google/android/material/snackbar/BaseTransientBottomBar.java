package com.google.android.material.snackbar;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import h.h.m.m;
import h.h.m.v;
import i.c.a.b.d.l.q;
import i.c.a.c.f0.j;
import i.c.a.c.f0.k;
import i.c.a.c.f0.l;
import i.c.a.c.f0.n;
import i.c.a.c.f0.p;
import java.util.List;

public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {

    /* renamed from: o  reason: collision with root package name */
    public static final Handler f637o = new Handler(Looper.getMainLooper(), new a());

    /* renamed from: p  reason: collision with root package name */
    public static final int[] f638p = {i.c.a.c.b.snackbarStyle};
    public final ViewGroup a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f639b;
    public final i c;
    public final n d;
    public int e;

    /* renamed from: f  reason: collision with root package name */
    public final Runnable f640f = new b();

    /* renamed from: g  reason: collision with root package name */
    public Rect f641g;

    /* renamed from: h  reason: collision with root package name */
    public int f642h;

    /* renamed from: i  reason: collision with root package name */
    public int f643i;

    /* renamed from: j  reason: collision with root package name */
    public int f644j;

    /* renamed from: k  reason: collision with root package name */
    public int f645k;

    /* renamed from: l  reason: collision with root package name */
    public int f646l;

    /* renamed from: m  reason: collision with root package name */
    public final AccessibilityManager f647m;

    /* renamed from: n  reason: collision with root package name */
    public p.b f648n = new e();

    public static class a implements Handler.Callback {
        public boolean handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == 0) {
                BaseTransientBottomBar baseTransientBottomBar = (BaseTransientBottomBar) message.obj;
                baseTransientBottomBar.c.setOnAttachStateChangeListener(new j(baseTransientBottomBar));
                if (baseTransientBottomBar.c.getParent() == null) {
                    ViewGroup.LayoutParams layoutParams = baseTransientBottomBar.c.getLayoutParams();
                    if (layoutParams instanceof CoordinatorLayout.f) {
                        CoordinatorLayout.f fVar = (CoordinatorLayout.f) layoutParams;
                        Behavior behavior = new Behavior();
                        f fVar2 = behavior.f649j;
                        if (fVar2 != null) {
                            fVar2.a = baseTransientBottomBar.f648n;
                            behavior.f549b = new l(baseTransientBottomBar);
                            fVar.a((CoordinatorLayout.c) behavior);
                            fVar.f196g = 80;
                        } else {
                            throw null;
                        }
                    }
                    baseTransientBottomBar.f646l = 0;
                    baseTransientBottomBar.e();
                    baseTransientBottomBar.c.setVisibility(4);
                    baseTransientBottomBar.a.addView(baseTransientBottomBar.c);
                }
                if (m.x(baseTransientBottomBar.c)) {
                    baseTransientBottomBar.d();
                } else {
                    baseTransientBottomBar.c.setOnLayoutChangeListener(new k(baseTransientBottomBar));
                }
                return true;
            } else if (i2 != 1) {
                return false;
            } else {
                BaseTransientBottomBar baseTransientBottomBar2 = (BaseTransientBottomBar) message.obj;
                int i3 = message.arg1;
                if (!baseTransientBottomBar2.c() || baseTransientBottomBar2.c.getVisibility() != 0) {
                    baseTransientBottomBar2.b(i3);
                } else if (baseTransientBottomBar2.c.getAnimationMode() == 1) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
                    ofFloat.setInterpolator(i.c.a.c.l.a.a);
                    ofFloat.addUpdateListener(new i.c.a.c.f0.c(baseTransientBottomBar2));
                    ofFloat.setDuration(75);
                    ofFloat.addListener(new i.c.a.c.f0.b(baseTransientBottomBar2, i3));
                    ofFloat.start();
                } else {
                    ValueAnimator valueAnimator = new ValueAnimator();
                    valueAnimator.setIntValues(new int[]{0, baseTransientBottomBar2.a()});
                    valueAnimator.setInterpolator(i.c.a.c.l.a.f4148b);
                    valueAnimator.setDuration(250);
                    valueAnimator.addListener(new i.c.a.c.f0.g(baseTransientBottomBar2, i3));
                    valueAnimator.addUpdateListener(new i.c.a.c.f0.h(baseTransientBottomBar2));
                    valueAnimator.start();
                }
                return true;
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public void run() {
            Context context;
            BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
            if (baseTransientBottomBar.c != null && (context = baseTransientBottomBar.f639b) != null) {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics);
                int i2 = displayMetrics.heightPixels;
                BaseTransientBottomBar baseTransientBottomBar2 = BaseTransientBottomBar.this;
                int[] iArr = new int[2];
                baseTransientBottomBar2.c.getLocationOnScreen(iArr);
                int height = (i2 - (baseTransientBottomBar2.c.getHeight() + iArr[1])) + ((int) BaseTransientBottomBar.this.c.getTranslationY());
                BaseTransientBottomBar baseTransientBottomBar3 = BaseTransientBottomBar.this;
                if (height < baseTransientBottomBar3.f645k) {
                    ViewGroup.LayoutParams layoutParams = baseTransientBottomBar3.c.getLayoutParams();
                    if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                        Log.w("BaseTransientBottomBar", "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                        return;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    int i3 = marginLayoutParams.bottomMargin;
                    BaseTransientBottomBar baseTransientBottomBar4 = BaseTransientBottomBar.this;
                    marginLayoutParams.bottomMargin = (baseTransientBottomBar4.f645k - height) + i3;
                    baseTransientBottomBar4.c.requestLayout();
                }
            }
        }
    }

    public class c implements h.h.m.k {
        public c() {
        }

        public v a(View view, v vVar) {
            BaseTransientBottomBar.this.f642h = vVar.a();
            BaseTransientBottomBar.this.f643i = vVar.b();
            BaseTransientBottomBar.this.f644j = vVar.c();
            BaseTransientBottomBar.this.e();
            return vVar;
        }
    }

    public class e implements p.b {
        public e() {
        }

        public void a() {
            Handler handler = BaseTransientBottomBar.f637o;
            handler.sendMessage(handler.obtainMessage(0, BaseTransientBottomBar.this));
        }

        public void a(int i2) {
            Handler handler = BaseTransientBottomBar.f637o;
            handler.sendMessage(handler.obtainMessage(1, i2, 0, BaseTransientBottomBar.this));
        }
    }

    public static class f {
        public p.b a;

        public f(SwipeDismissBehavior<?> swipeDismissBehavior) {
            if (swipeDismissBehavior != null) {
                swipeDismissBehavior.f551g = SwipeDismissBehavior.a(0.0f, 0.1f, 1.0f);
                swipeDismissBehavior.f552h = SwipeDismissBehavior.a(0.0f, 0.6f, 1.0f);
                swipeDismissBehavior.e = 0;
                return;
            }
            throw null;
        }
    }

    public interface g {
    }

    public interface h {
    }

    public static class i extends FrameLayout {

        /* renamed from: l  reason: collision with root package name */
        public static final View.OnTouchListener f650l = new a();
        public h e;

        /* renamed from: f  reason: collision with root package name */
        public g f651f;

        /* renamed from: g  reason: collision with root package name */
        public int f652g;

        /* renamed from: h  reason: collision with root package name */
        public final float f653h;

        /* renamed from: i  reason: collision with root package name */
        public final float f654i;

        /* renamed from: j  reason: collision with root package name */
        public ColorStateList f655j;

        /* renamed from: k  reason: collision with root package name */
        public PorterDuff.Mode f656k;

        public static class a implements View.OnTouchListener {
            @SuppressLint({"ClickableViewAccessibility"})
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        public i(Context context) {
            this(context, (AttributeSet) null);
        }

        public float getActionTextColorAlpha() {
            return this.f654i;
        }

        public int getAnimationMode() {
            return this.f652g;
        }

        public float getBackgroundOverlayColorAlpha() {
            return this.f653h;
        }

        public void onAttachedToWindow() {
            WindowInsets rootWindowInsets;
            super.onAttachedToWindow();
            g gVar = this.f651f;
            if (gVar != null) {
                j jVar = (j) gVar;
                if (jVar == null) {
                    throw null;
                } else if (Build.VERSION.SDK_INT >= 29 && (rootWindowInsets = jVar.a.c.getRootWindowInsets()) != null) {
                    jVar.a.f645k = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
                    jVar.a.e();
                }
            }
            m.C(this);
        }

        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            g gVar = this.f651f;
            if (gVar != null) {
                j jVar = (j) gVar;
                BaseTransientBottomBar baseTransientBottomBar = jVar.a;
                if (baseTransientBottomBar == null) {
                    throw null;
                } else if (p.b().a(baseTransientBottomBar.f648n)) {
                    BaseTransientBottomBar.f637o.post(new i.c.a.c.f0.i(jVar));
                }
            }
        }

        public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
            super.onLayout(z, i2, i3, i4, i5);
            h hVar = this.e;
            if (hVar != null) {
                k kVar = (k) hVar;
                kVar.a.c.setOnLayoutChangeListener((h) null);
                kVar.a.d();
            }
        }

        public void setAnimationMode(int i2) {
            this.f652g = i2;
        }

        public void setBackground(Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        public void setBackgroundDrawable(Drawable drawable) {
            if (!(drawable == null || this.f655j == null)) {
                drawable = g.a.a.b.a.c(drawable.mutate());
                drawable.setTintList(this.f655j);
                drawable.setTintMode(this.f656k);
            }
            super.setBackgroundDrawable(drawable);
        }

        public void setBackgroundTintList(ColorStateList colorStateList) {
            this.f655j = colorStateList;
            if (getBackground() != null) {
                Drawable c = g.a.a.b.a.c(getBackground().mutate());
                c.setTintList(colorStateList);
                c.setTintMode(this.f656k);
                if (c != getBackground()) {
                    super.setBackgroundDrawable(c);
                }
            }
        }

        public void setBackgroundTintMode(PorterDuff.Mode mode) {
            this.f656k = mode;
            if (getBackground() != null) {
                Drawable c = g.a.a.b.a.c(getBackground().mutate());
                c.setTintMode(mode);
                if (c != getBackground()) {
                    super.setBackgroundDrawable(c);
                }
            }
        }

        public void setOnAttachStateChangeListener(g gVar) {
            this.f651f = gVar;
        }

        public void setOnClickListener(View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : f650l);
            super.setOnClickListener(onClickListener);
        }

        public void setOnLayoutChangeListener(h hVar) {
            this.e = hVar;
        }

        public i(Context context, AttributeSet attributeSet) {
            super(i.c.a.c.j0.a.a.a(context, attributeSet, 0, 0), attributeSet);
            Drawable drawable;
            Context context2 = getContext();
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, i.c.a.c.k.SnackbarLayout);
            if (obtainStyledAttributes.hasValue(i.c.a.c.k.SnackbarLayout_elevation)) {
                m.a((View) this, (float) obtainStyledAttributes.getDimensionPixelSize(i.c.a.c.k.SnackbarLayout_elevation, 0));
            }
            this.f652g = obtainStyledAttributes.getInt(i.c.a.c.k.SnackbarLayout_animationMode, 0);
            this.f653h = obtainStyledAttributes.getFloat(i.c.a.c.k.SnackbarLayout_backgroundOverlayColorAlpha, 1.0f);
            setBackgroundTintList(q.a(context2, obtainStyledAttributes, i.c.a.c.k.SnackbarLayout_backgroundTint));
            setBackgroundTintMode(q.a(obtainStyledAttributes.getInt(i.c.a.c.k.SnackbarLayout_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN));
            this.f654i = obtainStyledAttributes.getFloat(i.c.a.c.k.SnackbarLayout_actionTextColorAlpha, 1.0f);
            obtainStyledAttributes.recycle();
            setOnTouchListener(f650l);
            setFocusable(true);
            if (getBackground() == null) {
                float dimension = getResources().getDimension(i.c.a.c.d.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setCornerRadius(dimension);
                int i2 = i.c.a.c.b.colorSurface;
                int i3 = i.c.a.c.b.colorOnSurface;
                gradientDrawable.setColor(q.a(q.a((View) this, i2), q.a((View) this, i3), getBackgroundOverlayColorAlpha()));
                if (this.f655j != null) {
                    drawable = g.a.a.b.a.c((Drawable) gradientDrawable);
                    drawable.setTintList(this.f655j);
                } else {
                    drawable = g.a.a.b.a.c((Drawable) gradientDrawable);
                }
                m.a((View) this, drawable);
            }
        }
    }

    public BaseTransientBottomBar(ViewGroup viewGroup, View view, n nVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null parent");
        } else if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        } else if (nVar != null) {
            this.a = viewGroup;
            this.d = nVar;
            Context context = viewGroup.getContext();
            this.f639b = context;
            i.c.a.c.z.i.a(context, i.c.a.c.z.i.a, "Theme.AppCompat");
            LayoutInflater from = LayoutInflater.from(this.f639b);
            TypedArray obtainStyledAttributes = this.f639b.obtainStyledAttributes(f638p);
            int resourceId = obtainStyledAttributes.getResourceId(0, -1);
            obtainStyledAttributes.recycle();
            i iVar = (i) from.inflate(resourceId != -1 ? i.c.a.c.h.mtrl_layout_snackbar : i.c.a.c.h.design_layout_snackbar, this.a, false);
            this.c = iVar;
            if (view instanceof SnackbarContentLayout) {
                SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) view;
                float actionTextColorAlpha = iVar.getActionTextColorAlpha();
                if (actionTextColorAlpha != 1.0f) {
                    snackbarContentLayout.f658f.setTextColor(q.a(q.a((View) snackbarContentLayout, i.c.a.c.b.colorSurface), snackbarContentLayout.f658f.getCurrentTextColor(), actionTextColorAlpha));
                }
            }
            this.c.addView(view);
            ViewGroup.LayoutParams layoutParams = this.c.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                this.f641g = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            }
            m.g(this.c, 1);
            this.c.setImportantForAccessibility(1);
            this.c.setFitsSystemWindows(true);
            m.a((View) this.c, (h.h.m.k) new c());
            m.a((View) this.c, (h.h.m.a) new d());
            this.f647m = (AccessibilityManager) this.f639b.getSystemService("accessibility");
        } else {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
    }

    public void a(int i2) {
        p.b().a(this.f648n, i2);
    }

    public void b() {
        p.b().e(this.f648n);
    }

    public boolean c() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = this.f647m.getEnabledAccessibilityServiceList(1);
        if (enabledAccessibilityServiceList == null || !enabledAccessibilityServiceList.isEmpty()) {
            return false;
        }
        return true;
    }

    public final void d() {
        if (c()) {
            this.c.post(new i.c.a.c.f0.m(this));
            return;
        }
        this.c.setVisibility(0);
        b();
    }

    public final void e() {
        Rect rect;
        ViewGroup.LayoutParams layoutParams = this.c.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (rect = this.f641g) == null) {
            Log.w("BaseTransientBottomBar", "Unable to update margins because layout params are not MarginLayoutParams");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = rect.bottom + this.f642h;
        marginLayoutParams.leftMargin = rect.left + this.f643i;
        marginLayoutParams.rightMargin = rect.right + this.f644j;
        this.c.requestLayout();
        if (Build.VERSION.SDK_INT >= 29) {
            boolean z = false;
            if (this.f645k > 0) {
                ViewGroup.LayoutParams layoutParams2 = this.c.getLayoutParams();
                if ((layoutParams2 instanceof CoordinatorLayout.f) && (((CoordinatorLayout.f) layoutParams2).a instanceof SwipeDismissBehavior)) {
                    z = true;
                }
            }
            if (z) {
                this.c.removeCallbacks(this.f640f);
                this.c.post(this.f640f);
            }
        }
    }

    public static class Behavior extends SwipeDismissBehavior<View> {

        /* renamed from: j  reason: collision with root package name */
        public final f f649j = new f(this);

        public boolean a(View view) {
            if (this.f649j != null) {
                return view instanceof i;
            }
            throw null;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            f fVar = this.f649j;
            if (fVar != null) {
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked != 0) {
                    if (actionMasked == 1 || actionMasked == 3) {
                        p.b().g(fVar.a);
                    }
                } else if (coordinatorLayout.a(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                    p.b().f(fVar.a);
                }
                return super.a(coordinatorLayout, view, motionEvent);
            }
            throw null;
        }
    }

    public final int a() {
        int height = this.c.getHeight();
        ViewGroup.LayoutParams layoutParams = this.c.getLayoutParams();
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? height + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : height;
    }

    public void b(int i2) {
        p.b().d(this.f648n);
        ViewParent parent = this.c.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.c);
        }
    }

    public class d extends h.h.m.a {
        public d() {
        }

        public void a(View view, h.h.m.w.b bVar) {
            this.a.onInitializeAccessibilityNodeInfo(view, bVar.a);
            bVar.a.addAction(1048576);
            bVar.a.setDismissable(true);
        }

        public boolean a(View view, int i2, Bundle bundle) {
            if (i2 != 1048576) {
                return super.a(view, i2, bundle);
            }
            ((Snackbar) BaseTransientBottomBar.this).a(3);
            return true;
        }
    }
}
