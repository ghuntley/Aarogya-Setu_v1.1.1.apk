package i.c.a.d.a.a;

import android.os.Bundle;
import i.c.a.d.a.c.a;
import i.c.a.d.a.c.e;
import i.c.a.d.a.c.h;
import i.c.a.d.a.c.o;
import i.c.a.d.a.e.g;

public class j<T> extends h {
    public final a a;

    /* renamed from: b  reason: collision with root package name */
    public final g<T> f4300b;
    public final /* synthetic */ f c;

    public j(f fVar, a aVar, g<T> gVar) {
        this.c = fVar;
        this.a = aVar;
        this.f4300b = gVar;
    }

    public void c(Bundle bundle) {
        i.c.a.d.a.c.j<e> jVar = this.c.a;
        if (jVar != null) {
            jVar.a().post(new o(jVar));
            this.a.a(4, "onCompleteUpdate", new Object[0]);
            return;
        }
        throw null;
    }

    public void d(Bundle bundle) {
        i.c.a.d.a.c.j<e> jVar = this.c.a;
        if (jVar != null) {
            jVar.a().post(new o(jVar));
            this.a.a(4, "onRequestInfo", new Object[0]);
            return;
        }
        throw null;
    }
}
