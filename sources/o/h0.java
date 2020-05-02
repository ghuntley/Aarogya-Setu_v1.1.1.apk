package o;

import javax.annotation.Nullable;
import p.g;

/* compiled from: RequestBody */
public class h0 extends i0 {
    public final /* synthetic */ a0 a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f5311b;
    public final /* synthetic */ byte[] c;
    public final /* synthetic */ int d;

    public h0(a0 a0Var, int i2, byte[] bArr, int i3) {
        this.a = a0Var;
        this.f5311b = i2;
        this.c = bArr;
        this.d = i3;
    }

    public long a() {
        return (long) this.f5311b;
    }

    @Nullable
    public a0 b() {
        return this.a;
    }

    public void a(g gVar) {
        gVar.write(this.c, this.d, this.f5311b);
    }
}
