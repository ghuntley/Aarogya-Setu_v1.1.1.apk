package i.c.a.b.i.a;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import i.c.a.b.d.l.q;
import i.c.a.b.g.g.b2;
import i.c.a.b.g.g.q4;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class h5 implements ServiceConnection {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e5 f3691b;

    public h5(e5 e5Var, String str) {
        this.f3691b = e5Var;
        this.a = str;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            this.f3691b.a.n().f3761i.a("Install Referrer connection returned with null binder");
            return;
        }
        try {
            b2 a2 = q4.a(iBinder);
            if (a2 == null) {
                this.f3691b.a.n().f3761i.a("Install Referrer Service implementation was not found");
                return;
            }
            this.f3691b.a.n().f3766n.a("Install Referrer Service connected");
            m5 k2 = this.f3691b.a.k();
            g5 g5Var = new g5(this, a2, this);
            k2.o();
            q.a(g5Var);
            k2.a((q5<?>) new q5(k2, g5Var, "Task exception on worker thread"));
        } catch (Exception e) {
            this.f3691b.a.n().f3761i.a("Exception occurred while calling Install Referrer API", e);
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f3691b.a.n().f3766n.a("Install Referrer Service disconnected");
    }
}
