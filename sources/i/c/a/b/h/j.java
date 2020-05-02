package i.c.a.b.h;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationRequest;
import i.c.a.b.d.l.q;

public final class j implements Parcelable.Creator<LocationRequest> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b2 = q.b(parcel);
        long j2 = 3600000;
        long j3 = 600000;
        long j4 = Long.MAX_VALUE;
        long j5 = 0;
        int i2 = 102;
        boolean z = false;
        int i3 = Integer.MAX_VALUE;
        float f2 = 0.0f;
        while (parcel.dataPosition() < b2) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i2 = q.h(parcel2, readInt);
                    break;
                case 2:
                    j2 = q.i(parcel2, readInt);
                    break;
                case 3:
                    j3 = q.i(parcel2, readInt);
                    break;
                case 4:
                    z = q.e(parcel2, readInt);
                    break;
                case 5:
                    j4 = q.i(parcel2, readInt);
                    break;
                case 6:
                    i3 = q.h(parcel2, readInt);
                    break;
                case 7:
                    f2 = q.f(parcel2, readInt);
                    break;
                case 8:
                    j5 = q.i(parcel2, readInt);
                    break;
                default:
                    q.k(parcel2, readInt);
                    break;
            }
        }
        q.d(parcel2, b2);
        return new LocationRequest(i2, j2, j3, z, j4, i3, f2, j5);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new LocationRequest[i2];
    }
}
