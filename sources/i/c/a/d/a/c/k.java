package i.c.a.d.a.c;

import i.c.a.d.a.e.g;

public abstract class k implements Runnable {
    public final g<?> e;

    public k() {
        this.e = null;
    }

    public k(g<?> gVar) {
        this.e = gVar;
    }

    public abstract void a();

    public final void run() {
        try {
            a();
        } catch (Exception e2) {
            g<?> gVar = this.e;
            if (gVar != null) {
                gVar.a.a(e2);
            }
        }
    }
}
