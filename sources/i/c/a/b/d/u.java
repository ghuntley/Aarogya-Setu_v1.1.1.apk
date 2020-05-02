package i.c.a.b.d;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public final /* synthetic */ class u implements Callable {
    public final boolean e;

    /* renamed from: f  reason: collision with root package name */
    public final String f3168f;

    /* renamed from: g  reason: collision with root package name */
    public final t f3169g;

    public u(boolean z, String str, t tVar) {
        this.e = z;
        this.f3168f = str;
        this.f3169g = tVar;
    }

    public final Object call() {
        boolean z = this.e;
        String str = this.f3168f;
        t tVar = this.f3169g;
        boolean z2 = true;
        if (z || !s.b(str, tVar, true, false).a) {
            z2 = false;
        }
        return b0.a(str, tVar, z, z2);
    }
}
