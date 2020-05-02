package i.c.a.b.d.k.h;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import i.c.a.b.d.k.h.g;
import i.c.a.b.l.h;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public abstract class p0<T> extends u {
    public final h<T> a;

    public p0(int i2, h<T> hVar) {
        super(i2);
        this.a = hVar;
    }

    public void a(Status status) {
        h<T> hVar = this.a;
        hVar.a.b((Exception) new ApiException(status));
    }

    public abstract void d(g.a<?> aVar);

    public void a(RuntimeException runtimeException) {
        this.a.a.b((Exception) runtimeException);
    }

    public final void a(g.a<?> aVar) {
        try {
            d(aVar);
        } catch (DeadObjectException e) {
            Status a2 = e0.a((RemoteException) e);
            h<T> hVar = this.a;
            hVar.a.b((Exception) new ApiException(a2));
            throw e;
        } catch (RemoteException e2) {
            Status a3 = e0.a(e2);
            h<T> hVar2 = this.a;
            hVar2.a.b((Exception) new ApiException(a3));
        } catch (RuntimeException e3) {
            this.a.a.b((Exception) e3);
        }
    }
}
