package i.c.a.b.i.a;

/* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
public final class d6 implements Runnable {
    public final /* synthetic */ ea e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ t5 f3641f;

    public d6(t5 t5Var, ea eaVar) {
        this.f3641f = t5Var;
        this.e = eaVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0124 A[Catch:{ NameNotFoundException -> 0x019e }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01b5  */
    /* JADX WARNING: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r38 = this;
            r1 = r38
            i.c.a.b.i.a.t5 r0 = r1.f3641f
            i.c.a.b.i.a.t9 r0 = r0.a
            r0.o()
            i.c.a.b.i.a.t5 r0 = r1.f3641f
            i.c.a.b.i.a.t9 r2 = r0.a
            i.c.a.b.i.a.ea r3 = r1.e
            java.lang.String r0 = "app_id=?"
            java.util.List<java.lang.Long> r4 = r2.u
            if (r4 == 0) goto L_0x0021
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r2.v = r4
            java.util.List<java.lang.Long> r5 = r2.u
            r4.addAll(r5)
        L_0x0021:
            i.c.a.b.i.a.d r4 = r2.d()
            java.lang.String r5 = r3.e
            i.c.a.b.d.l.q.b((java.lang.String) r5)
            r4.c()
            r4.m()
            r6 = 0
            android.database.sqlite.SQLiteDatabase r7 = r4.u()     // Catch:{ SQLiteException -> 0x008b }
            r8 = 1
            java.lang.String[] r8 = new java.lang.String[r8]     // Catch:{ SQLiteException -> 0x008b }
            r8[r6] = r5     // Catch:{ SQLiteException -> 0x008b }
            java.lang.String r9 = "apps"
            int r9 = r7.delete(r9, r0, r8)     // Catch:{ SQLiteException -> 0x008b }
            int r9 = r9 + r6
            java.lang.String r10 = "events"
            int r10 = r7.delete(r10, r0, r8)     // Catch:{ SQLiteException -> 0x008b }
            int r9 = r9 + r10
            java.lang.String r10 = "user_attributes"
            int r10 = r7.delete(r10, r0, r8)     // Catch:{ SQLiteException -> 0x008b }
            int r9 = r9 + r10
            java.lang.String r10 = "conditional_properties"
            int r10 = r7.delete(r10, r0, r8)     // Catch:{ SQLiteException -> 0x008b }
            int r9 = r9 + r10
            java.lang.String r10 = "raw_events"
            int r10 = r7.delete(r10, r0, r8)     // Catch:{ SQLiteException -> 0x008b }
            int r9 = r9 + r10
            java.lang.String r10 = "raw_events_metadata"
            int r10 = r7.delete(r10, r0, r8)     // Catch:{ SQLiteException -> 0x008b }
            int r9 = r9 + r10
            java.lang.String r10 = "queue"
            int r10 = r7.delete(r10, r0, r8)     // Catch:{ SQLiteException -> 0x008b }
            int r9 = r9 + r10
            java.lang.String r10 = "audience_filter_values"
            int r10 = r7.delete(r10, r0, r8)     // Catch:{ SQLiteException -> 0x008b }
            int r9 = r9 + r10
            java.lang.String r10 = "main_event_params"
            int r0 = r7.delete(r10, r0, r8)     // Catch:{ SQLiteException -> 0x008b }
            int r9 = r9 + r0
            if (r9 <= 0) goto L_0x009b
            i.c.a.b.i.a.m4 r0 = r4.n()     // Catch:{ SQLiteException -> 0x008b }
            i.c.a.b.i.a.o4 r0 = r0.f3766n     // Catch:{ SQLiteException -> 0x008b }
            java.lang.String r7 = "Reset analytics data. app, records"
            java.lang.Integer r8 = java.lang.Integer.valueOf(r9)     // Catch:{ SQLiteException -> 0x008b }
            r0.a(r7, r5, r8)     // Catch:{ SQLiteException -> 0x008b }
            goto L_0x009b
        L_0x008b:
            r0 = move-exception
            i.c.a.b.i.a.m4 r4 = r4.n()
            i.c.a.b.i.a.o4 r4 = r4.f3758f
            java.lang.Object r5 = i.c.a.b.i.a.m4.a((java.lang.String) r5)
            java.lang.String r7 = "Error resetting analytics data. appId, error"
            r4.a(r7, r5, r0)
        L_0x009b:
            i.c.a.b.g.g.d9 r0 = i.c.a.b.g.g.d9.f3256f
            java.lang.Object r0 = r0.a()
            i.c.a.b.g.g.c9 r0 = (i.c.a.b.g.g.c9) r0
            boolean r0 = r0.a()
            if (r0 == 0) goto L_0x00be
            i.c.a.b.i.a.s5 r0 = r2.f3896i
            i.c.a.b.i.a.pa r0 = r0.f3861g
            i.c.a.b.i.a.f4<java.lang.Boolean> r4 = i.c.a.b.i.a.o.N0
            boolean r0 = r0.a((i.c.a.b.i.a.f4<java.lang.Boolean>) r4)
            if (r0 == 0) goto L_0x00be
            boolean r0 = r3.f3655l
            if (r0 == 0) goto L_0x01b8
            r2.a((i.c.a.b.i.a.ea) r3)
            goto L_0x01b8
        L_0x00be:
            i.c.a.b.i.a.s5 r0 = r2.f3896i
            android.content.Context r0 = r0.a
            java.lang.String r8 = r3.e
            java.lang.String r9 = r3.f3649f
            boolean r4 = r3.f3655l
            boolean r5 = r3.s
            boolean r14 = r3.t
            long r11 = r3.f3660q
            java.lang.String r15 = r3.v
            java.lang.String r7 = r3.z
            java.lang.String r10 = "Unknown"
            android.content.pm.PackageManager r13 = r0.getPackageManager()
            r16 = 0
            if (r13 != 0) goto L_0x00eb
            i.c.a.b.i.a.s5 r0 = r2.f3896i
            i.c.a.b.i.a.m4 r0 = r0.n()
            i.c.a.b.i.a.o4 r0 = r0.f3758f
            java.lang.String r4 = "PackageManager is null, can not log app install information"
            r0.a(r4)
            goto L_0x01af
        L_0x00eb:
            java.lang.String r13 = r13.getInstallerPackageName(r8)     // Catch:{ IllegalArgumentException -> 0x00f0 }
            goto L_0x0102
        L_0x00f0:
            i.c.a.b.i.a.s5 r13 = r2.f3896i
            i.c.a.b.i.a.m4 r13 = r13.n()
            i.c.a.b.i.a.o4 r13 = r13.f3758f
            java.lang.Object r6 = i.c.a.b.i.a.m4.a((java.lang.String) r8)
            java.lang.String r1 = "Error retrieving installer package name. appId"
            r13.a(r1, r6)
            r13 = r10
        L_0x0102:
            if (r13 != 0) goto L_0x0108
            java.lang.String r1 = "manual_install"
        L_0x0106:
            r13 = r1
            goto L_0x0113
        L_0x0108:
            java.lang.String r1 = "com.android.vending"
            boolean r1 = r1.equals(r13)
            if (r1 == 0) goto L_0x0113
            java.lang.String r1 = ""
            goto L_0x0106
        L_0x0113:
            i.c.a.b.d.p.b r1 = i.c.a.b.d.p.c.b(r0)     // Catch:{ NameNotFoundException -> 0x019e }
            android.content.Context r1 = r1.a     // Catch:{ NameNotFoundException -> 0x019e }
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch:{ NameNotFoundException -> 0x019e }
            r6 = 0
            android.content.pm.PackageInfo r1 = r1.getPackageInfo(r8, r6)     // Catch:{ NameNotFoundException -> 0x019e }
            if (r1 == 0) goto L_0x013c
            i.c.a.b.d.p.b r6 = i.c.a.b.d.p.c.b(r0)     // Catch:{ NameNotFoundException -> 0x019e }
            java.lang.CharSequence r6 = r6.a(r8)     // Catch:{ NameNotFoundException -> 0x019e }
            boolean r17 = android.text.TextUtils.isEmpty(r6)     // Catch:{ NameNotFoundException -> 0x019e }
            if (r17 != 0) goto L_0x0136
            java.lang.String r10 = r6.toString()     // Catch:{ NameNotFoundException -> 0x019e }
        L_0x0136:
            java.lang.String r6 = r1.versionName     // Catch:{ NameNotFoundException -> 0x019e }
            int r1 = r1.versionCode     // Catch:{ NameNotFoundException -> 0x019e }
            r10 = r6
            goto L_0x013e
        L_0x013c:
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x013e:
            i.c.a.b.i.a.ea r6 = new i.c.a.b.i.a.ea
            r19 = r11
            long r11 = (long) r1
            i.c.a.b.i.a.s5 r1 = r2.f3896i
            i.c.a.b.i.a.pa r1 = r1.f3861g
            r1.o()
            r22 = 25001(0x61a9, double:1.2352E-319)
            i.c.a.b.i.a.s5 r1 = r2.f3896i
            i.c.a.b.i.a.ca r1 = r1.p()
            long r0 = r1.a((android.content.Context) r0, (java.lang.String) r8)
            r24 = 0
            r25 = 0
            r27 = 0
            r29 = 0
            r31 = 0
            r32 = 0
            r34 = 0
            boolean r17 = i.c.a.b.g.g.x9.b()
            if (r17 == 0) goto L_0x017d
            r17 = r7
            i.c.a.b.i.a.s5 r7 = r2.f3896i
            i.c.a.b.i.a.pa r7 = r7.f3861g
            r28 = r14
            i.c.a.b.i.a.f4<java.lang.Boolean> r14 = i.c.a.b.i.a.o.I0
            boolean r7 = r7.d(r8, r14)
            if (r7 == 0) goto L_0x017f
            r35 = r17
            goto L_0x0181
        L_0x017d:
            r28 = r14
        L_0x017f:
            r35 = r16
        L_0x0181:
            r18 = 0
            java.lang.String r21 = ""
            r7 = r6
            r36 = r19
            r30 = r15
            r14 = r22
            r16 = r0
            r19 = r4
            r20 = r24
            r22 = r25
            r24 = r36
            r26 = r27
            r27 = r5
            r7.<init>((java.lang.String) r8, (java.lang.String) r9, (java.lang.String) r10, (long) r11, (java.lang.String) r13, (long) r14, (long) r16, (java.lang.String) r18, (boolean) r19, (boolean) r20, (java.lang.String) r21, (long) r22, (long) r24, (int) r26, (boolean) r27, (boolean) r28, (boolean) r29, (java.lang.String) r30, (java.lang.Boolean) r31, (long) r32, (java.util.List<java.lang.String>) r34, (java.lang.String) r35)
            goto L_0x01b1
        L_0x019e:
            i.c.a.b.i.a.s5 r0 = r2.f3896i
            i.c.a.b.i.a.m4 r0 = r0.n()
            i.c.a.b.i.a.o4 r0 = r0.f3758f
            java.lang.Object r1 = i.c.a.b.i.a.m4.a((java.lang.String) r8)
            java.lang.String r4 = "Error retrieving newly installed package info. appId, appName"
            r0.a(r4, r1, r10)
        L_0x01af:
            r6 = r16
        L_0x01b1:
            boolean r0 = r3.f3655l
            if (r0 == 0) goto L_0x01b8
            r2.a((i.c.a.b.i.a.ea) r6)
        L_0x01b8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.a.b.i.a.d6.run():void");
    }
}
