package i.c.a.b.h;

import android.location.Location;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import i.c.a.b.g.f.a;
import i.c.a.b.g.f.z;

public final class h0 extends a implements f0 {
    public h0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.ILocationListener");
    }

    public final void a(Location location) {
        Parcel g2 = g();
        z.a(g2, (Parcelable) location);
        b(1, g2);
    }
}
