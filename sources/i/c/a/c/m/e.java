package i.c.a.c.m;

import android.content.Context;
import android.util.AttributeSet;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;

/* compiled from: HeaderBehavior */
public abstract class e<V extends View> extends g<V> {
    public Runnable d;
    public OverScroller e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f4157f;

    /* renamed from: g  reason: collision with root package name */
    public int f4158g = -1;

    /* renamed from: h  reason: collision with root package name */
    public int f4159h;

    /* renamed from: i  reason: collision with root package name */
    public int f4160i = -1;

    /* renamed from: j  reason: collision with root package name */
    public VelocityTracker f4161j;

    /* compiled from: HeaderBehavior */
    public class a implements Runnable {
        public final CoordinatorLayout e;

        /* renamed from: f  reason: collision with root package name */
        public final V f4162f;

        public a(CoordinatorLayout coordinatorLayout, V v) {
            this.e = coordinatorLayout;
            this.f4162f = v;
        }

        public void run() {
            OverScroller overScroller;
            if (this.f4162f != null && (overScroller = e.this.e) != null) {
                if (overScroller.computeScrollOffset()) {
                    e eVar = e.this;
                    eVar.c(this.e, this.f4162f, eVar.e.getCurrY());
                    this.f4162f.postOnAnimation(this);
                    return;
                }
                e eVar2 = e.this;
                CoordinatorLayout coordinatorLayout = this.e;
                V v = this.f4162f;
                AppBarLayout.BaseBehavior baseBehavior = (AppBarLayout.BaseBehavior) eVar2;
                if (baseBehavior != null) {
                    AppBarLayout appBarLayout = (AppBarLayout) v;
                    baseBehavior.a(coordinatorLayout, appBarLayout);
                    if (appBarLayout.f532m) {
                        appBarLayout.a(appBarLayout.a(baseBehavior.a(coordinatorLayout)));
                        return;
                    }
                    return;
                }
                throw null;
            }
        }
    }

