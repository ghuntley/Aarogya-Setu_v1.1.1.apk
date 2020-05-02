package i.c.a.b.g.g;

import android.os.Bundle;
import i.c.a.b.g.g.rc;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.3.0 */
public final class j extends rc.a {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ k8 f3321i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ rc f3322j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(rc rcVar, k8 k8Var) {
        super(true);
        this.f3322j = rcVar;
        this.f3321i = k8Var;
    }

    public final void a() {
        this.f3322j.f3435g.generateEventId(this.f3321i);
    }

    public final void b() {
        this.f3321i.a((Bundle) null);
    }
}
