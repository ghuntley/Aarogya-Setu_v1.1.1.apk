package i.c.a.b.d.l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import i.c.a.b.d.z;
import i.c.a.b.e.a;
import i.c.a.b.g.d.b;
import i.c.a.b.g.d.c;

/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public final class s0 extends b implements r0 {
    public s0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    public final boolean a(z zVar, a aVar) {
        Parcel a = a();
        c.a(a, (Parcelable) zVar);
        c.a(a, (IInterface) aVar);
        Parcel a2 = a(5, a);
        boolean z = a2.readInt() != 0;
        a2.recycle();
        return z;
    }
}
