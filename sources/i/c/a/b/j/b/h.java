package i.c.a.b.j.b;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import i.c.a.b.g.c.b;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class h implements f, IInterface {
    public final IBinder a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3986b = "com.google.android.gms.signin.internal.ISignInService";

    public h(IBinder iBinder) {
        this.a = iBinder;
    }

    public final void a(j jVar, d dVar) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f3986b);
        b.a(obtain, (Parcelable) jVar);
        if (dVar == null) {
            obtain.writeStrongBinder((IBinder) null);
        } else {
            obtain.writeStrongBinder(dVar.asBinder());
        }
        Parcel obtain2 = Parcel.obtain();
        try {
            this.a.transact(12, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }

    public IBinder asBinder() {
        return this.a;
    }
}
