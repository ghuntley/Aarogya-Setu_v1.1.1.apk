package i.c.a.b.i.a;

import android.text.TextUtils;
import i.c.a.b.g.g.x9;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
public final class f6 implements Runnable {
    public final /* synthetic */ m e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ String f3667f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ t5 f3668g;

    public f6(t5 t5Var, m mVar, String str) {
        this.f3668g = t5Var;
        this.e = mVar;
        this.f3667f = str;
    }

    public final void run() {
        t9 t9Var;
        String str;
        this.f3668g.a.o();
        t9 t9Var2 = this.f3668g.a;
        m mVar = this.e;
        String str2 = this.f3667f;
        c5 b2 = t9Var2.d().b(str2);
        if (b2 == null || TextUtils.isEmpty(b2.p())) {
            t9Var2.f3896i.n().f3765m.a("No app data available; dropping event", str2);
            return;
        }
        Boolean b3 = t9Var2.b(b2);
        if (b3 == null) {
            if (!"_ui".equals(mVar.e)) {
                t9Var2.f3896i.n().f3761i.a("Could not find package. appId", m4.a(str2));
            }
        } else if (!b3.booleanValue()) {
            t9Var2.f3896i.n().f3758f.a("App version does not match; dropping event. appId", m4.a(str2));
            return;
        }
        String i2 = b2.i();
        String p2 = b2.p();
        long q2 = b2.q();
        String r = b2.r();
        long s = b2.s();
        long t = b2.t();
        boolean v = b2.v();
        String m2 = b2.m();
        long b4 = b2.b();
        boolean c = b2.c();
        boolean d = b2.d();
        String j2 = b2.j();
        Boolean e2 = b2.e();
        long u = b2.u();
        List<String> f2 = b2.f();
        if (x9.b()) {
            t9Var = t9Var2;
            if (t9Var2.f3896i.f3861g.d(b2.g(), o.I0)) {
                str = b2.k();
                ea eaVar = r3;
                ea eaVar2 = new ea(str2, i2, p2, q2, r, s, t, (String) null, v, false, m2, b4, 0, 0, c, d, false, j2, e2, u, f2, str);
                t9Var.a(mVar, eaVar);
            }
        } else {
            t9Var = t9Var2;
        }
        str = null;
        ea eaVar3 = eaVar2;
        ea eaVar22 = new ea(str2, i2, p2, q2, r, s, t, (String) null, v, false, m2, b4, 0, 0, c, d, false, j2, e2, u, f2, str);
        t9Var.a(mVar, eaVar3);
    }
}
