package i.c.a.b.g.g;

import android.app.Activity;
import i.c.a.b.e.b;
import i.c.a.b.g.g.rc;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.3.0 */
public final class d extends rc.a {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Activity f3240i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ String f3241j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ String f3242k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ rc f3243l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(rc rcVar, Activity activity, String str, String str2) {
        super(true);
        this.f3243l = rcVar;
        this.f3240i = activity;
        this.f3241j = str;
        this.f3242k = str2;
    }

    public final void a() {
        this.f3243l.f3435g.setCurrentScreen(new b(this.f3240i), this.f3241j, this.f3242k, this.e);
    }
}
