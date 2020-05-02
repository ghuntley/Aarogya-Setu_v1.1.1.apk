package i.c.a.b.i.a;

import android.os.Bundle;
import h.e.a;
import i.c.a.b.d.l.q;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class z extends c4 {

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, Long> f3967b = new a();
    public final Map<String, Integer> c = new a();
    public long d;

    public z(s5 s5Var) {
        super(s5Var);
    }

    public final void a(String str, long j2) {
        if (str == null || str.length() == 0) {
            n().f3758f.a("Ad unit id must be a non-empty string");
            return;
        }
        m5 k2 = k();
        a aVar = new a(this, str, j2);
        k2.o();
        q.a(aVar);
        k2.a((q5<?>) new q5(k2, aVar, "Task exception on worker thread"));
    }

    public final void b(String str, long j2) {
        if (str == null || str.length() == 0) {
            n().f3758f.a("Ad unit id must be a non-empty string");
            return;
        }
        m5 k2 = k();
        b2 b2Var = new b2(this, str, j2);
        k2.o();
        q.a(b2Var);
        k2.a((q5<?>) new q5(k2, b2Var, "Task exception on worker thread"));
    }

    public final void a(long j2, w7 w7Var) {
        if (w7Var == null) {
            n().f3766n.a("Not logging ad exposure. No active activity");
        } else if (j2 < 1000) {
            n().f3766n.a("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j2));
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j2);
            y7.a(w7Var, bundle, true);
            p().a("am", "_xa", bundle);
        }
    }

    public final void b(long j2) {
        for (String put : this.f3967b.keySet()) {
            this.f3967b.put(put, Long.valueOf(j2));
        }
        if (!this.f3967b.isEmpty()) {
            this.d = j2;
        }
    }

    public final void a(String str, long j2, w7 w7Var) {
        if (w7Var == null) {
            n().f3766n.a("Not logging ad unit exposure. No active activity");
        } else if (j2 < 1000) {
            n().f3766n.a("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j2));
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j2);
            y7.a(w7Var, bundle, true);
            p().a("am", "_xu", bundle);
        }
    }

    public final void a(long j2) {
        w7 z = s().z();
        for (String next : this.f3967b.keySet()) {
            a(next, j2 - this.f3967b.get(next).longValue(), z);
        }
        if (!this.f3967b.isEmpty()) {
            a(j2 - this.d, z);
        }
        b(j2);
    }
}
