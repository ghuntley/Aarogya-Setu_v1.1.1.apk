package i.c.a.b.g.f;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import i.c.a.b.d.l.q;

public final class f0 implements Parcelable.Creator<e0> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b2 = q.b(parcel);
        c0 c0Var = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        int i2 = 1;
        while (parcel.dataPosition() < b2) {
            int readInt = parcel.readInt();
            int i3 = 65535 & readInt;
            if (i3 == 1) {
                i2 = q.h(parcel, readInt);
            } else if (i3 == 2) {
                c0Var = (c0) q.a(parcel, readInt, c0.CREATOR);
            } else if (i3 == 3) {
                iBinder = q.g(parcel, readInt);
            } else if (i3 != 4) {
                q.k(parcel, readInt);
            } else {
                iBinder2 = q.g(parcel, readInt);
            }
        }
        q.d(parcel, b2);
        return new e0(i2, c0Var, iBinder, iBinder2);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new e0[i2];
    }
}
