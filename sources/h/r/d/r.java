package h.r.d;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: OrientationHelper */
public final class r extends t {
    public r(RecyclerView.o oVar) {
        super(oVar, (r) null);
    }

    public int a() {
        return this.a.f326q;
    }

    public int b() {
        RecyclerView.o oVar = this.a;
        return oVar.f326q - oVar.k();
    }

    public int c(View view) {
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        return this.a.e(view) + pVar.topMargin + pVar.bottomMargin;
    }

    public int d(View view) {
        return this.a.d(view) - ((RecyclerView.p) view.getLayoutParams()).leftMargin;
    }

    public int e(View view) {
        this.a.a(view, true, this.c);
        return this.c.right;
    }

    public int f() {
        return this.a.j();
    }

    public int g() {
        RecyclerView.o oVar = this.a;
        return (oVar.f326q - oVar.j()) - this.a.k();
    }

    public int f(View view) {
        this.a.a(view, true, this.c);
        return this.c.left;
    }

    public void a(int i2) {
        this.a.d(i2);
    }

    public int c() {
        return this.a.k();
    }

    public int d() {
        return this.a.f324o;
    }

    public int e() {
        return this.a.f325p;
    }

    public int a(View view) {
        return this.a.g(view) + ((RecyclerView.p) view.getLayoutParams()).rightMargin;
    }

    public int b(View view) {
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        return this.a.f(view) + pVar.leftMargin + pVar.rightMargin;
    }
}
