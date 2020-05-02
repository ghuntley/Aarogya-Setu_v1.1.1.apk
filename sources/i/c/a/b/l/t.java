package i.c.a.b.l;

public final class t implements Runnable {
    public final /* synthetic */ g e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ s f4015f;

    public t(s sVar, g gVar) {
        this.f4015f = sVar;
        this.e = gVar;
    }

    public final void run() {
        synchronized (this.f4015f.f4014b) {
            if (this.f4015f.c != null) {
                this.f4015f.c.a(this.e);
            }
        }
    }
}
