package i.c.a.c.v;

import android.view.View;
import i.c.a.c.v.f;

/* compiled from: MaterialCalendar */
public class j implements View.OnClickListener {
    public final /* synthetic */ f e;

    public j(f fVar) {
        this.e = fVar;
    }

    public void onClick(View view) {
        f fVar = this.e;
        f.e eVar = fVar.f0;
        if (eVar == f.e.YEAR) {
            fVar.a(f.e.DAY);
        } else if (eVar == f.e.DAY) {
            fVar.a(f.e.YEAR);
        }
    }
}
