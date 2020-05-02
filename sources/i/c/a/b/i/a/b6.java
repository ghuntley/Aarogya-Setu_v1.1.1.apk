package i.c.a.b.i.a;

import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
public final class b6 implements Runnable {
    public final /* synthetic */ m e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ ea f3595f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ t5 f3596g;

    public b6(t5 t5Var, m mVar, ea eaVar) {
        this.f3596g = t5Var;
        this.e = mVar;
        this.f3595f = eaVar;
    }

    public final void run() {
        l lVar;
        t5 t5Var = this.f3596g;
        m mVar = this.e;
        ea eaVar = this.f3595f;
        if (t5Var != null) {
            boolean z = false;
            if (!(!"_cmp".equals(mVar.e) || (lVar = mVar.f3755f) == null || lVar.e.size() == 0)) {
                String string = mVar.f3755f.e.getString("_cis");
                if (!TextUtils.isEmpty(string) && (("referrer broadcast".equals(string) || "referrer API".equals(string)) && t5Var.a.f3896i.f3861g.d(eaVar.e, o.S))) {
                    z = true;
                }
            }
            if (z) {
                t5Var.a.n().f3764l.a("Event has been filtered ", mVar.toString());
                mVar = new m("_cmpx", mVar.f3755f, mVar.f3756g, mVar.f3757h);
            }
            this.f3596g.a.o();
            this.f3596g.a.a(mVar, this.f3595f);
            return;
        }
        throw null;
    }
}
