package i.c.a.c.t;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import i.c.a.b.d.l.q;
import i.c.a.c.b0.c;
import i.c.a.c.b0.d;
import i.c.a.c.e0.g;
import i.c.a.c.e0.j;
import i.c.a.c.z.h;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* compiled from: ChipDrawable */
public class b extends g implements h.h.g.j.a, Drawable.Callback, h.b {
    public static final int[] L0 = {16842910};
    public static final ShapeDrawable M0 = new ShapeDrawable(new OvalShape());
    public PorterDuffColorFilter A0;
    public ColorStateList B0;
    public ColorStateList C;
    public PorterDuff.Mode C0 = PorterDuff.Mode.SRC_IN;
    public ColorStateList D;
    public int[] D0;
    public float E;
    public boolean E0;
    public float F;
    public ColorStateList F0;
    public ColorStateList G;
    public WeakReference<a> G0;
    public float H;
    public TextUtils.TruncateAt H0;
    public ColorStateList I;
    public boolean I0;
    public CharSequence J;
    public int J0;
    public boolean K;
    public boolean K0;
    public Drawable L;
    public ColorStateList M;
    public float N;
    public boolean O;
    public boolean P;
    public Drawable Q;
    public Drawable R;
    public ColorStateList S;
    public float T;
    public CharSequence U;
    public boolean V;
    public boolean W;
    public Drawable X;
    public i.c.a.c.l.g Y;
    public i.c.a.c.l.g Z;
    public float a0;
    public float b0;
    public float c0;
    public float d0;
    public float e0;
    public float f0;
    public float g0;
    public float h0;
    public final Context i0;
    public final Paint j0 = new Paint(1);
    public final Paint k0;
    public final Paint.FontMetrics l0 = new Paint.FontMetrics();
    public final RectF m0 = new RectF();
    public final PointF n0 = new PointF();
    public final Path o0 = new Path();
    public final h p0;
    public int q0;
    public int r0;
    public int s0;
    public int t0;
    public int u0;
    public int v0;
    public boolean w0;
    public int x0;
    public int y0 = 255;
    public ColorFilter z0;

    /* compiled from: ChipDrawable */
    public interface a {
        void a();
    }

    public b(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(j.a(context, attributeSet, i2, i3).a());
        Paint paint = null;
        this.G0 = new WeakReference<>(paint);
        this.e.f4059b = new i.c.a.c.w.a(context);
        i();
        this.i0 = context;
        h hVar = new h(this);
        this.p0 = hVar;
        this.J = "";
        hVar.a.density = context.getResources().getDisplayMetrics().density;
        this.k0 = paint;
        if (paint != null) {
            paint.setStyle(Paint.Style.STROKE);
        }
        setState(L0);
        b(L0);
        this.I0 = true;
        if (i.c.a.c.c0.a.a) {
            M0.setTint(-1);
        }
    }

