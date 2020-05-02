package i.c.d.k;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import com.google.firebase.iid.zzap;
import i.c.a.b.d.n.a;
import i.c.a.b.g.e.d;
import java.util.ArrayDeque;
import java.util.Queue;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.firebase:firebase-iid@@20.1.2 */
public final class i implements ServiceConnection {
    @GuardedBy("this")
    public int a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final Messenger f4700b = new Messenger(new d(Looper.getMainLooper(), new h(this)));
    public n c;
    @GuardedBy("this")
    public final Queue<p<?>> d = new ArrayDeque();
    @GuardedBy("this")
    public final SparseArray<p<?>> e = new SparseArray<>();

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ g f4701f;

    public /* synthetic */ i(g gVar, f fVar) {
        this.f4701f = gVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002f, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a4, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean a(i.c.d.k.p<?> r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            int r0 = r5.a     // Catch:{ all -> 0x00a7 }
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x004a
            if (r0 == r2) goto L_0x0043
            if (r0 == r1) goto L_0x0030
            r6 = 3
            if (r0 == r6) goto L_0x002e
            r6 = 4
            if (r0 != r6) goto L_0x0013
            goto L_0x002e
        L_0x0013:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00a7 }
            int r0 = r5.a     // Catch:{ all -> 0x00a7 }
            r1 = 26
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a7 }
            r2.<init>(r1)     // Catch:{ all -> 0x00a7 }
            java.lang.String r1 = "Unknown state: "
            r2.append(r1)     // Catch:{ all -> 0x00a7 }
            r2.append(r0)     // Catch:{ all -> 0x00a7 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x00a7 }
            r6.<init>(r0)     // Catch:{ all -> 0x00a7 }
            throw r6     // Catch:{ all -> 0x00a7 }
        L_0x002e:
            monitor-exit(r5)
            return r3
        L_0x0030:
            java.util.Queue<i.c.d.k.p<?>> r0 = r5.d     // Catch:{ all -> 0x00a7 }
            r0.add(r6)     // Catch:{ all -> 0x00a7 }
            i.c.d.k.g r6 = r5.f4701f     // Catch:{ all -> 0x00a7 }
            java.util.concurrent.ScheduledExecutorService r6 = r6.f4693b     // Catch:{ all -> 0x00a7 }
            i.c.d.k.m r0 = new i.c.d.k.m     // Catch:{ all -> 0x00a7 }
            r0.<init>(r5)     // Catch:{ all -> 0x00a7 }
            r6.execute(r0)     // Catch:{ all -> 0x00a7 }
            monitor-exit(r5)
            return r2
        L_0x0043:
            java.util.Queue<i.c.d.k.p<?>> r0 = r5.d     // Catch:{ all -> 0x00a7 }
            r0.add(r6)     // Catch:{ all -> 0x00a7 }
            monitor-exit(r5)
            return r2
        L_0x004a:
            java.util.Queue<i.c.d.k.p<?>> r0 = r5.d     // Catch:{ all -> 0x00a7 }
            r0.add(r6)     // Catch:{ all -> 0x00a7 }
            int r6 = r5.a     // Catch:{ all -> 0x00a7 }
            if (r6 != 0) goto L_0x0055
            r6 = 1
            goto L_0x0056
        L_0x0055:
            r6 = 0
        L_0x0056:
            i.c.a.b.d.l.q.b((boolean) r6)     // Catch:{ all -> 0x00a7 }
            java.lang.String r6 = "MessengerIpcClient"
            boolean r6 = android.util.Log.isLoggable(r6, r1)     // Catch:{ all -> 0x00a7 }
            if (r6 == 0) goto L_0x0068
            java.lang.String r6 = "MessengerIpcClient"
            java.lang.String r0 = "Starting bind to GmsCore"
            android.util.Log.v(r6, r0)     // Catch:{ all -> 0x00a7 }
        L_0x0068:
            r5.a = r2     // Catch:{ all -> 0x00a7 }
            android.content.Intent r6 = new android.content.Intent     // Catch:{ all -> 0x00a7 }
            java.lang.String r0 = "com.google.android.c2dm.intent.REGISTER"
            r6.<init>(r0)     // Catch:{ all -> 0x00a7 }
            java.lang.String r0 = "com.google.android.gms"
            r6.setPackage(r0)     // Catch:{ all -> 0x00a7 }
            i.c.a.b.d.n.a r0 = i.c.a.b.d.n.a.a()     // Catch:{ all -> 0x00a7 }
            i.c.d.k.g r1 = r5.f4701f     // Catch:{ all -> 0x00a7 }
            android.content.Context r1 = r1.a     // Catch:{ all -> 0x00a7 }
            if (r0 == 0) goto L_0x00a5
            java.lang.Class r4 = r1.getClass()     // Catch:{ all -> 0x00a7 }
            r4.getName()     // Catch:{ all -> 0x00a7 }
            boolean r6 = r0.b(r1, r6, r5, r2)     // Catch:{ all -> 0x00a7 }
            if (r6 != 0) goto L_0x0093
            java.lang.String r6 = "Unable to bind to service"
            r5.a(r3, r6)     // Catch:{ all -> 0x00a7 }
            goto L_0x00a3
        L_0x0093:
            i.c.d.k.g r6 = r5.f4701f     // Catch:{ all -> 0x00a7 }
            java.util.concurrent.ScheduledExecutorService r6 = r6.f4693b     // Catch:{ all -> 0x00a7 }
            i.c.d.k.k r0 = new i.c.d.k.k     // Catch:{ all -> 0x00a7 }
            r0.<init>(r5)     // Catch:{ all -> 0x00a7 }
            r3 = 30
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x00a7 }
            r6.schedule(r0, r3, r1)     // Catch:{ all -> 0x00a7 }
        L_0x00a3:
            monitor-exit(r5)
            return r2
        L_0x00a5:
            r6 = 0
            throw r6     // Catch:{ all -> 0x00a7 }
        L_0x00a7:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.d.k.i.a(i.c.d.k.p):boolean");
    }

    public final synchronized void b() {
        if (this.a == 1) {
            a(1, "Timed out while binding");
        }
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        this.f4701f.f4693b.execute(new j(this, iBinder));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        this.f4701f.f4693b.execute(new l(this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0052, code lost:
        r5 = r5.getData();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005d, code lost:
        if (r5.getBoolean("unsupported", false) == false) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005f, code lost:
        r1.a(new com.google.firebase.iid.zzap(4, "Not supported by GmsCore"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006b, code lost:
        r1.a(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006e, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(android.os.Message r5) {
        /*
            r4 = this;
            int r0 = r5.arg1
            java.lang.String r1 = "MessengerIpcClient"
            r2 = 3
            boolean r1 = android.util.Log.isLoggable(r1, r2)
            if (r1 == 0) goto L_0x0023
            r1 = 41
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r1 = "Received response to request: "
            r2.append(r1)
            r2.append(r0)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "MessengerIpcClient"
            android.util.Log.d(r2, r1)
        L_0x0023:
            monitor-enter(r4)
            android.util.SparseArray<i.c.d.k.p<?>> r1 = r4.e     // Catch:{ all -> 0x006f }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x006f }
            i.c.d.k.p r1 = (i.c.d.k.p) r1     // Catch:{ all -> 0x006f }
            r2 = 1
            if (r1 != 0) goto L_0x0049
            java.lang.String r5 = "MessengerIpcClient"
            r1 = 50
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x006f }
            r3.<init>(r1)     // Catch:{ all -> 0x006f }
            java.lang.String r1 = "Received response for unknown request: "
            r3.append(r1)     // Catch:{ all -> 0x006f }
            r3.append(r0)     // Catch:{ all -> 0x006f }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x006f }
            android.util.Log.w(r5, r0)     // Catch:{ all -> 0x006f }
            monitor-exit(r4)     // Catch:{ all -> 0x006f }
            return r2
        L_0x0049:
            android.util.SparseArray<i.c.d.k.p<?>> r3 = r4.e     // Catch:{ all -> 0x006f }
            r3.remove(r0)     // Catch:{ all -> 0x006f }
            r4.a()     // Catch:{ all -> 0x006f }
            monitor-exit(r4)     // Catch:{ all -> 0x006f }
            android.os.Bundle r5 = r5.getData()
            r0 = 0
            java.lang.String r3 = "unsupported"
            boolean r0 = r5.getBoolean(r3, r0)
            if (r0 == 0) goto L_0x006b
            com.google.firebase.iid.zzap r5 = new com.google.firebase.iid.zzap
            r0 = 4
            java.lang.String r3 = "Not supported by GmsCore"
            r5.<init>(r0, r3)
            r1.a((com.google.firebase.iid.zzap) r5)
            goto L_0x006e
        L_0x006b:
            r1.a((android.os.Bundle) r5)
        L_0x006e:
            return r2
        L_0x006f:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x006f }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.d.k.i.a(android.os.Message):boolean");
    }

    public final synchronized void a(int i2, String str) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(str);
            Log.d("MessengerIpcClient", valueOf.length() != 0 ? "Disconnected: ".concat(valueOf) : new String("Disconnected: "));
        }
        int i3 = this.a;
        if (i3 == 0) {
            throw new IllegalStateException();
        } else if (i3 == 1 || i3 == 2) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.a = 4;
            a a2 = a.a();
            Context context = this.f4701f.a;
            if (a2 != null) {
                context.unbindService(this);
                zzap zzap = new zzap(i2, str);
                for (p a3 : this.d) {
                    a3.a(zzap);
                }
                this.d.clear();
                for (int i4 = 0; i4 < this.e.size(); i4++) {
                    this.e.valueAt(i4).a(zzap);
                }
                this.e.clear();
                return;
            }
            throw null;
        } else if (i3 == 3) {
            this.a = 4;
        } else if (i3 != 4) {
            int i5 = this.a;
            StringBuilder sb = new StringBuilder(26);
            sb.append("Unknown state: ");
            sb.append(i5);
            throw new IllegalStateException(sb.toString());
        }
    }

    public final synchronized void a() {
        if (this.a == 2 && this.d.isEmpty() && this.e.size() == 0) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
            }
            this.a = 3;
            a a2 = a.a();
            Context context = this.f4701f.a;
            if (a2 != null) {
                context.unbindService(this);
            } else {
                throw null;
            }
        }
    }

    public final synchronized void a(int i2) {
        p pVar = this.e.get(i2);
        if (pVar != null) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("Timing out request: ");
            sb.append(i2);
            Log.w("MessengerIpcClient", sb.toString());
            this.e.remove(i2);
            pVar.a(new zzap(3, "Timed out waiting for response"));
            a();
        }
    }
}
