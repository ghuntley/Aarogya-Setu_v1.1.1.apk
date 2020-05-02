package i.c.a.b.g.f;

import android.os.Parcel;
import i.c.a.b.d.k.h.d;
import i.c.a.b.h.f;

public abstract class j extends r implements i {
    public j() {
        super("com.google.android.gms.location.internal.ISettingsCallbacks");
    }

    public final boolean a(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 != 1) {
            return false;
        }
        s sVar = (s) this;
        ((d) sVar.a).a((Object) (f) z.a(parcel, f.CREATOR));
        sVar.a = null;
        return true;
    }
}
