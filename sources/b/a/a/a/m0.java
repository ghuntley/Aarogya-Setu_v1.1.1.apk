package b.a.a.a;

import android.widget.ProgressBar;
import b.a.a.e;
import b.a.a.l.o;
import b.a.a.l.t;
import b.a.a.l.x;
import h.o.s;
import n.m.c.f;
import nic.goi.aarogyasetu.views.MainActivity;

/* compiled from: MainActivity.kt */
public final class m0<T> implements s<Boolean> {
    public final /* synthetic */ MainActivity a;

    public m0(MainActivity mainActivity) {
        this.a = mainActivity;
    }

    public void a(Object obj) {
        Boolean bool = (Boolean) obj;
        f.a((Object) bool, "it");
        if (bool.booleanValue()) {
            l0 l0Var = new l0(this);
            ((ProgressBar) this.a.c(e.progress_bar)).setOnClickListener(k0.e);
            ProgressBar progressBar = (ProgressBar) this.a.c(e.progress_bar);
            f.a((Object) progressBar, "progress_bar");
            progressBar.setVisibility(0);
            o.a aVar = o.f436b;
            MainActivity mainActivity = this.a;
            if (mainActivity != null) {
                x.a().execute(new t(mainActivity, l0Var));
            } else {
                f.a("context");
                throw null;
            }
        }
    }
}
