package i.c.a.c.v;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import h.h.l.b;
import i.c.a.b.d.l.q;
import java.util.Calendar;

/* compiled from: MaterialCalendar */
public class g extends RecyclerView.n {
    public final Calendar a = q.d();

    /* renamed from: b  reason: collision with root package name */
    public final Calendar f4223b = q.d();
    public final /* synthetic */ f c;

    public g(f fVar) {
        this.c = fVar;
    }

    public void a(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        int i2;
        int i3;
        if ((recyclerView.getAdapter() instanceof v) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            v vVar = (v) recyclerView.getAdapter();
            GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
            for (b next : this.c.c0.j()) {
                F f2 = next.a;
                if (!(f2 == null || next.f1808b == null)) {
                    this.a.setTimeInMillis(((Long) f2).longValue());
                    this.f4223b.setTimeInMillis(((Long) next.f1808b).longValue());
                    int b2 = vVar.b(this.a.get(1));
                    int b3 = vVar.b(this.f4223b.get(1));
                    View b4 = gridLayoutManager.b(b2);
                    View b5 = gridLayoutManager.b(b3);
                    int i4 = gridLayoutManager.I;
                    int i5 = b2 / i4;
                    int i6 = b3 / i4;
                    for (int i7 = i5; i7 <= i6; i7++) {
                        View b6 = gridLayoutManager.b(gridLayoutManager.I * i7);
                        if (b6 != null) {
                            int top = b6.getTop() + this.c.g0.d.a.top;
                            int bottom = b6.getBottom() - this.c.g0.d.a.bottom;
                            if (i7 == i5) {
                                i2 = (b4.getWidth() / 2) + b4.getLeft();
                            } else {
                                i2 = 0;
                            }
                            if (i7 == i6) {
                                i3 = (b5.getWidth() / 2) + b5.getLeft();
                            } else {
                                i3 = recyclerView.getWidth();
                            }
                            canvas.drawRect((float) i2, (float) top, (float) i3, (float) bottom, this.c.g0.f4216h);
                        }
                    }
                }
            }
        }
    }
}
