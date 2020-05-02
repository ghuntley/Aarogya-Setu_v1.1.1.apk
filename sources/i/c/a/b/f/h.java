package i.c.a.b.f;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import i.c.a.b.e.a;
import i.c.a.b.g.d.b;
import i.c.a.b.g.d.c;

/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public final class h extends b implements i {
    public h(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final a a(a aVar, String str, int i2, a aVar2) {
        Parcel a = a();
        c.a(a, (IInterface) aVar);
        a.writeString(str);
        a.writeInt(i2);
        c.a(a, (IInterface) aVar2);
        Parcel a2 = a(2, a);
        a a3 = a.C0113a.a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    public final a b(a aVar, String str, int i2, a aVar2) {
        Parcel a = a();
        c.a(a, (IInterface) aVar);
        a.writeString(str);
        a.writeInt(i2);
        c.a(a, (IInterface) aVar2);
        Parcel a2 = a(3, a);
        a a3 = a.C0113a.a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }
}
