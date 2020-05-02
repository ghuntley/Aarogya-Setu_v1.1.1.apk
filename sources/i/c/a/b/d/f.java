package i.c.a.b.d;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import i.a.a.a.a;
import i.c.a.b.d.l.l0;
import i.c.a.b.d.l.q;
import i.c.a.b.d.p.c;

/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public class f {
    public static final int a = g.GOOGLE_PLAY_SERVICES_VERSION_CODE;

    /* renamed from: b  reason: collision with root package name */
    public static final f f3022b = new f();

    public int a(Context context, int i2) {
        int isGooglePlayServicesAvailable = g.isGooglePlayServicesAvailable(context, i2);
        if (g.isPlayServicesPossiblyUpdating(context, isGooglePlayServicesAvailable)) {
            return 18;
        }
        return isGooglePlayServicesAvailable;
    }

    public Intent a(Context context, int i2, String str) {
        if (i2 == 1 || i2 == 2) {
            if (context != null && q.b(context)) {
                return l0.a();
            }
            StringBuilder a2 = a.a("gcore_");
            a2.append(a);
            a2.append("-");
            if (!TextUtils.isEmpty(str)) {
                a2.append(str);
            }
            a2.append("-");
            if (context != null) {
                a2.append(context.getPackageName());
            }
            a2.append("-");
            if (context != null) {
                try {
                    a2.append(c.b(context).b(context.getPackageName(), 0).versionCode);
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            return l0.a("com.google.android.gms", a2.toString());
        } else if (i2 != 3) {
            return null;
        } else {
            return l0.a("com.google.android.gms");
        }
    }

    public PendingIntent a(Context context, int i2, int i3) {
        Intent a2 = a(context, i2, (String) null);
        if (a2 == null) {
            return null;
        }
        return PendingIntent.getActivity(context, i3, a2, 134217728);
    }
}
