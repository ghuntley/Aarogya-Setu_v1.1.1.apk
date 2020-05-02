package i.c.a.b.g.g;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public abstract class q4 extends f1 implements b2 {
    public static b2 a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        if (queryLocalInterface instanceof b2) {
            return (b2) queryLocalInterface;
        }
        return new s3(iBinder);
    }
}
