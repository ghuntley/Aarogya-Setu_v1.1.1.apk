package i.c.a.b.g.b;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.4.0 */
public final class d implements e, IInterface {
    public final IBinder a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3177b = "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService";

    public d(IBinder iBinder) {
        this.a = iBinder;
    }

    public final void a(g gVar) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f3177b);
        c.a(obtain, (IInterface) gVar);
        Parcel obtain2 = Parcel.obtain();
        try {
            this.a.transact(1, obtain, obtain2, 0);
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
