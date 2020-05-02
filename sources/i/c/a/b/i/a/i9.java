package i.c.a.b.i.a;

import i.c.a.b.d.o.c;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class i9 implements Runnable {
    public final /* synthetic */ long e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ g9 f3720f;

    public i9(g9 g9Var, long j2) {
        this.f3720f = g9Var;
        this.e = j2;
    }

    public final void run() {
        g9 g9Var = this.f3720f;
        long j2 = this.e;
        g9Var.c();
        g9Var.A();
        g9Var.n().f3766n.a("Activity paused, time", Long.valueOf(j2));
        h9 h9Var = g9Var.f3689f;
        if (h9Var.f3697b.a.f3861g.a(o.J0)) {
            if (((c) h9Var.f3697b.a.f3868n) != null) {
                k9 k9Var = new k9(h9Var, System.currentTimeMillis());
                h9Var.a = k9Var;
                h9Var.f3697b.c.postDelayed(k9Var, 2000);
            } else {
                throw null;
            }
        }
        m9 m9Var = g9Var.e;
        m9Var.c.b();
        if (m9Var.a != 0) {
            m9Var.d.g().w.a((j2 - m9Var.a) + m9Var.d.g().w.a());
        }
        o9 o9Var = g9Var.d;
        if (o9Var.a.a.f3861g.a(o.W)) {
            o9Var.a.g().y.a(true);
        }
    }
}
