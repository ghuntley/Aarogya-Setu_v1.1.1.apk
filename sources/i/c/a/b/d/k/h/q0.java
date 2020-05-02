package i.c.a.b.d.k.h;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import i.c.a.b.d.d;
import i.c.a.b.d.k.a;
import i.c.a.b.d.k.h.g;
import i.c.a.b.l.c;
import i.c.a.b.l.d0;
import i.c.a.b.l.h;
import i.c.a.b.l.i;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class q0<ResultT> extends u {
    public final n<a.b, ResultT> a;

    /* renamed from: b  reason: collision with root package name */
    public final h<ResultT> f3079b;
    public final a c;

    public q0(int i2, n<a.b, ResultT> nVar, h<ResultT> hVar, a aVar) {
        super(i2);
        this.f3079b = hVar;
        this.a = nVar;
        this.c = aVar;
    }

    public final void a(g.a<?> aVar) {
        try {
            this.a.a(aVar.f3054b, this.f3079b);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            a(e0.a(e2));
        } catch (RuntimeException e3) {
            this.f3079b.a.b((Exception) e3);
        }
    }

    public final d[] b(g.a<?> aVar) {
        return this.a.a;
    }

    public final boolean c(g.a<?> aVar) {
        return this.a.f3075b;
    }

    public final void a(Status status) {
        h<ResultT> hVar = this.f3079b;
        if (this.c != null) {
            hVar.a.b((Exception) g.a.a.b.a.a(status));
            return;
        }
        throw null;
    }

    public final void a(RuntimeException runtimeException) {
        this.f3079b.a.b((Exception) runtimeException);
    }

    public final void a(x0 x0Var, boolean z) {
        h<ResultT> hVar = this.f3079b;
        x0Var.f3082b.put(hVar, Boolean.valueOf(z));
        d0<TResult> d0Var = hVar.a;
        p pVar = new p(x0Var, hVar);
        if (d0Var != null) {
            d0Var.a(i.a, (c<TResult>) pVar);
            return;
        }
        throw null;
    }
}
