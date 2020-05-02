package i.c.a.b.d.k.h;

import android.util.Log;
import com.google.android.gms.common.api.Scope;
import i.c.a.b.d.b;
import i.c.a.b.d.k.h.g;
import i.c.a.b.d.l.t;
import i.c.a.b.j.b.l;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class i0 implements Runnable {
    public final /* synthetic */ l e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ g0 f3071f;

    public i0(g0 g0Var, l lVar) {
        this.f3071f = g0Var;
        this.e = lVar;
    }

    public final void run() {
        g0 g0Var = this.f3071f;
        l lVar = this.e;
        if (g0Var != null) {
            b bVar = lVar.f3988f;
            if (bVar.d()) {
                t tVar = lVar.f3989g;
                b bVar2 = tVar.f3148g;
                if (!bVar2.d()) {
                    String valueOf = String.valueOf(bVar2);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 48);
                    sb.append("Sign-in succeeded with resolve account failure: ");
                    sb.append(valueOf);
                    Log.wtf("SignInCoordinator", sb.toString(), new Exception());
                    ((g.b) g0Var.f3069g).b(bVar2);
                    g0Var.f3068f.f();
                    return;
                }
                h0 h0Var = g0Var.f3069g;
                i.c.a.b.d.l.l d = tVar.d();
                Set<Scope> set = g0Var.d;
                g.b bVar3 = (g.b) h0Var;
                if (bVar3 == null) {
                    throw null;
                } else if (d == null || set == null) {
                    Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                    bVar3.b(new b(4));
                } else {
                    bVar3.c = d;
                    bVar3.d = set;
                    if (bVar3.e) {
                        bVar3.a.a(d, set);
                    }
                }
            } else {
                ((g.b) g0Var.f3069g).b(bVar);
            }
            g0Var.f3068f.f();
            return;
        }
        throw null;
    }
}