    public e() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005c, code lost:
        r5 = (android.view.View) r5.get();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(androidx.coordinatorlayout.widget.CoordinatorLayout r8, V r9, android.view.MotionEvent r10) {
        /*
            r7 = this;
            int r0 = r7.f4160i
            if (r0 >= 0) goto L_0x0012
            android.content.Context r0 = r8.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r0 = r0.getScaledTouchSlop()
            r7.f4160i = r0
        L_0x0012:
            int r0 = r10.getActionMasked()
            r1 = 2
            r2 = 1
            r3 = -1
            r4 = 0
            if (r0 != r1) goto L_0x0040
            boolean r0 = r7.f4157f
            if (r0 == 0) goto L_0x0040
            int r0 = r7.f4158g
            if (r0 != r3) goto L_0x0025
            return r4
        L_0x0025:
            int r0 = r10.findPointerIndex(r0)
            if (r0 != r3) goto L_0x002c
            return r4
        L_0x002c:
            float r0 = r10.getY(r0)
            int r0 = (int) r0
            int r1 = r7.f4159h
            int r1 = r0 - r1
            int r1 = java.lang.Math.abs(r1)
            int r5 = r7.f4160i
            if (r1 <= r5) goto L_0x0040
            r7.f4159h = r0
            return r2
        L_0x0040:
            int r0 = r10.getActionMasked()
            if (r0 != 0) goto L_0x00a5
            r7.f4158g = r3
            float r0 = r10.getX()
            int r0 = (int) r0
            float r1 = r10.getY()
            int r1 = (int) r1
            r5 = r7
            com.google.android.material.appbar.AppBarLayout$BaseBehavior r5 = (com.google.android.material.appbar.AppBarLayout.BaseBehavior) r5
            r6 = r9
            com.google.android.material.appbar.AppBarLayout r6 = (com.google.android.material.appbar.AppBarLayout) r6
            java.lang.ref.WeakReference<android.view.View> r5 = r5.f543q
            if (r5 == 0) goto L_0x0073
            java.lang.Object r5 = r5.get()
            android.view.View r5 = (android.view.View) r5
            if (r5 == 0) goto L_0x0071
            boolean r6 = r5.isShown()
            if (r6 == 0) goto L_0x0071
            boolean r3 = r5.canScrollVertically(r3)
            if (r3 != 0) goto L_0x0071
            goto L_0x0073
        L_0x0071:
            r3 = 0
            goto L_0x0074
        L_0x0073:
            r3 = 1
        L_0x0074:
            if (r3 == 0) goto L_0x007e
            boolean r8 = r8.a((android.view.View) r9, (int) r0, (int) r1)
            if (r8 == 0) goto L_0x007e
            r8 = 1
            goto L_0x007f
        L_0x007e:
            r8 = 0
        L_0x007f:
            r7.f4157f = r8
            if (r8 == 0) goto L_0x00a5
            r7.f4159h = r1
            int r8 = r10.getPointerId(r4)
            r7.f4158g = r8
            android.view.VelocityTracker r8 = r7.f4161j
            if (r8 != 0) goto L_0x0095
            android.view.VelocityTracker r8 = android.view.VelocityTracker.obtain()
            r7.f4161j = r8
        L_0x0095:
            android.widget.OverScroller r8 = r7.e
            if (r8 == 0) goto L_0x00a5
            boolean r8 = r8.isFinished()
            if (r8 != 0) goto L_0x00a5
            android.widget.OverScroller r8 = r7.e
            r8.abortAnimation()
            return r2
        L_0x00a5:
            android.view.VelocityTracker r8 = r7.f4161j
            if (r8 == 0) goto L_0x00ac
            r8.addMovement(r10)
        L_0x00ac:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.a.c.m.e.a(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    public abstract int b(CoordinatorLayout coordinatorLayout, V v, int i2, int i3, int i4);

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ee A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:44:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean b(androidx.coordinatorlayout.widget.CoordinatorLayout r21, V r22, android.view.MotionEvent r23) {
        /*
            r20 = this;
            r6 = r20
            r1 = r21
            r2 = r22
            r7 = r23
            int r0 = r23.getActionMasked()
            r3 = 0
            r4 = -1
            r8 = 1
            r9 = 0
            if (r0 == r8) goto L_0x005e
            r5 = 2
            if (r0 == r5) goto L_0x0036
            r1 = 3
            if (r0 == r1) goto L_0x00d5
            r1 = 6
            if (r0 == r1) goto L_0x001c
            goto L_0x005b
        L_0x001c:
            int r0 = r23.getActionIndex()
            if (r0 != 0) goto L_0x0024
            r0 = 1
            goto L_0x0025
        L_0x0024:
            r0 = 0
        L_0x0025:
            int r1 = r7.getPointerId(r0)
            r6.f4158g = r1
            float r0 = r7.getY(r0)
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 + r1
            int r0 = (int) r0
            r6.f4159h = r0
            goto L_0x005b
        L_0x0036:
            int r0 = r6.f4158g
            int r0 = r7.findPointerIndex(r0)
            if (r0 != r4) goto L_0x003f
            return r9
        L_0x003f:
            float r0 = r7.getY(r0)
            int r0 = (int) r0
            int r3 = r6.f4159h
            int r3 = r3 - r0
            r6.f4159h = r0
            r0 = r2
            com.google.android.material.appbar.AppBarLayout r0 = (com.google.android.material.appbar.AppBarLayout) r0
            int r0 = r0.getDownNestedScrollRange()
            int r4 = -r0
            r5 = 0
            r0 = r20
            r1 = r21
            r2 = r22
            r0.a(r1, r2, r3, r4, r5)
        L_0x005b:
            r0 = 0
            goto L_0x00e3
        L_0x005e:
            android.view.VelocityTracker r0 = r6.f4161j
            if (r0 == 0) goto L_0x00d5
            r0.addMovement(r7)
            android.view.VelocityTracker r0 = r6.f4161j
            r5 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r5)
            android.view.VelocityTracker r0 = r6.f4161j
            int r5 = r6.f4158g
            float r0 = r0.getYVelocity(r5)
            r5 = r2
            com.google.android.material.appbar.AppBarLayout r5 = (com.google.android.material.appbar.AppBarLayout) r5
            int r10 = r5.getTotalScrollRange()
            int r10 = -r10
            r19 = 0
            java.lang.Runnable r11 = r6.d
            if (r11 == 0) goto L_0x0087
            r2.removeCallbacks(r11)
            r6.d = r3
        L_0x0087:
            android.widget.OverScroller r11 = r6.e
            if (r11 != 0) goto L_0x0096
            android.widget.OverScroller r11 = new android.widget.OverScroller
            android.content.Context r12 = r22.getContext()
            r11.<init>(r12)
            r6.e = r11
        L_0x0096:
            android.widget.OverScroller r11 = r6.e
            r12 = 0
            int r13 = r20.b()
            r14 = 0
            int r15 = java.lang.Math.round(r0)
            r16 = 0
            r17 = 0
            r18 = r10
            r11.fling(r12, r13, r14, r15, r16, r17, r18, r19)
            android.widget.OverScroller r0 = r6.e
            boolean r0 = r0.computeScrollOffset()
            if (r0 == 0) goto L_0x00be
            i.c.a.c.m.e$a r0 = new i.c.a.c.m.e$a
            r0.<init>(r1, r2)
            r6.d = r0
            h.h.m.m.a((android.view.View) r2, (java.lang.Runnable) r0)
            goto L_0x00d3
        L_0x00be:
            r0 = r6
            com.google.android.material.appbar.AppBarLayout$BaseBehavior r0 = (com.google.android.material.appbar.AppBarLayout.BaseBehavior) r0
            r0.a((androidx.coordinatorlayout.widget.CoordinatorLayout) r1, r5)
            boolean r2 = r5.f532m
            if (r2 == 0) goto L_0x00d3
            android.view.View r0 = r0.a(r1)
            boolean r0 = r5.a((android.view.View) r0)
            r5.a((boolean) r0)
        L_0x00d3:
            r0 = 1
            goto L_0x00d6
        L_0x00d5:
            r0 = 0
        L_0x00d6:
            r6.f4157f = r9
            r6.f4158g = r4
            android.view.VelocityTracker r1 = r6.f4161j
            if (r1 == 0) goto L_0x00e3
            r1.recycle()
            r6.f4161j = r3
        L_0x00e3:
            android.view.VelocityTracker r1 = r6.f4161j
            if (r1 == 0) goto L_0x00ea
            r1.addMovement(r7)
        L_0x00ea:
            boolean r1 = r6.f4157f
            if (r1 != 0) goto L_0x00f2
            if (r0 == 0) goto L_0x00f1
            goto L_0x00f2
        L_0x00f1:
            r8 = 0
        L_0x00f2:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.a.c.m.e.b(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    public abstract int c();

    public int c(CoordinatorLayout coordinatorLayout, V v, int i2) {
        return b(coordinatorLayout, v, i2, RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE);
    }

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final int a(CoordinatorLayout coordinatorLayout, V v, int i2, int i3, int i4) {
        return b(coordinatorLayout, v, c() - i2, i3, i4);
    }
}
