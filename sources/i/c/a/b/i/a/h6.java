package i.c.a.b.i.a;

/* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
public final class h6 implements Runnable {
    public final /* synthetic */ aa e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ ea f3692f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ t5 f3693g;

    public h6(t5 t5Var, aa aaVar, ea eaVar) {
        this.f3693g = t5Var;
        this.e = aaVar;
        this.f3692f = eaVar;
    }

    public final void run() {
        this.f3693g.a.o();
        if (this.e.a() == null) {
            this.f3693g.a.b(this.e, this.f3692f);
        } else {
            this.f3693g.a.a(this.e, this.f3692f);
        }
    }
}
