package q;

import f.a.f;
import i.c.d.p.e;
import javax.annotation.Nullable;
import o.j;
import o.l0;

/* compiled from: HttpServiceMethod */
public abstract class l<ResponseT, ReturnT> extends f0<ReturnT> {
    public final c0 a;

    /* renamed from: b  reason: collision with root package name */
    public final j.a f5725b;
    public final j<l0, ResponseT> c;

    /* compiled from: HttpServiceMethod */
    public static final class a<ResponseT, ReturnT> extends l<ResponseT, ReturnT> {
        public final e<ResponseT, ReturnT> d;

        public a(c0 c0Var, j.a aVar, j<l0, ResponseT> jVar, e<ResponseT, ReturnT> eVar) {
            super(c0Var, aVar, jVar);
            this.d = eVar;
        }

        /* JADX WARNING: type inference failed for: r1v0, types: [q.d<ResponseT>, q.d] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public ReturnT a(q.d<ResponseT> r1, java.lang.Object[] r2) {
            /*
                r0 = this;
                q.e<ResponseT, ReturnT> r2 = r0.d
                java.lang.Object r1 = r2.a(r1)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: q.l.a.a(q.d, java.lang.Object[]):java.lang.Object");
        }
    }

    /* compiled from: HttpServiceMethod */
    public static final class b<ResponseT> extends l<ResponseT, Object> {
        public final e<ResponseT, d<ResponseT>> d;
        public final boolean e;

        public b(c0 c0Var, j.a aVar, j<l0, ResponseT> jVar, e<ResponseT, d<ResponseT>> eVar, boolean z) {
            super(c0Var, aVar, jVar);
            this.d = eVar;
            this.e = z;
        }

        public Object a(d<ResponseT> dVar, Object[] objArr) {
            d dVar2 = (d) this.d.a(dVar);
            n.k.c cVar = objArr[objArr.length - 1];
            try {
                if (this.e) {
                    f fVar = new f(e.a(cVar), 1);
                    fVar.a(new o(dVar2));
                    dVar2.a(new q(fVar));
                    Object g2 = fVar.g();
                    n.k.h.a aVar = n.k.h.a.COROUTINE_SUSPENDED;
                    return g2;
                }
                f fVar2 = new f(e.a(cVar), 1);
                fVar2.a(new n(dVar2));
                dVar2.a(new p(fVar2));
                Object g3 = fVar2.g();
                n.k.h.a aVar2 = n.k.h.a.COROUTINE_SUSPENDED;
                return g3;
            } catch (Exception e2) {
                return e.a(e2, (n.k.c<?>) cVar);
            }
        }
    }

    /* compiled from: HttpServiceMethod */
    public static final class c<ResponseT> extends l<ResponseT, Object> {
        public final e<ResponseT, d<ResponseT>> d;

        public c(c0 c0Var, j.a aVar, j<l0, ResponseT> jVar, e<ResponseT, d<ResponseT>> eVar) {
            super(c0Var, aVar, jVar);
            this.d = eVar;
        }

        public Object a(d<ResponseT> dVar, Object[] objArr) {
            d dVar2 = (d) this.d.a(dVar);
            n.k.c cVar = objArr[objArr.length - 1];
            try {
                f fVar = new f(e.a(cVar), 1);
                fVar.a(new r(dVar2));
                dVar2.a(new s(fVar));
                Object g2 = fVar.g();
                n.k.h.a aVar = n.k.h.a.COROUTINE_SUSPENDED;
                return g2;
            } catch (Exception e) {
                return e.a(e, (n.k.c<?>) cVar);
            }
        }
    }

    public l(c0 c0Var, j.a aVar, j<l0, ResponseT> jVar) {
        this.a = c0Var;
        this.f5725b = aVar;
        this.c = jVar;
    }

    @Nullable
    public abstract ReturnT a(d<ResponseT> dVar, Object[] objArr);
}
