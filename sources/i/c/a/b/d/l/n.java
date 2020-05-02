package i.c.a.b.d.l;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public final class n implements o {
    public final IBinder a;

    public n(IBinder iBinder) {
        this.a = iBinder;
    }

    public final void a(m mVar, g gVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(mVar != null ? mVar.asBinder() : null);
            if (gVar != null) {
                obtain.writeInt(1);
                gVar.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.a.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.a;
    }
}
