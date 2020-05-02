package i.c.a.b.i.a;

import android.os.Parcel;
import i.c.a.b.g.g.f1;
import i.c.a.b.g.g.q;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public abstract class h4 extends f1 implements e4 {
    public h4() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    public final boolean a(int i2, Parcel parcel, Parcel parcel2, int i3) {
        boolean z = false;
        switch (i2) {
            case 1:
                a((m) q.a(parcel, m.CREATOR), (ea) q.a(parcel, ea.CREATOR));
                parcel2.writeNoException();
                break;
            case 2:
                a((aa) q.a(parcel, aa.CREATOR), (ea) q.a(parcel, ea.CREATOR));
                parcel2.writeNoException();
                break;
            case 4:
                c((ea) q.a(parcel, ea.CREATOR));
                parcel2.writeNoException();
                break;
            case 5:
                a((m) q.a(parcel, m.CREATOR), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                break;
            case 6:
                a((ea) q.a(parcel, ea.CREATOR));
                parcel2.writeNoException();
                break;
            case 7:
                ea eaVar = (ea) q.a(parcel, ea.CREATOR);
                if (parcel.readInt() != 0) {
                    z = true;
                }
                List<aa> a = a(eaVar, z);
                parcel2.writeNoException();
                parcel2.writeTypedList(a);
                break;
            case 9:
                byte[] a2 = a((m) q.a(parcel, m.CREATOR), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeByteArray(a2);
                break;
            case 10:
                a(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                break;
            case 11:
                String d = d((ea) q.a(parcel, ea.CREATOR));
                parcel2.writeNoException();
                parcel2.writeString(d);
                break;
            case 12:
                a((na) q.a(parcel, na.CREATOR), (ea) q.a(parcel, ea.CREATOR));
                parcel2.writeNoException();
                break;
            case 13:
                a((na) q.a(parcel, na.CREATOR));
                parcel2.writeNoException();
                break;
            case 14:
                List<aa> a3 = a(parcel.readString(), parcel.readString(), q.a(parcel), (ea) q.a(parcel, ea.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(a3);
                break;
            case 15:
                List<aa> a4 = a(parcel.readString(), parcel.readString(), parcel.readString(), q.a(parcel));
                parcel2.writeNoException();
                parcel2.writeTypedList(a4);
                break;
            case 16:
                List<na> a5 = a(parcel.readString(), parcel.readString(), (ea) q.a(parcel, ea.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(a5);
                break;
            case 17:
                List<na> a6 = a(parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeTypedList(a6);
                break;
            case 18:
                b((ea) q.a(parcel, ea.CREATOR));
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }
}