    public static boolean f(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public static boolean h(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public final void a(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (p() || o()) {
            float f2 = this.a0 + this.b0;
            if (g.a.a.b.a.b((Drawable) this) == 0) {
                float f3 = ((float) rect.left) + f2;
                rectF.left = f3;
                rectF.right = f3 + this.N;
            } else {
                float f4 = ((float) rect.right) - f2;
                rectF.right = f4;
                rectF.left = f4 - this.N;
            }
            float exactCenterY = rect.exactCenterY();
            float f5 = this.N;
            float f6 = exactCenterY - (f5 / 2.0f);
            rectF.top = f6;
            rectF.bottom = f6 + f5;
        }
    }

    public final void b(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (q()) {
            float f2 = this.h0 + this.g0;
            if (g.a.a.b.a.b((Drawable) this) == 0) {
                float f3 = ((float) rect.right) - f2;
                rectF.right = f3;
                rectF.left = f3 - this.T;
            } else {
                float f4 = ((float) rect.left) + f2;
                rectF.left = f4;
                rectF.right = f4 + this.T;
            }
            float exactCenterY = rect.exactCenterY();
            float f5 = this.T;
            float f6 = exactCenterY - (f5 / 2.0f);
            rectF.top = f6;
            rectF.bottom = f6 + f5;
        }
    }

    public final void c(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (q()) {
            float f2 = this.h0 + this.g0 + this.T + this.f0 + this.e0;
            if (g.a.a.b.a.b((Drawable) this) == 0) {
                float f3 = (float) rect.right;
                rectF.right = f3;
                rectF.left = f3 - f2;
            } else {
                int i2 = rect.left;
                rectF.left = (float) i2;
                rectF.right = ((float) i2) + f2;
            }
            rectF.top = (float) rect.top;
            rectF.bottom = (float) rect.bottom;
        }
    }

    public void d(ColorStateList colorStateList) {
        this.O = true;
        if (this.M != colorStateList) {
            this.M = colorStateList;
            if (p()) {
                this.L.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void draw(Canvas canvas) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        Canvas canvas2 = canvas;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && (i2 = this.y0) != 0) {
            if (i2 < 255) {
                float f2 = (float) bounds.left;
                float f3 = (float) bounds.top;
                float f4 = (float) bounds.right;
                float f5 = (float) bounds.bottom;
                if (Build.VERSION.SDK_INT > 21) {
                    i10 = canvas.saveLayerAlpha(f2, f3, f4, f5, i2);
                } else {
                    i10 = canvas.saveLayerAlpha(f2, f3, f4, f5, i2, 31);
                }
                i3 = i10;
            } else {
                i3 = 0;
            }
            if (!this.K0) {
                this.j0.setColor(this.q0);
                this.j0.setStyle(Paint.Style.FILL);
                this.m0.set(bounds);
                canvas2.drawRoundRect(this.m0, l(), l(), this.j0);
            }
            if (!this.K0) {
                this.j0.setColor(this.r0);
                this.j0.setStyle(Paint.Style.FILL);
                Paint paint = this.j0;
                ColorFilter colorFilter = this.z0;
                if (colorFilter == null) {
                    colorFilter = this.A0;
                }
                paint.setColorFilter(colorFilter);
                this.m0.set(bounds);
                canvas2.drawRoundRect(this.m0, l(), l(), this.j0);
            }
            if (this.K0) {
                super.draw(canvas);
            }
            if (this.H > 0.0f && !this.K0) {
                this.j0.setColor(this.t0);
                this.j0.setStyle(Paint.Style.STROKE);
                if (!this.K0) {
                    Paint paint2 = this.j0;
                    ColorFilter colorFilter2 = this.z0;
                    if (colorFilter2 == null) {
                        colorFilter2 = this.A0;
                    }
                    paint2.setColorFilter(colorFilter2);
                }
                RectF rectF = this.m0;
                float f6 = this.H / 2.0f;
                rectF.set(((float) bounds.left) + f6, ((float) bounds.top) + f6, ((float) bounds.right) - f6, ((float) bounds.bottom) - f6);
                float f7 = this.F - (this.H / 2.0f);
                canvas2.drawRoundRect(this.m0, f7, f7, this.j0);
            }
            this.j0.setColor(this.u0);
            this.j0.setStyle(Paint.Style.FILL);
            this.m0.set(bounds);
            if (!this.K0) {
                canvas2.drawRoundRect(this.m0, l(), l(), this.j0);
                i4 = 0;
            } else {
                b(new RectF(bounds), this.o0);
                i4 = 0;
                a(canvas, this.j0, this.o0, this.e.a, b());
            }
            if (p()) {
                a(bounds, this.m0);
                RectF rectF2 = this.m0;
                float f8 = rectF2.left;
                float f9 = rectF2.top;
                canvas2.translate(f8, f9);
                this.L.setBounds(i4, i4, (int) this.m0.width(), (int) this.m0.height());
                this.L.draw(canvas2);
                canvas2.translate(-f8, -f9);
            }
            if (o()) {
                a(bounds, this.m0);
                RectF rectF3 = this.m0;
                float f10 = rectF3.left;
                float f11 = rectF3.top;
                canvas2.translate(f10, f11);
                this.X.setBounds(i4, i4, (int) this.m0.width(), (int) this.m0.height());
                this.X.draw(canvas2);
                canvas2.translate(-f10, -f11);
            }
            if (!this.I0 || this.J == null) {
                i6 = i3;
                i5 = 0;
            } else {
                PointF pointF = this.n0;
                pointF.set(0.0f, 0.0f);
                Paint.Align align = Paint.Align.LEFT;
                if (this.J != null) {
                    float j2 = j() + this.a0 + this.d0;
                    if (g.a.a.b.a.b((Drawable) this) == 0) {
                        pointF.x = ((float) bounds.left) + j2;
                        align = Paint.Align.LEFT;
                    } else {
                        pointF.x = ((float) bounds.right) - j2;
                        align = Paint.Align.RIGHT;
                    }
                    this.p0.a.getFontMetrics(this.l0);
                    Paint.FontMetrics fontMetrics = this.l0;
                    pointF.y = ((float) bounds.centerY()) - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
                }
                RectF rectF4 = this.m0;
                rectF4.setEmpty();
                if (this.J != null) {
                    float j3 = j() + this.a0 + this.d0;
                    float k2 = k() + this.h0 + this.e0;
                    if (g.a.a.b.a.b((Drawable) this) == 0) {
                        rectF4.left = ((float) bounds.left) + j3;
                        rectF4.right = ((float) bounds.right) - k2;
                    } else {
                        rectF4.left = ((float) bounds.left) + k2;
                        rectF4.right = ((float) bounds.right) - j3;
                    }
                    rectF4.top = (float) bounds.top;
                    rectF4.bottom = (float) bounds.bottom;
                }
                h hVar = this.p0;
                if (hVar.f4287f != null) {
                    hVar.a.drawableState = getState();
                    h hVar2 = this.p0;
                    hVar2.f4287f.a(this.i0, hVar2.a, hVar2.f4286b);
                }
                this.p0.a.setTextAlign(align);
                boolean z = Math.round(this.p0.a(this.J.toString())) > Math.round(this.m0.width());
                if (z) {
                    i9 = canvas.save();
                    canvas2.clipRect(this.m0);
                } else {
                    i9 = 0;
                }
                CharSequence charSequence = this.J;
                if (z && this.H0 != null) {
                    charSequence = TextUtils.ellipsize(charSequence, this.p0.a, this.m0.width(), this.H0);
                }
                CharSequence charSequence2 = charSequence;
                int length = charSequence2.length();
                PointF pointF2 = this.n0;
                float f12 = pointF2.x;
                i5 = 0;
                float f13 = pointF2.y;
                i6 = i3;
                canvas.drawText(charSequence2, 0, length, f12, f13, this.p0.a);
                if (z) {
                    canvas2.restoreToCount(i9);
                }
            }
            if (q()) {
                b(bounds, this.m0);
                RectF rectF5 = this.m0;
                float f14 = rectF5.left;
                float f15 = rectF5.top;
                canvas2.translate(f14, f15);
                this.Q.setBounds(i5, i5, (int) this.m0.width(), (int) this.m0.height());
                if (i.c.a.c.c0.a.a) {
                    this.R.setBounds(this.Q.getBounds());
                    this.R.jumpToCurrentState();
                    this.R.draw(canvas2);
                } else {
                    this.Q.draw(canvas2);
                }
                canvas2.translate(-f14, -f15);
            }
            Paint paint3 = this.k0;
            if (paint3 != null) {
                paint3.setColor(h.h.g.a.b(-16777216, 127));
                canvas2.drawRect(bounds, this.k0);
                if (p() || o()) {
                    a(bounds, this.m0);
                    canvas2.drawRect(this.m0, this.k0);
                }
                if (this.J != null) {
                    i7 = i6;
                    i8 = 255;
                    canvas.drawLine((float) bounds.left, bounds.exactCenterY(), (float) bounds.right, bounds.exactCenterY(), this.k0);
                } else {
                    i7 = i6;
                    i8 = 255;
                }
                if (q()) {
                    b(bounds, this.m0);
                    canvas2.drawRect(this.m0, this.k0);
                }
                this.k0.setColor(h.h.g.a.b(-65536, 127));
                RectF rectF6 = this.m0;
                rectF6.set(bounds);
                if (q()) {
                    float f16 = this.h0 + this.g0 + this.T + this.f0 + this.e0;
                    if (g.a.a.b.a.b((Drawable) this) == 0) {
                        rectF6.right = ((float) bounds.right) - f16;
                    } else {
                        rectF6.left = ((float) bounds.left) + f16;
                    }
                }
                canvas2.drawRect(this.m0, this.k0);
                this.k0.setColor(h.h.g.a.b(-16711936, 127));
                c(bounds, this.m0);
                canvas2.drawRect(this.m0, this.k0);
            } else {
                i7 = i6;
                i8 = 255;
            }
            if (this.y0 < i8) {
                canvas2.restoreToCount(i7);
            }
        }
    }

    public void e(boolean z) {
        if (this.E0 != z) {
            this.E0 = z;
            this.F0 = z ? i.c.a.c.c0.a.a(this.I) : null;
            onStateChange(getState());
        }
    }

    public void g(ColorStateList colorStateList) {
        if (this.I != colorStateList) {
            this.I = colorStateList;
            this.F0 = this.E0 ? i.c.a.c.c0.a.a(colorStateList) : null;
            onStateChange(getState());
        }
    }

    public int getAlpha() {
        return this.y0;
    }

    public ColorFilter getColorFilter() {
        return this.z0;
    }

    public int getIntrinsicHeight() {
        return (int) this.E;
    }

    public int getIntrinsicWidth() {
        return Math.min(Math.round(k() + this.p0.a(this.J.toString()) + j() + this.a0 + this.d0 + this.e0 + this.h0), this.J0);
    }

    public int getOpacity() {
        return -3;
    }

    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.K0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.F);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.E, this.F);
        }
        outline.setAlpha(((float) this.y0) / 255.0f);
    }

    public void i(float f2) {
        if (this.g0 != f2) {
            this.g0 = f2;
            invalidateSelf();
            if (q()) {
                n();
            }
        }
    }

    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
        r0 = r0.f4027b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r3 = this;
            android.content.res.ColorStateList r0 = r3.C
            boolean r0 = h((android.content.res.ColorStateList) r0)
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0064
            android.content.res.ColorStateList r0 = r3.D
            boolean r0 = h((android.content.res.ColorStateList) r0)
            if (r0 != 0) goto L_0x0064
            android.content.res.ColorStateList r0 = r3.G
            boolean r0 = h((android.content.res.ColorStateList) r0)
            if (r0 != 0) goto L_0x0064
            boolean r0 = r3.E0
            if (r0 == 0) goto L_0x0026
            android.content.res.ColorStateList r0 = r3.F0
            boolean r0 = h((android.content.res.ColorStateList) r0)
            if (r0 != 0) goto L_0x0064
        L_0x0026:
            i.c.a.c.z.h r0 = r3.p0
            i.c.a.c.b0.b r0 = r0.f4287f
            if (r0 == 0) goto L_0x0038
            android.content.res.ColorStateList r0 = r0.f4027b
            if (r0 == 0) goto L_0x0038
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0038
            r0 = 1
            goto L_0x0039
        L_0x0038:
            r0 = 0
        L_0x0039:
            if (r0 != 0) goto L_0x0064
            boolean r0 = r3.W
            if (r0 == 0) goto L_0x0049
            android.graphics.drawable.Drawable r0 = r3.X
            if (r0 == 0) goto L_0x0049
            boolean r0 = r3.V
            if (r0 == 0) goto L_0x0049
            r0 = 1
            goto L_0x004a
        L_0x0049:
            r0 = 0
        L_0x004a:
            if (r0 != 0) goto L_0x0064
            android.graphics.drawable.Drawable r0 = r3.L
            boolean r0 = f((android.graphics.drawable.Drawable) r0)
            if (r0 != 0) goto L_0x0064
            android.graphics.drawable.Drawable r0 = r3.X
            boolean r0 = f((android.graphics.drawable.Drawable) r0)
            if (r0 != 0) goto L_0x0064
            android.content.res.ColorStateList r0 = r3.B0
            boolean r0 = h((android.content.res.ColorStateList) r0)
            if (r0 == 0) goto L_0x0065
        L_0x0064:
            r1 = 1
        L_0x0065:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.a.c.t.b.isStateful():boolean");
    }

    public float j() {
        if (p() || o()) {
            return this.b0 + this.N + this.c0;
        }
        return 0.0f;
    }

    public float k() {
        if (q()) {
            return this.f0 + this.T + this.g0;
        }
        return 0.0f;
    }

    public float l() {
        return this.K0 ? f() : this.F;
    }

    public Drawable m() {
        Drawable drawable = this.Q;
        if (drawable != null) {
            return drawable instanceof h.h.g.j.b ? ((h.h.g.j.b) drawable).a() : drawable;
        }
        return null;
    }

    public void n() {
        a aVar = (a) this.G0.get();
        if (aVar != null) {
            aVar.a();
        }
    }

    public final boolean o() {
        return this.W && this.X != null && this.w0;
    }

    public boolean onLayoutDirectionChanged(int i2) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i2);
        if (p()) {
            onLayoutDirectionChanged |= g.a.a.b.a.a(this.L, i2);
        }
        if (o()) {
            onLayoutDirectionChanged |= g.a.a.b.a.a(this.X, i2);
        }
        if (q()) {
            onLayoutDirectionChanged |= g.a.a.b.a.a(this.Q, i2);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    public boolean onLevelChange(int i2) {
        boolean onLevelChange = super.onLevelChange(i2);
        if (p()) {
            onLevelChange |= this.L.setLevel(i2);
        }
        if (o()) {
            onLevelChange |= this.X.setLevel(i2);
        }
        if (q()) {
            onLevelChange |= this.Q.setLevel(i2);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    public boolean onStateChange(int[] iArr) {
        if (this.K0) {
            super.onStateChange(iArr);
        }
        return a(iArr, this.D0);
    }

    public final boolean p() {
        return this.K && this.L != null;
    }

    public final boolean q() {
        return this.P && this.Q != null;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j2);
        }
    }

    public void setAlpha(int i2) {
        if (this.y0 != i2) {
            this.y0 = i2;
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        if (this.z0 != colorFilter) {
            this.z0 = colorFilter;
            invalidateSelf();
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        if (this.B0 != colorStateList) {
            this.B0 = colorStateList;
            onStateChange(getState());
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        if (this.C0 != mode) {
            this.C0 = mode;
            this.A0 = q.a((Drawable) this, this.B0, mode);
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (p()) {
            visible |= this.L.setVisible(z, z2);
        }
        if (o()) {
            visible |= this.X.setVisible(z, z2);
        }
        if (q()) {
            visible |= this.Q.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public void f(float f2) {
        if (this.E != f2) {
            this.E = f2;
            invalidateSelf();
            n();
        }
    }

    public void h(float f2) {
        if (this.H != f2) {
            this.H = f2;
            this.j0.setStrokeWidth(f2);
            if (this.K0) {
                this.e.f4066l = f2;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    public void l(float f2) {
        if (this.c0 != f2) {
            float j2 = j();
            this.c0 = f2;
            float j3 = j();
            invalidateSelf();
            if (j2 != j3) {
                n();
            }
        }
    }

    public void o(float f2) {
        if (this.d0 != f2) {
            this.d0 = f2;
            invalidateSelf();
            n();
        }
    }

    public void j(float f2) {
        if (this.T != f2) {
            this.T = f2;
            invalidateSelf();
            if (q()) {
                n();
            }
        }
    }

    public void k(float f2) {
        if (this.f0 != f2) {
            this.f0 = f2;
            invalidateSelf();
            if (q()) {
                n();
            }
        }
    }

    public void n(float f2) {
        if (this.e0 != f2) {
            this.e0 = f2;
            invalidateSelf();
            n();
        }
    }

    public void m(float f2) {
        if (this.b0 != f2) {
            float j2 = j();
            this.b0 = f2;
            float j3 = j();
            invalidateSelf();
            if (j2 != j3) {
                n();
            }
        }
    }

    public final void e(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
    }

    public void f(ColorStateList colorStateList) {
        if (this.S != colorStateList) {
            this.S = colorStateList;
            if (q()) {
                this.Q.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void g(float f2) {
        if (this.a0 != f2) {
            this.a0 = f2;
            invalidateSelf();
            n();
        }
    }

    public void e(ColorStateList colorStateList) {
        if (this.G != colorStateList) {
            this.G = colorStateList;
            if (this.K0) {
                b(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void d(boolean z) {
        if (this.P != z) {
            boolean q2 = q();
            this.P = z;
            boolean q3 = q();
            if (q2 != q3) {
                if (q3) {
                    a(this.Q);
                } else {
                    e(this.Q);
                }
                invalidateSelf();
                n();
            }
        }
    }

    public void a() {
        n();
        invalidateSelf();
    }

    public boolean b(int[] iArr) {
        if (Arrays.equals(this.D0, iArr)) {
            return false;
        }
        this.D0 = iArr;
        if (q()) {
            return a(getState(), iArr);
        }
        return false;
    }

    public void c(ColorStateList colorStateList) {
        if (this.D != colorStateList) {
            this.D = colorStateList;
            onStateChange(getState());
        }
    }

    public void e(float f2) {
        if (this.N != f2) {
            float j2 = j();
            this.N = f2;
            float j3 = j();
            invalidateSelf();
            if (j2 != j3) {
                n();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0142  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int[] r9, int[] r10) {
        /*
            r8 = this;
            boolean r0 = super.onStateChange(r9)
            android.content.res.ColorStateList r1 = r8.C
            r2 = 0
            if (r1 == 0) goto L_0x0010
            int r3 = r8.q0
            int r1 = r1.getColorForState(r9, r3)
            goto L_0x0011
        L_0x0010:
            r1 = 0
        L_0x0011:
            int r3 = r8.q0
            r4 = 1
            if (r3 == r1) goto L_0x0019
            r8.q0 = r1
            r0 = 1
        L_0x0019:
            android.content.res.ColorStateList r3 = r8.D
            if (r3 == 0) goto L_0x0024
            int r5 = r8.r0
            int r3 = r3.getColorForState(r9, r5)
            goto L_0x0025
        L_0x0024:
            r3 = 0
        L_0x0025:
            int r5 = r8.r0
            if (r5 == r3) goto L_0x002c
            r8.r0 = r3
            r0 = 1
        L_0x002c:
            int r1 = h.h.g.a.a(r3, r1)
            int r3 = r8.s0
            if (r3 == r1) goto L_0x0036
            r3 = 1
            goto L_0x0037
        L_0x0036:
            r3 = 0
        L_0x0037:
            i.c.a.c.e0.g$b r5 = r8.e
            android.content.res.ColorStateList r5 = r5.d
            if (r5 != 0) goto L_0x003f
            r5 = 1
            goto L_0x0040
        L_0x003f:
            r5 = 0
        L_0x0040:
            r3 = r3 | r5
            if (r3 == 0) goto L_0x004d
            r8.s0 = r1
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r1)
            r8.a((android.content.res.ColorStateList) r0)
            r0 = 1
        L_0x004d:
            android.content.res.ColorStateList r1 = r8.G
            if (r1 == 0) goto L_0x0058
            int r3 = r8.t0
            int r1 = r1.getColorForState(r9, r3)
            goto L_0x0059
        L_0x0058:
            r1 = 0
        L_0x0059:
            int r3 = r8.t0
            if (r3 == r1) goto L_0x0060
            r8.t0 = r1
            r0 = 1
        L_0x0060:
            android.content.res.ColorStateList r1 = r8.F0
            if (r1 == 0) goto L_0x0073
            boolean r1 = i.c.a.c.c0.a.a((int[]) r9)
            if (r1 == 0) goto L_0x0073
            android.content.res.ColorStateList r1 = r8.F0
            int r3 = r8.u0
            int r1 = r1.getColorForState(r9, r3)
            goto L_0x0074
        L_0x0073:
            r1 = 0
        L_0x0074:
            int r3 = r8.u0
            if (r3 == r1) goto L_0x007f
            r8.u0 = r1
            boolean r1 = r8.E0
            if (r1 == 0) goto L_0x007f
            r0 = 1
        L_0x007f:
            i.c.a.c.z.h r1 = r8.p0
            i.c.a.c.b0.b r1 = r1.f4287f
            if (r1 == 0) goto L_0x0090
            android.content.res.ColorStateList r1 = r1.f4027b
            if (r1 == 0) goto L_0x0090
            int r3 = r8.v0
            int r1 = r1.getColorForState(r9, r3)
            goto L_0x0091
        L_0x0090:
            r1 = 0
        L_0x0091:
            int r3 = r8.v0
            if (r3 == r1) goto L_0x0098
            r8.v0 = r1
            r0 = 1
        L_0x0098:
            int[] r1 = r8.getState()
            r3 = 16842912(0x10100a0, float:2.3694006E-38)
            if (r1 != 0) goto L_0x00a3
        L_0x00a1:
            r1 = 0
            goto L_0x00b0
        L_0x00a3:
            int r5 = r1.length
            r6 = 0
        L_0x00a5:
            if (r6 >= r5) goto L_0x00a1
            r7 = r1[r6]
            if (r7 != r3) goto L_0x00ad
            r1 = 1
            goto L_0x00b0
        L_0x00ad:
            int r6 = r6 + 1
            goto L_0x00a5
        L_0x00b0:
            if (r1 == 0) goto L_0x00b8
            boolean r1 = r8.V
            if (r1 == 0) goto L_0x00b8
            r1 = 1
            goto L_0x00b9
        L_0x00b8:
            r1 = 0
        L_0x00b9:
            boolean r3 = r8.w0
            if (r3 == r1) goto L_0x00d3
            android.graphics.drawable.Drawable r3 = r8.X
            if (r3 == 0) goto L_0x00d3
            float r0 = r8.j()
            r8.w0 = r1
            float r1 = r8.j()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00d2
            r0 = 1
            r1 = 1
            goto L_0x00d4
        L_0x00d2:
            r0 = 1
        L_0x00d3:
            r1 = 0
        L_0x00d4:
            android.content.res.ColorStateList r3 = r8.B0
            if (r3 == 0) goto L_0x00df
            int r5 = r8.x0
            int r3 = r3.getColorForState(r9, r5)
            goto L_0x00e0
        L_0x00df:
            r3 = 0
        L_0x00e0:
            int r5 = r8.x0
            if (r5 == r3) goto L_0x00f1
            r8.x0 = r3
            android.content.res.ColorStateList r0 = r8.B0
            android.graphics.PorterDuff$Mode r3 = r8.C0
            android.graphics.PorterDuffColorFilter r0 = i.c.a.b.d.l.q.a((android.graphics.drawable.Drawable) r8, (android.content.res.ColorStateList) r0, (android.graphics.PorterDuff.Mode) r3)
            r8.A0 = r0
            goto L_0x00f2
        L_0x00f1:
            r4 = r0
        L_0x00f2:
            android.graphics.drawable.Drawable r0 = r8.L
            boolean r0 = f((android.graphics.drawable.Drawable) r0)
            if (r0 == 0) goto L_0x0101
            android.graphics.drawable.Drawable r0 = r8.L
            boolean r0 = r0.setState(r9)
            r4 = r4 | r0
        L_0x0101:
            android.graphics.drawable.Drawable r0 = r8.X
            boolean r0 = f((android.graphics.drawable.Drawable) r0)
            if (r0 == 0) goto L_0x0110
            android.graphics.drawable.Drawable r0 = r8.X
            boolean r0 = r0.setState(r9)
            r4 = r4 | r0
        L_0x0110:
            android.graphics.drawable.Drawable r0 = r8.Q
            boolean r0 = f((android.graphics.drawable.Drawable) r0)
            if (r0 == 0) goto L_0x012d
            int r0 = r9.length
            int r3 = r10.length
            int r0 = r0 + r3
            int[] r0 = new int[r0]
            int r3 = r9.length
            java.lang.System.arraycopy(r9, r2, r0, r2, r3)
            int r9 = r9.length
            int r3 = r10.length
            java.lang.System.arraycopy(r10, r2, r0, r9, r3)
            android.graphics.drawable.Drawable r9 = r8.Q
            boolean r9 = r9.setState(r0)
            r4 = r4 | r9
        L_0x012d:
            boolean r9 = i.c.a.c.c0.a.a
            if (r9 == 0) goto L_0x0140
            android.graphics.drawable.Drawable r9 = r8.R
            boolean r9 = f((android.graphics.drawable.Drawable) r9)
            if (r9 == 0) goto L_0x0140
            android.graphics.drawable.Drawable r9 = r8.R
            boolean r9 = r9.setState(r10)
            r4 = r4 | r9
        L_0x0140:
            if (r4 == 0) goto L_0x0145
            r8.invalidateSelf()
        L_0x0145:
            if (r1 == 0) goto L_0x014a
            r8.n()
        L_0x014a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.a.c.t.b.a(int[], int[]):boolean");
    }

    @Deprecated
    public void c(float f2) {
        if (this.F != f2) {
            this.F = f2;
            setShapeAppearanceModel(this.e.a.a(f2));
        }
    }

    public void b(boolean z) {
        if (this.W != z) {
            boolean o2 = o();
            this.W = z;
            boolean o3 = o();
            if (o2 != o3) {
                if (o3) {
                    a(this.X);
                } else {
                    e(this.X);
                }
                invalidateSelf();
                n();
            }
        }
    }

    public void d(Drawable drawable) {
        Drawable m2 = m();
        if (m2 != drawable) {
            float k2 = k();
            this.Q = drawable != null ? g.a.a.b.a.c(drawable).mutate() : null;
            if (i.c.a.c.c0.a.a) {
                this.R = new RippleDrawable(i.c.a.c.c0.a.a(this.I), this.Q, M0);
            }
            float k3 = k();
            e(m2);
            if (q()) {
                a(this.Q);
            }
            invalidateSelf();
            if (k2 != k3) {
                n();
            }
        }
    }

    public void c(boolean z) {
        if (this.K != z) {
            boolean p2 = p();
            this.K = z;
            boolean p3 = p();
            if (p2 != p3) {
                if (p3) {
                    a(this.L);
                } else {
                    e(this.L);
                }
                invalidateSelf();
                n();
            }
        }
    }

    public void b(Drawable drawable) {
        if (this.X != drawable) {
            float j2 = j();
            this.X = drawable;
            float j3 = j();
            e(this.X);
            a(this.X);
            invalidateSelf();
            if (j2 != j3) {
                n();
            }
        }
    }

    public void c(Drawable drawable) {
        Drawable drawable2 = this.L;
        Drawable drawable3 = null;
        if (drawable2 == null) {
            drawable2 = null;
        } else if (drawable2 instanceof h.h.g.j.b) {
            drawable2 = ((h.h.g.j.b) drawable2).a();
        }
        if (drawable2 != drawable) {
            float j2 = j();
            if (drawable != null) {
                drawable3 = g.a.a.b.a.c(drawable).mutate();
            }
            this.L = drawable3;
            float j3 = j();
            e(drawable2);
            if (p()) {
                a(this.L);
            }
            invalidateSelf();
            if (j2 != j3) {
                n();
            }
        }
    }

    public void d(float f2) {
        if (this.h0 != f2) {
            this.h0 = f2;
            invalidateSelf();
            n();
        }
    }

    public final void a(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(this);
            g.a.a.b.a.a(drawable, g.a.a.b.a.b((Drawable) this));
            drawable.setLevel(getLevel());
            drawable.setVisible(isVisible(), false);
            if (drawable == this.Q) {
                if (drawable.isStateful()) {
                    drawable.setState(this.D0);
                }
                drawable.setTintList(this.S);
                return;
            }
            if (drawable.isStateful()) {
                drawable.setState(getState());
            }
            Drawable drawable2 = this.L;
            if (drawable == drawable2 && this.O) {
                drawable2.setTintList(this.M);
            }
        }
    }

    public void a(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (!TextUtils.equals(this.J, charSequence)) {
            this.J = charSequence;
            this.p0.d = true;
            invalidateSelf();
            n();
        }
    }

    public void a(i.c.a.c.b0.b bVar) {
        h hVar = this.p0;
        Context context = this.i0;
        if (hVar.f4287f != bVar) {
            hVar.f4287f = bVar;
            if (bVar != null) {
                TextPaint textPaint = hVar.a;
                d dVar = hVar.f4286b;
                bVar.a();
                bVar.a(textPaint, bVar.f4034l);
                bVar.a(context, (d) new c(bVar, textPaint, dVar));
                h.b bVar2 = (h.b) hVar.e.get();
                if (bVar2 != null) {
                    hVar.a.drawableState = bVar2.getState();
                }
                bVar.a(context, hVar.a, hVar.f4286b);
                hVar.d = true;
            }
            h.b bVar3 = (h.b) hVar.e.get();
            if (bVar3 != null) {
                bVar3.a();
                bVar3.onStateChange(bVar3.getState());
            }
        }
    }

    public void a(boolean z) {
        if (this.V != z) {
            this.V = z;
            float j2 = j();
            if (!z && this.w0) {
                this.w0 = false;
            }
            float j3 = j();
            invalidateSelf();
            if (j2 != j3) {
                n();
            }
        }
    }
}
