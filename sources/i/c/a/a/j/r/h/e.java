package i.c.a.a.j.r.h;

import android.app.job.JobParameters;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;

/* compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
public final /* synthetic */ class e implements Runnable {
    public final JobInfoSchedulerService e;

    /* renamed from: f  reason: collision with root package name */
    public final JobParameters f2974f;

    public e(JobInfoSchedulerService jobInfoSchedulerService, JobParameters jobParameters) {
        this.e = jobInfoSchedulerService;
        this.f2974f = jobParameters;
    }

    public void run() {
        this.e.jobFinished(this.f2974f, false);
    }
}
