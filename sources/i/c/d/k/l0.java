package i.c.d.k;

import i.c.a.b.l.c;
import i.c.a.b.l.g;
import java.util.concurrent.ScheduledFuture;

/* compiled from: com.google.firebase:firebase-iid@@20.1.2 */
public final /* synthetic */ class l0 implements c {
    public final ScheduledFuture a;

    public l0(ScheduledFuture scheduledFuture) {
        this.a = scheduledFuture;
    }

    public final void a(g gVar) {
        this.a.cancel(false);
    }
}
