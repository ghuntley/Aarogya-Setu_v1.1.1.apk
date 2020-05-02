package i.c.a.c.z;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import h.h.k.d;
import h.h.m.m;
import i.c.a.c.b0.a;
import i.c.a.c.z.g;

/* compiled from: CollapsingTextHelper */
public final class b {
    public static final Paint X = null;
    public Bitmap A;
    public Paint B;
    public float C;
    public float D;
    public int[] E;
    public boolean F;
    public final TextPaint G;
    public final TextPaint H;
    public TimeInterpolator I;
    public TimeInterpolator J;
    public float K;
    public float L;
    public float M;
    public ColorStateList N;
    public float O;
    public float P;
    public float Q;
    public StaticLayout R;
    public float S;
    public float T;
    public float U;
    public CharSequence V;
    public int W = 1;
    public final View a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f4258b;
    public float c;
    public final Rect d;
    public final Rect e;

    /* renamed from: f  reason: collision with root package name */
    public final RectF f4259f;

    /* renamed from: g  reason: collision with root package name */
    public int f4260g = 16;

    /* renamed from: h  reason: collision with root package name */
    public int f4261h = 16;

    /* renamed from: i  reason: collision with root package name */
    public float f4262i = 15.0f;

    /* renamed from: j  reason: collision with root package name */
    public float f4263j = 15.0f;

    /* renamed from: k  reason: collision with root package name */
    public ColorStateList f4264k;

    /* renamed from: l  reason: collision with root package name */
    public ColorStateList f4265l;

    /* renamed from: m  reason: collision with root package name */
    public float f4266m;

    /* renamed from: n  reason: collision with root package name */
    public float f4267n;

    /* renamed from: o  reason: collision with root package name */
    public float f4268o;

    /* renamed from: p  reason: collision with root package name */
    public float f4269p;

    /* renamed from: q  reason: collision with root package name */
    public float f4270q;
    public float r;
    public Typeface s;
    public Typeface t;
    public Typeface u;
    public a v;
    public CharSequence w;
    public CharSequence x;
    public boolean y;
    public boolean z;

    static {
        Paint paint = null;
        if (paint != null) {
            paint.setAntiAlias(true);
            X.setColor(-65281);
        }
    }

    public b(View view) {
        this.a = view;
        this.G = new TextPaint(129);
        this.H = new TextPaint(this.G);
        this.e = new Rect();
        this.d = new Rect();
        this.f4259f = new RectF();
    }

    public float a() {
        if (this.w == null) {
            return 0.0f;
        }
        TextPaint textPaint = this.H;
        textPaint.setTextSize(this.f4263j);
        textPaint.setTypeface(this.s);
        TextPaint textPaint2 = this.H;
        CharSequence charSequence = this.w;
        return textPaint2.measureText(charSequence, 0, charSequence.length());
    }

    public void b(ColorStateList colorStateList) {
        if (this.f4265l != colorStateList) {
            this.f4265l = colorStateList;
            e();
        }
    }

    public void c(float f2) {
        if (f2 < 0.0f) {
            f2 = 0.0f;
        } else if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (f2 != this.c) {
            this.c = f2;
            a(f2);
        }
    }

    public void d() {
        this.f4258b = this.e.width() > 0 && this.e.height() > 0 && this.d.width() > 0 && this.d.height() > 0;
    }

