package i.c.a.b.h;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import i.c.a.b.g.f.r;

public class a0 extends r implements z {
    public static z a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.IDeviceOrientationListener");
        return queryLocalInterface instanceof z ? (z) queryLocalInterface : new b0(iBinder);
    }

    public final boolean a(int i2, Parcel parcel, Parcel parcel2, int i3) {
        throw new NoSuchMethodError();
    }
}
