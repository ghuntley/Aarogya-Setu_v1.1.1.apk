package i.c.a.c.v;

import android.view.View;
import i.c.a.b.d.l.q;
import i.c.a.c.v.f;
import java.util.Calendar;

/* compiled from: YearGridAdapter */
public class u implements View.OnClickListener {
    public final /* synthetic */ int e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ v f4238f;

    public u(v vVar, int i2) {
        this.f4238f = vVar;
        this.e = i2;
    }

    public void onClick(View view) {
        int i2 = this.e;
        int i3 = this.f4238f.c.e0.f4228g;
        Calendar d = q.d();
        d.set(1, i2);
        d.set(2, i3);
        n nVar = new n(d);
        a aVar = this.f4238f.c.d0;
        if (nVar.compareTo(aVar.e) < 0) {
            nVar = aVar.e;
        } else if (nVar.compareTo(aVar.f4206f) > 0) {
            nVar = aVar.f4206f;
        }
        this.f4238f.c.a(nVar);
        this.f4238f.c.a(f.e.DAY);
    }
}
