package i.c.a.b.i.a;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class q8 implements Runnable {
    public final /* synthetic */ AtomicReference e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ String f3847f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ String f3848g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ String f3849h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ boolean f3850i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ ea f3851j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ z7 f3852k;

    public q8(z7 z7Var, AtomicReference atomicReference, String str, String str2, String str3, boolean z, ea eaVar) {
        this.f3852k = z7Var;
        this.e = atomicReference;
        this.f3847f = str;
        this.f3848g = str2;
        this.f3849h = str3;
        this.f3850i = z;
        this.f3851j = eaVar;
    }

    public final void run() {
        synchronized (this.e) {
            try {
                e4 e4Var = this.f3852k.d;
                if (e4Var == null) {
                    this.f3852k.n().f3758f.a("(legacy) Failed to get user properties; not connected to service", m4.a(this.f3847f), this.f3848g, this.f3849h);
                    this.e.set(Collections.emptyList());
                    this.e.notify();
                    return;
                }
                if (TextUtils.isEmpty(this.f3847f)) {
                    this.e.set(e4Var.a(this.f3848g, this.f3849h, this.f3850i, this.f3851j));
                } else {
                    this.e.set(e4Var.a(this.f3847f, this.f3848g, this.f3849h, this.f3850i));
                }
                this.f3852k.D();
                this.e.notify();
            } catch (RemoteException e2) {
                try {
                    this.f3852k.n().f3758f.a("(legacy) Failed to get user properties; remote exception", m4.a(this.f3847f), this.f3848g, e2);
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
