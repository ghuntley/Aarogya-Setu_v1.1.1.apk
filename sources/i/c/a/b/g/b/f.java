package i.c.a.b.g.b;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import g.a.a.b.a;
import i.c.a.b.l.h;

/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.4.0 */
public abstract class f extends a implements g {
    public f() {
        super("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverResultCallback");
    }

    public final boolean a(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 != 1) {
            return false;
        }
        a.a((Status) c.a(parcel, Status.CREATOR), (h<Void>) ((k) this).a);
        return true;
    }
}
