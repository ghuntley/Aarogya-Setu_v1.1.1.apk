package i.c.a.b.i.a;

import android.text.TextUtils;
import i.c.a.b.g.g.q9;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class c7 implements Runnable {
    public final /* synthetic */ long e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ t6 f3623f;

    public c7(t6 t6Var, long j2) {
        this.f3623f = t6Var;
        this.e = j2;
    }

    public final void run() {
        t6 t6Var = this.f3623f;
        long j2 = this.e;
        t6Var.c();
        t6Var.a();
        t6Var.w();
        t6Var.n().f3765m.a("Resetting analytics data (FE)");
        g9 u = t6Var.u();
        u.c();
        m9 m9Var = u.e;
        m9Var.c.b();
        m9Var.a = 0;
        m9Var.f3780b = 0;
        boolean b2 = t6Var.a.b();
        x4 g2 = t6Var.g();
        g2.f3933j.a(j2);
        if (!TextUtils.isEmpty(g2.g().B.a())) {
            g2.B.a((String) null);
        }
        if (q9.b() && g2.a.f3861g.a(o.S0)) {
            g2.v.a(0);
        }
        if (!g2.a.f3861g.q()) {
            g2.a(!b2);
        }
        z7 r = t6Var.r();
        r.c();
        r.a();
        r.w();
        ea a = r.a(false);
        r.C();
        r.t().z();
        r.a((Runnable) new e8(r, a));
        if (q9.b() && t6Var.a.f3861g.a(o.S0)) {
            t6Var.u().d.a();
        }
        t6Var.f3882h = !b2;
        z7 r2 = this.f3623f.r();
        AtomicReference atomicReference = new AtomicReference();
        r2.c();
        r2.w();
        r2.a((Runnable) new h8(r2, atomicReference, r2.a(false)));
    }
}
