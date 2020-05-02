package i.c.a.c.v;

import android.view.View;

/* compiled from: MaterialCalendar */
public class k implements View.OnClickListener {
    public final /* synthetic */ q e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ f f4225f;

    public k(f fVar, q qVar) {
        this.f4225f = fVar;
        this.e = qVar;
    }

    public void onClick(View view) {
        int s = this.f4225f.H().s() + 1;
        if (s < this.f4225f.i0.getAdapter().a()) {
            this.f4225f.a(this.e.b(s));
        }
    }
}
