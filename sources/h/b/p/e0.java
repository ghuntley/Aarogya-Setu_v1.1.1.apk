package h.b.p;

import android.annotation.SuppressLint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.ScaleDrawable;
import android.os.Build;
import h.b.m.a.c;
import h.h.g.j.b;

@SuppressLint({"RestrictedAPI"})
/* compiled from: DrawableUtils */
public class e0 {
    public static final int[] a = {16842912};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f1383b = new int[0];

    static {
        new Rect();
        try {
            Class.forName("android.graphics.Insets");
        } catch (ClassNotFoundException unused) {
        }
    }

    public static boolean a(Drawable drawable) {
        if (drawable instanceof DrawableContainer) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (!(constantState instanceof DrawableContainer.DrawableContainerState)) {
                return true;
            }
            for (Drawable a2 : ((DrawableContainer.DrawableContainerState) constantState).getChildren()) {
                if (!a(a2)) {
                    return false;
                }
            }
            return true;
        } else if (drawable instanceof b) {
            return a(((b) drawable).a());
        } else {
            if (drawable instanceof c) {
                return a(((c) drawable).e);
            }
            if (drawable instanceof ScaleDrawable) {
                return a(((ScaleDrawable) drawable).getDrawable());
            }
            return true;
        }
    }

    public static void b(Drawable drawable) {
        if (Build.VERSION.SDK_INT == 21 && "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName())) {
            int[] state = drawable.getState();
            if (state == null || state.length == 0) {
                drawable.setState(a);
            } else {
                drawable.setState(f1383b);
            }
            drawable.setState(state);
        }
    }

    public static PorterDuff.Mode a(int i2, PorterDuff.Mode mode) {
        if (i2 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i2 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i2 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i2) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
