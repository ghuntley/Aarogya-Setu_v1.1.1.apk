package h.r.d;

import androidx.recyclerview.widget.RecyclerView;
import h.r.d.k;

/* compiled from: SimpleItemAnimator */
public abstract class v extends RecyclerView.l {

    /* renamed from: g  reason: collision with root package name */
    public boolean f2146g = true;

    public abstract boolean a(RecyclerView.d0 d0Var, int i2, int i3, int i4, int i5);

    public boolean a(RecyclerView.d0 d0Var, RecyclerView.d0 d0Var2, RecyclerView.l.c cVar, RecyclerView.l.c cVar2) {
        int i2;
        int i3;
        int i4 = cVar.a;
        int i5 = cVar.f313b;
        if (d0Var2.o()) {
            int i6 = cVar.a;
            i2 = cVar.f313b;
            i3 = i6;
        } else {
            i3 = cVar2.a;
            i2 = cVar2.f313b;
        }
        k kVar = (k) this;
        if (d0Var == d0Var2) {
            return kVar.a(d0Var, i4, i5, i3, i2);
        }
        float translationX = d0Var.e.getTranslationX();
        float translationY = d0Var.e.getTranslationY();
        float alpha = d0Var.e.getAlpha();
        kVar.e(d0Var);
        d0Var.e.setTranslationX(translationX);
        d0Var.e.setTranslationY(translationY);
        d0Var.e.setAlpha(alpha);
        kVar.e(d0Var2);
        d0Var2.e.setTranslationX((float) (-((int) (((float) (i3 - i4)) - translationX))));
        d0Var2.e.setTranslationY((float) (-((int) (((float) (i2 - i5)) - translationY))));
        d0Var2.e.setAlpha(0.0f);
        kVar.f2101k.add(new k.a(d0Var, d0Var2, i4, i5, i3, i2));
        return true;
    }
}
