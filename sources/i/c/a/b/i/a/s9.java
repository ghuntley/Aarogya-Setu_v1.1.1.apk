package i.c.a.b.i.a;

import i.c.a.b.d.o.c;

/* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
public final class s9 implements Runnable {
    public final /* synthetic */ y9 e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ t9 f3873f;

    public s9(t9 t9Var, y9 y9Var) {
        this.f3873f = t9Var;
        this.e = y9Var;
    }

    public final void run() {
        t9 t9Var = this.f3873f;
        t9Var.f3896i.k().c();
        d dVar = new d(t9Var);
        dVar.o();
        t9Var.c = dVar;
        t9Var.f3896i.f3861g.c = t9Var.a;
        fa faVar = new fa(t9Var);
        faVar.o();
        t9Var.f3893f = faVar;
        u7 u7Var = new u7(t9Var);
        u7Var.o();
        t9Var.f3895h = u7Var;
        q9 q9Var = new q9(t9Var);
        q9Var.o();
        t9Var.e = q9Var;
        t9Var.d = new v4(t9Var);
        if (t9Var.f3901n != t9Var.f3902o) {
            t9Var.f3896i.n().f3758f.a("Not all upload components initialized", Integer.valueOf(t9Var.f3901n), Integer.valueOf(t9Var.f3902o));
        }
        t9Var.f3897j = true;
        t9 t9Var2 = this.f3873f;
        t9Var2.f3896i.k().c();
        t9Var2.d().A();
        if (t9Var2.f3896i.i().e.a() == 0) {
            d5 d5Var = t9Var2.f3896i.i().e;
            if (((c) t9Var2.f3896i.f3868n) != null) {
                d5Var.a(System.currentTimeMillis());
            } else {
                throw null;
            }
        }
        t9Var2.u();
    }
}
