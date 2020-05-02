package i.c.a.b.k;

import android.content.Context;
import android.os.PowerManager;
import android.os.WorkSource;
import android.util.Log;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
public class a {

    /* renamed from: l  reason: collision with root package name */
    public static ScheduledExecutorService f3991l;
    public final Object a;

    /* renamed from: b  reason: collision with root package name */
    public final PowerManager.WakeLock f3992b;
    public WorkSource c;
    public final int d;
    public final String e;

    /* renamed from: f  reason: collision with root package name */
    public final String f3993f;

    /* renamed from: g  reason: collision with root package name */
    public final Context f3994g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f3995h;

    /* renamed from: i  reason: collision with root package name */
    public final Map<String, Integer[]> f3996i;

    /* renamed from: j  reason: collision with root package name */
    public int f3997j;

    /* renamed from: k  reason: collision with root package name */
    public AtomicInteger f3998k;

    /* JADX WARNING: Removed duplicated region for block: B:54:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0117  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a(android.content.Context r8, int r9, java.lang.String r10) {
        /*
            r7 = this;
            r0 = 0
            if (r8 != 0) goto L_0x0005
            r1 = r0
            goto L_0x0009
        L_0x0005:
            java.lang.String r1 = r8.getPackageName()
        L_0x0009:
            r7.<init>()
            r7.a = r7
            r2 = 1
            r7.f3995h = r2
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            r7.f3996i = r3
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.util.Collections.synchronizedSet(r3)
            java.util.concurrent.atomic.AtomicInteger r3 = new java.util.concurrent.atomic.AtomicInteger
            r4 = 0
            r3.<init>(r4)
            r7.f3998k = r3
            java.lang.String r3 = "WakeLock: context must not be null"
            i.c.a.b.d.l.q.a(r8, (java.lang.Object) r3)
            java.lang.String r3 = "WakeLock: wakeLockName must not be empty"
            i.c.a.b.d.l.q.a((java.lang.String) r10, (java.lang.Object) r3)
            r7.d = r9
            r7.f3993f = r0
            android.content.Context r3 = r8.getApplicationContext()
            r7.f3994g = r3
            java.lang.String r3 = r8.getPackageName()
            java.lang.String r5 = "com.google.android.gms"
            boolean r3 = r5.equals(r3)
            if (r3 != 0) goto L_0x0062
            java.lang.String r3 = "*gcore*:"
            java.lang.String r5 = java.lang.String.valueOf(r10)
            int r6 = r5.length()
            if (r6 == 0) goto L_0x0059
            java.lang.String r3 = r3.concat(r5)
            goto L_0x005f
        L_0x0059:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r3)
            r3 = r5
        L_0x005f:
            r7.e = r3
            goto L_0x0064
        L_0x0062:
            r7.e = r10
        L_0x0064:
            java.lang.String r3 = "power"
            java.lang.Object r3 = r8.getSystemService(r3)
            android.os.PowerManager r3 = (android.os.PowerManager) r3
            android.os.PowerManager$WakeLock r9 = r3.newWakeLock(r9, r10)
            r7.f3992b = r9
            boolean r9 = i.c.a.b.d.o.g.a((android.content.Context) r8)
            if (r9 == 0) goto L_0x012d
            boolean r9 = i.c.a.b.d.o.f.a(r1)
            if (r9 == 0) goto L_0x0082
            java.lang.String r1 = r8.getPackageName()
        L_0x0082:
            java.lang.String r9 = "WorkSourceUtil"
            android.content.pm.PackageManager r10 = r8.getPackageManager()
            if (r10 == 0) goto L_0x0102
            if (r1 != 0) goto L_0x008e
            goto L_0x0102
        L_0x008e:
            i.c.a.b.d.p.b r8 = i.c.a.b.d.p.c.b(r8)     // Catch:{ NameNotFoundException -> 0x00eb }
            android.content.Context r8 = r8.a     // Catch:{ NameNotFoundException -> 0x00eb }
            android.content.pm.PackageManager r8 = r8.getPackageManager()     // Catch:{ NameNotFoundException -> 0x00eb }
            android.content.pm.ApplicationInfo r8 = r8.getApplicationInfo(r1, r4)     // Catch:{ NameNotFoundException -> 0x00eb }
            if (r8 != 0) goto L_0x00b5
            java.lang.String r8 = "Could not get applicationInfo from package: "
            int r10 = r1.length()
            if (r10 == 0) goto L_0x00ab
            java.lang.String r8 = r8.concat(r1)
            goto L_0x00b1
        L_0x00ab:
            java.lang.String r10 = new java.lang.String
            r10.<init>(r8)
            r8 = r10
        L_0x00b1:
            android.util.Log.e(r9, r8)
            goto L_0x0102
        L_0x00b5:
            int r8 = r8.uid
            android.os.WorkSource r10 = new android.os.WorkSource
            r10.<init>()
            java.lang.reflect.Method r3 = i.c.a.b.d.o.g.f3161b
            java.lang.String r5 = "Unable to assign blame through WorkSource"
            if (r3 == 0) goto L_0x00d6
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x00d1 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x00d1 }
            r6[r4] = r8     // Catch:{ Exception -> 0x00d1 }
            r6[r2] = r1     // Catch:{ Exception -> 0x00d1 }
            r3.invoke(r10, r6)     // Catch:{ Exception -> 0x00d1 }
            goto L_0x0103
        L_0x00d1:
            r8 = move-exception
            android.util.Log.wtf(r9, r5, r8)
            goto L_0x0103
        L_0x00d6:
            java.lang.reflect.Method r1 = i.c.a.b.d.o.g.a
            if (r1 == 0) goto L_0x0103
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x00e6 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x00e6 }
            r3[r4] = r8     // Catch:{ Exception -> 0x00e6 }
            r1.invoke(r10, r3)     // Catch:{ Exception -> 0x00e6 }
            goto L_0x0103
        L_0x00e6:
            r8 = move-exception
            android.util.Log.wtf(r9, r5, r8)
            goto L_0x0103
        L_0x00eb:
            java.lang.String r8 = "Could not find package: "
            int r10 = r1.length()
            if (r10 == 0) goto L_0x00f9
            java.lang.String r8 = r8.concat(r1)
            goto L_0x00ff
        L_0x00f9:
            java.lang.String r10 = new java.lang.String
            r10.<init>(r8)
            r8 = r10
        L_0x00ff:
            android.util.Log.e(r9, r8)
        L_0x0102:
            r10 = r0
        L_0x0103:
            r7.c = r10
            if (r10 == 0) goto L_0x012d
            android.content.Context r8 = r7.f3994g
            boolean r8 = i.c.a.b.d.o.g.a((android.content.Context) r8)
            if (r8 == 0) goto L_0x012d
            android.os.WorkSource r8 = r7.c
            if (r8 == 0) goto L_0x0117
            r8.add(r10)
            goto L_0x0119
        L_0x0117:
            r7.c = r10
        L_0x0119:
            android.os.WorkSource r8 = r7.c
            android.os.PowerManager$WakeLock r9 = r7.f3992b     // Catch:{ IllegalArgumentException -> 0x0123, ArrayIndexOutOfBoundsException -> 0x0121 }
            r9.setWorkSource(r8)     // Catch:{ IllegalArgumentException -> 0x0123, ArrayIndexOutOfBoundsException -> 0x0121 }
            goto L_0x012d
        L_0x0121:
            r8 = move-exception
            goto L_0x0124
        L_0x0123:
            r8 = move-exception
        L_0x0124:
            java.lang.String r8 = r8.toString()
            java.lang.String r9 = "WakeLock"
            android.util.Log.wtf(r9, r8)
        L_0x012d:
            java.util.concurrent.ScheduledExecutorService r8 = f3991l
            if (r8 != 0) goto L_0x0147
            i.c.a.b.d.m.a r8 = i.c.a.b.d.l.q.a()
            i.c.a.b.d.m.b r8 = (i.c.a.b.d.m.b) r8
            if (r8 == 0) goto L_0x0146
            i.c.a.b.g.d.e r8 = i.c.a.b.g.d.d.a
            java.util.concurrent.ScheduledExecutorService r8 = java.util.concurrent.Executors.newScheduledThreadPool(r2)
            java.util.concurrent.ScheduledExecutorService r8 = java.util.concurrent.Executors.unconfigurableScheduledExecutorService(r8)
            f3991l = r8
            goto L_0x0147
        L_0x0146:
            throw r0
        L_0x0147:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.a.b.k.a.<init>(android.content.Context, int, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0063, code lost:
        if (r2 == false) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006b, code lost:
        if (r1.f3997j == 0) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006d, code lost:
        i.c.a.b.d.n.c.a.a(r1.f3994g, i.c.a.b.d.l.q.a(r1.f3992b, r7), 7, r1.e, r7, (java.lang.String) null, r1.d, i.c.a.b.d.o.g.a(r1.c), r17);
        r1.f3997j++;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(long r17) {
        /*
            r16 = this;
            r1 = r16
            r13 = r17
            java.util.concurrent.atomic.AtomicInteger r0 = r1.f3998k
            r0.incrementAndGet()
            boolean r0 = r1.f3995h
            r2 = 0
            if (r0 == 0) goto L_0x0016
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x0016
            r7 = r2
            goto L_0x0019
        L_0x0016:
            java.lang.String r0 = r1.f3993f
            r7 = r0
        L_0x0019:
            java.lang.Object r15 = r1.a
            monitor-enter(r15)
            java.util.Map<java.lang.String, java.lang.Integer[]> r0 = r1.f3996i     // Catch:{ all -> 0x00a7 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x00a7 }
            r2 = 0
            if (r0 == 0) goto L_0x0029
            int r0 = r1.f3997j     // Catch:{ all -> 0x00a7 }
            if (r0 <= 0) goto L_0x0038
        L_0x0029:
            android.os.PowerManager$WakeLock r0 = r1.f3992b     // Catch:{ all -> 0x00a7 }
            boolean r0 = r0.isHeld()     // Catch:{ all -> 0x00a7 }
            if (r0 != 0) goto L_0x0038
            java.util.Map<java.lang.String, java.lang.Integer[]> r0 = r1.f3996i     // Catch:{ all -> 0x00a7 }
            r0.clear()     // Catch:{ all -> 0x00a7 }
            r1.f3997j = r2     // Catch:{ all -> 0x00a7 }
        L_0x0038:
            boolean r0 = r1.f3995h     // Catch:{ all -> 0x00a7 }
            r11 = 1
            if (r0 == 0) goto L_0x0065
            java.util.Map<java.lang.String, java.lang.Integer[]> r0 = r1.f3996i     // Catch:{ all -> 0x00a7 }
            java.lang.Object r0 = r0.get(r7)     // Catch:{ all -> 0x00a7 }
            java.lang.Integer[] r0 = (java.lang.Integer[]) r0     // Catch:{ all -> 0x00a7 }
            if (r0 != 0) goto L_0x0056
            java.util.Map<java.lang.String, java.lang.Integer[]> r0 = r1.f3996i     // Catch:{ all -> 0x00a7 }
            java.lang.Integer[] r3 = new java.lang.Integer[r11]     // Catch:{ all -> 0x00a7 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x00a7 }
            r3[r2] = r4     // Catch:{ all -> 0x00a7 }
            r0.put(r7, r3)     // Catch:{ all -> 0x00a7 }
            r2 = 1
            goto L_0x0063
        L_0x0056:
            r3 = r0[r2]     // Catch:{ all -> 0x00a7 }
            int r3 = r3.intValue()     // Catch:{ all -> 0x00a7 }
            int r3 = r3 + r11
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x00a7 }
            r0[r2] = r3     // Catch:{ all -> 0x00a7 }
        L_0x0063:
            if (r2 != 0) goto L_0x006d
        L_0x0065:
            boolean r0 = r1.f3995h     // Catch:{ all -> 0x00a7 }
            if (r0 != 0) goto L_0x008e
            int r0 = r1.f3997j     // Catch:{ all -> 0x00a7 }
            if (r0 != 0) goto L_0x008e
        L_0x006d:
            i.c.a.b.d.n.c r2 = i.c.a.b.d.n.c.a     // Catch:{ all -> 0x00a7 }
            android.content.Context r3 = r1.f3994g     // Catch:{ all -> 0x00a7 }
            android.os.PowerManager$WakeLock r0 = r1.f3992b     // Catch:{ all -> 0x00a7 }
            java.lang.String r4 = i.c.a.b.d.l.q.a((android.os.PowerManager.WakeLock) r0, (java.lang.String) r7)     // Catch:{ all -> 0x00a7 }
            r5 = 7
            java.lang.String r6 = r1.e     // Catch:{ all -> 0x00a7 }
            r8 = 0
            int r9 = r1.d     // Catch:{ all -> 0x00a7 }
            android.os.WorkSource r0 = r1.c     // Catch:{ all -> 0x00a7 }
            java.util.List r10 = i.c.a.b.d.o.g.a((android.os.WorkSource) r0)     // Catch:{ all -> 0x00a7 }
            r0 = 1
            r11 = r17
            r2.a(r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x00a7 }
            int r2 = r1.f3997j     // Catch:{ all -> 0x00a7 }
            int r2 = r2 + r0
            r1.f3997j = r2     // Catch:{ all -> 0x00a7 }
        L_0x008e:
            monitor-exit(r15)     // Catch:{ all -> 0x00a7 }
            android.os.PowerManager$WakeLock r0 = r1.f3992b
            r0.acquire()
            r2 = 0
            int r0 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x00a6
            java.util.concurrent.ScheduledExecutorService r0 = f3991l
            i.c.a.b.k.b r2 = new i.c.a.b.k.b
            r2.<init>(r1)
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.schedule(r2, r13, r3)
        L_0x00a6:
            return
        L_0x00a7:
            r0 = move-exception
            monitor-exit(r15)     // Catch:{ all -> 0x00a7 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.a.b.k.a.a(long):void");
    }

    public final void b() {
        if (this.f3992b.isHeld()) {
            try {
                this.f3992b.release();
            } catch (RuntimeException e2) {
                if (e2.getClass().equals(RuntimeException.class)) {
                    Log.e("WakeLock", String.valueOf(this.e).concat(" was already released!"), e2);
                } else {
                    throw e2;
                }
            }
            this.f3992b.isHeld();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0058, code lost:
        if (r2 == false) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0060, code lost:
        if (r13.f3997j == 1) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0062, code lost:
        i.c.a.b.d.n.c.a.a(r13.f3994g, i.c.a.b.d.l.q.a(r13.f3992b, r6), 8, r13.e, r6, (java.lang.String) null, r13.d, i.c.a.b.d.o.g.a(r13.c), 0);
        r13.f3997j--;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a() {
        /*
            r13 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r13.f3998k
            int r0 = r0.decrementAndGet()
            if (r0 >= 0) goto L_0x0019
            java.lang.String r0 = r13.e
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = " release without a matched acquire!"
            java.lang.String r0 = r0.concat(r1)
            java.lang.String r1 = "WakeLock"
            android.util.Log.e(r1, r0)
        L_0x0019:
            r0 = 0
            boolean r1 = r13.f3995h
            if (r1 == 0) goto L_0x0025
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            java.lang.String r0 = r13.f3993f
        L_0x0027:
            r6 = r0
            java.lang.Object r0 = r13.a
            monitor-enter(r0)
            boolean r1 = r13.f3995h     // Catch:{ all -> 0x0088 }
            r12 = 1
            if (r1 == 0) goto L_0x005a
            java.util.Map<java.lang.String, java.lang.Integer[]> r1 = r13.f3996i     // Catch:{ all -> 0x0088 }
            java.lang.Object r1 = r1.get(r6)     // Catch:{ all -> 0x0088 }
            java.lang.Integer[] r1 = (java.lang.Integer[]) r1     // Catch:{ all -> 0x0088 }
            r2 = 0
            if (r1 != 0) goto L_0x003c
            goto L_0x0058
        L_0x003c:
            r3 = r1[r2]     // Catch:{ all -> 0x0088 }
            int r3 = r3.intValue()     // Catch:{ all -> 0x0088 }
            if (r3 != r12) goto L_0x004b
            java.util.Map<java.lang.String, java.lang.Integer[]> r1 = r13.f3996i     // Catch:{ all -> 0x0088 }
            r1.remove(r6)     // Catch:{ all -> 0x0088 }
            r2 = 1
            goto L_0x0058
        L_0x004b:
            r3 = r1[r2]     // Catch:{ all -> 0x0088 }
            int r3 = r3.intValue()     // Catch:{ all -> 0x0088 }
            int r3 = r3 - r12
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0088 }
            r1[r2] = r3     // Catch:{ all -> 0x0088 }
        L_0x0058:
            if (r2 != 0) goto L_0x0062
        L_0x005a:
            boolean r1 = r13.f3995h     // Catch:{ all -> 0x0088 }
            if (r1 != 0) goto L_0x0083
            int r1 = r13.f3997j     // Catch:{ all -> 0x0088 }
            if (r1 != r12) goto L_0x0083
        L_0x0062:
            i.c.a.b.d.n.c r1 = i.c.a.b.d.n.c.a     // Catch:{ all -> 0x0088 }
            android.content.Context r2 = r13.f3994g     // Catch:{ all -> 0x0088 }
            android.os.PowerManager$WakeLock r3 = r13.f3992b     // Catch:{ all -> 0x0088 }
            java.lang.String r3 = i.c.a.b.d.l.q.a((android.os.PowerManager.WakeLock) r3, (java.lang.String) r6)     // Catch:{ all -> 0x0088 }
            r4 = 8
            java.lang.String r5 = r13.e     // Catch:{ all -> 0x0088 }
            r7 = 0
            int r8 = r13.d     // Catch:{ all -> 0x0088 }
            android.os.WorkSource r9 = r13.c     // Catch:{ all -> 0x0088 }
            java.util.List r9 = i.c.a.b.d.o.g.a((android.os.WorkSource) r9)     // Catch:{ all -> 0x0088 }
            r10 = 0
            r1.a(r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0088 }
            int r1 = r13.f3997j     // Catch:{ all -> 0x0088 }
            int r1 = r1 - r12
            r13.f3997j = r1     // Catch:{ all -> 0x0088 }
        L_0x0083:
            monitor-exit(r0)     // Catch:{ all -> 0x0088 }
            r13.b()
            return
        L_0x0088:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0088 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.a.b.k.a.a():void");
    }
}
