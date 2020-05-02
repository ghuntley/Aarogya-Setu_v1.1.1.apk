package i.c.a.b.d;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public class c extends DialogFragment {
    public Dialog e = null;

    /* renamed from: f  reason: collision with root package name */
    public DialogInterface.OnCancelListener f3018f = null;

    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f3018f;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        if (this.e == null) {
            setShowsDialog(false);
        }
        return this.e;
    }

    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
