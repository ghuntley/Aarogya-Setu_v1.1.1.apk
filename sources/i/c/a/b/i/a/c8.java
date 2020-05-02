package i.c.a.b.i.a;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class c8 implements Runnable {
    public final /* synthetic */ boolean e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ aa f3624f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ ea f3625g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ z7 f3626h;

    public c8(z7 z7Var, boolean z, aa aaVar, ea eaVar) {
        this.f3626h = z7Var;
        this.e = z;
        this.f3624f = aaVar;
        this.f3625g = eaVar;
    }

    public final void run() {
        z7 z7Var = this.f3626h;
        e4 e4Var = z7Var.d;
        if (e4Var == null) {
            z7Var.n().f3758f.a("Discarding data. Failed to set user property");
            return;
        }
        z7Var.a(e4Var, this.e ? null : this.f3624f, this.f3625g);
        this.f3626h.D();
    }
}
