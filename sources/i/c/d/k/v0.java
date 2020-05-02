package i.c.d.k;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.firebase:firebase-iid@@20.1.2 */
public final class v0 implements Parcelable.Creator<t0> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder != null) {
            return new t0(readStrongBinder);
        }
        return null;
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new t0[i2];
    }
}
