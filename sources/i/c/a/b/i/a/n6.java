package i.c.a.b.i.a;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public abstract class n6 extends k6 {

    /* renamed from: b  reason: collision with root package name */
    public boolean f3787b;

    public n6(s5 s5Var) {
        super(s5Var);
        this.a.D++;
    }

    public void m() {
    }

    public final void o() {
        if (!s()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void p() {
        if (this.f3787b) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!r()) {
            this.a.E.incrementAndGet();
            this.f3787b = true;
        }
    }

    public final void q() {
        if (!this.f3787b) {
            m();
            this.a.E.incrementAndGet();
            this.f3787b = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    public abstract boolean r();

    public final boolean s() {
        return this.f3787b;
    }
}
