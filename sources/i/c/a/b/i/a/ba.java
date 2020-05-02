package i.c.a.b.i.a;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import i.c.a.b.g.g.nb;

/* compiled from: com.google.android.gms:play-services-measurement-sdk@@17.3.0 */
public final class ba implements Runnable {
    public final /* synthetic */ nb e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f3604f;

    public ba(AppMeasurementDynamiteService appMeasurementDynamiteService, nb nbVar) {
        this.f3604f = appMeasurementDynamiteService;
        this.e = nbVar;
    }

    public final void run() {
        this.f3604f.a.p().a(this.e, this.f3604f.a.a());
    }
}
