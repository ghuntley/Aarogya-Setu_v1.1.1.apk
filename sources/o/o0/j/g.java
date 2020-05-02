package o.o0.j;

import java.io.IOException;
import o.o0.d;
import o.o0.j.o;
import p.f;

/* compiled from: Http2Connection */
public class g extends d {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f5542f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ f f5543g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ int f5544h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ boolean f5545i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ e f5546j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(e eVar, String str, Object[] objArr, int i2, f fVar, int i3, boolean z) {
        super(str, objArr);
        this.f5546j = eVar;
        this.f5542f = i2;
        this.f5543g = fVar;
        this.f5544h = i3;
        this.f5545i = z;
    }

    public void a() {
        try {
            o oVar = this.f5546j.f5510n;
            f fVar = this.f5543g;
            int i2 = this.f5544h;
            if (((o.a) oVar) != null) {
                fVar.skip((long) i2);
                this.f5546j.z.a(this.f5542f, a.CANCEL);
                synchronized (this.f5546j) {
                    this.f5546j.B.remove(Integer.valueOf(this.f5542f));
                }
                return;
            }
            throw null;
        } catch (IOException unused) {
        }
    }
}
