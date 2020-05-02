package i.c.a.b.i.a;

import android.content.SharedPreferences;
import i.c.a.b.d.l.q;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class z4 {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f3968b;
    public boolean c;
    public boolean d;
    public final /* synthetic */ x4 e;

    public z4(x4 x4Var, String str, boolean z) {
        this.e = x4Var;
        q.b(str);
        this.a = str;
        this.f3968b = z;
    }

    public final boolean a() {
        if (!this.c) {
            this.c = true;
            this.d = this.e.t().getBoolean(this.a, this.f3968b);
        }
        return this.d;
    }

    public final void a(boolean z) {
        SharedPreferences.Editor edit = this.e.t().edit();
        edit.putBoolean(this.a, z);
        edit.apply();
        this.d = z;
    }
}
