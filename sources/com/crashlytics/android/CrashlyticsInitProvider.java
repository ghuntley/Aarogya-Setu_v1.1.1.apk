package com.crashlytics.android;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import l.a.a.a.f;
import l.a.a.a.o.b.i;
import l.a.a.a.o.b.r;

public class CrashlyticsInitProvider extends ContentProvider {
    public static final String NDK_MANIFEST_FLAG = "firebase_crashlytics_ndk_enabled";
    public static final String TAG = "CrashlyticsInitProvider";

    public interface EnabledCheckStrategy {
        boolean isCrashlyticsEnabled(Context context);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0039 A[SYNTHETIC, Splitter:B:14:0x0039] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private l.a.a.a.k[] createCrashlyticsKits(android.content.Context r7) {
        /*
            r6 = this;
            java.lang.String r0 = "Fabric"
            r1 = 1
            r2 = 0
            android.content.pm.PackageManager r3 = r7.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0020 }
            java.lang.String r7 = r7.getPackageName()     // Catch:{ NameNotFoundException -> 0x0020 }
            r4 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r7 = r3.getApplicationInfo(r7, r4)     // Catch:{ NameNotFoundException -> 0x0020 }
            android.os.Bundle r7 = r7.metaData     // Catch:{ NameNotFoundException -> 0x0020 }
            if (r7 == 0) goto L_0x0031
            java.lang.String r3 = "firebase_crashlytics_ndk_enabled"
            boolean r7 = r7.getBoolean(r3, r2)     // Catch:{ NameNotFoundException -> 0x0020 }
            if (r7 == 0) goto L_0x0031
            r7 = 1
            goto L_0x0032
        L_0x0020:
            r7 = move-exception
            l.a.a.a.c r3 = l.a.a.a.f.a()
            r4 = 3
            boolean r3 = r3.a(r0, r4)
            if (r3 == 0) goto L_0x0031
            java.lang.String r3 = "Unable to get PackageManager while determining if Crashlytics NDK should be initialized"
            android.util.Log.d(r0, r3, r7)
        L_0x0031:
            r7 = 0
        L_0x0032:
            com.crashlytics.android.Crashlytics r3 = new com.crashlytics.android.Crashlytics
            r3.<init>()
            if (r7 == 0) goto L_0x0068
            l.a.a.a.c r7 = l.a.a.a.f.a()     // Catch:{ all -> 0x0057 }
            java.lang.String r4 = "Crashlytics is initializing NDK crash reporter."
            r5 = 4
            boolean r7 = r7.a(r0, r5)     // Catch:{ all -> 0x0057 }
            if (r7 == 0) goto L_0x004a
            r7 = 0
            android.util.Log.i(r0, r4, r7)     // Catch:{ all -> 0x0057 }
        L_0x004a:
            r7 = 2
            l.a.a.a.k[] r7 = new l.a.a.a.k[r7]     // Catch:{ all -> 0x0057 }
            r7[r2] = r3     // Catch:{ all -> 0x0057 }
            com.crashlytics.android.ndk.CrashlyticsNdk r4 = new com.crashlytics.android.ndk.CrashlyticsNdk     // Catch:{ all -> 0x0057 }
            r4.<init>()     // Catch:{ all -> 0x0057 }
            r7[r1] = r4     // Catch:{ all -> 0x0057 }
            return r7
        L_0x0057:
            r7 = move-exception
            l.a.a.a.c r4 = l.a.a.a.f.a()
            r5 = 6
            boolean r4 = r4.a(r0, r5)
            if (r4 == 0) goto L_0x0068
            java.lang.String r4 = "Crashlytics failed to initialize NDK crash reporting. Attempting to intialize SDK..."
            android.util.Log.e(r0, r4, r7)
        L_0x0068:
            l.a.a.a.k[] r7 = new l.a.a.a.k[r1]
            r7[r2] = r3
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crashlytics.android.CrashlyticsInitProvider.createCrashlyticsKits(android.content.Context):l.a.a.a.k[]");
    }

    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public String getType(Uri uri) {
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public boolean onCreate() {
        Context context = getContext();
        if (shouldInitializeFabric(context, new r(), new ManifestEnabledCheckStrategy())) {
            try {
                f.a(context, createCrashlyticsKits(context.getApplicationContext()));
                if (!f.a().a(TAG, 4)) {
                    return true;
                }
                Log.i(TAG, "CrashlyticsInitProvider initialization successful", (Throwable) null);
                return true;
            } catch (IllegalStateException unused) {
                if (!f.a().a(TAG, 4)) {
                    return false;
                }
                Log.i(TAG, "CrashlyticsInitProvider initialization unsuccessful", (Throwable) null);
                return false;
            }
        } else if (!f.a().a(TAG, 4)) {
            return true;
        } else {
            Log.i(TAG, "CrashlyticsInitProvider skipping initialization", (Throwable) null);
            return true;
        }
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public boolean shouldInitializeFabric(Context context, r rVar, EnabledCheckStrategy enabledCheckStrategy) {
        if (rVar.a(context)) {
            return enabledCheckStrategy.isCrashlyticsEnabled(context);
        }
        int a = i.a(context, "io.fabric.auto_initialize", "bool");
        if (a == 0) {
            return false;
        }
        boolean z = context.getResources().getBoolean(a);
        if (!z || !f.a().a("Fabric", 3)) {
            return z;
        }
        Log.d("Fabric", "Found Fabric auto-initialization flag for joint Firebase/Fabric customers", (Throwable) null);
        return z;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
