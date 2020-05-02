package f.a;

import f.a.a.b;
import f.a.a.m;
import f.a.b1.h;
import f.a.b1.i;
import java.util.concurrent.CancellationException;
import kotlin.TypeCastException;
import n.k.c;
import n.k.e;
import n.m.c.f;

/* compiled from: Dispatched.kt */
public abstract class b0<T> extends h {

    /* renamed from: g  reason: collision with root package name */
    public int f800g;

    public b0(int i2) {
        this.f800g = i2;
    }

    public void a(Object obj, Throwable th) {
        if (th == null) {
            f.a("cause");
            throw null;
        }
    }

    public <T> T b(Object obj) {
        return obj;
    }

    public abstract c<T> e();

    public abstract Object f();

    public final void run() {
        Object obj;
        e c;
        Object b2;
        Object obj2;
        i iVar = this.f836f;
        try {
            c e = e();
            if (e != null) {
                z zVar = (z) e;
                c<T> cVar = zVar.f872l;
                c = cVar.c();
                Object f2 = f();
                b2 = b.b(c, zVar.f870j);
                m mVar = (m) (!(f2 instanceof m) ? null : f2);
                Throwable th = mVar != null ? mVar.a : null;
                p0 p0Var = i.c.d.p.e.b(this.f800g) ? (p0) c.get(p0.d) : null;
                if (th == null && p0Var != null && !p0Var.a()) {
                    CancellationException f3 = p0Var.f();
                    a(f2, (Throwable) f3);
                    cVar.a(i.c.d.p.e.a(m.a(f3, cVar)));
                } else if (th != null) {
                    cVar.a(i.c.d.p.e.a(m.a(th, cVar)));
                } else {
                    cVar.a(b(f2));
                }
                b.a(c, b2);
                try {
                    iVar.j();
                    obj2 = n.h.a;
                } catch (Throwable th2) {
                    obj2 = i.c.d.p.e.a(th2);
                }
                a((Throwable) null, n.e.b(obj2));
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.DispatchedContinuation<T>");
        } catch (Throwable th3) {
            try {
                iVar.j();
                obj = n.h.a;
                n.e.a(obj);
            } catch (Throwable th4) {
                obj = i.c.d.p.e.a(th4);
            }
            a(th3, n.e.b(obj));
        }
    }

    public final void a(Throwable th, Throwable th2) {
        if (th != null || th2 != null) {
            if (!(th == null || th2 == null)) {
                i.c.d.p.e.a(th, th2);
            }
            if (th == null) {
                th = th2;
            }
            String str = "Fatal exception in coroutines machinery for " + this + ". " + "Please read KDoc to 'handleFatalException' method and report this incident to maintainers";
            if (th != null) {
                i.c.d.p.e.a(e().c(), (Throwable) new w(str, th));
                return;
            }
            f.a();
            throw null;
        }
    }
}
