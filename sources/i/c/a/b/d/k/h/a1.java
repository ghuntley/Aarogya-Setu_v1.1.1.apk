package i.c.a.b.d.k.h;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public final class a1 implements Runnable {
    public final /* synthetic */ LifecycleCallback e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ String f3031f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ b1 f3032g;

    public a1(b1 b1Var, LifecycleCallback lifecycleCallback, String str) {
        this.f3032g = b1Var;
        this.e = lifecycleCallback;
        this.f3031f = str;
    }

    public final void run() {
        b1 b1Var = this.f3032g;
        if (b1Var.b0 > 0) {
            LifecycleCallback lifecycleCallback = this.e;
            Bundle bundle = b1Var.c0;
            if (bundle != null) {
                bundle.getBundle(this.f3031f);
            }
            if (lifecycleCallback == null) {
                throw null;
            }
        }
        if (this.f3032g.b0 >= 2 && this.e == null) {
            throw null;
        } else if (this.f3032g.b0 < 3 || this.e != null) {
            if (this.f3032g.b0 >= 4) {
                this.e.a();
            }
            if (this.f3032g.b0 >= 5 && this.e == null) {
                throw null;
            }
        } else {
            throw null;
        }
    }
}
