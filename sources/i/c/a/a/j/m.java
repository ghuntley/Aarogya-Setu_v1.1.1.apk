package i.c.a.a.j;

import android.content.Context;
import i.c.a.a.j.c;
import i.c.a.a.j.r.e;
import i.c.a.a.j.r.h.l;
import i.c.a.a.j.r.h.n;
import i.c.a.a.j.r.h.p;
import i.c.a.a.j.t.a;

/* compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
public class m implements l {
    public static volatile n e;
    public final a a;

    /* renamed from: b  reason: collision with root package name */
    public final a f2949b;
    public final e c;
    public final l d;

    public m(a aVar, a aVar2, e eVar, l lVar, p pVar) {
        this.a = aVar;
        this.f2949b = aVar2;
        this.c = eVar;
        this.d = lVar;
        pVar.a.execute(new n(pVar));
    }

    public static void a(Context context) {
        if (e == null) {
            synchronized (m.class) {
                if (e == null) {
                    if (context != null) {
                        Class<Context> cls = Context.class;
                        if (context != null) {
                            e = new c(context, (c.a) null);
                        } else {
                            throw new IllegalStateException(cls.getCanonicalName() + " must be set");
                        }
                    } else {
                        throw null;
                    }
                }
            }
        }
    }

    public static m a() {
        n nVar = e;
        if (nVar != null) {
            return ((c) nVar).f2945p.get();
        }
        throw new IllegalStateException("Not initialized!");
    }
}
