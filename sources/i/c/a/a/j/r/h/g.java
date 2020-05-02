package i.c.a.a.j.r.h;

import i.c.a.a.j.h;

/* compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
public final /* synthetic */ class g implements Runnable {
    public final l e;

    /* renamed from: f  reason: collision with root package name */
    public final h f2978f;

    /* renamed from: g  reason: collision with root package name */
    public final int f2979g;

    /* renamed from: h  reason: collision with root package name */
    public final Runnable f2980h;

    public g(l lVar, h hVar, int i2, Runnable runnable) {
        this.e = lVar;
        this.f2978f = hVar;
        this.f2979g = i2;
        this.f2980h = runnable;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:12|13) */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0042, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r0.d.a(r1, r2 + 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004e, code lost:
        r3.run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0051, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0044 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r8 = this;
            i.c.a.a.j.r.h.l r0 = r8.e
            i.c.a.a.j.h r1 = r8.f2978f
            int r2 = r8.f2979g
            java.lang.Runnable r3 = r8.f2980h
            r4 = 1
            i.c.a.a.j.s.a r5 = r0.f2985f     // Catch:{ SynchronizationException -> 0x0044 }
            i.c.a.a.j.r.i.c r6 = r0.c     // Catch:{ SynchronizationException -> 0x0044 }
            r6.getClass()     // Catch:{ SynchronizationException -> 0x0044 }
            i.c.a.a.j.r.h.j r7 = new i.c.a.a.j.r.h.j     // Catch:{ SynchronizationException -> 0x0044 }
            r7.<init>(r6)     // Catch:{ SynchronizationException -> 0x0044 }
            r5.a(r7)     // Catch:{ SynchronizationException -> 0x0044 }
            android.content.Context r5 = r0.a     // Catch:{ SynchronizationException -> 0x0044 }
            java.lang.String r6 = "connectivity"
            java.lang.Object r5 = r5.getSystemService(r6)     // Catch:{ SynchronizationException -> 0x0044 }
            android.net.ConnectivityManager r5 = (android.net.ConnectivityManager) r5     // Catch:{ SynchronizationException -> 0x0044 }
            android.net.NetworkInfo r5 = r5.getActiveNetworkInfo()     // Catch:{ SynchronizationException -> 0x0044 }
            if (r5 == 0) goto L_0x0030
            boolean r5 = r5.isConnected()     // Catch:{ SynchronizationException -> 0x0044 }
            if (r5 == 0) goto L_0x0030
            r5 = 1
            goto L_0x0031
        L_0x0030:
            r5 = 0
        L_0x0031:
            if (r5 != 0) goto L_0x003e
            i.c.a.a.j.s.a r5 = r0.f2985f     // Catch:{ SynchronizationException -> 0x0044 }
            i.c.a.a.j.r.h.k r6 = new i.c.a.a.j.r.h.k     // Catch:{ SynchronizationException -> 0x0044 }
            r6.<init>(r0, r1, r2)     // Catch:{ SynchronizationException -> 0x0044 }
            r5.a(r6)     // Catch:{ SynchronizationException -> 0x0044 }
            goto L_0x004a
        L_0x003e:
            r0.a(r1, r2)     // Catch:{ SynchronizationException -> 0x0044 }
            goto L_0x004a
        L_0x0042:
            r0 = move-exception
            goto L_0x004e
        L_0x0044:
            i.c.a.a.j.r.h.r r0 = r0.d     // Catch:{ all -> 0x0042 }
            int r2 = r2 + r4
            r0.a(r1, r2)     // Catch:{ all -> 0x0042 }
        L_0x004a:
            r3.run()
            return
        L_0x004e:
            r3.run()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.a.a.j.r.h.g.run():void");
    }
}
