package i.c.a.d.a.a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import i.c.a.d.a.b.b;
import i.c.a.d.a.c.e;
import i.c.a.d.a.c.j;
import i.c.a.d.a.c.l;
import i.c.a.d.a.d.a;
import i.c.a.d.a.e.g;
import i.c.a.d.a.e.h;

public final class d implements b {
    public final f a;

    /* renamed from: b  reason: collision with root package name */
    public final c f4292b;
    public final Context c;

    public d(f fVar, Context context) {
        this.a = fVar;
        this.f4292b = new c(context);
        this.c = context;
    }

    public final h<a> a() {
        f fVar = this.a;
        String packageName = this.c.getPackageName();
        if (fVar != null) {
            f.d.a(4, "requestUpdateInfo(%s)", new Object[]{packageName});
            g gVar = new g();
            j<e> jVar = fVar.a;
            h hVar = new h(fVar, gVar, packageName, gVar);
            if (jVar != null) {
                jVar.a().post(new l(jVar, hVar));
                return gVar.a;
            }
            throw null;
        }
        throw null;
    }

    public final synchronized void a(b bVar) {
        this.f4292b.a((a) bVar);
    }

    public final synchronized void b(b bVar) {
        this.f4292b.b((a) bVar);
    }

    public final boolean a(a aVar, int i2, Activity activity, int i3) {
        if (!aVar.a(i2)) {
            return false;
        }
        activity.startIntentSenderForResult((i2 == 0 ? aVar.c : i2 == 1 ? aVar.f4289b : null).getIntentSender(), i3, (Intent) null, 0, 0, 0);
        return true;
    }
}
