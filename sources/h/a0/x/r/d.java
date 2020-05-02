package h.a0.x.r;

import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import h.a0.c;
import h.a0.e;
import h.a0.l;
import h.a0.o;
import h.a0.x.b;
import h.a0.x.e;
import h.a0.x.f;
import h.a0.x.j;
import h.a0.x.q.p;
import java.util.HashSet;

/* compiled from: EnqueueRunnable */
public class d implements Runnable {

    /* renamed from: g  reason: collision with root package name */
    public static final String f1086g = l.a("EnqueueRunnable");
    public final f e;

    /* renamed from: f  reason: collision with root package name */
    public final b f1087f = new b();

    public d(f fVar) {
        this.e = fVar;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r0v43, types: [java.lang.Object[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0286  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(h.a0.x.f r23) {
        /*
            r0 = r23
            java.util.List<h.a0.x.f> r1 = r0.f949g
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0041
            java.util.Iterator r1 = r1.iterator()
            r4 = 0
        L_0x000d:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x0042
            java.lang.Object r5 = r1.next()
            h.a0.x.f r5 = (h.a0.x.f) r5
            boolean r6 = r5.f950h
            if (r6 != 0) goto L_0x0023
            boolean r5 = a((h.a0.x.f) r5)
            r4 = r4 | r5
            goto L_0x000d
        L_0x0023:
            h.a0.l r6 = h.a0.l.a()
            java.lang.String r7 = f1086g
            java.lang.Object[] r8 = new java.lang.Object[r3]
            java.util.List<java.lang.String> r5 = r5.e
            java.lang.String r9 = ", "
            java.lang.String r5 = android.text.TextUtils.join(r9, r5)
            r8[r2] = r5
            java.lang.String r5 = "Already enqueued work ids (%s)."
            java.lang.String r5 = java.lang.String.format(r5, r8)
            java.lang.Throwable[] r8 = new java.lang.Throwable[r2]
            r6.d(r7, r5, r8)
            goto L_0x000d
        L_0x0041:
            r4 = 0
        L_0x0042:
            java.util.Set r1 = h.a0.x.f.a(r23)
            h.a0.x.j r5 = r0.a
            java.util.List<? extends h.a0.v> r6 = r0.d
            java.lang.String[] r7 = new java.lang.String[r2]
            java.util.AbstractCollection r1 = (java.util.AbstractCollection) r1
            java.lang.Object[] r1 = r1.toArray(r7)
            java.lang.String[] r1 = (java.lang.String[]) r1
            java.lang.String r7 = r0.f947b
            h.a0.g r8 = r0.c
            long r9 = java.lang.System.currentTimeMillis()
            androidx.work.impl.WorkDatabase r11 = r5.c
            if (r1 == 0) goto L_0x0065
            int r12 = r1.length
            if (r12 <= 0) goto L_0x0065
            r12 = 1
            goto L_0x0066
        L_0x0065:
            r12 = 0
        L_0x0066:
            if (r12 == 0) goto L_0x00b8
            int r13 = r1.length
            r14 = 0
            r15 = 1
            r16 = 0
            r17 = 0
        L_0x006f:
            if (r14 >= r13) goto L_0x00bd
            r2 = r1[r14]
            h.a0.x.q.q r18 = r11.n()
            r3 = r18
            h.a0.x.q.r r3 = (h.a0.x.q.r) r3
            h.a0.x.q.p r3 = r3.c(r2)
            if (r3 != 0) goto L_0x009c
            h.a0.l r1 = h.a0.l.a()
            java.lang.String r3 = f1086g
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]
            r5 = 0
            r6[r5] = r2
            java.lang.String r2 = "Prerequisite %s doesn't exist; not enqueuing"
            java.lang.String r2 = java.lang.String.format(r2, r6)
            java.lang.Throwable[] r6 = new java.lang.Throwable[r5]
            r1.b(r3, r2, r6)
            r21 = r4
            goto L_0x01f2
        L_0x009c:
            h.a0.t r2 = r3.f1060b
            h.a0.t r3 = h.a0.t.SUCCEEDED
            if (r2 != r3) goto L_0x00a4
            r3 = 1
            goto L_0x00a5
        L_0x00a4:
            r3 = 0
        L_0x00a5:
            r15 = r15 & r3
            h.a0.t r3 = h.a0.t.FAILED
            if (r2 != r3) goto L_0x00ad
            r16 = 1
            goto L_0x00b3
        L_0x00ad:
            h.a0.t r3 = h.a0.t.CANCELLED
            if (r2 != r3) goto L_0x00b3
            r17 = 1
        L_0x00b3:
            int r14 = r14 + 1
            r2 = 0
            r3 = 1
            goto L_0x006f
        L_0x00b8:
            r15 = 1
            r16 = 0
            r17 = 0
        L_0x00bd:
            boolean r2 = android.text.TextUtils.isEmpty(r7)
            r3 = 1
            r2 = r2 ^ r3
            if (r2 == 0) goto L_0x00c9
            if (r12 != 0) goto L_0x00c9
            r3 = 1
            goto L_0x00ca
        L_0x00c9:
            r3 = 0
        L_0x00ca:
            if (r3 == 0) goto L_0x0270
            h.a0.x.q.q r3 = r11.n()
            h.a0.x.q.r r3 = (h.a0.x.q.r) r3
            if (r3 == 0) goto L_0x026e
            java.lang.String r14 = "SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)"
            r13 = 1
            h.s.j r14 = h.s.j.a(r14, r13)
            if (r7 != 0) goto L_0x00e1
            r14.bindNull(r13)
            goto L_0x00e4
        L_0x00e1:
            r14.bindString(r13, r7)
        L_0x00e4:
            h.s.h r13 = r3.a
            r13.b()
            h.s.h r3 = r3.a
            r19 = r12
            r12 = 0
            r13 = 0
            android.database.Cursor r3 = h.s.n.b.a(r3, r14, r12, r13)
            java.lang.String r12 = "id"
            int r12 = g.a.a.b.a.a((android.database.Cursor) r3, (java.lang.String) r12)     // Catch:{ all -> 0x0266 }
            java.lang.String r13 = "state"
            int r13 = g.a.a.b.a.a((android.database.Cursor) r3, (java.lang.String) r13)     // Catch:{ all -> 0x0266 }
            r20 = r15
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ all -> 0x0266 }
            r21 = r4
            int r4 = r3.getCount()     // Catch:{ all -> 0x0266 }
            r15.<init>(r4)     // Catch:{ all -> 0x0266 }
        L_0x010c:
            boolean r4 = r3.moveToNext()     // Catch:{ all -> 0x0266 }
            if (r4 == 0) goto L_0x012d
            h.a0.x.q.p$a r4 = new h.a0.x.q.p$a     // Catch:{ all -> 0x0266 }
            r4.<init>()     // Catch:{ all -> 0x0266 }
            java.lang.String r0 = r3.getString(r12)     // Catch:{ all -> 0x0266 }
            r4.a = r0     // Catch:{ all -> 0x0266 }
            int r0 = r3.getInt(r13)     // Catch:{ all -> 0x0266 }
            h.a0.t r0 = g.a.a.b.a.d(r0)     // Catch:{ all -> 0x0266 }
            r4.f1073b = r0     // Catch:{ all -> 0x0266 }
            r15.add(r4)     // Catch:{ all -> 0x0266 }
            r0 = r23
            goto L_0x010c
        L_0x012d:
            r3.close()
            r14.f()
            boolean r0 = r15.isEmpty()
            if (r0 != 0) goto L_0x0276
            h.a0.g r0 = h.a0.g.APPEND
            if (r8 != r0) goto L_0x01d4
            h.a0.x.q.b r0 = r11.i()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r4 = r15.iterator()
            r15 = r20
        L_0x014c:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L_0x01c4
            java.lang.Object r8 = r4.next()
            h.a0.x.q.p$a r8 = (h.a0.x.q.p.a) r8
            java.lang.String r12 = r8.a
            r13 = r0
            h.a0.x.q.c r13 = (h.a0.x.q.c) r13
            if (r13 == 0) goto L_0x01c2
            java.lang.String r14 = "SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?"
            r19 = r0
            r0 = 1
            h.s.j r14 = h.s.j.a(r14, r0)
            if (r12 != 0) goto L_0x016e
            r14.bindNull(r0)
            goto L_0x0171
        L_0x016e:
            r14.bindString(r0, r12)
        L_0x0171:
            h.s.h r0 = r13.a
            r0.b()
            h.s.h r0 = r13.a
            r22 = r4
            r12 = 0
            r13 = 0
            android.database.Cursor r4 = h.s.n.b.a(r0, r14, r13, r12)
            boolean r0 = r4.moveToFirst()     // Catch:{ all -> 0x01ba }
            if (r0 == 0) goto L_0x018e
            int r0 = r4.getInt(r13)     // Catch:{ all -> 0x01ba }
            if (r0 == 0) goto L_0x018e
            r0 = 1
            goto L_0x018f
        L_0x018e:
            r0 = 0
        L_0x018f:
            r4.close()
            r14.f()
            if (r0 != 0) goto L_0x01b5
            h.a0.t r0 = r8.f1073b
            h.a0.t r4 = h.a0.t.SUCCEEDED
            if (r0 != r4) goto L_0x019f
            r0 = 1
            goto L_0x01a0
        L_0x019f:
            r0 = 0
        L_0x01a0:
            r15 = r15 & r0
            h.a0.t r0 = r8.f1073b
            h.a0.t r4 = h.a0.t.FAILED
            if (r0 != r4) goto L_0x01aa
            r16 = 1
            goto L_0x01b0
        L_0x01aa:
            h.a0.t r4 = h.a0.t.CANCELLED
            if (r0 != r4) goto L_0x01b0
            r17 = 1
        L_0x01b0:
            java.lang.String r0 = r8.a
            r3.add(r0)
        L_0x01b5:
            r0 = r19
            r4 = r22
            goto L_0x014c
        L_0x01ba:
            r0 = move-exception
            r4.close()
            r14.f()
            throw r0
        L_0x01c2:
            r0 = 0
            throw r0
        L_0x01c4:
            java.lang.Object[] r0 = r3.toArray(r1)
            r1 = r0
            java.lang.String[] r1 = (java.lang.String[]) r1
            int r0 = r1.length
            if (r0 <= 0) goto L_0x01d0
            r12 = 1
            goto L_0x01d1
        L_0x01d0:
            r12 = 0
        L_0x01d1:
            r13 = 0
            goto L_0x027b
        L_0x01d4:
            h.a0.g r0 = h.a0.g.KEEP
            if (r8 != r0) goto L_0x01f8
            java.util.Iterator r0 = r15.iterator()
        L_0x01dc:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x01f8
            java.lang.Object r3 = r0.next()
            h.a0.x.q.p$a r3 = (h.a0.x.q.p.a) r3
            h.a0.t r3 = r3.f1073b
            h.a0.t r4 = h.a0.t.ENQUEUED
            if (r3 == r4) goto L_0x01f2
            h.a0.t r4 = h.a0.t.RUNNING
            if (r3 != r4) goto L_0x01dc
        L_0x01f2:
            r1 = 1
            r2 = 0
        L_0x01f4:
            r0 = r23
            goto L_0x03dc
        L_0x01f8:
            h.a0.x.r.b r0 = new h.a0.x.r.b
            r3 = 0
            r0.<init>(r5, r7, r3)
            r0.run()
            h.a0.x.q.q r0 = r11.n()
            java.util.Iterator r3 = r15.iterator()
        L_0x0209:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x025f
            java.lang.Object r4 = r3.next()
            h.a0.x.q.p$a r4 = (h.a0.x.q.p.a) r4
            java.lang.String r4 = r4.a
            r8 = r0
            h.a0.x.q.r r8 = (h.a0.x.q.r) r8
            h.s.h r12 = r8.a
            r12.b()
            h.s.l r12 = r8.c
            h.v.a.f.f r12 = r12.a()
            if (r4 != 0) goto L_0x022e
            android.database.sqlite.SQLiteProgram r4 = r12.e
            r13 = 1
            r4.bindNull(r13)
            goto L_0x0234
        L_0x022e:
            r13 = 1
            android.database.sqlite.SQLiteProgram r14 = r12.e
            r14.bindString(r13, r4)
        L_0x0234:
            h.s.h r4 = r8.a
            r4.c()
            r12.f()     // Catch:{ all -> 0x0253 }
            h.s.h r4 = r8.a     // Catch:{ all -> 0x0253 }
            r4.h()     // Catch:{ all -> 0x0253 }
            h.s.h r4 = r8.a
            r4.e()
            h.s.l r4 = r8.c
            h.v.a.f.f r8 = r4.c
            if (r12 != r8) goto L_0x0209
            java.util.concurrent.atomic.AtomicBoolean r4 = r4.a
            r13 = 0
            r4.set(r13)
            goto L_0x0209
        L_0x0253:
            r0 = move-exception
            h.s.h r1 = r8.a
            r1.e()
            h.s.l r1 = r8.c
            r1.a(r12)
            throw r0
        L_0x025f:
            r13 = 0
            r12 = r19
            r15 = r20
            r0 = 1
            goto L_0x027c
        L_0x0266:
            r0 = move-exception
            r3.close()
            r14.f()
            throw r0
        L_0x026e:
            r0 = 0
            throw r0
        L_0x0270:
            r21 = r4
            r19 = r12
            r20 = r15
        L_0x0276:
            r13 = 0
            r12 = r19
            r15 = r20
        L_0x027b:
            r0 = 0
        L_0x027c:
            java.util.Iterator r3 = r6.iterator()
        L_0x0280:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x03d8
            java.lang.Object r4 = r3.next()
            h.a0.v r4 = (h.a0.v) r4
            h.a0.x.q.p r6 = r4.f931b
            if (r12 == 0) goto L_0x02a5
            if (r15 != 0) goto L_0x02a5
            if (r16 == 0) goto L_0x0299
            h.a0.t r8 = h.a0.t.FAILED
            r6.f1060b = r8
            goto L_0x02b2
        L_0x0299:
            if (r17 == 0) goto L_0x02a0
            h.a0.t r8 = h.a0.t.CANCELLED
            r6.f1060b = r8
            goto L_0x02b2
        L_0x02a0:
            h.a0.t r8 = h.a0.t.BLOCKED
            r6.f1060b = r8
            goto L_0x02b2
        L_0x02a5:
            boolean r8 = r6.d()
            if (r8 != 0) goto L_0x02ae
            r6.f1069n = r9
            goto L_0x02b2
        L_0x02ae:
            r13 = 0
            r6.f1069n = r13
        L_0x02b2:
            int r8 = android.os.Build.VERSION.SDK_INT
            r13 = 23
            if (r8 < r13) goto L_0x02c0
            r13 = 25
            if (r8 > r13) goto L_0x02c0
            a((h.a0.x.q.p) r6)
            goto L_0x02f0
        L_0x02c0:
            int r8 = android.os.Build.VERSION.SDK_INT
            r13 = 22
            if (r8 > r13) goto L_0x02f0
            java.lang.String r8 = "androidx.work.impl.background.gcm.GcmScheduler"
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch:{ ClassNotFoundException -> 0x02ea }
            java.util.List<h.a0.x.d> r13 = r5.e     // Catch:{ ClassNotFoundException -> 0x02ea }
            java.util.Iterator r13 = r13.iterator()     // Catch:{ ClassNotFoundException -> 0x02ea }
        L_0x02d2:
            boolean r14 = r13.hasNext()     // Catch:{ ClassNotFoundException -> 0x02ea }
            if (r14 == 0) goto L_0x02ea
            java.lang.Object r14 = r13.next()     // Catch:{ ClassNotFoundException -> 0x02ea }
            h.a0.x.d r14 = (h.a0.x.d) r14     // Catch:{ ClassNotFoundException -> 0x02ea }
            java.lang.Class r14 = r14.getClass()     // Catch:{ ClassNotFoundException -> 0x02ea }
            boolean r14 = r8.isAssignableFrom(r14)     // Catch:{ ClassNotFoundException -> 0x02ea }
            if (r14 == 0) goto L_0x02d2
            r8 = 1
            goto L_0x02eb
        L_0x02ea:
            r8 = 0
        L_0x02eb:
            if (r8 == 0) goto L_0x02f0
            a((h.a0.x.q.p) r6)
        L_0x02f0:
            h.a0.t r8 = r6.f1060b
            h.a0.t r13 = h.a0.t.ENQUEUED
            if (r8 != r13) goto L_0x02f7
            r0 = 1
        L_0x02f7:
            h.a0.x.q.q r8 = r11.n()
            h.a0.x.q.r r8 = (h.a0.x.q.r) r8
            h.s.h r13 = r8.a
            r13.b()
            h.s.h r13 = r8.a
            r13.c()
            h.s.c<h.a0.x.q.p> r13 = r8.f1074b     // Catch:{ all -> 0x03d1 }
            r13.a(r6)     // Catch:{ all -> 0x03d1 }
            h.s.h r6 = r8.a     // Catch:{ all -> 0x03d1 }
            r6.h()     // Catch:{ all -> 0x03d1 }
            h.s.h r6 = r8.a
            r6.e()
            if (r12 == 0) goto L_0x0355
            int r6 = r1.length
            r8 = 0
        L_0x031a:
            if (r8 >= r6) goto L_0x0355
            r13 = r1[r8]
            h.a0.x.q.a r14 = new h.a0.x.q.a
            r18 = r0
            java.lang.String r0 = r4.a()
            r14.<init>(r0, r13)
            h.a0.x.q.b r0 = r11.i()
            r13 = r0
            h.a0.x.q.c r13 = (h.a0.x.q.c) r13
            h.s.h r0 = r13.a
            r0.b()
            h.s.h r0 = r13.a
            r0.c()
            h.s.c<h.a0.x.q.a> r0 = r13.f1051b     // Catch:{ all -> 0x034e }
            r0.a(r14)     // Catch:{ all -> 0x034e }
            h.s.h r0 = r13.a     // Catch:{ all -> 0x034e }
            r0.h()     // Catch:{ all -> 0x034e }
            h.s.h r0 = r13.a
            r0.e()
            int r8 = r8 + 1
            r0 = r18
            goto L_0x031a
        L_0x034e:
            r0 = move-exception
            h.s.h r1 = r13.a
            r1.e()
            throw r0
        L_0x0355:
            r18 = r0
            java.util.Set<java.lang.String> r0 = r4.c
            java.util.Iterator r0 = r0.iterator()
        L_0x035d:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x0399
            java.lang.Object r6 = r0.next()
            java.lang.String r6 = (java.lang.String) r6
            h.a0.x.q.t r8 = r11.o()
            h.a0.x.q.s r13 = new h.a0.x.q.s
            java.lang.String r14 = r4.a()
            r13.<init>(r6, r14)
            h.a0.x.q.u r8 = (h.a0.x.q.u) r8
            h.s.h r6 = r8.a
            r6.b()
            h.s.h r6 = r8.a
            r6.c()
            h.s.c<h.a0.x.q.s> r6 = r8.f1080b     // Catch:{ all -> 0x0392 }
            r6.a(r13)     // Catch:{ all -> 0x0392 }
            h.s.h r6 = r8.a     // Catch:{ all -> 0x0392 }
            r6.h()     // Catch:{ all -> 0x0392 }
            h.s.h r6 = r8.a
            r6.e()
            goto L_0x035d
        L_0x0392:
            r0 = move-exception
            h.s.h r1 = r8.a
            r1.e()
            throw r0
        L_0x0399:
            if (r2 == 0) goto L_0x03cc
            h.a0.x.q.k r0 = r11.l()
            h.a0.x.q.j r6 = new h.a0.x.q.j
            java.lang.String r4 = r4.a()
            r6.<init>(r7, r4)
            r4 = r0
            h.a0.x.q.l r4 = (h.a0.x.q.l) r4
            h.s.h r0 = r4.a
            r0.b()
            h.s.h r0 = r4.a
            r0.c()
            h.s.c<h.a0.x.q.j> r0 = r4.f1057b     // Catch:{ all -> 0x03c5 }
            r0.a(r6)     // Catch:{ all -> 0x03c5 }
            h.s.h r0 = r4.a     // Catch:{ all -> 0x03c5 }
            r0.h()     // Catch:{ all -> 0x03c5 }
            h.s.h r0 = r4.a
            r0.e()
            goto L_0x03cc
        L_0x03c5:
            r0 = move-exception
            h.s.h r1 = r4.a
            r1.e()
            throw r0
        L_0x03cc:
            r0 = r18
            r13 = 0
            goto L_0x0280
        L_0x03d1:
            r0 = move-exception
            h.s.h r1 = r8.a
            r1.e()
            throw r0
        L_0x03d8:
            r1 = 1
            r2 = r0
            goto L_0x01f4
        L_0x03dc:
            r0.f950h = r1
            r0 = r21 | r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h.a0.x.r.d.a(h.a0.x.f):boolean");
    }

    public void run() {
        WorkDatabase workDatabase;
        try {
            f fVar = this.e;
            if (fVar == null) {
                throw null;
            } else if (!f.a(fVar, new HashSet())) {
                workDatabase = this.e.a.c;
                workDatabase.c();
                boolean a = a(this.e);
                workDatabase.h();
                workDatabase.e();
                if (a) {
                    f.a(this.e.a.a, RescheduleReceiver.class, true);
                    j jVar = this.e.a;
                    e.a(jVar.f958b, jVar.c, jVar.e);
                }
                this.f1087f.a(o.a);
            } else {
                throw new IllegalStateException(String.format("WorkContinuation has cycles (%s)", new Object[]{this.e}));
            }
        } catch (Throwable th) {
            this.f1087f.a(new o.b.a(th));
        }
    }

    public static void a(p pVar) {
        c cVar = pVar.f1065j;
        if (cVar.d || cVar.e) {
            String str = pVar.c;
            e.a aVar = new e.a();
            aVar.a(pVar.e.a);
            aVar.a.put("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str);
            pVar.c = ConstraintTrackingWorker.class.getName();
            pVar.e = aVar.a();
        }
    }
}
