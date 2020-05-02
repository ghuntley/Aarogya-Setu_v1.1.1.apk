package h.h.m;

import android.view.WindowInsets;
import java.util.Objects;

/* compiled from: WindowInsetsCompat */
public class v {
    public final Object a;

    public v(Object obj) {
        this.a = obj;
    }

    public int a() {
        return ((WindowInsets) this.a).getSystemWindowInsetBottom();
    }

    public int b() {
        return ((WindowInsets) this.a).getSystemWindowInsetLeft();
    }

    public int c() {
        return ((WindowInsets) this.a).getSystemWindowInsetRight();
    }

    public int d() {
        return ((WindowInsets) this.a).getSystemWindowInsetTop();
    }

    public boolean e() {
        return ((WindowInsets) this.a).isConsumed();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        return Objects.equals(this.a, ((v) obj).a);
    }

    public int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static v a(WindowInsets windowInsets) {
        return new v(Objects.requireNonNull(windowInsets));
    }
}
