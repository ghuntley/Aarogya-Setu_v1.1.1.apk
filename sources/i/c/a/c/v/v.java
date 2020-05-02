package i.c.a.c.v;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import i.c.a.b.d.l.q;
import i.c.a.c.h;
import i.c.a.c.i;
import java.util.Calendar;
import java.util.Locale;

/* compiled from: YearGridAdapter */
public class v extends RecyclerView.g<a> {
    public final f<?> c;

    /* compiled from: YearGridAdapter */
    public static class a extends RecyclerView.d0 {
        public final TextView x;

        public a(TextView textView) {
            super(textView);
            this.x = textView;
        }
    }

    public v(f<?> fVar) {
        this.c = fVar;
    }

    public void a(RecyclerView.d0 d0Var, int i2) {
        a aVar = (a) d0Var;
        int i3 = this.c.d0.e.f4229h + i2;
        String string = aVar.x.getContext().getString(i.mtrl_picker_navigate_to_year_description);
        aVar.x.setText(String.format(Locale.getDefault(), "%d", new Object[]{Integer.valueOf(i3)}));
        aVar.x.setContentDescription(String.format(string, new Object[]{Integer.valueOf(i3)}));
        c cVar = this.c.g0;
        Calendar c2 = q.c();
        b bVar = c2.get(1) == i3 ? cVar.f4214f : cVar.d;
        for (Long longValue : this.c.c0.q()) {
            c2.setTimeInMillis(longValue.longValue());
            if (c2.get(1) == i3) {
                bVar = cVar.e;
            }
        }
        bVar.a(aVar.x);
        aVar.x.setOnClickListener(new u(this, i3));
    }

    public int b(int i2) {
        return i2 - this.c.d0.e.f4229h;
    }

    public RecyclerView.d0 a(ViewGroup viewGroup, int i2) {
        return new a((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(h.mtrl_calendar_year, viewGroup, false));
    }

    public int a() {
        return this.c.d0.f4209i;
    }
}
