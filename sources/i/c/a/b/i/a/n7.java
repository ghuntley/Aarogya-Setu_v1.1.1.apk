package i.c.a.b.i.a;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class n7 implements Runnable {
    public final /* synthetic */ long e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ t6 f3788f;

    public n7(t6 t6Var, long j2) {
        this.f3788f = t6Var;
        this.e = j2;
    }

    public final void run() {
        this.f3788f.g().f3940q.a(this.e);
        this.f3788f.n().f3765m.a("Session timeout duration set", Long.valueOf(this.e));
    }
}
