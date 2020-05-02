package i.c.a.b.i.a;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class b8 implements Runnable {
    public final /* synthetic */ w7 e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ long f3598f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ y7 f3599g;

    public b8(y7 y7Var, w7 w7Var, long j2) {
        this.f3599g = y7Var;
        this.e = w7Var;
        this.f3598f = j2;
    }

    public final void run() {
        y7.a(this.f3599g, this.e, false, this.f3598f);
        y7 y7Var = this.f3599g;
        y7Var.c = null;
        z7 r = y7Var.r();
        r.c();
        r.w();
        r.a((Runnable) new i8(r, (w7) null));
    }
}
