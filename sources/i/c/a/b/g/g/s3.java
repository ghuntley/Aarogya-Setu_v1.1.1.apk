package i.c.a.b.g.g;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class s3 extends a implements b2 {
    public s3(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    public final Bundle a(Bundle bundle) {
        Parcel g2 = g();
        q.a(g2, (Parcelable) bundle);
        Parcel a = a(1, g2);
        Bundle bundle2 = (Bundle) q.a(a, Bundle.CREATOR);
        a.recycle();
        return bundle2;
    }
}
