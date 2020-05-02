package i.c.a.c.z;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import h.b.p.i0;
import i.c.a.c.k;

/* compiled from: ForegroundLinearLayout */
public class e extends i0 {
    public Drawable t;
    public final Rect u;
    public final Rect v;
    public int w;
    public boolean x;
    public boolean y;

    public e(Context context) {
        this(context, (AttributeSet) null);
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.t;
        if (drawable != null) {
            if (this.y) {
                this.y = false;
                Rect rect = this.u;
                Rect rect2 = this.v;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.x) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.w, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @TargetApi(21)
    public void drawableHotspotChanged(float f2, float f3) {
        super.drawableHotspotChanged(f2, f3);
        Drawable drawable = this.t;
        if (drawable != null) {
            drawable.setHotspot(f2, f3);
        }
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.t;
        if (drawable != null && drawable.isStateful()) {
            this.t.setState(getDrawableState());
        }
    }

    public Drawable getForeground() {
        return this.t;
    }

    public int getForegroundGravity() {
        return this.w;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.t;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        this.y = z | this.y;
    }

    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        this.y = true;
    }

    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.t;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
                unscheduleDrawable(this.t);
            }
            this.t = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.w == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    public void setForegroundGravity(int i2) {
        if (this.w != i2) {
            if ((8388615 & i2) == 0) {
                i2 |= 8388611;
            }
            if ((i2 & 112) == 0) {
                i2 |= 48;
            }
            this.w = i2;
            if (i2 == 119 && this.t != null) {
                this.t.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.t;
    }

    public e(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public e(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.u = new Rect();
        this.v = new Rect();
        this.w = 119;
        this.x = true;
        this.y = false;
        TypedArray b2 = i.b(context, attributeSet, k.ForegroundLinearLayout, i2, 0, new int[0]);
        this.w = b2.getInt(k.ForegroundLinearLayout_android_foregroundGravity, this.w);
        Drawable drawable = b2.getDrawable(k.ForegroundLinearLayout_android_foreground);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.x = b2.getBoolean(k.ForegroundLinearLayout_foregroundInsidePadding, true);
        b2.recycle();
    }
}
