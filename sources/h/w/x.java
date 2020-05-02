package h.w;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;

/* compiled from: ViewUtilsApi21 */
public class x extends w {

    /* renamed from: f  reason: collision with root package name */
    public static boolean f2294f = true;

    /* renamed from: g  reason: collision with root package name */
    public static boolean f2295g = true;

    @SuppressLint({"NewApi"})
    public void a(View view, Matrix matrix) {
        if (f2294f) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f2294f = false;
            }
        }
    }

    @SuppressLint({"NewApi"})
    public void b(View view, Matrix matrix) {
        if (f2295g) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f2295g = false;
            }
        }
    }
}
