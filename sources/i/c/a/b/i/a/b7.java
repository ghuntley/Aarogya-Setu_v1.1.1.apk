package i.c.a.b.i.a;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import i.c.a.b.g.g.nb;

/* compiled from: com.google.android.gms:play-services-measurement-sdk@@17.3.0 */
public final class b7 implements Runnable {
    public final /* synthetic */ nb e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f3597f;

    public b7(AppMeasurementDynamiteService appMeasurementDynamiteService, nb nbVar) {
        this.f3597f = appMeasurementDynamiteService;
        this.e = nbVar;
    }

    public final void run() {
        z7 t = this.f3597f.a.t();
        nb nbVar = this.e;
        t.c();
        t.w();
        t.a((Runnable) new g8(t, t.a(false), nbVar));
    }
}
