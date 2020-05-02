package i.c.a.d.a.c;

import android.os.IBinder;

public final /* synthetic */ class m implements IBinder.DeathRecipient {
    public final j a;

    public m(j jVar) {
        this.a = jVar;
    }

    public final void binderDied() {
        j jVar = this.a;
        jVar.f4304b.a(4, "reportBinderDeath", new Object[0]);
        n nVar = (n) jVar.f4307h.get();
        if (nVar != null) {
            jVar.f4304b.a(4, "calling onBinderDied", new Object[0]);
            nVar.a();
        }
    }
}
