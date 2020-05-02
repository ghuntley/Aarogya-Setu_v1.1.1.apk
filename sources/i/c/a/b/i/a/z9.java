package i.c.a.b.i.a;

import android.os.Parcel;
import android.os.Parcelable;
import i.c.a.b.d.l.q;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class z9 implements Parcelable.Creator<aa> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b2 = q.b(parcel);
        String str = null;
        Long l2 = null;
        Float f2 = null;
        String str2 = null;
        String str3 = null;
        Double d = null;
        long j2 = 0;
        int i2 = 0;
        while (parcel.dataPosition() < b2) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i2 = q.h(parcel2, readInt);
                    break;
                case 2:
                    str = q.b(parcel2, readInt);
                    break;
                case 3:
                    j2 = q.i(parcel2, readInt);
                    break;
                case 4:
                    int j3 = q.j(parcel2, readInt);
                    if (j3 != 0) {
                        q.c(parcel2, j3, 8);
                        l2 = Long.valueOf(parcel.readLong());
                        break;
                    } else {
                        l2 = null;
                        break;
                    }
                case 5:
                    int j4 = q.j(parcel2, readInt);
                    if (j4 != 0) {
                        q.c(parcel2, j4, 4);
                        f2 = Float.valueOf(parcel.readFloat());
                        break;
                    } else {
                        f2 = null;
                        break;
                    }
                case 6:
                    str2 = q.b(parcel2, readInt);
                    break;
                case 7:
                    str3 = q.b(parcel2, readInt);
                    break;
                case 8:
                    int j5 = q.j(parcel2, readInt);
                    if (j5 != 0) {
                        q.c(parcel2, j5, 8);
                        d = Double.valueOf(parcel.readDouble());
                        break;
                    } else {
                        d = null;
                        break;
                    }
                default:
                    q.k(parcel2, readInt);
                    break;
            }
        }
        q.d(parcel2, b2);
        return new aa(i2, str, j2, l2, f2, str2, str3, d);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new aa[i2];
    }
}
