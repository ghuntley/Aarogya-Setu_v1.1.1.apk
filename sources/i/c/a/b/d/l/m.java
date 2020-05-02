package i.c.a.b.d.l;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.util.Log;
import i.c.a.b.d.l.b;
import i.c.a.b.g.d.c;

/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public interface m extends IInterface {

    /* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
    public static abstract class a extends i.c.a.b.g.d.a implements m {
        public a() {
            super("com.google.android.gms.common.internal.IGmsCallbacks");
        }

        public final boolean a(int i2, Parcel parcel, Parcel parcel2, int i3) {
            if (i2 == 1) {
                ((b.i) this).a(parcel.readInt(), parcel.readStrongBinder(), (Bundle) c.a(parcel, Bundle.CREATOR));
            } else if (i2 == 2) {
                parcel.readInt();
                Bundle bundle = (Bundle) c.a(parcel, Bundle.CREATOR);
                Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
            } else if (i2 != 3) {
                return false;
            } else {
                int readInt = parcel.readInt();
                IBinder readStrongBinder = parcel.readStrongBinder();
                h0 h0Var = (h0) c.a(parcel, h0.CREATOR);
                b.i iVar = (b.i) this;
                q.a(iVar.a, (Object) "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
                q.a(h0Var);
                iVar.a.t = h0Var;
                iVar.a(readInt, readStrongBinder, h0Var.e);
            }
            parcel2.writeNoException();
            return true;
        }
    }
}
