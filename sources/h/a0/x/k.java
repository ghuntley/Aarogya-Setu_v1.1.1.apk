package h.a0.x;

import h.a0.l;
import h.a0.x.r.o.c;

/* compiled from: WorkerWrapper */
public class k implements Runnable {
    public final /* synthetic */ c e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ m f963f;

    public k(m mVar, c cVar) {
        this.f963f = mVar;
        this.e = cVar;
    }

    public void run() {
        try {
            l.a().a(m.x, String.format("Starting work for %s", new Object[]{this.f963f.f969i.c}), new Throwable[0]);
            this.f963f.v = this.f963f.f970j.b();
            this.e.b(this.f963f.v);
        } catch (Throwable th) {
            this.e.a(th);
        }
    }
}
