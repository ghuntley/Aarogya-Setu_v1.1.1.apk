package h.b.p;

import android.annotation.SuppressLint;
import android.view.View;
import h.b.o.i.p;
import h.b.p.w;

/* compiled from: AppCompatSpinner */
public class v extends h0 {

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ w.d f1475n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ w f1476o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v(w wVar, View view, w.d dVar) {
        super(view);
        this.f1476o = wVar;
        this.f1475n = dVar;
    }

    public p b() {
        return this.f1475n;
    }

    @SuppressLint({"SyntheticAccessor"})
    public boolean c() {
        if (this.f1476o.getInternalPopup().b()) {
            return true;
        }
        this.f1476o.a();
        return true;
    }
}
