package i.c.a.b.i.a;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import i.c.a.b.g.g.k9;

/* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
public final class q9 extends r9 {
    public final AlarmManager d = ((AlarmManager) this.a.a.getSystemService("alarm"));
    public final f e;

    /* renamed from: f  reason: collision with root package name */
    public Integer f3853f;

    public q9(t9 t9Var) {
        super(t9Var);
        this.e = new p9(this, t9Var.f3896i, t9Var);
    }

    public final boolean p() {
        this.d.cancel(w());
        if (Build.VERSION.SDK_INT < 24) {
            return false;
        }
        u();
        return false;
    }

    public final void t() {
        m();
        if (x()) {
            n().f3766n.a("Unscheduling upload");
        }
        this.d.cancel(w());
        this.e.b();
        if (Build.VERSION.SDK_INT >= 24) {
            u();
        }
    }

    @TargetApi(24)
    public final void u() {
        JobScheduler jobScheduler = (JobScheduler) this.a.a.getSystemService("jobscheduler");
        int v = v();
        if (!x()) {
            n().f3766n.a("Cancelling job. JobID", Integer.valueOf(v));
        }
        jobScheduler.cancel(v);
    }

    public final int v() {
        if (this.f3853f == null) {
            String valueOf = String.valueOf(this.a.a.getPackageName());
            this.f3853f = Integer.valueOf((valueOf.length() != 0 ? "measurement".concat(valueOf) : new String("measurement")).hashCode());
        }
        return this.f3853f.intValue();
    }

    public final PendingIntent w() {
        Context context = this.a.a;
        return PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), 0);
    }

    public final boolean x() {
        return k9.b() && this.a.f3861g.a(o.Z0);
    }
}
