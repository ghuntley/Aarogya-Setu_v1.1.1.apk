package h.r.d;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import h.h.m.m;

/* compiled from: FastScroller */
public class l extends RecyclerView.n implements RecyclerView.s {
    public static final int[] D = {16842919};
    public static final int[] E = new int[0];
    public int A = 0;
    public final Runnable B = new a();
    public final RecyclerView.t C = new b();
    public final int a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2111b;
    public final StateListDrawable c;
    public final Drawable d;
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public final int f2112f;

    /* renamed from: g  reason: collision with root package name */
    public final StateListDrawable f2113g;

    /* renamed from: h  reason: collision with root package name */
    public final Drawable f2114h;

    /* renamed from: i  reason: collision with root package name */
    public final int f2115i;

    /* renamed from: j  reason: collision with root package name */
    public final int f2116j;

    /* renamed from: k  reason: collision with root package name */
    public int f2117k;

    /* renamed from: l  reason: collision with root package name */
    public int f2118l;

    /* renamed from: m  reason: collision with root package name */
    public float f2119m;

    /* renamed from: n  reason: collision with root package name */
    public int f2120n;

    /* renamed from: o  reason: collision with root package name */
    public int f2121o;

    /* renamed from: p  reason: collision with root package name */
    public float f2122p;

