package l.a.a.a.o.b;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import l.a.a.a.f;

/* compiled from: DataCollectionArbiter */
public class l {

    /* renamed from: f  reason: collision with root package name */
    public static l f5075f;

    /* renamed from: g  reason: collision with root package name */
    public static Object f5076g = new Object();
    public final SharedPreferences a;

    /* renamed from: b  reason: collision with root package name */
    public volatile boolean f5077b;
    public volatile boolean c;
    public final q d;
    public boolean e = false;

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008e, code lost:
        r2 = r2.getApplicationInfo(r8.getPackageName(), 128);
     */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ca  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public l(android.content.Context r8) {
        /*
            r7 = this;
            java.lang.String r0 = "Fabric"
            r7.<init>()
            r1 = 0
            r7.e = r1
            if (r8 == 0) goto L_0x00ce
            java.lang.String r2 = "com.google.firebase.crashlytics.prefs"
            android.content.SharedPreferences r2 = r8.getSharedPreferences(r2, r1)
            r7.a = r2
            r2 = 0
            r3 = 3
            java.lang.ClassLoader r4 = r8.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0064, NoSuchMethodException -> 0x0044, Exception -> 0x0033 }
            java.lang.String r5 = "com.google.firebase.FirebaseApp"
            java.lang.Class r4 = r4.loadClass(r5)     // Catch:{ ClassNotFoundException -> 0x0064, NoSuchMethodException -> 0x0044, Exception -> 0x0033 }
            java.lang.String r5 = "getInstance"
            java.lang.Class[] r6 = new java.lang.Class[r1]     // Catch:{ ClassNotFoundException -> 0x0064, NoSuchMethodException -> 0x0044, Exception -> 0x0033 }
            java.lang.reflect.Method r5 = r4.getDeclaredMethod(r5, r6)     // Catch:{ ClassNotFoundException -> 0x0064, NoSuchMethodException -> 0x0044, Exception -> 0x0033 }
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ ClassNotFoundException -> 0x0064, NoSuchMethodException -> 0x0044, Exception -> 0x0033 }
            java.lang.Object r5 = r5.invoke(r4, r6)     // Catch:{ ClassNotFoundException -> 0x0064, NoSuchMethodException -> 0x0044, Exception -> 0x0033 }
            l.a.a.a.o.b.q r6 = new l.a.a.a.o.b.q     // Catch:{ ClassNotFoundException -> 0x0064, NoSuchMethodException -> 0x0044, Exception -> 0x0033 }
            r6.<init>(r4, r5)     // Catch:{ ClassNotFoundException -> 0x0064, NoSuchMethodException -> 0x0044, Exception -> 0x0033 }
            r2 = r6
            goto L_0x0074
        L_0x0033:
            r4 = move-exception
            l.a.a.a.c r5 = l.a.a.a.f.a()
            boolean r5 = r5.a(r0, r3)
            if (r5 == 0) goto L_0x0074
            java.lang.String r5 = "Unexpected error loading FirebaseApp instance."
            android.util.Log.d(r0, r5, r4)
            goto L_0x0074
        L_0x0044:
            r4 = move-exception
            l.a.a.a.c r5 = l.a.a.a.f.a()
            java.lang.String r6 = "Could not find method: "
            java.lang.StringBuilder r6 = i.a.a.a.a.a(r6)
            java.lang.String r4 = r4.getMessage()
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            boolean r5 = r5.a(r0, r3)
            if (r5 == 0) goto L_0x0074
            android.util.Log.d(r0, r4, r2)
            goto L_0x0074
        L_0x0064:
            l.a.a.a.c r4 = l.a.a.a.f.a()
            boolean r4 = r4.a(r0, r3)
            if (r4 == 0) goto L_0x0074
            java.lang.String r4 = "Could not find class: com.google.firebase.FirebaseApp"
            android.util.Log.d(r0, r4, r2)
        L_0x0074:
            r7.d = r2
            android.content.SharedPreferences r2 = r7.a
            java.lang.String r4 = "firebase_crashlytics_collection_enabled"
            boolean r2 = r2.contains(r4)
            r5 = 1
            if (r2 == 0) goto L_0x0088
            android.content.SharedPreferences r0 = r7.a
            boolean r0 = r0.getBoolean(r4, r5)
            goto L_0x00ac
        L_0x0088:
            android.content.pm.PackageManager r2 = r8.getPackageManager()     // Catch:{ NameNotFoundException -> 0x00ae }
            if (r2 == 0) goto L_0x00be
            java.lang.String r5 = r8.getPackageName()     // Catch:{ NameNotFoundException -> 0x00ae }
            r6 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r2 = r2.getApplicationInfo(r5, r6)     // Catch:{ NameNotFoundException -> 0x00ae }
            if (r2 == 0) goto L_0x00be
            android.os.Bundle r5 = r2.metaData     // Catch:{ NameNotFoundException -> 0x00ae }
            if (r5 == 0) goto L_0x00be
            android.os.Bundle r5 = r2.metaData     // Catch:{ NameNotFoundException -> 0x00ae }
            boolean r5 = r5.containsKey(r4)     // Catch:{ NameNotFoundException -> 0x00ae }
            if (r5 == 0) goto L_0x00be
            android.os.Bundle r2 = r2.metaData     // Catch:{ NameNotFoundException -> 0x00ae }
            boolean r0 = r2.getBoolean(r4)     // Catch:{ NameNotFoundException -> 0x00ae }
        L_0x00ac:
            r2 = 1
            goto L_0x00c0
        L_0x00ae:
            r2 = move-exception
            l.a.a.a.c r4 = l.a.a.a.f.a()
            boolean r3 = r4.a(r0, r3)
            if (r3 == 0) goto L_0x00be
            java.lang.String r3 = "Unable to get PackageManager. Falling through"
            android.util.Log.d(r0, r3, r2)
        L_0x00be:
            r0 = 1
            r2 = 0
        L_0x00c0:
            r7.c = r0
            r7.f5077b = r2
            java.lang.String r8 = l.a.a.a.o.b.i.k(r8)
            if (r8 == 0) goto L_0x00cb
            r1 = 1
        L_0x00cb:
            r7.e = r1
            return
        L_0x00ce:
            java.lang.RuntimeException r8 = new java.lang.RuntimeException
            java.lang.String r0 = "null context"
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: l.a.a.a.o.b.l.<init>(android.content.Context):void");
    }

    public static l a(Context context) {
        l lVar;
        synchronized (f5076g) {
            if (f5075f == null) {
                f5075f = new l(context);
            }
            lVar = f5075f;
        }
        return lVar;
    }

    public boolean a() {
        if (this.e && this.f5077b) {
            return this.c;
        }
        q qVar = this.d;
        if (qVar == null) {
            return true;
        }
        if (qVar != null) {
            try {
                return ((Boolean) qVar.a.invoke(qVar.f5087b, new Object[0])).booleanValue();
            } catch (Exception e2) {
                if (!f.a().a("Fabric", 3)) {
                    return false;
                }
                Log.d("Fabric", "Cannot check isDataCollectionDefaultEnabled on FirebaseApp.", e2);
                return false;
            }
        } else {
            throw null;
        }
    }
}
