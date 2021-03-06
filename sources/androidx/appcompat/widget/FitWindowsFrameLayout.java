package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import h.b.k.m;
import h.b.p.g0;
import h.h.m.v;

public class FitWindowsFrameLayout extends FrameLayout {
    public g0 e;

    public FitWindowsFrameLayout(Context context) {
        super(context);
    }

    public boolean fitSystemWindows(Rect rect) {
        g0 g0Var = this.e;
        if (g0Var != null) {
            rect.top = ((m) g0Var).a.a((v) null, rect);
        }
        return super.fitSystemWindows(rect);
    }

    public void setOnFitSystemWindowsListener(g0 g0Var) {
        this.e = g0Var;
    }

    public FitWindowsFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
