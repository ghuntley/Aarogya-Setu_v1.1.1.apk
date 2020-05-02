package i.c.a.a.j;

import i.c.a.a.a;
import i.c.a.a.b;
import i.c.a.a.c;
import i.c.a.a.d;
import i.c.a.a.e;
import i.c.a.a.f;
import i.c.a.a.j.a;
import i.c.a.a.j.b;
import i.c.a.a.j.h;
import i.c.d.o.m;
import java.util.HashMap;

/* compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
public final class k<T> implements f<T> {
    public final h a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2948b;
    public final b c;
    public final e<T, byte[]> d;
    public final l e;

    public k(h hVar, String str, b bVar, e<T, byte[]> eVar, l lVar) {
        this.a = hVar;
        this.f2948b = str;
        this.c = bVar;
        this.d = eVar;
        this.e = lVar;
    }

    public void a(c<T> cVar) {
        j jVar = j.a;
        l lVar = this.e;
        h hVar = this.a;
        if (hVar == null) {
            throw new NullPointerException("Null transportContext");
        } else if (cVar != null) {
            String str = this.f2948b;
            if (str != null) {
                e<T, byte[]> eVar = this.d;
                if (eVar != null) {
                    b bVar = this.c;
                    if (bVar != null) {
                        m mVar = (m) lVar;
                        i.c.a.a.j.r.e eVar2 = mVar.c;
                        a aVar = (a) cVar;
                        d dVar = aVar.c;
                        h.a a2 = h.a();
                        b bVar2 = (b) hVar;
                        a2.a(bVar2.a);
                        a2.a(dVar);
                        b.C0103b bVar3 = (b.C0103b) a2;
                        bVar3.f2934b = bVar2.f2933b;
                        h a3 = bVar3.a();
                        a.b bVar4 = new a.b();
                        bVar4.f2932f = new HashMap();
                        bVar4.a(mVar.a.a());
                        bVar4.b(mVar.f2949b.a());
                        bVar4.a(str);
                        m mVar2 = (m) eVar;
                        bVar4.a(new e(bVar, ((String) aVar.f2872b).getBytes()));
                        bVar4.f2931b = aVar.a;
                        eVar2.a(a3, bVar4.a(), jVar);
                        return;
                    }
                    throw new NullPointerException("Null encoding");
                }
                throw new NullPointerException("Null transformer");
            }
            throw new NullPointerException("Null transportName");
        } else {
            throw new NullPointerException("Null event");
        }
    }
}
