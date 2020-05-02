package i.c.a.b.g.f;

import android.app.PendingIntent;
import android.content.Context;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import i.c.a.b.d.k.c;
import i.c.a.b.d.k.h.k;
import i.c.a.b.d.l.d;
import i.c.a.b.h.b;
import javax.annotation.Nullable;

public final class q extends a0 {
    public final k A;

    public q(Context context, Looper looper, c.a aVar, c.b bVar, String str, @Nullable d dVar) {
        super(context, looper, aVar, bVar, str, dVar);
        this.A = new k(context, this.z);
    }

    public final void a(t tVar, k<b> kVar, d dVar) {
        synchronized (this.A) {
            k kVar2 = this.A;
            kVar2.a.a.l();
            ((g) kVar2.a.a()).a(new v(1, tVar, (IBinder) null, (PendingIntent) null, kVar2.a(kVar).asBinder(), dVar != null ? dVar.asBinder() : null));
        }
    }

    public final void f() {
        synchronized (this.A) {
            if (c()) {
                try {
                    this.A.a();
                    this.A.b();
                } catch (Exception e) {
                    Log.e("LocationClientImpl", "Client disconnected before listeners could be cleaned up", e);
                }
            }
            super.f();
        }
    }
}
