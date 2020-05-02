package h.z.a;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.fragment.app.Fragment;
import b.a.a.a.t0;
import b.a.a.a.u0;
import b.a.a.a.y;
import b.a.a.a.z0;
import com.crashlytics.android.answers.AnswersRetryFilesSender;
import com.crashlytics.android.core.CodedOutputStream;
import h.h.m.m;
import h.h.m.v;
import h.l.d.a0;
import h.l.d.r;
import h.l.d.w;
import h.o.h;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: ViewPager */
public class b extends ViewGroup {
    public static final int[] f0 = {16842931};
    public static final Comparator<f> g0 = new a();
    public static final Interpolator h0 = new C0077b();
    public static final l i0 = new l();
    public int A = 1;
    public boolean B;
    public boolean C;
    public int D;
    public int E;
    public int F;
    public float G;
    public float H;
    public float I;
    public float J;
    public int K = -1;
    public VelocityTracker L;
    public int M;
    public int N;
    public int O;
    public int P;
    public boolean Q;
    public long R;
    public EdgeEffect S;
    public EdgeEffect T;
    public boolean U = true;
    public boolean V;
    public int W;
    public List<i> a0;
    public i b0;
    public ArrayList<View> c0;
    public final Runnable d0 = new c();
    public int e;
    public int e0 = 0;

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList<f> f2369f = new ArrayList<>();

    /* renamed from: g  reason: collision with root package name */
    public final f f2370g = new f();

    /* renamed from: h  reason: collision with root package name */
    public final Rect f2371h = new Rect();

    /* renamed from: i  reason: collision with root package name */
    public a f2372i;

    /* renamed from: j  reason: collision with root package name */
    public int f2373j;

    /* renamed from: k  reason: collision with root package name */
    public int f2374k = -1;

    /* renamed from: l  reason: collision with root package name */
    public Parcelable f2375l = null;

    /* renamed from: m  reason: collision with root package name */
    public ClassLoader f2376m = null;

    /* renamed from: n  reason: collision with root package name */
    public Scroller f2377n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f2378o;

    /* renamed from: p  reason: collision with root package name */
    public j f2379p;

    /* renamed from: q  reason: collision with root package name */
    public int f2380q;
    public Drawable r;
    public int s;
    public int t;
    public float u = -3.4028235E38f;
    public float v = Float.MAX_VALUE;
    public int w;
    public boolean x;
    public boolean y;
    public boolean z;

    /* compiled from: ViewPager */
    public static class a implements Comparator<f> {
        public int compare(Object obj, Object obj2) {
            return ((f) obj).f2382b - ((f) obj2).f2382b;
        }
    }

    /* renamed from: h.z.a.b$b  reason: collision with other inner class name */
    /* compiled from: ViewPager */
    public static class C0077b implements Interpolator {
        public float getInterpolation(float f2) {
            float f3 = f2 - 1.0f;
            return (f3 * f3 * f3 * f3 * f3) + 1.0f;
        }
    }

    /* compiled from: ViewPager */
    public class c implements Runnable {
        public c() {
        }

        public void run() {
            b.this.setScrollState(0);
            b bVar = b.this;
            bVar.e(bVar.f2373j);
        }
    }

    /* compiled from: ViewPager */
    public class d implements h.h.m.k {
        public final Rect a = new Rect();

        public d() {
        }

