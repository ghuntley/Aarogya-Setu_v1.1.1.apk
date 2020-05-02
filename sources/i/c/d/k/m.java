package i.c.d.k;

/* compiled from: com.google.firebase:firebase-iid@@20.1.2 */
public final /* synthetic */ class m implements Runnable {
    public final i e;

    public m(i iVar) {
        this.e = iVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003e, code lost:
        if (android.util.Log.isLoggable("MessengerIpcClient", 3) == false) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0040, code lost:
        r3 = java.lang.String.valueOf(r1);
        r5 = new java.lang.StringBuilder(r3.length() + 8);
        r5.append("Sending ");
        r5.append(r3);
        android.util.Log.d("MessengerIpcClient", r5.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0060, code lost:
        r3 = r0.f4701f.a;
        r4 = r0.f4700b;
        r5 = android.os.Message.obtain();
        r5.what = r1.c;
        r5.arg1 = r1.a;
        r5.replyTo = r4;
        r4 = new android.os.Bundle();
        r4.putBoolean("oneWay", r1.a());
        r4.putString("pkg", r3.getPackageName());
        r4.putBundle("data", r1.d);
        r5.setData(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r1 = r0.c;
        r3 = r1.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0099, code lost:
        if (r3 == null) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x009b, code lost:
        r3.send(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00a0, code lost:
        r1 = r1.f4706b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00a2, code lost:
        if (r1 == null) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00a4, code lost:
        r1.a(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00b0, code lost:
        throw new java.lang.IllegalStateException("Both messengers are null");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00b1, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00b2, code lost:
        r0.a(2, r1.getMessage());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r8 = this;
            i.c.d.k.i r0 = r8.e
        L_0x0002:
            monitor-enter(r0)
            int r1 = r0.a     // Catch:{ all -> 0x00bb }
            r2 = 2
            if (r1 == r2) goto L_0x000a
            monitor-exit(r0)     // Catch:{ all -> 0x00bb }
            return
        L_0x000a:
            java.util.Queue<i.c.d.k.p<?>> r1 = r0.d     // Catch:{ all -> 0x00bb }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x00bb }
            if (r1 == 0) goto L_0x0017
            r0.a()     // Catch:{ all -> 0x00bb }
            monitor-exit(r0)     // Catch:{ all -> 0x00bb }
            return
        L_0x0017:
            java.util.Queue<i.c.d.k.p<?>> r1 = r0.d     // Catch:{ all -> 0x00bb }
            java.lang.Object r1 = r1.poll()     // Catch:{ all -> 0x00bb }
            i.c.d.k.p r1 = (i.c.d.k.p) r1     // Catch:{ all -> 0x00bb }
            android.util.SparseArray<i.c.d.k.p<?>> r3 = r0.e     // Catch:{ all -> 0x00bb }
            int r4 = r1.a     // Catch:{ all -> 0x00bb }
            r3.put(r4, r1)     // Catch:{ all -> 0x00bb }
            i.c.d.k.g r3 = r0.f4701f     // Catch:{ all -> 0x00bb }
            java.util.concurrent.ScheduledExecutorService r3 = r3.f4693b     // Catch:{ all -> 0x00bb }
            i.c.d.k.o r4 = new i.c.d.k.o     // Catch:{ all -> 0x00bb }
            r4.<init>(r0, r1)     // Catch:{ all -> 0x00bb }
            r5 = 30
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x00bb }
            r3.schedule(r4, r5, r7)     // Catch:{ all -> 0x00bb }
            monitor-exit(r0)     // Catch:{ all -> 0x00bb }
            r3 = 3
            java.lang.String r4 = "MessengerIpcClient"
            boolean r3 = android.util.Log.isLoggable(r4, r3)
            if (r3 == 0) goto L_0x0060
            java.lang.String r3 = java.lang.String.valueOf(r1)
            int r4 = r3.length()
            int r4 = r4 + 8
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r4)
            java.lang.String r4 = "Sending "
            r5.append(r4)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            java.lang.String r4 = "MessengerIpcClient"
            android.util.Log.d(r4, r3)
        L_0x0060:
            i.c.d.k.g r3 = r0.f4701f
            android.content.Context r3 = r3.a
            android.os.Messenger r4 = r0.f4700b
            android.os.Message r5 = android.os.Message.obtain()
            int r6 = r1.c
            r5.what = r6
            int r6 = r1.a
            r5.arg1 = r6
            r5.replyTo = r4
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            boolean r6 = r1.a()
            java.lang.String r7 = "oneWay"
            r4.putBoolean(r7, r6)
            java.lang.String r3 = r3.getPackageName()
            java.lang.String r6 = "pkg"
            r4.putString(r6, r3)
            android.os.Bundle r1 = r1.d
            java.lang.String r3 = "data"
            r4.putBundle(r3, r1)
            r5.setData(r4)
            i.c.d.k.n r1 = r0.c     // Catch:{ RemoteException -> 0x00b1 }
            android.os.Messenger r3 = r1.a     // Catch:{ RemoteException -> 0x00b1 }
            if (r3 == 0) goto L_0x00a0
            r3.send(r5)     // Catch:{ RemoteException -> 0x00b1 }
            goto L_0x0002
        L_0x00a0:
            i.c.d.k.t0 r1 = r1.f4706b     // Catch:{ RemoteException -> 0x00b1 }
            if (r1 == 0) goto L_0x00a9
            r1.a(r5)     // Catch:{ RemoteException -> 0x00b1 }
            goto L_0x0002
        L_0x00a9:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ RemoteException -> 0x00b1 }
            java.lang.String r3 = "Both messengers are null"
            r1.<init>(r3)     // Catch:{ RemoteException -> 0x00b1 }
            throw r1     // Catch:{ RemoteException -> 0x00b1 }
        L_0x00b1:
            r1 = move-exception
            java.lang.String r1 = r1.getMessage()
            r0.a(r2, r1)
            goto L_0x0002
        L_0x00bb:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00bb }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.d.k.m.run():void");
    }
}
