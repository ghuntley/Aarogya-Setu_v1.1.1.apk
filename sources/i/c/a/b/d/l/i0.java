package i.c.a.b.d.l;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import i.c.a.b.d.d;

/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public final class i0 implements Parcelable.Creator<h0> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b2 = q.b(parcel);
        Bundle bundle = null;
        d[] dVarArr = null;
        int i2 = 0;
        while (parcel.dataPosition() < b2) {
            int readInt = parcel.readInt();
            int i3 = 65535 & readInt;
            if (i3 == 1) {
                bundle = q.a(parcel, readInt);
            } else if (i3 == 2) {
                dVarArr = (d[]) q.b(parcel, readInt, d.CREATOR);
            } else if (i3 != 3) {
                q.k(parcel, readInt);
            } else {
                i2 = q.h(parcel, readInt);
            }
        }
        q.d(parcel, b2);
        return new h0(bundle, dVarArr, i2);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new h0[i2];
    }
}
