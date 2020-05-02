package i.c.a.b.g.g;

import android.os.Bundle;
import i.c.a.b.g.g.rc;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.3.0 */
public final class r extends rc.a {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Long f3411i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ String f3412j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ String f3413k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ Bundle f3414l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ boolean f3415m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ boolean f3416n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ rc f3417o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r(rc rcVar, Long l2, String str, String str2, Bundle bundle, boolean z, boolean z2) {
        super(true);
        this.f3417o = rcVar;
        this.f3411i = l2;
        this.f3412j = str;
        this.f3413k = str2;
        this.f3414l = bundle;
        this.f3415m = z;
        this.f3416n = z2;
    }

    public final void a() {
        Long l2 = this.f3411i;
        this.f3417o.f3435g.logEvent(this.f3412j, this.f3413k, this.f3414l, this.f3415m, this.f3416n, l2 == null ? this.e : l2.longValue());
    }
}
