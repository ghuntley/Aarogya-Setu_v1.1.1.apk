package i.c.a.b.d.k.h;

import i.c.a.b.d.d;
import i.c.a.b.d.k.a;
import i.c.a.b.d.k.a.b;
import i.c.a.b.g.b.j;
import i.c.a.b.l.h;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public abstract class n<A extends a.b, ResultT> {
    public final d[] a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f3075b;

    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public static class a<A extends a.b, ResultT> {
        public j<A, h<ResultT>> a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f3076b = true;
        public d[] c;

        public /* synthetic */ a(j0 j0Var) {
        }
    }

    @Deprecated
    public n() {
        this.a = null;
        this.f3075b = false;
    }

    public abstract void a(A a2, h<ResultT> hVar);

    public /* synthetic */ n(d[] dVarArr, boolean z, j0 j0Var) {
        this.a = dVarArr;
        this.f3075b = z;
    }
}
