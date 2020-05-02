package i.c.a.b.g.g;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import i.c.a.b.d.l.q;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.3.0 */
public final class sc implements Parcelable.Creator<pc> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b2 = q.b(parcel);
        long j2 = 0;
        long j3 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        Bundle bundle = null;
        boolean z = false;
        while (parcel.dataPosition() < b2) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    j2 = q.i(parcel2, readInt);
                    break;
                case 2:
                    j3 = q.i(parcel2, readInt);
                    break;
                case 3:
                    z = q.e(parcel2, readInt);
                    break;
                case 4:
                    str = q.b(parcel2, readInt);
                    break;
                case 5:
                    str2 = q.b(parcel2, readInt);
                    break;
                case 6:
                    str3 = q.b(parcel2, readInt);
                    break;
                case 7:
                    bundle = q.a(parcel2, readInt);
                    break;
                default:
                    q.k(parcel2, readInt);
                    break;
            }
        }
        q.d(parcel2, b2);
        return new pc(j2, j3, z, str, str2, str3, bundle);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new pc[i2];
    }
}
