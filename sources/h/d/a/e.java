package h.d.a;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: RoundRectDrawable */
public class e extends Drawable {
    public float a;

    /* renamed from: b  reason: collision with root package name */
    public float f1535b;
    public boolean c;
    public boolean d;
    public ColorStateList e;

    /* renamed from: f  reason: collision with root package name */
    public PorterDuffColorFilter f1536f;

    /* renamed from: g  reason: collision with root package name */
    public ColorStateList f1537g;

    /* renamed from: h  reason: collision with root package name */
    public PorterDuff.Mode f1538h;

    public final void a(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        int i2 = rect.left;
        throw null;
    }

    public void draw(Canvas canvas) {
        if (this.f1536f == null) {
            float f2 = this.a;
            canvas.drawRoundRect((RectF) null, f2, f2, (Paint) null);
            return;
        }
        throw null;
    }

    public int getOpacity() {
        return -3;
    }

    public void getOutline(Outline outline) {
        outline.setRoundRect((Rect) null, this.a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = r1.e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f1537g
            if (r0 == 0) goto L_0x000a
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x001a
        L_0x000a:
            android.content.res.ColorStateList r0 = r1.e
            if (r0 == 0) goto L_0x0014
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x001a
        L_0x0014:
            boolean r0 = super.isStateful()
            if (r0 == 0) goto L_0x001c
        L_0x001a:
            r0 = 1
            goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h.d.a.e.isStateful():boolean");
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        a(rect);
        throw null;
    }

    public boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.e;
        colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        throw null;
    }

    public void setAlpha(int i2) {
        throw null;
    }

    public void setColorFilter(ColorFilter colorFilter) {
        throw null;
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f1537g = colorStateList;
        this.f1536f = a(colorStateList, this.f1538h);
        invalidateSelf();
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.f1538h = mode;
        this.f1536f = a(this.f1537g, mode);
        invalidateSelf();
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }
}
