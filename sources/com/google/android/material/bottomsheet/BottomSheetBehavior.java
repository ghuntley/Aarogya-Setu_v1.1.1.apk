package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.crashlytics.android.answers.AnswersRetryFilesSender;
import h.h.m.m;
import h.h.m.w.b;
import h.h.m.w.d;
import h.j.b.e;
import i.c.a.b.d.l.q;
import i.c.a.c.e0.g;
import i.c.a.c.j;
import i.c.a.c.k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.c<V> {
    public static final int M = j.Widget_Design_BottomSheet_Modal;
    public boolean A;
    public int B;
    public int C;
    public WeakReference<V> D;
    public WeakReference<View> E;
    public final ArrayList<d> F = new ArrayList<>();
    public VelocityTracker G;
    public int H;
    public int I;
    public boolean J;
    public Map<View, Integer> K;
    public final e.c L = new b();
    public int a = 0;

    /* renamed from: b  reason: collision with root package name */
    public boolean f562b = true;
    public boolean c = false;
    public float d;
    public int e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f563f;

    /* renamed from: g  reason: collision with root package name */
    public int f564g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f565h;

    /* renamed from: i  reason: collision with root package name */
    public g f566i;

    /* renamed from: j  reason: collision with root package name */
    public i.c.a.c.e0.j f567j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f568k;

    /* renamed from: l  reason: collision with root package name */
    public BottomSheetBehavior<V>.f f569l = null;

    /* renamed from: m  reason: collision with root package name */
    public ValueAnimator f570m;

    /* renamed from: n  reason: collision with root package name */
    public int f571n;

    /* renamed from: o  reason: collision with root package name */
    public int f572o;

    /* renamed from: p  reason: collision with root package name */
    public int f573p;

    /* renamed from: q  reason: collision with root package name */
    public float f574q = 0.5f;
    public int r;
    public float s = -1.0f;
    public boolean t;
    public boolean u;
    public boolean v = true;
    public int w = 4;
    public h.j.b.e x;
    public boolean y;
    public int z;

    public class a implements Runnable {
        public final /* synthetic */ View e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ int f575f;

        public a(View view, int i2) {
            this.e = view;
            this.f575f = i2;
        }

        public void run() {
            BottomSheetBehavior.this.a(this.e, this.f575f);
        }
    }

    public class b extends e.c {
        public b() {
        }

        public void a(View view, int i2, int i3, int i4, int i5) {
            BottomSheetBehavior.this.a(i3);
        }

        public boolean b(View view, int i2) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i3 = bottomSheetBehavior.w;
            if (i3 == 1 || bottomSheetBehavior.J) {
                return false;
            }
            if (i3 == 3 && bottomSheetBehavior.H == i2) {
                WeakReference<View> weakReference = bottomSheetBehavior.E;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            WeakReference<V> weakReference2 = BottomSheetBehavior.this.D;
            if (weakReference2 == null || weakReference2.get() != view) {
                return false;
            }
            return true;
        }

        public void a(int i2) {
            if (i2 == 1) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.v) {
                    bottomSheetBehavior.d(1);
                }
            }
        }

        public void a(View view, float f2, float f3) {
            int i2;
            int i3;
            int i4 = 4;
            if (f3 < 0.0f) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.f562b) {
                    i2 = bottomSheetBehavior.f572o;
                } else {
                    int top = view.getTop();
                    BottomSheetBehavior bottomSheetBehavior2 = BottomSheetBehavior.this;
                    int i5 = bottomSheetBehavior2.f573p;
                    if (top > i5) {
                        i3 = i5;
                        i4 = 6;
                        BottomSheetBehavior.this.a(view, i4, i2, true);
                    }
                    i2 = bottomSheetBehavior2.f571n;
                }
            } else {
                BottomSheetBehavior bottomSheetBehavior3 = BottomSheetBehavior.this;
                if (bottomSheetBehavior3.t && bottomSheetBehavior3.a(view, f3)) {
                    if (Math.abs(f2) >= Math.abs(f3) || f3 <= 500.0f) {
                        int top2 = view.getTop();
                        BottomSheetBehavior bottomSheetBehavior4 = BottomSheetBehavior.this;
                        if (!(top2 > (bottomSheetBehavior4.d() + bottomSheetBehavior4.C) / 2)) {
                            BottomSheetBehavior bottomSheetBehavior5 = BottomSheetBehavior.this;
                            if (bottomSheetBehavior5.f562b) {
                                i2 = bottomSheetBehavior5.f572o;
                            } else if (Math.abs(view.getTop() - BottomSheetBehavior.this.f571n) < Math.abs(view.getTop() - BottomSheetBehavior.this.f573p)) {
                                i2 = BottomSheetBehavior.this.f571n;
                            } else {
                                i3 = BottomSheetBehavior.this.f573p;
                                i4 = 6;
                                BottomSheetBehavior.this.a(view, i4, i2, true);
                            }
                        }
                    }
                    i2 = BottomSheetBehavior.this.C;
                    i4 = 5;
                    BottomSheetBehavior.this.a(view, i4, i2, true);
                } else if (f3 == 0.0f || Math.abs(f2) > Math.abs(f3)) {
                    int top3 = view.getTop();
                    BottomSheetBehavior bottomSheetBehavior6 = BottomSheetBehavior.this;
                    if (!bottomSheetBehavior6.f562b) {
                        int i6 = bottomSheetBehavior6.f573p;
                        if (top3 < i6) {
                            if (top3 < Math.abs(top3 - bottomSheetBehavior6.r)) {
                                i2 = BottomSheetBehavior.this.f571n;
                            } else {
                                i3 = BottomSheetBehavior.this.f573p;
                            }
                        } else if (Math.abs(top3 - i6) < Math.abs(top3 - BottomSheetBehavior.this.r)) {
                            i3 = BottomSheetBehavior.this.f573p;
                        } else {
                            i2 = BottomSheetBehavior.this.r;
                            BottomSheetBehavior.this.a(view, i4, i2, true);
                        }
                        i4 = 6;
                        BottomSheetBehavior.this.a(view, i4, i2, true);
                    } else if (Math.abs(top3 - bottomSheetBehavior6.f572o) < Math.abs(top3 - BottomSheetBehavior.this.r)) {
                        i2 = BottomSheetBehavior.this.f572o;
                    } else {
                        i2 = BottomSheetBehavior.this.r;
                        BottomSheetBehavior.this.a(view, i4, i2, true);
                    }
                } else {
                    BottomSheetBehavior bottomSheetBehavior7 = BottomSheetBehavior.this;
                    if (bottomSheetBehavior7.f562b) {
                        i2 = bottomSheetBehavior7.r;
                    } else {
                        int top4 = view.getTop();
                        if (Math.abs(top4 - BottomSheetBehavior.this.f573p) < Math.abs(top4 - BottomSheetBehavior.this.r)) {
                            i3 = BottomSheetBehavior.this.f573p;
                            i4 = 6;
                        } else {
                            i2 = BottomSheetBehavior.this.r;
                        }
                    }
                    BottomSheetBehavior.this.a(view, i4, i2, true);
                }
            }
            i4 = 3;
            BottomSheetBehavior.this.a(view, i4, i2, true);
        }

        public int b(View view, int i2, int i3) {
            int d = BottomSheetBehavior.this.d();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return g.a.a.b.a.a(i2, d, bottomSheetBehavior.t ? bottomSheetBehavior.C : bottomSheetBehavior.r);
        }

        public int b(View view) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            if (bottomSheetBehavior.t) {
                return bottomSheetBehavior.C;
            }
            return bottomSheetBehavior.r;
        }

        public int a(View view, int i2, int i3) {
            return view.getLeft();
        }
    }

    public class c implements h.h.m.w.d {
        public final /* synthetic */ int a;

        public c(int i2) {
            this.a = i2;
        }

        public boolean a(View view, d.a aVar) {
            BottomSheetBehavior.this.c(this.a);
            return true;
        }
    }

    public static abstract class d {
        public abstract void a(View view, float f2);

        public abstract void a(View view, int i2);
    }

    public class f implements Runnable {
        public final View e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f583f;

        /* renamed from: g  reason: collision with root package name */
        public int f584g;

        public f(View view, int i2) {
            this.e = view;
            this.f584g = i2;
        }

        public void run() {
            h.j.b.e eVar = BottomSheetBehavior.this.x;
            if (eVar == null || !eVar.a(true)) {
                BottomSheetBehavior.this.d(this.f584g);
            } else {
                m.a(this.e, (Runnable) this);
            }
            this.f583f = false;
        }
    }

    public BottomSheetBehavior() {
    }

    public Parcelable a(CoordinatorLayout coordinatorLayout, V v2) {
        return new e((Parcelable) View.BaseSavedState.EMPTY_STATE, (BottomSheetBehavior<?>) this);
    }

    public void a(CoordinatorLayout coordinatorLayout, V v2, View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
    }

    public boolean b(CoordinatorLayout coordinatorLayout, V v2, MotionEvent motionEvent) {
        if (!v2.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.w == 1 && actionMasked == 0) {
            return true;
        }
        h.j.b.e eVar = this.x;
        if (eVar != null) {
            eVar.a(motionEvent);
        }
        if (actionMasked == 0) {
            this.H = -1;
            VelocityTracker velocityTracker = this.G;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.G = null;
            }
        }
        if (this.G == null) {
            this.G = VelocityTracker.obtain();
        }
        this.G.addMovement(motionEvent);
        if (actionMasked == 2 && !this.y) {
            float abs = Math.abs(((float) this.I) - motionEvent.getY());
            h.j.b.e eVar2 = this.x;
            if (abs > ((float) eVar2.f1880b)) {
                eVar2.a((View) v2, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.y;
    }

    public void c(int i2) {
        if (i2 != this.w) {
            if (this.D != null) {
                e(i2);
            } else if (i2 == 4 || i2 == 3 || i2 == 6 || (this.t && i2 == 5)) {
                this.w = i2;
            }
        }
    }

    public int d() {
        return this.f562b ? this.f572o : this.f571n;
    }

    public final void e(int i2) {
        View view = (View) this.D.get();
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent == null || !parent.isLayoutRequested() || !m.w(view)) {
                a(view, i2);
            } else {
                view.post(new a(view, i2));
            }
        }
    }

    public final void f(int i2) {
        ValueAnimator valueAnimator;
        if (i2 != 2) {
            boolean z2 = i2 == 3;
            if (this.f568k != z2) {
                this.f568k = z2;
                if (this.f566i != null && (valueAnimator = this.f570m) != null) {
                    if (valueAnimator.isRunning()) {
                        this.f570m.reverse();
                        return;
                    }
                    float f2 = z2 ? 0.0f : 1.0f;
                    this.f570m.setFloatValues(new float[]{1.0f - f2, f2});
                    this.f570m.start();
                }
            }
        }
    }

    public void d(int i2) {
        View view;
        if (this.w != i2) {
            this.w = i2;
            WeakReference<V> weakReference = this.D;
            if (weakReference != null && (view = (View) weakReference.get()) != null) {
                if (i2 == 3) {
                    b(true);
                } else if (i2 == 6 || i2 == 5 || i2 == 4) {
                    b(false);
                }
                f(i2);
                for (int i3 = 0; i3 < this.F.size(); i3++) {
                    this.F.get(i3).a(view, i2);
                }
                e();
            }
        }
    }

    public void a(CoordinatorLayout coordinatorLayout, V v2, Parcelable parcelable) {
        e eVar = (e) parcelable;
        Parcelable parcelable2 = eVar.e;
        int i2 = this.a;
        if (i2 != 0) {
            if (i2 == -1 || (i2 & 1) == 1) {
                this.e = eVar.f579h;
            }
            int i3 = this.a;
            if (i3 == -1 || (i3 & 2) == 2) {
                this.f562b = eVar.f580i;
            }
            int i4 = this.a;
            if (i4 == -1 || (i4 & 4) == 4) {
                this.t = eVar.f581j;
            }
            int i5 = this.a;
            if (i5 == -1 || (i5 & 8) == 8) {
                this.u = eVar.f582k;
            }
        }
        int i6 = eVar.f578g;
        if (i6 == 1 || i6 == 2) {
            this.w = 4;
        } else {
            this.w = i6;
        }
    }

    public static class e extends h.j.a.a {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: g  reason: collision with root package name */
        public final int f578g;

        /* renamed from: h  reason: collision with root package name */
        public int f579h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f580i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f581j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f582k;

        public static class a implements Parcelable.ClassLoaderCreator<e> {
            public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new e(parcel, classLoader);
            }

            public Object[] newArray(int i2) {
                return new e[i2];
            }

            public Object createFromParcel(Parcel parcel) {
                return new e(parcel, (ClassLoader) null);
            }
        }

        public e(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f578g = parcel.readInt();
            this.f579h = parcel.readInt();
            boolean z = false;
            this.f580i = parcel.readInt() == 1;
            this.f581j = parcel.readInt() == 1;
            this.f582k = parcel.readInt() == 1 ? true : z;
        }

        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeParcelable(this.e, i2);
            parcel.writeInt(this.f578g);
            parcel.writeInt(this.f579h);
            parcel.writeInt(this.f580i ? 1 : 0);
            parcel.writeInt(this.f581j ? 1 : 0);
            parcel.writeInt(this.f582k ? 1 : 0);
        }

        public e(Parcelable parcelable, BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.f578g = bottomSheetBehavior.w;
            this.f579h = bottomSheetBehavior.e;
            this.f580i = bottomSheetBehavior.f562b;
            this.f581j = bottomSheetBehavior.t;
            this.f582k = bottomSheetBehavior.u;
        }
    }

    public final int c() {
        if (this.f563f) {
            return Math.max(this.f564g, this.C - ((this.B * 9) / 16));
        }
        return this.e;
    }

    public final void e() {
        View view;
        WeakReference<V> weakReference = this.D;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            m.f(view, 524288);
            m.f(view, 262144);
            m.f(view, 1048576);
            if (this.t && this.w != 5) {
                a(view, b.a.f1829j, 5);
            }
            int i2 = this.w;
            int i3 = 6;
            if (i2 == 3) {
                if (this.f562b) {
                    i3 = 4;
                }
                a(view, b.a.f1828i, i3);
            } else if (i2 == 4) {
                if (this.f562b) {
                    i3 = 3;
                }
                a(view, b.a.f1827h, i3);
            } else if (i2 == 6) {
                a(view, b.a.f1828i, 4);
                a(view, b.a.f1827h, 3);
            }
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.BottomSheetBehavior_Layout);
        this.f565h = obtainStyledAttributes.hasValue(k.BottomSheetBehavior_Layout_shapeAppearance);
        boolean hasValue = obtainStyledAttributes.hasValue(k.BottomSheetBehavior_Layout_backgroundTint);
        if (hasValue) {
            a(context, attributeSet, hasValue, q.a(context, obtainStyledAttributes, k.BottomSheetBehavior_Layout_backgroundTint));
        } else {
            a(context, attributeSet, hasValue, (ColorStateList) null);
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f570m = ofFloat;
        ofFloat.setDuration(500);
        this.f570m.addUpdateListener(new i.c.a.c.p.a(this));
        this.s = obtainStyledAttributes.getDimension(k.BottomSheetBehavior_Layout_android_elevation, -1.0f);
        TypedValue peekValue = obtainStyledAttributes.peekValue(k.BottomSheetBehavior_Layout_behavior_peekHeight);
        if (peekValue == null || (i2 = peekValue.data) != -1) {
            b(obtainStyledAttributes.getDimensionPixelSize(k.BottomSheetBehavior_Layout_behavior_peekHeight, -1));
        } else {
            b(i2);
        }
        a(obtainStyledAttributes.getBoolean(k.BottomSheetBehavior_Layout_behavior_hideable, false));
        boolean z2 = obtainStyledAttributes.getBoolean(k.BottomSheetBehavior_Layout_behavior_fitToContents, true);
        if (this.f562b != z2) {
            this.f562b = z2;
            if (this.D != null) {
                b();
            }
            d((!this.f562b || this.w != 6) ? this.w : 3);
            e();
        }
        this.u = obtainStyledAttributes.getBoolean(k.BottomSheetBehavior_Layout_behavior_skipCollapsed, false);
        this.v = obtainStyledAttributes.getBoolean(k.BottomSheetBehavior_Layout_behavior_draggable, true);
        this.a = obtainStyledAttributes.getInt(k.BottomSheetBehavior_Layout_behavior_saveFlags, 0);
        float f2 = obtainStyledAttributes.getFloat(k.BottomSheetBehavior_Layout_behavior_halfExpandedRatio, 0.5f);
        if (f2 <= 0.0f || f2 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.f574q = f2;
        if (this.D != null) {
            this.f573p = (int) ((1.0f - f2) * ((float) this.C));
        }
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(k.BottomSheetBehavior_Layout_behavior_expandedOffset);
        if (peekValue2 == null || peekValue2.type != 16) {
            int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(k.BottomSheetBehavior_Layout_behavior_expandedOffset, 0);
            if (dimensionPixelOffset >= 0) {
                this.f571n = dimensionPixelOffset;
            } else {
                throw new IllegalArgumentException("offset must be greater than or equal to 0");
            }
        } else {
            int i3 = peekValue2.data;
            if (i3 >= 0) {
                this.f571n = i3;
            } else {
                throw new IllegalArgumentException("offset must be greater than or equal to 0");
            }
        }
        obtainStyledAttributes.recycle();
        this.d = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public void a(CoordinatorLayout.f fVar) {
        this.D = null;
        this.x = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(int r4) {
        /*
            r3 = this;
            r0 = 1
            r1 = -1
            r2 = 0
            if (r4 != r1) goto L_0x000c
            boolean r4 = r3.f563f
            if (r4 != 0) goto L_0x0015
            r3.f563f = r0
            goto L_0x001f
        L_0x000c:
            boolean r1 = r3.f563f
            if (r1 != 0) goto L_0x0017
            int r1 = r3.e
            if (r1 == r4) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r0 = 0
            goto L_0x001f
        L_0x0017:
            r3.f563f = r2
            int r4 = java.lang.Math.max(r2, r4)
            r3.e = r4
        L_0x001f:
            if (r0 == 0) goto L_0x003a
            java.lang.ref.WeakReference<V> r4 = r3.D
            if (r4 == 0) goto L_0x003a
            r3.b()
            int r4 = r3.w
            r0 = 4
            if (r4 != r0) goto L_0x003a
            java.lang.ref.WeakReference<V> r4 = r3.D
            java.lang.Object r4 = r4.get()
            android.view.View r4 = (android.view.View) r4
            if (r4 == 0) goto L_0x003a
            r4.requestLayout()
        L_0x003a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.b(int):void");
    }

    public void a() {
        this.D = null;
        this.x = null;
    }

    public boolean a(CoordinatorLayout coordinatorLayout, V v2, int i2) {
        g gVar;
        if (m.h(coordinatorLayout) && !v2.getFitsSystemWindows()) {
            v2.setFitsSystemWindows(true);
        }
        if (this.D == null) {
            this.f564g = coordinatorLayout.getResources().getDimensionPixelSize(i.c.a.c.d.design_bottom_sheet_peek_height_min);
            this.D = new WeakReference<>(v2);
            if (this.f565h && (gVar = this.f566i) != null) {
                v2.setBackground(gVar);
            }
            g gVar2 = this.f566i;
            if (gVar2 != null) {
                float f2 = this.s;
                if (f2 == -1.0f) {
                    f2 = v2.getElevation();
                }
                gVar2.a(f2);
                boolean z2 = this.w == 3;
                this.f568k = z2;
                this.f566i.b(z2 ? 0.0f : 1.0f);
            }
            e();
            if (v2.getImportantForAccessibility() == 0) {
                v2.setImportantForAccessibility(1);
            }
        }
        if (this.x == null) {
            this.x = new h.j.b.e(coordinatorLayout.getContext(), coordinatorLayout, this.L);
        }
        int top = v2.getTop();
        coordinatorLayout.b(v2, i2);
        this.B = coordinatorLayout.getWidth();
        int height = coordinatorLayout.getHeight();
        this.C = height;
        this.f572o = Math.max(0, height - v2.getHeight());
        this.f573p = (int) ((1.0f - this.f574q) * ((float) this.C));
        b();
        int i3 = this.w;
        if (i3 == 3) {
            m.e(v2, d());
        } else if (i3 == 6) {
            m.e(v2, this.f573p);
        } else if (!this.t || i3 != 5) {
            int i4 = this.w;
            if (i4 == 4) {
                m.e(v2, this.r);
            } else if (i4 == 1 || i4 == 2) {
                m.e(v2, top - v2.getTop());
            }
        } else {
            m.e(v2, this.C);
        }
        this.E = new WeakReference<>(a((View) v2));
        return true;
    }

    public final void b() {
        int c2 = c();
        if (this.f562b) {
            this.r = Math.max(this.C - c2, this.f572o);
        } else {
            this.r = this.C - c2;
        }
    }

    public static <V extends View> BottomSheetBehavior<V> b(V v2) {
        ViewGroup.LayoutParams layoutParams = v2.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.f) {
            CoordinatorLayout.c cVar = ((CoordinatorLayout.f) layoutParams).a;
            if (cVar instanceof BottomSheetBehavior) {
                return (BottomSheetBehavior) cVar;
            }
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    public final void b(boolean z2) {
        Map<View, Integer> map;
        WeakReference<V> weakReference = this.D;
        if (weakReference != null) {
            ViewParent parent = ((View) weakReference.get()).getParent();
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                int childCount = coordinatorLayout.getChildCount();
                if (z2) {
                    if (this.K == null) {
                        this.K = new HashMap(childCount);
                    } else {
                        return;
                    }
                }
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = coordinatorLayout.getChildAt(i2);
                    if (childAt != this.D.get()) {
                        if (z2) {
                            this.K.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                            if (this.c) {
                                m.h(childAt, 4);
                            }
                        } else if (this.c && (map = this.K) != null && map.containsKey(childAt)) {
                            m.h(childAt, this.K.get(childAt).intValue());
                        }
                    }
                }
                if (!z2) {
                    this.K = null;
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: android.view.View} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(androidx.coordinatorlayout.widget.CoordinatorLayout r10, V r11, android.view.MotionEvent r12) {
        /*
            r9 = this;
            boolean r0 = r11.isShown()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x00d8
            boolean r0 = r9.v
            if (r0 != 0) goto L_0x000e
            goto L_0x00d8
        L_0x000e:
            int r0 = r12.getActionMasked()
            r3 = 0
            r4 = -1
            if (r0 != 0) goto L_0x0021
            r9.H = r4
            android.view.VelocityTracker r5 = r9.G
            if (r5 == 0) goto L_0x0021
            r5.recycle()
            r9.G = r3
        L_0x0021:
            android.view.VelocityTracker r5 = r9.G
            if (r5 != 0) goto L_0x002b
            android.view.VelocityTracker r5 = android.view.VelocityTracker.obtain()
            r9.G = r5
        L_0x002b:
            android.view.VelocityTracker r5 = r9.G
            r5.addMovement(r12)
            r5 = 2
            if (r0 == 0) goto L_0x0044
            if (r0 == r2) goto L_0x0039
            r11 = 3
            if (r0 == r11) goto L_0x0039
            goto L_0x0087
        L_0x0039:
            r9.J = r1
            r9.H = r4
            boolean r11 = r9.y
            if (r11 == 0) goto L_0x0087
            r9.y = r1
            return r1
        L_0x0044:
            float r6 = r12.getX()
            int r6 = (int) r6
            float r7 = r12.getY()
            int r7 = (int) r7
            r9.I = r7
            int r7 = r9.w
            if (r7 == r5) goto L_0x0076
            java.lang.ref.WeakReference<android.view.View> r7 = r9.E
            if (r7 == 0) goto L_0x005f
            java.lang.Object r7 = r7.get()
            android.view.View r7 = (android.view.View) r7
            goto L_0x0060
        L_0x005f:
            r7 = r3
        L_0x0060:
            if (r7 == 0) goto L_0x0076
            int r8 = r9.I
            boolean r7 = r10.a((android.view.View) r7, (int) r6, (int) r8)
            if (r7 == 0) goto L_0x0076
            int r7 = r12.getActionIndex()
            int r7 = r12.getPointerId(r7)
            r9.H = r7
            r9.J = r2
        L_0x0076:
            int r7 = r9.H
            if (r7 != r4) goto L_0x0084
            int r4 = r9.I
            boolean r11 = r10.a((android.view.View) r11, (int) r6, (int) r4)
            if (r11 != 0) goto L_0x0084
            r11 = 1
            goto L_0x0085
        L_0x0084:
            r11 = 0
        L_0x0085:
            r9.y = r11
        L_0x0087:
            boolean r11 = r9.y
            if (r11 != 0) goto L_0x0096
            h.j.b.e r11 = r9.x
            if (r11 == 0) goto L_0x0096
            boolean r11 = r11.c((android.view.MotionEvent) r12)
            if (r11 == 0) goto L_0x0096
            return r2
        L_0x0096:
            java.lang.ref.WeakReference<android.view.View> r11 = r9.E
            if (r11 == 0) goto L_0x00a1
            java.lang.Object r11 = r11.get()
            r3 = r11
            android.view.View r3 = (android.view.View) r3
        L_0x00a1:
            if (r0 != r5) goto L_0x00d7
            if (r3 == 0) goto L_0x00d7
            boolean r11 = r9.y
            if (r11 != 0) goto L_0x00d7
            int r11 = r9.w
            if (r11 == r2) goto L_0x00d7
            float r11 = r12.getX()
            int r11 = (int) r11
            float r0 = r12.getY()
            int r0 = (int) r0
            boolean r10 = r10.a((android.view.View) r3, (int) r11, (int) r0)
            if (r10 != 0) goto L_0x00d7
            h.j.b.e r10 = r9.x
            if (r10 == 0) goto L_0x00d7
            int r10 = r9.I
            float r10 = (float) r10
            float r11 = r12.getY()
            float r10 = r10 - r11
            float r10 = java.lang.Math.abs(r10)
            h.j.b.e r11 = r9.x
            int r11 = r11.f1880b
            float r11 = (float) r11
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 <= 0) goto L_0x00d7
            r1 = 1
        L_0x00d7:
            return r1
        L_0x00d8:
            r9.y = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.a(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    public boolean a(CoordinatorLayout coordinatorLayout, V v2, View view, View view2, int i2, int i3) {
        this.z = 0;
        this.A = false;
        if ((i2 & 2) != 0) {
            return true;
        }
        return false;
    }

    public void a(CoordinatorLayout coordinatorLayout, V v2, View view, int i2, int i3, int[] iArr, int i4) {
        if (i4 != 1) {
            WeakReference<View> weakReference = this.E;
            if (view == (weakReference != null ? (View) weakReference.get() : null)) {
                int top = v2.getTop();
                int i5 = top - i3;
                if (i3 > 0) {
                    if (i5 < d()) {
                        iArr[1] = top - d();
                        m.e(v2, -iArr[1]);
                        d(3);
                    } else if (this.v) {
                        iArr[1] = i3;
                        m.e(v2, -i3);
                        d(1);
                    } else {
                        return;
                    }
                } else if (i3 < 0 && !view.canScrollVertically(-1)) {
                    int i6 = this.r;
                    if (i5 > i6 && !this.t) {
                        iArr[1] = top - i6;
                        m.e(v2, -iArr[1]);
                        d(4);
                    } else if (this.v) {
                        iArr[1] = i3;
                        m.e(v2, -i3);
                        d(1);
                    } else {
                        return;
                    }
                }
                a(v2.getTop());
                this.z = i3;
                this.A = true;
            }
        }
    }

    public void a(CoordinatorLayout coordinatorLayout, V v2, View view, int i2) {
        int i3;
        int i4;
        float f2;
        int i5 = 3;
        if (v2.getTop() == d()) {
            d(3);
            return;
        }
        WeakReference<View> weakReference = this.E;
        if (weakReference != null && view == weakReference.get() && this.A) {
            if (this.z > 0) {
                if (this.f562b) {
                    i3 = this.f572o;
                } else {
                    int top = v2.getTop();
                    int i6 = this.f573p;
                    if (top > i6) {
                        i3 = i6;
                    } else {
                        i3 = this.f571n;
                    }
                }
                a((View) v2, i5, i3, false);
                this.A = false;
            }
            if (this.t) {
                VelocityTracker velocityTracker = this.G;
                if (velocityTracker == null) {
                    f2 = 0.0f;
                } else {
                    velocityTracker.computeCurrentVelocity(AnswersRetryFilesSender.BACKOFF_MS, this.d);
                    f2 = this.G.getYVelocity(this.H);
                }
                if (a((View) v2, f2)) {
                    i3 = this.C;
                    i5 = 5;
                    a((View) v2, i5, i3, false);
                    this.A = false;
                }
            }
            if (this.z == 0) {
                int top2 = v2.getTop();
                if (!this.f562b) {
                    int i7 = this.f573p;
                    if (top2 < i7) {
                        if (top2 < Math.abs(top2 - this.r)) {
                            i3 = this.f571n;
                            a((View) v2, i5, i3, false);
                            this.A = false;
                        }
                        i3 = this.f573p;
                    } else if (Math.abs(top2 - i7) < Math.abs(top2 - this.r)) {
                        i3 = this.f573p;
                    } else {
                        i4 = this.r;
                    }
                } else if (Math.abs(top2 - this.f572o) < Math.abs(top2 - this.r)) {
                    i3 = this.f572o;
                    a((View) v2, i5, i3, false);
                    this.A = false;
                } else {
                    i4 = this.r;
                }
            } else if (this.f562b) {
                i4 = this.r;
            } else {
                int top3 = v2.getTop();
                if (Math.abs(top3 - this.f573p) < Math.abs(top3 - this.r)) {
                    i3 = this.f573p;
                } else {
                    i4 = this.r;
                }
            }
            i5 = 4;
            a((View) v2, i5, i3, false);
            this.A = false;
            i5 = 6;
            a((View) v2, i5, i3, false);
            this.A = false;
        }
    }

    public boolean a(CoordinatorLayout coordinatorLayout, V v2, View view, float f2, float f3) {
        WeakReference<View> weakReference = this.E;
        if (weakReference == null || view != weakReference.get() || this.w == 3) {
            return false;
        }
        return true;
    }

    public void a(boolean z2) {
        if (this.t != z2) {
            this.t = z2;
            if (!z2 && this.w == 5) {
                c(4);
            }
            e();
        }
    }

    public boolean a(View view, float f2) {
        if (this.u) {
            return true;
        }
        if (view.getTop() < this.r) {
            return false;
        }
        if (Math.abs(((f2 * 0.1f) + ((float) view.getTop())) - ((float) this.r)) / ((float) c()) > 0.5f) {
            return true;
        }
        return false;
    }

    public View a(View view) {
        if (m.y(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View a2 = a(viewGroup.getChildAt(i2));
            if (a2 != null) {
                return a2;
            }
        }
        return null;
    }

    public final void a(Context context, AttributeSet attributeSet, boolean z2, ColorStateList colorStateList) {
        if (this.f565h) {
            this.f567j = i.c.a.c.e0.j.a(context, attributeSet, i.c.a.c.b.bottomSheetStyle, M).a();
            g gVar = new g(this.f567j);
            this.f566i = gVar;
            gVar.e.f4059b = new i.c.a.c.w.a(context);
            gVar.i();
            if (!z2 || colorStateList == null) {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16842801, typedValue, true);
                this.f566i.setTint(typedValue.data);
                return;
            }
            this.f566i.a(colorStateList);
        }
    }

    public void a(View view, int i2) {
        int i3;
        int i4;
        if (i2 == 4) {
            i3 = this.r;
        } else if (i2 == 6) {
            i3 = this.f573p;
            if (this.f562b && i3 <= (i4 = this.f572o)) {
                i2 = 3;
                i3 = i4;
            }
        } else if (i2 == 3) {
            i3 = d();
        } else if (!this.t || i2 != 5) {
            throw new IllegalArgumentException(i.a.a.a.a.b("Illegal state argument: ", i2));
        } else {
            i3 = this.C;
        }
        a(view, i2, i3, false);
    }

    public void a(View view, int i2, int i3, boolean z2) {
        boolean z3;
        if (z2) {
            z3 = this.x.b(view.getLeft(), i3);
        } else {
            h.j.b.e eVar = this.x;
            int left = view.getLeft();
            eVar.r = view;
            eVar.c = -1;
            z3 = eVar.a(left, i3, 0, 0);
            if (!z3 && eVar.a == 0 && eVar.r != null) {
                eVar.r = null;
            }
        }
        if (z3) {
            d(2);
            f(i2);
            if (this.f569l == null) {
                this.f569l = new f(view, i2);
            }
            BottomSheetBehavior<V>.f fVar = this.f569l;
            if (!fVar.f583f) {
                fVar.f584g = i2;
                m.a(view, (Runnable) fVar);
                this.f569l.f583f = true;
                return;
            }
            fVar.f584g = i2;
            return;
        }
        d(i2);
    }

    public void a(int i2) {
        float f2;
        float f3;
        View view = (View) this.D.get();
        if (view != null && !this.F.isEmpty()) {
            int i3 = this.r;
            if (i2 > i3 || i3 == d()) {
                int i4 = this.r;
                f2 = (float) (i4 - i2);
                f3 = (float) (this.C - i4);
            } else {
                int i5 = this.r;
                f2 = (float) (i5 - i2);
                f3 = (float) (i5 - d());
            }
            float f4 = f2 / f3;
            for (int i6 = 0; i6 < this.F.size(); i6++) {
                this.F.get(i6).a(view, f4);
            }
        }
    }

    public final void a(V v2, b.a aVar, int i2) {
        m.a(v2, aVar, (CharSequence) null, new c(i2));
    }
}
