package i.c.a.b.d;

import android.annotation.TargetApi;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import com.crashlytics.android.answers.AnswersRetryFilesSender;
import com.crashlytics.android.core.MetaDataStore;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import i.c.a.b.d.l.q;
import i.c.a.b.d.p.c;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public class g {
    public static final int GMS_AVAILABILITY_NOTIFICATION_ID = 10436;
    public static final int GMS_GENERAL_ERROR_NOTIFICATION_ID = 39789;
    public static final String GOOGLE_PLAY_GAMES_PACKAGE = "com.google.android.play.games";
    @Deprecated
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
    @Deprecated
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = 12451000;
    public static final String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";
    public static final AtomicBoolean sCanceledAvailabilityNotification = new AtomicBoolean();
    public static boolean zzav = false;
    public static boolean zzaw = false;
    public static boolean zzax = false;
    public static boolean zzay = false;
    public static final AtomicBoolean zzaz = new AtomicBoolean();

    @Deprecated
    public static void cancelAvailabilityErrorNotifications(Context context) {
        if (!sCanceledAvailabilityNotification.getAndSet(true)) {
            try {
                NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                if (notificationManager != null) {
                    notificationManager.cancel(GMS_AVAILABILITY_NOTIFICATION_ID);
                }
            } catch (SecurityException unused) {
            }
        }
    }

    public static void enableUsingApkIndependentContext() {
        zzaz.set(true);
    }

    @Deprecated
    public static void ensurePlayServicesAvailable(Context context, int i2) {
        int a = f.f3022b.a(context, i2);
        if (a != 0) {
            Intent a2 = f.f3022b.a(context, a, "e");
            StringBuilder sb = new StringBuilder(57);
            sb.append("GooglePlayServices not available due to error ");
            sb.append(a);
            Log.e("GooglePlayServicesUtil", sb.toString());
            if (a2 == null) {
                throw new GooglePlayServicesNotAvailableException(a);
            }
            throw new GooglePlayServicesRepairableException(a, "Google Play Services not available", a2);
        }
    }

    @Deprecated
    public static int getApkVersion(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    @Deprecated
    public static int getClientVersion(Context context) {
        PackageInfo packageInfo;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        q.b(true);
        try {
            packageInfo = c.b(context).a.getPackageManager().getPackageInfo(context.getPackageName(), 128);
        } catch (PackageManager.NameNotFoundException unused) {
            packageInfo = null;
        }
        if (packageInfo == null || (applicationInfo = packageInfo.applicationInfo) == null || (bundle = applicationInfo.metaData) == null) {
            return -1;
        }
        return bundle.getInt("com.google.android.gms.version", -1);
    }

    @Deprecated
    public static PendingIntent getErrorPendingIntent(int i2, Context context, int i3) {
        return f.f3022b.a(context, i2, i3);
    }

    @Deprecated
    public static String getErrorString(int i2) {
        return b.a(i2);
    }

    @Deprecated
    public static Intent getGooglePlayServicesAvailabilityRecoveryIntent(int i2) {
        return f.f3022b.a((Context) null, i2, (String) null);
    }

    public static Context getRemoteContext(Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static Resources getRemoteResource(Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static boolean honorsDebugCertificates(Context context) {
        if (!zzay) {
            try {
                PackageInfo packageInfo = c.b(context).a.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                h.a(context);
                if (packageInfo == null || h.a(packageInfo, false) || !h.a(packageInfo, true)) {
                    zzax = false;
                } else {
                    zzax = true;
                }
            } catch (PackageManager.NameNotFoundException e) {
                Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e);
            } finally {
                zzay = true;
            }
        }
        return zzax || !MetaDataStore.USERDATA_SUFFIX.equals(Build.TYPE);
    }

    @Deprecated
    public static int isGooglePlayServicesAvailable(Context context) {
        return isGooglePlayServicesAvailable(context, GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }

    @Deprecated
    public static boolean isGooglePlayServicesUid(Context context, int i2) {
        return q.a(context, i2);
    }

    @Deprecated
    public static boolean isPlayServicesPossiblyUpdating(Context context, int i2) {
        if (i2 == 18) {
            return true;
        }
        if (i2 == 1) {
            return isUninstalledAppPossiblyUpdating(context, "com.google.android.gms");
        }
        return false;
    }

    @Deprecated
    public static boolean isPlayStorePossiblyUpdating(Context context, int i2) {
        if (i2 == 9) {
            return isUninstalledAppPossiblyUpdating(context, "com.android.vending");
        }
        return false;
    }

    @TargetApi(18)
    public static boolean isRestrictedUserProfile(Context context) {
        Bundle applicationRestrictions = ((UserManager) context.getSystemService(MetaDataStore.USERDATA_SUFFIX)).getApplicationRestrictions(context.getPackageName());
        return applicationRestrictions != null && "true".equals(applicationRestrictions.getString("restricted_profile"));
    }

    @Deprecated
    public static boolean isSidewinderDevice(Context context) {
        return q.c(context);
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    @android.annotation.TargetApi(21)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean isUninstalledAppPossiblyUpdating(android.content.Context r5, java.lang.String r6) {
        /*
            java.lang.String r0 = "com.google.android.gms"
            boolean r0 = r6.equals(r0)
            r1 = 0
            android.content.pm.PackageManager r2 = r5.getPackageManager()     // Catch:{ Exception -> 0x0049 }
            android.content.pm.PackageInstaller r2 = r2.getPackageInstaller()     // Catch:{ Exception -> 0x0049 }
            java.util.List r2 = r2.getAllSessions()     // Catch:{ Exception -> 0x0049 }
            java.util.Iterator r2 = r2.iterator()
        L_0x0017:
            boolean r3 = r2.hasNext()
            r4 = 1
            if (r3 == 0) goto L_0x002f
            java.lang.Object r3 = r2.next()
            android.content.pm.PackageInstaller$SessionInfo r3 = (android.content.pm.PackageInstaller.SessionInfo) r3
            java.lang.String r3 = r3.getAppPackageName()
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L_0x0017
            return r4
        L_0x002f:
            android.content.pm.PackageManager r2 = r5.getPackageManager()
            r3 = 8192(0x2000, float:1.14794E-41)
            android.content.pm.ApplicationInfo r6 = r2.getApplicationInfo(r6, r3)     // Catch:{  }
            if (r0 == 0) goto L_0x003e
            boolean r5 = r6.enabled     // Catch:{  }
            return r5
        L_0x003e:
            boolean r6 = r6.enabled     // Catch:{  }
            if (r6 == 0) goto L_0x0049
            boolean r5 = isRestrictedUserProfile(r5)     // Catch:{  }
            if (r5 != 0) goto L_0x0049
            return r4
        L_0x0049:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.a.b.d.g.isUninstalledAppPossiblyUpdating(android.content.Context, java.lang.String):boolean");
    }

    @Deprecated
    public static boolean isUserRecoverableError(int i2) {
        return i2 == 1 || i2 == 2 || i2 == 3 || i2 == 9;
    }

    @TargetApi(19)
    @Deprecated
    public static boolean uidHasPackageName(Context context, int i2, String str) {
        return q.b(context, i2, str);
    }

    public static int zza(Context context, boolean z, int i2) {
        int i3;
        q.a(i2 >= 0);
        PackageManager packageManager = context.getPackageManager();
        PackageInfo packageInfo = null;
        if (z) {
            try {
                packageInfo = packageManager.getPackageInfo("com.android.vending", 8256);
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("GooglePlayServicesUtil", "Google Play Store is missing.");
                return 9;
            }
        }
        try {
            PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 64);
            h.a(context);
            if (!h.a(packageInfo2, true)) {
                Log.w("GooglePlayServicesUtil", "Google Play services signature invalid.");
                return 9;
            } else if (!z || (h.a(packageInfo, true) && packageInfo.signatures[0].equals(packageInfo2.signatures[0]))) {
                int i4 = packageInfo2.versionCode;
                int i5 = -1;
                if (i4 == -1) {
                    i3 = -1;
                } else {
                    i3 = i4 / AnswersRetryFilesSender.BACKOFF_MS;
                }
                if (i2 != -1) {
                    i5 = i2 / AnswersRetryFilesSender.BACKOFF_MS;
                }
                if (i3 < i5) {
                    int i6 = packageInfo2.versionCode;
                    StringBuilder sb = new StringBuilder(77);
                    sb.append("Google Play services out of date.  Requires ");
                    sb.append(i2);
                    sb.append(" but found ");
                    sb.append(i6);
                    Log.w("GooglePlayServicesUtil", sb.toString());
                    return 2;
                }
                ApplicationInfo applicationInfo = packageInfo2.applicationInfo;
                if (applicationInfo == null) {
                    try {
                        applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                    } catch (PackageManager.NameNotFoundException e) {
                        Log.wtf("GooglePlayServicesUtil", "Google Play services missing when getting application info.", e);
                        return 1;
                    }
                }
                if (!applicationInfo.enabled) {
                    return 3;
                }
                return 0;
            } else {
                Log.w("GooglePlayServicesUtil", "Google Play Store signature invalid.");
                return 9;
            }
        } catch (PackageManager.NameNotFoundException unused2) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0095, code lost:
        if (i.c.a.b.d.l.q.d.booleanValue() == false) goto L_0x0099;
     */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int isGooglePlayServicesAvailable(android.content.Context r4, int r5) {
        /*
            android.content.res.Resources r0 = r4.getResources()     // Catch:{ all -> 0x000a }
            int r1 = i.c.a.b.d.i.common_google_play_services_unknown_issue     // Catch:{ all -> 0x000a }
            r0.getString(r1)     // Catch:{ all -> 0x000a }
            goto L_0x0011
        L_0x000a:
            java.lang.String r0 = "GooglePlayServicesUtil"
            java.lang.String r1 = "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included."
            android.util.Log.e(r0, r1)
        L_0x0011:
            java.lang.String r0 = r4.getPackageName()
            java.lang.String r1 = "com.google.android.gms"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0061
            java.util.concurrent.atomic.AtomicBoolean r0 = zzaz
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x0061
            i.c.a.b.d.l.t0.a(r4)
            int r0 = i.c.a.b.d.l.t0.d
            if (r0 == 0) goto L_0x0059
            int r1 = GOOGLE_PLAY_SERVICES_VERSION_CODE
            if (r0 != r1) goto L_0x0031
            goto L_0x0061
        L_0x0031:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            int r5 = GOOGLE_PLAY_SERVICES_VERSION_CODE
            r1 = 320(0x140, float:4.48E-43)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r1 = "The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected "
            r2.append(r1)
            r2.append(r5)
            java.lang.String r5 = " but found "
            r2.append(r5)
            r2.append(r0)
            java.lang.String r5 = ".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />"
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r4.<init>(r5)
            throw r4
        L_0x0059:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "A required meta-data tag in your app's AndroidManifest.xml does not exist.  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />"
            r4.<init>(r5)
            throw r4
        L_0x0061:
            boolean r0 = i.c.a.b.d.l.q.b((android.content.Context) r4)
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0098
            java.lang.Boolean r0 = i.c.a.b.d.l.q.d
            if (r0 != 0) goto L_0x008f
            android.content.pm.PackageManager r0 = r4.getPackageManager()
            java.lang.String r3 = "android.hardware.type.iot"
            boolean r0 = r0.hasSystemFeature(r3)
            if (r0 != 0) goto L_0x0088
            android.content.pm.PackageManager r0 = r4.getPackageManager()
            java.lang.String r3 = "android.hardware.type.embedded"
            boolean r0 = r0.hasSystemFeature(r3)
            if (r0 == 0) goto L_0x0086
            goto L_0x0088
        L_0x0086:
            r0 = 0
            goto L_0x0089
        L_0x0088:
            r0 = 1
        L_0x0089:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            i.c.a.b.d.l.q.d = r0
        L_0x008f:
            java.lang.Boolean r0 = i.c.a.b.d.l.q.d
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0098
            goto L_0x0099
        L_0x0098:
            r1 = 0
        L_0x0099:
            int r4 = zza(r4, r1, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.a.b.d.g.isGooglePlayServicesAvailable(android.content.Context, int):int");
    }
}
