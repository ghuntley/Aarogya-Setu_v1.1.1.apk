package i.c.a.b.i.a;

import android.content.SharedPreferences;
import i.c.a.b.d.l.q;
import i.c.a.b.d.o.c;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class b5 {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3594b;
    public final String c;
    public final long d;
    public final /* synthetic */ x4 e;

    public /* synthetic */ b5(x4 x4Var, String str, long j2, a5 a5Var) {
        this.e = x4Var;
        q.b(str);
        q.a(j2 > 0);
        this.a = String.valueOf(str).concat(":start");
        this.f3594b = String.valueOf(str).concat(":count");
        this.c = String.valueOf(str).concat(":value");
        this.d = j2;
    }

    public final void a() {
        this.e.c();
        if (((c) this.e.a.f3868n) != null) {
            long currentTimeMillis = System.currentTimeMillis();
            SharedPreferences.Editor edit = this.e.t().edit();
            edit.remove(this.f3594b);
            edit.remove(this.c);
            edit.putLong(this.a, currentTimeMillis);
            edit.apply();
            return;
        }
        throw null;
    }
}
