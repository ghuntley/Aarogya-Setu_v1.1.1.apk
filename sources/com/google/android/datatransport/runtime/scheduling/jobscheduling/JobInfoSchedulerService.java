package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import i.c.a.a.j.b;
import i.c.a.a.j.h;
import i.c.a.a.j.m;
import i.c.a.a.j.r.h.e;
import i.c.a.a.j.r.h.g;
import i.c.a.a.j.r.h.l;
import i.c.a.a.j.u.a;

/* compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
public class JobInfoSchedulerService extends JobService {
    public boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i2 = jobParameters.getExtras().getInt("priority");
        int i3 = jobParameters.getExtras().getInt("attemptNumber");
        m.a(getApplicationContext());
        h.a a = h.a();
        a.a(string);
        a.a(a.a(i2));
        if (string2 != null) {
            ((b.C0103b) a).f2934b = Base64.decode(string2, 0);
        }
        l lVar = m.a().d;
        lVar.e.execute(new g(lVar, a.a(), i3, new e(this, jobParameters)));
        return true;
    }

    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
