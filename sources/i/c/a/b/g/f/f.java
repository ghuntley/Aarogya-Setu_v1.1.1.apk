package i.c.a.b.g.f;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

public final class f extends a implements d {
    public f(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IFusedLocationProviderCallback");
    }

    public final void a(b bVar) {
        Parcel g2 = g();
        z.a(g2, (Parcelable) bVar);
        b(1, g2);
    }
}
