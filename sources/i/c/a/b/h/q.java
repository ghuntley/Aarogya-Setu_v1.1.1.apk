package i.c.a.b.h;

import android.os.Parcel;
import android.os.Parcelable;

public final class q implements Parcelable.Creator<g> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b2 = i.c.a.b.d.l.q.b(parcel);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        while (parcel.dataPosition() < b2) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    z = i.c.a.b.d.l.q.e(parcel, readInt);
                    break;
                case 2:
                    z2 = i.c.a.b.d.l.q.e(parcel, readInt);
                    break;
                case 3:
                    z3 = i.c.a.b.d.l.q.e(parcel, readInt);
                    break;
                case 4:
                    z4 = i.c.a.b.d.l.q.e(parcel, readInt);
                    break;
                case 5:
                    z5 = i.c.a.b.d.l.q.e(parcel, readInt);
                    break;
                case 6:
                    z6 = i.c.a.b.d.l.q.e(parcel, readInt);
                    break;
                default:
                    i.c.a.b.d.l.q.k(parcel, readInt);
                    break;
            }
        }
        i.c.a.b.d.l.q.d(parcel, b2);
        return new g(z, z2, z3, z4, z5, z6);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new g[i2];
    }
}
