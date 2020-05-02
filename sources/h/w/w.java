package h.w;

import android.annotation.SuppressLint;
import android.view.View;

/* compiled from: ViewUtilsApi19 */
public class w extends b0 {
    public static boolean e = true;

    public void a(View view) {
    }

    @SuppressLint({"NewApi"})
    public void a(View view, float f2) {
        if (e) {
            try {
                view.setTransitionAlpha(f2);
                return;
            } catch (NoSuchMethodError unused) {
                e = false;
            }
        }
        view.setAlpha(f2);
    }

    @SuppressLint({"NewApi"})
    public float b(View view) {
        if (e) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                e = false;
            }
        }
        return view.getAlpha();
    }

    public void c(View view) {
    }
}
