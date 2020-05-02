package i.c.a.b.l;

public final class v implements Runnable {
    public final /* synthetic */ g e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ u f4017f;

    public v(u uVar, g gVar) {
        this.f4017f = uVar;
        this.e = gVar;
    }

    public final void run() {
        synchronized (this.f4017f.f4016b) {
            if (this.f4017f.c != null) {
                this.f4017f.c.a(this.e.a());
            }
        }
    }
}
