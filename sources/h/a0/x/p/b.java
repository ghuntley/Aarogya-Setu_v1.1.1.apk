package h.a0.x.p;

import androidx.work.impl.WorkDatabase;
import h.a0.x.q.p;
import h.a0.x.q.r;

/* compiled from: SystemForegroundDispatcher */
public class b implements Runnable {
    public final /* synthetic */ WorkDatabase e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ String f1037f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ c f1038g;

    public b(c cVar, WorkDatabase workDatabase, String str) {
        this.f1038g = cVar;
        this.e = workDatabase;
        this.f1037f = str;
    }

    public void run() {
        p c = ((r) this.e.n()).c(this.f1037f);
        if (c != null && c.b()) {
            synchronized (this.f1038g.f1042h) {
                this.f1038g.f1046l.put(this.f1037f, c);
                this.f1038g.f1047m.add(c);
            }
            c cVar = this.f1038g;
            cVar.f1048n.a((Iterable<p>) cVar.f1047m);
        }
    }
}
