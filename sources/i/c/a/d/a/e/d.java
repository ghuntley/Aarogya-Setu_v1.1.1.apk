package i.c.a.d.a.e;

public final class d implements Runnable {
    public final /* synthetic */ h e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ c f4318f;

    public d(c cVar, h hVar) {
        this.f4318f = cVar;
        this.e = hVar;
    }

    public final void run() {
        synchronized (this.f4318f.f4317b) {
            if (this.f4318f.c != null) {
                this.f4318f.c.a(this.e.b());
            }
        }
    }
}
