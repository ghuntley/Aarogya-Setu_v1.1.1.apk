package h.h.n;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import h.h.m.m;

/* compiled from: AutoScrollHelper */
public abstract class a implements View.OnTouchListener {
    public static final int u = ViewConfiguration.getTapTimeout();
    public final C0053a e = new C0053a();

    /* renamed from: f  reason: collision with root package name */
    public final Interpolator f1833f = new AccelerateInterpolator();

    /* renamed from: g  reason: collision with root package name */
    public final View f1834g;

    /* renamed from: h  reason: collision with root package name */
    public Runnable f1835h;

    /* renamed from: i  reason: collision with root package name */
    public float[] f1836i = {0.0f, 0.0f};

    /* renamed from: j  reason: collision with root package name */
    public float[] f1837j = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: k  reason: collision with root package name */
    public int f1838k;

    /* renamed from: l  reason: collision with root package name */
    public int f1839l;

    /* renamed from: m  reason: collision with root package name */
    public float[] f1840m = {0.0f, 0.0f};

    /* renamed from: n  reason: collision with root package name */
    public float[] f1841n = {0.0f, 0.0f};

    /* renamed from: o  reason: collision with root package name */
    public float[] f1842o = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: p  reason: collision with root package name */
    public boolean f1843p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f1844q;
    public boolean r;
    public boolean s;
    public boolean t;

    /* renamed from: h.h.n.a$a  reason: collision with other inner class name */
    /* compiled from: AutoScrollHelper */
    public static class C0053a {
        public int a;

        /* renamed from: b  reason: collision with root package name */
        public int f1845b;
        public float c;
        public float d;
        public long e = Long.MIN_VALUE;

        /* renamed from: f  reason: collision with root package name */
        public long f1846f = 0;

        /* renamed from: g  reason: collision with root package name */
        public int f1847g = 0;

        /* renamed from: h  reason: collision with root package name */
        public int f1848h = 0;

        /* renamed from: i  reason: collision with root package name */
        public long f1849i = -1;

        /* renamed from: j  reason: collision with root package name */
        public float f1850j;

        /* renamed from: k  reason: collision with root package name */
        public int f1851k;

        public final float a(long j2) {
            if (j2 < this.e) {
                return 0.0f;
            }
            long j3 = this.f1849i;
            if (j3 < 0 || j2 < j3) {
                return a.a(((float) (j2 - this.e)) / ((float) this.a), 0.0f, 1.0f) * 0.5f;
            }
            long j4 = j2 - j3;
            float f2 = this.f1850j;
            return (a.a(((float) j4) / ((float) this.f1851k), 0.0f, 1.0f) * f2) + (1.0f - f2);
        }
    }

    /* compiled from: AutoScrollHelper */
    public class b implements Runnable {
        public b() {
        }

        public void run() {
            a aVar = a.this;
            if (aVar.s) {
                if (aVar.f1844q) {
                    aVar.f1844q = false;
                    C0053a aVar2 = aVar.e;
                    if (aVar2 != null) {
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar2.e = currentAnimationTimeMillis;
                        aVar2.f1849i = -1;
                        aVar2.f1846f = currentAnimationTimeMillis;
                        aVar2.f1850j = 0.5f;
                        aVar2.f1847g = 0;
                        aVar2.f1848h = 0;
                    } else {
                        throw null;
                    }
                }
                C0053a aVar3 = a.this.e;
                if ((aVar3.f1849i > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar3.f1849i + ((long) aVar3.f1851k)) || !a.this.b()) {
                    a.this.s = false;
                    return;
                }
                a aVar4 = a.this;
                if (aVar4.r) {
                    aVar4.r = false;
                    if (aVar4 != null) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        aVar4.f1834g.onTouchEvent(obtain);
                        obtain.recycle();
                    } else {
                        throw null;
                    }
                }
                if (aVar3.f1846f != 0) {
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a = aVar3.a(currentAnimationTimeMillis2);
                    aVar3.f1846f = currentAnimationTimeMillis2;
                    float f2 = ((float) (currentAnimationTimeMillis2 - aVar3.f1846f)) * ((a * 4.0f) + (-4.0f * a * a));
                    aVar3.f1847g = (int) (aVar3.c * f2);
                    int i2 = (int) (f2 * aVar3.d);
                    aVar3.f1848h = i2;
                    ((c) a.this).v.scrollListBy(i2);
                    m.a(a.this.f1834g, (Runnable) this);
                    return;
                }
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
        }
    }

