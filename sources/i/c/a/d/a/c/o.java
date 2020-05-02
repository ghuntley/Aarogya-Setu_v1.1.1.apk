package i.c.a.d.a.c;

public final class o extends k {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ j f4313f;

    public o(j jVar) {
        this.f4313f = jVar;
    }

    public final void a() {
        j jVar = this.f4313f;
        if (jVar.f4310k != null) {
            jVar.f4304b.a(4, "Unbind from service.", new Object[0]);
            j jVar2 = this.f4313f;
            jVar2.a.unbindService(jVar2.f4309j);
            j jVar3 = this.f4313f;
            jVar3.e = false;
            jVar3.f4310k = null;
            jVar3.f4309j = null;
        }
    }
}
