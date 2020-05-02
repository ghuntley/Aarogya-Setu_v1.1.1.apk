package i.c.d.k;

import android.os.Bundle;
import com.google.firebase.iid.zzap;

/* compiled from: com.google.firebase:firebase-iid@@20.1.2 */
public final class q extends p<Void> {
    public q(int i2, Bundle bundle) {
        super(i2, 2, bundle);
    }

    public final void a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            a(null);
        } else {
            a(new zzap(4, "Invalid response to one way request"));
        }
    }

    public final boolean a() {
        return true;
    }
}
