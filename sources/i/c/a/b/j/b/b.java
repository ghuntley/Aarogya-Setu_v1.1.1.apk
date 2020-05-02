package i.c.a.b.j.b;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import i.c.a.b.d.l.q;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class b implements Parcelable.Creator<c> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b2 = q.b(parcel);
        int i2 = 0;
        Intent intent = null;
        int i3 = 0;
        while (parcel.dataPosition() < b2) {
            int readInt = parcel.readInt();
            int i4 = 65535 & readInt;
            if (i4 == 1) {
                i2 = q.h(parcel, readInt);
            } else if (i4 == 2) {
                i3 = q.h(parcel, readInt);
            } else if (i4 != 3) {
                q.k(parcel, readInt);
            } else {
                intent = (Intent) q.a(parcel, readInt, Intent.CREATOR);
            }
        }
        q.d(parcel, b2);
        return new c(i2, i3, intent);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new c[i2];
    }
}
