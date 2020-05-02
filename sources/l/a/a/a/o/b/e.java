package l.a.a.a.o.b;

import android.content.Context;
import android.util.Log;
import l.a.a.a.f;

/* compiled from: AdvertisingInfoReflectionStrategy */
public class e {
    public final Context a;

    public e(Context context) {
        this.a = context.getApplicationContext();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0029, code lost:
        if (((java.lang.Integer) java.lang.Class.forName("com.google.android.gms.common.GooglePlayServicesUtil").getMethod("isGooglePlayServicesAvailable", new java.lang.Class[]{android.content.Context.class}).invoke((java.lang.Object) null, new java.lang.Object[]{r10.a})).intValue() == 0) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public l.a.a.a.o.b.b a() {
        /*
            r10 = this;
            java.lang.String r0 = "Fabric"
            java.lang.String r1 = "com.google.android.gms.ads.identifier.AdvertisingIdClient$Info"
            android.content.Context r2 = r10.a
            r3 = 1
            r4 = 0
            r5 = 0
            java.lang.String r6 = "com.google.android.gms.common.GooglePlayServicesUtil"
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch:{ Exception -> 0x002c }
            java.lang.String r7 = "isGooglePlayServicesAvailable"
            java.lang.Class[] r8 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x002c }
            java.lang.Class<android.content.Context> r9 = android.content.Context.class
            r8[r4] = r9     // Catch:{ Exception -> 0x002c }
            java.lang.reflect.Method r6 = r6.getMethod(r7, r8)     // Catch:{ Exception -> 0x002c }
            java.lang.Object[] r7 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x002c }
            r7[r4] = r2     // Catch:{ Exception -> 0x002c }
            java.lang.Object r2 = r6.invoke(r5, r7)     // Catch:{ Exception -> 0x002c }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ Exception -> 0x002c }
            int r2 = r2.intValue()     // Catch:{ Exception -> 0x002c }
            if (r2 != 0) goto L_0x002c
            goto L_0x002d
        L_0x002c:
            r3 = 0
        L_0x002d:
            if (r3 == 0) goto L_0x008d
            l.a.a.a.o.b.b r2 = new l.a.a.a.o.b.b
            r3 = 5
            java.lang.Class r6 = java.lang.Class.forName(r1)     // Catch:{ Exception -> 0x004b }
            java.lang.String r7 = "getId"
            java.lang.Class[] r8 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x004b }
            java.lang.reflect.Method r6 = r6.getMethod(r7, r8)     // Catch:{ Exception -> 0x004b }
            java.lang.Object r7 = r10.b()     // Catch:{ Exception -> 0x004b }
            java.lang.Object[] r8 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x004b }
            java.lang.Object r6 = r6.invoke(r7, r8)     // Catch:{ Exception -> 0x004b }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x004b }
            goto L_0x005c
        L_0x004b:
            l.a.a.a.c r6 = l.a.a.a.f.a()
            boolean r6 = r6.a(r0, r3)
            if (r6 == 0) goto L_0x005b
            java.lang.String r6 = "Could not call getId on com.google.android.gms.ads.identifier.AdvertisingIdClient$Info"
            android.util.Log.w(r0, r6, r5)
        L_0x005b:
            r6 = r5
        L_0x005c:
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ Exception -> 0x0079 }
            java.lang.String r7 = "isLimitAdTrackingEnabled"
            java.lang.Class[] r8 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x0079 }
            java.lang.reflect.Method r1 = r1.getMethod(r7, r8)     // Catch:{ Exception -> 0x0079 }
            java.lang.Object r7 = r10.b()     // Catch:{ Exception -> 0x0079 }
            java.lang.Object[] r8 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0079 }
            java.lang.Object r1 = r1.invoke(r7, r8)     // Catch:{ Exception -> 0x0079 }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ Exception -> 0x0079 }
            boolean r4 = r1.booleanValue()     // Catch:{ Exception -> 0x0079 }
            goto L_0x0089
        L_0x0079:
            l.a.a.a.c r1 = l.a.a.a.f.a()
            boolean r1 = r1.a(r0, r3)
            if (r1 == 0) goto L_0x0089
            java.lang.String r1 = "Could not call isLimitAdTrackingEnabled on com.google.android.gms.ads.identifier.AdvertisingIdClient$Info"
            android.util.Log.w(r0, r1, r5)
        L_0x0089:
            r2.<init>(r6, r4)
            return r2
        L_0x008d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: l.a.a.a.o.b.e.a():l.a.a.a.o.b.b");
    }

    public final Object b() {
        try {
            return Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient").getMethod("getAdvertisingIdInfo", new Class[]{Context.class}).invoke((Object) null, new Object[]{this.a});
        } catch (Exception unused) {
            if (f.a().a("Fabric", 5)) {
                Log.w("Fabric", "Could not call getAdvertisingIdInfo on com.google.android.gms.ads.identifier.AdvertisingIdClient", (Throwable) null);
            }
            return null;
        }
    }
}
