package i.c.a.b.i.a;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import i.c.a.b.g.g.nb;

/* compiled from: com.google.android.gms:play-services-measurement-sdk@@17.3.0 */
public final class a8 implements Runnable {
    public final /* synthetic */ nb e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ String f3581f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ String f3582g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f3583h;

    public a8(AppMeasurementDynamiteService appMeasurementDynamiteService, nb nbVar, String str, String str2) {
        this.f3583h = appMeasurementDynamiteService;
        this.e = nbVar;
        this.f3581f = str;
        this.f3582g = str2;
    }

    public final void run() {
        z7 t = this.f3583h.a.t();
        nb nbVar = this.e;
        String str = this.f3581f;
        String str2 = this.f3582g;
        t.c();
        t.w();
        t.a((Runnable) new r8(t, str, str2, t.a(false), nbVar));
    }
}
