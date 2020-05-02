package i.c.a.b.h;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import i.c.a.b.g.f.r;
import i.c.a.b.g.f.z;

public abstract class d0 extends r implements c0 {
    public d0() {
        super("com.google.android.gms.location.ILocationCallback");
    }

    public static c0 a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
        return queryLocalInterface instanceof c0 ? (c0) queryLocalInterface : new e0(iBinder);
    }

    public final boolean a(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 == 1) {
            a((LocationResult) z.a(parcel, LocationResult.CREATOR));
        } else if (i2 != 2) {
            return false;
        } else {
            a((LocationAvailability) z.a(parcel, LocationAvailability.CREATOR));
        }
        return true;
    }
}
