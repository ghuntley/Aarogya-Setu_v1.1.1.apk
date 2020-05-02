package i.c.a.c.v;

import android.view.View;
import h.h.m.a;
import h.h.m.w.b;
import i.c.a.c.i;

/* compiled from: MaterialCalendar */
public class h extends a {
    public final /* synthetic */ f d;

    public h(f fVar) {
        this.d = fVar;
    }

    public void a(View view, b bVar) {
        String str;
        this.a.onInitializeAccessibilityNodeInfo(view, bVar.a);
        if (this.d.k0.getVisibility() == 0) {
            str = this.d.a(i.mtrl_picker_toggle_to_year_selection);
        } else {
            str = this.d.a(i.mtrl_picker_toggle_to_day_selection);
        }
        bVar.a((CharSequence) str);
    }
}
