package l.a.a.a.o.b;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import l.a.a.a.f;

/* compiled from: FirebaseInfo */
public class r {
    public boolean a(Context context) {
        boolean z;
        boolean z2;
        if (i.a(context, "com.crashlytics.useFirebaseAppId", false)) {
            return true;
        }
        int a = i.a(context, "google_app_id", "string");
        if (a == 0) {
            z = false;
        } else {
            z = !TextUtils.isEmpty(context.getResources().getString(a));
        }
        if (!z) {
            return false;
        }
        if (!TextUtils.isEmpty(new g().a(context))) {
            z2 = true;
        } else {
            int a2 = i.a(context, "io.fabric.ApiKey", "string");
            String str = null;
            if (a2 == 0) {
                if (f.a().a("Fabric", 3)) {
                    Log.d("Fabric", "Falling back to Crashlytics key lookup from Strings", (Throwable) null);
                }
                a2 = i.a(context, "com.crashlytics.ApiKey", "string");
            }
            if (a2 != 0) {
                str = context.getResources().getString(a2);
            }
            z2 = !TextUtils.isEmpty(str);
        }
        if (!z2) {
            return true;
        }
        return false;
    }
}
