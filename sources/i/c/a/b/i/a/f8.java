package i.c.a.b.i.a;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class f8 implements Runnable {
    public final /* synthetic */ AtomicReference e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ ea f3670f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ boolean f3671g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ z7 f3672h;

    public f8(z7 z7Var, AtomicReference atomicReference, ea eaVar, boolean z) {
        this.f3672h = z7Var;
        this.e = atomicReference;
        this.f3670f = eaVar;
        this.f3671g = z;
    }

    public final void run() {
        synchronized (this.e) {
            try {
                e4 e4Var = this.f3672h.d;
                if (e4Var == null) {
                    this.f3672h.n().f3758f.a("Failed to get all user properties; not connected to service");
                    this.e.notify();
                    return;
                }
                this.e.set(e4Var.a(this.f3670f, this.f3671g));
                this.f3672h.D();
                this.e.notify();
            } catch (RemoteException e2) {
                try {
                    this.f3672h.n().f3758f.a("Failed to get all user properties; remote exception", e2);
                    this.e.notify();
                } catch (Throwable th) {
                    this.e.notify();
                    throw th;
                }
            }
        }
    }
}
