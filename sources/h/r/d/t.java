package h.r.d;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: OrientationHelper */
public abstract class t {
    public final RecyclerView.o a;

    /* renamed from: b  reason: collision with root package name */
    public int f2145b = RecyclerView.UNDEFINED_DURATION;
    public final Rect c = new Rect();

    public /* synthetic */ t(RecyclerView.o oVar, r rVar) {
        this.a = oVar;
    }

    public static t a(RecyclerView.o oVar, int i2) {
        if (i2 == 0) {
            return new r(oVar);
        }
        if (i2 == 1) {
            return new s(oVar);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public abstract int a();

    public abstract int a(View view);

    public abstract void a(int i2);

    public abstract int b();

    public abstract int b(View view);

    public abstract int c();

    public abstract int c(View view);

    public abstract int d();

    public abstract int d(View view);

    public abstract int e();

    public abstract int e(View view);

    public abstract int f();

    public abstract int f(View view);

    public abstract int g();

    public int h() {
        if (Integer.MIN_VALUE == this.f2145b) {
            return 0;
        }
        return g() - this.f2145b;
    }
}
