package i.c.a.b.d.p;

import android.content.Context;
import i.c.a.b.d.l.q;

/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public class a {
    public static Context a;

    /* renamed from: b  reason: collision with root package name */
    public static Boolean f3165b;

    public static synchronized boolean a(Context context) {
        synchronized (a.class) {
            Context applicationContext = context.getApplicationContext();
            if (a == null || f3165b == null || a != applicationContext) {
                f3165b = null;
                if (q.f()) {
                    f3165b = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
                } else {
                    try {
                        context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                        f3165b = true;
                    } catch (ClassNotFoundException unused) {
                        f3165b = false;
                    }
                }
                a = applicationContext;
                boolean booleanValue = f3165b.booleanValue();
                return booleanValue;
            }
            boolean booleanValue2 = f3165b.booleanValue();
            return booleanValue2;
        }
    }
}
