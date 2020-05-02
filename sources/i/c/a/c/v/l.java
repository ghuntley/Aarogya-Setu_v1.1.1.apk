package i.c.a.c.v;

import android.view.View;

/* compiled from: MaterialCalendar */
public class l implements View.OnClickListener {
    public final /* synthetic */ q e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ f f4226f;

    public l(f fVar, q qVar) {
        this.f4226f = fVar;
        this.e = qVar;
    }

    public void onClick(View view) {
        int t = this.f4226f.H().t() - 1;
        if (t >= 0) {
            this.f4226f.a(this.e.b(t));
        }
    }
}
