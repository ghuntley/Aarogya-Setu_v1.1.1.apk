package i.c.a.b.d.k.h;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public final class z0 implements Runnable {
    public final /* synthetic */ LifecycleCallback e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ String f3086f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ y0 f3087g;

    public z0(y0 y0Var, LifecycleCallback lifecycleCallback, String str) {
        this.f3087g = y0Var;
        this.e = lifecycleCallback;
        this.f3086f = str;
    }

    public final void run() {
        y0 y0Var = this.f3087g;
        if (y0Var.f3084f > 0) {
            LifecycleCallback lifecycleCallback = this.e;
            Bundle bundle = y0Var.f3085g;
            if (bundle != null) {
                bundle.getBundle(this.f3086f);
            }
            if (lifecycleCallback == null) {
                throw null;
            }
        }
        if (this.f3087g.f3084f >= 2 && this.e == null) {
            throw null;
        } else if (this.f3087g.f3084f < 3 || this.e != null) {
            if (this.f3087g.f3084f >= 4) {
                this.e.a();
            }
            if (this.f3087g.f3084f >= 5 && this.e == null) {
                throw null;
            }
        } else {
            throw null;
        }
    }
}
