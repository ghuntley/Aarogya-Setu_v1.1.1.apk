package i.c.a.b.i.a;

import android.content.SharedPreferences;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class m7 implements Runnable {
    public final /* synthetic */ boolean e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ t6 f3774f;

    public m7(t6 t6Var, boolean z) {
        this.f3774f = t6Var;
        this.e = z;
    }

    public final void run() {
        t6 t6Var = this.f3774f;
        boolean z = this.e;
        t6Var.c();
        t6Var.a();
        t6Var.w();
        t6Var.n().f3765m.a("Setting app measurement enabled (FE)", Boolean.valueOf(z));
        x4 g2 = t6Var.g();
        g2.c();
        SharedPreferences.Editor edit = g2.t().edit();
        edit.putBoolean("measurement_enabled", z);
        edit.apply();
        t6Var.C();
    }
}
