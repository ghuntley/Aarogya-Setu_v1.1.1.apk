package i.b.a.n.m;

import i.b.a.n.m.a;

/* compiled from: ActiveResources */
public class b implements Runnable {
    public final /* synthetic */ a e;

    public b(a aVar) {
        this.e = aVar;
    }

    public void run() {
        a aVar = this.e;
        if (aVar != null) {
            while (true) {
                try {
                    aVar.a((a.b) aVar.c.remove());
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        } else {
            throw null;
        }
    }
}
