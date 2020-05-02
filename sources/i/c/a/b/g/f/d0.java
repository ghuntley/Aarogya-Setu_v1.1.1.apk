package i.c.a.b.g.f;

import android.os.Parcel;
import android.os.Parcelable;
import i.c.a.b.d.l.c;
import i.c.a.b.d.l.q;
import i.c.a.b.h.t;
import java.util.List;

public final class d0 implements Parcelable.Creator<c0> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b2 = q.b(parcel);
        t tVar = c0.f3183i;
        List<c> list = c0.f3182h;
        String str = null;
        while (parcel.dataPosition() < b2) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 1) {
                tVar = (t) q.a(parcel, readInt, t.CREATOR);
            } else if (i2 == 2) {
                list = q.c(parcel, readInt, c.CREATOR);
            } else if (i2 != 3) {
                q.k(parcel, readInt);
            } else {
                str = q.b(parcel, readInt);
            }
        }
        q.d(parcel, b2);
        return new c0(tVar, list, str);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new c0[i2];
    }
}
