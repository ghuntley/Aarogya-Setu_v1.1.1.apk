package h.r.d;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: OrientationHelper */
public final class s extends t {
    public s(RecyclerView.o oVar) {
        super(oVar, (r) null);
    }

    public int a() {
        return this.a.r;
    }

    public int b() {
        RecyclerView.o oVar = this.a;
        return oVar.r - oVar.i();
    }

    public int c(View view) {
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        return this.a.f(view) + pVar.leftMargin + pVar.rightMargin;
    }

    public int d(View view) {
        return this.a.h(view) - ((RecyclerView.p) view.getLayoutParams()).topMargin;
    }

    public int e(View view) {
        this.a.a(view, true, this.c);
        return this.c.bottom;
    }

    public int f() {
        return this.a.l();
    }

    public int g() {
        RecyclerView.o oVar = this.a;
        return (oVar.r - oVar.l()) - this.a.i();
    }

    public int f(View view) {
        this.a.a(view, true, this.c);
        return this.c.top;
    }

    public void a(int i2) {
        this.a.e(i2);
    }

    public int c() {
        return this.a.i();
    }

    public int d() {
        return this.a.f325p;
    }

    public int e() {
        return this.a.f324o;
    }

    public int a(View view) {
        return this.a.c(view) + ((RecyclerView.p) view.getLayoutParams()).bottomMargin;
    }

    public int b(View view) {
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        return this.a.e(view) + pVar.topMargin + pVar.bottomMargin;
    }
}
