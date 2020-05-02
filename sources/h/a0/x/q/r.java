package h.a0.x.q;

import android.database.Cursor;
import android.os.CancellationSignal;
import h.a0.t;
import h.s.j;
import h.s.l;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WorkSpecDao_Impl */
public final class r implements q {
    public final h.s.h a;

    /* renamed from: b  reason: collision with root package name */
    public final h.s.c<p> f1074b;
    public final l c;
    public final l d;
    public final l e;

    /* renamed from: f  reason: collision with root package name */
    public final l f1075f;

    /* renamed from: g  reason: collision with root package name */
    public final l f1076g;

    /* renamed from: h  reason: collision with root package name */
    public final l f1077h;

    /* renamed from: i  reason: collision with root package name */
    public final l f1078i;

    /* compiled from: WorkSpecDao_Impl */
    public class a extends h.s.c<p> {
        public a(r rVar, h.s.h hVar) {
            super(hVar);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: byte[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: java.io.ObjectOutputStream} */
        /* JADX WARNING: type inference failed for: r3v11 */
        /* JADX WARNING: type inference failed for: r3v18 */
        /* JADX WARNING: type inference failed for: r3v27 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:62:0x01b1 A[SYNTHETIC, Splitter:B:62:0x01b1] */
        /* JADX WARNING: Removed duplicated region for block: B:72:0x01c9  */
        /* JADX WARNING: Removed duplicated region for block: B:73:0x01d1  */
        /* JADX WARNING: Removed duplicated region for block: B:76:0x01dd A[SYNTHETIC, Splitter:B:76:0x01dd] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a(h.v.a.f.f r17, java.lang.Object r18) {
            /*
                r16 = this;
                r1 = r17
                r0 = r18
                h.a0.x.q.p r0 = (h.a0.x.q.p) r0
                java.lang.String r2 = r0.a
                r3 = 1
                if (r2 != 0) goto L_0x0011
                android.database.sqlite.SQLiteProgram r2 = r1.e
                r2.bindNull(r3)
                goto L_0x0016
            L_0x0011:
                android.database.sqlite.SQLiteProgram r4 = r1.e
                r4.bindString(r3, r2)
            L_0x0016:
                h.a0.t r2 = r0.f1060b
                int r2 = g.a.a.b.a.a((h.a0.t) r2)
                long r4 = (long) r2
                android.database.sqlite.SQLiteProgram r2 = r1.e
                r6 = 2
                r2.bindLong(r6, r4)
                java.lang.String r2 = r0.c
                r4 = 3
                if (r2 != 0) goto L_0x002e
                android.database.sqlite.SQLiteProgram r2 = r1.e
                r2.bindNull(r4)
                goto L_0x0033
            L_0x002e:
                android.database.sqlite.SQLiteProgram r5 = r1.e
                r5.bindString(r4, r2)
            L_0x0033:
                java.lang.String r2 = r0.d
                r5 = 4
                if (r2 != 0) goto L_0x003e
                android.database.sqlite.SQLiteProgram r2 = r1.e
                r2.bindNull(r5)
                goto L_0x0043
            L_0x003e:
                android.database.sqlite.SQLiteProgram r7 = r1.e
                r7.bindString(r5, r2)
            L_0x0043:
                h.a0.e r2 = r0.e
                byte[] r2 = h.a0.e.a((h.a0.e) r2)
                r7 = 5
                if (r2 != 0) goto L_0x0052
                android.database.sqlite.SQLiteProgram r2 = r1.e
                r2.bindNull(r7)
                goto L_0x0057
            L_0x0052:
                android.database.sqlite.SQLiteProgram r8 = r1.e
                r8.bindBlob(r7, r2)
            L_0x0057:
                h.a0.e r2 = r0.f1061f
                byte[] r2 = h.a0.e.a((h.a0.e) r2)
                r7 = 6
                if (r2 != 0) goto L_0x0066
                android.database.sqlite.SQLiteProgram r2 = r1.e
                r2.bindNull(r7)
                goto L_0x006b
            L_0x0066:
                android.database.sqlite.SQLiteProgram r8 = r1.e
                r8.bindBlob(r7, r2)
            L_0x006b:
                r2 = 7
                long r7 = r0.f1062g
                android.database.sqlite.SQLiteProgram r9 = r1.e
                r9.bindLong(r2, r7)
                r2 = 8
                long r7 = r0.f1063h
                android.database.sqlite.SQLiteProgram r9 = r1.e
                r9.bindLong(r2, r7)
                r2 = 9
                long r7 = r0.f1064i
                android.database.sqlite.SQLiteProgram r9 = r1.e
                r9.bindLong(r2, r7)
                r2 = 10
                int r7 = r0.f1066k
                long r7 = (long) r7
                android.database.sqlite.SQLiteProgram r9 = r1.e
                r9.bindLong(r2, r7)
                h.a0.a r2 = r0.f1067l
                int r7 = r2.ordinal()
                java.lang.String r8 = " to int"
                java.lang.String r9 = "Could not convert "
                if (r7 == 0) goto L_0x00b7
                if (r7 != r3) goto L_0x009f
                r2 = 1
                goto L_0x00b8
            L_0x009f:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r9)
                r1.append(r2)
                r1.append(r8)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x00b7:
                r2 = 0
            L_0x00b8:
                r7 = 11
                long r11 = (long) r2
                android.database.sqlite.SQLiteProgram r2 = r1.e
                r2.bindLong(r7, r11)
                r2 = 12
                long r11 = r0.f1068m
                android.database.sqlite.SQLiteProgram r7 = r1.e
                r7.bindLong(r2, r11)
                r2 = 13
                long r11 = r0.f1069n
                android.database.sqlite.SQLiteProgram r7 = r1.e
                r7.bindLong(r2, r11)
                r2 = 14
                long r11 = r0.f1070o
                android.database.sqlite.SQLiteProgram r7 = r1.e
                r7.bindLong(r2, r11)
                r2 = 15
                long r11 = r0.f1071p
                android.database.sqlite.SQLiteProgram r7 = r1.e
                r7.bindLong(r2, r11)
                boolean r2 = r0.f1072q
                r7 = 16
                long r11 = (long) r2
                android.database.sqlite.SQLiteProgram r2 = r1.e
                r2.bindLong(r7, r11)
                h.a0.c r0 = r0.f1065j
                r2 = 22
                r7 = 21
                r11 = 20
                r12 = 19
                r13 = 18
                r14 = 17
                if (r0 == 0) goto L_0x01f0
                h.a0.m r10 = r0.a
                int r15 = r10.ordinal()
                if (r15 == 0) goto L_0x012c
                if (r15 == r3) goto L_0x012a
                if (r15 == r6) goto L_0x0129
                if (r15 == r4) goto L_0x0127
                if (r15 != r5) goto L_0x010f
                goto L_0x012d
            L_0x010f:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r9)
                r1.append(r10)
                r1.append(r8)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x0127:
                r3 = 3
                goto L_0x012a
            L_0x0129:
                r3 = 2
            L_0x012a:
                r5 = r3
                goto L_0x012d
            L_0x012c:
                r5 = 0
            L_0x012d:
                long r3 = (long) r5
                android.database.sqlite.SQLiteProgram r5 = r1.e
                r5.bindLong(r14, r3)
                boolean r3 = r0.f902b
                long r3 = (long) r3
                android.database.sqlite.SQLiteProgram r5 = r1.e
                r5.bindLong(r13, r3)
                boolean r3 = r0.c
                long r3 = (long) r3
                android.database.sqlite.SQLiteProgram r5 = r1.e
                r5.bindLong(r12, r3)
                boolean r3 = r0.d
                long r3 = (long) r3
                android.database.sqlite.SQLiteProgram r5 = r1.e
                r5.bindLong(r11, r3)
                boolean r3 = r0.e
                long r3 = (long) r3
                android.database.sqlite.SQLiteProgram r5 = r1.e
                r5.bindLong(r7, r3)
                long r3 = r0.f903f
                android.database.sqlite.SQLiteProgram r5 = r1.e
                r5.bindLong(r2, r3)
                long r2 = r0.f904g
                android.database.sqlite.SQLiteProgram r4 = r1.e
                r5 = 23
                r4.bindLong(r5, r2)
                h.a0.d r0 = r0.f905h
                int r2 = r0.a()
                r3 = 0
                if (r2 != 0) goto L_0x016d
                goto L_0x01c7
            L_0x016d:
                java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream
                r2.<init>()
                java.io.ObjectOutputStream r4 = new java.io.ObjectOutputStream     // Catch:{ IOException -> 0x01ab }
                r4.<init>(r2)     // Catch:{ IOException -> 0x01ab }
                int r3 = r0.a()     // Catch:{ IOException -> 0x01a6, all -> 0x01a3 }
                r4.writeInt(r3)     // Catch:{ IOException -> 0x01a6, all -> 0x01a3 }
                java.util.Set<h.a0.d$a> r0 = r0.a     // Catch:{ IOException -> 0x01a6, all -> 0x01a3 }
                java.util.Iterator r0 = r0.iterator()     // Catch:{ IOException -> 0x01a6, all -> 0x01a3 }
            L_0x0184:
                boolean r3 = r0.hasNext()     // Catch:{ IOException -> 0x01a6, all -> 0x01a3 }
                if (r3 == 0) goto L_0x019f
                java.lang.Object r3 = r0.next()     // Catch:{ IOException -> 0x01a6, all -> 0x01a3 }
                h.a0.d$a r3 = (h.a0.d.a) r3     // Catch:{ IOException -> 0x01a6, all -> 0x01a3 }
                android.net.Uri r5 = r3.a     // Catch:{ IOException -> 0x01a6, all -> 0x01a3 }
                java.lang.String r5 = r5.toString()     // Catch:{ IOException -> 0x01a6, all -> 0x01a3 }
                r4.writeUTF(r5)     // Catch:{ IOException -> 0x01a6, all -> 0x01a3 }
                boolean r3 = r3.f910b     // Catch:{ IOException -> 0x01a6, all -> 0x01a3 }
                r4.writeBoolean(r3)     // Catch:{ IOException -> 0x01a6, all -> 0x01a3 }
                goto L_0x0184
            L_0x019f:
                r4.close()     // Catch:{ IOException -> 0x01b5 }
                goto L_0x01ba
            L_0x01a3:
                r0 = move-exception
                r1 = r0
                goto L_0x01db
            L_0x01a6:
                r0 = move-exception
                r3 = r4
                goto L_0x01ac
            L_0x01a9:
                r0 = move-exception
                goto L_0x01d9
            L_0x01ab:
                r0 = move-exception
            L_0x01ac:
                r0.printStackTrace()     // Catch:{ all -> 0x01a9 }
                if (r3 == 0) goto L_0x01ba
                r3.close()     // Catch:{ IOException -> 0x01b5 }
                goto L_0x01ba
            L_0x01b5:
                r0 = move-exception
                r3 = r0
                r3.printStackTrace()
            L_0x01ba:
                r2.close()     // Catch:{ IOException -> 0x01be }
                goto L_0x01c3
            L_0x01be:
                r0 = move-exception
                r3 = r0
                r3.printStackTrace()
            L_0x01c3:
                byte[] r3 = r2.toByteArray()
            L_0x01c7:
                if (r3 != 0) goto L_0x01d1
                android.database.sqlite.SQLiteProgram r0 = r1.e
                r2 = 24
                r0.bindNull(r2)
                goto L_0x021c
            L_0x01d1:
                r2 = 24
                android.database.sqlite.SQLiteProgram r0 = r1.e
                r0.bindBlob(r2, r3)
                goto L_0x021c
            L_0x01d9:
                r1 = r0
                r4 = r3
            L_0x01db:
                if (r4 == 0) goto L_0x01e6
                r4.close()     // Catch:{ IOException -> 0x01e1 }
                goto L_0x01e6
            L_0x01e1:
                r0 = move-exception
                r3 = r0
                r3.printStackTrace()
            L_0x01e6:
                r2.close()     // Catch:{ IOException -> 0x01ea }
                goto L_0x01ef
            L_0x01ea:
                r0 = move-exception
                r2 = r0
                r2.printStackTrace()
            L_0x01ef:
                throw r1
            L_0x01f0:
                android.database.sqlite.SQLiteProgram r0 = r1.e
                r0.bindNull(r14)
                android.database.sqlite.SQLiteProgram r0 = r1.e
                r0.bindNull(r13)
                android.database.sqlite.SQLiteProgram r0 = r1.e
                r0.bindNull(r12)
                android.database.sqlite.SQLiteProgram r0 = r1.e
                r0.bindNull(r11)
                android.database.sqlite.SQLiteProgram r0 = r1.e
                r0.bindNull(r7)
                android.database.sqlite.SQLiteProgram r0 = r1.e
                r0.bindNull(r2)
                android.database.sqlite.SQLiteProgram r0 = r1.e
                r2 = 23
                r0.bindNull(r2)
                android.database.sqlite.SQLiteProgram r0 = r1.e
                r1 = 24
                r0.bindNull(r1)
            L_0x021c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: h.a0.x.q.r.a.a(h.v.a.f.f, java.lang.Object):void");
        }

        public String b() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    /* compiled from: WorkSpecDao_Impl */
    public class b extends l {
        public b(r rVar, h.s.h hVar) {
            super(hVar);
        }

        public String b() {
            return "DELETE FROM workspec WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl */
    public class c extends l {
        public c(r rVar, h.s.h hVar) {
            super(hVar);
        }

        public String b() {
            return "UPDATE workspec SET output=? WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl */
    public class d extends l {
        public d(r rVar, h.s.h hVar) {
            super(hVar);
        }

        public String b() {
            return "UPDATE workspec SET period_start_time=? WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl */
    public class e extends l {
        public e(r rVar, h.s.h hVar) {
            super(hVar);
        }

        public String b() {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl */
    public class f extends l {
        public f(r rVar, h.s.h hVar) {
            super(hVar);
        }

        public String b() {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl */
    public class g extends l {
        public g(r rVar, h.s.h hVar) {
            super(hVar);
        }

        public String b() {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl */
    public class h extends l {
        public h(r rVar, h.s.h hVar) {
            super(hVar);
        }

        public String b() {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }

    /* compiled from: WorkSpecDao_Impl */
    public class i extends l {
        public i(r rVar, h.s.h hVar) {
            super(hVar);
        }

        public String b() {
            return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
        }
    }

    public r(h.s.h hVar) {
        this.a = hVar;
        this.f1074b = new a(this, hVar);
        this.c = new b(this, hVar);
        this.d = new c(this, hVar);
        this.e = new d(this, hVar);
        this.f1075f = new e(this, hVar);
        this.f1076g = new f(this, hVar);
        this.f1077h = new g(this, hVar);
        this.f1078i = new h(this, hVar);
        new i(this, hVar);
    }

    public void a(String str, h.a0.e eVar) {
        this.a.b();
        h.v.a.f.f a2 = this.d.a();
        byte[] a3 = h.a0.e.a(eVar);
        if (a3 == null) {
            a2.e.bindNull(1);
        } else {
            a2.e.bindBlob(1, a3);
        }
        if (str == null) {
            a2.e.bindNull(2);
        } else {
            a2.e.bindString(2, str);
        }
        this.a.c();
        try {
            a2.f();
            this.a.h();
            this.a.e();
            l lVar = this.d;
            if (a2 == lVar.c) {
                lVar.a.set(false);
            }
        } catch (Throwable th) {
            this.a.e();
            this.d.a(a2);
            throw th;
        }
    }

    public void b(String str, long j2) {
        this.a.b();
        h.v.a.f.f a2 = this.e.a();
        a2.e.bindLong(1, j2);
        if (str == null) {
            a2.e.bindNull(2);
        } else {
            a2.e.bindString(2, str);
        }
        this.a.c();
        try {
            a2.f();
            this.a.h();
        } finally {
            this.a.e();
            l lVar = this.e;
            if (a2 == lVar.c) {
                lVar.a.set(false);
            }
        }
    }

    public p c(String str) {
        j jVar;
        p pVar;
        String str2 = str;
        j a2 = j.a("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground` FROM workspec WHERE id=?", 1);
        if (str2 == null) {
            a2.bindNull(1);
        } else {
            a2.bindString(1, str2);
        }
        this.a.b();
        Cursor a3 = h.s.n.b.a(this.a, a2, false, (CancellationSignal) null);
        try {
            int a4 = g.a.a.b.a.a(a3, "required_network_type");
            int a5 = g.a.a.b.a.a(a3, "requires_charging");
            int a6 = g.a.a.b.a.a(a3, "requires_device_idle");
            int a7 = g.a.a.b.a.a(a3, "requires_battery_not_low");
            int a8 = g.a.a.b.a.a(a3, "requires_storage_not_low");
            int a9 = g.a.a.b.a.a(a3, "trigger_content_update_delay");
            int a10 = g.a.a.b.a.a(a3, "trigger_max_content_delay");
            int a11 = g.a.a.b.a.a(a3, "content_uri_triggers");
            int a12 = g.a.a.b.a.a(a3, "id");
            int a13 = g.a.a.b.a.a(a3, "state");
            int a14 = g.a.a.b.a.a(a3, "worker_class_name");
            int a15 = g.a.a.b.a.a(a3, "input_merger_class_name");
            int a16 = g.a.a.b.a.a(a3, "input");
            int a17 = g.a.a.b.a.a(a3, "output");
            jVar = a2;
            try {
                int a18 = g.a.a.b.a.a(a3, "initial_delay");
                int a19 = g.a.a.b.a.a(a3, "interval_duration");
                int a20 = g.a.a.b.a.a(a3, "flex_duration");
                int a21 = g.a.a.b.a.a(a3, "run_attempt_count");
                int a22 = g.a.a.b.a.a(a3, "backoff_policy");
                int a23 = g.a.a.b.a.a(a3, "backoff_delay_duration");
                int a24 = g.a.a.b.a.a(a3, "period_start_time");
                int a25 = g.a.a.b.a.a(a3, "minimum_retention_duration");
                int a26 = g.a.a.b.a.a(a3, "schedule_requested_at");
                int a27 = g.a.a.b.a.a(a3, "run_in_foreground");
                if (a3.moveToFirst()) {
                    String string = a3.getString(a12);
                    String string2 = a3.getString(a14);
                    int i2 = a27;
                    h.a0.c cVar = new h.a0.c();
                    cVar.a = g.a.a.b.a.c(a3.getInt(a4));
                    cVar.f902b = a3.getInt(a5) != 0;
                    cVar.c = a3.getInt(a6) != 0;
                    cVar.d = a3.getInt(a7) != 0;
                    cVar.e = a3.getInt(a8) != 0;
                    cVar.f903f = a3.getLong(a9);
                    cVar.f904g = a3.getLong(a10);
                    cVar.f905h = g.a.a.b.a.a(a3.getBlob(a11));
                    p pVar2 = new p(string, string2);
                    pVar2.f1060b = g.a.a.b.a.d(a3.getInt(a13));
                    pVar2.d = a3.getString(a15);
                    pVar2.e = h.a0.e.b(a3.getBlob(a16));
                    pVar2.f1061f = h.a0.e.b(a3.getBlob(a17));
                    pVar2.f1062g = a3.getLong(a18);
                    pVar2.f1063h = a3.getLong(a19);
                    pVar2.f1064i = a3.getLong(a20);
                    pVar2.f1066k = a3.getInt(a21);
                    pVar2.f1067l = g.a.a.b.a.b(a3.getInt(a22));
                    pVar2.f1068m = a3.getLong(a23);
                    pVar2.f1069n = a3.getLong(a24);
                    pVar2.f1070o = a3.getLong(a25);
                    pVar2.f1071p = a3.getLong(a26);
                    pVar2.f1072q = a3.getInt(i2) != 0;
                    pVar2.f1065j = cVar;
                    pVar = pVar2;
                } else {
                    pVar = null;
                }
                a3.close();
                jVar.f();
                return pVar;
            } catch (Throwable th) {
                th = th;
                a3.close();
                jVar.f();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            jVar = a2;
            a3.close();
            jVar.f();
            throw th;
        }
    }

    public int d(String str) {
        this.a.b();
        h.v.a.f.f a2 = this.f1075f.a();
        if (str == null) {
            a2.e.bindNull(1);
        } else {
            a2.e.bindString(1, str);
        }
        this.a.c();
        try {
            int f2 = a2.f();
            this.a.h();
            this.a.e();
            l lVar = this.f1075f;
            if (a2 == lVar.c) {
                lVar.a.set(false);
            }
            return f2;
        } catch (Throwable th) {
            this.a.e();
            this.f1075f.a(a2);
            throw th;
        }
    }

    public int e(String str) {
        this.a.b();
        h.v.a.f.f a2 = this.f1076g.a();
        if (str == null) {
            a2.e.bindNull(1);
        } else {
            a2.e.bindString(1, str);
        }
        this.a.c();
        try {
            int f2 = a2.f();
            this.a.h();
            this.a.e();
            l lVar = this.f1076g;
            if (a2 == lVar.c) {
                lVar.a.set(false);
            }
            return f2;
        } catch (Throwable th) {
            this.a.e();
            this.f1076g.a(a2);
            throw th;
        }
    }

    public int a(String str, long j2) {
        this.a.b();
        h.v.a.f.f a2 = this.f1077h.a();
        a2.e.bindLong(1, j2);
        if (str == null) {
            a2.e.bindNull(2);
        } else {
            a2.e.bindString(2, str);
        }
        this.a.c();
        try {
            int f2 = a2.f();
            this.a.h();
            return f2;
        } finally {
            this.a.e();
            l lVar = this.f1077h;
            if (a2 == lVar.c) {
                lVar.a.set(false);
            }
        }
    }

    public List<String> b(String str) {
        j a2 = j.a("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            a2.bindNull(1);
        } else {
            a2.bindString(1, str);
        }
        this.a.b();
        Cursor a3 = h.s.n.b.a(this.a, a2, false, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(a3.getCount());
            while (a3.moveToNext()) {
                arrayList.add(a3.getString(0));
            }
            return arrayList;
        } finally {
            a3.close();
            a2.f();
        }
    }

    public List<p> b() {
        j jVar;
        j a2 = j.a("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground` FROM workspec WHERE state=1", 0);
        this.a.b();
        Cursor a3 = h.s.n.b.a(this.a, a2, false, (CancellationSignal) null);
        try {
            int a4 = g.a.a.b.a.a(a3, "required_network_type");
            int a5 = g.a.a.b.a.a(a3, "requires_charging");
            int a6 = g.a.a.b.a.a(a3, "requires_device_idle");
            int a7 = g.a.a.b.a.a(a3, "requires_battery_not_low");
            int a8 = g.a.a.b.a.a(a3, "requires_storage_not_low");
            int a9 = g.a.a.b.a.a(a3, "trigger_content_update_delay");
            int a10 = g.a.a.b.a.a(a3, "trigger_max_content_delay");
            int a11 = g.a.a.b.a.a(a3, "content_uri_triggers");
            int a12 = g.a.a.b.a.a(a3, "id");
            int a13 = g.a.a.b.a.a(a3, "state");
            int a14 = g.a.a.b.a.a(a3, "worker_class_name");
            int a15 = g.a.a.b.a.a(a3, "input_merger_class_name");
            int a16 = g.a.a.b.a.a(a3, "input");
            int a17 = g.a.a.b.a.a(a3, "output");
            jVar = a2;
            try {
                int a18 = g.a.a.b.a.a(a3, "initial_delay");
                int a19 = g.a.a.b.a.a(a3, "interval_duration");
                int a20 = g.a.a.b.a.a(a3, "flex_duration");
                int a21 = g.a.a.b.a.a(a3, "run_attempt_count");
                int a22 = g.a.a.b.a.a(a3, "backoff_policy");
                int a23 = g.a.a.b.a.a(a3, "backoff_delay_duration");
                int a24 = g.a.a.b.a.a(a3, "period_start_time");
                int a25 = g.a.a.b.a.a(a3, "minimum_retention_duration");
                int a26 = g.a.a.b.a.a(a3, "schedule_requested_at");
                int a27 = g.a.a.b.a.a(a3, "run_in_foreground");
                int i2 = a17;
                ArrayList arrayList = new ArrayList(a3.getCount());
                while (a3.moveToNext()) {
                    String string = a3.getString(a12);
                    int i3 = a12;
                    String string2 = a3.getString(a14);
                    int i4 = a14;
                    h.a0.c cVar = new h.a0.c();
                    int i5 = a4;
                    cVar.a = g.a.a.b.a.c(a3.getInt(a4));
                    cVar.f902b = a3.getInt(a5) != 0;
                    cVar.c = a3.getInt(a6) != 0;
                    cVar.d = a3.getInt(a7) != 0;
                    cVar.e = a3.getInt(a8) != 0;
                    int i6 = a5;
                    cVar.f903f = a3.getLong(a9);
                    cVar.f904g = a3.getLong(a10);
                    cVar.f905h = g.a.a.b.a.a(a3.getBlob(a11));
                    p pVar = new p(string, string2);
                    pVar.f1060b = g.a.a.b.a.d(a3.getInt(a13));
                    pVar.d = a3.getString(a15);
                    pVar.e = h.a0.e.b(a3.getBlob(a16));
                    int i7 = i2;
                    pVar.f1061f = h.a0.e.b(a3.getBlob(i7));
                    int i8 = a16;
                    i2 = i7;
                    int i9 = a18;
                    pVar.f1062g = a3.getLong(i9);
                    a18 = i9;
                    int i10 = a19;
                    pVar.f1063h = a3.getLong(i10);
                    a19 = i10;
                    int i11 = a20;
                    pVar.f1064i = a3.getLong(i11);
                    int i12 = a21;
                    pVar.f1066k = a3.getInt(i12);
                    int i13 = a22;
                    a21 = i12;
                    pVar.f1067l = g.a.a.b.a.b(a3.getInt(i13));
                    a20 = i11;
                    int i14 = a6;
                    int i15 = a23;
                    pVar.f1068m = a3.getLong(i15);
                    a23 = i15;
                    int i16 = a24;
                    pVar.f1069n = a3.getLong(i16);
                    a24 = i16;
                    int i17 = a25;
                    pVar.f1070o = a3.getLong(i17);
                    a25 = i17;
                    int i18 = i13;
                    int i19 = a26;
                    pVar.f1071p = a3.getLong(i19);
                    int i20 = a27;
                    pVar.f1072q = a3.getInt(i20) != 0;
                    pVar.f1065j = cVar;
                    arrayList.add(pVar);
                    a27 = i20;
                    a26 = i19;
                    a16 = i8;
                    a12 = i3;
                    a14 = i4;
                    a4 = i5;
                    a5 = i6;
                    int i21 = i14;
                    a22 = i18;
                    a6 = i21;
                }
                a3.close();
                jVar.f();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                a3.close();
                jVar.f();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            jVar = a2;
            a3.close();
            jVar.f();
            throw th;
        }
    }

    public t a(String str) {
        j a2 = j.a("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            a2.bindNull(1);
        } else {
            a2.bindString(1, str);
        }
        this.a.b();
        t tVar = null;
        Cursor a3 = h.s.n.b.a(this.a, a2, false, (CancellationSignal) null);
        try {
            if (a3.moveToFirst()) {
                tVar = g.a.a.b.a.d(a3.getInt(0));
            }
            return tVar;
        } finally {
            a3.close();
            a2.f();
        }
    }

    public List<String> a() {
        j a2 = j.a("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5)", 0);
        this.a.b();
        Cursor a3 = h.s.n.b.a(this.a, a2, false, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(a3.getCount());
            while (a3.moveToNext()) {
                arrayList.add(a3.getString(0));
            }
            return arrayList;
        } finally {
            a3.close();
            a2.f();
        }
    }

    public List<p> a(int i2) {
        j jVar;
        j a2 = j.a("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
        a2.bindLong(1, (long) i2);
        this.a.b();
        Cursor a3 = h.s.n.b.a(this.a, a2, false, (CancellationSignal) null);
        try {
            int a4 = g.a.a.b.a.a(a3, "required_network_type");
            int a5 = g.a.a.b.a.a(a3, "requires_charging");
            int a6 = g.a.a.b.a.a(a3, "requires_device_idle");
            int a7 = g.a.a.b.a.a(a3, "requires_battery_not_low");
            int a8 = g.a.a.b.a.a(a3, "requires_storage_not_low");
            int a9 = g.a.a.b.a.a(a3, "trigger_content_update_delay");
            int a10 = g.a.a.b.a.a(a3, "trigger_max_content_delay");
            int a11 = g.a.a.b.a.a(a3, "content_uri_triggers");
            int a12 = g.a.a.b.a.a(a3, "id");
            int a13 = g.a.a.b.a.a(a3, "state");
            int a14 = g.a.a.b.a.a(a3, "worker_class_name");
            int a15 = g.a.a.b.a.a(a3, "input_merger_class_name");
            int a16 = g.a.a.b.a.a(a3, "input");
            int a17 = g.a.a.b.a.a(a3, "output");
            jVar = a2;
            try {
                int a18 = g.a.a.b.a.a(a3, "initial_delay");
                int a19 = g.a.a.b.a.a(a3, "interval_duration");
                int a20 = g.a.a.b.a.a(a3, "flex_duration");
                int a21 = g.a.a.b.a.a(a3, "run_attempt_count");
                int a22 = g.a.a.b.a.a(a3, "backoff_policy");
                int a23 = g.a.a.b.a.a(a3, "backoff_delay_duration");
                int a24 = g.a.a.b.a.a(a3, "period_start_time");
                int a25 = g.a.a.b.a.a(a3, "minimum_retention_duration");
                int a26 = g.a.a.b.a.a(a3, "schedule_requested_at");
                int a27 = g.a.a.b.a.a(a3, "run_in_foreground");
                int i3 = a17;
                ArrayList arrayList = new ArrayList(a3.getCount());
                while (a3.moveToNext()) {
                    String string = a3.getString(a12);
                    int i4 = a12;
                    String string2 = a3.getString(a14);
                    int i5 = a14;
                    h.a0.c cVar = new h.a0.c();
                    int i6 = a4;
                    cVar.a = g.a.a.b.a.c(a3.getInt(a4));
                    cVar.f902b = a3.getInt(a5) != 0;
                    cVar.c = a3.getInt(a6) != 0;
                    cVar.d = a3.getInt(a7) != 0;
                    cVar.e = a3.getInt(a8) != 0;
                    int i7 = a5;
                    cVar.f903f = a3.getLong(a9);
                    cVar.f904g = a3.getLong(a10);
                    cVar.f905h = g.a.a.b.a.a(a3.getBlob(a11));
                    p pVar = new p(string, string2);
                    pVar.f1060b = g.a.a.b.a.d(a3.getInt(a13));
                    pVar.d = a3.getString(a15);
                    pVar.e = h.a0.e.b(a3.getBlob(a16));
                    int i8 = i3;
                    pVar.f1061f = h.a0.e.b(a3.getBlob(i8));
                    int i9 = a15;
                    i3 = i8;
                    int i10 = a18;
                    pVar.f1062g = a3.getLong(i10);
                    a18 = i10;
                    int i11 = a19;
                    pVar.f1063h = a3.getLong(i11);
                    a19 = i11;
                    int i12 = a20;
                    pVar.f1064i = a3.getLong(i12);
                    int i13 = a21;
                    pVar.f1066k = a3.getInt(i13);
                    int i14 = a22;
                    a21 = i13;
                    pVar.f1067l = g.a.a.b.a.b(a3.getInt(i14));
                    a20 = i12;
                    int i15 = a6;
                    int i16 = a23;
                    pVar.f1068m = a3.getLong(i16);
                    a23 = i16;
                    int i17 = a24;
                    pVar.f1069n = a3.getLong(i17);
                    a24 = i17;
                    int i18 = a25;
                    pVar.f1070o = a3.getLong(i18);
                    a25 = i18;
                    int i19 = i14;
                    int i20 = a26;
                    pVar.f1071p = a3.getLong(i20);
                    int i21 = a27;
                    pVar.f1072q = a3.getInt(i21) != 0;
                    pVar.f1065j = cVar;
                    arrayList.add(pVar);
                    a27 = i21;
                    a26 = i20;
                    a15 = i9;
                    a12 = i4;
                    a14 = i5;
                    a5 = i7;
                    a4 = i6;
                    int i22 = i15;
                    a22 = i19;
                    a6 = i22;
                }
                a3.close();
                jVar.f();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                a3.close();
                jVar.f();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            jVar = a2;
            a3.close();
            jVar.f();
            throw th;
        }
    }

    public List<p> c() {
        j jVar;
        j a2 = j.a("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground` FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        this.a.b();
        Cursor a3 = h.s.n.b.a(this.a, a2, false, (CancellationSignal) null);
        try {
            int a4 = g.a.a.b.a.a(a3, "required_network_type");
            int a5 = g.a.a.b.a.a(a3, "requires_charging");
            int a6 = g.a.a.b.a.a(a3, "requires_device_idle");
            int a7 = g.a.a.b.a.a(a3, "requires_battery_not_low");
            int a8 = g.a.a.b.a.a(a3, "requires_storage_not_low");
            int a9 = g.a.a.b.a.a(a3, "trigger_content_update_delay");
            int a10 = g.a.a.b.a.a(a3, "trigger_max_content_delay");
            int a11 = g.a.a.b.a.a(a3, "content_uri_triggers");
            int a12 = g.a.a.b.a.a(a3, "id");
            int a13 = g.a.a.b.a.a(a3, "state");
            int a14 = g.a.a.b.a.a(a3, "worker_class_name");
            int a15 = g.a.a.b.a.a(a3, "input_merger_class_name");
            int a16 = g.a.a.b.a.a(a3, "input");
            int a17 = g.a.a.b.a.a(a3, "output");
            jVar = a2;
            try {
                int a18 = g.a.a.b.a.a(a3, "initial_delay");
                int a19 = g.a.a.b.a.a(a3, "interval_duration");
                int a20 = g.a.a.b.a.a(a3, "flex_duration");
                int a21 = g.a.a.b.a.a(a3, "run_attempt_count");
                int a22 = g.a.a.b.a.a(a3, "backoff_policy");
                int a23 = g.a.a.b.a.a(a3, "backoff_delay_duration");
                int a24 = g.a.a.b.a.a(a3, "period_start_time");
                int a25 = g.a.a.b.a.a(a3, "minimum_retention_duration");
                int a26 = g.a.a.b.a.a(a3, "schedule_requested_at");
                int a27 = g.a.a.b.a.a(a3, "run_in_foreground");
                int i2 = a17;
                ArrayList arrayList = new ArrayList(a3.getCount());
                while (a3.moveToNext()) {
                    String string = a3.getString(a12);
                    int i3 = a12;
                    String string2 = a3.getString(a14);
                    int i4 = a14;
                    h.a0.c cVar = new h.a0.c();
                    int i5 = a4;
                    cVar.a = g.a.a.b.a.c(a3.getInt(a4));
                    cVar.f902b = a3.getInt(a5) != 0;
                    cVar.c = a3.getInt(a6) != 0;
                    cVar.d = a3.getInt(a7) != 0;
                    cVar.e = a3.getInt(a8) != 0;
                    int i6 = a5;
                    cVar.f903f = a3.getLong(a9);
                    cVar.f904g = a3.getLong(a10);
                    cVar.f905h = g.a.a.b.a.a(a3.getBlob(a11));
                    p pVar = new p(string, string2);
                    pVar.f1060b = g.a.a.b.a.d(a3.getInt(a13));
                    pVar.d = a3.getString(a15);
                    pVar.e = h.a0.e.b(a3.getBlob(a16));
                    int i7 = i2;
                    pVar.f1061f = h.a0.e.b(a3.getBlob(i7));
                    int i8 = a16;
                    i2 = i7;
                    int i9 = a18;
                    pVar.f1062g = a3.getLong(i9);
                    a18 = i9;
                    int i10 = a19;
                    pVar.f1063h = a3.getLong(i10);
                    a19 = i10;
                    int i11 = a20;
                    pVar.f1064i = a3.getLong(i11);
                    int i12 = a21;
                    pVar.f1066k = a3.getInt(i12);
                    int i13 = a22;
                    a21 = i12;
                    pVar.f1067l = g.a.a.b.a.b(a3.getInt(i13));
                    a20 = i11;
                    int i14 = a6;
                    int i15 = a23;
                    pVar.f1068m = a3.getLong(i15);
                    a23 = i15;
                    int i16 = a24;
                    pVar.f1069n = a3.getLong(i16);
                    a24 = i16;
                    int i17 = a25;
                    pVar.f1070o = a3.getLong(i17);
                    a25 = i17;
                    int i18 = i13;
                    int i19 = a26;
                    pVar.f1071p = a3.getLong(i19);
                    int i20 = a27;
                    pVar.f1072q = a3.getInt(i20) != 0;
                    pVar.f1065j = cVar;
                    arrayList.add(pVar);
                    a27 = i20;
                    a26 = i19;
                    a16 = i8;
                    a12 = i3;
                    a14 = i4;
                    a4 = i5;
                    a5 = i6;
                    int i21 = i14;
                    a22 = i18;
                    a6 = i21;
                }
                a3.close();
                jVar.f();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                a3.close();
                jVar.f();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            jVar = a2;
            a3.close();
            jVar.f();
            throw th;
        }
    }

    public int a(t tVar, String... strArr) {
        this.a.b();
        StringBuilder sb = new StringBuilder();
        sb.append("UPDATE workspec SET state=");
        sb.append("?");
        sb.append(" WHERE id IN (");
        int length = strArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            sb.append("?");
            if (i2 < length - 1) {
                sb.append(",");
            }
        }
        sb.append(")");
        h.v.a.f.f a2 = this.a.a(sb.toString());
        a2.e.bindLong(1, (long) g.a.a.b.a.a(tVar));
        int i3 = 2;
        for (String str : strArr) {
            if (str == null) {
                a2.e.bindNull(i3);
            } else {
                a2.e.bindString(i3, str);
            }
            i3++;
        }
        this.a.c();
        try {
            int f2 = a2.f();
            this.a.h();
            return f2;
        } finally {
            this.a.e();
        }
    }
}
