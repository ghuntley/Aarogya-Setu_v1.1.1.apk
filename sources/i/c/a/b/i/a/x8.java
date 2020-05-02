package i.c.a.b.i.a;

import i.c.a.b.d.l.q;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class x8 implements Runnable {
    public final /* synthetic */ e4 e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ s8 f3952f;

    public x8(s8 s8Var, e4 e4Var) {
        this.f3952f = s8Var;
        this.e = e4Var;
    }

    public final void run() {
        synchronized (this.f3952f) {
            this.f3952f.a = false;
            if (!this.f3952f.c.z()) {
                this.f3952f.c.n().f3765m.a("Connected to remote service");
                z7 z7Var = this.f3952f.c;
                e4 e4Var = this.e;
                z7Var.c();
                q.a(e4Var);
                z7Var.d = e4Var;
                z7Var.D();
                z7Var.F();
            }
        }
    }
}
