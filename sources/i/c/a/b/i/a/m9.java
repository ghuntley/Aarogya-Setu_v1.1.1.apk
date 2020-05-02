package i.c.a.b.i.a;

import android.os.Bundle;
import android.os.SystemClock;
import i.c.a.b.d.o.c;
import i.c.a.b.g.g.b9;
import i.c.a.b.g.g.q9;
import i.c.a.b.g.g.y8;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class m9 {
    public long a;

    /* renamed from: b  reason: collision with root package name */
    public long f3780b;
    public final f c = new l9(this, this.d.a);
    public final /* synthetic */ g9 d;

    public m9(g9 g9Var) {
        this.d = g9Var;
        if (((c) g9Var.a.f3868n) != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.a = elapsedRealtime;
            this.f3780b = elapsedRealtime;
            return;
        }
        throw null;
    }

    public final boolean a(boolean z, boolean z2, long j2) {
        this.d.c();
        this.d.w();
        if (!((b9) y8.f3541f.a()).a() || !this.d.a.f3861g.a(o.W0)) {
            if (((c) this.d.a.f3868n) != null) {
                j2 = SystemClock.elapsedRealtime();
            } else {
                throw null;
            }
        }
        if (!q9.b() || !this.d.a.f3861g.a(o.S0) || this.d.a.b()) {
            d5 d5Var = this.d.g().v;
            if (((c) this.d.a.f3868n) != null) {
                d5Var.a(System.currentTimeMillis());
            } else {
                throw null;
            }
        }
        long j3 = j2 - this.a;
        if (z || j3 >= 1000) {
            if (this.d.a.f3861g.a(o.c0) && !z2) {
                j3 = a();
            }
            this.d.g().w.a(j3);
            this.d.n().f3766n.a("Recording user engagement, ms", Long.valueOf(j3));
            Bundle bundle = new Bundle();
            bundle.putLong("_et", j3);
            y7.a(this.d.s().z(), bundle, true);
            if (this.d.a.f3861g.a(o.c0) && !this.d.a.f3861g.a(o.d0) && z2) {
                bundle.putLong("_fr", 1);
            }
            if (!this.d.a.f3861g.a(o.d0) || !z2) {
                this.d.p().a("auto", "_e", bundle);
            }
            this.a = j2;
            this.c.b();
            this.c.a(Math.max(0, 3600000 - this.d.g().w.a()));
            return true;
        }
        this.d.n().f3766n.a("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j3));
        return false;
    }

    public final long a() {
        if (((c) this.d.a.f3868n) != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j2 = elapsedRealtime - this.f3780b;
            this.f3780b = elapsedRealtime;
            return j2;
        }
        throw null;
    }
}
