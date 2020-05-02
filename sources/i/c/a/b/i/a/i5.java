package i.c.a.b.i.a;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class i5 implements Runnable {
    public final /* synthetic */ s5 e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ m4 f3709f;

    public i5(s5 s5Var, m4 m4Var) {
        this.e = s5Var;
        this.f3709f = m4Var;
    }

    public final void run() {
        e5 e5Var = this.e.w;
        if (e5Var == null) {
            this.f3709f.f3758f.a("Install Referrer Reporter is null");
            return;
        }
        s5 s5Var = e5Var.a;
        if (s5Var != null) {
            e5Var.a(s5Var.a.getPackageName());
            return;
        }
        throw null;
    }
}
