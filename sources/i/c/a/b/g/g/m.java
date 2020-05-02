package i.c.a.b.g.g;

import i.c.a.b.e.b;
import i.c.a.b.g.g.rc;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.3.0 */
public final class m extends rc.a {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ int f3353i = 5;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ String f3354j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ Object f3355k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ Object f3356l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ Object f3357m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ rc f3358n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m(rc rcVar, String str, Object obj) {
        super(false);
        this.f3358n = rcVar;
        this.f3354j = str;
        this.f3355k = obj;
        this.f3356l = null;
        this.f3357m = null;
    }

    public final void a() {
        this.f3358n.f3435g.logHealthData(this.f3353i, this.f3354j, new b(this.f3355k), new b(this.f3356l), new b(this.f3357m));
    }
}
