package i.c.a.b.i.a;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class i7 implements Runnable {
    public final /* synthetic */ AtomicReference e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ String f3714f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ String f3715g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ String f3716h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ boolean f3717i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ t6 f3718j;

    public i7(t6 t6Var, AtomicReference atomicReference, String str, String str2, String str3, boolean z) {
        this.f3718j = t6Var;
        this.e = atomicReference;
        this.f3714f = str;
        this.f3715g = str2;
        this.f3716h = str3;
        this.f3717i = z;
    }

    public final void run() {
        z7 t = this.f3718j.a.t();
        AtomicReference atomicReference = this.e;
        String str = this.f3714f;
        String str2 = this.f3715g;
        String str3 = this.f3716h;
        boolean z = this.f3717i;
        t.c();
        t.w();
        t.a((Runnable) new q8(t, atomicReference, str, str2, str3, z, t.a(false)));
    }
}
