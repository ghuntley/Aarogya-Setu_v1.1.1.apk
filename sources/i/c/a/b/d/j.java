package i.c.a.b.d;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import h.l.d.c;
import h.l.d.r;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public class j extends c {
    public Dialog n0 = null;
    public DialogInterface.OnCancelListener o0 = null;

    public void a(r rVar, String str) {
        super.a(rVar, str);
    }

    public Dialog f(Bundle bundle) {
        if (this.n0 == null) {
            this.h0 = false;
        }
        return this.n0;
    }

    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.o0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
