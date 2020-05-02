package i.c.a.a.j.r;

import i.c.a.a.j.b;
import i.c.a.a.j.f;
import i.c.a.a.j.h;
import i.c.a.a.j.j;
import i.c.a.a.j.m;
import i.c.a.a.j.p.e;
import i.c.a.a.j.r.h.r;
import i.c.a.a.j.s.a;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
public class c implements e {

    /* renamed from: f  reason: collision with root package name */
    public static final Logger f2966f = Logger.getLogger(m.class.getName());
    public final r a;

    /* renamed from: b  reason: collision with root package name */
    public final Executor f2967b;
    public final e c;
    public final i.c.a.a.j.r.i.c d;
    public final a e;

    public c(Executor executor, e eVar, r rVar, i.c.a.a.j.r.i.c cVar, a aVar) {
        this.f2967b = executor;
        this.c = eVar;
        this.a = rVar;
        this.d = cVar;
        this.e = aVar;
    }

    public void a(h hVar, f fVar, i.c.a.a.h hVar2) {
        this.f2967b.execute(new a(this, hVar, hVar2, fVar));
    }

    public static /* synthetic */ void a(c cVar, h hVar, i.c.a.a.h hVar2, f fVar) {
        try {
            i.c.a.a.j.p.m a2 = cVar.c.a(((b) hVar).a);
            if (a2 == null) {
                String format = String.format("Transport backend '%s' is not registered", new Object[]{((b) hVar).a});
                f2966f.warning(format);
                new IllegalArgumentException(format);
                if (((j) hVar2) == null) {
                    throw null;
                }
                return;
            }
            cVar.e.a(new b(cVar, hVar, a2.a(fVar)));
            if (((j) hVar2) == null) {
                throw null;
            }
        } catch (Exception e2) {
            Logger logger = f2966f;
            StringBuilder a3 = i.a.a.a.a.a("Error scheduling event ");
            a3.append(e2.getMessage());
            logger.warning(a3.toString());
            if (((j) hVar2) == null) {
                throw null;
            }
        }
    }
}
