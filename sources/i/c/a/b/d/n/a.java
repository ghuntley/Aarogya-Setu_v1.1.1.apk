package i.c.a.b.d.n;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public class a {
    public static final Object a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static volatile a f3157b;

    public a() {
        List list = Collections.EMPTY_LIST;
    }

    public static a a() {
        if (f3157b == null) {
            synchronized (a) {
                if (f3157b == null) {
                    f3157b = new a();
                }
            }
        }
        return f3157b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0032  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(android.content.Context r4, android.content.Intent r5, android.content.ServiceConnection r6, int r7) {
        /*
            r3 = this;
            android.content.ComponentName r0 = r5.getComponent()
            r1 = 0
            if (r0 != 0) goto L_0x0009
        L_0x0007:
            r0 = 0
            goto L_0x0028
        L_0x0009:
            java.lang.String r0 = r0.getPackageName()
            java.lang.String r2 = "com.google.android.gms"
            r2.equals(r0)
            i.c.a.b.d.p.b r2 = i.c.a.b.d.p.c.b(r4)     // Catch:{ NameNotFoundException -> 0x0007 }
            android.content.Context r2 = r2.a     // Catch:{ NameNotFoundException -> 0x0007 }
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0007 }
            android.content.pm.ApplicationInfo r0 = r2.getApplicationInfo(r0, r1)     // Catch:{ NameNotFoundException -> 0x0007 }
            int r0 = r0.flags     // Catch:{ NameNotFoundException -> 0x0007 }
            r2 = 2097152(0x200000, float:2.938736E-39)
            r0 = r0 & r2
            if (r0 == 0) goto L_0x0007
            r0 = 1
        L_0x0028:
            if (r0 == 0) goto L_0x0032
            java.lang.String r4 = "ConnectionTracker"
            java.lang.String r5 = "Attempted to bind to a service in a STOPPED package."
            android.util.Log.w(r4, r5)
            return r1
        L_0x0032:
            boolean r4 = r4.bindService(r5, r6, r7)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.a.b.d.n.a.b(android.content.Context, android.content.Intent, android.content.ServiceConnection, int):boolean");
    }

    public boolean a(Context context, Intent intent, ServiceConnection serviceConnection, int i2) {
        context.getClass().getName();
        return b(context, intent, serviceConnection, i2);
    }
}
