package i.c.a.d.a.c;

import com.google.android.play.core.internal.aa;
import i.c.a.d.a.e.g;

public final class l extends k {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ k f4311f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ j f4312g;

    public l(j jVar, k kVar) {
        this.f4312g = jVar;
        this.f4311f = kVar;
    }

    public final void a() {
        j jVar = this.f4312g;
        k kVar = this.f4311f;
        if (jVar.f4310k == null && !jVar.e) {
            jVar.f4304b.a(4, "Initiate binding to the service.", new Object[0]);
            jVar.d.add(kVar);
            p pVar = new p(jVar, (byte) 0);
            jVar.f4309j = pVar;
            jVar.e = true;
            if (!jVar.a.bindService(jVar.f4305f, pVar, 1)) {
                jVar.f4304b.a(4, "Failed to bind to the service.", new Object[0]);
                jVar.e = false;
                for (k kVar2 : jVar.d) {
                    g<?> gVar = kVar2.e;
                    if (gVar != null) {
                        gVar.a.a((Exception) new aa());
                    }
                }
                jVar.d.clear();
            }
        } else if (jVar.e) {
            jVar.f4304b.a(4, "Waiting to bind to the service.", new Object[0]);
            jVar.d.add(kVar);
        } else {
            kVar.run();
        }
    }
}
