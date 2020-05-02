package i.c.a.b.i.a;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class o8 implements Runnable {
    public final /* synthetic */ AtomicReference e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ String f3818f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ String f3819g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ String f3820h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ ea f3821i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ z7 f3822j;

    public o8(z7 z7Var, AtomicReference atomicReference, String str, String str2, String str3, ea eaVar) {
        this.f3822j = z7Var;
        this.e = atomicReference;
        this.f3818f = str;
        this.f3819g = str2;
        this.f3820h = str3;
        this.f3821i = eaVar;
    }

    public final void run() {
        synchronized (this.e) {
            try {
                e4 e4Var = this.f3822j.d;
                if (e4Var == null) {
                    this.f3822j.n().f3758f.a("(legacy) Failed to get conditional properties; not connected to service", m4.a(this.f3818f), this.f3819g, this.f3820h);
                    this.e.set(Collections.emptyList());
                    this.e.notify();
                    return;
                }
                if (TextUtils.isEmpty(this.f3818f)) {
                    this.e.set(e4Var.a(this.f3819g, this.f3820h, this.f3821i));
                } else {
                    this.e.set(e4Var.a(this.f3818f, this.f3819g, this.f3820h));
                }
                this.f3822j.D();
                this.e.notify();
            } catch (RemoteException e2) {
                try {
                    this.f3822j.n().f3758f.a("(legacy) Failed to get conditional properties; remote exception", m4.a(this.f3818f), this.f3819g, e2);
                    this.e.set(Collections.emptyList());
                    this.e.notify();
                } catch (Throwable th) {
                    this.e.notify();
                    throw th;
                }
            }
        }
    }
}
