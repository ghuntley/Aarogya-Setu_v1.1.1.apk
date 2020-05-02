package b.a.a.a;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import b.a.a.k.a;
import b.a.a.l.h;
import nic.goi.aarogyasetu.CoronaApplication;
import nic.goi.aarogyasetu.views.MainActivity;

/* compiled from: MainActivity.kt */
public final class i0 implements View.OnClickListener {
    public final /* synthetic */ j0 e;

    public i0(j0 j0Var) {
        this.e = j0Var;
    }

    public final void onClick(View view) {
        String a = a.a((Context) CoronaApplication.f5224g, "unique_id", "");
        if (!h.c.a() || TextUtils.isEmpty(a)) {
            this.e.a.o();
        } else {
            MainActivity.f(this.e.a);
        }
    }
}
