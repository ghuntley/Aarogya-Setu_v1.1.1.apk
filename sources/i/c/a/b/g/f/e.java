package i.c.a.b.g.f;

import android.os.Parcel;

public abstract class e extends r implements d {
    public e() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
    }

    public final boolean a(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 != 1) {
            return false;
        }
        a((b) z.a(parcel, b.CREATOR));
        return true;
    }
}
