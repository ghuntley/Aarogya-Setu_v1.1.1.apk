package i.c.a.b.g.g;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.3.0 */
public class a implements IInterface {
    public final IBinder a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3205b;

    public a(IBinder iBinder, String str) {
        this.a = iBinder;
        this.f3205b = str;
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

    public final void b(int i2, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.a.transact(i2, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public final Parcel g() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f3205b);
        return obtain;
    }
}
