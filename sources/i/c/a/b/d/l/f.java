package i.c.a.b.d.l;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.util.Log;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public abstract class f implements DialogInterface.OnClickListener {
    public abstract void a();

    public void onClick(DialogInterface dialogInterface, int i2) {
        try {
            a();
        } catch (ActivityNotFoundException e) {
            Log.e("DialogRedirect", "Failed to start resolution intent", e);
        } finally {
            dialogInterface.dismiss();
        }
    }
}
