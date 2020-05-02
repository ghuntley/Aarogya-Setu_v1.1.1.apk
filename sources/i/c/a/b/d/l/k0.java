package i.c.a.b.d.l;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import i.c.a.b.d.l.i;
import i.c.a.b.d.n.a;
import i.c.a.b.g.d.g;
import java.util.HashMap;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public final class k0 extends i implements Handler.Callback {
    @GuardedBy("mConnectionStatus")
    public final HashMap<i.a, m0> c = new HashMap<>();
    public final Context d;
    public final Handler e;

    /* renamed from: f  reason: collision with root package name */
    public final a f3134f;

    /* renamed from: g  reason: collision with root package name */
    public final long f3135g;

    /* renamed from: h  reason: collision with root package name */
    public final long f3136h;

    public k0(Context context) {
        this.d = context.getApplicationContext();
        this.e = new g(context.getMainLooper(), this);
        this.f3134f = a.a();
        this.f3135g = 5000;
        this.f3136h = 300000;
    }

    public final boolean a(i.a aVar, ServiceConnection serviceConnection, String str) {
        boolean z;
        q.a(serviceConnection, (Object) "ServiceConnection must not be null");
        synchronized (this.c) {
            m0 m0Var = this.c.get(aVar);
            if (m0Var == null) {
                m0Var = new m0(this, aVar);
                k0 k0Var = m0Var.f3139g;
                a aVar2 = k0Var.f3134f;
                m0Var.e.a(k0Var.d);
                m0Var.a.put(serviceConnection, serviceConnection);
                m0Var.a(str);
                this.c.put(aVar, m0Var);
            } else {
                this.e.removeMessages(0, aVar);
                if (!m0Var.a.containsKey(serviceConnection)) {
                    k0 k0Var2 = m0Var.f3139g;
                    a aVar3 = k0Var2.f3134f;
                    m0Var.e.a(k0Var2.d);
                    m0Var.a.put(serviceConnection, serviceConnection);
                    int i2 = m0Var.f3137b;
                    if (i2 == 1) {
                        serviceConnection.onServiceConnected(m0Var.f3138f, m0Var.d);
                    } else if (i2 == 2) {
                        m0Var.a(str);
                    }
                } else {
                    String valueOf = String.valueOf(aVar);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 81);
                    sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                    sb.append(valueOf);
                    throw new IllegalStateException(sb.toString());
                }
            }
            z = m0Var.c;
        }
        return z;
    }

    public final void b(i.a aVar, ServiceConnection serviceConnection, String str) {
        q.a(serviceConnection, (Object) "ServiceConnection must not be null");
        synchronized (this.c) {
            m0 m0Var = this.c.get(aVar);
            if (m0Var == null) {
                String valueOf = String.valueOf(aVar);
                StringBuilder sb = new StringBuilder(valueOf.length() + 50);
                sb.append("Nonexistent connection status for service config: ");
                sb.append(valueOf);
                throw new IllegalStateException(sb.toString());
            } else if (m0Var.a.containsKey(serviceConnection)) {
                a aVar2 = m0Var.f3139g.f3134f;
                m0Var.a.remove(serviceConnection);
                if (m0Var.a.isEmpty()) {
                    this.e.sendMessageDelayed(this.e.obtainMessage(0, aVar), this.f3135g);
                }
            } else {
                String valueOf2 = String.valueOf(aVar);
                StringBuilder sb2 = new StringBuilder(valueOf2.length() + 76);
                sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                sb2.append(valueOf2);
                throw new IllegalStateException(sb2.toString());
            }
        }
    }

    public final boolean handleMessage(Message message) {
        int i2 = message.what;
        if (i2 == 0) {
            synchronized (this.c) {
                i.a aVar = (i.a) message.obj;
                m0 m0Var = this.c.get(aVar);
                if (m0Var != null && m0Var.a.isEmpty()) {
                    if (m0Var.c) {
                        m0Var.f3139g.e.removeMessages(1, m0Var.e);
                        k0 k0Var = m0Var.f3139g;
                        a aVar2 = k0Var.f3134f;
                        Context context = k0Var.d;
                        if (aVar2 != null) {
                            context.unbindService(m0Var);
                            m0Var.c = false;
                            m0Var.f3137b = 2;
                        } else {
                            throw null;
                        }
                    }
                    this.c.remove(aVar);
                }
            }
            return true;
        } else if (i2 != 1) {
            return false;
        } else {
            synchronized (this.c) {
                i.a aVar3 = (i.a) message.obj;
                m0 m0Var2 = this.c.get(aVar3);
                if (m0Var2 != null && m0Var2.f3137b == 3) {
                    String valueOf = String.valueOf(aVar3);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 47);
                    sb.append("Timeout waiting for ServiceConnection callback ");
                    sb.append(valueOf);
                    Log.e("GmsClientSupervisor", sb.toString(), new Exception());
                    ComponentName componentName = m0Var2.f3138f;
                    if (componentName == null) {
                        componentName = aVar3.c;
                    }
                    if (componentName == null) {
                        componentName = new ComponentName(aVar3.f3131b, "unknown");
                    }
                    m0Var2.onServiceDisconnected(componentName);
                }
            }
            return true;
        }
    }
}
