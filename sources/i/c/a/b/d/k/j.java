package i.c.a.b.d.k;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import i.c.a.b.d.l.q;

/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public final class j implements Parcelable.Creator<Status> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b2 = q.b(parcel);
        String str = null;
        PendingIntent pendingIntent = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < b2) {
            int readInt = parcel.readInt();
            int i4 = 65535 & readInt;
            if (i4 == 1) {
                i3 = q.h(parcel, readInt);
            } else if (i4 == 2) {
                str = q.b(parcel, readInt);
            } else if (i4 == 3) {
                pendingIntent = (PendingIntent) q.a(parcel, readInt, PendingIntent.CREATOR);
            } else if (i4 != 1000) {
                q.k(parcel, readInt);
            } else {
                i2 = q.h(parcel, readInt);
            }
        }
        q.d(parcel, b2);
        return new Status(i2, i3, str, pendingIntent);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new Status[i2];
    }
}
