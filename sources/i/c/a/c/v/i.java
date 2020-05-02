package i.c.a.c.v;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;

/* compiled from: MaterialCalendar */
public class i extends RecyclerView.t {
    public final /* synthetic */ q a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MaterialButton f4224b;
    public final /* synthetic */ f c;

    public i(f fVar, q qVar, MaterialButton materialButton) {
        this.c = fVar;
        this.a = qVar;
        this.f4224b = materialButton;
    }

    public void a(RecyclerView recyclerView, int i2, int i3) {
        int i4;
        if (i2 < 0) {
            i4 = this.c.H().s();
        } else {
            i4 = this.c.H().t();
        }
        this.c.e0 = this.a.b(i4);
        this.f4224b.setText(this.a.c.e.a(i4).f4227f);
    }

    public void a(RecyclerView recyclerView, int i2) {
        if (i2 == 0) {
            recyclerView.announceForAccessibility(this.f4224b.getText());
        }
    }
}
