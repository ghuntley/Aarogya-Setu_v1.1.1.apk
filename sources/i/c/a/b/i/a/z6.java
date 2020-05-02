package i.c.a.b.i.a;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class z6 implements Runnable {
    public final /* synthetic */ AtomicReference e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ boolean f3972f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ t6 f3973g;

    public z6(t6 t6Var, AtomicReference atomicReference, boolean z) {
        this.f3973g = t6Var;
        this.e = atomicReference;
        this.f3972f = z;
    }

    public final void run() {
        z7 r = this.f3973g.r();
        AtomicReference atomicReference = this.e;
        boolean z = this.f3972f;
        r.c();
        r.w();
        r.a((Runnable) new f8(r, atomicReference, r.a(false), z));
    }
}
