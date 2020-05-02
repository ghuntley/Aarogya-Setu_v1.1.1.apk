package i.c.a.c.p;

import android.app.Dialog;
import android.os.Bundle;
import h.b.k.r;

/* compiled from: BottomSheetDialogFragment */
public class c extends r {
    public void H() {
        e(true);
        super.H();
    }

    public void I() {
        e(false);
        a(false, false);
    }

    public final boolean e(boolean z) {
        Dialog dialog = this.j0;
        if (!(dialog instanceof b)) {
            return false;
        }
        b bVar = (b) dialog;
        if (bVar.f4175g == null) {
            bVar.b();
        }
        boolean z2 = bVar.f4175g.t;
        return false;
    }

    public Dialog f(Bundle bundle) {
        return new b(k(), this.f0);
    }
}
