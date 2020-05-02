package i.c.a.b.l;

public final class r implements Runnable {
    public final /* synthetic */ q e;

    public r(q qVar) {
        this.e = qVar;
    }

    public final void run() {
        synchronized (this.e.f4013b) {
            if (this.e.c != null) {
                this.e.c.a();
            }
        }
    }
}
