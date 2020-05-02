package i.c.a.b.h;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationResult;
import i.c.a.b.d.l.q;
import java.util.List;

public final class k implements Parcelable.Creator<LocationResult> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b2 = q.b(parcel);
        List<Location> list = LocationResult.f520f;
        while (parcel.dataPosition() < b2) {
            int readInt = parcel.readInt();
            if ((65535 & readInt) != 1) {
                q.k(parcel, readInt);
            } else {
                list = q.c(parcel, readInt, Location.CREATOR);
            }
        }
        q.d(parcel, b2);
        return new LocationResult(list);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new LocationResult[i2];
    }
}
