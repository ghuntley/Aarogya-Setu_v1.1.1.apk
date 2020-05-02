package i.c.a.c.v;

import android.view.View;
import android.widget.AdapterView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.MaterialCalendarGridView;
import i.c.a.c.v.f;
import java.util.Iterator;

/* compiled from: MonthsPagerAdapter */
public class p implements AdapterView.OnItemClickListener {
    public final /* synthetic */ MaterialCalendarGridView e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ q f4236f;

    public p(q qVar, MaterialCalendarGridView materialCalendarGridView) {
        this.f4236f = qVar;
        this.e = materialCalendarGridView;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
        o adapter = this.e.getAdapter();
        if (i2 >= adapter.a() && i2 <= adapter.b()) {
            f.C0125f fVar = this.f4236f.e;
            long longValue = this.e.getAdapter().getItem(i2).longValue();
            f.d dVar = (f.d) fVar;
            if (f.this.d0.f4208h.e(longValue)) {
                f.this.c0.f(longValue);
                Iterator it = f.this.a0.iterator();
                while (it.hasNext()) {
                    ((r) it.next()).a(f.this.c0.h());
                }
                f.this.i0.getAdapter().a.b();
                RecyclerView recyclerView = f.this.h0;
                if (recyclerView != null) {
                    recyclerView.getAdapter().a.b();
                }
            }
        }
    }
}