    public a(View view) {
        this.f1834g = view;
        float f2 = Resources.getSystem().getDisplayMetrics().density;
        float[] fArr = this.f1842o;
        float f3 = ((float) ((int) ((1575.0f * f2) + 0.5f))) / 1000.0f;
        fArr[0] = f3;
        fArr[1] = f3;
        float[] fArr2 = this.f1841n;
        float f4 = ((float) ((int) ((f2 * 315.0f) + 0.5f))) / 1000.0f;
        fArr2[0] = f4;
        fArr2[1] = f4;
        this.f1838k = 1;
        float[] fArr3 = this.f1837j;
        fArr3[0] = Float.MAX_VALUE;
        fArr3[1] = Float.MAX_VALUE;
        float[] fArr4 = this.f1836i;
        fArr4[0] = 0.2f;
        fArr4[1] = 0.2f;
        float[] fArr5 = this.f1840m;
        fArr5[0] = 0.001f;
        fArr5[1] = 0.001f;
        this.f1839l = u;
        C0053a aVar = this.e;
        aVar.a = 500;
        aVar.f1845b = 500;
    }

    public static float a(float f2, float f3, float f4) {
        return f2 > f4 ? f4 : f2 < f3 ? f3 : f2;
    }

    public final void a() {
        int i2 = 0;
        if (this.f1844q) {
            this.s = false;
            return;
        }
        C0053a aVar = this.e;
        if (aVar != null) {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            int i3 = (int) (currentAnimationTimeMillis - aVar.e);
            int i4 = aVar.f1845b;
            if (i3 > i4) {
                i2 = i4;
            } else if (i3 >= 0) {
                i2 = i3;
            }
            aVar.f1851k = i2;
            aVar.f1850j = aVar.a(currentAnimationTimeMillis);
            aVar.f1849i = currentAnimationTimeMillis;
            return;
        }
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean b() {
        /*
            r9 = this;
            h.h.n.a$a r0 = r9.e
            float r1 = r0.d
            float r2 = java.lang.Math.abs(r1)
            float r1 = r1 / r2
            int r1 = (int) r1
            float r0 = r0.c
            float r2 = java.lang.Math.abs(r0)
            float r0 = r0 / r2
            int r0 = (int) r0
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0053
            r4 = r9
            h.h.n.c r4 = (h.h.n.c) r4
            android.widget.ListView r4 = r4.v
            int r5 = r4.getCount()
            if (r5 != 0) goto L_0x0023
        L_0x0021:
            r1 = 0
            goto L_0x0051
        L_0x0023:
            int r6 = r4.getChildCount()
            int r7 = r4.getFirstVisiblePosition()
            int r8 = r7 + r6
            if (r1 <= 0) goto L_0x0041
            if (r8 < r5) goto L_0x0050
            int r6 = r6 - r2
            android.view.View r1 = r4.getChildAt(r6)
            int r1 = r1.getBottom()
            int r4 = r4.getHeight()
            if (r1 > r4) goto L_0x0050
            goto L_0x0021
        L_0x0041:
            if (r1 >= 0) goto L_0x0021
            if (r7 > 0) goto L_0x0050
            android.view.View r1 = r4.getChildAt(r3)
            int r1 = r1.getTop()
            if (r1 < 0) goto L_0x0050
            goto L_0x0021
        L_0x0050:
            r1 = 1
        L_0x0051:
            if (r1 != 0) goto L_0x0054
        L_0x0053:
            r2 = 0
        L_0x0054:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: h.h.n.a.b():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r0 != 3) goto L_0x007d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.t
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L_0x001a
            if (r0 == r2) goto L_0x0016
            r3 = 2
            if (r0 == r3) goto L_0x001e
            r6 = 3
            if (r0 == r6) goto L_0x0016
            goto L_0x007d
        L_0x0016:
            r5.a()
            goto L_0x007d
        L_0x001a:
            r5.r = r2
            r5.f1843p = r1
        L_0x001e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f1834g
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.a(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f1834g
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.a(r2, r7, r6, r3)
            h.h.n.a$a r7 = r5.e
            r7.c = r0
            r7.d = r6
            boolean r6 = r5.s
            if (r6 != 0) goto L_0x007d
            boolean r6 = r5.b()
            if (r6 == 0) goto L_0x007d
            java.lang.Runnable r6 = r5.f1835h
            if (r6 != 0) goto L_0x0061
            h.h.n.a$b r6 = new h.h.n.a$b
            r6.<init>()
            r5.f1835h = r6
        L_0x0061:
            r5.s = r2
            r5.f1844q = r2
            boolean r6 = r5.f1843p
            if (r6 != 0) goto L_0x0076
            int r6 = r5.f1839l
            if (r6 <= 0) goto L_0x0076
            android.view.View r7 = r5.f1834g
            java.lang.Runnable r0 = r5.f1835h
            long r3 = (long) r6
            h.h.m.m.a((android.view.View) r7, (java.lang.Runnable) r0, (long) r3)
            goto L_0x007b
        L_0x0076:
            java.lang.Runnable r6 = r5.f1835h
            r6.run()
        L_0x007b:
            r5.f1843p = r2
        L_0x007d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: h.h.n.a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final float a(int r4, float r5, float r6, float r7) {
        /*
            r3 = this;
            float[] r0 = r3.f1836i
            r0 = r0[r4]
            float[] r1 = r3.f1837j
            r1 = r1[r4]
            float r0 = r0 * r6
            r2 = 0
            float r0 = a(r0, r2, r1)
            float r1 = r3.a(r5, r0)
            float r6 = r6 - r5
            float r5 = r3.a(r6, r0)
            float r5 = r5 - r1
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 >= 0) goto L_0x0026
            android.view.animation.Interpolator r6 = r3.f1833f
            float r5 = -r5
            float r5 = r6.getInterpolation(r5)
            float r5 = -r5
            goto L_0x0030
        L_0x0026:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 <= 0) goto L_0x0039
            android.view.animation.Interpolator r6 = r3.f1833f
            float r5 = r6.getInterpolation(r5)
        L_0x0030:
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r5 = a(r5, r6, r0)
            goto L_0x003a
        L_0x0039:
            r5 = 0
        L_0x003a:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 != 0) goto L_0x003f
            return r2
        L_0x003f:
            float[] r0 = r3.f1840m
            r0 = r0[r4]
            float[] r1 = r3.f1841n
            r1 = r1[r4]
            float[] r2 = r3.f1842o
            r4 = r2[r4]
            float r0 = r0 * r7
            if (r6 <= 0) goto L_0x0056
            float r5 = r5 * r0
            float r4 = a(r5, r1, r4)
            return r4
        L_0x0056:
            float r5 = -r5
            float r5 = r5 * r0
            float r4 = a(r5, r1, r4)
            float r4 = -r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: h.h.n.a.a(int, float, float, float):float");
    }

    public final float a(float f2, float f3) {
        if (f3 == 0.0f) {
            return 0.0f;
        }
        int i2 = this.f1838k;
        if (i2 == 0 || i2 == 1) {
            if (f2 < f3) {
                if (f2 >= 0.0f) {
                    return 1.0f - (f2 / f3);
                }
                return (!this.s || this.f1838k != 1) ? 0.0f : 1.0f;
            }
        } else if (i2 == 2 && f2 < 0.0f) {
            return f2 / (-f3);
        }
    }
}
