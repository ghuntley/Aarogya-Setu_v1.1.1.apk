package h.j.b;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import com.crashlytics.android.answers.AnswersRetryFilesSender;
import h.h.m.m;
import java.util.Arrays;

/* compiled from: ViewDragHelper */
public class e {
    public static final Interpolator v = new a();
    public int a;

    /* renamed from: b  reason: collision with root package name */
    public int f1880b;
    public int c = -1;
    public float[] d;
    public float[] e;

    /* renamed from: f  reason: collision with root package name */
    public float[] f1881f;

    /* renamed from: g  reason: collision with root package name */
    public float[] f1882g;

    /* renamed from: h  reason: collision with root package name */
    public int[] f1883h;

    /* renamed from: i  reason: collision with root package name */
    public int[] f1884i;

    /* renamed from: j  reason: collision with root package name */
    public int[] f1885j;

    /* renamed from: k  reason: collision with root package name */
    public int f1886k;

    /* renamed from: l  reason: collision with root package name */
    public VelocityTracker f1887l;

    /* renamed from: m  reason: collision with root package name */
    public float f1888m;

    /* renamed from: n  reason: collision with root package name */
    public float f1889n;

    /* renamed from: o  reason: collision with root package name */
    public int f1890o;

    /* renamed from: p  reason: collision with root package name */
    public OverScroller f1891p;

    /* renamed from: q  reason: collision with root package name */
    public final c f1892q;
    public View r;
    public boolean s;
    public final ViewGroup t;
    public final Runnable u = new b();

    /* compiled from: ViewDragHelper */
    public static class a implements Interpolator {
        public float getInterpolation(float f2) {
            float f3 = f2 - 1.0f;
            return (f3 * f3 * f3 * f3 * f3) + 1.0f;
        }
    }

    /* compiled from: ViewDragHelper */
    public class b implements Runnable {
        public b() {
        }

        public void run() {
            e.this.c(0);
        }
    }

    /* compiled from: ViewDragHelper */
    public static abstract class c {
        public int a(View view) {
            return 0;
        }

        public abstract int a(View view, int i2, int i3);

        public abstract void a(int i2);

        public abstract void a(View view, float f2, float f3);

        public void a(View view, int i2) {
        }

        public abstract void a(View view, int i2, int i3, int i4, int i5);

        public int b(View view) {
            return 0;
        }

        public abstract int b(View view, int i2, int i3);

        public abstract boolean b(View view, int i2);
    }

    public e(Context context, ViewGroup viewGroup, c cVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (cVar != null) {
            this.t = viewGroup;
            this.f1892q = cVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.f1890o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.f1880b = viewConfiguration.getScaledTouchSlop();
            this.f1888m = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.f1889n = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.f1891p = new OverScroller(context, v);
        } else {
            throw new IllegalArgumentException("Callback may not be null");
        }
    }

