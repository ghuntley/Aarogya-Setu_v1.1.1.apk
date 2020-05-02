package i.c.a.b.g.f;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import i.c.a.b.d.l.q;

public final class c implements Parcelable.Creator<b> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b2 = q.b(parcel);
        Status status = null;
        while (parcel.dataPosition() < b2) {
            int readInt = parcel.readInt();
            if ((65535 & readInt) != 1) {
                q.k(parcel, readInt);
            } else {
                status = (Status) q.a(parcel, readInt, Status.CREATOR);
            }
        }
        q.d(parcel, b2);
        return new b(status);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new b[i2];
    }
}
