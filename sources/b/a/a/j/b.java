package b.a.a.j;

import o.f0;
import o.i0;
import o.j0;
import o.o0.h.f;
import o.z;

/* compiled from: GzipRequestInterceptor */
public class b implements z {
    public j0 a(z.a aVar) {
        f0 f0Var = ((f) aVar).e;
        if (f0Var.d == null || f0Var.c.a("Content-Encoding") != null) {
            return ((f) aVar).a(f0Var);
        }
        f0.a aVar2 = new f0.a(f0Var);
        aVar2.a("Content-Encoding", "gzip");
        aVar2.a(f0Var.f5307b, (i0) new a(this, f0Var.d));
        return ((f) aVar).a(aVar2.a());
    }
}
