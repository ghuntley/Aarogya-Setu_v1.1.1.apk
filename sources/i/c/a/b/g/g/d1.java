package i.c.a.b.g.g;

import android.os.Build;
import android.os.UserManager;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public class d1 {
    public static UserManager a;

    /* renamed from: b  reason: collision with root package name */
    public static volatile boolean f3250b = (!a());

    public static boolean a() {
        return Build.VERSION.SDK_INT >= 24;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0036, code lost:
        if (r3.isUserRunning(android.os.Process.myUserHandle()) != false) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0046, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0050, code lost:
        return r1;
     */
    @android.annotation.TargetApi(24)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(android.content.Context r7) {
        /*
            boolean r0 = f3250b
            r1 = 1
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            java.lang.Class<i.c.a.b.g.g.d1> r0 = i.c.a.b.g.g.d1.class
            monitor-enter(r0)
            boolean r2 = f3250b     // Catch:{ all -> 0x0051 }
            if (r2 == 0) goto L_0x000f
            monitor-exit(r0)     // Catch:{ all -> 0x0051 }
            return r1
        L_0x000f:
            r2 = 1
        L_0x0010:
            r3 = 2
            r4 = 0
            r5 = 0
            if (r2 > r3) goto L_0x0046
            android.os.UserManager r3 = a     // Catch:{ all -> 0x0051 }
            if (r3 != 0) goto L_0x0023
            java.lang.Class<android.os.UserManager> r3 = android.os.UserManager.class
            java.lang.Object r3 = r7.getSystemService(r3)     // Catch:{ all -> 0x0051 }
            android.os.UserManager r3 = (android.os.UserManager) r3     // Catch:{ all -> 0x0051 }
            a = r3     // Catch:{ all -> 0x0051 }
        L_0x0023:
            android.os.UserManager r3 = a     // Catch:{ all -> 0x0051 }
            if (r3 != 0) goto L_0x0028
            goto L_0x004b
        L_0x0028:
            boolean r6 = r3.isUserUnlocked()     // Catch:{ NullPointerException -> 0x0039 }
            if (r6 != 0) goto L_0x0047
            android.os.UserHandle r6 = android.os.Process.myUserHandle()     // Catch:{ NullPointerException -> 0x0039 }
            boolean r7 = r3.isUserRunning(r6)     // Catch:{ NullPointerException -> 0x0039 }
            if (r7 != 0) goto L_0x0046
            goto L_0x0047
        L_0x0039:
            r3 = move-exception
            java.lang.String r5 = "DirectBootUtils"
            java.lang.String r6 = "Failed to check if user is unlocked."
            android.util.Log.w(r5, r6, r3)     // Catch:{ all -> 0x0051 }
            a = r4     // Catch:{ all -> 0x0051 }
            int r2 = r2 + 1
            goto L_0x0010
        L_0x0046:
            r1 = 0
        L_0x0047:
            if (r1 == 0) goto L_0x004b
            a = r4     // Catch:{ all -> 0x0051 }
        L_0x004b:
            if (r1 == 0) goto L_0x004f
            f3250b = r1     // Catch:{ all -> 0x0051 }
        L_0x004f:
            monitor-exit(r0)     // Catch:{ all -> 0x0051 }
            return r1
        L_0x0051:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0051 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.a.b.g.g.d1.a(android.content.Context):boolean");
    }
}
