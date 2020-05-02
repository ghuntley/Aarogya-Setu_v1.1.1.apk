package i.c.a.b.i.a;

import android.content.Context;
import android.content.Intent;
import i.c.a.b.d.l.q;
import i.c.a.b.g.g.pc;
import i.c.a.b.i.a.d9;

/* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
public final class y8<T extends Context & d9> {
    public final T a;

    public y8(T t) {
        q.a(t);
        this.a = t;
    }

    public final void a(Runnable runnable) {
        t9 a2 = t9.a((Context) this.a);
        m5 k2 = a2.k();
        e9 e9Var = new e9(a2, runnable);
        k2.o();
        q.a(e9Var);
        k2.a((q5<?>) new q5(k2, e9Var, "Task exception on worker thread"));
    }

    public final void b(Intent intent) {
        if (intent == null) {
            a().f3758f.a("onRebind called with null intent");
            return;
        }
        a().f3766n.a("onRebind called. action", intent.getAction());
    }

    public final boolean a(Intent intent) {
        if (intent == null) {
            a().f3758f.a("onUnbind called with null intent");
            return true;
        }
        a().f3766n.a("onUnbind called for intent. action", intent.getAction());
        return true;
    }

    public final m4 a() {
        return s5.a((Context) this.a, (pc) null).n();
    }
}
