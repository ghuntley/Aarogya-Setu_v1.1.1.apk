package i.c.a.c.v;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import h.r.d.o;

/* compiled from: SmoothCalendarLayoutManager */
public class t extends LinearLayoutManager {

    /* compiled from: SmoothCalendarLayoutManager */
    public class a extends o {
        public a(t tVar, Context context) {
            super(context);
        }

        public float a(DisplayMetrics displayMetrics) {
            return 100.0f / ((float) displayMetrics.densityDpi);
        }
    }

    public t(Context context, int i2, boolean z) {
        super(i2, z);
    }

    public void a(RecyclerView recyclerView, RecyclerView.a0 a0Var, int i2) {
        a aVar = new a(this, recyclerView.getContext());
        aVar.a = i2;
        a((RecyclerView.z) aVar);
    }
}
