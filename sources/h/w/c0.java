package h.w;

import android.view.View;
import android.view.ViewGroup;
import h.w.i;

/* compiled from: Visibility */
public class c0 extends l {
    public final /* synthetic */ ViewGroup a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f2265b;
    public final /* synthetic */ View c;
    public final /* synthetic */ d0 d;

    public c0(d0 d0Var, ViewGroup viewGroup, View view, View view2) {
        this.d = d0Var;
        this.a = viewGroup;
        this.f2265b = view;
        this.c = view2;
    }

    public void a(i iVar) {
        this.a.getOverlay().remove(this.f2265b);
    }

    public void b(i iVar) {
        if (this.f2265b.getParent() == null) {
            this.a.getOverlay().add(this.f2265b);
        } else {
            this.d.cancel();
        }
    }

    public void e(i iVar) {
        this.c.setTag(f.save_overlay_view, (Object) null);
        this.a.getOverlay().remove(this.f2265b);
        iVar.b((i.d) this);
    }
}
