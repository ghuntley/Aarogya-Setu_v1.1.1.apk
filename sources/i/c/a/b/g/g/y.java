package i.c.a.b.g.g;

import android.app.Activity;
import i.c.a.b.e.b;
import i.c.a.b.g.g.rc;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.3.0 */
public final class y extends rc.a {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Activity f3527i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ rc.c f3528j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y(rc.c cVar, Activity activity) {
        super(true);
        this.f3528j = cVar;
        this.f3527i = activity;
    }

    public final void a() {
        rc.this.f3435g.onActivityDestroyed(new b(this.f3527i), this.f3436f);
    }
}
