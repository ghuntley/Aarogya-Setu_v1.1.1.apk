package i.c.a.b.g.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

public abstract class c extends Binder implements b, IInterface {
    public static b a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        return queryLocalInterface instanceof b ? (b) queryLocalInterface : new d(iBinder);
    }
}
