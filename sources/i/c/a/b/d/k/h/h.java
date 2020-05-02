package i.c.a.b.d.k.h;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import i.c.a.b.d.i;
import i.c.a.b.d.l.q;
import i.c.a.b.d.l.t0;
import javax.annotation.concurrent.GuardedBy;

@Deprecated
/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public final class h {
    public static final Object d = new Object();
    @GuardedBy("sLock")
    public static h e;
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final Status f3070b;
    public final boolean c;

    public h(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("google_app_measurement_enable", "integer", resources.getResourcePackageName(i.common_google_play_services_unknown_issue));
        boolean z = false;
        if (identifier != 0) {
            this.c = !(resources.getInteger(identifier) != 0 ? true : z);
        } else {
            this.c = false;
        }
        t0.a(context);
        String str = t0.c;
        if (str == null) {
            q.a(context);
            Resources resources2 = context.getResources();
            int identifier2 = resources2.getIdentifier("google_app_id", "string", resources2.getResourcePackageName(i.common_google_play_services_unknown_issue));
            if (identifier2 == 0) {
                str = null;
            } else {
                str = resources2.getString(identifier2);
            }
        }
        if (TextUtils.isEmpty(str)) {
            this.f3070b = new Status(10, "Missing google app id value from from string resources with name google_app_id.");
            this.a = null;
            return;
        }
        this.a = str;
        this.f3070b = Status.f472i;
    }

    public static Status a(Context context) {
        Status status;
        q.a(context, (Object) "Context must not be null.");
        synchronized (d) {
            if (e == null) {
                e = new h(context);
            }
            status = e.f3070b;
        }
        return status;
    }

    public static boolean b() {
        return a("isMeasurementExplicitlyDisabled").c;
    }

    public static String a() {
        return a("getGoogleAppId").a;
    }

    public static h a(String str) {
        h hVar;
        synchronized (d) {
            if (e != null) {
                hVar = e;
            } else {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34);
                sb.append("Initialize must be called before ");
                sb.append(str);
                sb.append(".");
                throw new IllegalStateException(sb.toString());
            }
        }
        return hVar;
    }
}
