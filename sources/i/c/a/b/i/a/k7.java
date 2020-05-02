package i.c.a.b.i.a;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class k7 implements Runnable {
    public final /* synthetic */ AtomicReference e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ t6 f3739f;

    public k7(t6 t6Var, AtomicReference atomicReference) {
        this.f3739f = t6Var;
        this.e = atomicReference;
    }

    public final void run() {
        synchronized (this.e) {
            try {
                AtomicReference atomicReference = this.e;
                pa paVar = this.f3739f.a.f3861g;
                j4 q2 = this.f3739f.q();
                q2.w();
                atomicReference.set(Integer.valueOf(paVar.b(q2.c, o.N)));
                this.e.notify();
            } catch (Throwable th) {
                this.e.notify();
                throw th;
            }
        }
    }
}
