package i.c.a.b.j.b;

import android.os.Parcel;
import android.os.Parcelable;
import i.c.a.b.d.b;
import i.c.a.b.d.l.q;
import i.c.a.b.d.l.t;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class k implements Parcelable.Creator<l> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b2 = q.b(parcel);
        b bVar = null;
        t tVar = null;
        int i2 = 0;
        while (parcel.dataPosition() < b2) {
            int readInt = parcel.readInt();
            int i3 = 65535 & readInt;
            if (i3 == 1) {
                i2 = q.h(parcel, readInt);
            } else if (i3 == 2) {
                bVar = (b) q.a(parcel, readInt, b.CREATOR);
            } else if (i3 != 3) {
                q.k(parcel, readInt);
            } else {
                tVar = (t) q.a(parcel, readInt, t.CREATOR);
            }
        }
        q.d(parcel, b2);
        return new l(i2, bVar, tVar);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new l[i2];
    }
}