        public v a(View view, v vVar) {
            v a2 = m.a(view, vVar);
            if (a2.e()) {
                return a2;
            }
            Rect rect = this.a;
            rect.left = a2.b();
            rect.top = a2.d();
            rect.right = a2.c();
            rect.bottom = a2.a();
            int childCount = b.this.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = b.this.getChildAt(i2);
                WindowInsets windowInsets = (WindowInsets) a2.a;
                WindowInsets dispatchApplyWindowInsets = childAt.dispatchApplyWindowInsets(windowInsets);
                if (!dispatchApplyWindowInsets.equals(windowInsets)) {
                    windowInsets = new WindowInsets(dispatchApplyWindowInsets);
                }
                v a3 = v.a(windowInsets);
                rect.left = Math.min(a3.b(), rect.left);
                rect.top = Math.min(a3.d(), rect.top);
                rect.right = Math.min(a3.c(), rect.right);
                rect.bottom = Math.min(a3.a(), rect.bottom);
            }
            return new v(((WindowInsets) a2.a).replaceSystemWindowInsets(rect.left, rect.top, rect.right, rect.bottom));
        }
    }

    @Inherited
    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    /* compiled from: ViewPager */
    public @interface e {
    }

    /* compiled from: ViewPager */
    public static class f {
        public Object a;

        /* renamed from: b  reason: collision with root package name */
        public int f2382b;
        public boolean c;
        public float d;
        public float e;
    }

    /* compiled from: ViewPager */
    public interface i {
        void a(int i2);

        void a(int i2, float f2, int i3);

        void b(int i2);
    }

    /* compiled from: ViewPager */
    public class j extends DataSetObserver {
        public j() {
        }

        public void onChanged() {
            b.this.a();
        }

        public void onInvalidated() {
            b.this.a();
        }
    }

    /* compiled from: ViewPager */
    public static class k extends h.j.a.a {
        public static final Parcelable.Creator<k> CREATOR = new a();

        /* renamed from: g  reason: collision with root package name */
        public int f2385g;

        /* renamed from: h  reason: collision with root package name */
        public Parcelable f2386h;

        /* renamed from: i  reason: collision with root package name */
        public ClassLoader f2387i;

        /* compiled from: ViewPager */
        public static class a implements Parcelable.ClassLoaderCreator<k> {
            public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new k(parcel, classLoader);
            }

            public Object[] newArray(int i2) {
                return new k[i2];
            }

            public Object createFromParcel(Parcel parcel) {
                return new k(parcel, (ClassLoader) null);
            }
        }

        public k(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder a2 = i.a.a.a.a.a("FragmentPager.SavedState{");
            a2.append(Integer.toHexString(System.identityHashCode(this)));
            a2.append(" position=");
            a2.append(this.f2385g);
            a2.append("}");
            return a2.toString();
        }

        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeParcelable(this.e, i2);
            parcel.writeInt(this.f2385g);
            parcel.writeParcelable(this.f2386h, i2);
        }

        public k(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? k.class.getClassLoader() : classLoader;
            this.f2385g = parcel.readInt();
            this.f2386h = parcel.readParcelable(classLoader);
            this.f2387i = classLoader;
        }
    }

    /* compiled from: ViewPager */
    public static class l implements Comparator<View> {
        public int compare(Object obj, Object obj2) {
            g gVar = (g) ((View) obj).getLayoutParams();
            g gVar2 = (g) ((View) obj2).getLayoutParams();
            boolean z = gVar.a;
            if (z != gVar2.a) {
                return z ? 1 : -1;
            }
            return gVar.e - gVar2.e;
        }
    }

    public b(Context context) {
        super(context);
        d();
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean z2) {
        if (this.y != z2) {
            this.y = z2;
        }
    }

    public void a(int i2, boolean z2, boolean z3, int i3) {
        a aVar = this.f2372i;
        boolean z4 = false;
        if (aVar == null) {
            setScrollingCacheEnabled(false);
        } else if (((t0) aVar) == null) {
            throw null;
        } else if (z3 || this.f2373j != i2 || this.f2369f.size() == 0) {
            if (i2 < 0) {
                i2 = 0;
            } else {
                a aVar2 = this.f2372i;
                if (((t0) aVar2) == null) {
                    throw null;
                } else if (i2 >= 4) {
                    if (((t0) aVar2) != null) {
                        i2 = 3;
                    } else {
                        throw null;
                    }
                }
            }
            int i4 = this.A;
            int i5 = this.f2373j;
            if (i2 > i5 + i4 || i2 < i5 - i4) {
                for (int i6 = 0; i6 < this.f2369f.size(); i6++) {
                    this.f2369f.get(i6).c = true;
                }
            }
            if (this.f2373j != i2) {
                z4 = true;
            }
            if (this.U) {
                this.f2373j = i2;
                if (z4) {
                    b(i2);
                }
                requestLayout();
                return;
            }
            e(i2);
            a(i2, z2, i3, z4);
        } else {
            setScrollingCacheEnabled(false);
        }
    }

    public void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        f a2;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                View childAt = getChildAt(i4);
                if (childAt.getVisibility() == 0 && (a2 = a(childAt)) != null && a2.f2382b == this.f2373j) {
                    childAt.addFocusables(arrayList, i2, i3);
                }
            }
        }
        if ((descendantFocusability == 262144 && size != arrayList.size()) || !isFocusable()) {
            return;
        }
        if ((i3 & 1) != 1 || !isInTouchMode() || isFocusableInTouchMode()) {
            arrayList.add(this);
        }
    }

    public void addTouchables(ArrayList<View> arrayList) {
        f a2;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (a2 = a(childAt)) != null && a2.f2382b == this.f2373j) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = new g();
        }
        g gVar = (g) layoutParams;
        boolean z2 = gVar.a | (view.getClass().getAnnotation(e.class) != null);
        gVar.a = z2;
        if (!this.x) {
            super.addView(view, i2, layoutParams);
        } else if (!z2) {
            gVar.d = true;
            addViewInLayout(view, i2, layoutParams);
        } else {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
    }

    public final void b(int i2) {
        i iVar = this.b0;
        if (iVar != null) {
            iVar.b(i2);
        }
        List<i> list = this.a0;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                i iVar2 = this.a0.get(i3);
                if (iVar2 != null) {
                    iVar2.b(i2);
                }
            }
        }
    }

    public f c(int i2) {
        for (int i3 = 0; i3 < this.f2369f.size(); i3++) {
            f fVar = this.f2369f.get(i3);
            if (fVar.f2382b == i2) {
                return fVar;
            }
        }
        return null;
    }

    public boolean canScrollHorizontally(int i2) {
        if (this.f2372i == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i2 < 0) {
            if (scrollX > ((int) (((float) clientWidth) * this.u))) {
                return true;
            }
            return false;
        } else if (i2 <= 0 || scrollX >= ((int) (((float) clientWidth) * this.v))) {
            return false;
        } else {
            return true;
        }
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof g) && super.checkLayoutParams(layoutParams);
    }

    public void computeScroll() {
        this.f2378o = true;
        if (this.f2377n.isFinished() || !this.f2377n.computeScrollOffset()) {
            a(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f2377n.getCurrX();
        int currY = this.f2377n.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            if (!d(currX)) {
                this.f2377n.abortAnimation();
                scrollTo(0, currY);
            }
        }
        m.B(this);
    }

    public void d() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.f2377n = new Scroller(context, h0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.F = viewConfiguration.getScaledPagingTouchSlop();
        this.M = (int) (400.0f * f2);
        this.N = viewConfiguration.getScaledMaximumFlingVelocity();
        this.S = new EdgeEffect(context);
        this.T = new EdgeEffect(context);
        this.O = (int) (25.0f * f2);
        this.P = (int) (2.0f * f2);
        this.D = (int) (f2 * 16.0f);
        m.a((View) this, (h.h.m.a) new h());
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        m.a((View) this, (h.h.m.k) new d());
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchKeyEvent(android.view.KeyEvent r6) {
        /*
            r5 = this;
            boolean r0 = super.dispatchKeyEvent(r6)
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x005d
            int r0 = r6.getAction()
            if (r0 != 0) goto L_0x005a
            int r0 = r6.getKeyCode()
            r3 = 21
            r4 = 2
            if (r0 == r3) goto L_0x0048
            r3 = 22
            if (r0 == r3) goto L_0x0036
            r3 = 61
            if (r0 == r3) goto L_0x0020
            goto L_0x005a
        L_0x0020:
            boolean r0 = r6.hasNoModifiers()
            if (r0 == 0) goto L_0x002b
            boolean r6 = r5.a((int) r4)
            goto L_0x005b
        L_0x002b:
            boolean r6 = r6.hasModifiers(r2)
            if (r6 == 0) goto L_0x005a
            boolean r6 = r5.a((int) r2)
            goto L_0x005b
        L_0x0036:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L_0x0041
            boolean r6 = r5.f()
            goto L_0x005b
        L_0x0041:
            r6 = 66
            boolean r6 = r5.a((int) r6)
            goto L_0x005b
        L_0x0048:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L_0x0053
            boolean r6 = r5.e()
            goto L_0x005b
        L_0x0053:
            r6 = 17
            boolean r6 = r5.a((int) r6)
            goto L_0x005b
        L_0x005a:
            r6 = 0
        L_0x005b:
            if (r6 == 0) goto L_0x005e
        L_0x005d:
            r1 = 1
        L_0x005e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: h.z.a.b.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        f a2;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (a2 = a(childAt)) != null && a2.f2382b == this.f2373j && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void draw(android.graphics.Canvas r8) {
        /*
            r7 = this;
            super.draw(r8)
            int r0 = r7.getOverScrollMode()
            r1 = 0
            if (r0 == 0) goto L_0x0024
            r2 = 1
            if (r0 != r2) goto L_0x0018
            h.z.a.a r0 = r7.f2372i
            if (r0 == 0) goto L_0x0018
            b.a.a.a.t0 r0 = (b.a.a.a.t0) r0
            if (r0 == 0) goto L_0x0016
            goto L_0x0024
        L_0x0016:
            r8 = 0
            throw r8
        L_0x0018:
            android.widget.EdgeEffect r8 = r7.S
            r8.finish()
            android.widget.EdgeEffect r8 = r7.T
            r8.finish()
            goto L_0x00a9
        L_0x0024:
            android.widget.EdgeEffect r0 = r7.S
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x0065
            int r0 = r8.save()
            int r2 = r7.getHeight()
            int r3 = r7.getPaddingTop()
            int r2 = r2 - r3
            int r3 = r7.getPaddingBottom()
            int r2 = r2 - r3
            int r3 = r7.getWidth()
            r4 = 1132920832(0x43870000, float:270.0)
            r8.rotate(r4)
            int r4 = -r2
            int r5 = r7.getPaddingTop()
            int r5 = r5 + r4
            float r4 = (float) r5
            float r5 = r7.u
            float r6 = (float) r3
            float r5 = r5 * r6
            r8.translate(r4, r5)
            android.widget.EdgeEffect r4 = r7.S
            r4.setSize(r2, r3)
            android.widget.EdgeEffect r2 = r7.S
            boolean r2 = r2.draw(r8)
            r1 = r1 | r2
            r8.restoreToCount(r0)
        L_0x0065:
            android.widget.EdgeEffect r0 = r7.T
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x00a9
            int r0 = r8.save()
            int r2 = r7.getWidth()
            int r3 = r7.getHeight()
            int r4 = r7.getPaddingTop()
            int r3 = r3 - r4
            int r4 = r7.getPaddingBottom()
            int r3 = r3 - r4
            r4 = 1119092736(0x42b40000, float:90.0)
            r8.rotate(r4)
            int r4 = r7.getPaddingTop()
            int r4 = -r4
            float r4 = (float) r4
            float r5 = r7.v
            r6 = 1065353216(0x3f800000, float:1.0)
            float r5 = r5 + r6
            float r5 = -r5
            float r6 = (float) r2
            float r5 = r5 * r6
            r8.translate(r4, r5)
            android.widget.EdgeEffect r4 = r7.T
            r4.setSize(r3, r2)
            android.widget.EdgeEffect r2 = r7.T
            boolean r2 = r2.draw(r8)
            r1 = r1 | r2
            r8.restoreToCount(r0)
        L_0x00a9:
            if (r1 == 0) goto L_0x00ae
            h.h.m.m.B(r7)
        L_0x00ae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h.z.a.b.draw(android.graphics.Canvas):void");
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.r;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0276, code lost:
        r5 = r5 - (r6.d + r3);
        r6.e = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x027c, code lost:
        if (r10 != 0) goto L_0x0280;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x027e, code lost:
        r0.u = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0280, code lost:
        r7 = r7 - 1;
        r9 = r9 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x02a9, code lost:
        if (r9 != 3) goto L_0x02b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x02ab, code lost:
        r0.v = (r7.d + r5) - 1.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x02b1, code lost:
        r7.e = r5;
        r5 = r5 + (r7.d + r3);
        r4 = r4 + 1;
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005a, code lost:
        if (r9 == r10) goto L_0x0061;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void e(int r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r0.f2373j
            if (r2 == r1) goto L_0x000f
            h.z.a.b$f r2 = r0.c(r2)
            r0.f2373j = r1
            goto L_0x0010
        L_0x000f:
            r2 = 0
        L_0x0010:
            h.z.a.a r1 = r0.f2372i
            if (r1 != 0) goto L_0x0015
            return
        L_0x0015:
            boolean r1 = r0.z
            if (r1 == 0) goto L_0x001a
            return
        L_0x001a:
            android.os.IBinder r1 = r17.getWindowToken()
            if (r1 != 0) goto L_0x0021
            return
        L_0x0021:
            h.z.a.a r1 = r0.f2372i
            r1.b(r0)
            int r1 = r0.A
            int r4 = r0.f2373j
            int r4 = r4 - r1
            r5 = 0
            int r4 = java.lang.Math.max(r5, r4)
            h.z.a.a r6 = r0.f2372i
            b.a.a.a.t0 r6 = (b.a.a.a.t0) r6
            if (r6 == 0) goto L_0x03fa
            r6 = 4
            int r7 = r0.f2373j
            int r7 = r7 + r1
            r1 = 3
            int r1 = java.lang.Math.min(r1, r7)
            int r7 = r0.e
            if (r6 != r7) goto L_0x03a6
            r7 = 0
        L_0x0044:
            java.util.ArrayList<h.z.a.b$f> r8 = r0.f2369f
            int r8 = r8.size()
            if (r7 >= r8) goto L_0x0060
            java.util.ArrayList<h.z.a.b$f> r8 = r0.f2369f
            java.lang.Object r8 = r8.get(r7)
            h.z.a.b$f r8 = (h.z.a.b.f) r8
            int r9 = r8.f2382b
            int r10 = r0.f2373j
            if (r9 < r10) goto L_0x005d
            if (r9 != r10) goto L_0x0060
            goto L_0x0061
        L_0x005d:
            int r7 = r7 + 1
            goto L_0x0044
        L_0x0060:
            r8 = 0
        L_0x0061:
            if (r8 != 0) goto L_0x0069
            int r8 = r0.f2373j
            h.z.a.b$f r8 = r0.a((int) r8, (int) r7)
        L_0x0069:
            if (r8 == 0) goto L_0x0325
            int r5 = r7 + -1
            if (r5 < 0) goto L_0x0078
            java.util.ArrayList<h.z.a.b$f> r9 = r0.f2369f
            java.lang.Object r9 = r9.get(r5)
            h.z.a.b$f r9 = (h.z.a.b.f) r9
            goto L_0x0079
        L_0x0078:
            r9 = 0
        L_0x0079:
            int r10 = r17.getClientWidth()
            r11 = 1073741824(0x40000000, float:2.0)
            if (r10 > 0) goto L_0x0083
            r12 = 0
            goto L_0x008f
        L_0x0083:
            float r12 = r8.d
            float r12 = r11 - r12
            int r13 = r17.getPaddingLeft()
            float r13 = (float) r13
            float r14 = (float) r10
            float r13 = r13 / r14
            float r12 = r12 + r13
        L_0x008f:
            int r13 = r0.f2373j
            r14 = 1
            int r13 = r13 - r14
            r15 = 0
        L_0x0094:
            if (r13 < 0) goto L_0x00f3
            int r16 = (r15 > r12 ? 1 : (r15 == r12 ? 0 : -1))
            if (r16 < 0) goto L_0x00c2
            if (r13 >= r4) goto L_0x00c2
            if (r9 != 0) goto L_0x009f
            goto L_0x00f3
        L_0x009f:
            int r3 = r9.f2382b
            if (r13 != r3) goto L_0x00f0
            boolean r3 = r9.c
            if (r3 != 0) goto L_0x00f0
            java.util.ArrayList<h.z.a.b$f> r3 = r0.f2369f
            r3.remove(r5)
            h.z.a.a r3 = r0.f2372i
            java.lang.Object r9 = r9.a
            r3.a(r0, r13, r9)
            int r5 = r5 + -1
            int r7 = r7 + -1
            if (r5 < 0) goto L_0x00ee
            java.util.ArrayList<h.z.a.b$f> r3 = r0.f2369f
            java.lang.Object r3 = r3.get(r5)
            h.z.a.b$f r3 = (h.z.a.b.f) r3
            goto L_0x00ef
        L_0x00c2:
            if (r9 == 0) goto L_0x00d8
            int r3 = r9.f2382b
            if (r13 != r3) goto L_0x00d8
            float r3 = r9.d
            float r15 = r15 + r3
            int r5 = r5 + -1
            if (r5 < 0) goto L_0x00ee
            java.util.ArrayList<h.z.a.b$f> r3 = r0.f2369f
            java.lang.Object r3 = r3.get(r5)
            h.z.a.b$f r3 = (h.z.a.b.f) r3
            goto L_0x00ef
        L_0x00d8:
            int r3 = r5 + 1
            h.z.a.b$f r3 = r0.a((int) r13, (int) r3)
            float r3 = r3.d
            float r15 = r15 + r3
            int r7 = r7 + 1
            if (r5 < 0) goto L_0x00ee
            java.util.ArrayList<h.z.a.b$f> r3 = r0.f2369f
            java.lang.Object r3 = r3.get(r5)
            h.z.a.b$f r3 = (h.z.a.b.f) r3
            goto L_0x00ef
        L_0x00ee:
            r3 = 0
        L_0x00ef:
            r9 = r3
        L_0x00f0:
            int r13 = r13 + -1
            goto L_0x0094
        L_0x00f3:
            float r3 = r8.d
            int r4 = r7 + 1
            int r5 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r5 >= 0) goto L_0x0187
            java.util.ArrayList<h.z.a.b$f> r5 = r0.f2369f
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x010c
            java.util.ArrayList<h.z.a.b$f> r5 = r0.f2369f
            java.lang.Object r5 = r5.get(r4)
            h.z.a.b$f r5 = (h.z.a.b.f) r5
            goto L_0x010d
        L_0x010c:
            r5 = 0
        L_0x010d:
            if (r10 > 0) goto L_0x0111
            r9 = 0
            goto L_0x0119
        L_0x0111:
            int r9 = r17.getPaddingRight()
            float r9 = (float) r9
            float r10 = (float) r10
            float r9 = r9 / r10
            float r9 = r9 + r11
        L_0x0119:
            int r10 = r0.f2373j
            int r10 = r10 + r14
            r11 = r4
        L_0x011d:
            if (r10 >= r6) goto L_0x0187
            int r12 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r12 < 0) goto L_0x014d
            if (r10 <= r1) goto L_0x014d
            if (r5 != 0) goto L_0x0128
            goto L_0x0187
        L_0x0128:
            int r12 = r5.f2382b
            if (r10 != r12) goto L_0x0184
            boolean r12 = r5.c
            if (r12 != 0) goto L_0x0184
            java.util.ArrayList<h.z.a.b$f> r12 = r0.f2369f
            r12.remove(r11)
            h.z.a.a r12 = r0.f2372i
            java.lang.Object r5 = r5.a
            r12.a(r0, r10, r5)
            java.util.ArrayList<h.z.a.b$f> r5 = r0.f2369f
            int r5 = r5.size()
            if (r11 >= r5) goto L_0x0183
            java.util.ArrayList<h.z.a.b$f> r5 = r0.f2369f
            java.lang.Object r5 = r5.get(r11)
            h.z.a.b$f r5 = (h.z.a.b.f) r5
            goto L_0x0184
        L_0x014d:
            if (r5 == 0) goto L_0x0169
            int r12 = r5.f2382b
            if (r10 != r12) goto L_0x0169
            float r5 = r5.d
            float r3 = r3 + r5
            int r11 = r11 + 1
            java.util.ArrayList<h.z.a.b$f> r5 = r0.f2369f
            int r5 = r5.size()
            if (r11 >= r5) goto L_0x0183
            java.util.ArrayList<h.z.a.b$f> r5 = r0.f2369f
            java.lang.Object r5 = r5.get(r11)
            h.z.a.b$f r5 = (h.z.a.b.f) r5
            goto L_0x0184
        L_0x0169:
            h.z.a.b$f r5 = r0.a((int) r10, (int) r11)
            int r11 = r11 + 1
            float r5 = r5.d
            float r3 = r3 + r5
            java.util.ArrayList<h.z.a.b$f> r5 = r0.f2369f
            int r5 = r5.size()
            if (r11 >= r5) goto L_0x0183
            java.util.ArrayList<h.z.a.b$f> r5 = r0.f2369f
            java.lang.Object r5 = r5.get(r11)
            h.z.a.b$f r5 = (h.z.a.b.f) r5
            goto L_0x0184
        L_0x0183:
            r5 = 0
        L_0x0184:
            int r10 = r10 + 1
            goto L_0x011d
        L_0x0187:
            h.z.a.a r1 = r0.f2372i
            b.a.a.a.t0 r1 = (b.a.a.a.t0) r1
            if (r1 == 0) goto L_0x0323
            int r1 = r17.getClientWidth()
            if (r1 <= 0) goto L_0x0199
            int r3 = r0.f2380q
            float r3 = (float) r3
            float r1 = (float) r1
            float r3 = r3 / r1
            goto L_0x019a
        L_0x0199:
            r3 = 0
        L_0x019a:
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r2 == 0) goto L_0x0234
            int r5 = r2.f2382b
            int r6 = r8.f2382b
            if (r5 >= r6) goto L_0x01f0
            float r6 = r2.e
            float r2 = r2.d
            float r6 = r6 + r2
            float r6 = r6 + r3
            r2 = 0
        L_0x01ab:
            int r5 = r5 + r14
            int r9 = r8.f2382b
            if (r5 > r9) goto L_0x0234
            java.util.ArrayList<h.z.a.b$f> r9 = r0.f2369f
            int r9 = r9.size()
            if (r2 >= r9) goto L_0x0234
            java.util.ArrayList<h.z.a.b$f> r9 = r0.f2369f
            java.lang.Object r9 = r9.get(r2)
            h.z.a.b$f r9 = (h.z.a.b.f) r9
        L_0x01c0:
            int r10 = r9.f2382b
            if (r5 <= r10) goto L_0x01d9
            java.util.ArrayList<h.z.a.b$f> r10 = r0.f2369f
            int r10 = r10.size()
            int r10 = r10 + -1
            if (r2 >= r10) goto L_0x01d9
            int r2 = r2 + 1
            java.util.ArrayList<h.z.a.b$f> r9 = r0.f2369f
            java.lang.Object r9 = r9.get(r2)
            h.z.a.b$f r9 = (h.z.a.b.f) r9
            goto L_0x01c0
        L_0x01d9:
            int r10 = r9.f2382b
            if (r5 >= r10) goto L_0x01e9
            h.z.a.a r10 = r0.f2372i
            if (r10 == 0) goto L_0x01e7
            float r10 = r1 + r3
            float r6 = r6 + r10
            int r5 = r5 + 1
            goto L_0x01d9
        L_0x01e7:
            r5 = 0
            throw r5
        L_0x01e9:
            r9.e = r6
            float r9 = r9.d
            float r9 = r9 + r3
            float r6 = r6 + r9
            goto L_0x01ab
        L_0x01f0:
            if (r5 <= r6) goto L_0x0234
            java.util.ArrayList<h.z.a.b$f> r6 = r0.f2369f
            int r6 = r6.size()
            int r6 = r6 + -1
            float r2 = r2.e
        L_0x01fc:
            int r5 = r5 + -1
            int r9 = r8.f2382b
            if (r5 < r9) goto L_0x0234
            if (r6 < 0) goto L_0x0234
            java.util.ArrayList<h.z.a.b$f> r9 = r0.f2369f
            java.lang.Object r9 = r9.get(r6)
            h.z.a.b$f r9 = (h.z.a.b.f) r9
        L_0x020c:
            int r10 = r9.f2382b
            if (r5 >= r10) goto L_0x021d
            if (r6 <= 0) goto L_0x021d
            int r6 = r6 + -1
            java.util.ArrayList<h.z.a.b$f> r9 = r0.f2369f
            java.lang.Object r9 = r9.get(r6)
            h.z.a.b$f r9 = (h.z.a.b.f) r9
            goto L_0x020c
        L_0x021d:
            int r10 = r9.f2382b
            if (r5 <= r10) goto L_0x022d
            h.z.a.a r10 = r0.f2372i
            if (r10 == 0) goto L_0x022b
            float r10 = r1 + r3
            float r2 = r2 - r10
            int r5 = r5 + -1
            goto L_0x021d
        L_0x022b:
            r2 = 0
            throw r2
        L_0x022d:
            float r10 = r9.d
            float r10 = r10 + r3
            float r2 = r2 - r10
            r9.e = r2
            goto L_0x01fc
        L_0x0234:
            java.util.ArrayList<h.z.a.b$f> r2 = r0.f2369f
            int r2 = r2.size()
            float r5 = r8.e
            int r6 = r8.f2382b
            int r9 = r6 + -1
            if (r6 != 0) goto L_0x0244
            r6 = r5
            goto L_0x0247
        L_0x0244:
            r6 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
        L_0x0247:
            r0.u = r6
            int r6 = r8.f2382b
            r10 = 3
            if (r6 != r10) goto L_0x0255
            float r6 = r8.e
            float r10 = r8.d
            float r6 = r6 + r10
            float r6 = r6 - r1
            goto L_0x0258
        L_0x0255:
            r6 = 2139095039(0x7f7fffff, float:3.4028235E38)
        L_0x0258:
            r0.v = r6
            int r7 = r7 + -1
        L_0x025c:
            if (r7 < 0) goto L_0x0285
            java.util.ArrayList<h.z.a.b$f> r6 = r0.f2369f
            java.lang.Object r6 = r6.get(r7)
            h.z.a.b$f r6 = (h.z.a.b.f) r6
        L_0x0266:
            int r10 = r6.f2382b
            if (r9 <= r10) goto L_0x0276
            h.z.a.a r10 = r0.f2372i
            int r9 = r9 + -1
            if (r10 == 0) goto L_0x0274
            float r10 = r1 + r3
            float r5 = r5 - r10
            goto L_0x0266
        L_0x0274:
            r5 = 0
            throw r5
        L_0x0276:
            float r11 = r6.d
            float r11 = r11 + r3
            float r5 = r5 - r11
            r6.e = r5
            if (r10 != 0) goto L_0x0280
            r0.u = r5
        L_0x0280:
            int r7 = r7 + -1
            int r9 = r9 + -1
            goto L_0x025c
        L_0x0285:
            float r5 = r8.e
            float r6 = r8.d
            float r5 = r5 + r6
            float r5 = r5 + r3
            int r6 = r8.f2382b
            int r6 = r6 + r14
        L_0x028e:
            if (r4 >= r2) goto L_0x02bc
            java.util.ArrayList<h.z.a.b$f> r7 = r0.f2369f
            java.lang.Object r7 = r7.get(r4)
            h.z.a.b$f r7 = (h.z.a.b.f) r7
        L_0x0298:
            int r9 = r7.f2382b
            if (r6 >= r9) goto L_0x02a8
            h.z.a.a r9 = r0.f2372i
            int r6 = r6 + 1
            if (r9 == 0) goto L_0x02a6
            float r9 = r1 + r3
            float r5 = r5 + r9
            goto L_0x0298
        L_0x02a6:
            r5 = 0
            throw r5
        L_0x02a8:
            r10 = 3
            if (r9 != r10) goto L_0x02b1
            float r9 = r7.d
            float r9 = r9 + r5
            float r9 = r9 - r1
            r0.v = r9
        L_0x02b1:
            r7.e = r5
            float r7 = r7.d
            float r7 = r7 + r3
            float r5 = r5 + r7
            int r4 = r4 + 1
            int r6 = r6 + 1
            goto L_0x028e
        L_0x02bc:
            h.z.a.a r1 = r0.f2372i
            java.lang.Object r2 = r8.a
            h.l.d.w r1 = (h.l.d.w) r1
            if (r1 == 0) goto L_0x0321
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            androidx.fragment.app.Fragment r3 = r1.f2030f
            r5 = 0
            if (r2 == r3) goto L_0x0325
            if (r3 == 0) goto L_0x02f8
            r3.b((boolean) r5)
            int r3 = r1.d
            if (r3 != r14) goto L_0x02f1
            h.l.d.a0 r3 = r1.e
            if (r3 != 0) goto L_0x02e6
            h.l.d.r r3 = r1.c
            if (r3 == 0) goto L_0x02e4
            h.l.d.a r4 = new h.l.d.a
            r4.<init>(r3)
            r1.e = r4
            goto L_0x02e6
        L_0x02e4:
            r3 = 0
            throw r3
        L_0x02e6:
            h.l.d.a0 r3 = r1.e
            androidx.fragment.app.Fragment r4 = r1.f2030f
            h.o.h$b r5 = h.o.h.b.STARTED
            r3.a(r4, r5)
            r3 = 0
            goto L_0x02f7
        L_0x02f1:
            androidx.fragment.app.Fragment r3 = r1.f2030f
            r4 = 0
            r3.c((boolean) r4)
        L_0x02f7:
            r5 = 0
        L_0x02f8:
            r2.b((boolean) r14)
            int r3 = r1.d
            if (r3 != r14) goto L_0x031a
            h.l.d.a0 r3 = r1.e
            if (r3 != 0) goto L_0x0311
            h.l.d.r r3 = r1.c
            if (r3 == 0) goto L_0x030f
            h.l.d.a r4 = new h.l.d.a
            r4.<init>(r3)
            r1.e = r4
            goto L_0x0311
        L_0x030f:
            r3 = 0
            throw r3
        L_0x0311:
            r3 = 0
            h.l.d.a0 r4 = r1.e
            h.o.h$b r6 = h.o.h.b.RESUMED
            r4.a(r2, r6)
            goto L_0x031e
        L_0x031a:
            r3 = 0
            r2.c((boolean) r14)
        L_0x031e:
            r1.f2030f = r2
            goto L_0x0325
        L_0x0321:
            r3 = 0
            throw r3
        L_0x0323:
            r3 = 0
            throw r3
        L_0x0325:
            h.z.a.a r1 = r0.f2372i
            r1.a((android.view.ViewGroup) r0)
            int r1 = r17.getChildCount()
            r2 = 0
        L_0x032f:
            if (r2 >= r1) goto L_0x0359
            android.view.View r3 = r0.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            h.z.a.b$g r4 = (h.z.a.b.g) r4
            r4.f2384f = r2
            boolean r6 = r4.a
            if (r6 != 0) goto L_0x0356
            float r6 = r4.c
            r7 = 0
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 != 0) goto L_0x0356
            h.z.a.b$f r3 = r0.a((android.view.View) r3)
            if (r3 == 0) goto L_0x0356
            float r6 = r3.d
            r4.c = r6
            int r3 = r3.f2382b
            r4.e = r3
        L_0x0356:
            int r2 = r2 + 1
            goto L_0x032f
        L_0x0359:
            boolean r1 = r17.hasFocus()
            if (r1 == 0) goto L_0x03a5
            android.view.View r1 = r17.findFocus()
            if (r1 == 0) goto L_0x037b
        L_0x0365:
            android.view.ViewParent r2 = r1.getParent()
            if (r2 == r0) goto L_0x0376
            if (r2 == 0) goto L_0x037b
            boolean r1 = r2 instanceof android.view.View
            if (r1 != 0) goto L_0x0372
            goto L_0x037b
        L_0x0372:
            r1 = r2
            android.view.View r1 = (android.view.View) r1
            goto L_0x0365
        L_0x0376:
            h.z.a.b$f r3 = r0.a((android.view.View) r1)
            goto L_0x037c
        L_0x037b:
            r3 = 0
        L_0x037c:
            if (r3 == 0) goto L_0x0384
            int r1 = r3.f2382b
            int r2 = r0.f2373j
            if (r1 == r2) goto L_0x03a5
        L_0x0384:
            int r1 = r17.getChildCount()
            if (r5 >= r1) goto L_0x03a5
            android.view.View r1 = r0.getChildAt(r5)
            h.z.a.b$f r2 = r0.a((android.view.View) r1)
            if (r2 == 0) goto L_0x03a2
            int r2 = r2.f2382b
            int r3 = r0.f2373j
            if (r2 != r3) goto L_0x03a2
            r2 = 2
            boolean r1 = r1.requestFocus(r2)
            if (r1 == 0) goto L_0x03a2
            goto L_0x03a5
        L_0x03a2:
            int r5 = r5 + 1
            goto L_0x0384
        L_0x03a5:
            return
        L_0x03a6:
            android.content.res.Resources r1 = r17.getResources()     // Catch:{ NotFoundException -> 0x03b3 }
            int r2 = r17.getId()     // Catch:{ NotFoundException -> 0x03b3 }
            java.lang.String r1 = r1.getResourceName(r2)     // Catch:{ NotFoundException -> 0x03b3 }
            goto L_0x03bb
        L_0x03b3:
            int r1 = r17.getId()
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
        L_0x03bb:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: "
            java.lang.StringBuilder r3 = i.a.a.a.a.a(r3)
            int r4 = r0.e
            r3.append(r4)
            java.lang.String r4 = ", found: "
            r3.append(r4)
            r3.append(r6)
            java.lang.String r4 = " Pager id: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = " Pager class: "
            r3.append(r1)
            java.lang.Class r1 = r17.getClass()
            r3.append(r1)
            java.lang.String r1 = " Problematic adapter: "
            r3.append(r1)
            h.z.a.a r1 = r0.f2372i
            java.lang.Class r1 = r1.getClass()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L_0x03fa:
            r1 = 0
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: h.z.a.b.e(int):void");
    }

    public boolean f() {
        a aVar = this.f2372i;
        if (aVar != null) {
            int i2 = this.f2373j;
            t0 t0Var = (t0) aVar;
            if (i2 < 3) {
                this.z = false;
                a(i2 + 1, true, false, 0);
                return true;
            }
        }
        return false;
    }

    public final boolean g() {
        this.K = -1;
        this.B = false;
        this.C = false;
        VelocityTracker velocityTracker = this.L;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.L = null;
        }
        this.S.onRelease();
        this.T.onRelease();
        if (this.S.isFinished() || this.T.isFinished()) {
            return true;
        }
        return false;
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new g();
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new g();
    }

    public a getAdapter() {
        return this.f2372i;
    }

    public int getChildDrawingOrder(int i2, int i3) {
        return ((g) this.c0.get(i3).getLayoutParams()).f2384f;
    }

    public int getCurrentItem() {
        return this.f2373j;
    }

    public int getOffscreenPageLimit() {
        return this.A;
    }

    public int getPageMargin() {
        return this.f2380q;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.U = true;
    }

    public void onDetachedFromWindow() {
        removeCallbacks(this.d0);
        Scroller scroller = this.f2377n;
        if (scroller != null && !scroller.isFinished()) {
            this.f2377n.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    public void onDraw(Canvas canvas) {
        float f2;
        float f3;
        super.onDraw(canvas);
        if (this.f2380q > 0 && this.r != null && this.f2369f.size() > 0 && this.f2372i != null) {
            int scrollX = getScrollX();
            int width = getWidth();
            float f4 = (float) width;
            float f5 = ((float) this.f2380q) / f4;
            int i2 = 0;
            f fVar = this.f2369f.get(0);
            float f6 = fVar.e;
            int size = this.f2369f.size();
            int i3 = fVar.f2382b;
            int i4 = this.f2369f.get(size - 1).f2382b;
            while (i3 < i4) {
                while (i3 > fVar.f2382b && i2 < size) {
                    i2++;
                    fVar = this.f2369f.get(i2);
                }
                if (i3 == fVar.f2382b) {
                    float f7 = fVar.e;
                    float f8 = fVar.d;
                    f2 = (f7 + f8) * f4;
                    f6 = f7 + f8 + f5;
                } else if (this.f2372i != null) {
                    f2 = (f6 + 1.0f) * f4;
                    f6 = 1.0f + f5 + f6;
                } else {
                    throw null;
                }
                if (((float) this.f2380q) + f2 > ((float) scrollX)) {
                    f3 = f5;
                    this.r.setBounds(Math.round(f2), this.s, Math.round(((float) this.f2380q) + f2), this.t);
                    this.r.draw(canvas);
                } else {
                    Canvas canvas2 = canvas;
                    f3 = f5;
                }
                if (f2 <= ((float) (scrollX + width))) {
                    i3++;
                    f5 = f3;
                } else {
                    return;
                }
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            g();
            return false;
        }
        if (action != 0) {
            if (this.B) {
                return true;
            }
            if (this.C) {
                return false;
            }
        }
        if (action == 0) {
            float x2 = motionEvent.getX();
            this.I = x2;
            this.G = x2;
            float y2 = motionEvent.getY();
            this.J = y2;
            this.H = y2;
            this.K = motionEvent2.getPointerId(0);
            this.C = false;
            this.f2378o = true;
            this.f2377n.computeScrollOffset();
            if (this.e0 != 2 || Math.abs(this.f2377n.getFinalX() - this.f2377n.getCurrX()) <= this.P) {
                a(false);
                this.B = false;
            } else {
                this.f2377n.abortAnimation();
                this.z = false;
                e(this.f2373j);
                this.B = true;
                b(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i2 = this.K;
            if (i2 != -1) {
                int findPointerIndex = motionEvent2.findPointerIndex(i2);
                float x3 = motionEvent2.getX(findPointerIndex);
                float f2 = x3 - this.G;
                float abs = Math.abs(f2);
                float y3 = motionEvent2.getY(findPointerIndex);
                float abs2 = Math.abs(y3 - this.J);
                int i3 = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
                if (i3 != 0) {
                    float f3 = this.G;
                    if (!((f3 < ((float) this.E) && i3 > 0) || (f3 > ((float) (getWidth() - this.E)) && f2 < 0.0f))) {
                        if (a(this, false, (int) f2, (int) x3, (int) y3)) {
                            this.G = x3;
                            this.H = y3;
                            this.C = true;
                            return false;
                        }
                    }
                }
                if (abs > ((float) this.F) && abs * 0.5f > abs2) {
                    this.B = true;
                    b(true);
                    setScrollState(1);
                    float f4 = this.I;
                    float f5 = (float) this.F;
                    this.G = i3 > 0 ? f4 + f5 : f4 - f5;
                    this.H = y3;
                    setScrollingCacheEnabled(true);
                } else if (abs2 > ((float) this.F)) {
                    this.C = true;
                }
                if (this.B && b(x3)) {
                    m.B(this);
                }
            }
        } else if (action == 6) {
            a(motionEvent);
        }
        if (this.L == null) {
            this.L = VelocityTracker.obtain();
        }
        this.L.addMovement(motionEvent2);
        return this.B;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            r18 = this;
            r0 = r18
            int r1 = r18.getChildCount()
            int r2 = r22 - r20
            int r3 = r23 - r21
            int r4 = r18.getPaddingLeft()
            int r5 = r18.getPaddingTop()
            int r6 = r18.getPaddingRight()
            int r7 = r18.getPaddingBottom()
            int r8 = r18.getScrollX()
            r10 = 0
            r11 = 0
        L_0x0020:
            r12 = 8
            if (r10 >= r1) goto L_0x00b6
            android.view.View r13 = r0.getChildAt(r10)
            int r14 = r13.getVisibility()
            if (r14 == r12) goto L_0x00b2
            android.view.ViewGroup$LayoutParams r12 = r13.getLayoutParams()
            h.z.a.b$g r12 = (h.z.a.b.g) r12
            boolean r14 = r12.a
            if (r14 == 0) goto L_0x00b2
            int r12 = r12.f2383b
            r14 = r12 & 7
            r12 = r12 & 112(0x70, float:1.57E-43)
            r15 = 1
            if (r14 == r15) goto L_0x005c
            r15 = 3
            if (r14 == r15) goto L_0x0056
            r15 = 5
            if (r14 == r15) goto L_0x0049
            r14 = r4
            goto L_0x006d
        L_0x0049:
            int r14 = r2 - r6
            int r15 = r13.getMeasuredWidth()
            int r14 = r14 - r15
            int r15 = r13.getMeasuredWidth()
            int r6 = r6 + r15
            goto L_0x0068
        L_0x0056:
            int r14 = r13.getMeasuredWidth()
            int r14 = r14 + r4
            goto L_0x006d
        L_0x005c:
            int r14 = r13.getMeasuredWidth()
            int r14 = r2 - r14
            int r14 = r14 / 2
            int r14 = java.lang.Math.max(r14, r4)
        L_0x0068:
            r17 = r14
            r14 = r4
            r4 = r17
        L_0x006d:
            r15 = 16
            if (r12 == r15) goto L_0x008e
            r15 = 48
            if (r12 == r15) goto L_0x0088
            r15 = 80
            if (r12 == r15) goto L_0x007b
            r12 = r5
            goto L_0x009f
        L_0x007b:
            int r12 = r3 - r7
            int r15 = r13.getMeasuredHeight()
            int r12 = r12 - r15
            int r15 = r13.getMeasuredHeight()
            int r7 = r7 + r15
            goto L_0x009a
        L_0x0088:
            int r12 = r13.getMeasuredHeight()
            int r12 = r12 + r5
            goto L_0x009f
        L_0x008e:
            int r12 = r13.getMeasuredHeight()
            int r12 = r3 - r12
            int r12 = r12 / 2
            int r12 = java.lang.Math.max(r12, r5)
        L_0x009a:
            r17 = r12
            r12 = r5
            r5 = r17
        L_0x009f:
            int r4 = r4 + r8
            int r15 = r13.getMeasuredWidth()
            int r15 = r15 + r4
            int r16 = r13.getMeasuredHeight()
            int r9 = r16 + r5
            r13.layout(r4, r5, r15, r9)
            int r11 = r11 + 1
            r5 = r12
            r4 = r14
        L_0x00b2:
            int r10 = r10 + 1
            goto L_0x0020
        L_0x00b6:
            int r2 = r2 - r4
            int r2 = r2 - r6
            r6 = 0
        L_0x00b9:
            if (r6 >= r1) goto L_0x0108
            android.view.View r8 = r0.getChildAt(r6)
            int r9 = r8.getVisibility()
            if (r9 == r12) goto L_0x0105
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            h.z.a.b$g r9 = (h.z.a.b.g) r9
            boolean r10 = r9.a
            if (r10 != 0) goto L_0x0105
            h.z.a.b$f r10 = r0.a((android.view.View) r8)
            if (r10 == 0) goto L_0x0105
            float r13 = (float) r2
            float r10 = r10.e
            float r10 = r10 * r13
            int r10 = (int) r10
            int r10 = r10 + r4
            boolean r14 = r9.d
            if (r14 == 0) goto L_0x00f8
            r14 = 0
            r9.d = r14
            float r9 = r9.c
            float r13 = r13 * r9
            int r9 = (int) r13
            r13 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r13)
            int r14 = r3 - r5
            int r14 = r14 - r7
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r13)
            r8.measure(r9, r13)
        L_0x00f8:
            int r9 = r8.getMeasuredWidth()
            int r9 = r9 + r10
            int r13 = r8.getMeasuredHeight()
            int r13 = r13 + r5
            r8.layout(r10, r5, r9, r13)
        L_0x0105:
            int r6 = r6 + 1
            goto L_0x00b9
        L_0x0108:
            r0.s = r5
            int r3 = r3 - r7
            r0.t = r3
            r0.W = r11
            boolean r1 = r0.U
            if (r1 == 0) goto L_0x011a
            int r1 = r0.f2373j
            r2 = 0
            r0.a((int) r1, (boolean) r2, (int) r2, (boolean) r2)
            goto L_0x011b
        L_0x011a:
            r2 = 0
        L_0x011b:
            r0.U = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h.z.a.b.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r14, int r15) {
        /*
            r13 = this;
            r0 = 0
            int r14 = android.view.ViewGroup.getDefaultSize(r0, r14)
            int r15 = android.view.ViewGroup.getDefaultSize(r0, r15)
            r13.setMeasuredDimension(r14, r15)
            int r14 = r13.getMeasuredWidth()
            int r15 = r14 / 10
            int r1 = r13.D
            int r15 = java.lang.Math.min(r15, r1)
            r13.E = r15
            int r15 = r13.getPaddingLeft()
            int r14 = r14 - r15
            int r15 = r13.getPaddingRight()
            int r14 = r14 - r15
            int r15 = r13.getMeasuredHeight()
            int r1 = r13.getPaddingTop()
            int r15 = r15 - r1
            int r1 = r13.getPaddingBottom()
            int r15 = r15 - r1
            int r1 = r13.getChildCount()
            r2 = 0
        L_0x0037:
            r3 = 8
            r4 = 1
            r5 = 1073741824(0x40000000, float:2.0)
            if (r2 >= r1) goto L_0x00b2
            android.view.View r6 = r13.getChildAt(r2)
            int r7 = r6.getVisibility()
            if (r7 == r3) goto L_0x00af
            android.view.ViewGroup$LayoutParams r3 = r6.getLayoutParams()
            h.z.a.b$g r3 = (h.z.a.b.g) r3
            if (r3 == 0) goto L_0x00af
            boolean r7 = r3.a
            if (r7 == 0) goto L_0x00af
            int r7 = r3.f2383b
            r8 = r7 & 7
            r7 = r7 & 112(0x70, float:1.57E-43)
            r9 = 48
            if (r7 == r9) goto L_0x0065
            r9 = 80
            if (r7 != r9) goto L_0x0063
            goto L_0x0065
        L_0x0063:
            r7 = 0
            goto L_0x0066
        L_0x0065:
            r7 = 1
        L_0x0066:
            r9 = 3
            if (r8 == r9) goto L_0x006e
            r9 = 5
            if (r8 != r9) goto L_0x006d
            goto L_0x006e
        L_0x006d:
            r4 = 0
        L_0x006e:
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r7 == 0) goto L_0x0075
            r8 = 1073741824(0x40000000, float:2.0)
            goto L_0x007a
        L_0x0075:
            if (r4 == 0) goto L_0x007a
            r9 = 1073741824(0x40000000, float:2.0)
            goto L_0x007c
        L_0x007a:
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x007c:
            int r10 = r3.width
            r11 = -1
            r12 = -2
            if (r10 == r12) goto L_0x0089
            if (r10 == r11) goto L_0x0085
            goto L_0x0086
        L_0x0085:
            r10 = r14
        L_0x0086:
            r8 = 1073741824(0x40000000, float:2.0)
            goto L_0x008a
        L_0x0089:
            r10 = r14
        L_0x008a:
            int r3 = r3.height
            if (r3 == r12) goto L_0x0093
            if (r3 == r11) goto L_0x0091
            goto L_0x0095
        L_0x0091:
            r3 = r15
            goto L_0x0095
        L_0x0093:
            r3 = r15
            r5 = r9
        L_0x0095:
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r8)
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r5)
            r6.measure(r8, r3)
            if (r7 == 0) goto L_0x00a8
            int r3 = r6.getMeasuredHeight()
            int r15 = r15 - r3
            goto L_0x00af
        L_0x00a8:
            if (r4 == 0) goto L_0x00af
            int r3 = r6.getMeasuredWidth()
            int r14 = r14 - r3
        L_0x00af:
            int r2 = r2 + 1
            goto L_0x0037
        L_0x00b2:
            android.view.View.MeasureSpec.makeMeasureSpec(r14, r5)
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r5)
            r13.w = r15
            r13.x = r4
            int r15 = r13.f2373j
            r13.e(r15)
            r13.x = r0
            int r15 = r13.getChildCount()
        L_0x00c8:
            if (r0 >= r15) goto L_0x00f2
            android.view.View r1 = r13.getChildAt(r0)
            int r2 = r1.getVisibility()
            if (r2 == r3) goto L_0x00ef
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            h.z.a.b$g r2 = (h.z.a.b.g) r2
            if (r2 == 0) goto L_0x00e0
            boolean r4 = r2.a
            if (r4 != 0) goto L_0x00ef
        L_0x00e0:
            float r4 = (float) r14
            float r2 = r2.c
            float r4 = r4 * r2
            int r2 = (int) r4
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r5)
            int r4 = r13.w
            r1.measure(r2, r4)
        L_0x00ef:
            int r0 = r0 + 1
            goto L_0x00c8
        L_0x00f2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h.z.a.b.onMeasure(int, int):void");
    }

    public boolean onRequestFocusInDescendants(int i2, Rect rect) {
        int i3;
        int i4;
        f a2;
        int childCount = getChildCount();
        int i5 = -1;
        if ((i2 & 2) != 0) {
            i5 = childCount;
            i4 = 0;
            i3 = 1;
        } else {
            i4 = childCount - 1;
            i3 = -1;
        }
        while (i4 != i5) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() == 0 && (a2 = a(childAt)) != null && a2.f2382b == this.f2373j && childAt.requestFocus(i2, rect)) {
                return true;
            }
            i4 += i3;
        }
        return false;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof k)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        k kVar = (k) parcelable;
        super.onRestoreInstanceState(kVar.e);
        a aVar = this.f2372i;
        if (aVar != null) {
            w wVar = (w) aVar;
            a(kVar.f2385g, false, true, 0);
            return;
        }
        this.f2374k = kVar.f2385g;
        this.f2375l = kVar.f2386h;
        this.f2376m = kVar.f2387i;
    }

    public Parcelable onSaveInstanceState() {
        k kVar = new k(super.onSaveInstanceState());
        kVar.f2385g = this.f2373j;
        a aVar = this.f2372i;
        if (aVar != null) {
            if (((w) aVar) != null) {
                kVar.f2386h = null;
            } else {
                throw null;
            }
        }
        return kVar;
    }

    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 != i4) {
            int i6 = this.f2380q;
            a(i2, i4, i6, i6);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        if (this.Q) {
            return true;
        }
        boolean z2 = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (aVar = this.f2372i) == null) {
            return false;
        }
        if (((t0) aVar) != null) {
            if (this.L == null) {
                this.L = VelocityTracker.obtain();
            }
            this.L.addMovement(motionEvent);
            int action = motionEvent.getAction() & 255;
            if (action == 0) {
                this.f2377n.abortAnimation();
                this.z = false;
                e(this.f2373j);
                float x2 = motionEvent.getX();
                this.I = x2;
                this.G = x2;
                float y2 = motionEvent.getY();
                this.J = y2;
                this.H = y2;
                this.K = motionEvent.getPointerId(0);
            } else if (action != 1) {
                if (action == 2) {
                    if (!this.B) {
                        int findPointerIndex = motionEvent.findPointerIndex(this.K);
                        if (findPointerIndex == -1) {
                            z2 = g();
                        } else {
                            float x3 = motionEvent.getX(findPointerIndex);
                            float abs = Math.abs(x3 - this.G);
                            float y3 = motionEvent.getY(findPointerIndex);
                            float abs2 = Math.abs(y3 - this.H);
                            if (abs > ((float) this.F) && abs > abs2) {
                                this.B = true;
                                b(true);
                                float f2 = this.I;
                                this.G = x3 - f2 > 0.0f ? f2 + ((float) this.F) : f2 - ((float) this.F);
                                this.H = y3;
                                setScrollState(1);
                                setScrollingCacheEnabled(true);
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                    if (this.B) {
                        z2 = false | b(motionEvent.getX(motionEvent.findPointerIndex(this.K)));
                    }
                } else if (action != 3) {
                    if (action == 5) {
                        int actionIndex = motionEvent.getActionIndex();
                        this.G = motionEvent.getX(actionIndex);
                        this.K = motionEvent.getPointerId(actionIndex);
                    } else if (action == 6) {
                        a(motionEvent);
                        this.G = motionEvent.getX(motionEvent.findPointerIndex(this.K));
                    }
                } else if (this.B) {
                    a(this.f2373j, true, 0, false);
                    z2 = g();
                }
            } else if (this.B) {
                VelocityTracker velocityTracker = this.L;
                velocityTracker.computeCurrentVelocity(AnswersRetryFilesSender.BACKOFF_MS, (float) this.N);
                int xVelocity = (int) velocityTracker.getXVelocity(this.K);
                this.z = true;
                int clientWidth = getClientWidth();
                int scrollX = getScrollX();
                f c2 = c();
                float f3 = (float) clientWidth;
                a(a(c2.f2382b, ((((float) scrollX) / f3) - c2.e) / (c2.d + (((float) this.f2380q) / f3)), xVelocity, (int) (motionEvent.getX(motionEvent.findPointerIndex(this.K)) - this.I)), true, true, xVelocity);
                z2 = g();
            }
            if (z2) {
                m.B(this);
            }
            return true;
        }
        throw null;
    }

    public void removeView(View view) {
        if (this.x) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(a aVar) {
        a aVar2 = this.f2372i;
        if (aVar2 != null) {
            aVar2.a((DataSetObserver) null);
            this.f2372i.b(this);
            for (int i2 = 0; i2 < this.f2369f.size(); i2++) {
                f fVar = this.f2369f.get(i2);
                this.f2372i.a(this, fVar.f2382b, fVar.a);
            }
            this.f2372i.a((ViewGroup) this);
            this.f2369f.clear();
            int i3 = 0;
            while (i3 < getChildCount()) {
                if (!((g) getChildAt(i3).getLayoutParams()).a) {
                    removeViewAt(i3);
                    i3--;
                }
                i3++;
            }
            this.f2373j = 0;
            scrollTo(0, 0);
        }
        this.f2372i = aVar;
        this.e = 0;
        if (aVar != null) {
            if (this.f2379p == null) {
                this.f2379p = new j();
            }
            this.f2372i.a((DataSetObserver) this.f2379p);
            this.z = false;
            boolean z2 = this.U;
            this.U = true;
            a aVar3 = this.f2372i;
            if (((t0) aVar3) != null) {
                this.e = 4;
                int i4 = this.f2374k;
                if (i4 >= 0) {
                    if (((w) aVar3) != null) {
                        a(i4, false, true, 0);
                        this.f2374k = -1;
                        this.f2375l = null;
                        this.f2376m = null;
                        return;
                    }
                    throw null;
                } else if (!z2) {
                    e(this.f2373j);
                } else {
                    requestLayout();
                }
            } else {
                throw null;
            }
        }
    }

    public void setCurrentItem(int i2) {
        this.z = false;
        a(i2, !this.U, false, 0);
    }

    public void setOffscreenPageLimit(int i2) {
        if (i2 < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i2 + " too small; defaulting to " + 1);
            i2 = 1;
        }
        if (i2 != this.A) {
            this.A = i2;
            e(this.f2373j);
        }
    }

    @Deprecated
    public void setOnPageChangeListener(i iVar) {
        this.b0 = iVar;
    }

    public void setPageMargin(int i2) {
        int i3 = this.f2380q;
        this.f2380q = i2;
        int width = getWidth();
        a(width, width, i2, i3);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.r = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i2) {
        if (this.e0 != i2) {
            this.e0 = i2;
            i iVar = this.b0;
            if (iVar != null) {
                iVar.a(i2);
            }
            List<i> list = this.a0;
            if (list != null) {
                int size = list.size();
                for (int i3 = 0; i3 < size; i3++) {
                    i iVar2 = this.a0.get(i3);
                    if (iVar2 != null) {
                        iVar2.a(i2);
                    }
                }
            }
        }
    }

    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.r;
    }

    /* compiled from: ViewPager */
    public static class g extends ViewGroup.LayoutParams {
        public boolean a;

        /* renamed from: b  reason: collision with root package name */
        public int f2383b;
        public float c = 0.0f;
        public boolean d;
        public int e;

        /* renamed from: f  reason: collision with root package name */
        public int f2384f;

        public g() {
            super(-1, -1);
        }

        public g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.f0);
            this.f2383b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    public final f c() {
        int i2;
        int clientWidth = getClientWidth();
        float f2 = 0.0f;
        float scrollX = clientWidth > 0 ? ((float) getScrollX()) / ((float) clientWidth) : 0.0f;
        float f3 = clientWidth > 0 ? ((float) this.f2380q) / ((float) clientWidth) : 0.0f;
        f fVar = null;
        float f4 = 0.0f;
        int i3 = -1;
        int i4 = 0;
        boolean z2 = true;
        while (i4 < this.f2369f.size()) {
            f fVar2 = this.f2369f.get(i4);
            if (!z2 && fVar2.f2382b != (i2 = i3 + 1)) {
                fVar2 = this.f2370g;
                fVar2.e = f2 + f4 + f3;
                fVar2.f2382b = i2;
                if (this.f2372i != null) {
                    fVar2.d = 1.0f;
                    i4--;
                } else {
                    throw null;
                }
            }
            f2 = fVar2.e;
            float f5 = fVar2.d + f2 + f3;
            if (!z2 && scrollX < f2) {
                return fVar;
            }
            if (scrollX < f5 || i4 == this.f2369f.size() - 1) {
                return fVar2;
            }
            i3 = fVar2.f2382b;
            f4 = fVar2.d;
            i4++;
            fVar = fVar2;
            z2 = false;
        }
        return fVar;
    }

    public void setPageMarginDrawable(int i2) {
        setPageMarginDrawable(h.h.f.a.c(getContext(), i2));
    }

    public final void b(boolean z2) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z2);
        }
    }

    public final boolean b(float f2) {
        boolean z2;
        boolean z3;
        float f3 = this.G - f2;
        this.G = f2;
        float scrollX = ((float) getScrollX()) + f3;
        float clientWidth = (float) getClientWidth();
        float f4 = this.u * clientWidth;
        float f5 = this.v * clientWidth;
        boolean z4 = false;
        f fVar = this.f2369f.get(0);
        ArrayList<f> arrayList = this.f2369f;
        f fVar2 = arrayList.get(arrayList.size() - 1);
        if (fVar.f2382b != 0) {
            f4 = fVar.e * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        int i2 = fVar2.f2382b;
        if (((t0) this.f2372i) != null) {
            if (i2 != 3) {
                f5 = fVar2.e * clientWidth;
                z3 = false;
            } else {
                z3 = true;
            }
            if (scrollX < f4) {
                if (z2) {
                    this.S.onPull(Math.abs(f4 - scrollX) / clientWidth);
                    z4 = true;
                }
                scrollX = f4;
            } else if (scrollX > f5) {
                if (z3) {
                    this.T.onPull(Math.abs(scrollX - f5) / clientWidth);
                    z4 = true;
                }
                scrollX = f5;
            }
            int i3 = (int) scrollX;
            this.G = (scrollX - ((float) i3)) + this.G;
            scrollTo(i3, getScrollY());
            d(i3);
            return z4;
        }
        throw null;
    }

    /* compiled from: ViewPager */
    public class h extends h.h.m.a {
        public h() {
        }

        public void a(View view, h.h.m.w.b bVar) {
            this.a.onInitializeAccessibilityNodeInfo(view, bVar.a);
            bVar.a.setClassName(b.class.getName());
            bVar.a.setScrollable(a());
            if (b.this.canScrollHorizontally(1)) {
                bVar.a.addAction(CodedOutputStream.DEFAULT_BUFFER_SIZE);
            }
            if (b.this.canScrollHorizontally(-1)) {
                bVar.a.addAction(8192);
            }
        }

        public void b(View view, AccessibilityEvent accessibilityEvent) {
            a aVar;
            this.a.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(b.class.getName());
            accessibilityEvent.setScrollable(a());
            if (accessibilityEvent.getEventType() == 4096 && (aVar = b.this.f2372i) != null) {
                if (((t0) aVar) != null) {
                    accessibilityEvent.setItemCount(4);
                    accessibilityEvent.setFromIndex(b.this.f2373j);
                    accessibilityEvent.setToIndex(b.this.f2373j);
                    return;
                }
                throw null;
            }
        }

        public boolean a(View view, int i2, Bundle bundle) {
            if (super.a(view, i2, bundle)) {
                return true;
            }
            if (i2 != 4096) {
                if (i2 != 8192 || !b.this.canScrollHorizontally(-1)) {
                    return false;
                }
                b bVar = b.this;
                bVar.setCurrentItem(bVar.f2373j - 1);
                return true;
            } else if (!b.this.canScrollHorizontally(1)) {
                return false;
            } else {
                b bVar2 = b.this;
                bVar2.setCurrentItem(bVar2.f2373j + 1);
                return true;
            }
        }

        public final boolean a() {
            a aVar = b.this.f2372i;
            if (aVar == null) {
                return false;
            }
            if (((t0) aVar) != null) {
                return true;
            }
            throw null;
        }
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        d();
    }

    public final boolean d(int i2) {
        if (this.f2369f.size() != 0) {
            f c2 = c();
            int clientWidth = getClientWidth();
            int i3 = this.f2380q;
            int i4 = clientWidth + i3;
            float f2 = (float) clientWidth;
            int i5 = c2.f2382b;
            float f3 = ((((float) i2) / f2) - c2.e) / (c2.d + (((float) i3) / f2));
            this.V = false;
            a(i5, f3, (int) (((float) i4) * f3));
            if (this.V) {
                return true;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        } else if (this.U) {
            return false;
        } else {
            this.V = false;
            a(0, 0.0f, 0);
            if (this.V) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
    }

    public final void a(int i2, boolean z2, int i3, boolean z3) {
        int i4;
        int i5;
        f c2 = c(i2);
        int max = c2 != null ? (int) (Math.max(this.u, Math.min(c2.e, this.v)) * ((float) getClientWidth())) : 0;
        if (z2) {
            if (getChildCount() == 0) {
                setScrollingCacheEnabled(false);
            } else {
                Scroller scroller = this.f2377n;
                if (scroller != null && !scroller.isFinished()) {
                    i4 = this.f2378o ? this.f2377n.getCurrX() : this.f2377n.getStartX();
                    this.f2377n.abortAnimation();
                    setScrollingCacheEnabled(false);
                } else {
                    i4 = getScrollX();
                }
                int i6 = i4;
                int scrollY = getScrollY();
                int i7 = max - i6;
                int i8 = 0 - scrollY;
                if (i7 == 0 && i8 == 0) {
                    a(false);
                    e(this.f2373j);
                    setScrollState(0);
                } else {
                    setScrollingCacheEnabled(true);
                    setScrollState(2);
                    int clientWidth = getClientWidth();
                    int i9 = clientWidth / 2;
                    float f2 = (float) clientWidth;
                    float f3 = (float) i9;
                    float sin = (((float) Math.sin((double) ((Math.min(1.0f, (((float) Math.abs(i7)) * 1.0f) / f2) - 0.5f) * 0.47123894f))) * f3) + f3;
                    int abs = Math.abs(i3);
                    if (abs > 0) {
                        i5 = Math.round(Math.abs(sin / ((float) abs)) * 1000.0f) * 4;
                    } else if (this.f2372i != null) {
                        i5 = (int) (((((float) Math.abs(i7)) / ((f2 * 1.0f) + ((float) this.f2380q))) + 1.0f) * 100.0f);
                    } else {
                        throw null;
                    }
                    int min = Math.min(i5, 600);
                    this.f2378o = false;
                    this.f2377n.startScroll(i6, scrollY, i7, i8, min);
                    m.B(this);
                }
            }
            if (z3) {
                b(i2);
                return;
            }
            return;
        }
        if (z3) {
            b(i2);
        }
        a(false);
        scrollTo(max, 0);
        d(max);
    }

    public void b() {
        if (this.Q) {
            if (this.f2372i != null) {
                VelocityTracker velocityTracker = this.L;
                velocityTracker.computeCurrentVelocity(AnswersRetryFilesSender.BACKOFF_MS, (float) this.N);
                int xVelocity = (int) velocityTracker.getXVelocity(this.K);
                this.z = true;
                int clientWidth = getClientWidth();
                int scrollX = getScrollX();
                f c2 = c();
                a(a(c2.f2382b, ((((float) scrollX) / ((float) clientWidth)) - c2.e) / c2.d, xVelocity, (int) (this.G - this.I)), true, true, xVelocity);
            }
            this.B = false;
            this.C = false;
            VelocityTracker velocityTracker2 = this.L;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.L = null;
            }
            this.Q = false;
            return;
        }
        throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
    }

    public f a(int i2, int i3) {
        Fragment fragment;
        f fVar = new f();
        fVar.f2382b = i2;
        w wVar = (w) this.f2372i;
        if (wVar.e == null) {
            r rVar = wVar.c;
            if (rVar != null) {
                wVar.e = new h.l.d.a(rVar);
            } else {
                throw null;
            }
        }
        long j2 = (long) i2;
        Fragment b2 = wVar.c.b(w.a(getId(), j2));
        if (b2 != null) {
            a0 a0Var = wVar.e;
            if (a0Var != null) {
                a0Var.a(new a0.a(7, b2));
            } else {
                throw null;
            }
        } else {
            t0 t0Var = (t0) wVar;
            if (i2 == 0) {
                fragment = new b.a.a.a.w();
            } else if (i2 == 1) {
                fragment = new u0();
            } else if (i2 == 2) {
                fragment = new z0();
            } else if (i2 != 3) {
                fragment = new b.a.a.a.w();
            } else {
                boolean z2 = t0Var.f418g;
                b2 = new y();
                Bundle bundle = new Bundle();
                bundle.putBoolean("param1", z2);
                b2.e(bundle);
                wVar.e.a(getId(), b2, w.a(getId(), j2), 1);
            }
            b2 = fragment;
            wVar.e.a(getId(), b2, w.a(getId(), j2), 1);
        }
        if (b2 != wVar.f2030f) {
            b2.b(false);
            if (wVar.d == 1) {
                wVar.e.a(b2, h.b.STARTED);
            } else {
                b2.c(false);
            }
        }
        fVar.a = b2;
        if (this.f2372i != null) {
            fVar.d = 1.0f;
            if (i3 < 0 || i3 >= this.f2369f.size()) {
                this.f2369f.add(fVar);
            } else {
                this.f2369f.add(i3, fVar);
            }
            return fVar;
        }
        throw null;
    }

    public void a() {
        if (((t0) this.f2372i) != null) {
            this.e = 4;
            boolean z2 = this.f2369f.size() < (this.A * 2) + 1 && this.f2369f.size() < 4;
            int i2 = this.f2373j;
            boolean z3 = false;
            while (this.f2369f.size() > 0) {
                f fVar = this.f2369f.get(0);
                a aVar = this.f2372i;
                Object obj = fVar.a;
                if (((t0) aVar) == null) {
                    throw null;
                } else if (obj != null) {
                    this.f2369f.remove(0);
                    if (!z3) {
                        this.f2372i.b(this);
                        z3 = true;
                    }
                    this.f2372i.a(this, fVar.f2382b, fVar.a);
                    int i3 = this.f2373j;
                    if (i3 == fVar.f2382b) {
                        i2 = Math.max(0, Math.min(i3, 3));
                    }
                    z2 = true;
                } else {
                    n.m.c.f.a("object");
                    throw null;
                }
            }
            if (z3) {
                this.f2372i.a((ViewGroup) this);
            }
            Collections.sort(this.f2369f, g0);
            if (z2) {
                int childCount = getChildCount();
                for (int i4 = 0; i4 < childCount; i4++) {
                    g gVar = (g) getChildAt(i4).getLayoutParams();
                    if (!gVar.a) {
                        gVar.c = 0.0f;
                    }
                }
                a(i2, false, true, 0);
                requestLayout();
                return;
            }
            return;
        }
        throw null;
    }

    public f a(View view) {
        int i2 = 0;
        while (i2 < this.f2369f.size()) {
            f fVar = this.f2369f.get(i2);
            a aVar = this.f2372i;
            Object obj = fVar.a;
            if (((w) aVar) != null) {
                if (((Fragment) obj).K == view) {
                    return fVar;
                }
                i2++;
            } else {
                throw null;
            }
        }
        return null;
    }

    public final void a(int i2, int i3, int i4, int i5) {
        if (i3 <= 0 || this.f2369f.isEmpty()) {
            f c2 = c(this.f2373j);
            int min = (int) ((c2 != null ? Math.min(c2.e, this.v) : 0.0f) * ((float) ((i2 - getPaddingLeft()) - getPaddingRight())));
            if (min != getScrollX()) {
                a(false);
                scrollTo(min, getScrollY());
            }
        } else if (!this.f2377n.isFinished()) {
            this.f2377n.setFinalX(getCurrentItem() * getClientWidth());
        } else {
            scrollTo((int) ((((float) getScrollX()) / ((float) (((i3 - getPaddingLeft()) - getPaddingRight()) + i5))) * ((float) (((i2 - getPaddingLeft()) - getPaddingRight()) + i4))), getScrollY());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0064  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(int r13, float r14, int r15) {
        /*
            r12 = this;
            int r0 = r12.W
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L_0x006b
            int r0 = r12.getScrollX()
            int r3 = r12.getPaddingLeft()
            int r4 = r12.getPaddingRight()
            int r5 = r12.getWidth()
            int r6 = r12.getChildCount()
            r7 = 0
        L_0x001b:
            if (r7 >= r6) goto L_0x006b
            android.view.View r8 = r12.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            h.z.a.b$g r9 = (h.z.a.b.g) r9
            boolean r10 = r9.a
            if (r10 != 0) goto L_0x002c
            goto L_0x0068
        L_0x002c:
            int r9 = r9.f2383b
            r9 = r9 & 7
            if (r9 == r2) goto L_0x004d
            r10 = 3
            if (r9 == r10) goto L_0x0047
            r10 = 5
            if (r9 == r10) goto L_0x003a
            r9 = r3
            goto L_0x005c
        L_0x003a:
            int r9 = r5 - r4
            int r10 = r8.getMeasuredWidth()
            int r9 = r9 - r10
            int r10 = r8.getMeasuredWidth()
            int r4 = r4 + r10
            goto L_0x0059
        L_0x0047:
            int r9 = r8.getWidth()
            int r9 = r9 + r3
            goto L_0x005c
        L_0x004d:
            int r9 = r8.getMeasuredWidth()
            int r9 = r5 - r9
            int r9 = r9 / 2
            int r9 = java.lang.Math.max(r9, r3)
        L_0x0059:
            r11 = r9
            r9 = r3
            r3 = r11
        L_0x005c:
            int r3 = r3 + r0
            int r10 = r8.getLeft()
            int r3 = r3 - r10
            if (r3 == 0) goto L_0x0067
            r8.offsetLeftAndRight(r3)
        L_0x0067:
            r3 = r9
        L_0x0068:
            int r7 = r7 + 1
            goto L_0x001b
        L_0x006b:
            h.z.a.b$i r0 = r12.b0
            if (r0 == 0) goto L_0x0072
            r0.a(r13, r14, r15)
        L_0x0072:
            java.util.List<h.z.a.b$i> r0 = r12.a0
            if (r0 == 0) goto L_0x008c
            int r0 = r0.size()
        L_0x007a:
            if (r1 >= r0) goto L_0x008c
            java.util.List<h.z.a.b$i> r3 = r12.a0
            java.lang.Object r3 = r3.get(r1)
            h.z.a.b$i r3 = (h.z.a.b.i) r3
            if (r3 == 0) goto L_0x0089
            r3.a(r13, r14, r15)
        L_0x0089:
            int r1 = r1 + 1
            goto L_0x007a
        L_0x008c:
            r12.V = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h.z.a.b.a(int, float, int):void");
    }

    public boolean e() {
        int i2 = this.f2373j;
        if (i2 <= 0) {
            return false;
        }
        this.z = false;
        a(i2 - 1, true, false, 0);
        return true;
    }

    public final void a(boolean z2) {
        boolean z3 = this.e0 == 2;
        if (z3) {
            setScrollingCacheEnabled(false);
            if (!this.f2377n.isFinished()) {
                this.f2377n.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f2377n.getCurrX();
                int currY = this.f2377n.getCurrY();
                if (!(scrollX == currX && scrollY == currY)) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        d(currX);
                    }
                }
            }
        }
        this.z = false;
        for (int i2 = 0; i2 < this.f2369f.size(); i2++) {
            f fVar = this.f2369f.get(i2);
            if (fVar.c) {
                fVar.c = false;
                z3 = true;
            }
        }
        if (!z3) {
            return;
        }
        if (z2) {
            m.a((View) this, this.d0);
        } else {
            this.d0.run();
        }
    }

    public final int a(int i2, float f2, int i3, int i4) {
        if (Math.abs(i4) <= this.O || Math.abs(i3) <= this.M) {
            i2 += (int) (f2 + (i2 >= this.f2373j ? 0.4f : 0.6f));
        } else if (i3 <= 0) {
            i2++;
        }
        if (this.f2369f.size() <= 0) {
            return i2;
        }
        ArrayList<f> arrayList = this.f2369f;
        return Math.max(this.f2369f.get(0).f2382b, Math.min(i2, arrayList.get(arrayList.size() - 1).f2382b));
    }

    public void a(float f2) {
        if (!this.Q) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        } else if (this.f2372i != null) {
            this.G += f2;
            float scrollX = ((float) getScrollX()) - f2;
            float clientWidth = (float) getClientWidth();
            float f3 = this.u * clientWidth;
            float f4 = this.v * clientWidth;
            f fVar = this.f2369f.get(0);
            ArrayList<f> arrayList = this.f2369f;
            f fVar2 = arrayList.get(arrayList.size() - 1);
            if (fVar.f2382b != 0) {
                f3 = fVar.e * clientWidth;
            }
            int i2 = fVar2.f2382b;
            if (((t0) this.f2372i) != null) {
                if (i2 != 3) {
                    f4 = fVar2.e * clientWidth;
                }
                if (scrollX < f3) {
                    scrollX = f3;
                } else if (scrollX > f4) {
                    scrollX = f4;
                }
                int i3 = (int) scrollX;
                this.G = (scrollX - ((float) i3)) + this.G;
                scrollTo(i3, getScrollY());
                d(i3);
                MotionEvent obtain = MotionEvent.obtain(this.R, SystemClock.uptimeMillis(), 2, this.G, 0.0f, 0);
                this.L.addMovement(obtain);
                obtain.recycle();
                return;
            }
            throw null;
        }
    }

    public final void a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.K) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.G = motionEvent.getX(i2);
            this.K = motionEvent.getPointerId(i2);
            VelocityTracker velocityTracker = this.L;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public boolean a(View view, boolean z2, int i2, int i3, int i4) {
        int i5;
        View view2 = view;
        if (view2 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i6 = i3 + scrollX;
                if (i6 >= childAt.getLeft() && i6 < childAt.getRight() && (i5 = i4 + scrollY) >= childAt.getTop() && i5 < childAt.getBottom()) {
                    if (a(childAt, true, i2, i6 - childAt.getLeft(), i5 - childAt.getTop())) {
                        return true;
                    }
                }
            }
        }
        if (!z2 || !view.canScrollHorizontally(-i2)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ca  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(int r7) {
        /*
            r6 = this;
            android.view.View r0 = r6.findFocus()
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 != r6) goto L_0x000a
            goto L_0x0063
        L_0x000a:
            if (r0 == 0) goto L_0x0064
            android.view.ViewParent r4 = r0.getParent()
        L_0x0010:
            boolean r5 = r4 instanceof android.view.ViewGroup
            if (r5 == 0) goto L_0x001d
            if (r4 != r6) goto L_0x0018
            r4 = 1
            goto L_0x001e
        L_0x0018:
            android.view.ViewParent r4 = r4.getParent()
            goto L_0x0010
        L_0x001d:
            r4 = 0
        L_0x001e:
            if (r4 != 0) goto L_0x0064
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getSimpleName()
            r4.append(r5)
            android.view.ViewParent r0 = r0.getParent()
        L_0x0034:
            boolean r5 = r0 instanceof android.view.ViewGroup
            if (r5 == 0) goto L_0x004d
            java.lang.String r5 = " => "
            r4.append(r5)
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getSimpleName()
            r4.append(r5)
            android.view.ViewParent r0 = r0.getParent()
            goto L_0x0034
        L_0x004d:
            java.lang.String r0 = "arrowScroll tried to find focus based on non-child current focused view "
            java.lang.StringBuilder r0 = i.a.a.a.a.a(r0)
            java.lang.String r4 = r4.toString()
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r4 = "ViewPager"
            android.util.Log.e(r4, r0)
        L_0x0063:
            r0 = r3
        L_0x0064:
            android.view.FocusFinder r3 = android.view.FocusFinder.getInstance()
            android.view.View r3 = r3.findNextFocus(r6, r0, r7)
            r4 = 66
            r5 = 17
            if (r3 == 0) goto L_0x00b5
            if (r3 == r0) goto L_0x00b5
            if (r7 != r5) goto L_0x0095
            android.graphics.Rect r1 = r6.f2371h
            android.graphics.Rect r1 = r6.a((android.graphics.Rect) r1, (android.view.View) r3)
            int r1 = r1.left
            android.graphics.Rect r2 = r6.f2371h
            android.graphics.Rect r2 = r6.a((android.graphics.Rect) r2, (android.view.View) r0)
            int r2 = r2.left
            if (r0 == 0) goto L_0x008f
            if (r1 < r2) goto L_0x008f
            boolean r0 = r6.e()
            goto L_0x0093
        L_0x008f:
            boolean r0 = r3.requestFocus()
        L_0x0093:
            r2 = r0
            goto L_0x00c8
        L_0x0095:
            if (r7 != r4) goto L_0x00c8
            android.graphics.Rect r1 = r6.f2371h
            android.graphics.Rect r1 = r6.a((android.graphics.Rect) r1, (android.view.View) r3)
            int r1 = r1.left
            android.graphics.Rect r2 = r6.f2371h
            android.graphics.Rect r2 = r6.a((android.graphics.Rect) r2, (android.view.View) r0)
            int r2 = r2.left
            if (r0 == 0) goto L_0x00b0
            if (r1 > r2) goto L_0x00b0
            boolean r0 = r6.f()
            goto L_0x0093
        L_0x00b0:
            boolean r0 = r3.requestFocus()
            goto L_0x0093
        L_0x00b5:
            if (r7 == r5) goto L_0x00c4
            if (r7 != r1) goto L_0x00ba
            goto L_0x00c4
        L_0x00ba:
            if (r7 == r4) goto L_0x00bf
            r0 = 2
            if (r7 != r0) goto L_0x00c8
        L_0x00bf:
            boolean r2 = r6.f()
            goto L_0x00c8
        L_0x00c4:
            boolean r2 = r6.e()
        L_0x00c8:
            if (r2 == 0) goto L_0x00d1
            int r7 = android.view.SoundEffectConstants.getContantForFocusDirection(r7)
            r6.playSoundEffect(r7)
        L_0x00d1:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: h.z.a.b.a(int):boolean");
    }

    public final Rect a(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left = viewGroup.getLeft() + rect.left;
            rect.right = viewGroup.getRight() + rect.right;
            rect.top = viewGroup.getTop() + rect.top;
            rect.bottom = viewGroup.getBottom() + rect.bottom;
            parent = viewGroup.getParent();
        }
        return rect;
    }
}
