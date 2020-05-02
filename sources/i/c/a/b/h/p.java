package i.c.a.b.h;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import i.c.a.b.d.l.q;

public final class p implements Parcelable.Creator<f> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b2 = q.b(parcel);
        Status status = null;
        g gVar = null;
        while (parcel.dataPosition() < b2) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 1) {
                status = (Status) q.a(parcel, readInt, Status.CREATOR);
            } else if (i2 != 2) {
                q.k(parcel, readInt);
            } else {
                gVar = (g) q.a(parcel, readInt, g.CREATOR);
            }
        }
        q.d(parcel, b2);
        return new f(status, gVar);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new f[i2];
    }
}
