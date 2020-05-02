package i.c.a.b.h;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import i.c.a.b.g.f.a;
import i.c.a.b.g.f.z;

public final class e0 extends a implements c0 {
    public e0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.ILocationCallback");
    }

    public final void a(LocationAvailability locationAvailability) {
        Parcel g2 = g();
        z.a(g2, (Parcelable) locationAvailability);
        b(2, g2);
    }

    public final void a(LocationResult locationResult) {
        Parcel g2 = g();
        z.a(g2, (Parcelable) locationResult);
        b(1, g2);
    }
}
