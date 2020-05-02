package h.w;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;

/* compiled from: ViewUtilsApi23 */
public class z extends y {

    /* renamed from: i  reason: collision with root package name */
    public static boolean f2297i = true;

    @SuppressLint({"NewApi"})
    public void a(View view, int i2) {
        if (Build.VERSION.SDK_INT == 28) {
            super.a(view, i2);
        } else if (f2297i) {
            try {
                view.setTransitionVisibility(i2);
            } catch (NoSuchMethodError unused) {
                f2297i = false;
            }
        }
    }
}
