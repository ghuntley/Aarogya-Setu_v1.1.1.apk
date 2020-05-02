package i.c.a.b.i.a;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class g7 implements Runnable {
    public final /* synthetic */ AtomicReference e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ String f3683f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ String f3684g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ String f3685h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ t6 f3686i;

    public g7(t6 t6Var, AtomicReference atomicReference, String str, String str2, String str3) {
        this.f3686i = t6Var;
        this.e = atomicReference;
        this.f3683f = str;
        this.f3684g = str2;
        this.f3685h = str3;
    }

    public final void run() {
        z7 t = this.f3686i.a.t();
        AtomicReference atomicReference = this.e;
        String str = this.f3683f;
        String str2 = this.f3684g;
        String str3 = this.f3685h;
        t.c();
        t.w();
        t.a((Runnable) new o8(t, atomicReference, str, str2, str3, t.a(false)));
    }
}
