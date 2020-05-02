package i.c.a.b.d;

import android.os.Parcel;
import android.os.Parcelable;
import i.c.a.b.d.l.q;

/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public final class r implements Parcelable.Creator<d> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b2 = q.b(parcel);
        String str = null;
        int i2 = 0;
        long j2 = -1;
        while (parcel.dataPosition() < b2) {
            int readInt = parcel.readInt();
            int i3 = 65535 & readInt;
            if (i3 == 1) {
                str = q.b(parcel, readInt);
            } else if (i3 == 2) {
                i2 = q.h(parcel, readInt);
            } else if (i3 != 3) {
                q.k(parcel, readInt);
            } else {
                j2 = q.i(parcel, readInt);
            }
        }
        q.d(parcel, b2);
        return new d(str, i2, j2);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new d[i2];
    }
}
