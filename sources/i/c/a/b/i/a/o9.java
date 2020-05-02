package i.c.a.b.i.a;

import android.app.ActivityManager;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import i.c.a.b.d.o.c;
import i.c.a.b.g.g.m8;
import i.c.a.b.g.g.q9;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class o9 {
    public final /* synthetic */ g9 a;

    public o9(g9 g9Var) {
        this.a = g9Var;
    }

    public final void a() {
        if (q9.b() && this.a.a.f3861g.a(o.a0)) {
            this.a.c();
            x4 g2 = this.a.g();
            if (((c) this.a.a.f3868n) == null) {
                throw null;
            } else if (g2.a(System.currentTimeMillis())) {
                this.a.g().r.a(true);
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                ActivityManager.getMyMemoryState(runningAppProcessInfo);
                if (runningAppProcessInfo.importance == 100) {
                    this.a.n().f3766n.a("Detected application was in foreground");
                    if (((c) this.a.a.f3868n) != null) {
                        b(System.currentTimeMillis(), false);
                        return;
                    }
                    throw null;
                }
            }
        }
    }

    public final void b(long j2, boolean z) {
        this.a.c();
        if (q9.b() && this.a.a.f3861g.a(o.a0)) {
            if (this.a.a.b()) {
                this.a.g().v.a(j2);
            } else {
                return;
            }
        }
        Long l2 = null;
        if (((c) this.a.a.f3868n) != null) {
            this.a.n().f3766n.a("Session started, time", Long.valueOf(SystemClock.elapsedRealtime()));
            if (this.a.a.f3861g.a(o.T)) {
                l2 = Long.valueOf(j2 / 1000);
            }
            this.a.p().a("auto", "_sid", (Object) l2, j2);
            this.a.g().r.a(false);
            Bundle bundle = new Bundle();
            if (this.a.a.f3861g.a(o.T)) {
                bundle.putLong("_sid", l2.longValue());
            }
            if (this.a.a.f3861g.a(o.K0) && z) {
                bundle.putLong("_aib", 1);
            }
            this.a.p().a("auto", "_s", j2, bundle);
            if (m8.b() && this.a.a.f3861g.a(o.R0)) {
                String a2 = this.a.g().B.a();
                if (!TextUtils.isEmpty(a2)) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("_ffr", a2);
                    this.a.p().a("auto", "_ssr", j2, bundle2);
                }
            }
            if (!q9.b() || !this.a.a.f3861g.a(o.a0)) {
                this.a.g().v.a(j2);
                return;
            }
            return;
        }
        throw null;
    }

    public final void a(long j2, boolean z) {
        this.a.c();
        this.a.A();
        if (this.a.g().a(j2)) {
            this.a.g().r.a(true);
            this.a.g().w.a(0);
        }
        if (z && this.a.a.f3861g.a(o.V)) {
            this.a.g().v.a(j2);
        }
        if (this.a.g().r.a()) {
            b(j2, z);
        }
    }
}
