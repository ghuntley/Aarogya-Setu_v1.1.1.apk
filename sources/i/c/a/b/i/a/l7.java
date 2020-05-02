package i.c.a.b.i.a;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class l7 implements Runnable {
    public final /* synthetic */ boolean e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ t6 f3749f;

    public l7(t6 t6Var, boolean z) {
        this.f3749f = t6Var;
        this.e = z;
    }

    public final void run() {
        boolean b2 = this.f3749f.a.b();
        boolean a = this.f3749f.a.a();
        this.f3749f.a.A = Boolean.valueOf(this.e);
        if (a == this.e) {
            this.f3749f.a.n().f3766n.a("Default data collection state already set to", Boolean.valueOf(this.e));
        }
        if (this.f3749f.a.b() == b2 || this.f3749f.a.b() != this.f3749f.a.a()) {
            this.f3749f.a.n().f3763k.a("Default data collection is different than actual status", Boolean.valueOf(this.e), Boolean.valueOf(b2));
        }
        this.f3749f.C();
    }
}
