package i.c.a.b.g.g;

import android.app.Activity;
import android.os.Bundle;
import i.c.a.b.e.b;
import i.c.a.b.g.g.rc;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.3.0 */
public final class t extends rc.a {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Activity f3450i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Bundle f3451j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ rc.c f3452k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t(rc.c cVar, Activity activity, Bundle bundle) {
        super(true);
        this.f3452k = cVar;
        this.f3450i = activity;
        this.f3451j = bundle;
    }

    public final void a() {
        rc.this.f3435g.onActivityCreated(new b(this.f3450i), this.f3451j, this.f3436f);
    }
}
