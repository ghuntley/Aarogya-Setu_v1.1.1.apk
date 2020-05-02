package androidx.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.appcompat.app.AlertController;
import androidx.recyclerview.widget.RecyclerView;
import com.crashlytics.android.answers.AnswersRetryFilesSender;
import h.h.m.e;
import h.h.m.g;
import h.h.m.i;
import h.h.m.j;
import h.h.m.m;
import h.h.m.w.b;
import java.util.ArrayList;

public class NestedScrollView extends FrameLayout implements i, e {
    public static final a E = new a();
    public static final int[] F = {16843130};
    public final j A;
    public final g B;
    public float C;
    public b D;
    public long e;

    /* renamed from: f  reason: collision with root package name */
    public final Rect f216f;

    /* renamed from: g  reason: collision with root package name */
    public OverScroller f217g;

    /* renamed from: h  reason: collision with root package name */
    public EdgeEffect f218h;

    /* renamed from: i  reason: collision with root package name */
    public EdgeEffect f219i;

    /* renamed from: j  reason: collision with root package name */
    public int f220j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f221k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f222l;

    /* renamed from: m  reason: collision with root package name */
    public View f223m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f224n;

    /* renamed from: o  reason: collision with root package name */
    public VelocityTracker f225o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f226p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f227q;
    public int r;
    public int s;
    public int t;
    public int u;
    public final int[] v;
    public final int[] w;
    public int x;
    public int y;
    public c z;

    public interface b {
    }

    public static class c extends View.BaseSavedState {
        public static final Parcelable.Creator<c> CREATOR = new a();
        public int e;

        public static class a implements Parcelable.Creator<c> {
            public Object createFromParcel(Parcel parcel) {
                return new c(parcel);
            }

            public Object[] newArray(int i2) {
                return new c[i2];
            }
        }

