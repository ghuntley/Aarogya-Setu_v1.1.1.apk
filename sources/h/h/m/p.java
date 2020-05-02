package h.h.m;

import android.view.View;
import h.h.m.m;

/* compiled from: ViewCompat */
public final class p extends m.b<Boolean> {
    public p(int i2, Class cls, int i3) {
        super(i2, cls, i3);
    }

    public void a(View view, Object obj) {
        view.setAccessibilityHeading(((Boolean) obj).booleanValue());
    }

    public boolean a(Object obj, Object obj2) {
        return !a((Boolean) obj, (Boolean) obj2);
    }

    public Object a(View view) {
        return Boolean.valueOf(view.isAccessibilityHeading());
    }
}
