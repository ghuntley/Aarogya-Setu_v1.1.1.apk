package i.c.a.b.g.g;

import i.c.a.b.e.b;
import i.c.a.b.g.g.rc;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.3.0 */
public final class p extends rc.a {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ String f3382i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ String f3383j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ Object f3384k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ boolean f3385l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ rc f3386m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p(rc rcVar, String str, String str2, Object obj, boolean z) {
        super(true);
        this.f3386m = rcVar;
        this.f3382i = str;
        this.f3383j = str2;
        this.f3384k = obj;
        this.f3385l = z;
    }

    public final void a() {
        this.f3386m.f3435g.setUserProperty(this.f3382i, this.f3383j, new b(this.f3384k), this.f3385l, this.e);
    }
}
