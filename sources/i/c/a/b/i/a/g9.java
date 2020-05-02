package i.c.a.b.i.a;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import i.c.a.b.d.l.q;
import i.c.a.b.d.o.c;
import i.c.a.b.g.g.j7;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class g9 extends c3 {
    public Handler c;
    public o9 d = new o9(this);
    public m9 e = new m9(this);

    /* renamed from: f  reason: collision with root package name */
    public h9 f3689f = new h9(this);

    public g9(s5 s5Var) {
        super(s5Var);
    }

    public final void A() {
        c();
        if (this.c == null) {
            this.c = new j7(Looper.getMainLooper());
        }
    }

    public final boolean y() {
        return false;
    }

    public final void z() {
        if (((c) this.a.f3868n) != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            m5 k2 = k();
            f9 f9Var = new f9(this, elapsedRealtime);
            k2.o();
            q.a(f9Var);
            k2.a((q5<?>) new q5(k2, f9Var, "Task exception on worker thread"));
            return;
        }
        throw null;
    }
}
