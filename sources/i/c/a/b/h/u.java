package i.c.a.b.h;

import android.os.Parcel;
import android.os.Parcelable;
import i.c.a.b.d.l.q;

public final class u implements Parcelable.Creator<t> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b2 = q.b(parcel);
        long j2 = 50;
        long j3 = Long.MAX_VALUE;
        boolean z = true;
        float f2 = 0.0f;
        int i2 = Integer.MAX_VALUE;
        while (parcel.dataPosition() < b2) {
            int readInt = parcel.readInt();
            int i3 = 65535 & readInt;
            if (i3 == 1) {
                z = q.e(parcel2, readInt);
            } else if (i3 == 2) {
                j2 = q.i(parcel2, readInt);
            } else if (i3 == 3) {
                f2 = q.f(parcel2, readInt);
            } else if (i3 == 4) {
                j3 = q.i(parcel2, readInt);
            } else if (i3 != 5) {
                q.k(parcel2, readInt);
            } else {
                i2 = q.h(parcel2, readInt);
            }
        }
        q.d(parcel2, b2);
        return new t(z, j2, f2, j3, i2);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new t[i2];
    }
}
