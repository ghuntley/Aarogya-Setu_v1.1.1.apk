package i.c.a.b.g.g;

import android.app.Activity;
import i.c.a.b.e.b;
import i.c.a.b.g.g.rc;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.3.0 */
public final class u extends rc.a {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Activity f3465i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ rc.c f3466j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u(rc.c cVar, Activity activity) {
        super(true);
        this.f3466j = cVar;
        this.f3465i = activity;
    }

    public final void a() {
        rc.this.f3435g.onActivityResumed(new b(this.f3465i), this.f3436f);
    }
}
