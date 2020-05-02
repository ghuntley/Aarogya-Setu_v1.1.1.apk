package i.c.a.d.a.c;

import android.os.Bundle;
import android.os.Parcel;

public abstract class h extends d implements i {
    public h() {
        super("com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback");
    }

    public final boolean a(int i2, Parcel parcel) {
        if (i2 == 2) {
            d((Bundle) c.a(parcel, Bundle.CREATOR));
            return true;
        } else if (i2 != 3) {
            return false;
        } else {
            c((Bundle) c.a(parcel, Bundle.CREATOR));
            return true;
        }
    }
}
