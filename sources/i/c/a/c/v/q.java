package i.c.a.c.v;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.MaterialCalendarGridView;
import h.h.m.m;
import i.c.a.c.d;
import i.c.a.c.h;
import i.c.a.c.v.f;

/* compiled from: MonthsPagerAdapter */
public class q extends RecyclerView.g<a> {
    public final a c;
    public final d<?> d;
    public final f.C0125f e;

    /* renamed from: f  reason: collision with root package name */
    public final int f4237f;

    /* compiled from: MonthsPagerAdapter */
    public static class a extends RecyclerView.d0 {
        public final TextView x;
        public final MaterialCalendarGridView y;

        public a(LinearLayout linearLayout, boolean z) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(i.c.a.c.f.month_title);
            this.x = textView;
            m.a((View) textView, true);
            this.y = (MaterialCalendarGridView) linearLayout.findViewById(i.c.a.c.f.month_grid);
            if (!z) {
                this.x.setVisibility(8);
            }
        }
    }

    public q(Context context, d<?> dVar, a aVar, f.C0125f fVar) {
        n nVar = aVar.e;
        n nVar2 = aVar.f4206f;
        n nVar3 = aVar.f4207g;
        if (nVar.compareTo(nVar3) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        } else if (nVar3.compareTo(nVar2) <= 0) {
            this.f4237f = (f.b(context) * o.f4232i) + (m.b(context) ? context.getResources().getDimensionPixelSize(d.mtrl_calendar_day_height) : 0);
            this.c = aVar;
            this.d = dVar;
            this.e = fVar;
            if (!this.a.a()) {
                this.f310b = true;
                return;
            }
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        } else {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
    }

    public void a(RecyclerView.d0 d0Var, int i2) {
        a aVar = (a) d0Var;
        n a2 = this.c.e.a(i2);
        aVar.x.setText(a2.f4227f);
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) aVar.y.findViewById(i.c.a.c.f.month_grid);
        if (materialCalendarGridView.getAdapter() == null || !a2.equals(materialCalendarGridView.getAdapter().e)) {
            o oVar = new o(a2, this.d, this.c);
            materialCalendarGridView.setNumColumns(a2.f4230i);
            materialCalendarGridView.setAdapter((ListAdapter) oVar);
        } else {
            materialCalendarGridView.getAdapter().notifyDataSetChanged();
        }
        materialCalendarGridView.setOnItemClickListener(new p(this, materialCalendarGridView));
    }

    public n b(int i2) {
        return this.c.e.a(i2);
    }

    public RecyclerView.d0 a(ViewGroup viewGroup, int i2) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(h.mtrl_calendar_month_labeled, viewGroup, false);
        if (!m.b(viewGroup.getContext())) {
            return new a(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.p(-1, this.f4237f));
        return new a(linearLayout, true);
    }

    public long a(int i2) {
        return this.c.e.a(i2).e.getTimeInMillis();
    }

    public int a() {
        return this.c.f4210j;
    }

    public int a(n nVar) {
        return this.c.e.b(nVar);
    }
}
