package i.c.d.k;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import i.c.a.b.d.o.h.a;
import i.c.a.b.l.d0;
import i.c.a.b.l.g;
import i.c.a.b.l.s;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.firebase:firebase-iid@@20.1.2 */
public final class k0 implements ServiceConnection {
    public final Context a;

    /* renamed from: b  reason: collision with root package name */
    public final Intent f4704b;
    public final ScheduledExecutorService c;
    public final Queue<j0> d = new ArrayDeque();
    public g0 e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f4705f = false;

    public k0(Context context, String str) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(0, new a("Firebase-FirebaseInstanceIdServiceConnection"));
        this.a = context.getApplicationContext();
        this.f4704b = new Intent(str).setPackage(this.a.getPackageName());
        this.c = scheduledThreadPoolExecutor;
    }

    public final synchronized g<Void> a(Intent intent) {
        j0 j0Var;
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "new intent queued in the bind-strategy delivery");
        }
        j0Var = new j0(intent);
        ScheduledExecutorService scheduledExecutorService = this.c;
        ScheduledFuture<?> schedule = scheduledExecutorService.schedule(new m0(j0Var), 9000, TimeUnit.MILLISECONDS);
        d0<TResult> d0Var = j0Var.f4703b.a;
        d0Var.f4000b.a(new s(scheduledExecutorService, new l0(schedule)));
        d0Var.f();
        this.d.add(j0Var);
        a();
        return j0Var.f4703b.a;
    }

    public final void b() {
        while (!this.d.isEmpty()) {
            this.d.poll().a();
        }
    }

    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String valueOf = String.valueOf(componentName);
            StringBuilder sb = new StringBuilder(valueOf.length() + 20);
            sb.append("onServiceConnected: ");
            sb.append(valueOf);
            Log.d("FirebaseInstanceId", sb.toString());
        }
        this.f4705f = false;
        if (!(iBinder instanceof g0)) {
            String valueOf2 = String.valueOf(iBinder);
            StringBuilder sb2 = new StringBuilder(valueOf2.length() + 28);
            sb2.append("Invalid service connection: ");
            sb2.append(valueOf2);
            Log.e("FirebaseInstanceId", sb2.toString());
            b();
            return;
        }
        this.e = (g0) iBinder;
        a();
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String valueOf = String.valueOf(componentName);
            StringBuilder sb = new StringBuilder(valueOf.length() + 23);
            sb.append("onServiceDisconnected: ");
            sb.append(valueOf);
            Log.d("FirebaseInstanceId", sb.toString());
        }
        a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a8, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a() {
        /*
            r6 = this;
            monitor-enter(r6)
            java.lang.String r0 = "FirebaseInstanceId"
            r1 = 3
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00ab }
            if (r0 == 0) goto L_0x0011
            java.lang.String r0 = "FirebaseInstanceId"
            java.lang.String r2 = "flush queue called"
            android.util.Log.d(r0, r2)     // Catch:{ all -> 0x00ab }
        L_0x0011:
            java.util.Queue<i.c.d.k.j0> r0 = r6.d     // Catch:{ all -> 0x00ab }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x00ab }
            if (r0 != 0) goto L_0x00a9
            java.lang.String r0 = "FirebaseInstanceId"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00ab }
            if (r0 == 0) goto L_0x0028
            java.lang.String r0 = "FirebaseInstanceId"
            java.lang.String r2 = "found intent to be delivered"
            android.util.Log.d(r0, r2)     // Catch:{ all -> 0x00ab }
        L_0x0028:
            i.c.d.k.g0 r0 = r6.e     // Catch:{ all -> 0x00ab }
            if (r0 == 0) goto L_0x0051
            i.c.d.k.g0 r0 = r6.e     // Catch:{ all -> 0x00ab }
            boolean r0 = r0.isBinderAlive()     // Catch:{ all -> 0x00ab }
            if (r0 == 0) goto L_0x0051
            java.lang.String r0 = "FirebaseInstanceId"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00ab }
            if (r0 == 0) goto L_0x0043
            java.lang.String r0 = "FirebaseInstanceId"
            java.lang.String r2 = "binder is alive, sending the intent."
            android.util.Log.d(r0, r2)     // Catch:{ all -> 0x00ab }
        L_0x0043:
            java.util.Queue<i.c.d.k.j0> r0 = r6.d     // Catch:{ all -> 0x00ab }
            java.lang.Object r0 = r0.poll()     // Catch:{ all -> 0x00ab }
            i.c.d.k.j0 r0 = (i.c.d.k.j0) r0     // Catch:{ all -> 0x00ab }
            i.c.d.k.g0 r2 = r6.e     // Catch:{ all -> 0x00ab }
            r2.a(r0)     // Catch:{ all -> 0x00ab }
            goto L_0x0011
        L_0x0051:
            java.lang.String r0 = "FirebaseInstanceId"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00ab }
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x007a
            java.lang.String r0 = "FirebaseInstanceId"
            boolean r3 = r6.f4705f     // Catch:{ all -> 0x00ab }
            if (r3 != 0) goto L_0x0063
            r3 = 1
            goto L_0x0064
        L_0x0063:
            r3 = 0
        L_0x0064:
            r4 = 39
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ab }
            r5.<init>(r4)     // Catch:{ all -> 0x00ab }
            java.lang.String r4 = "binder is dead. start connection? "
            r5.append(r4)     // Catch:{ all -> 0x00ab }
            r5.append(r3)     // Catch:{ all -> 0x00ab }
            java.lang.String r3 = r5.toString()     // Catch:{ all -> 0x00ab }
            android.util.Log.d(r0, r3)     // Catch:{ all -> 0x00ab }
        L_0x007a:
            boolean r0 = r6.f4705f     // Catch:{ all -> 0x00ab }
            if (r0 != 0) goto L_0x00a7
            r6.f4705f = r2     // Catch:{ all -> 0x00ab }
            i.c.a.b.d.n.a r0 = i.c.a.b.d.n.a.a()     // Catch:{ SecurityException -> 0x009a }
            android.content.Context r2 = r6.a     // Catch:{ SecurityException -> 0x009a }
            android.content.Intent r3 = r6.f4704b     // Catch:{ SecurityException -> 0x009a }
            r4 = 65
            boolean r0 = r0.a(r2, r3, r6, r4)     // Catch:{ SecurityException -> 0x009a }
            if (r0 == 0) goto L_0x0092
            monitor-exit(r6)
            return
        L_0x0092:
            java.lang.String r0 = "FirebaseInstanceId"
            java.lang.String r2 = "binding to the service failed"
            android.util.Log.e(r0, r2)     // Catch:{ SecurityException -> 0x009a }
            goto L_0x00a2
        L_0x009a:
            r0 = move-exception
            java.lang.String r2 = "FirebaseInstanceId"
            java.lang.String r3 = "Exception while binding the service"
            android.util.Log.e(r2, r3, r0)     // Catch:{ all -> 0x00ab }
        L_0x00a2:
            r6.f4705f = r1     // Catch:{ all -> 0x00ab }
            r6.b()     // Catch:{ all -> 0x00ab }
        L_0x00a7:
            monitor-exit(r6)
            return
        L_0x00a9:
            monitor-exit(r6)
            return
        L_0x00ab:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.d.k.k0.a():void");
    }
}