    public void e() {
        float f2;
        float f3;
        StaticLayout staticLayout;
        if (this.a.getHeight() > 0 && this.a.getWidth() > 0) {
            float f4 = this.D;
            b(this.f4263j);
            CharSequence charSequence = this.x;
            if (!(charSequence == null || (staticLayout = this.R) == null)) {
                this.V = TextUtils.ellipsize(charSequence, this.G, (float) staticLayout.getWidth(), TextUtils.TruncateAt.END);
            }
            CharSequence charSequence2 = this.V;
            float f5 = 0.0f;
            float measureText = charSequence2 != null ? this.G.measureText(charSequence2, 0, charSequence2.length()) : 0.0f;
            int absoluteGravity = Gravity.getAbsoluteGravity(this.f4261h, this.y ? 1 : 0);
            StaticLayout staticLayout2 = this.R;
            float height = staticLayout2 != null ? (float) staticLayout2.getHeight() : 0.0f;
            int i2 = absoluteGravity & 112;
            if (i2 == 48) {
                this.f4267n = ((float) this.e.top) - this.G.ascent();
            } else if (i2 != 80) {
                float descent = (this.G.descent() - this.G.ascent()) / 2.0f;
                float descent2 = descent - this.G.descent();
                if (f()) {
                    f3 = ((float) this.e.centerY()) - descent;
                } else {
                    f3 = descent2 + ((float) this.e.centerY());
                }
                this.f4267n = f3;
            } else {
                this.f4267n = (float) this.e.bottom;
            }
            int i3 = absoluteGravity & 8388615;
            if (i3 == 1) {
                this.f4269p = ((float) this.e.centerX()) - (measureText / 2.0f);
            } else if (i3 != 5) {
                this.f4269p = (float) this.e.left;
            } else {
                this.f4269p = ((float) this.e.right) - measureText;
            }
            b(this.f4262i);
            CharSequence charSequence3 = this.x;
            float measureText2 = charSequence3 != null ? this.G.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
            StaticLayout staticLayout3 = this.R;
            if (staticLayout3 != null && this.W > 1 && !this.y) {
                measureText2 = staticLayout3.getLineWidth(0);
            }
            StaticLayout staticLayout4 = this.R;
            this.U = staticLayout4 != null ? staticLayout4.getLineLeft(0) : 0.0f;
            int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f4260g, this.y ? 1 : 0);
            int i4 = absoluteGravity2 & 112;
            if (i4 == 48) {
                this.f4266m = ((float) this.d.top) - this.G.ascent();
            } else if (i4 != 80) {
                float descent3 = ((this.G.descent() - this.G.ascent()) / 2.0f) - this.G.descent();
                if (f()) {
                    f2 = ((float) this.d.centerY()) - (height / 2.0f);
                } else {
                    f2 = descent3 + ((float) this.d.centerY());
                }
                this.f4266m = f2;
            } else {
                if (f()) {
                    f5 = height - this.G.descent();
                }
                this.f4266m = ((float) this.d.bottom) - f5;
            }
            int i5 = absoluteGravity2 & 8388615;
            if (i5 == 1) {
                this.f4268o = ((float) this.d.centerX()) - (measureText2 / 2.0f);
            } else if (i5 != 5) {
                this.f4268o = (float) this.d.left;
            } else {
                this.f4268o = ((float) this.d.right) - measureText2;
            }
            Bitmap bitmap = this.A;
            if (bitmap != null) {
                bitmap.recycle();
                this.A = null;
            }
            d(f4);
            a(this.c);
        }
    }

    public final boolean f() {
        return this.W > 1 && !this.y && !this.z;
    }

    public float b() {
        TextPaint textPaint = this.H;
        textPaint.setTextSize(this.f4263j);
        textPaint.setTypeface(this.s);
        return -this.H.ascent();
    }

    public int c() {
        return a(this.f4265l);
    }

    public void a(int i2) {
        if (this.f4261h != i2) {
            this.f4261h = i2;
            e();
        }
    }

    public final void d(float f2) {
        b(f2);
        this.z = false;
        if (0 != 0 && this.A == null && !this.d.isEmpty() && !TextUtils.isEmpty(this.x)) {
            a(0.0f);
            int width = this.R.getWidth();
            int height = this.R.getHeight();
            if (width > 0 && height > 0) {
                this.A = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                this.R.draw(new Canvas(this.A));
                if (this.B == null) {
                    this.B = new Paint(3);
                }
            }
        }
        m.B(this.a);
    }

    public final void b(float f2) {
        float f3;
        boolean z2;
        StaticLayout staticLayout;
        if (this.w != null) {
            float width = (float) this.e.width();
            float width2 = (float) this.d.width();
            int i2 = 1;
            if (Math.abs(f2 - this.f4263j) < 0.001f) {
                f3 = this.f4263j;
                this.C = 1.0f;
                Typeface typeface = this.u;
                Typeface typeface2 = this.s;
                if (typeface != typeface2) {
                    this.u = typeface2;
                    z2 = true;
                } else {
                    z2 = false;
                }
            } else {
                float f4 = this.f4262i;
                Typeface typeface3 = this.u;
                Typeface typeface4 = this.t;
                if (typeface3 != typeface4) {
                    this.u = typeface4;
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (Math.abs(f2 - this.f4262i) < 0.001f) {
                    this.C = 1.0f;
                } else {
                    this.C = f2 / this.f4262i;
                }
                float f5 = this.f4263j / this.f4262i;
                width = width2 * f5 > width ? Math.min(width / f5, width2) : width2;
                f3 = f4;
            }
            if (width > 0.0f) {
                z2 = this.D != f3 || this.F || z2;
                this.D = f3;
                this.F = false;
            }
            if (this.x == null || z2) {
                this.G.setTextSize(this.D);
                this.G.setTypeface(this.u);
                this.G.setLinearText(this.C != 1.0f);
                this.y = a(this.w);
                if (f()) {
                    i2 = this.W;
                }
                boolean z3 = this.y;
                try {
                    g gVar = new g(this.w, this.G, (int) width);
                    gVar.f4285j = TextUtils.TruncateAt.END;
                    gVar.f4284i = z3;
                    gVar.f4281f = Layout.Alignment.ALIGN_NORMAL;
                    gVar.f4283h = false;
                    gVar.f4282g = i2;
                    staticLayout = gVar.a();
                } catch (g.a e2) {
                    Log.e("CollapsingTextHelper", e2.getCause().getMessage(), e2);
                    staticLayout = null;
                }
                g.a.a.b.a.a(staticLayout);
                this.R = staticLayout;
                this.x = staticLayout.getText();
            }
        }
    }

    public void a(Typeface typeface) {
        boolean z2;
        a aVar = this.v;
        boolean z3 = true;
        if (aVar != null) {
            aVar.c = true;
        }
        if (this.s != typeface) {
            this.s = typeface;
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.t != typeface) {
            this.t = typeface;
        } else {
            z3 = false;
        }
        if (z2 || z3) {
            e();
        }
    }

    public final int a(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.E;
        if (iArr != null) {
            return colorStateList.getColorForState(iArr, 0);
        }
        return colorStateList.getDefaultColor();
    }

    public final void a(float f2) {
        this.f4259f.left = a((float) this.d.left, (float) this.e.left, f2, this.I);
        this.f4259f.top = a(this.f4266m, this.f4267n, f2, this.I);
        this.f4259f.right = a((float) this.d.right, (float) this.e.right, f2, this.I);
        this.f4259f.bottom = a((float) this.d.bottom, (float) this.e.bottom, f2, this.I);
        this.f4270q = a(this.f4268o, this.f4269p, f2, this.I);
        this.r = a(this.f4266m, this.f4267n, f2, this.I);
        d(a(this.f4262i, this.f4263j, f2, this.J));
        this.S = 1.0f - a(0.0f, 1.0f, 1.0f - f2, i.c.a.c.l.a.f4148b);
        m.B(this.a);
        this.T = a(1.0f, 0.0f, f2, i.c.a.c.l.a.f4148b);
        m.B(this.a);
        ColorStateList colorStateList = this.f4265l;
        ColorStateList colorStateList2 = this.f4264k;
        if (colorStateList != colorStateList2) {
            this.G.setColor(a(a(colorStateList2), c(), f2));
        } else {
            this.G.setColor(c());
        }
        this.G.setShadowLayer(a(this.O, this.K, f2, (TimeInterpolator) null), a(this.P, this.L, f2, (TimeInterpolator) null), a(this.Q, this.M, f2, (TimeInterpolator) null), a(a((ColorStateList) null), a(this.N), f2));
        this.a.postInvalidateOnAnimation();
    }

    public final boolean a(CharSequence charSequence) {
        boolean z2 = true;
        if (m.k(this.a) != 1) {
            z2 = false;
        }
        return ((d.C0049d) (z2 ? d.d : d.c)).a(charSequence, 0, charSequence.length());
    }

    public static int a(int i2, int i3, float f2) {
        float f3 = 1.0f - f2;
        return Color.argb((int) ((((float) Color.alpha(i3)) * f2) + (((float) Color.alpha(i2)) * f3)), (int) ((((float) Color.red(i3)) * f2) + (((float) Color.red(i2)) * f3)), (int) ((((float) Color.green(i3)) * f2) + (((float) Color.green(i2)) * f3)), (int) ((((float) Color.blue(i3)) * f2) + (((float) Color.blue(i2)) * f3)));
    }

    public static float a(float f2, float f3, float f4, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f4 = timeInterpolator.getInterpolation(f4);
        }
        return i.c.a.c.l.a.a(f2, f3, f4);
    }

    public static boolean a(Rect rect, int i2, int i3, int i4, int i5) {
        return rect.left == i2 && rect.top == i3 && rect.right == i4 && rect.bottom == i5;
    }
}