    /* renamed from: q  reason: collision with root package name */
    public int f2123q = 0;
    public int r = 0;
    public RecyclerView s;
    public boolean t = false;
    public boolean u = false;
    public int v = 0;
    public int w = 0;
    public final int[] x = new int[2];
    public final int[] y = new int[2];
    public final ValueAnimator z = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});

    /* compiled from: FastScroller */
    public class a implements Runnable {
        public a() {
        }

        public void run() {
            l lVar = l.this;
            int i2 = lVar.A;
            if (i2 == 1) {
                lVar.z.cancel();
            } else if (i2 != 2) {
                return;
            }
            lVar.A = 3;
            ValueAnimator valueAnimator = lVar.z;
            valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f});
            lVar.z.setDuration((long) 500);
            lVar.z.start();
        }
    }

    /* compiled from: FastScroller */
    public class b extends RecyclerView.t {
        public b() {
        }

        public void a(RecyclerView recyclerView, int i2, int i3) {
            l lVar = l.this;
            int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
            int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
            int computeVerticalScrollRange = lVar.s.computeVerticalScrollRange();
            int i4 = lVar.r;
            lVar.t = computeVerticalScrollRange - i4 > 0 && i4 >= lVar.a;
            int computeHorizontalScrollRange = lVar.s.computeHorizontalScrollRange();
            int i5 = lVar.f2123q;
            boolean z = computeHorizontalScrollRange - i5 > 0 && i5 >= lVar.a;
            lVar.u = z;
            if (lVar.t || z) {
                if (lVar.t) {
                    float f2 = (float) i4;
                    lVar.f2118l = (int) ((((f2 / 2.0f) + ((float) computeVerticalScrollOffset)) * f2) / ((float) computeVerticalScrollRange));
                    lVar.f2117k = Math.min(i4, (i4 * i4) / computeVerticalScrollRange);
                }
                if (lVar.u) {
                    float f3 = (float) computeHorizontalScrollOffset;
                    float f4 = (float) i5;
                    lVar.f2121o = (int) ((((f4 / 2.0f) + f3) * f4) / ((float) computeHorizontalScrollRange));
                    lVar.f2120n = Math.min(i5, (i5 * i5) / computeHorizontalScrollRange);
                }
                int i6 = lVar.v;
                if (i6 == 0 || i6 == 1) {
                    lVar.a(1);
                }
            } else if (lVar.v != 0) {
                lVar.a(0);
            }
        }
    }

    /* compiled from: FastScroller */
    public class c extends AnimatorListenerAdapter {
        public boolean a = false;

        public c() {
        }

        public void onAnimationCancel(Animator animator) {
            this.a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (this.a) {
                this.a = false;
            } else if (((Float) l.this.z.getAnimatedValue()).floatValue() == 0.0f) {
                l lVar = l.this;
                lVar.A = 0;
                lVar.a(0);
            } else {
                l lVar2 = l.this;
                lVar2.A = 2;
                lVar2.s.invalidate();
            }
        }
    }

    /* compiled from: FastScroller */
    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            l.this.c.setAlpha(floatValue);
            l.this.d.setAlpha(floatValue);
            l.this.s.invalidate();
        }
    }

    public l(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i2, int i3, int i4) {
        this.c = stateListDrawable;
        this.d = drawable;
        this.f2113g = stateListDrawable2;
        this.f2114h = drawable2;
        this.e = Math.max(i2, stateListDrawable.getIntrinsicWidth());
        this.f2112f = Math.max(i2, drawable.getIntrinsicWidth());
        this.f2115i = Math.max(i2, stateListDrawable2.getIntrinsicWidth());
        this.f2116j = Math.max(i2, drawable2.getIntrinsicWidth());
        this.a = i3;
        this.f2111b = i4;
        this.c.setAlpha(255);
        this.d.setAlpha(255);
        this.z.addListener(new c());
        this.z.addUpdateListener(new d());
        RecyclerView recyclerView2 = this.s;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                recyclerView2.removeItemDecoration(this);
                this.s.removeOnItemTouchListener(this);
                this.s.removeOnScrollListener(this.C);
                a();
            }
            this.s = recyclerView;
            if (recyclerView != null) {
                recyclerView.addItemDecoration(this);
                this.s.addOnItemTouchListener(this);
                this.s.addOnScrollListener(this.C);
            }
        }
    }

    public void a(int i2) {
        if (i2 == 2 && this.v != 2) {
            this.c.setState(D);
            a();
        }
        if (i2 == 0) {
            this.s.invalidate();
        } else {
            b();
        }
        if (this.v == 2 && i2 != 2) {
            this.c.setState(E);
            a();
            this.s.postDelayed(this.B, (long) 1200);
        } else if (i2 == 1) {
            a();
            this.s.postDelayed(this.B, (long) 1500);
        }
        this.v = i2;
    }

    public void a(boolean z2) {
    }

    public boolean b(float f2, float f3) {
        if (m.k(this.s) == 1) {
            if (f2 > ((float) (this.e / 2))) {
                return false;
            }
        } else if (f2 < ((float) (this.f2123q - this.e))) {
            return false;
        }
        int i2 = this.f2118l;
        int i3 = this.f2117k / 2;
        if (f3 < ((float) (i2 - i3)) || f3 > ((float) (i3 + i2))) {
            return false;
        }
        return true;
    }

    public void b() {
        int i2 = this.A;
        if (i2 != 0) {
            if (i2 == 3) {
                this.z.cancel();
            } else {
                return;
            }
        }
        this.A = 1;
        ValueAnimator valueAnimator = this.z;
        valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f});
        this.z.setDuration(500);
        this.z.setStartDelay(0);
        this.z.start();
    }

    public void b(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        if (this.f2123q != this.s.getWidth() || this.r != this.s.getHeight()) {
            this.f2123q = this.s.getWidth();
            this.r = this.s.getHeight();
            a(0);
        } else if (this.A != 0) {
            if (this.t) {
                int i2 = this.f2123q;
                int i3 = this.e;
                int i4 = i2 - i3;
                int i5 = this.f2118l;
                int i6 = this.f2117k;
                int i7 = i5 - (i6 / 2);
                this.c.setBounds(0, 0, i3, i6);
                this.d.setBounds(0, 0, this.f2112f, this.r);
                boolean z2 = true;
                if (m.k(this.s) != 1) {
                    z2 = false;
                }
                if (z2) {
                    this.d.draw(canvas);
                    canvas.translate((float) this.e, (float) i7);
                    canvas.scale(-1.0f, 1.0f);
                    this.c.draw(canvas);
                    canvas.scale(1.0f, 1.0f);
                    canvas.translate((float) (-this.e), (float) (-i7));
                } else {
                    canvas.translate((float) i4, 0.0f);
                    this.d.draw(canvas);
                    canvas.translate(0.0f, (float) i7);
                    this.c.draw(canvas);
                    canvas.translate((float) (-i4), (float) (-i7));
                }
            }
            if (this.u) {
                int i8 = this.r;
                int i9 = this.f2115i;
                int i10 = i8 - i9;
                int i11 = this.f2121o;
                int i12 = this.f2120n;
                int i13 = i11 - (i12 / 2);
                this.f2113g.setBounds(0, 0, i12, i9);
                this.f2114h.setBounds(0, 0, this.f2123q, this.f2116j);
                canvas.translate(0.0f, (float) i10);
                this.f2114h.draw(canvas);
                canvas.translate((float) i13, 0.0f);
                this.f2113g.draw(canvas);
                canvas.translate((float) (-i13), (float) (-i10));
            }
        }
    }

    public final void a() {
        this.s.removeCallbacks(this.B);
    }

    public boolean a(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i2 = this.v;
        if (i2 == 1) {
            boolean b2 = b(motionEvent.getX(), motionEvent.getY());
            boolean a2 = a(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!b2 && !a2) {
                return false;
            }
            if (a2) {
                this.w = 1;
                this.f2122p = (float) ((int) motionEvent.getX());
            } else if (b2) {
                this.w = 2;
                this.f2119m = (float) ((int) motionEvent.getY());
            }
            a(2);
        } else if (i2 == 2) {
            return true;
        } else {
            return false;
        }
        return true;
    }

    public final int a(float f2, float f3, int[] iArr, int i2, int i3, int i4) {
        int i5 = iArr[1] - iArr[0];
        if (i5 == 0) {
            return 0;
        }
        int i6 = i2 - i4;
        int i7 = (int) (((f3 - f2) / ((float) i5)) * ((float) i6));
        int i8 = i3 + i7;
        if (i8 >= i6 || i8 < 0) {
            return 0;
        }
        return i7;
    }

    public boolean a(float f2, float f3) {
        if (f3 >= ((float) (this.r - this.f2115i))) {
            int i2 = this.f2121o;
            int i3 = this.f2120n;
            return f2 >= ((float) (i2 - (i3 / 2))) && f2 <= ((float) ((i3 / 2) + i2));
        }
    }

    public void b(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.v != 0) {
            if (motionEvent.getAction() == 0) {
                boolean b2 = b(motionEvent.getX(), motionEvent.getY());
                boolean a2 = a(motionEvent.getX(), motionEvent.getY());
                if (b2 || a2) {
                    if (a2) {
                        this.w = 1;
                        this.f2122p = (float) ((int) motionEvent.getX());
                    } else if (b2) {
                        this.w = 2;
                        this.f2119m = (float) ((int) motionEvent.getY());
                    }
                    a(2);
                }
            } else if (motionEvent.getAction() == 1 && this.v == 2) {
                this.f2119m = 0.0f;
                this.f2122p = 0.0f;
                a(1);
                this.w = 0;
            } else if (motionEvent.getAction() == 2 && this.v == 2) {
                b();
                if (this.w == 1) {
                    float x2 = motionEvent.getX();
                    int[] iArr = this.y;
                    int i2 = this.f2111b;
                    iArr[0] = i2;
                    iArr[1] = this.f2123q - i2;
                    float max = Math.max((float) iArr[0], Math.min((float) iArr[1], x2));
                    if (Math.abs(((float) this.f2121o) - max) >= 2.0f) {
                        int a3 = a(this.f2122p, max, iArr, this.s.computeHorizontalScrollRange(), this.s.computeHorizontalScrollOffset(), this.f2123q);
                        if (a3 != 0) {
                            this.s.scrollBy(a3, 0);
                        }
                        this.f2122p = max;
                    }
                }
                if (this.w == 2) {
                    float y2 = motionEvent.getY();
                    int[] iArr2 = this.x;
                    int i3 = this.f2111b;
                    iArr2[0] = i3;
                    iArr2[1] = this.r - i3;
                    float max2 = Math.max((float) iArr2[0], Math.min((float) iArr2[1], y2));
                    if (Math.abs(((float) this.f2118l) - max2) >= 2.0f) {
                        int a4 = a(this.f2119m, max2, iArr2, this.s.computeVerticalScrollRange(), this.s.computeVerticalScrollOffset(), this.r);
                        if (a4 != 0) {
                            this.s.scrollBy(0, a4);
                        }
                        this.f2119m = max2;
                    }
                }
            }
        }
    }
}
