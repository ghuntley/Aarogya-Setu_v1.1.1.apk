package h.r.d;

import android.view.View;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: SnapHelper */
public abstract class w extends RecyclerView.r {
    public RecyclerView a;

    /* renamed from: b  reason: collision with root package name */
    public Scroller f2147b;
    public final RecyclerView.t c = new a();

    public abstract View a(RecyclerView.o oVar);

    public void a() {
        RecyclerView.o layoutManager;
        View a2;
        RecyclerView recyclerView = this.a;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null && (a2 = a(layoutManager)) != null) {
            int[] a3 = a(layoutManager, a2);
            if (a3[0] != 0 || a3[1] != 0) {
                this.a.smoothScrollBy(a3[0], a3[1]);
            }
        }
    }

    public abstract int[] a(RecyclerView.o oVar, View view);

    /* compiled from: SnapHelper */
    public class a extends RecyclerView.t {
        public boolean a = false;

        public a() {
        }

        public void a(RecyclerView recyclerView, int i2) {
            if (i2 == 0 && this.a) {
                this.a = false;
                w.this.a();
            }
        }

        public void a(RecyclerView recyclerView, int i2, int i3) {
            if (i2 != 0 || i3 != 0) {
                this.a = true;
            }
        }
    }
}
