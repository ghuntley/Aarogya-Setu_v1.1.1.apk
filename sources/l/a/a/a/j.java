package l.a.a.a;

import l.a.a.a.o.b.w;
import l.a.a.a.o.c.e;
import l.a.a.a.o.c.f;

/* compiled from: InitializationTask */
public class j<Result> extends f<Void, Void, Result> {
    public final k<Result> s;

    public j(k<Result> kVar) {
        this.s = kVar;
    }

    public final w a(String str) {
        w wVar = new w(this.s.getIdentifier() + "." + str, "KitInitialization");
        wVar.a();
        return wVar;
    }

    public e getPriority() {
        return e.HIGH;
    }
}
