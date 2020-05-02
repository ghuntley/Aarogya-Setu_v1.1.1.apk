package i.c.a.d.a.c;

import android.os.IBinder;
import android.os.IInterface;

public abstract class g extends d implements e {
    public static e a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
        return queryLocalInterface instanceof e ? (e) queryLocalInterface : new f(iBinder);
    }
}
