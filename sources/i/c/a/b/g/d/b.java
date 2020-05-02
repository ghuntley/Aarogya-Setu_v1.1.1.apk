package i.c.a.b.g.d;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public class b implements IInterface {
    public final IBinder a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3178b;

    public b(IBinder iBinder, String str) {
        this.a = iBinder;
        this.f3178b = str;
    }

    public final Parcel a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f3178b);
        return obtain;
    }

    public IBinder asBinder() {
        return this.a;
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
}
