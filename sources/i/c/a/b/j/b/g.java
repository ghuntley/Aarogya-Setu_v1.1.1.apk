package i.c.a.b.j.b;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import i.c.a.b.d.b;
import i.c.a.b.g.c.a;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public abstract class g extends a implements d {
    public g() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    public boolean a(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 == 3) {
            b bVar = (b) i.c.a.b.g.c.b.a(parcel, b.CREATOR);
            c cVar = (c) i.c.a.b.g.c.b.a(parcel, c.CREATOR);
        } else if (i2 == 4) {
            Status status = (Status) i.c.a.b.g.c.b.a(parcel, Status.CREATOR);
        } else if (i2 == 6) {
            Status status2 = (Status) i.c.a.b.g.c.b.a(parcel, Status.CREATOR);
        } else if (i2 == 7) {
            Status status3 = (Status) i.c.a.b.g.c.b.a(parcel, Status.CREATOR);
            GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) i.c.a.b.g.c.b.a(parcel, GoogleSignInAccount.CREATOR);
        } else if (i2 != 8) {
            return false;
        } else {
            a((l) i.c.a.b.g.c.b.a(parcel, l.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
