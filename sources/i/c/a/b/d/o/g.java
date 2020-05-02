package i.c.a.b.d.o;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import i.c.a.b.d.p.b;
import i.c.a.b.d.p.c;
import java.lang.reflect.Method;

/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public class g {
    public static final Method a;

    /* renamed from: b  reason: collision with root package name */
    public static final Method f3161b;
    public static final Method c;
    public static final Method d;

    static {
        Method method;
        Method method2;
        Method method3;
        Class<String> cls = String.class;
        Process.myUid();
        Method method4 = null;
        try {
            method = WorkSource.class.getMethod("add", new Class[]{Integer.TYPE});
        } catch (Exception unused) {
            method = null;
        }
        a = method;
        try {
            method2 = WorkSource.class.getMethod("add", new Class[]{Integer.TYPE, cls});
        } catch (Exception unused2) {
            method2 = null;
        }
        f3161b = method2;
        try {
            method3 = WorkSource.class.getMethod("size", new Class[0]);
        } catch (Exception unused3) {
            method3 = null;
        }
        c = method3;
        try {
            WorkSource.class.getMethod("get", new Class[]{Integer.TYPE});
        } catch (Exception unused4) {
        }
        try {
            method4 = WorkSource.class.getMethod("getName", new Class[]{Integer.TYPE});
        } catch (Exception unused5) {
        }
        d = method4;
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                WorkSource.class.getMethod("createWorkChain", new Class[0]);
            } catch (Exception e) {
                Log.w("WorkSourceUtil", "Missing WorkChain API createWorkChain", e);
            }
        }
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", new Class[]{Integer.TYPE, cls});
            } catch (Exception e2) {
                Log.w("WorkSourceUtil", "Missing WorkChain class", e2);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0050 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<java.lang.String> a(android.os.WorkSource r9) {
        /*
            java.lang.String r0 = "Unable to assign blame through WorkSource"
            java.lang.String r1 = "WorkSourceUtil"
            r2 = 0
            if (r9 != 0) goto L_0x0009
        L_0x0007:
            r3 = 0
            goto L_0x001f
        L_0x0009:
            java.lang.reflect.Method r3 = c
            if (r3 == 0) goto L_0x0007
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x001a }
            java.lang.Object r3 = r3.invoke(r9, r4)     // Catch:{ Exception -> 0x001a }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ Exception -> 0x001a }
            int r3 = r3.intValue()     // Catch:{ Exception -> 0x001a }
            goto L_0x001f
        L_0x001a:
            r3 = move-exception
            android.util.Log.wtf(r1, r0, r3)
            goto L_0x0007
        L_0x001f:
            if (r3 != 0) goto L_0x0026
            java.util.List r9 = java.util.Collections.emptyList()
            return r9
        L_0x0026:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r5 = 0
        L_0x002c:
            if (r5 >= r3) goto L_0x0053
            java.lang.reflect.Method r6 = d
            if (r6 == 0) goto L_0x0046
            r7 = 1
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x0042 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x0042 }
            r7[r2] = r8     // Catch:{ Exception -> 0x0042 }
            java.lang.Object r6 = r6.invoke(r9, r7)     // Catch:{ Exception -> 0x0042 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x0042 }
            goto L_0x0047
        L_0x0042:
            r6 = move-exception
            android.util.Log.wtf(r1, r0, r6)
        L_0x0046:
            r6 = 0
        L_0x0047:
            boolean r7 = i.c.a.b.d.o.f.a(r6)
            if (r7 != 0) goto L_0x0050
            r4.add(r6)
        L_0x0050:
            int r5 = r5 + 1
            goto L_0x002c
        L_0x0053:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.a.b.d.o.g.a(android.os.WorkSource):java.util.List");
    }

    public static boolean a(Context context) {
        if (context == null || context.getPackageManager() == null) {
            return false;
        }
        b b2 = c.b(context);
        if (b2.a.getPackageManager().checkPermission("android.permission.UPDATE_DEVICE_STATS", context.getPackageName()) == 0) {
            return true;
        }
        return false;
    }
}
