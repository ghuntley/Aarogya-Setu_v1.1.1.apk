package i.c.a.b.i.a;

import android.os.SystemClock;
import i.c.a.b.d.o.c;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class l9 extends f {
    public final /* synthetic */ m9 e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l9(m9 m9Var, m6 m6Var) {
        super(m6Var);
        this.e = m9Var;
    }

    public final void a() {
        m9 m9Var = this.e;
        m9Var.d.c();
        if (((c) m9Var.d.a.f3868n) != null) {
            m9Var.a(false, false, SystemClock.elapsedRealtime());
            z o2 = m9Var.d.o();
            if (((c) m9Var.d.a.f3868n) != null) {
                o2.a(SystemClock.elapsedRealtime());
                return;
            }
            throw null;
        }
        throw null;
    }
}
