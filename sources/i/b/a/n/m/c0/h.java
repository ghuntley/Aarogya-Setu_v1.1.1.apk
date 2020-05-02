package i.b.a.n.m.c0;

import i.b.a.n.e;
import i.b.a.n.m.c0.i;
import i.b.a.n.m.l;
import i.b.a.n.m.v;
import i.b.a.t.g;

/* compiled from: LruResourceCache */
public class h extends g<e, v<?>> implements i {
    public i.a d;

    public h(long j2) {
        super(j2);
    }

    public void a(Object obj, Object obj2) {
        e eVar = (e) obj;
        v vVar = (v) obj2;
        i.a aVar = this.d;
        if (aVar != null && vVar != null) {
            ((l) aVar).e.a(vVar, true);
        }
    }

    public int b(Object obj) {
        v vVar = (v) obj;
        if (vVar == null) {
            return 1;
        }
        return vVar.b();
    }

    public /* bridge */ /* synthetic */ v a(e eVar, v vVar) {
        return (v) super.b(eVar, vVar);
    }

    public /* bridge */ /* synthetic */ v a(e eVar) {
        return (v) super.c(eVar);
    }
}
