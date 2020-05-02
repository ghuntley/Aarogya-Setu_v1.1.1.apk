package i.c.a.b.l;

public final class x implements Runnable {
    public final /* synthetic */ g e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ w f4019f;

    public x(w wVar, g gVar) {
        this.f4019f = wVar;
        this.e = gVar;
    }

    public final void run() {
        synchronized (this.f4019f.f4018b) {
            if (this.f4019f.c != null) {
                this.f4019f.c.a(this.e.b());
            }
        }
    }
}
