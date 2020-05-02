package i.c.d.k;

import android.content.Context;
import android.util.Log;
import i.c.a.b.g.e.a;
import i.c.a.b.g.e.b;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.firebase:firebase-iid@@20.1.2 */
public final class g {
    @GuardedBy("MessengerIpcClient.class")
    public static g e;
    public final Context a;

    /* renamed from: b  reason: collision with root package name */
    public final ScheduledExecutorService f4693b;
    @GuardedBy("this")
    public i c = new i(this, (f) null);
    @GuardedBy("this")
    public int d = 1;

    public g(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f4693b = scheduledExecutorService;
        this.a = context.getApplicationContext();
    }

    public static synchronized g a(Context context) {
        g gVar;
        synchronized (g.class) {
            if (e == null) {
                b bVar = a.a;
                e = new g(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new i.c.a.b.d.o.h.a("MessengerIpcClient"))));
            }
            gVar = e;
        }
        return gVar;
    }

    public final synchronized <T> i.c.a.b.l.g<T> a(p<T> pVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(pVar);
            StringBuilder sb = new StringBuilder(valueOf.length() + 9);
            sb.append("Queueing ");
            sb.append(valueOf);
            Log.d("MessengerIpcClient", sb.toString());
        }
        if (!this.c.a((p<?>) pVar)) {
            i iVar = new i(this, (f) null);
            this.c = iVar;
            iVar.a((p<?>) pVar);
        }
        return pVar.f4710b.a;
    }

    public final synchronized int a() {
        int i2;
        i2 = this.d;
        this.d = i2 + 1;
        return i2;
    }
}
