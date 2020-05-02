package h.w;

import android.view.View;
import android.view.WindowId;

/* compiled from: WindowIdApi18 */
public class e0 implements f0 {
    public final WindowId a;

    public e0(View view) {
        this.a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof e0) && ((e0) obj).a.equals(this.a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}
