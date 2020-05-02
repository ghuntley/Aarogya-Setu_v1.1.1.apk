package h.h.m;

import android.text.TextUtils;
import android.view.View;
import h.h.m.m;

/* compiled from: ViewCompat */
public final class o extends m.b<CharSequence> {
    public o(int i2, Class cls, int i3, int i4) {
        super(i2, cls, i3, i4);
    }

    public void a(View view, Object obj) {
        view.setAccessibilityPaneTitle((CharSequence) obj);
    }

    public boolean a(Object obj, Object obj2) {
        return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
    }

    public Object a(View view) {
        return view.getAccessibilityPaneTitle();
    }
}
