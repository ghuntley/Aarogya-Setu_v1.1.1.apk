package h.h.g.j;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* compiled from: WrappedDrawableApi14 */
public class c extends Drawable implements Drawable.Callback, b, a {

    /* renamed from: k  reason: collision with root package name */
    public static final PorterDuff.Mode f1767k = PorterDuff.Mode.SRC_IN;
    public int e;

    /* renamed from: f  reason: collision with root package name */
    public PorterDuff.Mode f1768f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1769g;

    /* renamed from: h  reason: collision with root package name */
    public e f1770h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f1771i;

    /* renamed from: j  reason: collision with root package name */
    public Drawable f1772j;

    public c(e eVar, Resources resources) {
        Drawable.ConstantState constantState;
        this.f1770h = eVar;
        if (eVar != null && (constantState = eVar.f1774b) != null) {
            a(constantState.newDrawable(resources));
        }
    }

    public final boolean a(int[] iArr) {
        if (!b()) {
            return false;
        }
        e eVar = this.f1770h;
        ColorStateList colorStateList = eVar.c;
        PorterDuff.Mode mode = eVar.d;
        if (colorStateList == null || mode == null) {
            this.f1769g = false;
            clearColorFilter();
        } else {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!(this.f1769g && colorForState == this.e && mode == this.f1768f)) {
                setColorFilter(colorForState, mode);
                this.e = colorForState;
                this.f1768f = mode;
                this.f1769g = true;
                return true;
            }
        }
        return false;
    }

    public boolean b() {
        throw null;
    }

    public void draw(Canvas canvas) {
        this.f1772j.draw(canvas);
    }

    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        e eVar = this.f1770h;
        return changingConfigurations | (eVar != null ? eVar.getChangingConfigurations() : 0) | this.f1772j.getChangingConfigurations();
    }

    public Drawable.ConstantState getConstantState() {
        e eVar = this.f1770h;
        if (eVar == null) {
            return null;
        }
        if (!(eVar.f1774b != null)) {
            return null;
        }
        this.f1770h.a = getChangingConfigurations();
        return this.f1770h;
    }

    public Drawable getCurrent() {
        return this.f1772j.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f1772j.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f1772j.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.f1772j.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f1772j.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f1772j.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.f1772j.getPadding(rect);
    }

    public int[] getState() {
        return this.f1772j.getState();
    }

    public Region getTransparentRegion() {
        return this.f1772j.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return this.f1772j.isAutoMirrored();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.f1770h;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            boolean r0 = r1.b()
            if (r0 == 0) goto L_0x000d
            h.h.g.j.e r0 = r1.f1770h
            if (r0 == 0) goto L_0x000d
            android.content.res.ColorStateList r0 = r0.c
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            if (r0 == 0) goto L_0x0016
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x001e
        L_0x0016:
            android.graphics.drawable.Drawable r0 = r1.f1772j
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0020
        L_0x001e:
            r0 = 1
            goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h.h.g.j.c.isStateful():boolean");
    }

    public void jumpToCurrentState() {
        this.f1772j.jumpToCurrentState();
    }

    public Drawable mutate() {
        if (!this.f1771i && super.mutate() == this) {
            this.f1770h = new e(this.f1770h);
            Drawable drawable = this.f1772j;
            if (drawable != null) {
                drawable.mutate();
            }
            e eVar = this.f1770h;
            if (eVar != null) {
                Drawable drawable2 = this.f1772j;
                eVar.f1774b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.f1771i = true;
        }
        return this;
    }

    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f1772j;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    public boolean onLevelChange(int i2) {
        return this.f1772j.setLevel(i2);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        scheduleSelf(runnable, j2);
    }

    public void setAlpha(int i2) {
        this.f1772j.setAlpha(i2);
    }

    public void setAutoMirrored(boolean z) {
        this.f1772j.setAutoMirrored(z);
    }

    public void setChangingConfigurations(int i2) {
        this.f1772j.setChangingConfigurations(i2);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f1772j.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.f1772j.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f1772j.setFilterBitmap(z);
    }

    public boolean setState(int[] iArr) {
        return a(iArr) || this.f1772j.setState(iArr);
    }

    public void setTint(int i2) {
        setTintList(ColorStateList.valueOf(i2));
    }

    public void setTintList(ColorStateList colorStateList) {
        throw null;
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f1772j.setVisible(z, z2);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public c(Drawable drawable) {
        this.f1770h = new e(this.f1770h);
        a(drawable);
    }

    public final Drawable a() {
        return this.f1772j;
    }

    public final void a(Drawable drawable) {
        Drawable drawable2 = this.f1772j;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f1772j = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            e eVar = this.f1770h;
            if (eVar != null) {
                eVar.f1774b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }
}
