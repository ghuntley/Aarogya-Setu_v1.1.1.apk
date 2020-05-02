package i.c.a.b.i.a;

import i.c.a.b.d.l.q;

/* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
public abstract class r9 extends k6 implements m6 {

    /* renamed from: b  reason: collision with root package name */
    public final t9 f3858b;
    public boolean c;

    public r9(t9 t9Var) {
        super(t9Var.f3896i);
        q.a(t9Var);
        this.f3858b = t9Var;
        t9Var.f3901n++;
    }

    public final void m() {
        if (!this.c) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void o() {
        if (!this.c) {
            p();
            this.f3858b.f3902o++;
            this.c = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    public abstract boolean p();

    public x9 q() {
        return this.f3858b.f();
    }

    public d r() {
        return this.f3858b.d();
    }

    public n5 s() {
        return this.f3858b.b();
    }
}
