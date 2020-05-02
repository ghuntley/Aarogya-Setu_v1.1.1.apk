package h.b.k;

import android.view.View;
import h.h.m.m;
import h.h.m.r;
import h.h.m.s;
import h.h.m.t;

/* compiled from: AppCompatDelegateImpl */
public class o implements Runnable {
    public final /* synthetic */ k e;

    /* compiled from: AppCompatDelegateImpl */
    public class a extends t {
        public a() {
        }

        public void a(View view) {
            o.this.e.s.setAlpha(1.0f);
            o.this.e.v.a((s) null);
            o.this.e.v = null;
        }

        public void b(View view) {
            o.this.e.s.setVisibility(0);
        }
    }

    public o(k kVar) {
        this.e = kVar;
    }

    public void run() {
        k kVar = this.e;
        kVar.t.showAtLocation(kVar.s, 55, 0, 0);
        this.e.e();
        if (this.e.j()) {
            this.e.s.setAlpha(0.0f);
            k kVar2 = this.e;
            r a2 = m.a(kVar2.s);
            a2.a(1.0f);
            kVar2.v = a2;
            r rVar = this.e.v;
            a aVar = new a();
            View view = (View) rVar.a.get();
            if (view != null) {
                rVar.a(view, aVar);
                return;
            }
            return;
        }
        this.e.s.setAlpha(1.0f);
        this.e.s.setVisibility(0);
    }
}
