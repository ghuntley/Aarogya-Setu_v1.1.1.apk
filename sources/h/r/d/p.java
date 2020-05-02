package h.r.d;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: LinearSnapHelper */
public class p extends w {
    public t d;
    public t e;

    public int[] a(RecyclerView.o oVar, View view) {
        int[] iArr = new int[2];
        if (oVar.a()) {
            iArr[0] = a(view, b(oVar));
        } else {
            iArr[0] = 0;
        }
        if (oVar.b()) {
            iArr[1] = a(view, c(oVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    public final t b(RecyclerView.o oVar) {
        t tVar = this.e;
        if (tVar == null || tVar.a != oVar) {
            this.e = new r(oVar);
        }
        return this.e;
    }

    public final t c(RecyclerView.o oVar) {
        t tVar = this.d;
        if (tVar == null || tVar.a != oVar) {
            this.d = new s(oVar);
        }
        return this.d;
    }

    public View a(RecyclerView.o oVar) {
        if (oVar.b()) {
            return a(oVar, c(oVar));
        }
        if (oVar.a()) {
            return a(oVar, b(oVar));
        }
        return null;
    }

    public final int a(RecyclerView.o oVar, t tVar, int i2, int i3) {
        int max;
        this.f2147b.fling(0, 0, i2, i3, RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE, RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE);
        int[] iArr = {this.f2147b.getFinalX(), this.f2147b.getFinalY()};
        int d2 = oVar.d();
        float f2 = 1.0f;
        if (d2 != 0) {
            View view = null;
            View view2 = null;
            int i4 = Integer.MAX_VALUE;
            int i5 = RecyclerView.UNDEFINED_DURATION;
            for (int i6 = 0; i6 < d2; i6++) {
                View c = oVar.c(i6);
                int i7 = oVar.i(c);
                if (i7 != -1) {
                    if (i7 < i4) {
                        view = c;
                        i4 = i7;
                    }
                    if (i7 > i5) {
                        view2 = c;
                        i5 = i7;
                    }
                }
            }
            if (!(view == null || view2 == null || (max = Math.max(tVar.a(view), tVar.a(view2)) - Math.min(tVar.d(view), tVar.d(view2))) == 0)) {
                f2 = (((float) max) * 1.0f) / ((float) ((i5 - i4) + 1));
            }
        }
        if (f2 <= 0.0f) {
            return 0;
        }
        return Math.round(((float) (Math.abs(iArr[0]) > Math.abs(iArr[1]) ? iArr[0] : iArr[1])) / f2);
    }

    public final int a(View view, t tVar) {
        return ((tVar.b(view) / 2) + tVar.d(view)) - ((tVar.g() / 2) + tVar.f());
    }

    public final View a(RecyclerView.o oVar, t tVar) {
        int d2 = oVar.d();
        View view = null;
        if (d2 == 0) {
            return null;
        }
        int g2 = (tVar.g() / 2) + tVar.f();
        int i2 = Integer.MAX_VALUE;
        for (int i3 = 0; i3 < d2; i3++) {
            View c = oVar.c(i3);
            int abs = Math.abs(((tVar.b(c) / 2) + tVar.d(c)) - g2);
            if (abs < i2) {
                view = c;
                i2 = abs;
            }
        }
        return view;
    }
}
