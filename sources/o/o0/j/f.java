package o.o0.j;

import java.io.IOException;
import java.util.List;
import o.o0.d;
import o.o0.j.o;

/* compiled from: Http2Connection */
public class f extends d {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f5538f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ List f5539g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ boolean f5540h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ e f5541i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(e eVar, String str, Object[] objArr, int i2, List list, boolean z) {
        super(str, objArr);
        this.f5541i = eVar;
        this.f5538f = i2;
        this.f5539g = list;
        this.f5540h = z;
    }

    public void a() {
        e eVar = this.f5541i;
        o oVar = eVar.f5510n;
        int i2 = this.f5538f;
        if (((o.a) oVar) != null) {
            try {
                eVar.z.a(i2, a.CANCEL);
                synchronized (this.f5541i) {
                    this.f5541i.B.remove(Integer.valueOf(this.f5538f));
                }
            } catch (IOException unused) {
            }
        } else {
            throw null;
        }
    }
}
