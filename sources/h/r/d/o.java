package h.r.d;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: LinearSmoothScroller */
public class o extends RecyclerView.z {

    /* renamed from: i  reason: collision with root package name */
    public final LinearInterpolator f2137i = new LinearInterpolator();

    /* renamed from: j  reason: collision with root package name */
    public final DecelerateInterpolator f2138j = new DecelerateInterpolator();

    /* renamed from: k  reason: collision with root package name */
    public PointF f2139k;

    /* renamed from: l  reason: collision with root package name */
    public final DisplayMetrics f2140l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f2141m = false;

    /* renamed from: n  reason: collision with root package name */
    public float f2142n;

    /* renamed from: o  reason: collision with root package name */
    public int f2143o = 0;

    /* renamed from: p  reason: collision with root package name */
    public int f2144p = 0;

    public o(Context context) {
        this.f2140l = context.getResources().getDisplayMetrics();
    }

    public float a(DisplayMetrics displayMetrics) {
        return 25.0f / ((float) displayMetrics.densityDpi);
    }

    public int b(int i2) {
        float abs = (float) Math.abs(i2);
        if (!this.f2141m) {
            this.f2142n = a(this.f2140l);
            this.f2141m = true;
        }
        return (int) Math.ceil((double) (abs * this.f2142n));
    }

    public void a(View view, RecyclerView.a0 a0Var, RecyclerView.z.a aVar) {
        int i2;
        int i3;
        int i4;
        PointF pointF = this.f2139k;
        int i5 = 0;
        int i6 = (pointF == null || pointF.x == 0.0f) ? 0 : i4 > 0 ? 1 : -1;
        RecyclerView.o oVar = this.c;
        if (oVar == null || !oVar.a()) {
            i2 = 0;
        } else {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            i2 = a(oVar.d(view) - pVar.leftMargin, oVar.g(view) + pVar.rightMargin, oVar.j(), oVar.f326q - oVar.k(), i6);
        }
        PointF pointF2 = this.f2139k;
        int i7 = (pointF2 == null || pointF2.y == 0.0f) ? 0 : i3 > 0 ? 1 : -1;
        RecyclerView.o oVar2 = this.c;
        if (oVar2 != null && oVar2.b()) {
            RecyclerView.p pVar2 = (RecyclerView.p) view.getLayoutParams();
            i5 = a(oVar2.h(view) - pVar2.topMargin, oVar2.c(view) + pVar2.bottomMargin, oVar2.l(), oVar2.r - oVar2.i(), i7);
        }
        int ceil = (int) Math.ceil(((double) b((int) Math.sqrt((double) ((i5 * i5) + (i2 * i2))))) / 0.3356d);
        if (ceil > 0) {
            aVar.a(-i2, -i5, ceil, this.f2138j);
        }
    }

    public int a(int i2, int i3, int i4, int i5, int i6) {
        if (i6 == -1) {
            return i4 - i2;
        }
        if (i6 == 0) {
            int i7 = i4 - i2;
            if (i7 > 0) {
                return i7;
            }
            int i8 = i5 - i3;
            if (i8 < 0) {
                return i8;
            }
            return 0;
        } else if (i6 == 1) {
            return i5 - i3;
        } else {
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
    }
}
