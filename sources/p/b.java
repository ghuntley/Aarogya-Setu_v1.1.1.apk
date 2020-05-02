package p;

import i.a.a.a.a;
import java.io.IOException;

/* compiled from: AsyncTimeout */
public class b implements a0 {
    public final /* synthetic */ a0 e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ c f5638f;

    public b(c cVar, a0 a0Var) {
        this.f5638f = cVar;
        this.e = a0Var;
    }

    public long b(f fVar, long j2) {
        this.f5638f.f();
        try {
            long b2 = this.e.b(fVar, j2);
            this.f5638f.a(true);
            return b2;
        } catch (IOException e2) {
            e = e2;
            c cVar = this.f5638f;
            if (cVar.g()) {
                e = cVar.a(e);
            }
            throw e;
        } catch (Throwable th) {
            this.f5638f.a(false);
            throw th;
        }
    }

    public b0 c() {
        return this.f5638f;
    }

    public void close() {
        this.f5638f.f();
        try {
            this.e.close();
            this.f5638f.a(true);
        } catch (IOException e2) {
            e = e2;
            c cVar = this.f5638f;
            if (cVar.g()) {
                e = cVar.a(e);
            }
            throw e;
        } catch (Throwable th) {
            this.f5638f.a(false);
            throw th;
        }
    }

    public String toString() {
        StringBuilder a = a.a("AsyncTimeout.source(");
        a.append(this.e);
        a.append(")");
        return a.toString();
    }
}
