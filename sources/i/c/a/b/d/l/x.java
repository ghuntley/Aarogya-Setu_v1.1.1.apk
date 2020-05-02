package i.c.a.b.d.l;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class x implements Parcelable.Creator<c> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b2 = q.b(parcel);
        int i2 = 0;
        String str = null;
        while (parcel.dataPosition() < b2) {
            int readInt = parcel.readInt();
            int i3 = 65535 & readInt;
            if (i3 == 1) {
                i2 = q.h(parcel, readInt);
            } else if (i3 != 2) {
                q.k(parcel, readInt);
            } else {
                str = q.b(parcel, readInt);
            }
        }
        q.d(parcel, b2);
        return new c(i2, str);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new c[i2];
    }
}
