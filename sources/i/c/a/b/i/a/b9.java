package i.c.a.b.i.a;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import i.c.a.b.g.g.nb;

/* compiled from: com.google.android.gms:play-services-measurement-sdk@@17.3.0 */
public final class b9 implements Runnable {
    public final /* synthetic */ nb e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ String f3600f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ String f3601g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ boolean f3602h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f3603i;

    public b9(AppMeasurementDynamiteService appMeasurementDynamiteService, nb nbVar, String str, String str2, boolean z) {
        this.f3603i = appMeasurementDynamiteService;
        this.e = nbVar;
        this.f3600f = str;
        this.f3601g = str2;
        this.f3602h = z;
    }

    public final void run() {
        z7 t = this.f3603i.a.t();
        nb nbVar = this.e;
        String str = this.f3600f;
        String str2 = this.f3601g;
        boolean z = this.f3602h;
        t.c();
        t.w();
        t.a((Runnable) new t8(t, str, str2, z, t.a(false), nbVar));
    }
}
