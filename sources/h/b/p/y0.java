package h.b.p;

import android.view.View;
import android.view.Window;
import h.b.o.i.a;

/* compiled from: ToolbarWidgetWrapper */
public class y0 implements View.OnClickListener {
    public final a e = new a(this.f1503f.a.getContext(), 0, 16908332, 0, this.f1503f.f1511i);

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ z0 f1503f;

    public y0(z0 z0Var) {
        this.f1503f = z0Var;
    }

    public void onClick(View view) {
        z0 z0Var = this.f1503f;
        Window.Callback callback = z0Var.f1514l;
        if (callback != null && z0Var.f1515m) {
            callback.onMenuItemSelected(0, this.e);
        }
    }
}
