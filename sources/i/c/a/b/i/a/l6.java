package i.c.a.b.i.a;

/* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
public final class l6 implements Runnable {
    public final /* synthetic */ na e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ ea f3747f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ t5 f3748g;

    public l6(t5 t5Var, na naVar, ea eaVar) {
        this.f3748g = t5Var;
        this.e = naVar;
        this.f3747f = eaVar;
    }

    public final void run() {
        this.f3748g.a.o();
        if (this.e.f3792g.a() == null) {
            this.f3748g.a.b(this.e, this.f3747f);
        } else {
            this.f3748g.a.a(this.e, this.f3747f);
        }
    }
}
