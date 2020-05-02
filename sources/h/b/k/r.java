package h.b.k;

import android.app.Dialog;
import h.l.d.c;

/* compiled from: AppCompatDialogFragment */
public class r extends c {
    public void a(Dialog dialog, int i2) {
        if (dialog instanceof q) {
            q qVar = (q) dialog;
            if (!(i2 == 1 || i2 == 2)) {
                if (i2 == 3) {
                    dialog.getWindow().addFlags(24);
                } else {
                    return;
                }
            }
            qVar.a(1);
            return;
        }
        super.a(dialog, i2);
    }
}
