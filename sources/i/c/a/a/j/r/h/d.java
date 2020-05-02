package i.c.a.a.j.r.h;

import android.content.Context;
import i.c.a.a.j.r.i.c;

/* compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
public class d implements r {
    public final Context a;

    /* renamed from: b  reason: collision with root package name */
    public final c f2973b;
    public final f c;

    public d(Context context, c cVar, f fVar) {
        this.a = context;
        this.f2973b = cVar;
        this.c = fVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x008d, code lost:
        r5 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(i.c.a.a.j.h r18, int r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            android.content.ComponentName r3 = new android.content.ComponentName
            android.content.Context r4 = r0.a
            java.lang.Class<com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService> r5 = com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService.class
            r3.<init>(r4, r5)
            android.content.Context r4 = r0.a
            java.lang.String r5 = "jobscheduler"
            java.lang.Object r4 = r4.getSystemService(r5)
            android.app.job.JobScheduler r4 = (android.app.job.JobScheduler) r4
            java.util.zip.Adler32 r5 = new java.util.zip.Adler32
            r5.<init>()
            android.content.Context r6 = r0.a
            java.lang.String r6 = r6.getPackageName()
            java.lang.String r7 = "UTF-8"
            java.nio.charset.Charset r8 = java.nio.charset.Charset.forName(r7)
            byte[] r6 = r6.getBytes(r8)
            r5.update(r6)
            r6 = r1
            i.c.a.a.j.b r6 = (i.c.a.a.j.b) r6
            java.lang.String r8 = r6.a
            java.nio.charset.Charset r7 = java.nio.charset.Charset.forName(r7)
            byte[] r7 = r8.getBytes(r7)
            r5.update(r7)
            r7 = 4
            java.nio.ByteBuffer r8 = java.nio.ByteBuffer.allocate(r7)
            i.c.a.a.d r9 = r6.c
            int r9 = i.c.a.a.j.u.a.a((i.c.a.a.d) r9)
            java.nio.ByteBuffer r8 = r8.putInt(r9)
            byte[] r8 = r8.array()
            r5.update(r8)
            byte[] r6 = r6.f2933b
            if (r6 == 0) goto L_0x005e
            r5.update(r6)
        L_0x005e:
            long r5 = r5.getValue()
            int r6 = (int) r5
            java.util.List r5 = r4.getAllPendingJobs()
            java.util.Iterator r5 = r5.iterator()
        L_0x006b:
            boolean r8 = r5.hasNext()
            java.lang.String r9 = "attemptNumber"
            r10 = 1
            r11 = 0
            if (r8 == 0) goto L_0x008d
            java.lang.Object r8 = r5.next()
            android.app.job.JobInfo r8 = (android.app.job.JobInfo) r8
            android.os.PersistableBundle r12 = r8.getExtras()
            int r12 = r12.getInt(r9)
            int r8 = r8.getId()
            if (r8 != r6) goto L_0x006b
            if (r12 < r2) goto L_0x008d
            r5 = 1
            goto L_0x008e
        L_0x008d:
            r5 = 0
        L_0x008e:
            java.lang.String r8 = "JobInfoScheduler"
            if (r5 == 0) goto L_0x0098
            java.lang.String r2 = "Upload for context %s is already scheduled. Returning..."
            g.a.a.b.a.a((java.lang.String) r8, (java.lang.String) r2, (java.lang.Object) r1)
            return
        L_0x0098:
            i.c.a.a.j.r.i.c r5 = r0.f2973b
            long r12 = r5.a((i.c.a.a.j.h) r1)
            i.c.a.a.j.r.h.f r5 = r0.c
            android.app.job.JobInfo$Builder r14 = new android.app.job.JobInfo$Builder
            r14.<init>(r6, r3)
            r3 = r1
            i.c.a.a.j.b r3 = (i.c.a.a.j.b) r3
            i.c.a.a.d r15 = r3.c
            r16 = r8
            long r7 = r5.a(r15, r12, r2)
            r14.setMinimumLatency(r7)
            i.c.a.a.j.r.h.b r5 = (i.c.a.a.j.r.h.b) r5
            java.util.Map<i.c.a.a.d, i.c.a.a.j.r.h.f$a> r5 = r5.f2970b
            java.lang.Object r5 = r5.get(r15)
            i.c.a.a.j.r.h.f$a r5 = (i.c.a.a.j.r.h.f.a) r5
            i.c.a.a.j.r.h.c r5 = (i.c.a.a.j.r.h.c) r5
            java.util.Set<i.c.a.a.j.r.h.f$b> r5 = r5.c
            i.c.a.a.j.r.h.f$b r7 = i.c.a.a.j.r.h.f.b.NETWORK_UNMETERED
            boolean r7 = r5.contains(r7)
            r8 = 2
            if (r7 == 0) goto L_0x00ce
            r14.setRequiredNetworkType(r8)
            goto L_0x00d1
        L_0x00ce:
            r14.setRequiredNetworkType(r10)
        L_0x00d1:
            i.c.a.a.j.r.h.f$b r7 = i.c.a.a.j.r.h.f.b.DEVICE_CHARGING
            boolean r7 = r5.contains(r7)
            if (r7 == 0) goto L_0x00dc
            r14.setRequiresCharging(r10)
        L_0x00dc:
            i.c.a.a.j.r.h.f$b r7 = i.c.a.a.j.r.h.f.b.DEVICE_IDLE
            boolean r5 = r5.contains(r7)
            if (r5 == 0) goto L_0x00e7
            r14.setRequiresDeviceIdle(r10)
        L_0x00e7:
            android.os.PersistableBundle r5 = new android.os.PersistableBundle
            r5.<init>()
            r5.putInt(r9, r2)
            java.lang.String r7 = r3.a
            java.lang.String r9 = "backendName"
            r5.putString(r9, r7)
            i.c.a.a.d r7 = r3.c
            int r7 = i.c.a.a.j.u.a.a((i.c.a.a.d) r7)
            java.lang.String r9 = "priority"
            r5.putInt(r9, r7)
            byte[] r7 = r3.f2933b
            if (r7 == 0) goto L_0x010e
            java.lang.String r7 = android.util.Base64.encodeToString(r7, r11)
            java.lang.String r9 = "extras"
            r5.putString(r9, r7)
        L_0x010e:
            r14.setExtras(r5)
            r5 = 5
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r11] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            r5[r10] = r1
            i.c.a.a.j.r.h.f r1 = r0.c
            i.c.a.a.d r3 = r3.c
            long r6 = r1.a(r3, r12, r2)
            java.lang.Long r1 = java.lang.Long.valueOf(r6)
            r5[r8] = r1
            r1 = 3
            java.lang.Long r3 = java.lang.Long.valueOf(r12)
            r5[r1] = r3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r19)
            r2 = 4
            r5[r2] = r1
            java.lang.String r1 = "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d"
            r2 = r16
            g.a.a.b.a.a((java.lang.String) r2, (java.lang.String) r1, (java.lang.Object[]) r5)
            android.app.job.JobInfo r1 = r14.build()
            r4.schedule(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.a.a.j.r.h.d.a(i.c.a.a.j.h, int):void");
    }
}
