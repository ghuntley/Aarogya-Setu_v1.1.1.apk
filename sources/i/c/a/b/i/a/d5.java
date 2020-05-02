package i.c.a.b.i.a;

import android.content.SharedPreferences;
import i.c.a.b.d.l.q;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class d5 {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final long f3640b;
    public boolean c;
    public long d;
    public final /* synthetic */ x4 e;

    public d5(x4 x4Var, String str, long j2) {
        this.e = x4Var;
        q.b(str);
        this.a = str;
        this.f3640b = j2;
    }

    public final long a() {
        if (!this.c) {
            this.c = true;
            this.d = this.e.t().getLong(this.a, this.f3640b);
        }
        return this.d;
    }

    public final void a(long j2) {
        SharedPreferences.Editor edit = this.e.t().edit();
        edit.putLong(this.a, j2);
        edit.apply();
        this.d = j2;
    }
}
