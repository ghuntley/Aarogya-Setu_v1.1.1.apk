package i.c.a.b.g.g;

import android.os.Bundle;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.3.0 */
public abstract class lc extends f1 implements mc {
    public lc() {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    public final boolean a(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 == 1) {
            a(parcel.readString(), parcel.readString(), (Bundle) q.a(parcel, Bundle.CREATOR), parcel.readLong());
            parcel2.writeNoException();
        } else if (i2 != 2) {
            return false;
        } else {
            int a = a();
            parcel2.writeNoException();
            parcel2.writeInt(a);
        }
        return true;
    }
}
