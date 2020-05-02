package i.c.d.k;

import android.os.IBinder;

/* compiled from: com.google.firebase:firebase-iid@@20.1.2 */
public final /* synthetic */ class j implements Runnable {
    public final i e;

    /* renamed from: f  reason: collision with root package name */
    public final IBinder f4702f;

    public j(i iVar, IBinder iBinder) {
        this.e = iVar;
        this.f4702f = iBinder;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0027, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0029, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002a, code lost:
        r0.a(0, r1.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0032, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0034, code lost:
        throw r1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:5:0x000a, B:9:0x000f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r4 = this;
            i.c.d.k.i r0 = r4.e
            android.os.IBinder r1 = r4.f4702f
            monitor-enter(r0)
            r2 = 0
            if (r1 != 0) goto L_0x000f
            java.lang.String r1 = "Null service connection"
            r0.a(r2, r1)     // Catch:{ all -> 0x0027 }
            monitor-exit(r0)     // Catch:{ all -> 0x0027 }
            return
        L_0x000f:
            i.c.d.k.n r3 = new i.c.d.k.n     // Catch:{ RemoteException -> 0x0029 }
            r3.<init>(r1)     // Catch:{ RemoteException -> 0x0029 }
            r0.c = r3     // Catch:{ RemoteException -> 0x0029 }
            r1 = 2
            r0.a = r1     // Catch:{ all -> 0x0027 }
            i.c.d.k.g r1 = r0.f4701f     // Catch:{ all -> 0x0027 }
            java.util.concurrent.ScheduledExecutorService r1 = r1.f4693b     // Catch:{ all -> 0x0027 }
            i.c.d.k.m r2 = new i.c.d.k.m     // Catch:{ all -> 0x0027 }
            r2.<init>(r0)     // Catch:{ all -> 0x0027 }
            r1.execute(r2)     // Catch:{ all -> 0x0027 }
            monitor-exit(r0)     // Catch:{ all -> 0x0027 }
            return
        L_0x0027:
            r1 = move-exception
            goto L_0x0033
        L_0x0029:
            r1 = move-exception
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x0027 }
            r0.a(r2, r1)     // Catch:{ all -> 0x0027 }
            monitor-exit(r0)     // Catch:{ all -> 0x0027 }
            return
        L_0x0033:
            monitor-exit(r0)     // Catch:{ all -> 0x0027 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.d.k.j.run():void");
    }
}
