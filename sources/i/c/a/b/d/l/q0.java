package i.c.a.b.d.l;

import android.os.IBinder;
import android.os.IInterface;
import i.c.a.b.g.d.a;

/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public abstract class q0 extends a implements r0 {
    public static r0 a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        if (queryLocalInterface instanceof r0) {
            return (r0) queryLocalInterface;
        }
        return new s0(iBinder);
    }
}
