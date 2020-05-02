package i.c.a.b.i.a;

/* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
public final class v5 implements Runnable {
    public final /* synthetic */ na e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ t5 f3913f;

    public v5(t5 t5Var, na naVar) {
        this.f3913f = t5Var;
        this.e = naVar;
    }

    public final void run() {
        this.f3913f.a.o();
        if (this.e.f3792g.a() == null) {
            t9 t9Var = this.f3913f.a;
            na naVar = this.e;
            if (t9Var != null) {
                ea a = t9Var.a(naVar.e);
                if (a != null) {
                    t9Var.b(naVar, a);
                    return;
                }
                return;
            }
            throw null;
        }
        t9 t9Var2 = this.f3913f.a;
        na naVar2 = this.e;
        if (t9Var2 != null) {
            ea a2 = t9Var2.a(naVar2.e);
            if (a2 != null) {
                t9Var2.a(naVar2, a2);
                return;
            }
            return;
        }
        throw null;
    }
}
