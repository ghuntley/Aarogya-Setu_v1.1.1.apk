package i.c.a.c.c0;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;

/* compiled from: RippleUtils */
public class a {
    public static final boolean a = true;

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f4037b = {16842910, 16842919};
    public static final String c = a.class.getSimpleName();

    public static ColorStateList a(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 22 && i2 <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f4037b, 0)) != 0) {
            Log.w(c, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
        }
        return colorStateList;
    }

    public static boolean a(int[] iArr) {
        boolean z = false;
        boolean z2 = false;
        for (int i2 : iArr) {
            if (i2 == 16842910) {
                z = true;
            } else if (i2 == 16842908 || i2 == 16842919 || i2 == 16843623) {
                z2 = true;
            }
        }
        return z && z2;
    }
}
