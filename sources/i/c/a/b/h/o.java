package i.c.a.b.h;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationRequest;
import i.c.a.b.d.l.q;
import java.util.ArrayList;

public final class o implements Parcelable.Creator<d> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b2 = q.b(parcel);
        boolean z = false;
        ArrayList<LocationRequest> arrayList = null;
        m mVar = null;
        boolean z2 = false;
        while (parcel.dataPosition() < b2) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 1) {
                arrayList = q.c(parcel, readInt, LocationRequest.CREATOR);
            } else if (i2 == 2) {
                z = q.e(parcel, readInt);
            } else if (i2 == 3) {
                z2 = q.e(parcel, readInt);
            } else if (i2 != 5) {
                q.k(parcel, readInt);
            } else {
                mVar = (m) q.a(parcel, readInt, m.CREATOR);
            }
        }
        q.d(parcel, b2);
        return new d(arrayList, z, z2, mVar);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new d[i2];
    }
}
