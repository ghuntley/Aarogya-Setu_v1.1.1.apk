package i.c.a.b.d.k.h;

import android.os.RemoteException;
import android.os.TransactionTooLargeException;
import com.google.android.gms.common.api.Status;
import i.c.a.b.d.k.h.g;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public abstract class e0 {
    public e0(int i2) {
    }

    public static /* synthetic */ Status a(RemoteException remoteException) {
        StringBuilder sb = new StringBuilder();
        if (remoteException instanceof TransactionTooLargeException) {
            sb.append("TransactionTooLargeException: ");
        }
        sb.append(remoteException.getLocalizedMessage());
        return new Status(8, sb.toString());
    }

    public abstract void a(Status status);

    public abstract void a(g.a<?> aVar);

    public abstract void a(x0 x0Var, boolean z);

    public abstract void a(RuntimeException runtimeException);
}
