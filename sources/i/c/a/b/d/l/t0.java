package i.c.a.b.d.l;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import i.c.a.b.d.p.c;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public final class t0 {
    public static Object a = new Object();
    @GuardedBy("sLock")

    /* renamed from: b  reason: collision with root package name */
    public static boolean f3151b;
    public static String c;
    public static int d;

    public static void a(Context context) {
        synchronized (a) {
            if (!f3151b) {
                f3151b = true;
                try {
                    Bundle bundle = c.b(context).a(context.getPackageName(), 128).metaData;
                    if (bundle != null) {
                        c = bundle.getString("com.google.app.id");
                        d = bundle.getInt("com.google.android.gms.version");
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    Log.wtf("MetadataValueReader", "This should never happen.", e);
                }
            }
        }
    }
}
