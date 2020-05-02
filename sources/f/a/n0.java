package f.a;

import i.a.a.a.a;
import i.c.d.p.e;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import n.h;
import n.m.b.b;
import n.m.c.f;

/* compiled from: JobSupport.kt */
public final class n0 extends q0<p0> {

    /* renamed from: j  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f859j = AtomicIntegerFieldUpdater.newUpdater(n0.class, "_invoked");
    public volatile int _invoked;

    /* renamed from: i  reason: collision with root package name */
    public final b<Throwable, h> f860i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n0(p0 p0Var, b<? super Throwable, h> bVar) {
        super(p0Var);
        if (p0Var == null) {
            f.a("job");
            throw null;
        } else if (bVar != null) {
            this.f860i = bVar;
            this._invoked = 0;
        } else {
            f.a("handler");
            throw null;
        }
    }

    public Object a(Object obj) {
        Throwable th = (Throwable) obj;
        if (f859j.compareAndSet(this, 0, 1)) {
            this.f860i.a(th);
        }
        return h.a;
    }

    public String toString() {
        StringBuilder a = a.a("InvokeOnCancelling[");
        a.append(e.b((Object) this));
        a.append('@');
        a.append(e.c((Object) this));
        a.append(']');
        return a.toString();
    }
}
