package i.c.a.b.i.a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import i.c.a.b.d.l.b;
import i.c.a.b.d.l.q;
import i.c.a.b.d.n.a;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class s8 implements ServiceConnection, b.a, b.C0111b {
    public volatile boolean a;

    /* renamed from: b  reason: collision with root package name */
    public volatile n4 f3872b;
    public final /* synthetic */ z7 c;

    public s8(z7 z7Var) {
        this.c = z7Var;
    }

    public final void a(Intent intent) {
        this.c.c();
        Context context = this.c.a.a;
        a a2 = a.a();
        synchronized (this) {
            if (this.a) {
                this.c.n().f3766n.a("Connection attempt already in progress");
                return;
            }
            this.c.n().f3766n.a("Using local app measurement service");
            this.a = true;
            s8 s8Var = this.c.c;
            if (a2 != null) {
                context.getClass().getName();
                a2.b(context, intent, s8Var, 129);
                return;
            }
            throw null;
        }
    }

    public final void b(Bundle bundle) {
        q.a("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                this.c.k().a((Runnable) new x8(this, (e4) this.f3872b.q()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f3872b = null;
                this.a = false;
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:13|(1:15)(1:16)|17|18|24|25) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x005a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onServiceConnected(android.content.ComponentName r4, android.os.IBinder r5) {
        /*
            r3 = this;
            java.lang.String r4 = "MeasurementServiceConnection.onServiceConnected"
            i.c.a.b.d.l.q.a((java.lang.String) r4)
            monitor-enter(r3)
            r4 = 0
            if (r5 != 0) goto L_0x001d
            r3.a = r4     // Catch:{ all -> 0x001a }
            i.c.a.b.i.a.z7 r4 = r3.c     // Catch:{ all -> 0x001a }
            i.c.a.b.i.a.m4 r4 = r4.n()     // Catch:{ all -> 0x001a }
            i.c.a.b.i.a.o4 r4 = r4.f3758f     // Catch:{ all -> 0x001a }
            java.lang.String r5 = "Service connected with null binder"
            r4.a(r5)     // Catch:{ all -> 0x001a }
            monitor-exit(r3)     // Catch:{ all -> 0x001a }
            return
        L_0x001a:
            r4 = move-exception
            goto L_0x009d
        L_0x001d:
            r0 = 0
            java.lang.String r1 = r5.getInterfaceDescriptor()     // Catch:{ RemoteException -> 0x0059 }
            java.lang.String r2 = "com.google.android.gms.measurement.internal.IMeasurementService"
            boolean r2 = r2.equals(r1)     // Catch:{ RemoteException -> 0x0059 }
            if (r2 == 0) goto L_0x004a
            java.lang.String r1 = "com.google.android.gms.measurement.internal.IMeasurementService"
            android.os.IInterface r1 = r5.queryLocalInterface(r1)     // Catch:{ RemoteException -> 0x0059 }
            boolean r2 = r1 instanceof i.c.a.b.i.a.e4     // Catch:{ RemoteException -> 0x0059 }
            if (r2 == 0) goto L_0x0037
            i.c.a.b.i.a.e4 r1 = (i.c.a.b.i.a.e4) r1     // Catch:{ RemoteException -> 0x0059 }
            goto L_0x003c
        L_0x0037:
            i.c.a.b.i.a.g4 r1 = new i.c.a.b.i.a.g4     // Catch:{ RemoteException -> 0x0059 }
            r1.<init>(r5)     // Catch:{ RemoteException -> 0x0059 }
        L_0x003c:
            i.c.a.b.i.a.z7 r5 = r3.c     // Catch:{ RemoteException -> 0x005a }
            i.c.a.b.i.a.m4 r5 = r5.n()     // Catch:{ RemoteException -> 0x005a }
            i.c.a.b.i.a.o4 r5 = r5.f3766n     // Catch:{ RemoteException -> 0x005a }
            java.lang.String r2 = "Bound to IMeasurementService interface"
            r5.a(r2)     // Catch:{ RemoteException -> 0x005a }
            goto L_0x0067
        L_0x004a:
            i.c.a.b.i.a.z7 r5 = r3.c     // Catch:{ RemoteException -> 0x0059 }
            i.c.a.b.i.a.m4 r5 = r5.n()     // Catch:{ RemoteException -> 0x0059 }
            i.c.a.b.i.a.o4 r5 = r5.f3758f     // Catch:{ RemoteException -> 0x0059 }
            java.lang.String r2 = "Got binder with a wrong descriptor"
            r5.a(r2, r1)     // Catch:{ RemoteException -> 0x0059 }
            r1 = r0
            goto L_0x0067
        L_0x0059:
            r1 = r0
        L_0x005a:
            i.c.a.b.i.a.z7 r5 = r3.c     // Catch:{ all -> 0x001a }
            i.c.a.b.i.a.m4 r5 = r5.n()     // Catch:{ all -> 0x001a }
            i.c.a.b.i.a.o4 r5 = r5.f3758f     // Catch:{ all -> 0x001a }
            java.lang.String r2 = "Service connect failed to get IMeasurementService"
            r5.a(r2)     // Catch:{ all -> 0x001a }
        L_0x0067:
            if (r1 != 0) goto L_0x0080
            r3.a = r4     // Catch:{ all -> 0x001a }
            i.c.a.b.d.n.a r4 = i.c.a.b.d.n.a.a()     // Catch:{ IllegalArgumentException -> 0x009b }
            i.c.a.b.i.a.z7 r5 = r3.c     // Catch:{ IllegalArgumentException -> 0x009b }
            i.c.a.b.i.a.s5 r5 = r5.a     // Catch:{ IllegalArgumentException -> 0x009b }
            android.content.Context r5 = r5.a     // Catch:{ IllegalArgumentException -> 0x009b }
            i.c.a.b.i.a.z7 r1 = r3.c     // Catch:{ IllegalArgumentException -> 0x009b }
            i.c.a.b.i.a.s8 r1 = r1.c     // Catch:{ IllegalArgumentException -> 0x009b }
            if (r4 == 0) goto L_0x007f
            r5.unbindService(r1)     // Catch:{ IllegalArgumentException -> 0x009b }
            goto L_0x009b
        L_0x007f:
            throw r0     // Catch:{ IllegalArgumentException -> 0x009b }
        L_0x0080:
            i.c.a.b.i.a.z7 r4 = r3.c     // Catch:{ all -> 0x001a }
            i.c.a.b.i.a.m5 r4 = r4.k()     // Catch:{ all -> 0x001a }
            i.c.a.b.i.a.v8 r5 = new i.c.a.b.i.a.v8     // Catch:{ all -> 0x001a }
            r5.<init>(r3, r1)     // Catch:{ all -> 0x001a }
            r4.o()     // Catch:{ all -> 0x001a }
            i.c.a.b.d.l.q.a(r5)     // Catch:{ all -> 0x001a }
            i.c.a.b.i.a.q5 r0 = new i.c.a.b.i.a.q5     // Catch:{ all -> 0x001a }
            java.lang.String r1 = "Task exception on worker thread"
            r0.<init>(r4, r5, r1)     // Catch:{ all -> 0x001a }
            r4.a((i.c.a.b.i.a.q5<?>) r0)     // Catch:{ all -> 0x001a }
        L_0x009b:
            monitor-exit(r3)     // Catch:{ all -> 0x001a }
            return
        L_0x009d:
            monitor-exit(r3)     // Catch:{ all -> 0x001a }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.a.b.i.a.s8.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        q.a("MeasurementServiceConnection.onServiceDisconnected");
        this.c.n().f3765m.a("Service disconnected");
        m5 k2 = this.c.k();
        u8 u8Var = new u8(this, componentName);
        k2.o();
        q.a(u8Var);
        k2.a((q5<?>) new q5(k2, u8Var, "Task exception on worker thread"));
    }

    public final void a() {
        this.c.c();
        Context context = this.c.a.a;
        synchronized (this) {
            if (this.a) {
                this.c.n().f3766n.a("Connection attempt already in progress");
            } else if (this.f3872b == null || (!this.f3872b.a() && !this.f3872b.c())) {
                this.f3872b = new n4(context, Looper.getMainLooper(), this, this);
                this.c.n().f3766n.a("Connecting to remote service");
                this.a = true;
                this.f3872b.k();
            } else {
                this.c.n().f3766n.a("Already awaiting connection attempt");
            }
        }
    }

    public final void a(int i2) {
        q.a("MeasurementServiceConnection.onConnectionSuspended");
        this.c.n().f3765m.a("Service connection suspended");
        m5 k2 = this.c.k();
        w8 w8Var = new w8(this);
        k2.o();
        q.a(w8Var);
        k2.a((q5<?>) new q5(k2, w8Var, "Task exception on worker thread"));
    }

    public final void a(i.c.a.b.d.b bVar) {
        q.a("MeasurementServiceConnection.onConnectionFailed");
        s5 s5Var = this.c.a;
        m4 m4Var = s5Var.f3863i;
        m4 m4Var2 = (m4Var == null || !m4Var.s()) ? null : s5Var.f3863i;
        if (m4Var2 != null) {
            m4Var2.f3761i.a("Service connection failed", bVar);
        }
        synchronized (this) {
            this.a = false;
            this.f3872b = null;
        }
        m5 k2 = this.c.k();
        z8 z8Var = new z8(this);
        k2.o();
        q.a(z8Var);
        k2.a((q5<?>) new q5(k2, z8Var, "Task exception on worker thread"));
    }
}
