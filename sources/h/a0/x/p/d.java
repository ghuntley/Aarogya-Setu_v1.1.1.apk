package h.a0.x.p;

import androidx.work.impl.foreground.SystemForegroundService;
import h.a0.h;
import h.a0.l;
import h.a0.x.p.c;

/* compiled from: SystemForegroundService */
public class d implements Runnable {
    public final /* synthetic */ SystemForegroundService e;

    public d(SystemForegroundService systemForegroundService) {
        this.e = systemForegroundService;
    }

    public void run() {
        c cVar = this.e.f390h;
        if (cVar != null) {
            l.a().c(c.f1039p, "Stopping foreground service", new Throwable[0]);
            c.a aVar = cVar.f1049o;
            if (aVar != null) {
                h hVar = cVar.f1044j;
                if (hVar != null) {
                    aVar.a(hVar.a);
                    cVar.f1044j = null;
                }
                cVar.f1049o.stop();
                return;
            }
            return;
        }
        throw null;
    }
}
