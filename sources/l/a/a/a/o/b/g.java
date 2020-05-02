package l.a.a.a.o.b;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import l.a.a.a.f;

/* compiled from: ApiKey */
public class g {
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String a(android.content.Context r8) {
        /*
            r7 = this;
            java.lang.String r0 = "Fabric"
            r1 = 3
            r2 = 0
            java.lang.String r3 = r8.getPackageName()     // Catch:{ Exception -> 0x004e }
            android.content.pm.PackageManager r8 = r8.getPackageManager()     // Catch:{ Exception -> 0x004e }
            r4 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r8 = r8.getApplicationInfo(r3, r4)     // Catch:{ Exception -> 0x004e }
            android.os.Bundle r8 = r8.metaData     // Catch:{ Exception -> 0x004e }
            if (r8 == 0) goto L_0x006f
            java.lang.String r3 = "io.fabric.ApiKey"
            java.lang.String r3 = r8.getString(r3)     // Catch:{ Exception -> 0x004e }
            java.lang.String r4 = "@string/twitter_consumer_secret"
            boolean r4 = r4.equals(r3)     // Catch:{ Exception -> 0x004c }
            if (r4 == 0) goto L_0x0034
            l.a.a.a.c r4 = l.a.a.a.f.a()     // Catch:{ Exception -> 0x004c }
            java.lang.String r5 = "Ignoring bad default value for Fabric ApiKey set by FirebaseUI-Auth"
            boolean r4 = r4.a(r0, r1)     // Catch:{ Exception -> 0x004c }
            if (r4 == 0) goto L_0x0033
            android.util.Log.d(r0, r5, r2)     // Catch:{ Exception -> 0x004c }
        L_0x0033:
            r3 = r2
        L_0x0034:
            if (r3 != 0) goto L_0x006e
            l.a.a.a.c r4 = l.a.a.a.f.a()     // Catch:{ Exception -> 0x004c }
            java.lang.String r5 = "Falling back to Crashlytics key lookup from Manifest"
            boolean r4 = r4.a(r0, r1)     // Catch:{ Exception -> 0x004c }
            if (r4 == 0) goto L_0x0045
            android.util.Log.d(r0, r5, r2)     // Catch:{ Exception -> 0x004c }
        L_0x0045:
            java.lang.String r4 = "com.crashlytics.ApiKey"
            java.lang.String r2 = r8.getString(r4)     // Catch:{ Exception -> 0x004c }
            goto L_0x006f
        L_0x004c:
            r8 = move-exception
            goto L_0x0050
        L_0x004e:
            r8 = move-exception
            r3 = r2
        L_0x0050:
            l.a.a.a.c r4 = l.a.a.a.f.a()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Caught non-fatal exception while retrieving apiKey: "
            r5.append(r6)
            r5.append(r8)
            java.lang.String r8 = r5.toString()
            boolean r1 = r4.a(r0, r1)
            if (r1 == 0) goto L_0x006e
            android.util.Log.d(r0, r8, r2)
        L_0x006e:
            r2 = r3
        L_0x006f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: l.a.a.a.o.b.g.a(android.content.Context):java.lang.String");
    }

    public String b(Context context) {
        int a = i.a(context, "io.fabric.ApiKey", "string");
        if (a == 0) {
            if (f.a().a("Fabric", 3)) {
                Log.d("Fabric", "Falling back to Crashlytics key lookup from Strings", (Throwable) null);
            }
            a = i.a(context, "com.crashlytics.ApiKey", "string");
        }
        if (a != 0) {
            return context.getResources().getString(a);
        }
        return null;
    }

    public String c(Context context) {
        String a = a(context);
        if (TextUtils.isEmpty(a)) {
            a = b(context);
        }
        if (TextUtils.isEmpty(a)) {
            int a2 = i.a(context, "google_app_id", "string");
            if (a2 != 0) {
                if (f.a().a("Fabric", 3)) {
                    Log.d("Fabric", "Generating Crashlytics ApiKey from google_app_id in Strings", (Throwable) null);
                }
                a = i.a(context.getResources().getString(a2), "SHA-256").substring(0, 40);
            } else {
                a = null;
            }
        }
        if (TextUtils.isEmpty(a)) {
            if (f.b() || i.f(context)) {
                throw new IllegalArgumentException("Fabric could not be initialized, API key missing from AndroidManifest.xml. Add the following tag to your Application element \n\t<meta-data android:name=\"io.fabric.ApiKey\" android:value=\"YOUR_API_KEY\"/>");
            } else if (f.a().a("Fabric", 6)) {
                Log.e("Fabric", "Fabric could not be initialized, API key missing from AndroidManifest.xml. Add the following tag to your Application element \n\t<meta-data android:name=\"io.fabric.ApiKey\" android:value=\"YOUR_API_KEY\"/>", (Throwable) null);
            }
        }
        return a;
    }
}
