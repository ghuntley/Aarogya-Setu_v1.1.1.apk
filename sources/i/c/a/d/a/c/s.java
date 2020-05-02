package i.c.a.d.a.c;

import android.os.IBinder;
import android.os.RemoteException;
import i.c.a.d.a.a.e;

public final class s extends k {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ IBinder f4315f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ p f4316g;

    public s(p pVar, IBinder iBinder) {
        this.f4316g = pVar;
        this.f4315f = iBinder;
    }

    public final void a() {
        j jVar = this.f4316g.a;
        q<T> qVar = jVar.f4306g;
        IBinder iBinder = this.f4315f;
        if (((e) qVar) != null) {
            jVar.f4310k = g.a(iBinder);
            j jVar2 = this.f4316g.a;
            jVar2.f4304b.a(4, "linkToDeath", new Object[0]);
            try {
                jVar2.f4310k.asBinder().linkToDeath(jVar2.f4308i, 0);
            } catch (RemoteException e) {
                jVar2.f4304b.a((Throwable) e, "linkToDeath failed", new Object[0]);
            }
            j jVar3 = this.f4316g.a;
            jVar3.e = false;
            for (k run : jVar3.d) {
                run.run();
            }
            this.f4316g.a.d.clear();
            return;
        }
        throw null;
    }
}
