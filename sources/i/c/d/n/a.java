package i.c.d.n;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import i.c.d.i.c;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.firebase:firebase-common@@19.3.0 */
public class a {
    public final Context a;

    /* renamed from: b  reason: collision with root package name */
    public final SharedPreferences f4755b;
    public final AtomicBoolean c;

    public a(Context context, String str, c cVar) {
        ApplicationInfo applicationInfo;
        this.a = (Build.VERSION.SDK_INT < 24 || h.h.f.a.b(context)) ? context : Build.VERSION.SDK_INT >= 24 ? context.createDeviceProtectedStorageContext() : null;
        this.f4755b = context.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        boolean z = true;
        if (this.f4755b.contains("firebase_data_collection_default_enabled")) {
            z = this.f4755b.getBoolean("firebase_data_collection_default_enabled", true);
        } else {
            try {
                PackageManager packageManager = this.a.getPackageManager();
                if (!(packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.a.getPackageName(), 128)) == null || applicationInfo.metaData == null || !applicationInfo.metaData.containsKey("firebase_data_collection_default_enabled"))) {
                    z = applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        this.c = new AtomicBoolean(z);
    }
}
