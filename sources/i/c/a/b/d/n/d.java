package i.c.a.b.d.n;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.stats.WakeLockEvent;
import i.c.a.b.d.l.q;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public final class d implements Parcelable.Creator<WakeLockEvent> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b2 = q.b(parcel);
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        String str = null;
        ArrayList<String> arrayList = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        float f2 = 0.0f;
        boolean z = false;
        while (parcel.dataPosition() < b2) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i2 = q.h(parcel2, readInt);
                    break;
                case 2:
                    j2 = q.i(parcel2, readInt);
                    break;
                case 4:
                    str = q.b(parcel2, readInt);
                    break;
                case 5:
                    i4 = q.h(parcel2, readInt);
                    break;
                case 6:
                    arrayList = q.c(parcel2, readInt);
                    break;
                case 8:
                    j3 = q.i(parcel2, readInt);
                    break;
                case 10:
                    str3 = q.b(parcel2, readInt);
                    break;
                case 11:
                    i3 = q.h(parcel2, readInt);
                    break;
                case 12:
                    str2 = q.b(parcel2, readInt);
                    break;
                case 13:
                    str4 = q.b(parcel2, readInt);
                    break;
                case 14:
                    i5 = q.h(parcel2, readInt);
                    break;
                case 15:
                    f2 = q.f(parcel2, readInt);
                    break;
                case 16:
                    j4 = q.i(parcel2, readInt);
                    break;
                case 17:
                    str5 = q.b(parcel2, readInt);
                    break;
                case 18:
                    z = q.e(parcel2, readInt);
                    break;
                default:
                    q.k(parcel2, readInt);
                    break;
            }
        }
        q.d(parcel2, b2);
        return new WakeLockEvent(i2, j2, i3, str, i4, arrayList, str2, j3, i5, str3, str4, f2, j4, str5, z);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new WakeLockEvent[i2];
    }
}
