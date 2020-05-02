package i.c.a.b.i.a;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class o7 implements Runnable {
    public final /* synthetic */ long e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ t6 f3817f;

    public o7(t6 t6Var, long j2) {
        this.f3817f = t6Var;
        this.e = j2;
    }

    public final void run() {
        this.f3817f.g().f3939p.a(this.e);
        this.f3817f.n().f3765m.a("Minimum session duration set", Long.valueOf(this.e));
    }
}
