package i.c.a.b.h;

import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import i.c.a.b.g.f.r;
import i.c.a.b.g.f.z;

public abstract class g0 extends r implements f0 {
    public static f0 a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
        return queryLocalInterface instanceof f0 ? (f0) queryLocalInterface : new h0(iBinder);
    }

    public final boolean a(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 != 1) {
            return false;
        }
        a((Location) z.a(parcel, Location.CREATOR));
        return true;
    }
}
