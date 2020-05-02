package i.c.a.b.g.g;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.3.0 */
public final class jc extends a implements nb {
    public jc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    public final void a(Bundle bundle) {
        Parcel g2 = g();
        q.a(g2, (Parcelable) bundle);
        b(1, g2);
    }
}
