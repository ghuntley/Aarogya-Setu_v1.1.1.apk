package h.h.g.j;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;

/* compiled from: WrappedDrawableApi21 */
public class d extends c {

    /* renamed from: l  reason: collision with root package name */
    public static Method f1773l;

    public d(Drawable drawable) {
        super(drawable);
        c();
    }

    public boolean b() {
        if (Build.VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.f1772j;
        if ((drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable)) {
            return true;
        }
        return false;
    }

    public final void c() {
        if (f1773l == null) {
            try {
                f1773l = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception e) {
                Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", e);
            }
        }
    }

    public Rect getDirtyBounds() {
        return this.f1772j.getDirtyBounds();
    }

    public void getOutline(Outline outline) {
        this.f1772j.getOutline(outline);
    }

    public boolean isProjected() {
        Method method;
        Drawable drawable = this.f1772j;
        if (!(drawable == null || (method = f1773l) == null)) {
            try {
                return ((Boolean) method.invoke(drawable, new Object[0])).booleanValue();
            } catch (Exception e) {
                Log.w("WrappedDrawableApi21", "Error calling Drawable#isProjected() method", e);
            }
        }
        return false;
    }

    public void setHotspot(float f2, float f3) {
        this.f1772j.setHotspot(f2, f3);
    }

    public void setHotspotBounds(int i2, int i3, int i4, int i5) {
        this.f1772j.setHotspotBounds(i2, i3, i4, i5);
    }

    public boolean setState(int[] iArr) {
        if (!super.setState(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    public void setTint(int i2) {
        if (b()) {
            super.setTint(i2);
        } else {
            this.f1772j.setTint(i2);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        if (b()) {
            this.f1770h.c = colorStateList;
            a(getState());
            return;
        }
        this.f1772j.setTintList(colorStateList);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        if (b()) {
            this.f1770h.d = mode;
            a(getState());
            return;
        }
        this.f1772j.setTintMode(mode);
    }

    public d(e eVar, Resources resources) {
        super(eVar, resources);
        c();
    }
}
