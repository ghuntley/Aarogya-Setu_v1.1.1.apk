package h.b.m.a;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* compiled from: DrawableWrapper */
public class c extends Drawable implements Drawable.Callback {
    public Drawable e;

    public c(Drawable drawable) {
        Drawable drawable2 = this.e;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    public void draw(Canvas canvas) {
        this.e.draw(canvas);
    }

    public int getChangingConfigurations() {
        return this.e.getChangingConfigurations();
    }

    public Drawable getCurrent() {
        return this.e.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.e.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.e.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.e.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.e.getMinimumWidth();
    }

    public int getOpacity() {
        return this.e.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.e.getPadding(rect);
    }

    public int[] getState() {
        return this.e.getState();
    }

    public Region getTransparentRegion() {
        return this.e.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return this.e.isAutoMirrored();
    }

    public boolean isStateful() {
        return this.e.isStateful();
    }

    public void jumpToCurrentState() {
        this.e.jumpToCurrentState();
    }

    public void onBoundsChange(Rect rect) {
        this.e.setBounds(rect);
    }

    public boolean onLevelChange(int i2) {
        return this.e.setLevel(i2);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        scheduleSelf(runnable, j2);
    }

    public void setAlpha(int i2) {
        this.e.setAlpha(i2);
    }

    public void setAutoMirrored(boolean z) {
        this.e.setAutoMirrored(z);
    }

    public void setChangingConfigurations(int i2) {
        this.e.setChangingConfigurations(i2);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.e.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.e.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.e.setFilterBitmap(z);
    }

    public void setHotspot(float f2, float f3) {
        this.e.setHotspot(f2, f3);
    }

    public void setHotspotBounds(int i2, int i3, int i4, int i5) {
        this.e.setHotspotBounds(i2, i3, i4, i5);
    }

    public boolean setState(int[] iArr) {
        return this.e.setState(iArr);
    }

    public void setTint(int i2) {
        this.e.setTint(i2);
    }

    public void setTintList(ColorStateList colorStateList) {
        this.e.setTintList(colorStateList);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.e.setTintMode(mode);
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.e.setVisible(z, z2);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
