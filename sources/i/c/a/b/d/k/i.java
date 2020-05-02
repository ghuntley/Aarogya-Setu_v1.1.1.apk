package i.c.a.b.d.k;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import i.c.a.b.d.l.q;

/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public final class i implements Parcelable.Creator<Scope> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b2 = q.b(parcel);
        int i2 = 0;
        String str = null;
        while (parcel.dataPosition() < b2) {
            int readInt = parcel.readInt();
            int i3 = 65535 & readInt;
            if (i3 == 1) {
                i2 = q.h(parcel, readInt);
            } else if (i3 != 2) {
                q.k(parcel, readInt);
            } else {
                str = q.b(parcel, readInt);
            }
        }
        q.d(parcel, b2);
        return new Scope(i2, str);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new Scope[i2];
    }
}
