package i.c.d.o;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import i.c.a.b.d.l.q;

/* compiled from: com.google.firebase:firebase-messaging@@20.1.3 */
public final class r implements Parcelable.Creator<b> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b2 = q.b(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < b2) {
            int readInt = parcel.readInt();
            if ((65535 & readInt) != 2) {
                q.k(parcel, readInt);
            } else {
                bundle = q.a(parcel, readInt);
            }
        }
        q.d(parcel, b2);
        return new b(bundle);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new b[i2];
    }
}
