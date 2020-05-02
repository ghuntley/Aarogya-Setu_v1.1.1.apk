package i.c.a.b.i.a;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class d8 extends f {
    public final /* synthetic */ z7 e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d8(z7 z7Var, m6 m6Var) {
        super(m6Var);
        this.e = z7Var;
    }

    public final void a() {
        z7 z7Var = this.e;
        z7Var.c();
        if (z7Var.z()) {
            z7Var.n().f3766n.a("Inactivity, disconnecting from the service");
            z7Var.B();
        }
    }
}
