package i.c.a.b.i.a;

import i.c.a.b.d.l.q;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
public final class t4 implements Runnable {
    public final u4 e;

    /* renamed from: f  reason: collision with root package name */
    public final int f3874f;

    /* renamed from: g  reason: collision with root package name */
    public final Throwable f3875g;

    /* renamed from: h  reason: collision with root package name */
    public final byte[] f3876h;

    /* renamed from: i  reason: collision with root package name */
    public final String f3877i;

    /* renamed from: j  reason: collision with root package name */
    public final Map<String, List<String>> f3878j;

    public /* synthetic */ t4(String str, u4 u4Var, int i2, Throwable th, byte[] bArr, Map map, r4 r4Var) {
        q.a(u4Var);
        this.e = u4Var;
        this.f3874f = i2;
        this.f3875g = th;
        this.f3876h = bArr;
        this.f3877i = str;
        this.f3878j = map;
    }

    public final void run() {
        this.e.a(this.f3877i, this.f3874f, this.f3875g, this.f3876h, this.f3878j);
    }
}
