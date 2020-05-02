package i.c.a.b.i.a;

import i.c.a.b.d.l.q;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class h implements Runnable {
    public final /* synthetic */ m6 e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ f f3690f;

    public h(f fVar, m6 m6Var) {
        this.f3690f = fVar;
        this.e = m6Var;
    }

    public final void run() {
        this.e.j();
        if (oa.a()) {
            m5 k2 = this.e.k();
            k2.o();
            q.a(this);
            k2.a((q5<?>) new q5(k2, this, "Task exception on worker thread"));
            return;
        }
        boolean z = this.f3690f.c != 0;
        this.f3690f.c = 0;
        if (z) {
            this.f3690f.a();
        }
    }
}
