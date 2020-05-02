package b.a.a.a;

import android.widget.Button;
import android.widget.Toast;
import b.a.a.e;
import h.o.s;
import n.m.c.f;
import nic.goi.aarogyasetu.CoronaApplication;
import nic.goi.aarogyasetu.views.MainActivity;

/* compiled from: MainActivity.kt */
public final class j0<T> implements s<Boolean> {
    public final /* synthetic */ MainActivity a;

    public j0(MainActivity mainActivity) {
        this.a = mainActivity;
    }

    public void a(Object obj) {
        Boolean bool = (Boolean) obj;
        Button button = (Button) this.a.c(e.btn_start);
        f.a((Object) button, "btn_start");
        f.a((Object) bool, "it");
        button.setEnabled(bool.booleanValue());
        if (bool.booleanValue()) {
            ((Button) this.a.c(e.btn_start)).setOnClickListener(new i0(this));
        } else if (this.a != null) {
            Toast.makeText(CoronaApplication.f5224g, "You are already contributing", 1).show();
        } else {
            throw null;
        }
    }
}
