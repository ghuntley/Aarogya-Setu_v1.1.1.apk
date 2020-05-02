package i.c.a.b.d.l;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Message;
import i.c.a.b.d.l.i;
import i.c.a.b.d.n.a;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public final class m0 implements ServiceConnection {
    public final Map<ServiceConnection, ServiceConnection> a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public int f3137b = 2;
    public boolean c;
    public IBinder d;
    public final i.a e;

    /* renamed from: f  reason: collision with root package name */
    public ComponentName f3138f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ k0 f3139g;

    public m0(k0 k0Var, i.a aVar) {
        this.f3139g = k0Var;
        this.e = aVar;
    }

    public final void a(String str) {
        this.f3137b = 3;
        k0 k0Var = this.f3139g;
        a aVar = k0Var.f3134f;
        Context context = k0Var.d;
        boolean b2 = aVar.b(context, this.e.a(context), this, this.e.d);
        this.c = b2;
        if (b2) {
            Message obtainMessage = this.f3139g.e.obtainMessage(1, this.e);
            k0 k0Var2 = this.f3139g;
            k0Var2.e.sendMessageDelayed(obtainMessage, k0Var2.f3136h);
            return;
        }
        this.f3137b = 2;
        try {
            a aVar2 = this.f3139g.f3134f;
            Context context2 = this.f3139g.d;
            if (aVar2 != null) {
                context2.unbindService(this);
                return;
            }
            throw null;
        } catch (IllegalArgumentException unused) {
        }
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f3139g.c) {
            this.f3139g.e.removeMessages(1, this.e);
            this.d = iBinder;
            this.f3138f = componentName;
            for (ServiceConnection onServiceConnected : this.a.values()) {
                onServiceConnected.onServiceConnected(componentName, iBinder);
            }
            this.f3137b = 1;
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f3139g.c) {
            this.f3139g.e.removeMessages(1, this.e);
            this.d = null;
            this.f3138f = componentName;
            for (ServiceConnection onServiceDisconnected : this.a.values()) {
                onServiceDisconnected.onServiceDisconnected(componentName);
            }
            this.f3137b = 2;
        }
    }
}
