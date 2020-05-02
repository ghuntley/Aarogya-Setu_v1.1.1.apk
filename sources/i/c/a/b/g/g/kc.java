package i.c.a.b.g.g;

import android.os.Bundle;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.3.0 */
public abstract class kc extends f1 implements nb {
    public kc() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    public final boolean a(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 != 1) {
            return false;
        }
        a((Bundle) q.a(parcel, Bundle.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
