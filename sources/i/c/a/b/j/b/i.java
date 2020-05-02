package i.c.a.b.j.b;

import android.os.Parcel;
import android.os.Parcelable;
import i.c.a.b.d.l.q;
import i.c.a.b.d.l.s;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class i implements Parcelable.Creator<j> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b2 = q.b(parcel);
        int i2 = 0;
        s sVar = null;
        while (parcel.dataPosition() < b2) {
            int readInt = parcel.readInt();
            int i3 = 65535 & readInt;
            if (i3 == 1) {
                i2 = q.h(parcel, readInt);
            } else if (i3 != 2) {
                q.k(parcel, readInt);
            } else {
                sVar = (s) q.a(parcel, readInt, s.CREATOR);
            }
        }
        q.d(parcel, b2);
        return new j(i2, sVar);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new j[i2];
    }
}
