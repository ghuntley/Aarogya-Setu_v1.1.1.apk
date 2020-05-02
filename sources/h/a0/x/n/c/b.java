package h.a0.x.n.c;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import h.a0.l;
import h.a0.t;
import h.a0.x.d;
import h.a0.x.j;
import h.a0.x.q.g;
import h.a0.x.q.i;
import h.a0.x.q.p;
import h.a0.x.q.r;
import h.a0.x.r.e;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: SystemJobScheduler */
public class b implements d {

    /* renamed from: i  reason: collision with root package name */
    public static final String f1017i = l.a("SystemJobScheduler");
    public final Context e;

    /* renamed from: f  reason: collision with root package name */
    public final JobScheduler f1018f;

    /* renamed from: g  reason: collision with root package name */
    public final j f1019g;

    /* renamed from: h  reason: collision with root package name */
    public final a f1020h;

    public b(Context context, j jVar) {
        a aVar = new a(context);
        this.e = context;
        this.f1019g = jVar;
        this.f1018f = (JobScheduler) context.getSystemService("jobscheduler");
        this.f1020h = aVar;
    }

    public static void b(Context context) {
        List<JobInfo> a;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null && (a = a(context, jobScheduler)) != null && !a.isEmpty()) {
            for (JobInfo next : a) {
                if (a(next) == null) {
                    a(jobScheduler, next.getId());
                }
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public void a(p... pVarArr) {
        int i2;
        List<Integer> a;
        int i3;
        WorkDatabase workDatabase = this.f1019g.c;
        e eVar = new e(workDatabase);
        int length = pVarArr.length;
        int i4 = 0;
        while (i4 < length) {
            p pVar = pVarArr[i4];
            workDatabase.c();
            try {
                p c = ((r) workDatabase.n()).c(pVar.a);
                if (c == null) {
                    l a2 = l.a();
                    String str = f1017i;
                    a2.d(str, "Skipping scheduling " + pVar.a + " because it's no longer in the DB", new Throwable[0]);
                    workDatabase.h();
                } else if (c.f1060b != t.ENQUEUED) {
                    l a3 = l.a();
                    String str2 = f1017i;
                    a3.d(str2, "Skipping scheduling " + pVar.a + " because it is no longer enqueued", new Throwable[0]);
                    workDatabase.h();
                } else {
                    g a4 = ((i) workDatabase.k()).a(pVar.a);
                    if (a4 != null) {
                        i2 = a4.f1054b;
                    } else {
                        i2 = eVar.a(this.f1019g.f958b.f894f, this.f1019g.f958b.f895g);
                    }
                    if (a4 == null) {
                        ((i) this.f1019g.c.k()).a(new g(pVar.a, i2));
                    }
                    a(pVar, i2);
                    if (Build.VERSION.SDK_INT == 23 && (a = a(this.e, this.f1018f, pVar.a)) != null) {
                        int indexOf = a.indexOf(Integer.valueOf(i2));
                        if (indexOf >= 0) {
                            a.remove(indexOf);
                        }
                        if (!a.isEmpty()) {
                            i3 = a.get(0).intValue();
                        } else {
                            i3 = eVar.a(this.f1019g.f958b.f894f, this.f1019g.f958b.f895g);
                        }
                        a(pVar, i3);
                    }
                    workDatabase.h();
                }
                workDatabase.e();
                i4++;
            } catch (Throwable th) {
                workDatabase.e();
                throw th;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        if (android.os.Build.VERSION.SDK_INT < 26) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(h.a0.x.q.p r17, int r18) {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            h.a0.x.n.c.a r0 = r1.f1020h
            if (r0 == 0) goto L_0x01a4
            h.a0.c r3 = r2.f1065j
            h.a0.m r4 = r3.a
            int r5 = r4.ordinal()
            r6 = 26
            r7 = 24
            r8 = 2
            r9 = 3
            r10 = 1
            r11 = 0
            if (r5 == 0) goto L_0x0049
            if (r5 == r10) goto L_0x0047
            if (r5 == r8) goto L_0x0045
            if (r5 == r9) goto L_0x0029
            r12 = 4
            if (r5 == r12) goto L_0x0024
            goto L_0x002f
        L_0x0024:
            int r5 = android.os.Build.VERSION.SDK_INT
            if (r5 < r6) goto L_0x002f
            goto L_0x004a
        L_0x0029:
            int r5 = android.os.Build.VERSION.SDK_INT
            if (r5 < r7) goto L_0x002f
            r12 = 3
            goto L_0x004a
        L_0x002f:
            h.a0.l r5 = h.a0.l.a()
            java.lang.String r12 = h.a0.x.n.c.a.f1016b
            java.lang.Object[] r13 = new java.lang.Object[r10]
            r13[r11] = r4
            java.lang.String r4 = "API version too low. Cannot convert network type value %s"
            java.lang.String r4 = java.lang.String.format(r4, r13)
            java.lang.Throwable[] r13 = new java.lang.Throwable[r11]
            r5.a(r12, r4, r13)
            goto L_0x0047
        L_0x0045:
            r12 = 2
            goto L_0x004a
        L_0x0047:
            r12 = 1
            goto L_0x004a
        L_0x0049:
            r12 = 0
        L_0x004a:
            android.os.PersistableBundle r4 = new android.os.PersistableBundle
            r4.<init>()
            java.lang.String r5 = r2.a
            java.lang.String r13 = "EXTRA_WORK_SPEC_ID"
            r4.putString(r13, r5)
            boolean r5 = r17.d()
            java.lang.String r13 = "EXTRA_IS_PERIODIC"
            r4.putBoolean(r13, r5)
            android.app.job.JobInfo$Builder r5 = new android.app.job.JobInfo$Builder
            android.content.ComponentName r0 = r0.a
            r13 = r18
            r5.<init>(r13, r0)
            android.app.job.JobInfo$Builder r0 = r5.setRequiredNetworkType(r12)
            boolean r5 = r3.f902b
            android.app.job.JobInfo$Builder r0 = r0.setRequiresCharging(r5)
            boolean r5 = r3.c
            android.app.job.JobInfo$Builder r0 = r0.setRequiresDeviceIdle(r5)
            android.app.job.JobInfo$Builder r0 = r0.setExtras(r4)
            boolean r4 = r3.c
            if (r4 != 0) goto L_0x008e
            h.a0.a r4 = r2.f1067l
            h.a0.a r5 = h.a0.a.LINEAR
            if (r4 != r5) goto L_0x0088
            r4 = 0
            goto L_0x0089
        L_0x0088:
            r4 = 1
        L_0x0089:
            long r14 = r2.f1068m
            r0.setBackoffCriteria(r14, r4)
        L_0x008e:
            long r4 = r17.a()
            long r14 = java.lang.System.currentTimeMillis()
            long r4 = r4 - r14
            r14 = 0
            long r4 = java.lang.Math.max(r4, r14)
            int r12 = android.os.Build.VERSION.SDK_INT
            r9 = 28
            if (r12 > r9) goto L_0x00a7
            r0.setMinimumLatency(r4)
            goto L_0x00b2
        L_0x00a7:
            int r9 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r9 <= 0) goto L_0x00af
            r0.setMinimumLatency(r4)
            goto L_0x00b2
        L_0x00af:
            r0.setImportantWhileForeground(r10)
        L_0x00b2:
            int r4 = android.os.Build.VERSION.SDK_INT
            if (r4 < r7) goto L_0x00ee
            h.a0.d r4 = r3.f905h
            int r4 = r4.a()
            if (r4 <= 0) goto L_0x00c0
            r4 = 1
            goto L_0x00c1
        L_0x00c0:
            r4 = 0
        L_0x00c1:
            if (r4 == 0) goto L_0x00ee
            h.a0.d r4 = r3.f905h
            java.util.Set<h.a0.d$a> r4 = r4.a
            java.util.Iterator r4 = r4.iterator()
        L_0x00cb:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x00e4
            java.lang.Object r5 = r4.next()
            h.a0.d$a r5 = (h.a0.d.a) r5
            boolean r7 = r5.f910b
            android.app.job.JobInfo$TriggerContentUri r9 = new android.app.job.JobInfo$TriggerContentUri
            android.net.Uri r5 = r5.a
            r9.<init>(r5, r7)
            r0.addTriggerContentUri(r9)
            goto L_0x00cb
        L_0x00e4:
            long r4 = r3.f903f
            r0.setTriggerContentUpdateDelay(r4)
            long r4 = r3.f904g
            r0.setTriggerContentMaxDelay(r4)
        L_0x00ee:
            r0.setPersisted(r11)
            int r4 = android.os.Build.VERSION.SDK_INT
            if (r4 < r6) goto L_0x00ff
            boolean r4 = r3.d
            r0.setRequiresBatteryNotLow(r4)
            boolean r3 = r3.e
            r0.setRequiresStorageNotLow(r3)
        L_0x00ff:
            android.app.job.JobInfo r0 = r0.build()
            h.a0.l r3 = h.a0.l.a()
            java.lang.String r4 = f1017i
            java.lang.Object[] r5 = new java.lang.Object[r8]
            java.lang.String r6 = r2.a
            r5[r11] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r18)
            r5[r10] = r6
            java.lang.String r6 = "Scheduling work ID %s Job ID %s"
            java.lang.String r5 = java.lang.String.format(r6, r5)
            java.lang.Throwable[] r6 = new java.lang.Throwable[r11]
            r3.a(r4, r5, r6)
            android.app.job.JobScheduler r3 = r1.f1018f     // Catch:{ IllegalStateException -> 0x013f, all -> 0x0126 }
            r3.schedule(r0)     // Catch:{ IllegalStateException -> 0x013f, all -> 0x0126 }
            goto L_0x013e
        L_0x0126:
            r0 = move-exception
            h.a0.l r3 = h.a0.l.a()
            java.lang.String r4 = f1017i
            java.lang.Object[] r5 = new java.lang.Object[r10]
            r5[r11] = r2
            java.lang.String r2 = "Unable to schedule %s"
            java.lang.String r2 = java.lang.String.format(r2, r5)
            java.lang.Throwable[] r5 = new java.lang.Throwable[r10]
            r5[r11] = r0
            r3.b(r4, r2, r5)
        L_0x013e:
            return
        L_0x013f:
            r0 = move-exception
            android.content.Context r2 = r1.e
            android.app.job.JobScheduler r3 = r1.f1018f
            java.util.List r2 = a((android.content.Context) r2, (android.app.job.JobScheduler) r3)
            if (r2 == 0) goto L_0x014f
            int r2 = r2.size()
            goto L_0x0150
        L_0x014f:
            r2 = 0
        L_0x0150:
            java.util.Locale r3 = java.util.Locale.getDefault()
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4[r11] = r2
            h.a0.x.j r2 = r1.f1019g
            androidx.work.impl.WorkDatabase r2 = r2.c
            h.a0.x.q.q r2 = r2.n()
            h.a0.x.q.r r2 = (h.a0.x.q.r) r2
            java.util.List r2 = r2.c()
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r2 = r2.size()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4[r10] = r2
            h.a0.x.j r2 = r1.f1019g
            h.a0.b r2 = r2.f958b
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 23
            if (r5 != r6) goto L_0x0185
            int r2 = r2.f896h
            int r2 = r2 / r8
            goto L_0x0187
        L_0x0185:
            int r2 = r2.f896h
        L_0x0187:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4[r8] = r2
            java.lang.String r2 = "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d."
            java.lang.String r2 = java.lang.String.format(r3, r2, r4)
            h.a0.l r3 = h.a0.l.a()
            java.lang.String r4 = f1017i
            java.lang.Throwable[] r5 = new java.lang.Throwable[r11]
            r3.b(r4, r2, r5)
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            r3.<init>(r2, r0)
            throw r3
        L_0x01a4:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h.a0.x.n.c.b.a(h.a0.x.q.p, int):void");
    }

    public void a(String str) {
        List<Integer> a = a(this.e, this.f1018f, str);
        if (a != null && !a.isEmpty()) {
            for (Integer intValue : a) {
                a(this.f1018f, intValue.intValue());
            }
            ((i) this.f1019g.c.k()).b(str);
        }
    }

    public static void a(JobScheduler jobScheduler, int i2) {
        try {
            jobScheduler.cancel(i2);
        } catch (Throwable th) {
            l.a().b(f1017i, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", new Object[]{Integer.valueOf(i2)}), th);
        }
    }

    public static void a(Context context) {
        List<JobInfo> a;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null && (a = a(context, jobScheduler)) != null && !a.isEmpty()) {
            for (JobInfo id : a) {
                a(jobScheduler, id.getId());
            }
        }
    }

    public static List<JobInfo> a(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            l.a().b(f1017i, "getAllPendingJobs() is not reliable on this device.", th);
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ComponentName componentName = new ComponentName(context, SystemJobService.class);
        for (JobInfo next : list) {
            if (componentName.equals(next.getService())) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static List<Integer> a(Context context, JobScheduler jobScheduler, String str) {
        List<JobInfo> a = a(context, jobScheduler);
        if (a == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        for (JobInfo next : a) {
            if (str.equals(a(next))) {
                arrayList.add(Integer.valueOf(next.getId()));
            }
        }
        return arrayList;
    }

    public static String a(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return extras.getString("EXTRA_WORK_SPEC_ID");
            }
            return null;
        } catch (NullPointerException unused) {
            return null;
        }
    }
}
