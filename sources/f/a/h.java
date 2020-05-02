package f.a;

import i.a.a.a.a;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.CompletionHandlerException;
import n.k.e;
import n.m.c.f;

/* compiled from: JobSupport.kt */
public final class h extends q0<p0> {

    /* renamed from: i  reason: collision with root package name */
    public final f<?> f855i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(p0 p0Var, f<?> fVar) {
        super(p0Var);
        if (p0Var == null) {
            f.a("parent");
            throw null;
        } else if (fVar != null) {
            this.f855i = fVar;
        } else {
            f.a("child");
            throw null;
        }
    }

    public Object a(Object obj) {
        Throwable th = (Throwable) obj;
        f<?> fVar = this.f855i;
        J j2 = this.f863h;
        if (fVar == null) {
            throw null;
        } else if (j2 != null) {
            CancellationException f2 = j2.f();
            while (true) {
                Object obj2 = fVar._state;
                if (!(obj2 instanceof w0)) {
                    break;
                }
                boolean z = obj2 instanceof d;
                if (f.f845k.compareAndSet(fVar, obj2, new g(fVar, f2, z))) {
                    if (z) {
                        try {
                            ((m0) ((d) obj2)).e.a(f2);
                        } catch (Throwable th2) {
                            e eVar = fVar.f846h;
                            i.c.d.p.e.a(eVar, (Throwable) new CompletionHandlerException("Exception in cancellation handler for " + fVar, th2));
                        }
                    }
                    d0 d0Var = fVar.parentHandle;
                    if (d0Var != null) {
                        d0Var.f();
                        fVar.parentHandle = v0.e;
                    }
                    fVar.a(0);
                }
            }
            return n.h.a;
        } else {
            f.a("parent");
            throw null;
        }
    }

    public String toString() {
        StringBuilder a = a.a("ChildContinuation[");
        a.append(this.f855i);
        a.append(']');
        return a.toString();
    }
}
