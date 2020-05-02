package i.c.a.b.f;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import i.c.a.b.e.a;
import i.c.a.b.g.d.b;
import i.c.a.b.g.d.c;

/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public final class f extends b implements g {
    public f(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final a a(a aVar, String str, int i2) {
        Parcel a = a();
        c.a(a, (IInterface) aVar);
        a.writeString(str);
        a.writeInt(i2);
        Parcel a2 = a(2, a);
        a a3 = a.C0113a.a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    public final int b(a aVar, String str, boolean z) {
        Parcel a = a();
        c.a(a, (IInterface) aVar);
        a.writeString(str);
        a.writeInt(z ? 1 : 0);
        Parcel a2 = a(3, a);
        int readInt = a2.readInt();
        a2.recycle();
        return readInt;
    }

    public final int f() {
        Parcel a = a(6, a());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }

    public final int a(a aVar, String str, boolean z) {
        Parcel a = a();
        c.a(a, (IInterface) aVar);
        a.writeString(str);
        a.writeInt(z ? 1 : 0);
        Parcel a2 = a(5, a);
        int readInt = a2.readInt();
        a2.recycle();
        return readInt;
    }

    public final a b(a aVar, String str, int i2) {
        Parcel a = a();
        c.a(a, (IInterface) aVar);
        a.writeString(str);
        a.writeInt(i2);
        Parcel a2 = a(4, a);
        a a3 = a.C0113a.a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }
}
