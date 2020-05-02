package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.PersistableBundle;
import android.text.TextUtils;
import h.a0.l;
import h.a0.x.a;
import h.a0.x.j;
import java.util.HashMap;
import java.util.Map;

public class SystemJobService extends JobService implements a {

    /* renamed from: g  reason: collision with root package name */
    public static final String f384g = l.a("SystemJobService");
    public j e;

    /* renamed from: f  reason: collision with root package name */
    public final Map<String, JobParameters> f385f = new HashMap();

    public void a(String str, boolean z) {
        JobParameters remove;
        l.a().a(f384g, String.format("%s executed on JobScheduler", new Object[]{str}), new Throwable[0]);
        synchronized (this.f385f) {
            remove = this.f385f.remove(str);
        }
        if (remove != null) {
            jobFinished(remove, z);
        }
    }

    public void onCreate() {
        super.onCreate();
        try {
            j a = j.a(getApplicationContext());
            this.e = a;
            a.f959f.a((a) this);
        } catch (IllegalStateException unused) {
            if (Application.class.equals(getApplication().getClass())) {
                l.a().d(f384g, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.", new Throwable[0]);
                return;
            }
            throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
        }
    }

    public void onDestroy() {
        super.onDestroy();
        j jVar = this.e;
        if (jVar != null) {
            jVar.f959f.b((a) this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006c, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0071, code lost:
        if (android.os.Build.VERSION.SDK_INT < 24) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0073, code lost:
        r2 = new androidx.work.WorkerParameters.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007c, code lost:
        if (r9.getTriggeredContentUris() == null) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007e, code lost:
        java.util.Arrays.asList(r9.getTriggeredContentUris());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0089, code lost:
        if (r9.getTriggeredContentAuthorities() == null) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008b, code lost:
        java.util.Arrays.asList(r9.getTriggeredContentAuthorities());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0096, code lost:
        if (android.os.Build.VERSION.SDK_INT < 28) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0098, code lost:
        r9.getNetwork();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009b, code lost:
        r9 = r8.e;
        r3 = r9.d;
        ((h.a0.x.r.p.b) r3).a.execute(new h.a0.x.r.i(r9, r0, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ab, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onStartJob(android.app.job.JobParameters r9) {
        /*
            r8 = this;
            h.a0.x.j r0 = r8.e
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0017
            h.a0.l r0 = h.a0.l.a()
            java.lang.String r3 = f384g
            java.lang.Throwable[] r4 = new java.lang.Throwable[r2]
            java.lang.String r5 = "WorkManager is not initialized; requesting retry."
            r0.a(r3, r5, r4)
            r8.jobFinished(r9, r1)
            return r2
        L_0x0017:
            java.lang.String r0 = a(r9)
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 == 0) goto L_0x002f
            h.a0.l r9 = h.a0.l.a()
            java.lang.String r0 = f384g
            java.lang.Throwable[] r1 = new java.lang.Throwable[r2]
            java.lang.String r3 = "WorkSpec id not found!"
            r9.b(r0, r3, r1)
            return r2
        L_0x002f:
            java.util.Map<java.lang.String, android.app.job.JobParameters> r3 = r8.f385f
            monitor-enter(r3)
            java.util.Map<java.lang.String, android.app.job.JobParameters> r4 = r8.f385f     // Catch:{ all -> 0x00ac }
            boolean r4 = r4.containsKey(r0)     // Catch:{ all -> 0x00ac }
            if (r4 == 0) goto L_0x0051
            h.a0.l r9 = h.a0.l.a()     // Catch:{ all -> 0x00ac }
            java.lang.String r4 = f384g     // Catch:{ all -> 0x00ac }
            java.lang.String r5 = "Job is already being executed by SystemJobService: %s"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x00ac }
            r1[r2] = r0     // Catch:{ all -> 0x00ac }
            java.lang.String r0 = java.lang.String.format(r5, r1)     // Catch:{ all -> 0x00ac }
            java.lang.Throwable[] r1 = new java.lang.Throwable[r2]     // Catch:{ all -> 0x00ac }
            r9.a(r4, r0, r1)     // Catch:{ all -> 0x00ac }
            monitor-exit(r3)     // Catch:{ all -> 0x00ac }
            return r2
        L_0x0051:
            h.a0.l r4 = h.a0.l.a()     // Catch:{ all -> 0x00ac }
            java.lang.String r5 = f384g     // Catch:{ all -> 0x00ac }
            java.lang.String r6 = "onStartJob for %s"
            java.lang.Object[] r7 = new java.lang.Object[r1]     // Catch:{ all -> 0x00ac }
            r7[r2] = r0     // Catch:{ all -> 0x00ac }
            java.lang.String r6 = java.lang.String.format(r6, r7)     // Catch:{ all -> 0x00ac }
            java.lang.Throwable[] r2 = new java.lang.Throwable[r2]     // Catch:{ all -> 0x00ac }
            r4.a(r5, r6, r2)     // Catch:{ all -> 0x00ac }
            java.util.Map<java.lang.String, android.app.job.JobParameters> r2 = r8.f385f     // Catch:{ all -> 0x00ac }
            r2.put(r0, r9)     // Catch:{ all -> 0x00ac }
            monitor-exit(r3)     // Catch:{ all -> 0x00ac }
            r2 = 0
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 24
            if (r3 < r4) goto L_0x009b
            androidx.work.WorkerParameters$a r2 = new androidx.work.WorkerParameters$a
            r2.<init>()
            android.net.Uri[] r3 = r9.getTriggeredContentUris()
            if (r3 == 0) goto L_0x0085
            android.net.Uri[] r3 = r9.getTriggeredContentUris()
            java.util.Arrays.asList(r3)
        L_0x0085:
            java.lang.String[] r3 = r9.getTriggeredContentAuthorities()
            if (r3 == 0) goto L_0x0092
            java.lang.String[] r3 = r9.getTriggeredContentAuthorities()
            java.util.Arrays.asList(r3)
        L_0x0092:
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 28
            if (r3 < r4) goto L_0x009b
            r9.getNetwork()
        L_0x009b:
            h.a0.x.j r9 = r8.e
            h.a0.x.r.p.a r3 = r9.d
            h.a0.x.r.i r4 = new h.a0.x.r.i
            r4.<init>(r9, r0, r2)
            h.a0.x.r.p.b r3 = (h.a0.x.r.p.b) r3
            h.a0.x.r.h r9 = r3.a
            r9.execute(r4)
            return r1
        L_0x00ac:
            r9 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00ac }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemjob.SystemJobService.onStartJob(android.app.job.JobParameters):boolean");
    }

    public boolean onStopJob(JobParameters jobParameters) {
        if (this.e == null) {
            l.a().a(f384g, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            return true;
        }
        String a = a(jobParameters);
        if (TextUtils.isEmpty(a)) {
            l.a().b(f384g, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        l.a().a(f384g, String.format("onStopJob for %s", new Object[]{a}), new Throwable[0]);
        synchronized (this.f385f) {
            this.f385f.remove(a);
        }
        this.e.a(a);
        return !this.e.f959f.a(a);
    }

    public static String a(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return extras.getString("EXTRA_WORK_SPEC_ID");
        } catch (NullPointerException unused) {
            return null;
        }
    }
}
