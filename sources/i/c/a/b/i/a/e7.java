package i.c.a.b.i.a;

import android.os.Bundle;
import com.crashlytics.android.core.DefaultAppMeasurementEventListenerRegistrar;
import i.c.a.b.d.l.q;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class e7 implements Runnable {
    public final /* synthetic */ Bundle e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ t6 f3646f;

    public e7(t6 t6Var, Bundle bundle) {
        this.f3646f = t6Var;
        this.e = bundle;
    }

    public final void run() {
        t6 t6Var = this.f3646f;
        Bundle bundle = this.e;
        t6Var.c();
        t6Var.w();
        q.a(bundle);
        q.b(bundle.getString(DefaultAppMeasurementEventListenerRegistrar.NAME));
        q.b(bundle.getString("origin"));
        q.a(bundle.get("value"));
        if (!t6Var.a.b()) {
            t6Var.n().f3766n.a("Conditional property not set since app measurement is disabled");
            return;
        }
        aa aaVar = new aa(bundle.getString(DefaultAppMeasurementEventListenerRegistrar.NAME), bundle.getLong("triggered_timestamp"), bundle.get("value"), bundle.getString("origin"));
        try {
            m a = t6Var.f().a(bundle.getString("app_id"), bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), bundle.getString("origin"), 0);
            m a2 = t6Var.f().a(bundle.getString("app_id"), bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), bundle.getString("origin"), 0);
            m a3 = t6Var.f().a(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), bundle.getString("origin"), 0);
            String string = bundle.getString("app_id");
            String string2 = bundle.getString("origin");
            long j2 = bundle.getLong("creation_timestamp");
            String string3 = bundle.getString("trigger_event_name");
            long j3 = bundle.getLong("trigger_timeout");
            long j4 = bundle.getLong("time_to_live");
            na naVar = r3;
            na naVar2 = new na(string, string2, aaVar, j2, false, string3, a2, j3, a, j4, a3);
            t6Var.r().a(naVar);
        } catch (IllegalArgumentException unused) {
        }
    }
}
