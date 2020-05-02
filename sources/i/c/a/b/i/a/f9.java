package i.c.a.b.i.a;

import i.c.a.b.d.o.c;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class f9 implements Runnable {
    public final /* synthetic */ long e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ g9 f3673f;

    public f9(g9 g9Var, long j2) {
        this.f3673f = g9Var;
        this.e = j2;
    }

    public final void run() {
        k9 k9Var;
        g9 g9Var = this.f3673f;
        long j2 = this.e;
        g9Var.c();
        g9Var.A();
        g9Var.n().f3766n.a("Activity resumed, time", Long.valueOf(j2));
        h9 h9Var = g9Var.f3689f;
        h9Var.f3697b.c();
        if (h9Var.f3697b.a.f3861g.a(o.J0) && (k9Var = h9Var.a) != null) {
            h9Var.f3697b.c.removeCallbacks(k9Var);
        }
        m9 m9Var = g9Var.e;
        m9Var.d.c();
        m9Var.c.b();
        m9Var.a = j2;
        m9Var.f3780b = j2;
        o9 o9Var = g9Var.d;
        o9Var.a.c();
        if (o9Var.a.a.b()) {
            if (o9Var.a.a.f3861g.a(o.W)) {
                o9Var.a.g().y.a(false);
            }
            if (((c) o9Var.a.a.f3868n) != null) {
                o9Var.a(System.currentTimeMillis(), false);
                return;
            }
            throw null;
        }
    }
}
