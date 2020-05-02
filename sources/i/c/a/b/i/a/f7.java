package i.c.a.b.i.a;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class f7 implements Runnable {
    public final /* synthetic */ AtomicReference e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ t6 f3669f;

    public f7(t6 t6Var, AtomicReference atomicReference) {
        this.f3669f = t6Var;
        this.e = atomicReference;
    }

    public final void run() {
        String str;
        synchronized (this.e) {
            try {
                AtomicReference atomicReference = this.e;
                pa paVar = this.f3669f.a.f3861g;
                j4 q2 = this.f3669f.q();
                q2.w();
                String str2 = q2.c;
                if (paVar != null) {
                    f4<String> f4Var = o.L;
                    if (str2 == null) {
                        str = f4Var.a(null);
                    } else {
                        str = f4Var.a(paVar.c.a(str2, f4Var.a));
                    }
                    atomicReference.set(str);
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
