package i.c.d.k;

import android.os.Bundle;

/* compiled from: com.google.firebase:firebase-iid@@20.1.2 */
public final class r extends p<Bundle> {
    public r(int i2, Bundle bundle) {
        super(i2, 1, bundle);
    }

    public final void a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("data");
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        a(bundle2);
    }

    public final boolean a() {
        return false;
    }
}
