package h.b.o;

import android.view.View;
import android.view.animation.Interpolator;
import h.h.m.r;
import h.h.m.s;
import h.h.m.t;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: ViewPropertyAnimatorCompatSet */
public class g {
    public final ArrayList<r> a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public long f1234b = -1;
    public Interpolator c;
    public s d;
    public boolean e;

    /* renamed from: f  reason: collision with root package name */
    public final t f1235f = new a();

    /* compiled from: ViewPropertyAnimatorCompatSet */
    public class a extends t {
        public boolean a = false;

        /* renamed from: b  reason: collision with root package name */
        public int f1236b = 0;

        public a() {
        }

        public void a(View view) {
            int i2 = this.f1236b + 1;
            this.f1236b = i2;
            if (i2 == g.this.a.size()) {
                s sVar = g.this.d;
                if (sVar != null) {
                    sVar.a((View) null);
                }
                this.f1236b = 0;
                this.a = false;
                g.this.e = false;
            }
        }

        public void b(View view) {
            if (!this.a) {
                this.a = true;
                s sVar = g.this.d;
                if (sVar != null) {
                    sVar.b((View) null);
                }
            }
        }
    }

    public void a() {
        if (this.e) {
            Iterator<r> it = this.a.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
            this.e = false;
        }
    }

    public void b() {
        View view;
        if (!this.e) {
            Iterator<r> it = this.a.iterator();
            while (it.hasNext()) {
                r next = it.next();
                long j2 = this.f1234b;
                if (j2 >= 0) {
                    next.a(j2);
                }
                Interpolator interpolator = this.c;
                if (!(interpolator == null || (view = (View) next.a.get()) == null)) {
                    view.animate().setInterpolator(interpolator);
                }
                if (this.d != null) {
                    next.a((s) this.f1235f);
                }
                View view2 = (View) next.a.get();
                if (view2 != null) {
                    view2.animate().start();
                }
            }
            this.e = true;
        }
    }
}
