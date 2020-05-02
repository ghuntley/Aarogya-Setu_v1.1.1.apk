package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import android.content.Intent;
import i.c.a.b.g.g.pc;
import i.c.a.b.i.a.a9;
import i.c.a.b.i.a.d9;
import i.c.a.b.i.a.m4;
import i.c.a.b.i.a.s5;
import i.c.a.b.i.a.y8;

@TargetApi(24)
/* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
public final class AppMeasurementJobService extends JobService implements d9 {
    public y8<AppMeasurementJobService> e;

    public final y8<AppMeasurementJobService> a() {
        if (this.e == null) {
            this.e = new y8<>(this);
        }
        return this.e;
    }

    public final void a(Intent intent) {
    }

    public final void onCreate() {
        super.onCreate();
        s5.a((Context) a().a, (pc) null).n().f3766n.a("Local AppMeasurementService is starting up");
    }

    public final void onDestroy() {
        s5.a((Context) a().a, (pc) null).n().f3766n.a("Local AppMeasurementService is shutting down");
        super.onDestroy();
    }

    public final void onRebind(Intent intent) {
        a().b(intent);
    }

    public final boolean onStartJob(JobParameters jobParameters) {
        y8<AppMeasurementJobService> a = a();
        m4 n2 = s5.a((Context) a.a, (pc) null).n();
        String string = jobParameters.getExtras().getString("action");
        n2.f3766n.a("Local AppMeasurementJobService called. action", string);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(string)) {
            return true;
        }
        a.a((Runnable) new a9(a, n2, jobParameters));
        return true;
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    public final boolean onUnbind(Intent intent) {
        a().a(intent);
        return true;
    }

    public final boolean a(int i2) {
        throw new UnsupportedOperationException();
    }

    @TargetApi(24)
    public final void a(JobParameters jobParameters, boolean z) {
        jobFinished(jobParameters, false);
    }
}
