package defpackage;

import android.view.View;
import b.a.a.a.b0;
import b.a.a.m.b;
import n.m.c.f;

/* renamed from: c  reason: default package */
/* compiled from: java-style lambda group */
public final class c implements View.OnClickListener {
    public final /* synthetic */ int e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f442f;

    public c(int i2, Object obj) {
        this.e = i2;
        this.f442f = obj;
    }

    public final void onClick(View view) {
        int i2 = this.e;
        if (i2 == 0) {
            b bVar = ((b0) this.f442f).o0;
            if (bVar != null) {
                bVar.d.b(true);
            } else {
                f.b("onBoardingViewModel");
                throw null;
            }
        } else if (i2 == 1) {
            ((b0) this.f442f).H();
        } else {
            throw null;
        }
    }
}
