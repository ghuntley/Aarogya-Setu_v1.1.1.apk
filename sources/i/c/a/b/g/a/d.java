package i.c.a.b.g.a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class d implements b, IInterface {
    public final IBinder a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3175b = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService";

    public d(IBinder iBinder) {
        this.a = iBinder;
    }

    public final Parcel a(int i2, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.a.transact(i2, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    public IBinder asBinder() {
        return this.a;
    }

    public final boolean c() {
        Parcel a2 = a(6, g());
        boolean a3 = a.a(a2);
        a2.recycle();
        return a3;
    }

    public final String d() {
        Parcel a2 = a(1, g());
        String readString = a2.readString();
        a2.recycle();
        return readString;
    }

    public final Parcel g() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f3175b);
        return obtain;
    }

    public final boolean a(boolean z) {
        Parcel g2 = g();
        a.a(g2);
        Parcel a2 = a(2, g2);
        boolean z2 = a2.readInt() != 0;
        a2.recycle();
        return z2;
    }
}
