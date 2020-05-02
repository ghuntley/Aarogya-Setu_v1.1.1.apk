package i.c.a.b.i.a;

import android.os.Handler;
import i.c.a.b.d.l.q;
import i.c.a.b.d.o.c;
import i.c.a.b.g.g.j7;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public abstract class f {
    public static volatile Handler d;
    public final m6 a;

    /* renamed from: b  reason: collision with root package name */
    public final Runnable f3661b;
    public volatile long c;

    public f(m6 m6Var) {
        q.a(m6Var);
        this.a = m6Var;
        this.f3661b = new h(this, m6Var);
    }

    public abstract void a();

    public final void a(long j2) {
        b();
        if (j2 < 0) {
            return;
        }
        if (((c) this.a.l()) != null) {
            this.c = System.currentTimeMillis();
            if (!c().postDelayed(this.f3661b, j2)) {
                this.a.n().f3758f.a("Failed to schedule delayed post. time", Long.valueOf(j2));
                return;
            }
            return;
        }
        throw null;
    }

    public final void b() {
        this.c = 0;
        c().removeCallbacks(this.f3661b);
    }

    public final Handler c() {
        Handler handler;
        if (d != null) {
            return d;
        }
        synchronized (f.class) {
            if (d == null) {
                d = new j7(this.a.h().getMainLooper());
            }
            handler = d;
        }
        return handler;
    }
}
