package i.c.a.b.i.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import i.c.a.b.d.l.q;

/* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
public class v4 extends BroadcastReceiver {
    public final t9 a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f3912b;
    public boolean c;

    static {
        Class<v4> cls = v4.class;
    }

    public v4(t9 t9Var) {
        q.a(t9Var);
        this.a = t9Var;
    }

    public final void a() {
        this.a.i();
        this.a.k().c();
        this.a.k().c();
        if (this.f3912b) {
            this.a.n().f3766n.a("Unregistering connectivity change receiver");
            this.f3912b = false;
            this.c = false;
            try {
                this.a.f3896i.a.unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                this.a.n().f3758f.a("Failed to unregister the network broadcast receiver", e);
            }
        }
    }

    public void onReceive(Context context, Intent intent) {
        this.a.i();
        String action = intent.getAction();
        this.a.n().f3766n.a("NetworkBroadcastReceiver received action", action);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            boolean t = this.a.c().t();
            if (this.c != t) {
                this.c = t;
                m5 k2 = this.a.k();
                y4 y4Var = new y4(this, t);
                k2.o();
                q.a(y4Var);
                k2.a((q5<?>) new q5(k2, y4Var, "Task exception on worker thread"));
                return;
            }
            return;
        }
        this.a.n().f3761i.a("NetworkBroadcastReceiver received unknown action", action);
    }
}
