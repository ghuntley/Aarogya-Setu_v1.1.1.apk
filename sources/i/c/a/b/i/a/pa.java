package i.c.a.b.i.a;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import i.c.a.b.d.l.q;
import i.c.a.b.d.o.e;
import i.c.a.b.d.p.c;
import i.c.a.b.g.g.t7;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class pa extends k6 {

    /* renamed from: b  reason: collision with root package name */
    public Boolean f3842b;
    public ra c = b.a;
    public Boolean d;

    public pa(s5 s5Var) {
        super(s5Var);
    }

    public static long v() {
        return o.D.a(null).longValue();
    }

    public static long w() {
        return o.d.a(null).longValue();
    }

    public final int a(String str) {
        if (!t7.b() || !d((String) null, o.g1)) {
            return 500;
        }
        return Math.max(Math.min(b(str, o.H), RecyclerView.MAX_SCROLL_DURATION), 500);
    }

    public final int b(String str) {
        return b(str, o.f3811o);
    }

    public final double c(String str, f4<Double> f4Var) {
        if (str == null) {
            return f4Var.a(null).doubleValue();
        }
        String a = this.c.a(str, f4Var.a);
        if (TextUtils.isEmpty(a)) {
            return f4Var.a(null).doubleValue();
        }
        try {
            return f4Var.a(Double.valueOf(Double.parseDouble(a))).doubleValue();
        } catch (NumberFormatException unused) {
            return f4Var.a(null).doubleValue();
        }
    }

    public final boolean d(String str, f4<Boolean> f4Var) {
        if (str == null) {
            return f4Var.a(null).booleanValue();
        }
        String a = this.c.a(str, f4Var.a);
        if (TextUtils.isEmpty(a)) {
            return f4Var.a(null).booleanValue();
        }
        return f4Var.a(Boolean.valueOf(Boolean.parseBoolean(a))).booleanValue();
    }

    public final boolean e(String str, f4<Boolean> f4Var) {
        return d(str, f4Var);
    }

    public final int m() {
        if (!t7.b() || !this.a.f3861g.d((String) null, o.h1) || f().v() < 2147483) {
            return 25;
        }
        return 100;
    }

    public final long o() {
        oa oaVar = this.a.f3860f;
        return 25001;
    }

    public final boolean p() {
        if (this.d == null) {
            synchronized (this) {
                if (this.d == null) {
                    ApplicationInfo applicationInfo = this.a.a.getApplicationInfo();
                    String a = e.a();
                    if (applicationInfo != null) {
                        String str = applicationInfo.processName;
                        this.d = Boolean.valueOf(str != null && str.equals(a));
                    }
                    if (this.d == null) {
                        this.d = Boolean.TRUE;
                        n().f3758f.a("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.d.booleanValue();
    }

    public final boolean q() {
        oa oaVar = this.a.f3860f;
        Boolean c2 = c("firebase_analytics_collection_deactivated");
        return c2 != null && c2.booleanValue();
    }

    public final Boolean r() {
        oa oaVar = this.a.f3860f;
        return c("firebase_analytics_collection_enabled");
    }

    public final Boolean s() {
        a();
        Boolean c2 = c("google_analytics_adid_collection_enabled");
        return Boolean.valueOf(c2 == null || c2.booleanValue());
    }

    public final boolean t() {
        if (this.f3842b == null) {
            Boolean c2 = c("app_measurement_lite");
            this.f3842b = c2;
            if (c2 == null) {
                this.f3842b = false;
            }
        }
        if (this.f3842b.booleanValue() || !this.a.e) {
            return true;
        }
        return false;
    }

    public final Bundle u() {
        try {
            if (this.a.a.getPackageManager() == null) {
                n().f3758f.a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo a = c.b(this.a.a).a(this.a.a.getPackageName(), 128);
            if (a != null) {
                return a.metaData;
            }
            n().f3758f.a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            n().f3758f.a("Failed to load metadata: Package name not found", e);
            return null;
        }
    }

    public final int b(String str, f4<Integer> f4Var) {
        if (str == null) {
            return f4Var.a(null).intValue();
        }
        String a = this.c.a(str, f4Var.a);
        if (TextUtils.isEmpty(a)) {
            return f4Var.a(null).intValue();
        }
        try {
            return f4Var.a(Integer.valueOf(Integer.parseInt(a))).intValue();
        } catch (NumberFormatException unused) {
            return f4Var.a(null).intValue();
        }
    }

    public final long a(String str, f4<Long> f4Var) {
        if (str == null) {
            return f4Var.a(null).longValue();
        }
        String a = this.c.a(str, f4Var.a);
        if (TextUtils.isEmpty(a)) {
            return f4Var.a(null).longValue();
        }
        try {
            return f4Var.a(Long.valueOf(Long.parseLong(a))).longValue();
        } catch (NumberFormatException unused) {
            return f4Var.a(null).longValue();
        }
    }

    public final boolean d(String str) {
        return "1".equals(this.c.a(str, "measurement.event_sampling_enabled"));
    }

    public final Boolean c(String str) {
        q.b(str);
        Bundle u = u();
        if (u == null) {
            n().f3758f.a("Failed to load metadata: Metadata bundle is null");
            return null;
        } else if (!u.containsKey(str)) {
            return null;
        } else {
            return Boolean.valueOf(u.getBoolean(str));
        }
    }

    public final int a(String str, f4<Integer> f4Var, int i2, int i3) {
        return Math.max(Math.min(b(str, f4Var), i3), i2);
    }

    public final boolean a(f4<Boolean> f4Var) {
        return d((String) null, f4Var);
    }

    public final String a(String str, String str2) {
        Class<String> cls = String.class;
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{cls, cls}).invoke((Object) null, new Object[]{str, str2});
        } catch (ClassNotFoundException e) {
            n().f3758f.a("Could not find SystemProperties class", e);
            return str2;
        } catch (NoSuchMethodException e2) {
            n().f3758f.a("Could not find SystemProperties.get() method", e2);
            return str2;
        } catch (IllegalAccessException e3) {
            n().f3758f.a("Could not access SystemProperties.get()", e3);
            return str2;
        } catch (InvocationTargetException e4) {
            n().f3758f.a("SystemProperties.get() threw an exception", e4);
            return str2;
        }
    }
}
