package i.c.a.b.i.a;

import android.content.SharedPreferences;
import i.c.a.b.d.l.q;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class f5 {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f3666b;
    public String c;
    public final /* synthetic */ x4 d;

    public f5(x4 x4Var, String str) {
        this.d = x4Var;
        q.b(str);
        this.a = str;
    }

    public final String a() {
        if (!this.f3666b) {
            this.f3666b = true;
            this.c = this.d.t().getString(this.a, (String) null);
        }
        return this.c;
    }

    public final void a(String str) {
        if (this.d.a.f3861g.a(o.T0) || !ca.c(str, this.c)) {
            SharedPreferences.Editor edit = this.d.t().edit();
            edit.putString(this.a, str);
            edit.apply();
            this.c = str;
        }
    }
}
