package i.b.a.n.m;

import i.b.a.n.e;
import i.b.a.n.l.d;
import i.b.a.n.m.g;
import i.b.a.n.n.n;

/* compiled from: SourceGenerator */
public class z implements d.a<Object> {
    public final /* synthetic */ n.a e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ a0 f2676f;

    public z(a0 a0Var, n.a aVar) {
        this.f2676f = a0Var;
        this.e = aVar;
    }

    public void a(Object obj) {
        a0 a0Var = this.f2676f;
        n.a<?> aVar = this.e;
        n.a<?> aVar2 = a0Var.f2532j;
        if (aVar2 != null && aVar2 == aVar) {
            a0 a0Var2 = this.f2676f;
            n.a aVar3 = this.e;
            k kVar = a0Var2.e.f2588p;
            if (obj == null || !kVar.a(aVar3.c.c())) {
                g.a aVar4 = a0Var2.f2528f;
                e eVar = aVar3.a;
                d<Data> dVar = aVar3.c;
                aVar4.a(eVar, obj, dVar, dVar.c(), a0Var2.f2533k);
                return;
            }
            a0Var2.f2531i = obj;
            a0Var2.f2528f.f();
        }
    }

    public void a(Exception exc) {
        a0 a0Var = this.f2676f;
        n.a<?> aVar = this.e;
        n.a<?> aVar2 = a0Var.f2532j;
        if (aVar2 != null && aVar2 == aVar) {
            a0 a0Var2 = this.f2676f;
            n.a aVar3 = this.e;
            g.a aVar4 = a0Var2.f2528f;
            e eVar = a0Var2.f2533k;
            d<Data> dVar = aVar3.c;
            aVar4.a(eVar, exc, dVar, dVar.c());
        }
    }
}
