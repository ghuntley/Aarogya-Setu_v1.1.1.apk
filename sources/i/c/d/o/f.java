package i.c.d.o;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.firebase:firebase-messaging@@20.1.3 */
public final class f {
    public final Executor a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f4763b;
    public final p c;

    public f(Context context, p pVar, Executor executor) {
        this.a = executor;
        this.f4763b = context;
        this.c = pVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a5 A[SYNTHETIC, Splitter:B:33:0x00a5] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x010a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a() {
        /*
            r11 = this;
            i.c.d.o.p r0 = r11.c
            java.lang.String r1 = "gcm.n.noui"
            boolean r0 = r0.b(r1)
            r1 = 1
            if (r0 == 0) goto L_0x000c
            return r1
        L_0x000c:
            android.content.Context r0 = r11.f4763b
            java.lang.String r2 = "keyguard"
            java.lang.Object r0 = r0.getSystemService(r2)
            android.app.KeyguardManager r0 = (android.app.KeyguardManager) r0
            boolean r0 = r0.inKeyguardRestrictedInputMode()
            r2 = 0
            if (r0 != 0) goto L_0x004d
            int r0 = android.os.Process.myPid()
            android.content.Context r3 = r11.f4763b
            java.lang.String r4 = "activity"
            java.lang.Object r3 = r3.getSystemService(r4)
            android.app.ActivityManager r3 = (android.app.ActivityManager) r3
            java.util.List r3 = r3.getRunningAppProcesses()
            if (r3 == 0) goto L_0x004d
            java.util.Iterator r3 = r3.iterator()
        L_0x0035:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x004d
            java.lang.Object r4 = r3.next()
            android.app.ActivityManager$RunningAppProcessInfo r4 = (android.app.ActivityManager.RunningAppProcessInfo) r4
            int r5 = r4.pid
            if (r5 != r0) goto L_0x0035
            int r0 = r4.importance
            r3 = 100
            if (r0 != r3) goto L_0x004d
            r0 = 1
            goto L_0x004e
        L_0x004d:
            r0 = 0
        L_0x004e:
            if (r0 == 0) goto L_0x0051
            return r2
        L_0x0051:
            i.c.d.o.p r0 = r11.c
            java.lang.String r3 = "gcm.n.image"
            java.lang.String r0 = r0.a((java.lang.String) r3)
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            r4 = 0
            java.lang.String r5 = "FirebaseMessaging"
            if (r3 == 0) goto L_0x0064
        L_0x0062:
            r3 = r4
            goto L_0x008a
        L_0x0064:
            i.c.d.o.o r3 = new i.c.d.o.o     // Catch:{ MalformedURLException -> 0x006f }
            java.net.URL r6 = new java.net.URL     // Catch:{ MalformedURLException -> 0x006f }
            r6.<init>(r0)     // Catch:{ MalformedURLException -> 0x006f }
            r3.<init>(r6)     // Catch:{ MalformedURLException -> 0x006f }
            goto L_0x008a
        L_0x006f:
            java.lang.String r3 = "Not downloading image, bad URL: "
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r6 = r0.length()
            if (r6 == 0) goto L_0x0081
            java.lang.String r0 = r3.concat(r0)
            goto L_0x0086
        L_0x0081:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3)
        L_0x0086:
            android.util.Log.w(r5, r0)
            goto L_0x0062
        L_0x008a:
            if (r3 == 0) goto L_0x0099
            java.util.concurrent.Executor r0 = r11.a
            i.c.d.o.n r6 = new i.c.d.o.n
            r6.<init>(r3)
            i.c.a.b.l.g r0 = i.c.a.b.d.l.q.a((java.util.concurrent.Executor) r0, r6)
            r3.f4767f = r0
        L_0x0099:
            android.content.Context r0 = r11.f4763b
            i.c.d.o.p r6 = r11.c
            i.c.d.o.c r0 = i.c.d.o.d.a((android.content.Context) r0, (i.c.d.o.p) r6)
            h.h.e.i r6 = r0.a
            if (r3 == 0) goto L_0x0103
            i.c.a.b.l.g<android.graphics.Bitmap> r7 = r3.f4767f     // Catch:{ ExecutionException -> 0x00c6, InterruptedException -> 0x00d1, TimeoutException -> 0x00c8 }
            i.c.a.b.d.l.q.a(r7)     // Catch:{ ExecutionException -> 0x00c6, InterruptedException -> 0x00d1, TimeoutException -> 0x00c8 }
            r8 = 5
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ ExecutionException -> 0x00c6, InterruptedException -> 0x00d1, TimeoutException -> 0x00c8 }
            java.lang.Object r7 = i.c.a.b.d.l.q.a(r7, (long) r8, (java.util.concurrent.TimeUnit) r10)     // Catch:{ ExecutionException -> 0x00c6, InterruptedException -> 0x00d1, TimeoutException -> 0x00c8 }
            android.graphics.Bitmap r7 = (android.graphics.Bitmap) r7     // Catch:{ ExecutionException -> 0x00c6, InterruptedException -> 0x00d1, TimeoutException -> 0x00c8 }
            r6.a((android.graphics.Bitmap) r7)     // Catch:{ ExecutionException -> 0x00c6, InterruptedException -> 0x00d1, TimeoutException -> 0x00c8 }
            h.h.e.g r8 = new h.h.e.g     // Catch:{ ExecutionException -> 0x00c6, InterruptedException -> 0x00d1, TimeoutException -> 0x00c8 }
            r8.<init>()     // Catch:{ ExecutionException -> 0x00c6, InterruptedException -> 0x00d1, TimeoutException -> 0x00c8 }
            r8.d = r7     // Catch:{ ExecutionException -> 0x00c6, InterruptedException -> 0x00d1, TimeoutException -> 0x00c8 }
            r8.e = r4     // Catch:{ ExecutionException -> 0x00c6, InterruptedException -> 0x00d1, TimeoutException -> 0x00c8 }
            r8.f1721f = r1     // Catch:{ ExecutionException -> 0x00c6, InterruptedException -> 0x00d1, TimeoutException -> 0x00c8 }
            r6.a((h.h.e.j) r8)     // Catch:{ ExecutionException -> 0x00c6, InterruptedException -> 0x00d1, TimeoutException -> 0x00c8 }
            goto L_0x0103
        L_0x00c6:
            r3 = move-exception
            goto L_0x00e1
        L_0x00c8:
            java.lang.String r4 = "Failed to download image in time, showing notification without it"
            android.util.Log.w(r5, r4)
            r3.close()
            goto L_0x0103
        L_0x00d1:
            java.lang.String r4 = "Interrupted while downloading image, showing notification without it"
            android.util.Log.w(r5, r4)
            r3.close()
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            r3.interrupt()
            goto L_0x0103
        L_0x00e1:
            java.lang.Throwable r3 = r3.getCause()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            int r4 = r3.length()
            int r4 = r4 + 26
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r4)
            java.lang.String r4 = "Failed to download image: "
            r6.append(r4)
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            android.util.Log.w(r5, r3)
        L_0x0103:
            r3 = 3
            boolean r3 = android.util.Log.isLoggable(r5, r3)
            if (r3 == 0) goto L_0x010f
            java.lang.String r3 = "Showing notification"
            android.util.Log.d(r5, r3)
        L_0x010f:
            android.content.Context r3 = r11.f4763b
            java.lang.String r4 = "notification"
            java.lang.Object r3 = r3.getSystemService(r4)
            android.app.NotificationManager r3 = (android.app.NotificationManager) r3
            java.lang.String r4 = r0.f4758b
            h.h.e.i r0 = r0.a
            android.app.Notification r0 = r0.a()
            r3.notify(r4, r2, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.d.o.f.a():boolean");
    }
}
