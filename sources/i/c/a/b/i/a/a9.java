package i.c.a.b.i.a;

import android.app.job.JobParameters;

/* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
public final /* synthetic */ class a9 implements Runnable {
    public final y8 e;

    /* renamed from: f  reason: collision with root package name */
    public final m4 f3584f;

    /* renamed from: g  reason: collision with root package name */
    public final JobParameters f3585g;

    public a9(y8 y8Var, m4 m4Var, JobParameters jobParameters) {
        this.e = y8Var;
        this.f3584f = m4Var;
        this.f3585g = jobParameters;
    }

    public final void run() {
        y8 y8Var = this.e;
        m4 m4Var = this.f3584f;
        JobParameters jobParameters = this.f3585g;
        if (y8Var != null) {
            m4Var.f3766n.a("AppMeasurementJobService processed last upload request.");
            ((d9) y8Var.a).a(jobParameters, false);
            return;
        }
        throw null;
    }
}
