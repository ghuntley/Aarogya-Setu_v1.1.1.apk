package h.b.p;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

/* compiled from: ActionBarBackgroundDrawable */
public class b extends Drawable {
    public final ActionBarContainer a;

    public b(ActionBarContainer actionBarContainer) {
        this.a = actionBarContainer;
    }

    public void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.a;
        if (actionBarContainer.f96l) {
            Drawable drawable = actionBarContainer.f95k;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f93i;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.a;
        Drawable drawable3 = actionBarContainer2.f94j;
        if (drawable3 != null && actionBarContainer2.f97m) {
            drawable3.draw(canvas);
        }
    }

    public int getOpacity() {
        return 0;
    }

    public void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.a;
        if (actionBarContainer.f96l) {
            Drawable drawable = actionBarContainer.f95k;
            if (drawable != null) {
                drawable.getOutline(outline);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f93i;
        if (drawable2 != null) {
            drawable2.getOutline(outline);
        }
    }

    public void setAlpha(int i2) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
