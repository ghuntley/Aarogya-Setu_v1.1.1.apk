package h.r.d;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: SnapHelper */
public class x extends o {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ w f2149q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x(w wVar, Context context) {
        super(context);
        this.f2149q = wVar;
    }

    public void a(View view, RecyclerView.a0 a0Var, RecyclerView.z.a aVar) {
        w wVar = this.f2149q;
        RecyclerView recyclerView = wVar.a;
        if (recyclerView != null) {
            int[] a = wVar.a(recyclerView.getLayoutManager(), view);
            int i2 = a[0];
            int i3 = a[1];
            int ceil = (int) Math.ceil(((double) b(Math.max(Math.abs(i2), Math.abs(i3)))) / 0.3356d);
            if (ceil > 0) {
                aVar.a(i2, i3, ceil, this.f2138j);
            }
        }
    }

    public float a(DisplayMetrics displayMetrics) {
        return 100.0f / ((float) displayMetrics.densityDpi);
    }
}
