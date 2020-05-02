package i.c.a.b.i.a;

import android.os.Parcel;
import android.os.Parcelable;
import i.c.a.b.d.l.q;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class ga implements Parcelable.Creator<ea> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b2 = q.b(parcel);
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        long j6 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Boolean bool = null;
        ArrayList<String> arrayList = null;
        String str8 = null;
        long j7 = -2147483648L;
        boolean z = true;
        boolean z2 = false;
        int i2 = 0;
        boolean z3 = true;
        boolean z4 = true;
        boolean z5 = false;
        while (parcel.dataPosition() < b2) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    str = q.b(parcel2, readInt);
                    break;
                case 3:
                    str2 = q.b(parcel2, readInt);
                    break;
                case 4:
                    str3 = q.b(parcel2, readInt);
                    break;
                case 5:
                    str4 = q.b(parcel2, readInt);
                    break;
                case 6:
                    j2 = q.i(parcel2, readInt);
                    break;
                case 7:
                    j3 = q.i(parcel2, readInt);
                    break;
                case 8:
                    str5 = q.b(parcel2, readInt);
                    break;
                case 9:
                    z = q.e(parcel2, readInt);
                    break;
                case 10:
                    z2 = q.e(parcel2, readInt);
                    break;
                case 11:
                    j7 = q.i(parcel2, readInt);
                    break;
                case 12:
                    str6 = q.b(parcel2, readInt);
                    break;
                case 13:
                    j4 = q.i(parcel2, readInt);
                    break;
                case 14:
                    j5 = q.i(parcel2, readInt);
                    break;
                case 15:
                    i2 = q.h(parcel2, readInt);
                    break;
                case 16:
                    z3 = q.e(parcel2, readInt);
                    break;
                case 17:
                    z4 = q.e(parcel2, readInt);
                    break;
                case 18:
                    z5 = q.e(parcel2, readInt);
                    break;
                case 19:
                    str7 = q.b(parcel2, readInt);
                    break;
                case 21:
                    int j8 = q.j(parcel2, readInt);
                    if (j8 != 0) {
                        q.c(parcel2, j8, 4);
                        bool = Boolean.valueOf(parcel.readInt() != 0);
                        break;
                    } else {
                        bool = null;
                        break;
                    }
                case 22:
                    j6 = q.i(parcel2, readInt);
                    break;
                case 23:
                    arrayList = q.c(parcel2, readInt);
                    break;
                case 24:
                    str8 = q.b(parcel2, readInt);
                    break;
                default:
                    q.k(parcel2, readInt);
                    break;
            }
        }
        q.d(parcel2, b2);
        return new ea(str, str2, str3, str4, j2, j3, str5, z, z2, j7, str6, j4, j5, i2, z3, z4, z5, str7, bool, j6, (List<String>) arrayList, str8);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new ea[i2];
    }
}
