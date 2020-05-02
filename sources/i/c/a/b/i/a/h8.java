package i.c.a.b.i.a;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class h8 implements Runnable {
    public final /* synthetic */ AtomicReference e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ ea f3695f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ z7 f3696g;

    public h8(z7 z7Var, AtomicReference atomicReference, ea eaVar) {
        this.f3696g = z7Var;
        this.e = atomicReference;
        this.f3695f = eaVar;
    }

    public final void run() {
        synchronized (this.e) {
            try {
                e4 e4Var = this.f3696g.d;
                if (e4Var == null) {
                    this.f3696g.n().f3758f.a("Failed to get app instance id");
                    this.e.notify();
                    return;
                }
                this.e.set(e4Var.d(this.f3695f));
                String str = (String) this.e.get();
                if (str != null) {
                    this.f3696g.p().f3881g.set(str);
                    this.f3696g.g().f3935l.a(str);
                }
                this.f3696g.D();
                this.e.notify();
            } catch (RemoteException e2) {
                try {
                    this.f3696g.n().f3758f.a("Failed to get app instance id", e2);
                    this.e.notify();
                } catch (Throwable th) {
                    this.e.notify();
                    throw th;
                }
            }
        }
    }
}