    public void a(View view, int i2) {
        if (view.getParent() == this.t) {
            this.r = view;
            this.c = i2;
            this.f1892q.a(view, i2);
            c(1);
            return;
        }
        StringBuilder a2 = i.a.a.a.a.a("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
        a2.append(this.t);
        a2.append(")");
        throw new IllegalArgumentException(a2.toString());
    }

    public boolean b(int i2, int i3) {
        if (this.s) {
            return a(i2, i3, (int) this.f1887l.getXVelocity(this.c), (int) this.f1887l.getYVelocity(this.c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    public void c(int i2) {
        this.t.removeCallbacks(this.u);
        if (this.a != i2) {
            this.a = i2;
            this.f1892q.a(i2);
            if (this.a == 0) {
                this.r = null;
            }
        }
    }

    public void a() {
        this.c = -1;
        float[] fArr = this.d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.e, 0.0f);
            Arrays.fill(this.f1881f, 0.0f);
            Arrays.fill(this.f1882g, 0.0f);
            Arrays.fill(this.f1883h, 0);
            Arrays.fill(this.f1884i, 0);
            Arrays.fill(this.f1885j, 0);
            this.f1886k = 0;
        }
        VelocityTracker velocityTracker = this.f1887l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f1887l = null;
        }
    }

    public final int b(int i2, int i3, int i4) {
        int i5;
        if (i2 == 0) {
            return 0;
        }
        int width = this.t.getWidth();
        float f2 = (float) (width / 2);
        float sin = (((float) Math.sin((double) ((Math.min(1.0f, ((float) Math.abs(i2)) / ((float) width)) - 0.5f) * 0.47123894f))) * f2) + f2;
        int abs = Math.abs(i3);
        if (abs > 0) {
            i5 = Math.round(Math.abs(sin / ((float) abs)) * 1000.0f) * 4;
        } else {
            i5 = (int) (((((float) Math.abs(i2)) / ((float) i4)) + 1.0f) * 256.0f);
        }
        return Math.min(i5, 600);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00db, code lost:
        if (r12 != r11) goto L_0x00e4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean c(android.view.MotionEvent r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            int r2 = r17.getActionMasked()
            int r3 = r17.getActionIndex()
            if (r2 != 0) goto L_0x0011
            r16.a()
        L_0x0011:
            android.view.VelocityTracker r4 = r0.f1887l
            if (r4 != 0) goto L_0x001b
            android.view.VelocityTracker r4 = android.view.VelocityTracker.obtain()
            r0.f1887l = r4
        L_0x001b:
            android.view.VelocityTracker r4 = r0.f1887l
            r4.addMovement(r1)
            r4 = 0
            r5 = 2
            r6 = 0
            r7 = 1
            if (r2 == 0) goto L_0x0103
            if (r2 == r7) goto L_0x00fe
            if (r2 == r5) goto L_0x006e
            r8 = 3
            if (r2 == r8) goto L_0x00fe
            r8 = 5
            if (r2 == r8) goto L_0x003e
            r4 = 6
            if (r2 == r4) goto L_0x0036
        L_0x0033:
            r2 = 0
            goto L_0x0132
        L_0x0036:
            int r1 = r1.getPointerId(r3)
            r0.a((int) r1)
            goto L_0x0033
        L_0x003e:
            int r2 = r1.getPointerId(r3)
            float r8 = r1.getX(r3)
            float r1 = r1.getY(r3)
            r0.b((float) r8, (float) r1, (int) r2)
            int r3 = r0.a
            if (r3 != 0) goto L_0x005e
            int[] r1 = r0.f1883h
            r1 = r1[r2]
            r1 = r1 & r6
            if (r1 == 0) goto L_0x0033
            h.j.b.e$c r1 = r0.f1892q
            if (r1 == 0) goto L_0x005d
            goto L_0x0033
        L_0x005d:
            throw r4
        L_0x005e:
            if (r3 != r5) goto L_0x0033
            int r3 = (int) r8
            int r1 = (int) r1
            android.view.View r1 = r0.a((int) r3, (int) r1)
            android.view.View r3 = r0.r
            if (r1 != r3) goto L_0x0033
            r0.b((android.view.View) r1, (int) r2)
            goto L_0x0033
        L_0x006e:
            float[] r2 = r0.d
            if (r2 == 0) goto L_0x0033
            float[] r2 = r0.e
            if (r2 != 0) goto L_0x0077
            goto L_0x0033
        L_0x0077:
            int r2 = r17.getPointerCount()
            r3 = 0
        L_0x007c:
            if (r3 >= r2) goto L_0x00f9
            int r4 = r1.getPointerId(r3)
            boolean r5 = r0.b((int) r4)
            if (r5 != 0) goto L_0x008a
            goto L_0x00f5
        L_0x008a:
            float r5 = r1.getX(r3)
            float r8 = r1.getY(r3)
            float[] r9 = r0.d
            r9 = r9[r4]
            float r9 = r5 - r9
            float[] r10 = r0.e
            r10 = r10[r4]
            float r10 = r8 - r10
            int r5 = (int) r5
            int r8 = (int) r8
            android.view.View r5 = r0.a((int) r5, (int) r8)
            if (r5 == 0) goto L_0x00ae
            boolean r8 = r0.a((android.view.View) r5, (float) r9, (float) r10)
            if (r8 == 0) goto L_0x00ae
            r8 = 1
            goto L_0x00af
        L_0x00ae:
            r8 = 0
        L_0x00af:
            if (r8 == 0) goto L_0x00e4
            int r11 = r5.getLeft()
            int r12 = (int) r9
            int r13 = r11 + r12
            h.j.b.e$c r14 = r0.f1892q
            int r12 = r14.a((android.view.View) r5, (int) r13, (int) r12)
            int r13 = r5.getTop()
            int r14 = (int) r10
            int r15 = r13 + r14
            h.j.b.e$c r6 = r0.f1892q
            int r6 = r6.b(r5, r15, r14)
            h.j.b.e$c r14 = r0.f1892q
            int r14 = r14.a((android.view.View) r5)
            h.j.b.e$c r15 = r0.f1892q
            int r15 = r15.b(r5)
            if (r14 == 0) goto L_0x00dd
            if (r14 <= 0) goto L_0x00e4
            if (r12 != r11) goto L_0x00e4
        L_0x00dd:
            if (r15 == 0) goto L_0x00f9
            if (r15 <= 0) goto L_0x00e4
            if (r6 != r13) goto L_0x00e4
            goto L_0x00f9
        L_0x00e4:
            r0.a((float) r9, (float) r10, (int) r4)
            int r6 = r0.a
            if (r6 != r7) goto L_0x00ec
            goto L_0x00f9
        L_0x00ec:
            if (r8 == 0) goto L_0x00f5
            boolean r4 = r0.b((android.view.View) r5, (int) r4)
            if (r4 == 0) goto L_0x00f5
            goto L_0x00f9
        L_0x00f5:
            int r3 = r3 + 1
            r6 = 0
            goto L_0x007c
        L_0x00f9:
            r16.b((android.view.MotionEvent) r17)
            goto L_0x0033
        L_0x00fe:
            r16.a()
            goto L_0x0033
        L_0x0103:
            float r2 = r17.getX()
            float r3 = r17.getY()
            r6 = 0
            int r1 = r1.getPointerId(r6)
            r0.b((float) r2, (float) r3, (int) r1)
            int r2 = (int) r2
            int r3 = (int) r3
            android.view.View r2 = r0.a((int) r2, (int) r3)
            android.view.View r3 = r0.r
            if (r2 != r3) goto L_0x0124
            int r3 = r0.a
            if (r3 != r5) goto L_0x0124
            r0.b((android.view.View) r2, (int) r1)
        L_0x0124:
            int[] r2 = r0.f1883h
            r1 = r2[r1]
            r2 = 0
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0132
            h.j.b.e$c r1 = r0.f1892q
            if (r1 == 0) goto L_0x0131
            goto L_0x0132
        L_0x0131:
            throw r4
        L_0x0132:
            int r1 = r0.a
            if (r1 != r7) goto L_0x0138
            r6 = 1
            goto L_0x0139
        L_0x0138:
            r6 = 0
        L_0x0139:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: h.j.b.e.c(android.view.MotionEvent):boolean");
    }

    public final void b(float f2, float f3, int i2) {
        float[] fArr = this.d;
        int i3 = 0;
        if (fArr == null || fArr.length <= i2) {
            int i4 = i2 + 1;
            float[] fArr2 = new float[i4];
            float[] fArr3 = new float[i4];
            float[] fArr4 = new float[i4];
            float[] fArr5 = new float[i4];
            int[] iArr = new int[i4];
            int[] iArr2 = new int[i4];
            int[] iArr3 = new int[i4];
            float[] fArr6 = this.d;
            if (fArr6 != null) {
                System.arraycopy(fArr6, 0, fArr2, 0, fArr6.length);
                float[] fArr7 = this.e;
                System.arraycopy(fArr7, 0, fArr3, 0, fArr7.length);
                float[] fArr8 = this.f1881f;
                System.arraycopy(fArr8, 0, fArr4, 0, fArr8.length);
                float[] fArr9 = this.f1882g;
                System.arraycopy(fArr9, 0, fArr5, 0, fArr9.length);
                int[] iArr4 = this.f1883h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f1884i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f1885j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.d = fArr2;
            this.e = fArr3;
            this.f1881f = fArr4;
            this.f1882g = fArr5;
            this.f1883h = iArr;
            this.f1884i = iArr2;
            this.f1885j = iArr3;
        }
        float[] fArr10 = this.d;
        this.f1881f[i2] = f2;
        fArr10[i2] = f2;
        float[] fArr11 = this.e;
        this.f1882g[i2] = f3;
        fArr11[i2] = f3;
        int[] iArr7 = this.f1883h;
        int i5 = (int) f2;
        int i6 = (int) f3;
        if (i5 < this.t.getLeft() + this.f1890o) {
            i3 = 1;
        }
        if (i6 < this.t.getTop() + this.f1890o) {
            i3 |= 4;
        }
        if (i5 > this.t.getRight() - this.f1890o) {
            i3 |= 2;
        }
        if (i6 > this.t.getBottom() - this.f1890o) {
            i3 |= 8;
        }
        iArr7[i2] = i3;
        this.f1886k |= 1 << i2;
    }

    public final boolean a(int i2, int i3, int i4, int i5) {
        float f2;
        float f3;
        float f4;
        float f5;
        int left = this.r.getLeft();
        int top = this.r.getTop();
        int i6 = i2 - left;
        int i7 = i3 - top;
        if (i6 == 0 && i7 == 0) {
            this.f1891p.abortAnimation();
            c(0);
            return false;
        }
        View view = this.r;
        int a2 = a(i4, (int) this.f1889n, (int) this.f1888m);
        int a3 = a(i5, (int) this.f1889n, (int) this.f1888m);
        int abs = Math.abs(i6);
        int abs2 = Math.abs(i7);
        int abs3 = Math.abs(a2);
        int abs4 = Math.abs(a3);
        int i8 = abs3 + abs4;
        int i9 = abs + abs2;
        if (a2 != 0) {
            f2 = (float) abs3;
            f3 = (float) i8;
        } else {
            f2 = (float) abs;
            f3 = (float) i9;
        }
        float f6 = f2 / f3;
        if (a3 != 0) {
            f5 = (float) abs4;
            f4 = (float) i8;
        } else {
            f5 = (float) abs2;
            f4 = (float) i9;
        }
        int b2 = b(i6, a2, this.f1892q.a(view));
        float b3 = ((float) b(i7, a3, this.f1892q.b(view))) * (f5 / f4);
        this.f1891p.startScroll(left, top, i6, i7, (int) (b3 + (((float) b2) * f6)));
        c(2);
        return true;
    }

    public final int a(int i2, int i3, int i4) {
        int abs = Math.abs(i2);
        if (abs < i3) {
            return 0;
        }
        if (abs > i4) {
            return i2 > 0 ? i4 : -i4;
        }
        return i2;
    }

    public final float a(float f2, float f3, float f4) {
        float abs = Math.abs(f2);
        if (abs < f3) {
            return 0.0f;
        }
        if (abs > f4) {
            return f2 > 0.0f ? f4 : -f4;
        }
        return f2;
    }

    public boolean a(boolean z) {
        if (this.a == 2) {
            boolean computeScrollOffset = this.f1891p.computeScrollOffset();
            int currX = this.f1891p.getCurrX();
            int currY = this.f1891p.getCurrY();
            int left = currX - this.r.getLeft();
            int top = currY - this.r.getTop();
            if (left != 0) {
                m.d(this.r, left);
            }
            if (top != 0) {
                m.e(this.r, top);
            }
            if (!(left == 0 && top == 0)) {
                this.f1892q.a(this.r, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.f1891p.getFinalX() && currY == this.f1891p.getFinalY()) {
                this.f1891p.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                if (z) {
                    this.t.post(this.u);
                } else {
                    c(0);
                }
            }
        }
        if (this.a == 2) {
            return true;
        }
        return false;
    }

    public final void b(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i2 = 0; i2 < pointerCount; i2++) {
            int pointerId = motionEvent.getPointerId(i2);
            if (b(pointerId)) {
                float x = motionEvent.getX(i2);
                float y = motionEvent.getY(i2);
                this.f1881f[pointerId] = x;
                this.f1882g[pointerId] = y;
            }
        }
    }

    public final void a(float f2, float f3) {
        this.s = true;
        this.f1892q.a(this.r, f2, f3);
        this.s = false;
        if (this.a == 1) {
            c(0);
        }
    }

    public final boolean b(int i2) {
        if ((this.f1886k & (1 << i2)) != 0) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i2 + " because ACTION_DOWN was not received " + "for this pointer before ACTION_MOVE. It likely happened because " + " ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public final void a(int i2) {
        if (this.d != null) {
            boolean z = true;
            int i3 = 1 << i2;
            if ((this.f1886k & i3) == 0) {
                z = false;
            }
            if (z) {
                this.d[i2] = 0.0f;
                this.e[i2] = 0.0f;
                this.f1881f[i2] = 0.0f;
                this.f1882g[i2] = 0.0f;
                this.f1883h[i2] = 0;
                this.f1884i[i2] = 0;
                this.f1885j[i2] = 0;
                this.f1886k &= ~i3;
            }
        }
    }

    public boolean b(View view, int i2) {
        if (view == this.r && this.c == i2) {
            return true;
        }
        if (view == null || !this.f1892q.b(view, i2)) {
            return false;
        }
        this.c = i2;
        a(view, i2);
        return true;
    }

    public final void b() {
        this.f1887l.computeCurrentVelocity(AnswersRetryFilesSender.BACKOFF_MS, this.f1888m);
        a(a(this.f1887l.getXVelocity(this.c), this.f1889n, this.f1888m), a(this.f1887l.getYVelocity(this.c), this.f1889n, this.f1888m));
    }

    public void a(MotionEvent motionEvent) {
        int i2;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f1887l == null) {
            this.f1887l = VelocityTracker.obtain();
        }
        this.f1887l.addMovement(motionEvent);
        int i3 = 0;
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View a2 = a((int) x, (int) y);
            b(x, y, pointerId);
            b(a2, pointerId);
            if ((this.f1883h[pointerId] & 0) != 0 && this.f1892q == null) {
                throw null;
            }
        } else if (actionMasked == 1) {
            if (this.a == 1) {
                b();
            }
            a();
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.a == 1) {
                    a(0.0f, 0.0f);
                }
                a();
            } else if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x2 = motionEvent.getX(actionIndex);
                float y2 = motionEvent.getY(actionIndex);
                b(x2, y2, pointerId2);
                if (this.a == 0) {
                    b(a((int) x2, (int) y2), pointerId2);
                    if ((this.f1883h[pointerId2] & 0) != 0 && this.f1892q == null) {
                        throw null;
                    }
                    return;
                }
                int i4 = (int) x2;
                int i5 = (int) y2;
                View view = this.r;
                if (view != null && i4 >= view.getLeft() && i4 < view.getRight() && i5 >= view.getTop() && i5 < view.getBottom()) {
                    i3 = 1;
                }
                if (i3 != 0) {
                    b(this.r, pointerId2);
                }
            } else if (actionMasked == 6) {
                int pointerId3 = motionEvent.getPointerId(actionIndex);
                if (this.a == 1 && pointerId3 == this.c) {
                    int pointerCount = motionEvent.getPointerCount();
                    while (true) {
                        if (i3 >= pointerCount) {
                            i2 = -1;
                            break;
                        }
                        int pointerId4 = motionEvent.getPointerId(i3);
                        if (pointerId4 != this.c) {
                            View a3 = a((int) motionEvent.getX(i3), (int) motionEvent.getY(i3));
                            View view2 = this.r;
                            if (a3 == view2 && b(view2, pointerId4)) {
                                i2 = this.c;
                                break;
                            }
                        }
                        i3++;
                    }
                    if (i2 == -1) {
                        b();
                    }
                }
                a(pointerId3);
            }
        } else if (this.a != 1) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (i3 < pointerCount2) {
                int pointerId5 = motionEvent.getPointerId(i3);
                if (b(pointerId5)) {
                    float x3 = motionEvent.getX(i3);
                    float y3 = motionEvent.getY(i3);
                    float f2 = x3 - this.d[pointerId5];
                    float f3 = y3 - this.e[pointerId5];
                    a(f2, f3, pointerId5);
                    if (this.a != 1) {
                        View a4 = a((int) x3, (int) y3);
                        if (a(a4, f2, f3) && b(a4, pointerId5)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                i3++;
            }
            b(motionEvent);
        } else if (b(this.c)) {
            int findPointerIndex = motionEvent.findPointerIndex(this.c);
            float x4 = motionEvent.getX(findPointerIndex);
            float y4 = motionEvent.getY(findPointerIndex);
            float[] fArr = this.f1881f;
            int i6 = this.c;
            int i7 = (int) (x4 - fArr[i6]);
            int i8 = (int) (y4 - this.f1882g[i6]);
            int left = this.r.getLeft() + i7;
            int top = this.r.getTop() + i8;
            int left2 = this.r.getLeft();
            int top2 = this.r.getTop();
            if (i7 != 0) {
                left = this.f1892q.a(this.r, left, i7);
                m.d(this.r, left - left2);
            }
            int i9 = left;
            if (i8 != 0) {
                top = this.f1892q.b(this.r, top, i8);
                m.e(this.r, top - top2);
            }
            int i10 = top;
            if (!(i7 == 0 && i8 == 0)) {
                this.f1892q.a(this.r, i9, i10, i9 - left2, i10 - top2);
            }
            b(motionEvent);
        }
    }

    public final void a(float f2, float f3, int i2) {
        int i3 = 1;
        if (!a(f2, f3, i2, 1)) {
            i3 = 0;
        }
        if (a(f3, f2, i2, 4)) {
            i3 |= 4;
        }
        if (a(f2, f3, i2, 2)) {
            i3 |= 2;
        }
        if (a(f3, f2, i2, 8)) {
            i3 |= 8;
        }
        if (i3 != 0) {
            int[] iArr = this.f1884i;
            iArr[i2] = iArr[i2] | i3;
            if (this.f1892q == null) {
                throw null;
            }
        }
    }

    public final boolean a(float f2, float f3, int i2, int i3) {
        float abs = Math.abs(f2);
        float abs2 = Math.abs(f3);
        if ((this.f1883h[i2] & i3) != i3 || (0 & i3) == 0 || (this.f1885j[i2] & i3) == i3 || (this.f1884i[i2] & i3) == i3) {
            return false;
        }
        int i4 = this.f1880b;
        if (abs <= ((float) i4) && abs2 <= ((float) i4)) {
            return false;
        }
        if (abs < abs2 * 0.5f && this.f1892q == null) {
            throw null;
        } else if ((this.f1884i[i2] & i3) != 0 || abs <= ((float) this.f1880b)) {
            return false;
        } else {
            return true;
        }
    }

    public final boolean a(View view, float f2, float f3) {
        if (view == null) {
            return false;
        }
        boolean z = this.f1892q.a(view) > 0;
        boolean z2 = this.f1892q.b(view) > 0;
        if (z && z2) {
            float f4 = f3 * f3;
            int i2 = this.f1880b;
            if (f4 + (f2 * f2) > ((float) (i2 * i2))) {
                return true;
            }
            return false;
        } else if (z) {
            if (Math.abs(f2) > ((float) this.f1880b)) {
                return true;
            }
            return false;
        } else if (!z2 || Math.abs(f3) <= ((float) this.f1880b)) {
            return false;
        } else {
            return true;
        }
    }

    public View a(int i2, int i3) {
        int childCount = this.t.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                return null;
            }
            ViewGroup viewGroup = this.t;
            if (this.f1892q != null) {
                View childAt = viewGroup.getChildAt(childCount);
                if (i2 >= childAt.getLeft() && i2 < childAt.getRight() && i3 >= childAt.getTop() && i3 < childAt.getBottom()) {
                    return childAt;
                }
            } else {
                throw null;
            }
        }
    }
}