        public c(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder a2 = i.a.a.a.a.a("HorizontalScrollView.SavedState{");
            a2.append(Integer.toHexString(System.identityHashCode(this)));
            a2.append(" scrollPosition=");
            a2.append(this.e);
            a2.append("}");
            return a2.toString();
        }

        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.e);
        }

        public c(Parcel parcel) {
            super(parcel);
            this.e = parcel.readInt();
        }
    }

    public NestedScrollView(Context context) {
        this(context, (AttributeSet) null);
    }

    public static int b(int i2, int i3, int i4) {
        if (i3 >= i4 || i2 < 0) {
            return 0;
        }
        return i3 + i2 > i4 ? i4 - i3 : i2;
    }

    private float getVerticalScrollFactorCompat() {
        if (this.C == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                this.C = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.C;
    }

    public boolean a(int i2, int i3) {
        return this.B.a(i2, i3);
    }

    public void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public final void b(int i2) {
        if (i2 == 0) {
            return;
        }
        if (this.f227q) {
            a(0, i2, 250, false);
        } else {
            scrollBy(0, i2);
        }
    }

    public boolean b(View view, View view2, int i2, int i3) {
        return (i2 & 2) != 0;
    }

    public void c(int i2) {
        if (getChildCount() > 0) {
            this.f217g.fling(getScrollX(), getScrollY(), 0, i2, 0, 0, RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE, 0, 0);
            a(true);
        }
    }

    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    public void computeScroll() {
        if (!this.f217g.isFinished()) {
            this.f217g.computeScrollOffset();
            int currY = this.f217g.getCurrY();
            int i2 = currY - this.y;
            this.y = currY;
            int[] iArr = this.w;
            boolean z2 = false;
            iArr[1] = 0;
            a(0, i2, iArr, (int[]) null, 1);
            int i3 = i2 - this.w[1];
            int scrollRange = getScrollRange();
            if (i3 != 0) {
                int scrollY = getScrollY();
                a(0, i3, getScrollX(), scrollY, 0, scrollRange, 0, 0);
                int scrollY2 = getScrollY() - scrollY;
                int i4 = i3 - scrollY2;
                int[] iArr2 = this.w;
                iArr2[1] = 0;
                this.B.a(0, scrollY2, 0, i4, this.v, 1, iArr2);
                i3 = i4 - this.w[1];
            }
            if (i3 != 0) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    z2 = true;
                }
                if (z2) {
                    c();
                    if (i3 < 0) {
                        if (this.f218h.isFinished()) {
                            this.f218h.onAbsorb((int) this.f217g.getCurrVelocity());
                        }
                    } else if (this.f219i.isFinished()) {
                        this.f219i.onAbsorb((int) this.f217g.getCurrVelocity());
                    }
                }
                a();
            }
            if (!this.f217g.isFinished()) {
                m.B(this);
            } else {
                this.B.c(1);
            }
        }
    }

    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        return scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    public final void d() {
        VelocityTracker velocityTracker = this.f225o;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f225o = null;
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || a(keyEvent);
    }

    public boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        return this.B.a(f2, f3, z2);
    }

    public boolean dispatchNestedPreFling(float f2, float f3) {
        return this.B.a(f2, f3);
    }

    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return a(i2, i3, iArr, iArr2, 0);
    }

    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return this.B.a(i2, i3, i4, i5, iArr);
    }

    public void draw(Canvas canvas) {
        int i2;
        super.draw(canvas);
        if (this.f218h != null) {
            int scrollY = getScrollY();
            int i3 = 0;
            if (!this.f218h.isFinished()) {
                int save = canvas.save();
                int width = getWidth();
                int height = getHeight();
                int min = Math.min(0, scrollY);
                if (getClipToPadding()) {
                    width -= getPaddingRight() + getPaddingLeft();
                    i2 = getPaddingLeft() + 0;
                } else {
                    i2 = 0;
                }
                if (getClipToPadding()) {
                    height -= getPaddingBottom() + getPaddingTop();
                    min += getPaddingTop();
                }
                canvas.translate((float) i2, (float) min);
                this.f218h.setSize(width, height);
                if (this.f218h.draw(canvas)) {
                    m.B(this);
                }
                canvas.restoreToCount(save);
            }
            if (!this.f219i.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = getHeight();
                int max = Math.max(getScrollRange(), scrollY) + height2;
                if (getClipToPadding()) {
                    width2 -= getPaddingRight() + getPaddingLeft();
                    i3 = 0 + getPaddingLeft();
                }
                if (getClipToPadding()) {
                    height2 -= getPaddingBottom() + getPaddingTop();
                    max -= getPaddingBottom();
                }
                canvas.translate((float) (i3 - width2), (float) max);
                canvas.rotate(180.0f, (float) width2, 0.0f);
                this.f219i.setSize(width2, height2);
                if (this.f219i.draw(canvas)) {
                    m.B(this);
                }
                canvas.restoreToCount(save2);
            }
        }
    }

    public boolean e(int i2) {
        return this.B.a(i2) != null;
    }

    public void f(int i2) {
        this.B.c(i2);
    }

    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return ((float) bottom) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (((float) getHeight()) * 0.5f);
    }

    public int getNestedScrollAxes() {
        return this.A.a();
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return ((float) scrollY) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public boolean hasNestedScrollingParent() {
        return e(0);
    }

    public boolean isNestedScrollingEnabled() {
        return this.B.d;
    }

    public void measureChild(View view, int i2, int i3) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(FrameLayout.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    public void measureChildWithMargins(View view, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(FrameLayout.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f222l = false;
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() == 8 && !this.f224n) {
            float axisValue = motionEvent.getAxisValue(9);
            if (axisValue != 0.0f) {
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                int verticalScrollFactorCompat = scrollY - ((int) (axisValue * getVerticalScrollFactorCompat()));
                if (verticalScrollFactorCompat < 0) {
                    scrollRange = 0;
                } else if (verticalScrollFactorCompat <= scrollRange) {
                    scrollRange = verticalScrollFactorCompat;
                }
                if (scrollRange != scrollY) {
                    super.scrollTo(getScrollX(), scrollRange);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00e9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r12) {
        /*
            r11 = this;
            int r0 = r12.getAction()
            r1 = 1
            r2 = 2
            if (r0 != r2) goto L_0x000d
            boolean r3 = r11.f224n
            if (r3 == 0) goto L_0x000d
            return r1
        L_0x000d:
            r0 = r0 & 255(0xff, float:3.57E-43)
            r3 = 0
            if (r0 == 0) goto L_0x00ac
            r4 = -1
            if (r0 == r1) goto L_0x0085
            if (r0 == r2) goto L_0x0024
            r1 = 3
            if (r0 == r1) goto L_0x0085
            r1 = 6
            if (r0 == r1) goto L_0x001f
            goto L_0x0115
        L_0x001f:
            r11.a((android.view.MotionEvent) r12)
            goto L_0x0115
        L_0x0024:
            int r0 = r11.u
            if (r0 != r4) goto L_0x002a
            goto L_0x0115
        L_0x002a:
            int r5 = r12.findPointerIndex(r0)
            if (r5 != r4) goto L_0x004d
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r1 = "Invalid pointerId="
            r12.append(r1)
            r12.append(r0)
            java.lang.String r0 = " in onInterceptTouchEvent"
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            java.lang.String r0 = "NestedScrollView"
            android.util.Log.e(r0, r12)
            goto L_0x0115
        L_0x004d:
            float r0 = r12.getY(r5)
            int r0 = (int) r0
            int r4 = r11.f220j
            int r4 = r0 - r4
            int r4 = java.lang.Math.abs(r4)
            int r5 = r11.r
            if (r4 <= r5) goto L_0x0115
            int r4 = r11.getNestedScrollAxes()
            r2 = r2 & r4
            if (r2 != 0) goto L_0x0115
            r11.f224n = r1
            r11.f220j = r0
            android.view.VelocityTracker r0 = r11.f225o
            if (r0 != 0) goto L_0x0073
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r11.f225o = r0
        L_0x0073:
            android.view.VelocityTracker r0 = r11.f225o
            r0.addMovement(r12)
            r11.x = r3
            android.view.ViewParent r12 = r11.getParent()
            if (r12 == 0) goto L_0x0115
            r12.requestDisallowInterceptTouchEvent(r1)
            goto L_0x0115
        L_0x0085:
            r11.f224n = r3
            r11.u = r4
            r11.d()
            android.widget.OverScroller r4 = r11.f217g
            int r5 = r11.getScrollX()
            int r6 = r11.getScrollY()
            r7 = 0
            r8 = 0
            r9 = 0
            int r10 = r11.getScrollRange()
            boolean r12 = r4.springBack(r5, r6, r7, r8, r9, r10)
            if (r12 == 0) goto L_0x00a6
            h.h.m.m.B(r11)
        L_0x00a6:
            h.h.m.g r12 = r11.B
            r12.c(r3)
            goto L_0x0115
        L_0x00ac:
            float r0 = r12.getY()
            int r0 = (int) r0
            float r4 = r12.getX()
            int r4 = (int) r4
            int r5 = r11.getChildCount()
            if (r5 <= 0) goto L_0x00e0
            int r5 = r11.getScrollY()
            android.view.View r6 = r11.getChildAt(r3)
            int r7 = r6.getTop()
            int r7 = r7 - r5
            if (r0 < r7) goto L_0x00e0
            int r7 = r6.getBottom()
            int r7 = r7 - r5
            if (r0 >= r7) goto L_0x00e0
            int r5 = r6.getLeft()
            if (r4 < r5) goto L_0x00e0
            int r5 = r6.getRight()
            if (r4 >= r5) goto L_0x00e0
            r4 = 1
            goto L_0x00e1
        L_0x00e0:
            r4 = 0
        L_0x00e1:
            if (r4 != 0) goto L_0x00e9
            r11.f224n = r3
            r11.d()
            goto L_0x0115
        L_0x00e9:
            r11.f220j = r0
            int r0 = r12.getPointerId(r3)
            r11.u = r0
            android.view.VelocityTracker r0 = r11.f225o
            if (r0 != 0) goto L_0x00fc
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r11.f225o = r0
            goto L_0x00ff
        L_0x00fc:
            r0.clear()
        L_0x00ff:
            android.view.VelocityTracker r0 = r11.f225o
            r0.addMovement(r12)
            android.widget.OverScroller r12 = r11.f217g
            r12.computeScrollOffset()
            android.widget.OverScroller r12 = r11.f217g
            boolean r12 = r12.isFinished()
            r12 = r12 ^ r1
            r11.f224n = r12
            r11.a((int) r2, (int) r3)
        L_0x0115:
            boolean r12 = r11.f224n
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        int i6 = 0;
        this.f221k = false;
        View view = this.f223m;
        if (view != null && a(view, (View) this)) {
            a(this.f223m);
        }
        this.f223m = null;
        if (!this.f222l) {
            if (this.z != null) {
                scrollTo(getScrollX(), this.z.e);
                this.z = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i6 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i5 - i3) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int b2 = b(scrollY, paddingTop, i6);
            if (b2 != scrollY) {
                scrollTo(getScrollX(), b2);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f222l = true;
    }

    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f226p && View.MeasureSpec.getMode(i3) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(FrameLayout.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    public boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        if (z2) {
            return false;
        }
        dispatchNestedFling(0.0f, f3, true);
        c((int) f3);
        return true;
    }

    public boolean onNestedPreFling(View view, float f2, float f3) {
        return this.B.a(f2, f3);
    }

    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        a(i2, i3, iArr, (int[]) null, 0);
    }

    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        a(i5, 0, (int[]) null);
    }

    public void onNestedScrollAccepted(View view, View view2, int i2) {
        this.A.a = i2;
        a(2, 0);
    }

    public void onOverScrolled(int i2, int i3, boolean z2, boolean z3) {
        super.scrollTo(i2, i3);
    }

    public boolean onRequestFocusInDescendants(int i2, Rect rect) {
        View view;
        if (i2 == 2) {
            i2 = 130;
        } else if (i2 == 1) {
            i2 = 33;
        }
        if (rect == null) {
            view = FocusFinder.getInstance().findNextFocus(this, (View) null, i2);
        } else {
            view = FocusFinder.getInstance().findNextFocusFromRect(this, rect, i2);
        }
        if (view != null && !(true ^ a(view, 0, getHeight()))) {
            return view.requestFocus(i2, rect);
        }
        return false;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.getSuperState());
        this.z = cVar;
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        c cVar = new c(super.onSaveInstanceState());
        cVar.e = getScrollY();
        return cVar;
    }

    public void onScrollChanged(int i2, int i3, int i4, int i5) {
        super.onScrollChanged(i2, i3, i4, i5);
        b bVar = this.D;
        if (bVar != null) {
            h.b.k.b bVar2 = (h.b.k.b) bVar;
            AlertController.a(this, bVar2.a, bVar2.f1115b);
        }
    }

    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && a(findFocus, 0, i5)) {
            findFocus.getDrawingRect(this.f216f);
            offsetDescendantRectToMyCoords(findFocus, this.f216f);
            b(a(this.f216f));
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i2) {
        return (i2 & 2) != 0;
    }

    public void onStopNestedScroll(View view) {
        this.A.a = 0;
        f(0);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        MotionEvent motionEvent2 = motionEvent;
        if (this.f225o == null) {
            this.f225o = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.x = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(0.0f, (float) this.x);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f225o;
                velocityTracker.computeCurrentVelocity(AnswersRetryFilesSender.BACKOFF_MS, (float) this.t);
                int yVelocity = (int) velocityTracker.getYVelocity(this.u);
                if (Math.abs(yVelocity) >= this.s) {
                    int i2 = -yVelocity;
                    float f2 = (float) i2;
                    if (!dispatchNestedPreFling(0.0f, f2)) {
                        dispatchNestedFling(0.0f, f2, true);
                        c(i2);
                    }
                } else if (this.f217g.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    m.B(this);
                }
                this.u = -1;
                b();
            } else if (actionMasked == 2) {
                int findPointerIndex = motionEvent2.findPointerIndex(this.u);
                if (findPointerIndex == -1) {
                    StringBuilder a2 = i.a.a.a.a.a("Invalid pointerId=");
                    a2.append(this.u);
                    a2.append(" in onTouchEvent");
                    Log.e("NestedScrollView", a2.toString());
                } else {
                    int y2 = (int) motionEvent2.getY(findPointerIndex);
                    int i3 = this.f220j - y2;
                    if (!this.f224n && Math.abs(i3) > this.r) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f224n = true;
                        i3 = i3 > 0 ? i3 - this.r : i3 + this.r;
                    }
                    int i4 = i3;
                    if (this.f224n) {
                        if (a(0, i4, this.w, this.v, 0)) {
                            i4 -= this.w[1];
                            this.x += this.v[1];
                        }
                        int i5 = i4;
                        this.f220j = y2 - this.v[1];
                        int scrollY = getScrollY();
                        int scrollRange = getScrollRange();
                        int overScrollMode = getOverScrollMode();
                        boolean z2 = overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0);
                        int i6 = scrollRange;
                        if (a(0, i5, 0, getScrollY(), 0, scrollRange, 0, 0) && !e(0)) {
                            this.f225o.clear();
                        }
                        int scrollY2 = getScrollY() - scrollY;
                        int[] iArr = this.w;
                        iArr[1] = 0;
                        this.B.a(0, scrollY2, 0, i5 - scrollY2, this.v, 0, iArr);
                        int i7 = this.f220j;
                        int[] iArr2 = this.v;
                        this.f220j = i7 - iArr2[1];
                        this.x += iArr2[1];
                        if (z2) {
                            int i8 = i5 - this.w[1];
                            c();
                            int i9 = scrollY + i8;
                            if (i9 < 0) {
                                this.f218h.onPull(((float) i8) / ((float) getHeight()), motionEvent2.getX(findPointerIndex) / ((float) getWidth()));
                                if (!this.f219i.isFinished()) {
                                    this.f219i.onRelease();
                                }
                            } else if (i9 > i6) {
                                this.f219i.onPull(((float) i8) / ((float) getHeight()), 1.0f - (motionEvent2.getX(findPointerIndex) / ((float) getWidth())));
                                if (!this.f218h.isFinished()) {
                                    this.f218h.onRelease();
                                }
                            }
                            EdgeEffect edgeEffect = this.f218h;
                            if (edgeEffect != null && (!edgeEffect.isFinished() || !this.f219i.isFinished())) {
                                m.B(this);
                            }
                        }
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f224n && getChildCount() > 0 && this.f217g.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    m.B(this);
                }
                this.u = -1;
                b();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f220j = (int) motionEvent2.getY(actionIndex);
                this.u = motionEvent2.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                a(motionEvent);
                this.f220j = (int) motionEvent2.getY(motionEvent2.findPointerIndex(this.u));
            }
        } else if (getChildCount() == 0) {
            return false;
        } else {
            boolean z3 = !this.f217g.isFinished();
            this.f224n = z3;
            if (z3 && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f217g.isFinished()) {
                a();
            }
            this.f220j = (int) motionEvent.getY();
            this.u = motionEvent2.getPointerId(0);
            a(2, 0);
        }
        VelocityTracker velocityTracker2 = this.f225o;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.f221k) {
            a(view2);
        } else {
            this.f223m = view2;
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int a2 = a(rect);
        boolean z3 = a2 != 0;
        if (z3) {
            if (z2) {
                scrollBy(0, a2);
            } else {
                a(0, a2, 250, false);
            }
        }
        return z3;
    }

    public void requestDisallowInterceptTouchEvent(boolean z2) {
        if (z2) {
            d();
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    public void requestLayout() {
        this.f221k = true;
        super.requestLayout();
    }

    public void scrollTo(int i2, int i3) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int b2 = b(i2, (getWidth() - getPaddingLeft()) - getPaddingRight(), childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
            int b3 = b(i3, (getHeight() - getPaddingTop()) - getPaddingBottom(), childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin);
            if (b2 != getScrollX() || b3 != getScrollY()) {
                super.scrollTo(b2, b3);
            }
        }
    }

    public void setFillViewport(boolean z2) {
        if (z2 != this.f226p) {
            this.f226p = z2;
            requestLayout();
        }
    }

    public void setNestedScrollingEnabled(boolean z2) {
        g gVar = this.B;
        if (gVar.d) {
            m.D(gVar.c);
        }
        gVar.d = z2;
    }

    public void setOnScrollChangeListener(b bVar) {
        this.D = bVar;
    }

    public void setSmoothScrollingEnabled(boolean z2) {
        this.f227q = z2;
    }

    public boolean shouldDelayChildPressedState() {
        return true;
    }

    public boolean startNestedScroll(int i2) {
        return this.B.a(i2, 0);
    }

    public void stopNestedScroll() {
        this.B.c(0);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public boolean a(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        return this.B.a(i2, i3, iArr, iArr2, i4);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f216f = new Rect();
        this.f221k = true;
        this.f222l = false;
        this.f223m = null;
        this.f224n = false;
        this.f227q = true;
        this.u = -1;
        this.v = new int[2];
        this.w = new int[2];
        this.f217g = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.r = viewConfiguration.getScaledTouchSlop();
        this.s = viewConfiguration.getScaledMinimumFlingVelocity();
        this.t = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, F, i2, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.A = new j();
        this.B = new g(this);
        setNestedScrollingEnabled(true);
        m.a((View) this, (h.h.m.a) E);
    }

    public void a(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        a(i5, i6, iArr);
    }

    public final void a(int i2, int i3, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i2);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.B.a(0, scrollY2, 0, i2 - scrollY2, (int[]) null, i3, iArr);
    }

    public void addView(View view, int i2) {
        if (getChildCount() <= 0) {
            super.addView(view, i2);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public final void b() {
        this.f224n = false;
        d();
        this.B.c(0);
        EdgeEffect edgeEffect = this.f218h;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            this.f219i.onRelease();
        }
    }

    public final void c() {
        if (getOverScrollMode() == 2) {
            this.f218h = null;
            this.f219i = null;
        } else if (this.f218h == null) {
            Context context = getContext();
            this.f218h = new EdgeEffect(context);
            this.f219i = new EdgeEffect(context);
        }
    }

    public boolean d(int i2) {
        int childCount;
        boolean z2 = i2 == 130;
        int height = getHeight();
        Rect rect = this.f216f;
        rect.top = 0;
        rect.bottom = height;
        if (z2 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f216f.bottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            Rect rect2 = this.f216f;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f216f;
        return a(i2, rect3.top, rect3.bottom);
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void a(View view, View view2, int i2, int i3) {
        j jVar = this.A;
        if (i3 == 1) {
            jVar.f1813b = i2;
        } else {
            jVar.a = i2;
        }
        a(2, i3);
    }

    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i2, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void a(View view, int i2) {
        j jVar = this.A;
        if (i2 == 1) {
            jVar.f1813b = 0;
        } else {
            jVar.a = 0;
        }
        this.B.c(i2);
    }

    public static class a extends h.h.m.a {
        public void a(View view, h.h.m.w.b bVar) {
            int scrollRange;
            this.a.onInitializeAccessibilityNodeInfo(view, bVar.a);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            bVar.a.setClassName(ScrollView.class.getName());
            if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                bVar.a.setScrollable(true);
                if (nestedScrollView.getScrollY() > 0) {
                    bVar.a(b.a.f1826g);
                    bVar.a(b.a.f1830k);
                }
                if (nestedScrollView.getScrollY() < scrollRange) {
                    bVar.a(b.a.f1825f);
                    bVar.a(b.a.f1831l);
                }
            }
        }

        public void b(View view, AccessibilityEvent accessibilityEvent) {
            this.a.onInitializeAccessibilityEvent(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setMaxScrollY(nestedScrollView.getScrollRange());
        }

        public boolean a(View view, int i2, Bundle bundle) {
            if (super.a(view, i2, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            if (i2 != 4096) {
                if (i2 == 8192 || i2 == 16908344) {
                    int max = Math.max(nestedScrollView.getScrollY() - ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (max == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.a(0 - nestedScrollView.getScrollX(), max - nestedScrollView.getScrollY(), 250, true);
                    return true;
                } else if (i2 != 16908346) {
                    return false;
                }
            }
            int min = Math.min(nestedScrollView.getScrollY() + ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (min == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.a(0 - nestedScrollView.getScrollX(), min - nestedScrollView.getScrollY(), 250, true);
            return true;
        }
    }

    public void a(View view, int i2, int i3, int i4, int i5, int i6) {
        a(i5, i6, (int[]) null);
    }

    public void a(View view, int i2, int i3, int[] iArr, int i4) {
        a(i2, i3, iArr, (int[]) null, i4);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0038  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(android.view.KeyEvent r7) {
        /*
            r6 = this;
            android.graphics.Rect r0 = r6.f216f
            r0.setEmpty()
            int r0 = r6.getChildCount()
            r1 = 1
            r2 = 0
            if (r0 <= 0) goto L_0x0033
            android.view.View r0 = r6.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r3 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r3 = (android.widget.FrameLayout.LayoutParams) r3
            int r0 = r0.getHeight()
            int r4 = r3.topMargin
            int r0 = r0 + r4
            int r3 = r3.bottomMargin
            int r0 = r0 + r3
            int r3 = r6.getHeight()
            int r4 = r6.getPaddingTop()
            int r3 = r3 - r4
            int r4 = r6.getPaddingBottom()
            int r3 = r3 - r4
            if (r0 <= r3) goto L_0x0033
            r0 = 1
            goto L_0x0034
        L_0x0033:
            r0 = 0
        L_0x0034:
            r3 = 130(0x82, float:1.82E-43)
            if (r0 != 0) goto L_0x0062
            boolean r0 = r6.isFocused()
            if (r0 == 0) goto L_0x0061
            int r7 = r7.getKeyCode()
            r0 = 4
            if (r7 == r0) goto L_0x0061
            android.view.View r7 = r6.findFocus()
            if (r7 != r6) goto L_0x004c
            r7 = 0
        L_0x004c:
            android.view.FocusFinder r0 = android.view.FocusFinder.getInstance()
            android.view.View r7 = r0.findNextFocus(r6, r7, r3)
            if (r7 == 0) goto L_0x005f
            if (r7 == r6) goto L_0x005f
            boolean r7 = r7.requestFocus(r3)
            if (r7 == 0) goto L_0x005f
            goto L_0x0060
        L_0x005f:
            r1 = 0
        L_0x0060:
            return r1
        L_0x0061:
            return r2
        L_0x0062:
            int r0 = r7.getAction()
            if (r0 != 0) goto L_0x00fc
            int r0 = r7.getKeyCode()
            r4 = 19
            r5 = 33
            if (r0 == r4) goto L_0x00ed
            r4 = 20
            if (r0 == r4) goto L_0x00dd
            r4 = 62
            if (r0 == r4) goto L_0x007c
            goto L_0x00fc
        L_0x007c:
            boolean r7 = r7.isShiftPressed()
            if (r7 == 0) goto L_0x0083
            goto L_0x0085
        L_0x0083:
            r5 = 130(0x82, float:1.82E-43)
        L_0x0085:
            if (r5 != r3) goto L_0x0089
            r7 = 1
            goto L_0x008a
        L_0x0089:
            r7 = 0
        L_0x008a:
            int r0 = r6.getHeight()
            if (r7 == 0) goto L_0x00c1
            android.graphics.Rect r7 = r6.f216f
            int r3 = r6.getScrollY()
            int r3 = r3 + r0
            r7.top = r3
            int r7 = r6.getChildCount()
            if (r7 <= 0) goto L_0x00d2
            int r7 = r7 - r1
            android.view.View r7 = r6.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r1 = r7.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            int r7 = r7.getBottom()
            int r1 = r1.bottomMargin
            int r7 = r7 + r1
            int r1 = r6.getPaddingBottom()
            int r1 = r1 + r7
            android.graphics.Rect r7 = r6.f216f
            int r3 = r7.top
            int r3 = r3 + r0
            if (r3 <= r1) goto L_0x00d2
            int r1 = r1 - r0
            r7.top = r1
            goto L_0x00d2
        L_0x00c1:
            android.graphics.Rect r7 = r6.f216f
            int r1 = r6.getScrollY()
            int r1 = r1 - r0
            r7.top = r1
            android.graphics.Rect r7 = r6.f216f
            int r1 = r7.top
            if (r1 >= 0) goto L_0x00d2
            r7.top = r2
        L_0x00d2:
            android.graphics.Rect r7 = r6.f216f
            int r1 = r7.top
            int r0 = r0 + r1
            r7.bottom = r0
            r6.a((int) r5, (int) r1, (int) r0)
            goto L_0x00fc
        L_0x00dd:
            boolean r7 = r7.isAltPressed()
            if (r7 != 0) goto L_0x00e8
            boolean r2 = r6.a((int) r3)
            goto L_0x00fc
        L_0x00e8:
            boolean r2 = r6.d(r3)
            goto L_0x00fc
        L_0x00ed:
            boolean r7 = r7.isAltPressed()
            if (r7 != 0) goto L_0x00f8
            boolean r2 = r6.a((int) r5)
            goto L_0x00fc
        L_0x00f8:
            boolean r2 = r6.d(r5)
        L_0x00fc:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.a(android.view.KeyEvent):boolean");
    }

    public final void a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.u) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.f220j = (int) motionEvent.getY(i2);
            this.u = motionEvent.getPointerId(i2);
            VelocityTracker velocityTracker = this.f225o;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0083 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(int r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20) {
        /*
            r12 = this;
            r0 = r12
            int r1 = r12.getOverScrollMode()
            int r2 = super.computeHorizontalScrollRange()
            int r3 = super.computeHorizontalScrollExtent()
            r4 = 0
            r5 = 1
            if (r2 <= r3) goto L_0x0013
            r2 = 1
            goto L_0x0014
        L_0x0013:
            r2 = 0
        L_0x0014:
            int r3 = r12.computeVerticalScrollRange()
            int r6 = super.computeVerticalScrollExtent()
            if (r3 <= r6) goto L_0x0020
            r3 = 1
            goto L_0x0021
        L_0x0020:
            r3 = 0
        L_0x0021:
            if (r1 == 0) goto L_0x002a
            if (r1 != r5) goto L_0x0028
            if (r2 == 0) goto L_0x0028
            goto L_0x002a
        L_0x0028:
            r2 = 0
            goto L_0x002b
        L_0x002a:
            r2 = 1
        L_0x002b:
            if (r1 == 0) goto L_0x0034
            if (r1 != r5) goto L_0x0032
            if (r3 == 0) goto L_0x0032
            goto L_0x0034
        L_0x0032:
            r1 = 0
            goto L_0x0035
        L_0x0034:
            r1 = 1
        L_0x0035:
            int r3 = r15 + r13
            if (r2 != 0) goto L_0x003b
            r2 = 0
            goto L_0x003d
        L_0x003b:
            r2 = r19
        L_0x003d:
            int r6 = r16 + r14
            if (r1 != 0) goto L_0x0043
            r1 = 0
            goto L_0x0045
        L_0x0043:
            r1 = r20
        L_0x0045:
            int r7 = -r2
            int r2 = r2 + r17
            int r8 = -r1
            int r1 = r1 + r18
            if (r3 <= r2) goto L_0x0050
            r3 = r2
        L_0x004e:
            r2 = 1
            goto L_0x0055
        L_0x0050:
            if (r3 >= r7) goto L_0x0054
            r3 = r7
            goto L_0x004e
        L_0x0054:
            r2 = 0
        L_0x0055:
            if (r6 <= r1) goto L_0x005a
            r6 = r1
        L_0x0058:
            r1 = 1
            goto L_0x005f
        L_0x005a:
            if (r6 >= r8) goto L_0x005e
            r6 = r8
            goto L_0x0058
        L_0x005e:
            r1 = 0
        L_0x005f:
            if (r1 == 0) goto L_0x007e
            boolean r7 = r12.e(r5)
            if (r7 != 0) goto L_0x007e
            android.widget.OverScroller r7 = r0.f217g
            r8 = 0
            r9 = 0
            r10 = 0
            int r11 = r12.getScrollRange()
            r13 = r7
            r14 = r3
            r15 = r6
            r16 = r8
            r17 = r9
            r18 = r10
            r19 = r11
            r13.springBack(r14, r15, r16, r17, r18, r19)
        L_0x007e:
            super.scrollTo(r3, r6)
            if (r2 != 0) goto L_0x0085
            if (r1 == 0) goto L_0x0086
        L_0x0085:
            r4 = 1
        L_0x0086:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.a(int, int, int, int, int, int, int, int):boolean");
    }

    public final boolean a(int i2, int i3, int i4) {
        boolean z2;
        int i5 = i2;
        int i6 = i3;
        int i7 = i4;
        int height = getHeight();
        int scrollY = getScrollY();
        int i8 = height + scrollY;
        boolean z3 = i5 == 33;
        ArrayList focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z4 = false;
        for (int i9 = 0; i9 < size; i9++) {
            View view2 = (View) focusables.get(i9);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i6 < bottom && top < i7) {
                boolean z5 = i6 < top && bottom < i7;
                if (view == null) {
                    view = view2;
                    z4 = z5;
                } else {
                    boolean z6 = (z3 && top < view.getTop()) || (!z3 && bottom > view.getBottom());
                    if (z4) {
                        if (z5) {
                            if (!z6) {
                            }
                        }
                    } else if (z5) {
                        view = view2;
                        z4 = true;
                    } else if (!z6) {
                    }
                    view = view2;
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (i6 < scrollY || i7 > i8) {
            b(z3 ? i6 - scrollY : i7 - i8);
            z2 = true;
        } else {
            z2 = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i5);
        }
        return z2;
    }

    public boolean a(int i2) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i2);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !a(findNextFocus, maxScrollAmount, getHeight())) {
            if (i2 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i2 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i2 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            b(maxScrollAmount);
        } else {
            findNextFocus.getDrawingRect(this.f216f);
            offsetDescendantRectToMyCoords(findNextFocus, this.f216f);
            b(a(this.f216f));
            findNextFocus.requestFocus(i2);
        }
        if (findFocus != null && findFocus.isFocused() && (!a(findFocus, 0, getHeight()))) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    public final boolean a(View view, int i2, int i3) {
        view.getDrawingRect(this.f216f);
        offsetDescendantRectToMyCoords(view, this.f216f);
        return this.f216f.bottom + i2 >= getScrollY() && this.f216f.top - i2 <= getScrollY() + i3;
    }

    public final void a(int i2, int i3, int i4, boolean z2) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.e > 250) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int scrollY = getScrollY();
                OverScroller overScroller = this.f217g;
                int scrollX = getScrollX();
                overScroller.startScroll(scrollX, scrollY, 0, Math.max(0, Math.min(i3 + scrollY, Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom())))) - scrollY, i4);
                a(z2);
            } else {
                if (!this.f217g.isFinished()) {
                    a();
                }
                scrollBy(i2, i3);
            }
            this.e = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    public final void a(boolean z2) {
        if (z2) {
            a(2, 1);
        } else {
            this.B.c(1);
        }
        this.y = getScrollY();
        m.B(this);
    }

    public final void a() {
        this.f217g.abortAnimation();
        this.B.c(1);
    }

    public final void a(View view) {
        view.getDrawingRect(this.f216f);
        offsetDescendantRectToMyCoords(view, this.f216f);
        int a2 = a(this.f216f);
        if (a2 != 0) {
            scrollBy(0, a2);
        }
    }

    public int a(Rect rect) {
        int i2;
        int i3;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i5 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i4 - verticalFadingEdgeLength : i4;
        if (rect.bottom > i5 && rect.top > scrollY) {
            if (rect.height() > height) {
                i3 = rect.top - scrollY;
            } else {
                i3 = rect.bottom - i5;
            }
            return Math.min(i3 + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i4);
        } else if (rect.top >= scrollY || rect.bottom >= i5) {
            return 0;
        } else {
            if (rect.height() > height) {
                i2 = 0 - (i5 - rect.bottom);
            } else {
                i2 = 0 - (scrollY - rect.top);
            }
            return Math.max(i2, -getScrollY());
        }
    }

    public static boolean a(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        if (!(parent instanceof ViewGroup) || !a((View) parent, view2)) {
            return false;
        }
        return true;
    }
}
