package o.o0.j;

import o.o0.d;
import o.o0.j.o;

/* compiled from: Http2Connection */
public class h extends d {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f5547f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ a f5548g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ e f5549h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(e eVar, String str, Object[] objArr, int i2, a aVar) {
        super(str, objArr);
        this.f5549h = eVar;
        this.f5547f = i2;
        this.f5548g = aVar;
    }

    public void a() {
        e eVar = this.f5549h;
        if (((o.a) eVar.f5510n) != null) {
            synchronized (eVar) {
                this.f5549h.B.remove(Integer.valueOf(this.f5547f));
            }
            return;
        }
        throw null;
    }
}
