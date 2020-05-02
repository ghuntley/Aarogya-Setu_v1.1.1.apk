package i.c.a.b.i.a;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import com.crashlytics.android.core.DefaultAppMeasurementEventListenerRegistrar;
import i.c.a.b.d.l.q;
import i.c.a.b.d.o.c;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class y7 extends c3 {
    public w7 c;
    public volatile w7 d;
    public w7 e;

    /* renamed from: f  reason: collision with root package name */
    public final Map<Activity, w7> f3965f = new ConcurrentHashMap();

    /* renamed from: g  reason: collision with root package name */
    public String f3966g;

    public y7(s5 s5Var) {
        super(s5Var);
    }

    public final void a(Activity activity, String str, String str2) {
        if (this.d == null) {
            n().f3763k.a("setCurrentScreen cannot be called while no activity active");
        } else if (this.f3965f.get(activity) == null) {
            n().f3763k.a("setCurrentScreen must be called with an activity in the activity lifecycle");
        } else {
            if (str2 == null) {
                str2 = a(activity.getClass().getCanonicalName());
            }
            boolean equals = this.d.f3927b.equals(str2);
            boolean c2 = ca.c(this.d.a, str);
            if (equals && c2) {
                n().f3763k.a("setCurrentScreen cannot be called with the same class and name");
            } else if (str != null && (str.length() <= 0 || str.length() > 100)) {
                n().f3763k.a("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
            } else if (str2 == null || (str2.length() > 0 && str2.length() <= 100)) {
                n().f3766n.a("Setting current screen to name, class", str == null ? "null" : str, str2);
                w7 w7Var = new w7(str, str2, f().t());
                this.f3965f.put(activity, w7Var);
                a(activity, w7Var, true);
            } else {
                n().f3763k.a("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str2.length()));
            }
        }
    }

    public final w7 b(Activity activity) {
        q.a(activity);
        w7 w7Var = this.f3965f.get(activity);
        if (w7Var != null) {
            return w7Var;
        }
        w7 w7Var2 = new w7((String) null, a(activity.getClass().getCanonicalName()), f().t());
        this.f3965f.put(activity, w7Var2);
        return w7Var2;
    }

    public final boolean y() {
        return false;
    }

    public final w7 z() {
        w();
        c();
        return this.c;
    }

    public final void a(Activity activity, w7 w7Var, boolean z) {
        w7 w7Var2 = this.d == null ? this.e : this.d;
        w7 w7Var3 = w7Var.f3927b == null ? new w7(w7Var.a, a(activity.getClass().getCanonicalName()), w7Var.c) : w7Var;
        this.e = this.d;
        this.d = w7Var3;
        if (((c) this.a.f3868n) != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            m5 k2 = k();
            x7 x7Var = new x7(this, z, elapsedRealtime, w7Var2, w7Var3);
            k2.o();
            q.a(x7Var);
            k2.a((q5<?>) new q5(k2, x7Var, "Task exception on worker thread"));
            return;
        }
        throw null;
    }

    public static /* synthetic */ void a(y7 y7Var, w7 w7Var, boolean z, long j2) {
        z o2 = y7Var.o();
        if (((c) y7Var.a.f3868n) != null) {
            o2.a(SystemClock.elapsedRealtime());
            g9 u = y7Var.u();
            if (u.e.a(w7Var.d, z, j2)) {
                w7Var.d = false;
                return;
            }
            return;
        }
        throw null;
    }

    public static void a(w7 w7Var, Bundle bundle, boolean z) {
        if (bundle != null && w7Var != null && (!bundle.containsKey("_sc") || z)) {
            String str = w7Var.a;
            if (str != null) {
                bundle.putString("_sn", str);
            } else {
                bundle.remove("_sn");
            }
            bundle.putString("_sc", w7Var.f3927b);
            bundle.putLong("_si", w7Var.c);
        } else if (bundle != null && w7Var == null && z) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    public final void a(String str, w7 w7Var) {
        c();
        synchronized (this) {
            if (this.f3966g == null || this.f3966g.equals(str) || w7Var != null) {
                this.f3966g = str;
            }
        }
    }

    public static String a(String str) {
        String[] split = str.split("\\.");
        String str2 = split.length > 0 ? split[split.length - 1] : "";
        return str2.length() > 100 ? str2.substring(0, 100) : str2;
    }

    public final void a(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (bundle != null && (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) != null) {
            this.f3965f.put(activity, new w7(bundle2.getString(DefaultAppMeasurementEventListenerRegistrar.NAME), bundle2.getString("referrer_name"), bundle2.getLong("id")));
        }
    }

    public final void a(Activity activity) {
        a(activity, b(activity), false);
        z o2 = o();
        if (((c) o2.a.f3868n) != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            m5 k2 = o2.k();
            a1 a1Var = new a1(o2, elapsedRealtime);
            k2.o();
            q.a(a1Var);
            k2.a((q5<?>) new q5(k2, a1Var, "Task exception on worker thread"));
            return;
        }
        throw null;
    }
}
