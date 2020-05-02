package i.c.a.b.g.f;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class a implements IInterface {
    public final IBinder a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3181b;

    public a(IBinder iBinder, String str) {
        this.a = iBinder;
        this.f3181b = str;
    }

    public final void a(int i2, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.a.transact(i2, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.a;
    }

    public final void b(int i2, Parcel parcel) {
        try {
            this.a.transact(i2, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public final Parcel g() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f3181b);
        return obtain;
    }
}
