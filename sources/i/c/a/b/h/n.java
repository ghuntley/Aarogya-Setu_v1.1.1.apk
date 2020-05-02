package i.c.a.b.h;

import android.os.Parcel;
import android.os.Parcelable;
import i.c.a.b.d.l.q;

public final class n implements Parcelable.Creator<m> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b2 = q.b(parcel);
        String str = "";
        String str2 = str;
        String str3 = str2;
        while (parcel.dataPosition() < b2) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 1) {
                str2 = q.b(parcel, readInt);
            } else if (i2 == 2) {
                str3 = q.b(parcel, readInt);
            } else if (i2 != 5) {
                q.k(parcel, readInt);
            } else {
                str = q.b(parcel, readInt);
            }
        }
        q.d(parcel, b2);
        return new m(str, str2, str3);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new m[i2];
    }
}
