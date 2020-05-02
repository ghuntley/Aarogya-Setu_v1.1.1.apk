package i.c.a.b.g.g;

import android.app.Activity;
import i.c.a.b.e.b;
import i.c.a.b.g.g.rc;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.3.0 */
public final class z extends rc.a {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Activity f3543i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ k8 f3544j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ rc.c f3545k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z(rc.c cVar, Activity activity, k8 k8Var) {
        super(true);
        this.f3545k = cVar;
        this.f3543i = activity;
        this.f3544j = k8Var;
    }

    public final void a() {
        rc.this.f3435g.onActivitySaveInstanceState(new b(this.f3543i), this.f3544j, this.f3436f);
    }
}
