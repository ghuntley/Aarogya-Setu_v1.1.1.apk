package i.c.a.b.i.a;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class h7 implements Runnable {
    public final /* synthetic */ AtomicReference e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ t6 f3694f;

    public h7(t6 t6Var, AtomicReference atomicReference) {
        this.f3694f = t6Var;
        this.e = atomicReference;
    }

    public final void run() {
        synchronized (this.e) {
            try {
                AtomicReference atomicReference = this.e;
                pa paVar = this.f3694f.a.f3861g;
                j4 q2 = this.f3694f.q();
                q2.w();
                atomicReference.set(Long.valueOf(paVar.a(q2.c, o.M)));
                this.e.notify();
            } catch (Throwable th) {
                this.e.notify();
                throw th;
            }
        }
    }
}
