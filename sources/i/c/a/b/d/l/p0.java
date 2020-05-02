package i.c.a.b.d.l;

import android.os.IBinder;
import android.os.Parcel;
import i.c.a.b.e.a;
import i.c.a.b.g.d.b;

/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public final class p0 extends b implements o0 {
    public p0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    public final a b() {
        Parcel a = a(1, a());
        a a2 = a.C0113a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final int c() {
        Parcel a = a(2, a());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }
}
