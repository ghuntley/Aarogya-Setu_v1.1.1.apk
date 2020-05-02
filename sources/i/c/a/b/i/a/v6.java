package i.c.a.b.i.a;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class v6 implements Runnable {
    public final /* synthetic */ AtomicReference e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ t6 f3914f;

    public v6(t6 t6Var, AtomicReference atomicReference) {
        this.f3914f = t6Var;
        this.e = atomicReference;
    }

    public final void run() {
        synchronized (this.e) {
            try {
                AtomicReference atomicReference = this.e;
                pa paVar = this.f3914f.a.f3861g;
                j4 q2 = this.f3914f.q();
                q2.w();
                String str = q2.c;
                if (paVar != null) {
                    atomicReference.set(Boolean.valueOf(paVar.d(str, o.K)));
                    this.e.notify();
                } else {
                    throw null;
                }
            } catch (Throwable th) {
                this.e.notify();
                throw th;
            }
        }
    }
}
