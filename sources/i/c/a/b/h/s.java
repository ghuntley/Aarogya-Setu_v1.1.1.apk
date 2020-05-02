package i.c.a.b.h;

import android.os.Parcel;
import android.os.Parcelable;
import i.c.a.b.d.l.q;

public final class s implements Parcelable.Creator<r> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b2 = q.b(parcel);
        long j2 = -1;
        long j3 = -1;
        int i2 = 1;
        int i3 = 1;
        while (parcel.dataPosition() < b2) {
            int readInt = parcel.readInt();
            int i4 = 65535 & readInt;
            if (i4 == 1) {
                i2 = q.h(parcel, readInt);
            } else if (i4 == 2) {
                i3 = q.h(parcel, readInt);
            } else if (i4 == 3) {
                j2 = q.i(parcel, readInt);
            } else if (i4 != 4) {
                q.k(parcel, readInt);
            } else {
                j3 = q.i(parcel, readInt);
            }
        }
        q.d(parcel, b2);
        return new r(i2, i3, j2, j3);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new r[i2];
    }
}
