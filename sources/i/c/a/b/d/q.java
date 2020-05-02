package i.c.a.b.d;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public final class q implements Parcelable.Creator<b> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b2 = i.c.a.b.d.l.q.b(parcel);
        int i2 = 0;
        PendingIntent pendingIntent = null;
        String str = null;
        int i3 = 0;
        while (parcel.dataPosition() < b2) {
            int readInt = parcel.readInt();
            int i4 = 65535 & readInt;
            if (i4 == 1) {
                i2 = i.c.a.b.d.l.q.h(parcel, readInt);
            } else if (i4 == 2) {
                i3 = i.c.a.b.d.l.q.h(parcel, readInt);
            } else if (i4 == 3) {
                pendingIntent = (PendingIntent) i.c.a.b.d.l.q.a(parcel, readInt, PendingIntent.CREATOR);
            } else if (i4 != 4) {
                i.c.a.b.d.l.q.k(parcel, readInt);
            } else {
                str = i.c.a.b.d.l.q.b(parcel, readInt);
            }
        }
        i.c.a.b.d.l.q.d(parcel, b2);
        return new b(i2, i3, pendingIntent, str);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new b[i2];
    }
}
