package i.c.a.b.i.a;

import i.c.a.b.d.l.q;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class a7 implements Runnable {
    public final /* synthetic */ s6 e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ t6 f3580f;

    public a7(t6 t6Var, s6 s6Var) {
        this.f3580f = t6Var;
        this.e = s6Var;
    }

    public final void run() {
        s6 s6Var;
        t6 t6Var = this.f3580f;
        s6 s6Var2 = this.e;
        t6Var.c();
        t6Var.a();
        t6Var.w();
        if (!(s6Var2 == null || s6Var2 == (s6Var = t6Var.d))) {
            q.b(s6Var == null, (Object) "EventInterceptor already set.");
        }
        t6Var.d = s6Var2;
    }
}
