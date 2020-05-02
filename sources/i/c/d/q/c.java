package i.c.d.q;

import i.c.a.b.d.l.q;
import i.c.a.b.l.d0;
import i.c.a.b.l.f;
import i.c.a.b.l.f0;
import i.c.a.b.l.g;
import i.c.a.b.l.i;
import i.c.a.b.l.k;
import i.c.a.b.l.l;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.firebase:firebase-config@@19.1.3 */
public final /* synthetic */ class c implements f {
    public final g a;

    public c(g gVar) {
        this.a = gVar;
    }

    public g a(Object obj) {
        Object obj2;
        g gVar = this.a;
        Void voidR = (Void) obj;
        g<i.c.d.q.m.f> b2 = gVar.d.b();
        g<i.c.d.q.m.f> b3 = gVar.e.b();
        List<g> asList = Arrays.asList(new g[]{b2, b3});
        if (asList.isEmpty()) {
            obj2 = q.b(null);
        } else {
            for (g gVar2 : asList) {
                if (gVar2 == null) {
                    throw new NullPointerException("null tasks are not accepted");
                }
            }
            d0 d0Var = new d0();
            l lVar = new l(asList.size(), d0Var);
            for (g a2 : asList) {
                q.a((g<?>) a2, (k) lVar);
            }
            obj2 = d0Var;
        }
        return ((d0) obj2).b(i.a, new f0(asList)).b(gVar.c, new d(gVar, b2, b3));
    }
}
