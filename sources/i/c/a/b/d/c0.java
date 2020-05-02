package i.c.a.b.d;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import i.c.a.b.d.l.q;

/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public final class c0 implements Parcelable.Creator<z> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b2 = q.b(parcel);
        boolean z = false;
        String str = null;
        IBinder iBinder = null;
        boolean z2 = false;
        while (parcel.dataPosition() < b2) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 1) {
                str = q.b(parcel, readInt);
            } else if (i2 == 2) {
                iBinder = q.g(parcel, readInt);
            } else if (i2 == 3) {
                z = q.e(parcel, readInt);
            } else if (i2 != 4) {
                q.k(parcel, readInt);
            } else {
                z2 = q.e(parcel, readInt);
            }
        }
        q.d(parcel, b2);
        return new z(str, iBinder, z, z2);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new z[i2];
    }
}
