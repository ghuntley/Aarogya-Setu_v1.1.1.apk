package i.c.a.b.i.a;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import i.c.a.b.d.f;
import i.c.a.b.d.g;
import i.c.a.b.g.g.nb;

/* compiled from: com.google.android.gms:play-services-measurement-sdk@@17.3.0 */
public final class c6 implements Runnable {
    public final /* synthetic */ nb e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ m f3620f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ String f3621g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f3622h;

    public c6(AppMeasurementDynamiteService appMeasurementDynamiteService, nb nbVar, m mVar, String str) {
        this.f3622h = appMeasurementDynamiteService;
        this.e = nbVar;
        this.f3620f = mVar;
        this.f3621g = str;
    }

    public final void run() {
        z7 t = this.f3622h.a.t();
        nb nbVar = this.e;
        m mVar = this.f3620f;
        String str = this.f3621g;
        t.c();
        t.w();
        ca f2 = t.f();
        if (f2 == null) {
            throw null;
        } else if (f.f3022b.a(f2.a.a, g.GOOGLE_PLAY_SERVICES_VERSION_CODE) != 0) {
            t.n().f3761i.a("Not bundling data. Service unavailable or out of date");
            t.f().a(nbVar, new byte[0]);
        } else {
            t.a((Runnable) new l8(t, mVar, str, nbVar));
        }
    }
}
