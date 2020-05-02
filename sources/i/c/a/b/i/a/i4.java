package i.c.a.b.i.a;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class i4 extends c3 {
    public final l4 c = new l4(this, this.a.a, "google_app_measurement_local.db");
    public boolean d;

    public i4(s5 s5Var) {
        super(s5Var);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x008d, code lost:
        r3 = r3 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A() {
        /*
            r11 = this;
            java.lang.String r0 = "Error deleting app launch break from local database"
            r11.c()
            r11.a()
            boolean r1 = r11.d
            r2 = 0
            if (r1 == 0) goto L_0x000e
            return r2
        L_0x000e:
            i.c.a.b.i.a.s5 r1 = r11.a
            android.content.Context r1 = r1.a
            java.lang.String r3 = "google_app_measurement_local.db"
            java.io.File r1 = r1.getDatabasePath(r3)
            boolean r1 = r1.exists()
            if (r1 != 0) goto L_0x001f
            return r2
        L_0x001f:
            r1 = 5
            r3 = 0
            r4 = 5
        L_0x0022:
            if (r3 >= r1) goto L_0x0096
            r5 = 0
            r6 = 1
            android.database.sqlite.SQLiteDatabase r5 = r11.B()     // Catch:{ SQLiteFullException -> 0x007c, SQLiteDatabaseLockedException -> 0x0070, SQLiteException -> 0x0053 }
            if (r5 != 0) goto L_0x0034
            r11.d = r6     // Catch:{ SQLiteFullException -> 0x007c, SQLiteDatabaseLockedException -> 0x0070, SQLiteException -> 0x0053 }
            if (r5 == 0) goto L_0x0033
            r5.close()
        L_0x0033:
            return r2
        L_0x0034:
            r5.beginTransaction()     // Catch:{ SQLiteFullException -> 0x007c, SQLiteDatabaseLockedException -> 0x0070, SQLiteException -> 0x0053 }
            java.lang.String r7 = "messages"
            java.lang.String r8 = "type == ?"
            java.lang.String[] r9 = new java.lang.String[r6]     // Catch:{ SQLiteFullException -> 0x007c, SQLiteDatabaseLockedException -> 0x0070, SQLiteException -> 0x0053 }
            r10 = 3
            java.lang.String r10 = java.lang.Integer.toString(r10)     // Catch:{ SQLiteFullException -> 0x007c, SQLiteDatabaseLockedException -> 0x0070, SQLiteException -> 0x0053 }
            r9[r2] = r10     // Catch:{ SQLiteFullException -> 0x007c, SQLiteDatabaseLockedException -> 0x0070, SQLiteException -> 0x0053 }
            r5.delete(r7, r8, r9)     // Catch:{ SQLiteFullException -> 0x007c, SQLiteDatabaseLockedException -> 0x0070, SQLiteException -> 0x0053 }
            r5.setTransactionSuccessful()     // Catch:{ SQLiteFullException -> 0x007c, SQLiteDatabaseLockedException -> 0x0070, SQLiteException -> 0x0053 }
            r5.endTransaction()     // Catch:{ SQLiteFullException -> 0x007c, SQLiteDatabaseLockedException -> 0x0070, SQLiteException -> 0x0053 }
            r5.close()
            return r6
        L_0x0051:
            r0 = move-exception
            goto L_0x0090
        L_0x0053:
            r7 = move-exception
            if (r5 == 0) goto L_0x005f
            boolean r8 = r5.inTransaction()     // Catch:{ all -> 0x0051 }
            if (r8 == 0) goto L_0x005f
            r5.endTransaction()     // Catch:{ all -> 0x0051 }
        L_0x005f:
            i.c.a.b.i.a.m4 r8 = r11.n()     // Catch:{ all -> 0x0051 }
            i.c.a.b.i.a.o4 r8 = r8.f3758f     // Catch:{ all -> 0x0051 }
            r8.a(r0, r7)     // Catch:{ all -> 0x0051 }
            r11.d = r6     // Catch:{ all -> 0x0051 }
            if (r5 == 0) goto L_0x008d
            r5.close()
            goto L_0x008d
        L_0x0070:
            long r6 = (long) r4
            android.os.SystemClock.sleep(r6)     // Catch:{ all -> 0x0051 }
            int r4 = r4 + 20
            if (r5 == 0) goto L_0x008d
            r5.close()
            goto L_0x008d
        L_0x007c:
            r7 = move-exception
            i.c.a.b.i.a.m4 r8 = r11.n()     // Catch:{ all -> 0x0051 }
            i.c.a.b.i.a.o4 r8 = r8.f3758f     // Catch:{ all -> 0x0051 }
            r8.a(r0, r7)     // Catch:{ all -> 0x0051 }
            r11.d = r6     // Catch:{ all -> 0x0051 }
            if (r5 == 0) goto L_0x008d
            r5.close()
        L_0x008d:
            int r3 = r3 + 1
            goto L_0x0022
        L_0x0090:
            if (r5 == 0) goto L_0x0095
            r5.close()
        L_0x0095:
            throw r0
        L_0x0096:
            i.c.a.b.i.a.m4 r0 = r11.n()
            i.c.a.b.i.a.o4 r0 = r0.f3761i
            java.lang.String r1 = "Error deleting app launch break from local database in reasonable time"
            r0.a(r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.a.b.i.a.i4.A():boolean");
    }

    public final SQLiteDatabase B() {
        if (this.d) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.c.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.d = true;
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARNING: type inference failed for: r7v0 */
    /* JADX WARNING: type inference failed for: r7v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r7v3, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r7v4, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r7v5 */
    /* JADX WARNING: type inference failed for: r7v7 */
    /* JADX WARNING: type inference failed for: r7v8 */
    /* JADX WARNING: type inference failed for: r7v9 */
    /* JADX WARNING: type inference failed for: r7v10 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00be A[SYNTHETIC, Splitter:B:47:0x00be] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0110 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0110 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0110 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r17, byte[] r18) {
        /*
            r16 = this;
            r1 = r16
            r16.a()
            r16.c()
            boolean r0 = r1.d
            r2 = 0
            if (r0 == 0) goto L_0x000e
            return r2
        L_0x000e:
            android.content.ContentValues r3 = new android.content.ContentValues
            r3.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r17)
            java.lang.String r4 = "type"
            r3.put(r4, r0)
            java.lang.String r0 = "entry"
            r4 = r18
            r3.put(r0, r4)
            r4 = 5
            r5 = 0
            r6 = 5
        L_0x0026:
            if (r5 >= r4) goto L_0x0122
            r7 = 0
            r8 = 1
            android.database.sqlite.SQLiteDatabase r9 = r16.B()     // Catch:{ SQLiteFullException -> 0x00f6, SQLiteDatabaseLockedException -> 0x00e4, SQLiteException -> 0x00ba, all -> 0x00b7 }
            if (r9 != 0) goto L_0x0038
            r1.d = r8     // Catch:{ SQLiteFullException -> 0x00b5, SQLiteDatabaseLockedException -> 0x00e5, SQLiteException -> 0x00b1 }
            if (r9 == 0) goto L_0x0037
            r9.close()
        L_0x0037:
            return r2
        L_0x0038:
            r9.beginTransaction()     // Catch:{ SQLiteFullException -> 0x00b5, SQLiteDatabaseLockedException -> 0x00e5, SQLiteException -> 0x00b1 }
            r10 = 0
            java.lang.String r0 = "select count(1) from messages"
            android.database.Cursor r12 = r9.rawQuery(r0, r7)     // Catch:{ SQLiteFullException -> 0x00b5, SQLiteDatabaseLockedException -> 0x00e5, SQLiteException -> 0x00b1 }
            if (r12 == 0) goto L_0x0059
            boolean r0 = r12.moveToFirst()     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00af, SQLiteException -> 0x0053, all -> 0x0050 }
            if (r0 == 0) goto L_0x0059
            long r10 = r12.getLong(r2)     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00af, SQLiteException -> 0x0053, all -> 0x0050 }
            goto L_0x0059
        L_0x0050:
            r0 = move-exception
            goto L_0x00e2
        L_0x0053:
            r0 = move-exception
            goto L_0x00b3
        L_0x0055:
            r0 = move-exception
            r7 = r12
            goto L_0x00f8
        L_0x0059:
            java.lang.String r0 = "messages"
            r13 = 100000(0x186a0, double:4.94066E-319)
            int r15 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r15 < 0) goto L_0x009c
            i.c.a.b.i.a.m4 r15 = r16.n()     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00af, SQLiteException -> 0x0053, all -> 0x0050 }
            i.c.a.b.i.a.o4 r15 = r15.f3758f     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00af, SQLiteException -> 0x0053, all -> 0x0050 }
            java.lang.String r4 = "Data loss, local db full"
            r15.a(r4)     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00af, SQLiteException -> 0x0053, all -> 0x0050 }
            long r13 = r13 - r10
            r10 = 1
            long r13 = r13 + r10
            java.lang.String r4 = "rowid in (select rowid from messages order by rowid asc limit ?)"
            java.lang.String[] r10 = new java.lang.String[r8]     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00af, SQLiteException -> 0x0053, all -> 0x0050 }
            java.lang.String r11 = java.lang.Long.toString(r13)     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00af, SQLiteException -> 0x0053, all -> 0x0050 }
            r10[r2] = r11     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00af, SQLiteException -> 0x0053, all -> 0x0050 }
            int r4 = r9.delete(r0, r4, r10)     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00af, SQLiteException -> 0x0053, all -> 0x0050 }
            long r10 = (long) r4     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00af, SQLiteException -> 0x0053, all -> 0x0050 }
            int r4 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r4 == 0) goto L_0x009c
            i.c.a.b.i.a.m4 r4 = r16.n()     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00af, SQLiteException -> 0x0053, all -> 0x0050 }
            i.c.a.b.i.a.o4 r4 = r4.f3758f     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00af, SQLiteException -> 0x0053, all -> 0x0050 }
            java.lang.String r15 = "Different delete count than expected in local db. expected, received, difference"
            java.lang.Long r2 = java.lang.Long.valueOf(r13)     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00af, SQLiteException -> 0x0053, all -> 0x0050 }
            java.lang.Long r8 = java.lang.Long.valueOf(r10)     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00af, SQLiteException -> 0x0053, all -> 0x0050 }
            long r13 = r13 - r10
            java.lang.Long r10 = java.lang.Long.valueOf(r13)     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00af, SQLiteException -> 0x0053, all -> 0x0050 }
            r4.a(r15, r2, r8, r10)     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00af, SQLiteException -> 0x0053, all -> 0x0050 }
        L_0x009c:
            r9.insertOrThrow(r0, r7, r3)     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00af, SQLiteException -> 0x0053, all -> 0x0050 }
            r9.setTransactionSuccessful()     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00af, SQLiteException -> 0x0053, all -> 0x0050 }
            r9.endTransaction()     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00af, SQLiteException -> 0x0053, all -> 0x0050 }
            if (r12 == 0) goto L_0x00aa
            r12.close()
        L_0x00aa:
            r9.close()
            r2 = 1
            return r2
        L_0x00af:
            r7 = r12
            goto L_0x00e5
        L_0x00b1:
            r0 = move-exception
            r12 = r7
        L_0x00b3:
            r7 = r9
            goto L_0x00bc
        L_0x00b5:
            r0 = move-exception
            goto L_0x00f8
        L_0x00b7:
            r0 = move-exception
            r9 = r7
            goto L_0x0117
        L_0x00ba:
            r0 = move-exception
            r12 = r7
        L_0x00bc:
            if (r7 == 0) goto L_0x00c7
            boolean r2 = r7.inTransaction()     // Catch:{ all -> 0x00e0 }
            if (r2 == 0) goto L_0x00c7
            r7.endTransaction()     // Catch:{ all -> 0x00e0 }
        L_0x00c7:
            i.c.a.b.i.a.m4 r2 = r16.n()     // Catch:{ all -> 0x00e0 }
            i.c.a.b.i.a.o4 r2 = r2.f3758f     // Catch:{ all -> 0x00e0 }
            java.lang.String r4 = "Error writing entry to local database"
            r2.a(r4, r0)     // Catch:{ all -> 0x00e0 }
            r2 = 1
            r1.d = r2     // Catch:{ all -> 0x00e0 }
            if (r12 == 0) goto L_0x00da
            r12.close()
        L_0x00da:
            if (r7 == 0) goto L_0x0110
            r7.close()
            goto L_0x0110
        L_0x00e0:
            r0 = move-exception
            r9 = r7
        L_0x00e2:
            r7 = r12
            goto L_0x0117
        L_0x00e4:
            r9 = r7
        L_0x00e5:
            long r10 = (long) r6
            android.os.SystemClock.sleep(r10)     // Catch:{ all -> 0x0116 }
            int r6 = r6 + 20
            if (r7 == 0) goto L_0x00f0
            r7.close()
        L_0x00f0:
            if (r9 == 0) goto L_0x0110
            r9.close()
            goto L_0x0110
        L_0x00f6:
            r0 = move-exception
            r9 = r7
        L_0x00f8:
            i.c.a.b.i.a.m4 r2 = r16.n()     // Catch:{ all -> 0x0116 }
            i.c.a.b.i.a.o4 r2 = r2.f3758f     // Catch:{ all -> 0x0116 }
            java.lang.String r4 = "Error writing entry; local database full"
            r2.a(r4, r0)     // Catch:{ all -> 0x0116 }
            r2 = 1
            r1.d = r2     // Catch:{ all -> 0x0116 }
            if (r7 == 0) goto L_0x010b
            r7.close()
        L_0x010b:
            if (r9 == 0) goto L_0x0110
            r9.close()
        L_0x0110:
            int r5 = r5 + 1
            r2 = 0
            r4 = 5
            goto L_0x0026
        L_0x0116:
            r0 = move-exception
        L_0x0117:
            if (r7 == 0) goto L_0x011c
            r7.close()
        L_0x011c:
            if (r9 == 0) goto L_0x0121
            r9.close()
        L_0x0121:
            throw r0
        L_0x0122:
            i.c.a.b.i.a.m4 r0 = r16.n()
            i.c.a.b.i.a.o4 r0 = r0.f3766n
            java.lang.String r2 = "Failed to write entry to local database"
            r0.a(r2)
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.a.b.i.a.i4.a(int, byte[]):boolean");
    }

    public final boolean y() {
        return false;
    }

    public final void z() {
        a();
        c();
        try {
            int delete = B().delete("messages", (String) null, (String[]) null) + 0;
            if (delete > 0) {
                n().f3766n.a("Reset local analytics data. records", Integer.valueOf(delete));
            }
        } catch (SQLiteException e) {
            n().f3758f.a("Error resetting local analytics data. error", e);
        }
    }

    public static long a(SQLiteDatabase sQLiteDatabase) {
        Cursor cursor = null;
        try {
            Cursor query = sQLiteDatabase.query("messages", new String[]{"rowid"}, "type=?", new String[]{"3"}, (String) null, (String) null, "rowid desc", "1");
            if (query.moveToFirst()) {
                long j2 = query.getLong(0);
                query.close();
                return j2;
            }
            query.close();
            return -1;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }
}
