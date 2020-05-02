package i.c.a.b.i.a;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public abstract class c3 extends c4 {

    /* renamed from: b  reason: collision with root package name */
    public boolean f3606b;

    public c3(s5 s5Var) {
        super(s5Var);
        this.a.D++;
    }

    public void v() {
    }

    public final void w() {
        if (!this.f3606b) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void x() {
        if (this.f3606b) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!y()) {
            this.a.E.incrementAndGet();
            this.f3606b = true;
        }
    }

    public abstract boolean y();
}
