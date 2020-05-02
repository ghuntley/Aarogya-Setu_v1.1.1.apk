package i.c.a.b.d.l;

import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import android.util.Log;
import i.c.a.b.d.l.l;

/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public class a extends l.a {
    public static Account a(l lVar) {
        if (lVar != null) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return lVar.e();
            } catch (RemoteException unused) {
                Log.w("AccountAccessor", "Remote account accessor probably died");
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
        return null;
    }
}
