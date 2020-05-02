package b.a.a.a;

import android.content.Context;
import android.text.TextUtils;
import android.widget.ProgressBar;
import android.widget.Toast;
import b.a.a.e;
import b.a.a.k.a;
import b.a.a.l.b;
import b.a.a.l.h;
import n.m.c.f;
import nic.goi.aarogyasetu.CoronaApplication;
import nic.goi.aarogyasetu.R;
import nic.goi.aarogyasetu.views.MainActivity;

/* compiled from: MainActivity.kt */
public final class l0 implements MainActivity.b {
    public final /* synthetic */ m0 a;

    public l0(m0 m0Var) {
        this.a = m0Var;
    }

    public void a() {
        if (!this.a.a.isFinishing()) {
            ProgressBar progressBar = (ProgressBar) this.a.a.c(e.progress_bar);
            f.a((Object) progressBar, "progress_bar");
            progressBar.setVisibility(8);
        }
        if (!TextUtils.isEmpty(a.a((Context) CoronaApplication.f5224g, "unique_id", ""))) {
            MainActivity.f(this.a.a);
        }
        b.a();
    }

    public void b() {
        if (!this.a.a.isFinishing()) {
            ProgressBar progressBar = (ProgressBar) this.a.a.c(e.progress_bar);
            f.a((Object) progressBar, "progress_bar");
            progressBar.setVisibility(8);
            Toast.makeText(CoronaApplication.f5224g, i.c.d.p.e.a((Context) this.a.a, (int) R.string.login_failed), 0).show();
        }
        h.a((Context) this.a.a, false);
    }
}
