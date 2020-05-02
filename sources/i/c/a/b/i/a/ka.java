package i.c.a.b.i.a;

import i.c.a.b.g.g.p0;

/* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
public final class ka {
    public p0 a;

    /* renamed from: b  reason: collision with root package name */
    public Long f3741b;
    public long c;
    public final /* synthetic */ fa d;

    public /* synthetic */ ka(fa faVar, ia iaVar) {
        this.d = faVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: i.c.a.b.g.g.d4<i.c.a.b.g.g.r0>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: i.c.a.b.g.g.d4<i.c.a.b.g.g.r0>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v17, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: i.c.a.b.g.g.d4<i.c.a.b.g.g.r0>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: i.c.a.b.g.g.d4<i.c.a.b.g.g.r0>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01ea  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x021d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final i.c.a.b.g.g.p0 a(java.lang.String r18, i.c.a.b.g.g.p0 r19) {
        /*
            r17 = this;
            r1 = r17
            r8 = r18
            r9 = r19
            java.lang.String r0 = r9.zze
            i.c.a.b.g.g.d4<i.c.a.b.g.g.r0> r10 = r9.zzd
            i.c.a.b.i.a.fa r2 = r1.d
            i.c.a.b.i.a.x9 r2 = r2.q()
            java.lang.String r3 = "_eid"
            java.lang.Object r2 = r2.a((i.c.a.b.g.g.p0) r9, (java.lang.String) r3)
            r4 = r2
            java.lang.Long r4 = (java.lang.Long) r4
            r2 = 1
            r11 = 0
            if (r4 == 0) goto L_0x001f
            r5 = 1
            goto L_0x0020
        L_0x001f:
            r5 = 0
        L_0x0020:
            if (r5 == 0) goto L_0x002c
            java.lang.String r6 = "_ep"
            boolean r6 = r0.equals(r6)
            if (r6 == 0) goto L_0x002c
            r6 = 1
            goto L_0x002d
        L_0x002c:
            r6 = 0
        L_0x002d:
            r12 = 0
            if (r6 == 0) goto L_0x0221
            i.c.a.b.i.a.fa r0 = r1.d
            i.c.a.b.i.a.x9 r0 = r0.q()
            java.lang.String r5 = "_en"
            java.lang.Object r0 = r0.a((i.c.a.b.g.g.p0) r9, (java.lang.String) r5)
            r14 = r0
            java.lang.String r14 = (java.lang.String) r14
            boolean r0 = android.text.TextUtils.isEmpty(r14)
            r5 = 0
            if (r0 == 0) goto L_0x0075
            boolean r0 = i.c.a.b.g.g.k9.b()
            java.lang.String r2 = "Extra parameter without an event name. eventId"
            if (r0 == 0) goto L_0x0069
            i.c.a.b.i.a.fa r0 = r1.d
            i.c.a.b.i.a.s5 r0 = r0.a
            i.c.a.b.i.a.pa r0 = r0.f3861g
            i.c.a.b.i.a.f4<java.lang.Boolean> r3 = i.c.a.b.i.a.o.Z0
            boolean r0 = r0.d(r8, r3)
            if (r0 == 0) goto L_0x0069
            i.c.a.b.i.a.fa r0 = r1.d
            i.c.a.b.i.a.m4 r0 = r0.n()
            i.c.a.b.i.a.o4 r0 = r0.f3759g
            r0.a(r2, r4)
            goto L_0x0074
        L_0x0069:
            i.c.a.b.i.a.fa r0 = r1.d
            i.c.a.b.i.a.m4 r0 = r0.n()
            i.c.a.b.i.a.o4 r0 = r0.f3758f
            r0.a(r2, r4)
        L_0x0074:
            return r5
        L_0x0075:
            i.c.a.b.g.g.p0 r0 = r1.a
            if (r0 == 0) goto L_0x008b
            java.lang.Long r0 = r1.f3741b
            if (r0 == 0) goto L_0x008b
            long r6 = r4.longValue()
            java.lang.Long r0 = r1.f3741b
            long r15 = r0.longValue()
            int r0 = (r6 > r15 ? 1 : (r6 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x013b
        L_0x008b:
            i.c.a.b.i.a.fa r0 = r1.d
            i.c.a.b.i.a.d r6 = r0.r()
            r6.c()
            r6.m()
            android.database.sqlite.SQLiteDatabase r0 = r6.u()     // Catch:{ SQLiteException -> 0x0102, all -> 0x00fe }
            java.lang.String r7 = "select main_event, children_to_process from main_event_params where app_id=? and event_id=?"
            r15 = 2
            java.lang.String[] r15 = new java.lang.String[r15]     // Catch:{ SQLiteException -> 0x0102, all -> 0x00fe }
            r15[r11] = r8     // Catch:{ SQLiteException -> 0x0102, all -> 0x00fe }
            java.lang.String r16 = java.lang.String.valueOf(r4)     // Catch:{ SQLiteException -> 0x0102, all -> 0x00fe }
            r15[r2] = r16     // Catch:{ SQLiteException -> 0x0102, all -> 0x00fe }
            android.database.Cursor r7 = r0.rawQuery(r7, r15)     // Catch:{ SQLiteException -> 0x0102, all -> 0x00fe }
            boolean r0 = r7.moveToFirst()     // Catch:{ SQLiteException -> 0x00fc }
            if (r0 != 0) goto L_0x00c2
            i.c.a.b.i.a.m4 r0 = r6.n()     // Catch:{ SQLiteException -> 0x00fc }
            i.c.a.b.i.a.o4 r0 = r0.f3766n     // Catch:{ SQLiteException -> 0x00fc }
            java.lang.String r15 = "Main event not found"
            r0.a(r15)     // Catch:{ SQLiteException -> 0x00fc }
            r7.close()
            r0 = r5
            goto L_0x0115
        L_0x00c2:
            byte[] r0 = r7.getBlob(r11)     // Catch:{ SQLiteException -> 0x00fc }
            long r15 = r7.getLong(r2)     // Catch:{ SQLiteException -> 0x00fc }
            java.lang.Long r15 = java.lang.Long.valueOf(r15)     // Catch:{ SQLiteException -> 0x00fc }
            i.c.a.b.g.g.p0$a r5 = i.c.a.b.g.g.p0.n()     // Catch:{ IOException -> 0x00e8 }
            i.c.a.b.g.g.e5 r0 = i.c.a.b.i.a.x9.a(r5, (byte[]) r0)     // Catch:{ IOException -> 0x00e8 }
            i.c.a.b.g.g.p0$a r0 = (i.c.a.b.g.g.p0.a) r0     // Catch:{ IOException -> 0x00e8 }
            i.c.a.b.g.g.f5 r0 = r0.k()     // Catch:{ IOException -> 0x00e8 }
            i.c.a.b.g.g.w3 r0 = (i.c.a.b.g.g.w3) r0     // Catch:{ IOException -> 0x00e8 }
            i.c.a.b.g.g.p0 r0 = (i.c.a.b.g.g.p0) r0     // Catch:{ IOException -> 0x00e8 }
            android.util.Pair r0 = android.util.Pair.create(r0, r15)     // Catch:{ SQLiteException -> 0x00fc }
            r7.close()
            goto L_0x0115
        L_0x00e8:
            r0 = move-exception
            i.c.a.b.i.a.m4 r5 = r6.n()     // Catch:{ SQLiteException -> 0x00fc }
            i.c.a.b.i.a.o4 r5 = r5.f3758f     // Catch:{ SQLiteException -> 0x00fc }
            java.lang.String r15 = "Failed to merge main event. appId, eventId"
            java.lang.Object r11 = i.c.a.b.i.a.m4.a((java.lang.String) r18)     // Catch:{ SQLiteException -> 0x00fc }
            r5.a(r15, r11, r4, r0)     // Catch:{ SQLiteException -> 0x00fc }
            r7.close()
            goto L_0x0114
        L_0x00fc:
            r0 = move-exception
            goto L_0x0104
        L_0x00fe:
            r0 = move-exception
            r5 = 0
            goto L_0x021b
        L_0x0102:
            r0 = move-exception
            r7 = 0
        L_0x0104:
            i.c.a.b.i.a.m4 r5 = r6.n()     // Catch:{ all -> 0x0219 }
            i.c.a.b.i.a.o4 r5 = r5.f3758f     // Catch:{ all -> 0x0219 }
            java.lang.String r6 = "Error selecting main event"
            r5.a(r6, r0)     // Catch:{ all -> 0x0219 }
            if (r7 == 0) goto L_0x0114
            r7.close()
        L_0x0114:
            r0 = 0
        L_0x0115:
            if (r0 == 0) goto L_0x01ea
            java.lang.Object r5 = r0.first
            if (r5 != 0) goto L_0x011d
            goto L_0x01ea
        L_0x011d:
            i.c.a.b.g.g.p0 r5 = (i.c.a.b.g.g.p0) r5
            r1.a = r5
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r5 = r0.longValue()
            r1.c = r5
            i.c.a.b.i.a.fa r0 = r1.d
            i.c.a.b.i.a.x9 r0 = r0.q()
            i.c.a.b.g.g.p0 r5 = r1.a
            java.lang.Object r0 = r0.a((i.c.a.b.g.g.p0) r5, (java.lang.String) r3)
            java.lang.Long r0 = (java.lang.Long) r0
            r1.f3741b = r0
        L_0x013b:
            long r5 = r1.c
            r15 = 1
            long r5 = r5 - r15
            r1.c = r5
            int r0 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r0 > 0) goto L_0x0176
            i.c.a.b.i.a.fa r0 = r1.d
            i.c.a.b.i.a.d r3 = r0.r()
            r3.c()
            i.c.a.b.i.a.m4 r0 = r3.n()
            i.c.a.b.i.a.o4 r0 = r0.f3766n
            java.lang.String r4 = "Clearing complex main event info. appId"
            r0.a(r4, r8)
            android.database.sqlite.SQLiteDatabase r0 = r3.u()     // Catch:{ SQLiteException -> 0x0169 }
            java.lang.String r4 = "delete from main_event_params where app_id=?"
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch:{ SQLiteException -> 0x0169 }
            r5 = 0
            r2[r5] = r8     // Catch:{ SQLiteException -> 0x0169 }
            r0.execSQL(r4, r2)     // Catch:{ SQLiteException -> 0x0169 }
            goto L_0x0185
        L_0x0169:
            r0 = move-exception
            i.c.a.b.i.a.m4 r2 = r3.n()
            i.c.a.b.i.a.o4 r2 = r2.f3758f
            java.lang.String r3 = "Error clearing complex main event"
            r2.a(r3, r0)
            goto L_0x0185
        L_0x0176:
            i.c.a.b.i.a.fa r0 = r1.d
            i.c.a.b.i.a.d r2 = r0.r()
            long r5 = r1.c
            i.c.a.b.g.g.p0 r7 = r1.a
            r3 = r18
            r2.a((java.lang.String) r3, (java.lang.Long) r4, (long) r5, (i.c.a.b.g.g.p0) r7)
        L_0x0185:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            i.c.a.b.g.g.p0 r2 = r1.a
            i.c.a.b.g.g.d4<i.c.a.b.g.g.r0> r2 = r2.zzd
            java.util.Iterator r2 = r2.iterator()
        L_0x0192:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x01af
            java.lang.Object r3 = r2.next()
            i.c.a.b.g.g.r0 r3 = (i.c.a.b.g.g.r0) r3
            i.c.a.b.i.a.fa r4 = r1.d
            r4.q()
            java.lang.String r4 = r3.zzd
            i.c.a.b.g.g.r0 r4 = i.c.a.b.i.a.x9.b(r9, r4)
            if (r4 != 0) goto L_0x0192
            r0.add(r3)
            goto L_0x0192
        L_0x01af:
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L_0x01bc
            r0.addAll(r10)
            r10 = r0
        L_0x01b9:
            r0 = r14
            goto L_0x0284
        L_0x01bc:
            boolean r0 = i.c.a.b.g.g.k9.b()
            java.lang.String r2 = "No unique parameters in main event. eventName"
            if (r0 == 0) goto L_0x01de
            i.c.a.b.i.a.fa r0 = r1.d
            i.c.a.b.i.a.s5 r0 = r0.a
            i.c.a.b.i.a.pa r0 = r0.f3861g
            i.c.a.b.i.a.f4<java.lang.Boolean> r3 = i.c.a.b.i.a.o.Z0
            boolean r0 = r0.d(r8, r3)
            if (r0 == 0) goto L_0x01de
            i.c.a.b.i.a.fa r0 = r1.d
            i.c.a.b.i.a.m4 r0 = r0.n()
            i.c.a.b.i.a.o4 r0 = r0.f3759g
            r0.a(r2, r14)
            goto L_0x01b9
        L_0x01de:
            i.c.a.b.i.a.fa r0 = r1.d
            i.c.a.b.i.a.m4 r0 = r0.n()
            i.c.a.b.i.a.o4 r0 = r0.f3761i
            r0.a(r2, r14)
            goto L_0x01b9
        L_0x01ea:
            boolean r0 = i.c.a.b.g.g.k9.b()
            java.lang.String r2 = "Extra parameter without existing main event. eventName, eventId"
            if (r0 == 0) goto L_0x020c
            i.c.a.b.i.a.fa r0 = r1.d
            i.c.a.b.i.a.s5 r0 = r0.a
            i.c.a.b.i.a.pa r0 = r0.f3861g
            i.c.a.b.i.a.f4<java.lang.Boolean> r3 = i.c.a.b.i.a.o.Z0
            boolean r0 = r0.d(r8, r3)
            if (r0 == 0) goto L_0x020c
            i.c.a.b.i.a.fa r0 = r1.d
            i.c.a.b.i.a.m4 r0 = r0.n()
            i.c.a.b.i.a.o4 r0 = r0.f3759g
            r0.a(r2, r14, r4)
            goto L_0x0217
        L_0x020c:
            i.c.a.b.i.a.fa r0 = r1.d
            i.c.a.b.i.a.m4 r0 = r0.n()
            i.c.a.b.i.a.o4 r0 = r0.f3758f
            r0.a(r2, r14, r4)
        L_0x0217:
            r2 = 0
            return r2
        L_0x0219:
            r0 = move-exception
            r5 = r7
        L_0x021b:
            if (r5 == 0) goto L_0x0220
            r5.close()
        L_0x0220:
            throw r0
        L_0x0221:
            if (r5 == 0) goto L_0x0284
            r1.f3741b = r4
            r1.a = r9
            i.c.a.b.i.a.fa r2 = r1.d
            i.c.a.b.i.a.x9 r2 = r2.q()
            java.lang.Long r3 = java.lang.Long.valueOf(r12)
            java.lang.String r5 = "_epc"
            java.lang.Object r2 = r2.a((i.c.a.b.g.g.p0) r9, (java.lang.String) r5)
            if (r2 != 0) goto L_0x023a
            goto L_0x023b
        L_0x023a:
            r3 = r2
        L_0x023b:
            java.lang.Long r3 = (java.lang.Long) r3
            long r2 = r3.longValue()
            r1.c = r2
            int r5 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r5 > 0) goto L_0x0275
            boolean r2 = i.c.a.b.g.g.k9.b()
            java.lang.String r3 = "Complex event with zero extra param count. eventName"
            if (r2 == 0) goto L_0x0269
            i.c.a.b.i.a.fa r2 = r1.d
            i.c.a.b.i.a.s5 r2 = r2.a
            i.c.a.b.i.a.pa r2 = r2.f3861g
            i.c.a.b.i.a.f4<java.lang.Boolean> r4 = i.c.a.b.i.a.o.Z0
            boolean r2 = r2.d(r8, r4)
            if (r2 == 0) goto L_0x0269
            i.c.a.b.i.a.fa r2 = r1.d
            i.c.a.b.i.a.m4 r2 = r2.n()
            i.c.a.b.i.a.o4 r2 = r2.f3759g
            r2.a(r3, r0)
            goto L_0x0284
        L_0x0269:
            i.c.a.b.i.a.fa r2 = r1.d
            i.c.a.b.i.a.m4 r2 = r2.n()
            i.c.a.b.i.a.o4 r2 = r2.f3761i
            r2.a(r3, r0)
            goto L_0x0284
        L_0x0275:
            i.c.a.b.i.a.fa r2 = r1.d
            i.c.a.b.i.a.d r2 = r2.r()
            long r5 = r1.c
            r3 = r18
            r7 = r19
            r2.a((java.lang.String) r3, (java.lang.Long) r4, (long) r5, (i.c.a.b.g.g.p0) r7)
        L_0x0284:
            i.c.a.b.g.g.w3$b r2 = r19.j()
            i.c.a.b.g.g.p0$a r2 = (i.c.a.b.g.g.p0.a) r2
            r2.a((java.lang.String) r0)
            boolean r0 = r2.f3513g
            if (r0 == 0) goto L_0x0297
            r2.i()
            r3 = 0
            r2.f3513g = r3
        L_0x0297:
            MessageType r0 = r2.f3512f
            i.c.a.b.g.g.p0 r0 = (i.c.a.b.g.g.p0) r0
            i.c.a.b.g.g.p0.a(r0)
            boolean r0 = r2.f3513g
            if (r0 == 0) goto L_0x02a8
            r2.i()
            r3 = 0
            r2.f3513g = r3
        L_0x02a8:
            MessageType r0 = r2.f3512f
            i.c.a.b.g.g.p0 r0 = (i.c.a.b.g.g.p0) r0
            i.c.a.b.g.g.p0.a((i.c.a.b.g.g.p0) r0, (java.lang.Iterable) r10)
            i.c.a.b.g.g.f5 r0 = r2.k()
            i.c.a.b.g.g.w3 r0 = (i.c.a.b.g.g.w3) r0
            i.c.a.b.g.g.p0 r0 = (i.c.a.b.g.g.p0) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.a.b.i.a.ka.a(java.lang.String, i.c.a.b.g.g.p0):i.c.a.b.g.g.p0");
    }
}
