package i.c.a.b.i.a;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import androidx.recyclerview.widget.RecyclerView;
import com.crashlytics.android.answers.AnswersRetryFilesSender;
import com.crashlytics.android.core.DefaultAppMeasurementEventListenerRegistrar;
import i.a.a.a.a;
import i.c.a.b.d.l.q;
import i.c.a.b.d.o.c;
import i.c.a.b.g.g.b0;
import i.c.a.b.g.g.e0;
import i.c.a.b.g.g.k9;
import i.c.a.b.g.g.p0;
import i.c.a.b.g.g.r0;
import i.c.a.b.g.g.t0;
import i.c.a.b.g.g.t7;
import i.c.a.b.g.g.w3;
import i.c.a.b.g.g.x9;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
public final class d extends r9 {

    /* renamed from: f  reason: collision with root package name */
    public static final String[] f3632f = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};

    /* renamed from: g  reason: collision with root package name */
    public static final String[] f3633g = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};

    /* renamed from: h  reason: collision with root package name */
    public static final String[] f3634h = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;"};

    /* renamed from: i  reason: collision with root package name */
    public static final String[] f3635i = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};

    /* renamed from: j  reason: collision with root package name */
    public static final String[] f3636j = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};

    /* renamed from: k  reason: collision with root package name */
    public static final String[] f3637k = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: l  reason: collision with root package name */
    public static final String[] f3638l = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: m  reason: collision with root package name */
    public static final String[] f3639m = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
    public final e d = new e(this, this.a.a, "google_app_measurement.db");
    public final n9 e = new n9(this.a.f3868n);

    public d(t9 t9Var) {
        super(t9Var);
    }

    public final void A() {
        c();
        m();
        if (x()) {
            long a = g().f3931h.a();
            if (((c) this.a.f3868n) != null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (Math.abs(elapsedRealtime - a) > o.y.a(null).longValue()) {
                    g().f3931h.a(elapsedRealtime);
                    c();
                    m();
                    if (x()) {
                        SQLiteDatabase u = u();
                        String[] strArr = new String[2];
                        if (((c) this.a.f3868n) != null) {
                            strArr[0] = String.valueOf(System.currentTimeMillis());
                            strArr[1] = String.valueOf(pa.v());
                            int delete = u.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", strArr);
                            if (delete > 0) {
                                n().f3766n.a("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
                                return;
                            }
                            return;
                        }
                        throw null;
                    }
                    return;
                }
                return;
            }
            throw null;
        }
    }

    public final long a(String str, String[] strArr, long j2) {
        Cursor cursor = null;
        try {
            Cursor rawQuery = u().rawQuery(str, strArr);
            if (rawQuery.moveToFirst()) {
                long j3 = rawQuery.getLong(0);
                rawQuery.close();
                return j3;
            }
            rawQuery.close();
            return j2;
        } catch (SQLiteException e2) {
            n().f3758f.a("Database error", str, e2);
            throw e2;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final long b(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            cursor = u().rawQuery(str, strArr);
            if (cursor.moveToFirst()) {
                long j2 = cursor.getLong(0);
                cursor.close();
                return j2;
            }
            throw new SQLiteException("Database returned empty set");
        } catch (SQLiteException e2) {
            n().f3758f.a("Database error", str, e2);
            throw e2;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final i.c.a.b.i.a.da c(java.lang.String r19, java.lang.String r20) {
        /*
            r18 = this;
            r8 = r20
            i.c.a.b.d.l.q.b((java.lang.String) r19)
            i.c.a.b.d.l.q.b((java.lang.String) r20)
            r18.c()
            r18.m()
            r9 = 0
            android.database.sqlite.SQLiteDatabase r10 = r18.u()     // Catch:{ SQLiteException -> 0x007c, all -> 0x0078 }
            java.lang.String r11 = "user_attributes"
            java.lang.String r0 = "set_timestamp"
            java.lang.String r1 = "value"
            java.lang.String r2 = "origin"
            java.lang.String[] r12 = new java.lang.String[]{r0, r1, r2}     // Catch:{ SQLiteException -> 0x007c, all -> 0x0078 }
            java.lang.String r13 = "app_id=? and name=?"
            r0 = 2
            java.lang.String[] r14 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x007c, all -> 0x0078 }
            r1 = 0
            r14[r1] = r19     // Catch:{ SQLiteException -> 0x007c, all -> 0x0078 }
            r2 = 1
            r14[r2] = r8     // Catch:{ SQLiteException -> 0x007c, all -> 0x0078 }
            r15 = 0
            r16 = 0
            r17 = 0
            android.database.Cursor r10 = r10.query(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ SQLiteException -> 0x007c, all -> 0x0078 }
            boolean r3 = r10.moveToFirst()     // Catch:{ SQLiteException -> 0x0074, all -> 0x0070 }
            if (r3 != 0) goto L_0x003d
            r10.close()
            return r9
        L_0x003d:
            long r5 = r10.getLong(r1)     // Catch:{ SQLiteException -> 0x0074, all -> 0x0070 }
            r11 = r18
            java.lang.Object r7 = r11.a((android.database.Cursor) r10, (int) r2)     // Catch:{ SQLiteException -> 0x006e }
            java.lang.String r3 = r10.getString(r0)     // Catch:{ SQLiteException -> 0x006e }
            i.c.a.b.i.a.da r0 = new i.c.a.b.i.a.da     // Catch:{ SQLiteException -> 0x006e }
            r1 = r0
            r2 = r19
            r4 = r20
            r1.<init>(r2, r3, r4, r5, r7)     // Catch:{ SQLiteException -> 0x006e }
            boolean r1 = r10.moveToNext()     // Catch:{ SQLiteException -> 0x006e }
            if (r1 == 0) goto L_0x006a
            i.c.a.b.i.a.m4 r1 = r18.n()     // Catch:{ SQLiteException -> 0x006e }
            i.c.a.b.i.a.o4 r1 = r1.f3758f     // Catch:{ SQLiteException -> 0x006e }
            java.lang.String r2 = "Got multiple records for user property, expected one. appId"
            java.lang.Object r3 = i.c.a.b.i.a.m4.a((java.lang.String) r19)     // Catch:{ SQLiteException -> 0x006e }
            r1.a(r2, r3)     // Catch:{ SQLiteException -> 0x006e }
        L_0x006a:
            r10.close()
            return r0
        L_0x006e:
            r0 = move-exception
            goto L_0x0080
        L_0x0070:
            r0 = move-exception
            r11 = r18
            goto L_0x009e
        L_0x0074:
            r0 = move-exception
            r11 = r18
            goto L_0x0080
        L_0x0078:
            r0 = move-exception
            r11 = r18
            goto L_0x009f
        L_0x007c:
            r0 = move-exception
            r11 = r18
            r10 = r9
        L_0x0080:
            i.c.a.b.i.a.m4 r1 = r18.n()     // Catch:{ all -> 0x009d }
            i.c.a.b.i.a.o4 r1 = r1.f3758f     // Catch:{ all -> 0x009d }
            java.lang.String r2 = "Error querying user property. appId"
            java.lang.Object r3 = i.c.a.b.i.a.m4.a((java.lang.String) r19)     // Catch:{ all -> 0x009d }
            i.c.a.b.i.a.k4 r4 = r18.e()     // Catch:{ all -> 0x009d }
            java.lang.String r4 = r4.c(r8)     // Catch:{ all -> 0x009d }
            r1.a(r2, r3, r4, r0)     // Catch:{ all -> 0x009d }
            if (r10 == 0) goto L_0x009c
            r10.close()
        L_0x009c:
            return r9
        L_0x009d:
            r0 = move-exception
        L_0x009e:
            r9 = r10
        L_0x009f:
            if (r9 == 0) goto L_0x00a4
            r9.close()
        L_0x00a4:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.a.b.i.a.d.c(java.lang.String, java.lang.String):i.c.a.b.i.a.da");
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x011d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final i.c.a.b.i.a.na d(java.lang.String r30, java.lang.String r31) {
        /*
            r29 = this;
            r7 = r31
            i.c.a.b.d.l.q.b((java.lang.String) r30)
            i.c.a.b.d.l.q.b((java.lang.String) r31)
            r29.c()
            r29.m()
            r8 = 0
            android.database.sqlite.SQLiteDatabase r9 = r29.u()     // Catch:{ SQLiteException -> 0x00f8, all -> 0x00f4 }
            java.lang.String r10 = "conditional_properties"
            java.lang.String r11 = "origin"
            java.lang.String r12 = "value"
            java.lang.String r13 = "active"
            java.lang.String r14 = "trigger_event_name"
            java.lang.String r15 = "trigger_timeout"
            java.lang.String r16 = "timed_out_event"
            java.lang.String r17 = "creation_timestamp"
            java.lang.String r18 = "triggered_event"
            java.lang.String r19 = "triggered_timestamp"
            java.lang.String r20 = "time_to_live"
            java.lang.String r21 = "expired_event"
            java.lang.String[] r11 = new java.lang.String[]{r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21}     // Catch:{ SQLiteException -> 0x00f8, all -> 0x00f4 }
            java.lang.String r12 = "app_id=? and name=?"
            r0 = 2
            java.lang.String[] r13 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x00f8, all -> 0x00f4 }
            r1 = 0
            r13[r1] = r30     // Catch:{ SQLiteException -> 0x00f8, all -> 0x00f4 }
            r2 = 1
            r13[r2] = r7     // Catch:{ SQLiteException -> 0x00f8, all -> 0x00f4 }
            r14 = 0
            r15 = 0
            r16 = 0
            android.database.Cursor r9 = r9.query(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ SQLiteException -> 0x00f8, all -> 0x00f4 }
            boolean r3 = r9.moveToFirst()     // Catch:{ SQLiteException -> 0x00f0, all -> 0x00ec }
            if (r3 != 0) goto L_0x004c
            r9.close()
            return r8
        L_0x004c:
            java.lang.String r16 = r9.getString(r1)     // Catch:{ SQLiteException -> 0x00f0, all -> 0x00ec }
            r10 = r29
            java.lang.Object r5 = r10.a((android.database.Cursor) r9, (int) r2)     // Catch:{ SQLiteException -> 0x00ea }
            int r0 = r9.getInt(r0)     // Catch:{ SQLiteException -> 0x00ea }
            if (r0 == 0) goto L_0x005f
            r20 = 1
            goto L_0x0061
        L_0x005f:
            r20 = 0
        L_0x0061:
            r0 = 3
            java.lang.String r21 = r9.getString(r0)     // Catch:{ SQLiteException -> 0x00ea }
            r0 = 4
            long r23 = r9.getLong(r0)     // Catch:{ SQLiteException -> 0x00ea }
            i.c.a.b.i.a.x9 r0 = r29.q()     // Catch:{ SQLiteException -> 0x00ea }
            r1 = 5
            byte[] r1 = r9.getBlob(r1)     // Catch:{ SQLiteException -> 0x00ea }
            android.os.Parcelable$Creator<i.c.a.b.i.a.m> r2 = i.c.a.b.i.a.m.CREATOR     // Catch:{ SQLiteException -> 0x00ea }
            android.os.Parcelable r0 = r0.a((byte[]) r1, r2)     // Catch:{ SQLiteException -> 0x00ea }
            r22 = r0
            i.c.a.b.i.a.m r22 = (i.c.a.b.i.a.m) r22     // Catch:{ SQLiteException -> 0x00ea }
            r0 = 6
            long r18 = r9.getLong(r0)     // Catch:{ SQLiteException -> 0x00ea }
            i.c.a.b.i.a.x9 r0 = r29.q()     // Catch:{ SQLiteException -> 0x00ea }
            r1 = 7
            byte[] r1 = r9.getBlob(r1)     // Catch:{ SQLiteException -> 0x00ea }
            android.os.Parcelable$Creator<i.c.a.b.i.a.m> r2 = i.c.a.b.i.a.m.CREATOR     // Catch:{ SQLiteException -> 0x00ea }
            android.os.Parcelable r0 = r0.a((byte[]) r1, r2)     // Catch:{ SQLiteException -> 0x00ea }
            r25 = r0
            i.c.a.b.i.a.m r25 = (i.c.a.b.i.a.m) r25     // Catch:{ SQLiteException -> 0x00ea }
            r0 = 8
            long r3 = r9.getLong(r0)     // Catch:{ SQLiteException -> 0x00ea }
            r0 = 9
            long r26 = r9.getLong(r0)     // Catch:{ SQLiteException -> 0x00ea }
            i.c.a.b.i.a.x9 r0 = r29.q()     // Catch:{ SQLiteException -> 0x00ea }
            r1 = 10
            byte[] r1 = r9.getBlob(r1)     // Catch:{ SQLiteException -> 0x00ea }
            android.os.Parcelable$Creator<i.c.a.b.i.a.m> r2 = i.c.a.b.i.a.m.CREATOR     // Catch:{ SQLiteException -> 0x00ea }
            android.os.Parcelable r0 = r0.a((byte[]) r1, r2)     // Catch:{ SQLiteException -> 0x00ea }
            r28 = r0
            i.c.a.b.i.a.m r28 = (i.c.a.b.i.a.m) r28     // Catch:{ SQLiteException -> 0x00ea }
            i.c.a.b.i.a.aa r17 = new i.c.a.b.i.a.aa     // Catch:{ SQLiteException -> 0x00ea }
            r1 = r17
            r2 = r31
            r6 = r16
            r1.<init>(r2, r3, r5, r6)     // Catch:{ SQLiteException -> 0x00ea }
            i.c.a.b.i.a.na r0 = new i.c.a.b.i.a.na     // Catch:{ SQLiteException -> 0x00ea }
            r14 = r0
            r15 = r30
            r14.<init>(r15, r16, r17, r18, r20, r21, r22, r23, r25, r26, r28)     // Catch:{ SQLiteException -> 0x00ea }
            boolean r1 = r9.moveToNext()     // Catch:{ SQLiteException -> 0x00ea }
            if (r1 == 0) goto L_0x00e6
            i.c.a.b.i.a.m4 r1 = r29.n()     // Catch:{ SQLiteException -> 0x00ea }
            i.c.a.b.i.a.o4 r1 = r1.f3758f     // Catch:{ SQLiteException -> 0x00ea }
            java.lang.String r2 = "Got multiple records for conditional property, expected one"
            java.lang.Object r3 = i.c.a.b.i.a.m4.a((java.lang.String) r30)     // Catch:{ SQLiteException -> 0x00ea }
            i.c.a.b.i.a.k4 r4 = r29.e()     // Catch:{ SQLiteException -> 0x00ea }
            java.lang.String r4 = r4.c(r7)     // Catch:{ SQLiteException -> 0x00ea }
            r1.a(r2, r3, r4)     // Catch:{ SQLiteException -> 0x00ea }
        L_0x00e6:
            r9.close()
            return r0
        L_0x00ea:
            r0 = move-exception
            goto L_0x00fc
        L_0x00ec:
            r0 = move-exception
            r10 = r29
            goto L_0x011a
        L_0x00f0:
            r0 = move-exception
            r10 = r29
            goto L_0x00fc
        L_0x00f4:
            r0 = move-exception
            r10 = r29
            goto L_0x011b
        L_0x00f8:
            r0 = move-exception
            r10 = r29
            r9 = r8
        L_0x00fc:
            i.c.a.b.i.a.m4 r1 = r29.n()     // Catch:{ all -> 0x0119 }
            i.c.a.b.i.a.o4 r1 = r1.f3758f     // Catch:{ all -> 0x0119 }
            java.lang.String r2 = "Error querying conditional property"
            java.lang.Object r3 = i.c.a.b.i.a.m4.a((java.lang.String) r30)     // Catch:{ all -> 0x0119 }
            i.c.a.b.i.a.k4 r4 = r29.e()     // Catch:{ all -> 0x0119 }
            java.lang.String r4 = r4.c(r7)     // Catch:{ all -> 0x0119 }
            r1.a(r2, r3, r4, r0)     // Catch:{ all -> 0x0119 }
            if (r9 == 0) goto L_0x0118
            r9.close()
        L_0x0118:
            return r8
        L_0x0119:
            r0 = move-exception
        L_0x011a:
            r8 = r9
        L_0x011b:
            if (r8 == 0) goto L_0x0120
            r8.close()
        L_0x0120:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.a.b.i.a.d.d(java.lang.String, java.lang.String):i.c.a.b.i.a.na");
    }

    public final int e(String str, String str2) {
        q.b(str);
        q.b(str2);
        c();
        m();
        try {
            return u().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e2) {
            n().f3758f.a("Error deleting conditional property", m4.a(str), e().c(str2), e2);
            return 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.Integer, java.util.List<i.c.a.b.g.g.b0>> f(java.lang.String r13, java.lang.String r14) {
        /*
            r12 = this;
            r12.m()
            r12.c()
            i.c.a.b.d.l.q.b((java.lang.String) r13)
            i.c.a.b.d.l.q.b((java.lang.String) r14)
            h.e.a r0 = new h.e.a
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r1 = r12.u()
            r9 = 0
            java.lang.String r2 = "event_filters"
            java.lang.String r3 = "audience_id"
            java.lang.String r4 = "data"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4}     // Catch:{ SQLiteException -> 0x0098, all -> 0x0096 }
            java.lang.String r4 = "app_id=? AND event_name=?"
            r5 = 2
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x0098, all -> 0x0096 }
            r10 = 0
            r5[r10] = r13     // Catch:{ SQLiteException -> 0x0098, all -> 0x0096 }
            r11 = 1
            r5[r11] = r14     // Catch:{ SQLiteException -> 0x0098, all -> 0x0096 }
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r14 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ SQLiteException -> 0x0098, all -> 0x0096 }
            boolean r1 = r14.moveToFirst()     // Catch:{ SQLiteException -> 0x0094 }
            if (r1 != 0) goto L_0x0040
            java.util.Map r13 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x0094 }
            r14.close()
            return r13
        L_0x0040:
            byte[] r1 = r14.getBlob(r11)     // Catch:{ SQLiteException -> 0x0094 }
            i.c.a.b.g.g.b0 r2 = i.c.a.b.g.g.b0.zzl     // Catch:{ IOException -> 0x007a }
            i.c.a.b.g.g.w3$b r2 = r2.i()     // Catch:{ IOException -> 0x007a }
            i.c.a.b.g.g.b0$a r2 = (i.c.a.b.g.g.b0.a) r2     // Catch:{ IOException -> 0x007a }
            i.c.a.b.g.g.e5 r1 = i.c.a.b.i.a.x9.a(r2, (byte[]) r1)     // Catch:{ IOException -> 0x007a }
            i.c.a.b.g.g.b0$a r1 = (i.c.a.b.g.g.b0.a) r1     // Catch:{ IOException -> 0x007a }
            i.c.a.b.g.g.f5 r1 = r1.k()     // Catch:{ IOException -> 0x007a }
            i.c.a.b.g.g.w3 r1 = (i.c.a.b.g.g.w3) r1     // Catch:{ IOException -> 0x007a }
            i.c.a.b.g.g.b0 r1 = (i.c.a.b.g.g.b0) r1     // Catch:{ IOException -> 0x007a }
            int r2 = r14.getInt(r10)     // Catch:{ SQLiteException -> 0x0094 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch:{ SQLiteException -> 0x0094 }
            java.lang.Object r3 = r0.get(r3)     // Catch:{ SQLiteException -> 0x0094 }
            java.util.List r3 = (java.util.List) r3     // Catch:{ SQLiteException -> 0x0094 }
            if (r3 != 0) goto L_0x0076
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0094 }
            r3.<init>()     // Catch:{ SQLiteException -> 0x0094 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ SQLiteException -> 0x0094 }
            r0.put(r2, r3)     // Catch:{ SQLiteException -> 0x0094 }
        L_0x0076:
            r3.add(r1)     // Catch:{ SQLiteException -> 0x0094 }
            goto L_0x008a
        L_0x007a:
            r1 = move-exception
            i.c.a.b.i.a.m4 r2 = r12.n()     // Catch:{ SQLiteException -> 0x0094 }
            i.c.a.b.i.a.o4 r2 = r2.f3758f     // Catch:{ SQLiteException -> 0x0094 }
            java.lang.String r3 = "Failed to merge filter. appId"
            java.lang.Object r4 = i.c.a.b.i.a.m4.a((java.lang.String) r13)     // Catch:{ SQLiteException -> 0x0094 }
            r2.a(r3, r4, r1)     // Catch:{ SQLiteException -> 0x0094 }
        L_0x008a:
            boolean r1 = r14.moveToNext()     // Catch:{ SQLiteException -> 0x0094 }
            if (r1 != 0) goto L_0x0040
            r14.close()
            return r0
        L_0x0094:
            r0 = move-exception
            goto L_0x009b
        L_0x0096:
            r13 = move-exception
            goto L_0x00b2
        L_0x0098:
            r14 = move-exception
            r0 = r14
            r14 = r9
        L_0x009b:
            i.c.a.b.i.a.m4 r1 = r12.n()     // Catch:{ all -> 0x00b0 }
            i.c.a.b.i.a.o4 r1 = r1.f3758f     // Catch:{ all -> 0x00b0 }
            java.lang.String r2 = "Database error querying filters. appId"
            java.lang.Object r13 = i.c.a.b.i.a.m4.a((java.lang.String) r13)     // Catch:{ all -> 0x00b0 }
            r1.a(r2, r13, r0)     // Catch:{ all -> 0x00b0 }
            if (r14 == 0) goto L_0x00af
            r14.close()
        L_0x00af:
            return r9
        L_0x00b0:
            r13 = move-exception
            r9 = r14
        L_0x00b2:
            if (r9 == 0) goto L_0x00b7
            r9.close()
        L_0x00b7:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.a.b.i.a.d.f(java.lang.String, java.lang.String):java.util.Map");
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.Integer, java.util.List<i.c.a.b.g.g.e0>> g(java.lang.String r13, java.lang.String r14) {
        /*
            r12 = this;
            r12.m()
            r12.c()
            i.c.a.b.d.l.q.b((java.lang.String) r13)
            i.c.a.b.d.l.q.b((java.lang.String) r14)
            h.e.a r0 = new h.e.a
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r1 = r12.u()
            r9 = 0
            java.lang.String r2 = "property_filters"
            java.lang.String r3 = "audience_id"
            java.lang.String r4 = "data"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4}     // Catch:{ SQLiteException -> 0x0098, all -> 0x0096 }
            java.lang.String r4 = "app_id=? AND property_name=?"
            r5 = 2
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x0098, all -> 0x0096 }
            r10 = 0
            r5[r10] = r13     // Catch:{ SQLiteException -> 0x0098, all -> 0x0096 }
            r11 = 1
            r5[r11] = r14     // Catch:{ SQLiteException -> 0x0098, all -> 0x0096 }
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r14 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ SQLiteException -> 0x0098, all -> 0x0096 }
            boolean r1 = r14.moveToFirst()     // Catch:{ SQLiteException -> 0x0094 }
            if (r1 != 0) goto L_0x0040
            java.util.Map r13 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x0094 }
            r14.close()
            return r13
        L_0x0040:
            byte[] r1 = r14.getBlob(r11)     // Catch:{ SQLiteException -> 0x0094 }
            i.c.a.b.g.g.e0 r2 = i.c.a.b.g.g.e0.zzj     // Catch:{ IOException -> 0x007a }
            i.c.a.b.g.g.w3$b r2 = r2.i()     // Catch:{ IOException -> 0x007a }
            i.c.a.b.g.g.e0$a r2 = (i.c.a.b.g.g.e0.a) r2     // Catch:{ IOException -> 0x007a }
            i.c.a.b.g.g.e5 r1 = i.c.a.b.i.a.x9.a(r2, (byte[]) r1)     // Catch:{ IOException -> 0x007a }
            i.c.a.b.g.g.e0$a r1 = (i.c.a.b.g.g.e0.a) r1     // Catch:{ IOException -> 0x007a }
            i.c.a.b.g.g.f5 r1 = r1.k()     // Catch:{ IOException -> 0x007a }
            i.c.a.b.g.g.w3 r1 = (i.c.a.b.g.g.w3) r1     // Catch:{ IOException -> 0x007a }
            i.c.a.b.g.g.e0 r1 = (i.c.a.b.g.g.e0) r1     // Catch:{ IOException -> 0x007a }
            int r2 = r14.getInt(r10)     // Catch:{ SQLiteException -> 0x0094 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch:{ SQLiteException -> 0x0094 }
            java.lang.Object r3 = r0.get(r3)     // Catch:{ SQLiteException -> 0x0094 }
            java.util.List r3 = (java.util.List) r3     // Catch:{ SQLiteException -> 0x0094 }
            if (r3 != 0) goto L_0x0076
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0094 }
            r3.<init>()     // Catch:{ SQLiteException -> 0x0094 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ SQLiteException -> 0x0094 }
            r0.put(r2, r3)     // Catch:{ SQLiteException -> 0x0094 }
        L_0x0076:
            r3.add(r1)     // Catch:{ SQLiteException -> 0x0094 }
            goto L_0x008a
        L_0x007a:
            r1 = move-exception
            i.c.a.b.i.a.m4 r2 = r12.n()     // Catch:{ SQLiteException -> 0x0094 }
            i.c.a.b.i.a.o4 r2 = r2.f3758f     // Catch:{ SQLiteException -> 0x0094 }
            java.lang.String r3 = "Failed to merge filter"
            java.lang.Object r4 = i.c.a.b.i.a.m4.a((java.lang.String) r13)     // Catch:{ SQLiteException -> 0x0094 }
            r2.a(r3, r4, r1)     // Catch:{ SQLiteException -> 0x0094 }
        L_0x008a:
            boolean r1 = r14.moveToNext()     // Catch:{ SQLiteException -> 0x0094 }
            if (r1 != 0) goto L_0x0040
            r14.close()
            return r0
        L_0x0094:
            r0 = move-exception
            goto L_0x009a
        L_0x0096:
            r13 = move-exception
            goto L_0x00b1
        L_0x0098:
            r0 = move-exception
            r14 = r9
        L_0x009a:
            i.c.a.b.i.a.m4 r1 = r12.n()     // Catch:{ all -> 0x00af }
            i.c.a.b.i.a.o4 r1 = r1.f3758f     // Catch:{ all -> 0x00af }
            java.lang.String r2 = "Database error querying filters. appId"
            java.lang.Object r13 = i.c.a.b.i.a.m4.a((java.lang.String) r13)     // Catch:{ all -> 0x00af }
            r1.a(r2, r13, r0)     // Catch:{ all -> 0x00af }
            if (r14 == 0) goto L_0x00ae
            r14.close()
        L_0x00ae:
            return r9
        L_0x00af:
            r13 = move-exception
            r9 = r14
        L_0x00b1:
            if (r9 == 0) goto L_0x00b6
            r9.close()
        L_0x00b6:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.a.b.i.a.d.g(java.lang.String, java.lang.String):java.util.Map");
    }

    public final long h(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        q.b(str);
        q.b(str2);
        c();
        m();
        SQLiteDatabase u = u();
        u.beginTransaction();
        long j2 = 0;
        try {
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 32);
            sb.append("select ");
            sb.append(str4);
            sb.append(" from app2 where app_id=?");
            try {
                long a = a(sb.toString(), new String[]{str3}, -1);
                if (a == -1) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("app_id", str3);
                    contentValues.put("first_open_count", 0);
                    contentValues.put("previous_install_count", 0);
                    if (u.insertWithOnConflict("app2", (String) null, contentValues, 5) == -1) {
                        n().f3758f.a("Failed to insert column (got -1). appId", m4.a(str), str4);
                        u.endTransaction();
                        return -1;
                    }
                    a = 0;
                }
                try {
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("app_id", str3);
                    contentValues2.put(str4, Long.valueOf(1 + a));
                    if (((long) u.update("app2", contentValues2, "app_id = ?", new String[]{str3})) == 0) {
                        n().f3758f.a("Failed to update column (got 0). appId", m4.a(str), str4);
                        u.endTransaction();
                        return -1;
                    }
                    u.setTransactionSuccessful();
                    u.endTransaction();
                    return a;
                } catch (SQLiteException e2) {
                    e = e2;
                    j2 = a;
                    try {
                        n().f3758f.a("Error inserting column. appId", m4.a(str), str4, e);
                        u.endTransaction();
                        return j2;
                    } catch (Throwable th) {
                        th = th;
                        u.endTransaction();
                        throw th;
                    }
                }
            } catch (SQLiteException e3) {
                e = e3;
                n().f3758f.a("Error inserting column. appId", m4.a(str), str4, e);
                u.endTransaction();
                return j2;
            }
        } catch (SQLiteException e4) {
            e = e4;
            n().f3758f.a("Error inserting column. appId", m4.a(str), str4, e);
            u.endTransaction();
            return j2;
        } catch (Throwable th2) {
            th = th2;
            u.endTransaction();
            throw th;
        }
    }

    public final boolean p() {
        return false;
    }

    public final void t() {
        m();
        u().setTransactionSuccessful();
    }

    public final SQLiteDatabase u() {
        c();
        try {
            return this.d.getWritableDatabase();
        } catch (SQLiteException e2) {
            n().f3761i.a("Error opening database", e2);
            throw e2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x003b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String v() {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.u()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch:{ SQLiteException -> 0x0025, all -> 0x0020 }
            boolean r2 = r0.moveToFirst()     // Catch:{ SQLiteException -> 0x001e }
            if (r2 == 0) goto L_0x001a
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch:{ SQLiteException -> 0x001e }
            r0.close()
            return r1
        L_0x001a:
            r0.close()
            return r1
        L_0x001e:
            r2 = move-exception
            goto L_0x0027
        L_0x0020:
            r0 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L_0x0039
        L_0x0025:
            r2 = move-exception
            r0 = r1
        L_0x0027:
            i.c.a.b.i.a.m4 r3 = r6.n()     // Catch:{ all -> 0x0038 }
            i.c.a.b.i.a.o4 r3 = r3.f3758f     // Catch:{ all -> 0x0038 }
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.a(r4, r2)     // Catch:{ all -> 0x0038 }
            if (r0 == 0) goto L_0x0037
            r0.close()
        L_0x0037:
            return r1
        L_0x0038:
            r1 = move-exception
        L_0x0039:
            if (r0 == 0) goto L_0x003e
            r0.close()
        L_0x003e:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.a.b.i.a.d.v():java.lang.String");
    }

    public final long w() {
        Cursor cursor = null;
        try {
            cursor = u().rawQuery("select rowid from raw_events order by rowid desc limit 1;", (String[]) null);
            if (!cursor.moveToFirst()) {
                cursor.close();
                return -1;
            }
            long j2 = cursor.getLong(0);
            cursor.close();
            return j2;
        } catch (SQLiteException e2) {
            n().f3758f.a("Error querying raw events", e2);
            if (cursor != null) {
                cursor.close();
            }
            return -1;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final boolean x() {
        return this.a.a.getDatabasePath("google_app_measurement.db").exists();
    }

    public final void y() {
        m();
        u().beginTransaction();
    }

    public final void z() {
        m();
        u().endTransaction();
    }

    public final long e(String str) {
        q.b(str);
        return a("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:66:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x015d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final i.c.a.b.i.a.i a(java.lang.String r27, java.lang.String r28) {
        /*
            r26 = this;
            r15 = r27
            r14 = r28
            i.c.a.b.d.l.q.b((java.lang.String) r27)
            i.c.a.b.d.l.q.b((java.lang.String) r28)
            r26.c()
            r26.m()
            r12 = r26
            i.c.a.b.i.a.s5 r0 = r12.a
            i.c.a.b.i.a.pa r0 = r0.f3861g
            i.c.a.b.i.a.f4<java.lang.Boolean> r1 = i.c.a.b.i.a.o.o0
            boolean r0 = r0.d(r15, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            java.lang.String r2 = "lifetime_count"
            java.lang.String r3 = "current_bundle_count"
            java.lang.String r4 = "last_fire_timestamp"
            java.lang.String r5 = "last_bundled_timestamp"
            java.lang.String r6 = "last_bundled_day"
            java.lang.String r7 = "last_sampled_complex_event_id"
            java.lang.String r8 = "last_sampling_rate"
            java.lang.String r9 = "last_exempt_from_sampling"
            java.lang.String[] r2 = new java.lang.String[]{r2, r3, r4, r5, r6, r7, r8, r9}
            java.util.List r2 = java.util.Arrays.asList(r2)
            r1.<init>(r2)
            if (r0 == 0) goto L_0x0040
            java.lang.String r2 = "current_session_count"
            r1.add(r2)
        L_0x0040:
            r18 = 0
            android.database.sqlite.SQLiteDatabase r2 = r26.u()     // Catch:{ SQLiteException -> 0x0136, all -> 0x0134 }
            java.lang.String r3 = "events"
            r10 = 0
            java.lang.String[] r4 = new java.lang.String[r10]     // Catch:{ SQLiteException -> 0x0136, all -> 0x0134 }
            java.lang.Object[] r1 = r1.toArray(r4)     // Catch:{ SQLiteException -> 0x0136, all -> 0x0134 }
            r4 = r1
            java.lang.String[] r4 = (java.lang.String[]) r4     // Catch:{ SQLiteException -> 0x0136, all -> 0x0134 }
            java.lang.String r5 = "app_id=? and name=?"
            r1 = 2
            java.lang.String[] r6 = new java.lang.String[r1]     // Catch:{ SQLiteException -> 0x0136, all -> 0x0134 }
            r6[r10] = r15     // Catch:{ SQLiteException -> 0x0136, all -> 0x0134 }
            r11 = 1
            r6[r11] = r14     // Catch:{ SQLiteException -> 0x0136, all -> 0x0134 }
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r13 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ SQLiteException -> 0x0136, all -> 0x0134 }
            boolean r2 = r13.moveToFirst()     // Catch:{ SQLiteException -> 0x0130, all -> 0x012a }
            if (r2 != 0) goto L_0x006d
            r13.close()
            return r18
        L_0x006d:
            long r4 = r13.getLong(r10)     // Catch:{ SQLiteException -> 0x0130, all -> 0x012a }
            long r6 = r13.getLong(r11)     // Catch:{ SQLiteException -> 0x0130, all -> 0x012a }
            long r16 = r13.getLong(r1)     // Catch:{ SQLiteException -> 0x0130, all -> 0x012a }
            r1 = 3
            boolean r2 = r13.isNull(r1)     // Catch:{ SQLiteException -> 0x0130, all -> 0x012a }
            r8 = 0
            if (r2 == 0) goto L_0x0085
            r19 = r8
            goto L_0x008b
        L_0x0085:
            long r1 = r13.getLong(r1)     // Catch:{ SQLiteException -> 0x0130, all -> 0x012a }
            r19 = r1
        L_0x008b:
            r1 = 4
            boolean r2 = r13.isNull(r1)     // Catch:{ SQLiteException -> 0x0130, all -> 0x012a }
            if (r2 == 0) goto L_0x0095
            r21 = r18
            goto L_0x009f
        L_0x0095:
            long r1 = r13.getLong(r1)     // Catch:{ SQLiteException -> 0x0130, all -> 0x012a }
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ SQLiteException -> 0x0130, all -> 0x012a }
            r21 = r1
        L_0x009f:
            r1 = 5
            boolean r2 = r13.isNull(r1)     // Catch:{ SQLiteException -> 0x0130, all -> 0x012a }
            if (r2 == 0) goto L_0x00a9
            r22 = r18
            goto L_0x00b3
        L_0x00a9:
            long r1 = r13.getLong(r1)     // Catch:{ SQLiteException -> 0x0130, all -> 0x012a }
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ SQLiteException -> 0x0130, all -> 0x012a }
            r22 = r1
        L_0x00b3:
            r1 = 6
            boolean r2 = r13.isNull(r1)     // Catch:{ SQLiteException -> 0x0130, all -> 0x012a }
            if (r2 == 0) goto L_0x00bd
            r23 = r18
            goto L_0x00c7
        L_0x00bd:
            long r1 = r13.getLong(r1)     // Catch:{ SQLiteException -> 0x0130, all -> 0x012a }
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ SQLiteException -> 0x0130, all -> 0x012a }
            r23 = r1
        L_0x00c7:
            r1 = 7
            boolean r2 = r13.isNull(r1)     // Catch:{ SQLiteException -> 0x0130, all -> 0x012a }
            if (r2 != 0) goto L_0x00e2
            long r1 = r13.getLong(r1)     // Catch:{ SQLiteException -> 0x00e0 }
            r24 = 1
            int r3 = (r1 > r24 ? 1 : (r1 == r24 ? 0 : -1))
            if (r3 != 0) goto L_0x00d9
            r10 = 1
        L_0x00d9:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r10)     // Catch:{ SQLiteException -> 0x00e0 }
            r24 = r1
            goto L_0x00e4
        L_0x00e0:
            r0 = move-exception
            goto L_0x0139
        L_0x00e2:
            r24 = r18
        L_0x00e4:
            if (r0 == 0) goto L_0x00f3
            r0 = 8
            boolean r1 = r13.isNull(r0)     // Catch:{ SQLiteException -> 0x00e0 }
            if (r1 != 0) goto L_0x00f3
            long r0 = r13.getLong(r0)     // Catch:{ SQLiteException -> 0x00e0 }
            r8 = r0
        L_0x00f3:
            i.c.a.b.i.a.i r0 = new i.c.a.b.i.a.i     // Catch:{ SQLiteException -> 0x0130, all -> 0x012a }
            r1 = r0
            r2 = r27
            r3 = r28
            r10 = r16
            r25 = r13
            r12 = r19
            r14 = r21
            r15 = r22
            r16 = r23
            r17 = r24
            r1.<init>(r2, r3, r4, r6, r8, r10, r12, r14, r15, r16, r17)     // Catch:{ SQLiteException -> 0x0126, all -> 0x0124 }
            boolean r1 = r25.moveToNext()     // Catch:{ SQLiteException -> 0x0126, all -> 0x0124 }
            if (r1 == 0) goto L_0x0120
            i.c.a.b.i.a.m4 r1 = r26.n()     // Catch:{ SQLiteException -> 0x0126, all -> 0x0124 }
            i.c.a.b.i.a.o4 r1 = r1.f3758f     // Catch:{ SQLiteException -> 0x0126, all -> 0x0124 }
            java.lang.String r2 = "Got multiple records for event aggregates, expected one. appId"
            java.lang.Object r3 = i.c.a.b.i.a.m4.a((java.lang.String) r27)     // Catch:{ SQLiteException -> 0x0126, all -> 0x0124 }
            r1.a(r2, r3)     // Catch:{ SQLiteException -> 0x0126, all -> 0x0124 }
        L_0x0120:
            r25.close()
            return r0
        L_0x0124:
            r0 = move-exception
            goto L_0x012d
        L_0x0126:
            r0 = move-exception
            r13 = r25
            goto L_0x0139
        L_0x012a:
            r0 = move-exception
            r25 = r13
        L_0x012d:
            r18 = r25
            goto L_0x015b
        L_0x0130:
            r0 = move-exception
            r25 = r13
            goto L_0x0139
        L_0x0134:
            r0 = move-exception
            goto L_0x015b
        L_0x0136:
            r0 = move-exception
            r13 = r18
        L_0x0139:
            i.c.a.b.i.a.m4 r1 = r26.n()     // Catch:{ all -> 0x0158 }
            i.c.a.b.i.a.o4 r1 = r1.f3758f     // Catch:{ all -> 0x0158 }
            java.lang.String r2 = "Error querying events. appId"
            java.lang.Object r3 = i.c.a.b.i.a.m4.a((java.lang.String) r27)     // Catch:{ all -> 0x0158 }
            i.c.a.b.i.a.k4 r4 = r26.e()     // Catch:{ all -> 0x0158 }
            r5 = r28
            java.lang.String r4 = r4.a((java.lang.String) r5)     // Catch:{ all -> 0x0158 }
            r1.a(r2, r3, r4, r0)     // Catch:{ all -> 0x0158 }
            if (r13 == 0) goto L_0x0157
            r13.close()
        L_0x0157:
            return r18
        L_0x0158:
            r0 = move-exception
            r18 = r13
        L_0x015b:
            if (r18 == 0) goto L_0x0160
            r18.close()
        L_0x0160:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.a.b.i.a.d.a(java.lang.String, java.lang.String):i.c.a.b.i.a.i");
    }

    public final void b(String str, String str2) {
        q.b(str);
        q.b(str2);
        c();
        m();
        try {
            int delete = u().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
            if (!k9.b() || !this.f3858b.f3896i.f3861g.d(str, o.Z0)) {
                n().f3766n.a("Deleted user attribute rows", Integer.valueOf(delete));
            }
        } catch (SQLiteException e2) {
            if (!k9.b() || !this.f3858b.f3896i.f3861g.d(str, o.Z0)) {
                n().f3758f.a("Error deleting user attribute. appId", m4.a(str), e().c(str2), e2);
            } else {
                n().f3758f.a("Error deleting user property. appId", m4.a(str), e().c(str2), e2);
            }
        }
    }

    public final long c(String str) {
        q.b(str);
        c();
        m();
        try {
            return (long) u().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str, String.valueOf(Math.max(0, Math.min(1000000, this.a.f3861g.b(str, o.f3812p))))});
        } catch (SQLiteException e2) {
            n().f3758f.a("Error deleting over the limit events. appId", m4.a(str), e2);
            return 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0080  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.Integer, java.util.List<java.lang.Integer>> d(java.lang.String r8) {
        /*
            r7 = this;
            r7.m()
            r7.c()
            i.c.a.b.d.l.q.b((java.lang.String) r8)
            h.e.a r0 = new h.e.a
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r1 = r7.u()
            r2 = 0
            java.lang.String r3 = "select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;"
            r4 = 2
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x0065, all -> 0x0063 }
            r5 = 0
            r4[r5] = r8     // Catch:{ SQLiteException -> 0x0065, all -> 0x0063 }
            r6 = 1
            r4[r6] = r8     // Catch:{ SQLiteException -> 0x0065, all -> 0x0063 }
            android.database.Cursor r1 = r1.rawQuery(r3, r4)     // Catch:{ SQLiteException -> 0x0065, all -> 0x0063 }
            boolean r3 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x0061 }
            if (r3 != 0) goto L_0x0030
            java.util.Map r8 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x0061 }
            r1.close()
            return r8
        L_0x0030:
            int r3 = r1.getInt(r5)     // Catch:{ SQLiteException -> 0x0061 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)     // Catch:{ SQLiteException -> 0x0061 }
            java.lang.Object r4 = r0.get(r4)     // Catch:{ SQLiteException -> 0x0061 }
            java.util.List r4 = (java.util.List) r4     // Catch:{ SQLiteException -> 0x0061 }
            if (r4 != 0) goto L_0x004c
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0061 }
            r4.<init>()     // Catch:{ SQLiteException -> 0x0061 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ SQLiteException -> 0x0061 }
            r0.put(r3, r4)     // Catch:{ SQLiteException -> 0x0061 }
        L_0x004c:
            int r3 = r1.getInt(r6)     // Catch:{ SQLiteException -> 0x0061 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ SQLiteException -> 0x0061 }
            r4.add(r3)     // Catch:{ SQLiteException -> 0x0061 }
            boolean r3 = r1.moveToNext()     // Catch:{ SQLiteException -> 0x0061 }
            if (r3 != 0) goto L_0x0030
            r1.close()
            return r0
        L_0x0061:
            r0 = move-exception
            goto L_0x0067
        L_0x0063:
            r8 = move-exception
            goto L_0x007e
        L_0x0065:
            r0 = move-exception
            r1 = r2
        L_0x0067:
            i.c.a.b.i.a.m4 r3 = r7.n()     // Catch:{ all -> 0x007c }
            i.c.a.b.i.a.o4 r3 = r3.f3758f     // Catch:{ all -> 0x007c }
            java.lang.String r4 = "Database error querying scoped filters. appId"
            java.lang.Object r8 = i.c.a.b.i.a.m4.a((java.lang.String) r8)     // Catch:{ all -> 0x007c }
            r3.a(r4, r8, r0)     // Catch:{ all -> 0x007c }
            if (r1 == 0) goto L_0x007b
            r1.close()
        L_0x007b:
            return r2
        L_0x007c:
            r8 = move-exception
            r2 = r1
        L_0x007e:
            if (r2 == 0) goto L_0x0083
            r2.close()
        L_0x0083:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.a.b.i.a.d.d(java.lang.String):java.util.Map");
    }

    public final List<na> b(String str, String str2, String str3) {
        q.b(str);
        c();
        m();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb.append(" and name glob ?");
        }
        return a(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    public final void a(i iVar) {
        q.a(iVar);
        c();
        m();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", iVar.a);
        contentValues.put(DefaultAppMeasurementEventListenerRegistrar.NAME, iVar.f3702b);
        contentValues.put("lifetime_count", Long.valueOf(iVar.c));
        contentValues.put("current_bundle_count", Long.valueOf(iVar.d));
        contentValues.put("last_fire_timestamp", Long.valueOf(iVar.f3703f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(iVar.f3704g));
        contentValues.put("last_bundled_day", iVar.f3705h);
        contentValues.put("last_sampled_complex_event_id", iVar.f3706i);
        contentValues.put("last_sampling_rate", iVar.f3707j);
        if (this.a.f3861g.d(iVar.a, o.o0)) {
            contentValues.put("current_session_count", Long.valueOf(iVar.e));
        }
        Boolean bool = iVar.f3708k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (u().insertWithOnConflict("events", (String) null, contentValues, 5) == -1) {
                n().f3758f.a("Failed to insert/update event aggregates (got -1). appId", m4.a(iVar.a));
            }
        } catch (SQLiteException e2) {
            n().f3758f.a("Error storing event aggregates. appId", m4.a(iVar.a), e2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x00f0 A[Catch:{ SQLiteException -> 0x0284 }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00f2 A[Catch:{ SQLiteException -> 0x0284 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x010f A[Catch:{ SQLiteException -> 0x0284 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0111 A[Catch:{ SQLiteException -> 0x0284 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x012e A[Catch:{ SQLiteException -> 0x0284 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0130 A[Catch:{ SQLiteException -> 0x0284 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x014d A[Catch:{ SQLiteException -> 0x0284 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x014f A[Catch:{ SQLiteException -> 0x0284 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x016f A[Catch:{ SQLiteException -> 0x0284 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0173 A[Catch:{ SQLiteException -> 0x0284 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x019b A[Catch:{ SQLiteException -> 0x0284 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x019d A[Catch:{ SQLiteException -> 0x0284 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x01ba A[Catch:{ SQLiteException -> 0x0284 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x01bc A[Catch:{ SQLiteException -> 0x0284 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x01d9 A[Catch:{ SQLiteException -> 0x0284 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x01f2 A[Catch:{ SQLiteException -> 0x0284 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0207 A[Catch:{ SQLiteException -> 0x0284 }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0223 A[Catch:{ SQLiteException -> 0x0284 }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0224 A[Catch:{ SQLiteException -> 0x0284 }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0233 A[Catch:{ SQLiteException -> 0x0284 }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0271 A[Catch:{ SQLiteException -> 0x0284 }] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x029b  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x02a3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final i.c.a.b.i.a.c5 b(java.lang.String r36) {
        /*
            r35 = this;
            r1 = r35
            r2 = r36
            i.c.a.b.d.l.q.b((java.lang.String) r36)
            r35.c()
            r35.m()
            r3 = 0
            android.database.sqlite.SQLiteDatabase r4 = r35.u()     // Catch:{ SQLiteException -> 0x0288, all -> 0x0286 }
            java.lang.String r5 = "apps"
            java.lang.String r6 = "app_instance_id"
            java.lang.String r7 = "gmp_app_id"
            java.lang.String r8 = "resettable_device_id_hash"
            java.lang.String r9 = "last_bundle_index"
            java.lang.String r10 = "last_bundle_start_timestamp"
            java.lang.String r11 = "last_bundle_end_timestamp"
            java.lang.String r12 = "app_version"
            java.lang.String r13 = "app_store"
            java.lang.String r14 = "gmp_version"
            java.lang.String r15 = "dev_cert_hash"
            java.lang.String r16 = "measurement_enabled"
            java.lang.String r17 = "day"
            java.lang.String r18 = "daily_public_events_count"
            java.lang.String r19 = "daily_events_count"
            java.lang.String r20 = "daily_conversions_count"
            java.lang.String r21 = "config_fetched_time"
            java.lang.String r22 = "failed_config_fetch_time"
            java.lang.String r23 = "app_version_int"
            java.lang.String r24 = "firebase_instance_id"
            java.lang.String r25 = "daily_error_events_count"
            java.lang.String r26 = "daily_realtime_events_count"
            java.lang.String r27 = "health_monitor_sample"
            java.lang.String r28 = "android_id"
            java.lang.String r29 = "adid_reporting_enabled"
            java.lang.String r30 = "ssaid_reporting_enabled"
            java.lang.String r31 = "admob_app_id"
            java.lang.String r32 = "dynamite_version"
            java.lang.String r33 = "safelisted_events"
            java.lang.String r34 = "ga_app_id"
            java.lang.String[] r6 = new java.lang.String[]{r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34}     // Catch:{ SQLiteException -> 0x0288, all -> 0x0286 }
            java.lang.String r7 = "app_id=?"
            r0 = 1
            java.lang.String[] r8 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x0288, all -> 0x0286 }
            r12 = 0
            r8[r12] = r2     // Catch:{ SQLiteException -> 0x0288, all -> 0x0286 }
            r9 = 0
            r10 = 0
            r11 = 0
            android.database.Cursor r4 = r4.query(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ SQLiteException -> 0x0288, all -> 0x0286 }
            boolean r5 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x0284 }
            if (r5 != 0) goto L_0x006b
            r4.close()
            return r3
        L_0x006b:
            i.c.a.b.i.a.c5 r5 = new i.c.a.b.i.a.c5     // Catch:{ SQLiteException -> 0x0284 }
            i.c.a.b.i.a.t9 r6 = r1.f3858b     // Catch:{ SQLiteException -> 0x0284 }
            i.c.a.b.i.a.s5 r6 = r6.f3896i     // Catch:{ SQLiteException -> 0x0284 }
            r5.<init>(r6, r2)     // Catch:{ SQLiteException -> 0x0284 }
            java.lang.String r6 = r4.getString(r12)     // Catch:{ SQLiteException -> 0x0284 }
            r5.a((java.lang.String) r6)     // Catch:{ SQLiteException -> 0x0284 }
            java.lang.String r6 = r4.getString(r0)     // Catch:{ SQLiteException -> 0x0284 }
            r5.b((java.lang.String) r6)     // Catch:{ SQLiteException -> 0x0284 }
            r6 = 2
            java.lang.String r6 = r4.getString(r6)     // Catch:{ SQLiteException -> 0x0284 }
            r5.e((java.lang.String) r6)     // Catch:{ SQLiteException -> 0x0284 }
            r6 = 3
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x0284 }
            r5.g((long) r6)     // Catch:{ SQLiteException -> 0x0284 }
            r6 = 4
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x0284 }
            r5.a((long) r6)     // Catch:{ SQLiteException -> 0x0284 }
            r6 = 5
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x0284 }
            r5.b((long) r6)     // Catch:{ SQLiteException -> 0x0284 }
            r6 = 6
            java.lang.String r6 = r4.getString(r6)     // Catch:{ SQLiteException -> 0x0284 }
            r5.g((java.lang.String) r6)     // Catch:{ SQLiteException -> 0x0284 }
            r6 = 7
            java.lang.String r6 = r4.getString(r6)     // Catch:{ SQLiteException -> 0x0284 }
            r5.h((java.lang.String) r6)     // Catch:{ SQLiteException -> 0x0284 }
            r6 = 8
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x0284 }
            r5.d((long) r6)     // Catch:{ SQLiteException -> 0x0284 }
            r6 = 9
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x0284 }
            r5.e((long) r6)     // Catch:{ SQLiteException -> 0x0284 }
            r6 = 10
            boolean r7 = r4.isNull(r6)     // Catch:{ SQLiteException -> 0x0284 }
            if (r7 != 0) goto L_0x00d5
            int r6 = r4.getInt(r6)     // Catch:{ SQLiteException -> 0x0284 }
            if (r6 == 0) goto L_0x00d3
            goto L_0x00d5
        L_0x00d3:
            r6 = 0
            goto L_0x00d6
        L_0x00d5:
            r6 = 1
        L_0x00d6:
            r5.a((boolean) r6)     // Catch:{ SQLiteException -> 0x0284 }
            r6 = 11
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x0284 }
            i.c.a.b.i.a.s5 r8 = r5.a     // Catch:{ SQLiteException -> 0x0284 }
            i.c.a.b.i.a.m5 r8 = r8.k()     // Catch:{ SQLiteException -> 0x0284 }
            r8.c()     // Catch:{ SQLiteException -> 0x0284 }
            boolean r8 = r5.E     // Catch:{ SQLiteException -> 0x0284 }
            long r9 = r5.x     // Catch:{ SQLiteException -> 0x0284 }
            int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r11 == 0) goto L_0x00f2
            r9 = 1
            goto L_0x00f3
        L_0x00f2:
            r9 = 0
        L_0x00f3:
            r8 = r8 | r9
            r5.E = r8     // Catch:{ SQLiteException -> 0x0284 }
            r5.x = r6     // Catch:{ SQLiteException -> 0x0284 }
            r6 = 12
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x0284 }
            i.c.a.b.i.a.s5 r8 = r5.a     // Catch:{ SQLiteException -> 0x0284 }
            i.c.a.b.i.a.m5 r8 = r8.k()     // Catch:{ SQLiteException -> 0x0284 }
            r8.c()     // Catch:{ SQLiteException -> 0x0284 }
            boolean r8 = r5.E     // Catch:{ SQLiteException -> 0x0284 }
            long r9 = r5.y     // Catch:{ SQLiteException -> 0x0284 }
            int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r11 == 0) goto L_0x0111
            r9 = 1
            goto L_0x0112
        L_0x0111:
            r9 = 0
        L_0x0112:
            r8 = r8 | r9
            r5.E = r8     // Catch:{ SQLiteException -> 0x0284 }
            r5.y = r6     // Catch:{ SQLiteException -> 0x0284 }
            r6 = 13
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x0284 }
            i.c.a.b.i.a.s5 r8 = r5.a     // Catch:{ SQLiteException -> 0x0284 }
            i.c.a.b.i.a.m5 r8 = r8.k()     // Catch:{ SQLiteException -> 0x0284 }
            r8.c()     // Catch:{ SQLiteException -> 0x0284 }
            boolean r8 = r5.E     // Catch:{ SQLiteException -> 0x0284 }
            long r9 = r5.z     // Catch:{ SQLiteException -> 0x0284 }
            int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r11 == 0) goto L_0x0130
            r9 = 1
            goto L_0x0131
        L_0x0130:
            r9 = 0
        L_0x0131:
            r8 = r8 | r9
            r5.E = r8     // Catch:{ SQLiteException -> 0x0284 }
            r5.z = r6     // Catch:{ SQLiteException -> 0x0284 }
            r6 = 14
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x0284 }
            i.c.a.b.i.a.s5 r8 = r5.a     // Catch:{ SQLiteException -> 0x0284 }
            i.c.a.b.i.a.m5 r8 = r8.k()     // Catch:{ SQLiteException -> 0x0284 }
            r8.c()     // Catch:{ SQLiteException -> 0x0284 }
            boolean r8 = r5.E     // Catch:{ SQLiteException -> 0x0284 }
            long r9 = r5.A     // Catch:{ SQLiteException -> 0x0284 }
            int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r11 == 0) goto L_0x014f
            r9 = 1
            goto L_0x0150
        L_0x014f:
            r9 = 0
        L_0x0150:
            r8 = r8 | r9
            r5.E = r8     // Catch:{ SQLiteException -> 0x0284 }
            r5.A = r6     // Catch:{ SQLiteException -> 0x0284 }
            r6 = 15
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x0284 }
            r5.h((long) r6)     // Catch:{ SQLiteException -> 0x0284 }
            r6 = 16
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x0284 }
            r5.i((long) r6)     // Catch:{ SQLiteException -> 0x0284 }
            r6 = 17
            boolean r7 = r4.isNull(r6)     // Catch:{ SQLiteException -> 0x0284 }
            if (r7 == 0) goto L_0x0173
            r6 = -2147483648(0xffffffff80000000, double:NaN)
            goto L_0x0178
        L_0x0173:
            int r6 = r4.getInt(r6)     // Catch:{ SQLiteException -> 0x0284 }
            long r6 = (long) r6     // Catch:{ SQLiteException -> 0x0284 }
        L_0x0178:
            r5.c((long) r6)     // Catch:{ SQLiteException -> 0x0284 }
            r6 = 18
            java.lang.String r6 = r4.getString(r6)     // Catch:{ SQLiteException -> 0x0284 }
            r5.f((java.lang.String) r6)     // Catch:{ SQLiteException -> 0x0284 }
            r6 = 19
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x0284 }
            i.c.a.b.i.a.s5 r8 = r5.a     // Catch:{ SQLiteException -> 0x0284 }
            i.c.a.b.i.a.m5 r8 = r8.k()     // Catch:{ SQLiteException -> 0x0284 }
            r8.c()     // Catch:{ SQLiteException -> 0x0284 }
            boolean r8 = r5.E     // Catch:{ SQLiteException -> 0x0284 }
            long r9 = r5.B     // Catch:{ SQLiteException -> 0x0284 }
            int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r11 == 0) goto L_0x019d
            r9 = 1
            goto L_0x019e
        L_0x019d:
            r9 = 0
        L_0x019e:
            r8 = r8 | r9
            r5.E = r8     // Catch:{ SQLiteException -> 0x0284 }
            r5.B = r6     // Catch:{ SQLiteException -> 0x0284 }
            r6 = 20
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x0284 }
            i.c.a.b.i.a.s5 r8 = r5.a     // Catch:{ SQLiteException -> 0x0284 }
            i.c.a.b.i.a.m5 r8 = r8.k()     // Catch:{ SQLiteException -> 0x0284 }
            r8.c()     // Catch:{ SQLiteException -> 0x0284 }
            boolean r8 = r5.E     // Catch:{ SQLiteException -> 0x0284 }
            long r9 = r5.C     // Catch:{ SQLiteException -> 0x0284 }
            int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r11 == 0) goto L_0x01bc
            r9 = 1
            goto L_0x01bd
        L_0x01bc:
            r9 = 0
        L_0x01bd:
            r8 = r8 | r9
            r5.E = r8     // Catch:{ SQLiteException -> 0x0284 }
            r5.C = r6     // Catch:{ SQLiteException -> 0x0284 }
            r6 = 21
            java.lang.String r6 = r4.getString(r6)     // Catch:{ SQLiteException -> 0x0284 }
            r5.i((java.lang.String) r6)     // Catch:{ SQLiteException -> 0x0284 }
            i.c.a.b.i.a.s5 r6 = r1.a     // Catch:{ SQLiteException -> 0x0284 }
            i.c.a.b.i.a.pa r6 = r6.f3861g     // Catch:{ SQLiteException -> 0x0284 }
            i.c.a.b.i.a.f4<java.lang.Boolean> r7 = i.c.a.b.i.a.o.i1     // Catch:{ SQLiteException -> 0x0284 }
            boolean r6 = r6.a((i.c.a.b.i.a.f4<java.lang.Boolean>) r7)     // Catch:{ SQLiteException -> 0x0284 }
            r7 = 0
            if (r6 != 0) goto L_0x01ea
            r6 = 22
            boolean r9 = r4.isNull(r6)     // Catch:{ SQLiteException -> 0x0284 }
            if (r9 == 0) goto L_0x01e3
            r9 = r7
            goto L_0x01e7
        L_0x01e3:
            long r9 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x0284 }
        L_0x01e7:
            r5.j(r9)     // Catch:{ SQLiteException -> 0x0284 }
        L_0x01ea:
            r6 = 23
            boolean r9 = r4.isNull(r6)     // Catch:{ SQLiteException -> 0x0284 }
            if (r9 != 0) goto L_0x01fb
            int r6 = r4.getInt(r6)     // Catch:{ SQLiteException -> 0x0284 }
            if (r6 == 0) goto L_0x01f9
            goto L_0x01fb
        L_0x01f9:
            r6 = 0
            goto L_0x01fc
        L_0x01fb:
            r6 = 1
        L_0x01fc:
            r5.b((boolean) r6)     // Catch:{ SQLiteException -> 0x0284 }
            r6 = 24
            boolean r9 = r4.isNull(r6)     // Catch:{ SQLiteException -> 0x0284 }
            if (r9 != 0) goto L_0x020f
            int r6 = r4.getInt(r6)     // Catch:{ SQLiteException -> 0x0284 }
            if (r6 == 0) goto L_0x020e
            goto L_0x020f
        L_0x020e:
            r0 = 0
        L_0x020f:
            r5.c((boolean) r0)     // Catch:{ SQLiteException -> 0x0284 }
            r0 = 25
            java.lang.String r0 = r4.getString(r0)     // Catch:{ SQLiteException -> 0x0284 }
            r5.c((java.lang.String) r0)     // Catch:{ SQLiteException -> 0x0284 }
            r0 = 26
            boolean r6 = r4.isNull(r0)     // Catch:{ SQLiteException -> 0x0284 }
            if (r6 == 0) goto L_0x0224
            goto L_0x0228
        L_0x0224:
            long r7 = r4.getLong(r0)     // Catch:{ SQLiteException -> 0x0284 }
        L_0x0228:
            r5.f((long) r7)     // Catch:{ SQLiteException -> 0x0284 }
            r0 = 27
            boolean r6 = r4.isNull(r0)     // Catch:{ SQLiteException -> 0x0284 }
            if (r6 != 0) goto L_0x0245
            java.lang.String r0 = r4.getString(r0)     // Catch:{ SQLiteException -> 0x0284 }
            java.lang.String r6 = ","
            r7 = -1
            java.lang.String[] r0 = r0.split(r6, r7)     // Catch:{ SQLiteException -> 0x0284 }
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch:{ SQLiteException -> 0x0284 }
            r5.a((java.util.List<java.lang.String>) r0)     // Catch:{ SQLiteException -> 0x0284 }
        L_0x0245:
            boolean r0 = i.c.a.b.g.g.x9.b()     // Catch:{ SQLiteException -> 0x0284 }
            if (r0 == 0) goto L_0x0260
            i.c.a.b.i.a.s5 r0 = r1.a     // Catch:{ SQLiteException -> 0x0284 }
            i.c.a.b.i.a.pa r0 = r0.f3861g     // Catch:{ SQLiteException -> 0x0284 }
            i.c.a.b.i.a.f4<java.lang.Boolean> r6 = i.c.a.b.i.a.o.I0     // Catch:{ SQLiteException -> 0x0284 }
            boolean r0 = r0.d(r2, r6)     // Catch:{ SQLiteException -> 0x0284 }
            if (r0 == 0) goto L_0x0260
            r0 = 28
            java.lang.String r0 = r4.getString(r0)     // Catch:{ SQLiteException -> 0x0284 }
            r5.d((java.lang.String) r0)     // Catch:{ SQLiteException -> 0x0284 }
        L_0x0260:
            i.c.a.b.i.a.s5 r0 = r5.a     // Catch:{ SQLiteException -> 0x0284 }
            i.c.a.b.i.a.m5 r0 = r0.k()     // Catch:{ SQLiteException -> 0x0284 }
            r0.c()     // Catch:{ SQLiteException -> 0x0284 }
            r5.E = r12     // Catch:{ SQLiteException -> 0x0284 }
            boolean r0 = r4.moveToNext()     // Catch:{ SQLiteException -> 0x0284 }
            if (r0 == 0) goto L_0x0280
            i.c.a.b.i.a.m4 r0 = r35.n()     // Catch:{ SQLiteException -> 0x0284 }
            i.c.a.b.i.a.o4 r0 = r0.f3758f     // Catch:{ SQLiteException -> 0x0284 }
            java.lang.String r6 = "Got multiple records for app, expected one. appId"
            java.lang.Object r7 = i.c.a.b.i.a.m4.a((java.lang.String) r36)     // Catch:{ SQLiteException -> 0x0284 }
            r0.a(r6, r7)     // Catch:{ SQLiteException -> 0x0284 }
        L_0x0280:
            r4.close()
            return r5
        L_0x0284:
            r0 = move-exception
            goto L_0x028a
        L_0x0286:
            r0 = move-exception
            goto L_0x02a1
        L_0x0288:
            r0 = move-exception
            r4 = r3
        L_0x028a:
            i.c.a.b.i.a.m4 r5 = r35.n()     // Catch:{ all -> 0x029f }
            i.c.a.b.i.a.o4 r5 = r5.f3758f     // Catch:{ all -> 0x029f }
            java.lang.String r6 = "Error querying app. appId"
            java.lang.Object r2 = i.c.a.b.i.a.m4.a((java.lang.String) r36)     // Catch:{ all -> 0x029f }
            r5.a(r6, r2, r0)     // Catch:{ all -> 0x029f }
            if (r4 == 0) goto L_0x029e
            r4.close()
        L_0x029e:
            return r3
        L_0x029f:
            r0 = move-exception
            r3 = r4
        L_0x02a1:
            if (r3 == 0) goto L_0x02a6
            r3.close()
        L_0x02a6:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.a.b.i.a.d.b(java.lang.String):i.c.a.b.i.a.c5");
    }

    public final boolean a(da daVar) {
        q.a(daVar);
        c();
        m();
        if (c(daVar.a, daVar.c) == null) {
            if (ca.h(daVar.c)) {
                long b2 = b("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{daVar.a});
                pa paVar = this.a.f3861g;
                String str = daVar.a;
                if (paVar != null) {
                    int i2 = 25;
                    if (t7.b() && paVar.d((String) null, o.g1)) {
                        i2 = Math.max(Math.min(paVar.b(str, o.G), 100), 25);
                    }
                    if (b2 >= ((long) i2)) {
                        return false;
                    }
                } else {
                    throw null;
                }
            } else if (!this.a.f3861g.d(daVar.a, o.e0)) {
                if (b("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{daVar.a, daVar.f3643b}) >= 25) {
                    return false;
                }
            } else if (!"_npa".equals(daVar.c)) {
                if (b("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{daVar.a, daVar.f3643b}) >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", daVar.a);
        contentValues.put("origin", daVar.f3643b);
        contentValues.put(DefaultAppMeasurementEventListenerRegistrar.NAME, daVar.c);
        contentValues.put("set_timestamp", Long.valueOf(daVar.d));
        a(contentValues, "value", daVar.e);
        try {
            if (u().insertWithOnConflict("user_attributes", (String) null, contentValues, 5) == -1) {
                n().f3758f.a("Failed to insert/update user property (got -1). appId", m4.a(daVar.a));
            }
        } catch (SQLiteException e2) {
            n().f3758f.a("Error storing user property. appId", m4.a(daVar.a), e2);
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0099  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<i.c.a.b.i.a.da> a(java.lang.String r14) {
        /*
            r13 = this;
            i.c.a.b.d.l.q.b((java.lang.String) r14)
            r13.c()
            r13.m()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r13.u()     // Catch:{ SQLiteException -> 0x007e, all -> 0x007c }
            java.lang.String r3 = "user_attributes"
            java.lang.String r4 = "name"
            java.lang.String r5 = "origin"
            java.lang.String r6 = "set_timestamp"
            java.lang.String r7 = "value"
            java.lang.String[] r4 = new java.lang.String[]{r4, r5, r6, r7}     // Catch:{ SQLiteException -> 0x007e, all -> 0x007c }
            java.lang.String r5 = "app_id=?"
            r11 = 1
            java.lang.String[] r6 = new java.lang.String[r11]     // Catch:{ SQLiteException -> 0x007e, all -> 0x007c }
            r12 = 0
            r6[r12] = r14     // Catch:{ SQLiteException -> 0x007e, all -> 0x007c }
            r7 = 0
            r8 = 0
            java.lang.String r9 = "rowid"
            java.lang.String r10 = "1000"
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ SQLiteException -> 0x007e, all -> 0x007c }
            boolean r3 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x007a }
            if (r3 != 0) goto L_0x003d
            r2.close()
            return r0
        L_0x003d:
            java.lang.String r7 = r2.getString(r12)     // Catch:{ SQLiteException -> 0x007a }
            java.lang.String r3 = r2.getString(r11)     // Catch:{ SQLiteException -> 0x007a }
            if (r3 != 0) goto L_0x0049
            java.lang.String r3 = ""
        L_0x0049:
            r6 = r3
            r3 = 2
            long r8 = r2.getLong(r3)     // Catch:{ SQLiteException -> 0x007a }
            r3 = 3
            java.lang.Object r10 = r13.a((android.database.Cursor) r2, (int) r3)     // Catch:{ SQLiteException -> 0x007a }
            if (r10 != 0) goto L_0x0066
            i.c.a.b.i.a.m4 r3 = r13.n()     // Catch:{ SQLiteException -> 0x007a }
            i.c.a.b.i.a.o4 r3 = r3.f3758f     // Catch:{ SQLiteException -> 0x007a }
            java.lang.String r4 = "Read invalid user property value, ignoring it. appId"
            java.lang.Object r5 = i.c.a.b.i.a.m4.a((java.lang.String) r14)     // Catch:{ SQLiteException -> 0x007a }
            r3.a(r4, r5)     // Catch:{ SQLiteException -> 0x007a }
            goto L_0x0070
        L_0x0066:
            i.c.a.b.i.a.da r3 = new i.c.a.b.i.a.da     // Catch:{ SQLiteException -> 0x007a }
            r4 = r3
            r5 = r14
            r4.<init>(r5, r6, r7, r8, r10)     // Catch:{ SQLiteException -> 0x007a }
            r0.add(r3)     // Catch:{ SQLiteException -> 0x007a }
        L_0x0070:
            boolean r3 = r2.moveToNext()     // Catch:{ SQLiteException -> 0x007a }
            if (r3 != 0) goto L_0x003d
            r2.close()
            return r0
        L_0x007a:
            r0 = move-exception
            goto L_0x0080
        L_0x007c:
            r14 = move-exception
            goto L_0x0097
        L_0x007e:
            r0 = move-exception
            r2 = r1
        L_0x0080:
            i.c.a.b.i.a.m4 r3 = r13.n()     // Catch:{ all -> 0x0095 }
            i.c.a.b.i.a.o4 r3 = r3.f3758f     // Catch:{ all -> 0x0095 }
            java.lang.String r4 = "Error querying user properties. appId"
            java.lang.Object r14 = i.c.a.b.i.a.m4.a((java.lang.String) r14)     // Catch:{ all -> 0x0095 }
            r3.a(r4, r14, r0)     // Catch:{ all -> 0x0095 }
            if (r2 == 0) goto L_0x0094
            r2.close()
        L_0x0094:
            return r1
        L_0x0095:
            r14 = move-exception
            r1 = r2
        L_0x0097:
            if (r1 == 0) goto L_0x009c
            r1.close()
        L_0x009c:
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.a.b.i.a.d.a(java.lang.String):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00f0, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f1, code lost:
        r12 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00f8, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00f9, code lost:
        r12 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00fc, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00fd, code lost:
        r12 = r21;
        r11 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x011d, code lost:
        r1.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00f8 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:1:0x000f] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x011d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<i.c.a.b.i.a.da> a(java.lang.String r22, java.lang.String r23, java.lang.String r24) {
        /*
            r21 = this;
            i.c.a.b.d.l.q.b((java.lang.String) r22)
            r21.c()
            r21.m()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x00fc, all -> 0x00f8 }
            r3 = 3
            r2.<init>(r3)     // Catch:{ SQLiteException -> 0x00fc, all -> 0x00f8 }
            r11 = r22
            r2.add(r11)     // Catch:{ SQLiteException -> 0x00f4, all -> 0x00f8 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x00f4, all -> 0x00f8 }
            java.lang.String r5 = "app_id=?"
            r4.<init>(r5)     // Catch:{ SQLiteException -> 0x00f4, all -> 0x00f8 }
            boolean r5 = android.text.TextUtils.isEmpty(r23)     // Catch:{ SQLiteException -> 0x00f4, all -> 0x00f8 }
            if (r5 != 0) goto L_0x0032
            r5 = r23
            r2.add(r5)     // Catch:{ SQLiteException -> 0x00f0, all -> 0x00f8 }
            java.lang.String r6 = " and origin=?"
            r4.append(r6)     // Catch:{ SQLiteException -> 0x00f0, all -> 0x00f8 }
            goto L_0x0034
        L_0x0032:
            r5 = r23
        L_0x0034:
            boolean r6 = android.text.TextUtils.isEmpty(r24)     // Catch:{ SQLiteException -> 0x00f0, all -> 0x00f8 }
            if (r6 != 0) goto L_0x004c
            java.lang.String r6 = java.lang.String.valueOf(r24)     // Catch:{ SQLiteException -> 0x00f0, all -> 0x00f8 }
            java.lang.String r7 = "*"
            java.lang.String r6 = r6.concat(r7)     // Catch:{ SQLiteException -> 0x00f0, all -> 0x00f8 }
            r2.add(r6)     // Catch:{ SQLiteException -> 0x00f0, all -> 0x00f8 }
            java.lang.String r6 = " and name glob ?"
            r4.append(r6)     // Catch:{ SQLiteException -> 0x00f0, all -> 0x00f8 }
        L_0x004c:
            int r6 = r2.size()     // Catch:{ SQLiteException -> 0x00f0, all -> 0x00f8 }
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ SQLiteException -> 0x00f0, all -> 0x00f8 }
            java.lang.Object[] r2 = r2.toArray(r6)     // Catch:{ SQLiteException -> 0x00f0, all -> 0x00f8 }
            r16 = r2
            java.lang.String[] r16 = (java.lang.String[]) r16     // Catch:{ SQLiteException -> 0x00f0, all -> 0x00f8 }
            android.database.sqlite.SQLiteDatabase r12 = r21.u()     // Catch:{ SQLiteException -> 0x00f0, all -> 0x00f8 }
            java.lang.String r13 = "user_attributes"
            java.lang.String r2 = "name"
            java.lang.String r6 = "set_timestamp"
            java.lang.String r7 = "value"
            java.lang.String r8 = "origin"
            java.lang.String[] r14 = new java.lang.String[]{r2, r6, r7, r8}     // Catch:{ SQLiteException -> 0x00f0, all -> 0x00f8 }
            java.lang.String r15 = r4.toString()     // Catch:{ SQLiteException -> 0x00f0, all -> 0x00f8 }
            r17 = 0
            r18 = 0
            java.lang.String r19 = "rowid"
            java.lang.String r20 = "1001"
            android.database.Cursor r2 = r12.query(r13, r14, r15, r16, r17, r18, r19, r20)     // Catch:{ SQLiteException -> 0x00f0, all -> 0x00f8 }
            boolean r4 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x00ec, all -> 0x00e8 }
            if (r4 != 0) goto L_0x0086
            r2.close()
            return r0
        L_0x0086:
            int r4 = r0.size()     // Catch:{ SQLiteException -> 0x00ec, all -> 0x00e8 }
            r6 = 1000(0x3e8, float:1.401E-42)
            if (r4 < r6) goto L_0x00a0
            i.c.a.b.i.a.m4 r3 = r21.n()     // Catch:{ SQLiteException -> 0x00ec, all -> 0x00e8 }
            i.c.a.b.i.a.o4 r3 = r3.f3758f     // Catch:{ SQLiteException -> 0x00ec, all -> 0x00e8 }
            java.lang.String r4 = "Read more than the max allowed user properties, ignoring excess"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ SQLiteException -> 0x00ec, all -> 0x00e8 }
            r3.a(r4, r6)     // Catch:{ SQLiteException -> 0x00ec, all -> 0x00e8 }
            r12 = r21
            goto L_0x00dd
        L_0x00a0:
            r4 = 0
            java.lang.String r7 = r2.getString(r4)     // Catch:{ SQLiteException -> 0x00ec, all -> 0x00e8 }
            r4 = 1
            long r8 = r2.getLong(r4)     // Catch:{ SQLiteException -> 0x00ec, all -> 0x00e8 }
            r4 = 2
            r12 = r21
            java.lang.Object r10 = r12.a((android.database.Cursor) r2, (int) r4)     // Catch:{ SQLiteException -> 0x00e6 }
            java.lang.String r13 = r2.getString(r3)     // Catch:{ SQLiteException -> 0x00e6 }
            if (r10 != 0) goto L_0x00c9
            i.c.a.b.i.a.m4 r4 = r21.n()     // Catch:{ SQLiteException -> 0x00e3 }
            i.c.a.b.i.a.o4 r4 = r4.f3758f     // Catch:{ SQLiteException -> 0x00e3 }
            java.lang.String r5 = "(2)Read invalid user property value, ignoring it"
            java.lang.Object r6 = i.c.a.b.i.a.m4.a((java.lang.String) r22)     // Catch:{ SQLiteException -> 0x00e3 }
            r14 = r24
            r4.a(r5, r6, r13, r14)     // Catch:{ SQLiteException -> 0x00e3 }
            goto L_0x00d7
        L_0x00c9:
            r14 = r24
            i.c.a.b.i.a.da r15 = new i.c.a.b.i.a.da     // Catch:{ SQLiteException -> 0x00e3 }
            r4 = r15
            r5 = r22
            r6 = r13
            r4.<init>(r5, r6, r7, r8, r10)     // Catch:{ SQLiteException -> 0x00e3 }
            r0.add(r15)     // Catch:{ SQLiteException -> 0x00e3 }
        L_0x00d7:
            boolean r4 = r2.moveToNext()     // Catch:{ SQLiteException -> 0x00e3 }
            if (r4 != 0) goto L_0x00e1
        L_0x00dd:
            r2.close()
            return r0
        L_0x00e1:
            r5 = r13
            goto L_0x0086
        L_0x00e3:
            r0 = move-exception
            r5 = r13
            goto L_0x0104
        L_0x00e6:
            r0 = move-exception
            goto L_0x0104
        L_0x00e8:
            r0 = move-exception
            r12 = r21
            goto L_0x011a
        L_0x00ec:
            r0 = move-exception
            r12 = r21
            goto L_0x0104
        L_0x00f0:
            r0 = move-exception
            r12 = r21
            goto L_0x0103
        L_0x00f4:
            r0 = move-exception
            r12 = r21
            goto L_0x0101
        L_0x00f8:
            r0 = move-exception
            r12 = r21
            goto L_0x011b
        L_0x00fc:
            r0 = move-exception
            r12 = r21
            r11 = r22
        L_0x0101:
            r5 = r23
        L_0x0103:
            r2 = r1
        L_0x0104:
            i.c.a.b.i.a.m4 r3 = r21.n()     // Catch:{ all -> 0x0119 }
            i.c.a.b.i.a.o4 r3 = r3.f3758f     // Catch:{ all -> 0x0119 }
            java.lang.String r4 = "(2)Error querying user properties"
            java.lang.Object r6 = i.c.a.b.i.a.m4.a((java.lang.String) r22)     // Catch:{ all -> 0x0119 }
            r3.a(r4, r6, r5, r0)     // Catch:{ all -> 0x0119 }
            if (r2 == 0) goto L_0x0118
            r2.close()
        L_0x0118:
            return r1
        L_0x0119:
            r0 = move-exception
        L_0x011a:
            r1 = r2
        L_0x011b:
            if (r1 == 0) goto L_0x0120
            r1.close()
        L_0x0120:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.a.b.i.a.d.a(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    public final boolean a(na naVar) {
        q.a(naVar);
        c();
        m();
        if (c(naVar.e, naVar.f3792g.f3586f) == null) {
            if (b("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{naVar.e}) >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", naVar.e);
        contentValues.put("origin", naVar.f3791f);
        contentValues.put(DefaultAppMeasurementEventListenerRegistrar.NAME, naVar.f3792g.f3586f);
        a(contentValues, "value", naVar.f3792g.a());
        contentValues.put("active", Boolean.valueOf(naVar.f3794i));
        contentValues.put("trigger_event_name", naVar.f3795j);
        contentValues.put("trigger_timeout", Long.valueOf(naVar.f3797l));
        f();
        contentValues.put("timed_out_event", ca.a((Parcelable) naVar.f3796k));
        contentValues.put("creation_timestamp", Long.valueOf(naVar.f3793h));
        f();
        contentValues.put("triggered_event", ca.a((Parcelable) naVar.f3798m));
        contentValues.put("triggered_timestamp", Long.valueOf(naVar.f3792g.f3587g));
        contentValues.put("time_to_live", Long.valueOf(naVar.f3799n));
        f();
        contentValues.put("expired_event", ca.a((Parcelable) naVar.f3800o));
        try {
            if (u().insertWithOnConflict("conditional_properties", (String) null, contentValues, 5) == -1) {
                n().f3758f.a("Failed to insert/update conditional user property (got -1)", m4.a(naVar.e));
            }
        } catch (SQLiteException e2) {
            n().f3758f.a("Error storing conditional user property", m4.a(naVar.e), e2);
        }
        return true;
    }

    public final List<na> a(String str, String[] strArr) {
        c();
        m();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            cursor = u().query("conditional_properties", new String[]{"app_id", "origin", DefaultAppMeasurementEventListenerRegistrar.NAME, "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, str, strArr, (String) null, (String) null, "rowid", "1001");
            if (!cursor.moveToFirst()) {
                cursor.close();
                return arrayList;
            }
            while (true) {
                if (arrayList.size() < 1000) {
                    boolean z = false;
                    String string = cursor.getString(0);
                    String string2 = cursor.getString(1);
                    String string3 = cursor.getString(2);
                    Object a = a(cursor, 3);
                    if (cursor.getInt(4) != 0) {
                        z = true;
                    }
                    String string4 = cursor.getString(5);
                    long j2 = cursor.getLong(6);
                    long j3 = cursor.getLong(8);
                    long j4 = cursor.getLong(10);
                    boolean z2 = z;
                    na naVar = r3;
                    na naVar2 = new na(string, string2, new aa(string3, j4, a, string2), j3, z2, string4, (m) q().a(cursor.getBlob(7), m.CREATOR), j2, (m) q().a(cursor.getBlob(9), m.CREATOR), cursor.getLong(11), (m) q().a(cursor.getBlob(12), m.CREATOR));
                    arrayList.add(naVar);
                    if (!cursor.moveToNext()) {
                        break;
                    }
                } else {
                    n().f3758f.a("Read more than the max allowed conditional properties, ignoring extra", Integer.valueOf(AnswersRetryFilesSender.BACKOFF_MS));
                    break;
                }
            }
            cursor.close();
            return arrayList;
        } catch (SQLiteException e2) {
            n().f3758f.a("Error querying conditional user property value", e2);
            List<na> emptyList = Collections.emptyList();
            if (cursor != null) {
                cursor.close();
            }
            return emptyList;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final void a(c5 c5Var) {
        q.a(c5Var);
        c();
        m();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", c5Var.g());
        contentValues.put("app_instance_id", c5Var.h());
        contentValues.put("gmp_app_id", c5Var.i());
        contentValues.put("resettable_device_id_hash", c5Var.l());
        contentValues.put("last_bundle_index", Long.valueOf(c5Var.w()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(c5Var.n()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(c5Var.o()));
        contentValues.put("app_version", c5Var.p());
        contentValues.put("app_store", c5Var.r());
        contentValues.put("gmp_version", Long.valueOf(c5Var.s()));
        contentValues.put("dev_cert_hash", Long.valueOf(c5Var.t()));
        contentValues.put("measurement_enabled", Boolean.valueOf(c5Var.v()));
        c5Var.a.k().c();
        contentValues.put("day", Long.valueOf(c5Var.x));
        c5Var.a.k().c();
        contentValues.put("daily_public_events_count", Long.valueOf(c5Var.y));
        c5Var.a.k().c();
        contentValues.put("daily_events_count", Long.valueOf(c5Var.z));
        c5Var.a.k().c();
        contentValues.put("daily_conversions_count", Long.valueOf(c5Var.A));
        c5Var.a.k().c();
        contentValues.put("config_fetched_time", Long.valueOf(c5Var.F));
        c5Var.a.k().c();
        contentValues.put("failed_config_fetch_time", Long.valueOf(c5Var.G));
        contentValues.put("app_version_int", Long.valueOf(c5Var.q()));
        contentValues.put("firebase_instance_id", c5Var.m());
        c5Var.a.k().c();
        contentValues.put("daily_error_events_count", Long.valueOf(c5Var.B));
        c5Var.a.k().c();
        contentValues.put("daily_realtime_events_count", Long.valueOf(c5Var.C));
        c5Var.a.k().c();
        contentValues.put("health_monitor_sample", c5Var.D);
        contentValues.put("android_id", Long.valueOf(c5Var.b()));
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(c5Var.c()));
        contentValues.put("ssaid_reporting_enabled", Boolean.valueOf(c5Var.d()));
        contentValues.put("admob_app_id", c5Var.j());
        contentValues.put("dynamite_version", Long.valueOf(c5Var.u()));
        if (c5Var.f() != null) {
            if (c5Var.f().size() == 0) {
                n().f3761i.a("Safelisted events should not be an empty list. appId", c5Var.g());
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", c5Var.f()));
            }
        }
        if (x9.b() && this.a.f3861g.d(c5Var.g(), o.I0)) {
            contentValues.put("ga_app_id", c5Var.k());
        }
        try {
            SQLiteDatabase u = u();
            if (((long) u.update("apps", contentValues, "app_id = ?", new String[]{c5Var.g()})) == 0 && u.insertWithOnConflict("apps", (String) null, contentValues, 5) == -1) {
                n().f3758f.a("Failed to insert/update app (got -1). appId", m4.a(c5Var.g()));
            }
        } catch (SQLiteException e2) {
            n().f3758f.a("Error storing app. appId", m4.a(c5Var.g()), e2);
        }
    }

    public final c a(long j2, String str, boolean z, boolean z2) {
        return a(j2, str, 1, false, false, z, false, z2);
    }

    public final c a(long j2, String str, long j3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        q.b(str);
        c();
        m();
        String[] strArr = {str};
        c cVar = new c();
        Cursor cursor = null;
        try {
            SQLiteDatabase u = u();
            cursor = u.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new String[]{str}, (String) null, (String) null, (String) null);
            if (!cursor.moveToFirst()) {
                n().f3761i.a("Not updating daily counts, app is not known. appId", m4.a(str));
                cursor.close();
                return cVar;
            }
            if (cursor.getLong(0) == j2) {
                cVar.f3605b = cursor.getLong(1);
                cVar.a = cursor.getLong(2);
                cVar.c = cursor.getLong(3);
                cVar.d = cursor.getLong(4);
                cVar.e = cursor.getLong(5);
            }
            if (z) {
                cVar.f3605b += j3;
            }
            if (z2) {
                cVar.a += j3;
            }
            if (z3) {
                cVar.c += j3;
            }
            if (z4) {
                cVar.d += j3;
            }
            if (z5) {
                cVar.e += j3;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("day", Long.valueOf(j2));
            contentValues.put("daily_public_events_count", Long.valueOf(cVar.a));
            contentValues.put("daily_events_count", Long.valueOf(cVar.f3605b));
            contentValues.put("daily_conversions_count", Long.valueOf(cVar.c));
            contentValues.put("daily_error_events_count", Long.valueOf(cVar.d));
            contentValues.put("daily_realtime_events_count", Long.valueOf(cVar.e));
            u.update("apps", contentValues, "app_id=?", strArr);
            cursor.close();
            return cVar;
        } catch (SQLiteException e2) {
            n().f3758f.a("Error updating daily counts. appId", m4.a(str), e2);
            if (cursor != null) {
                cursor.close();
            }
            return cVar;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final boolean a(t0 t0Var, boolean z) {
        c();
        m();
        q.a(t0Var);
        q.b(t0Var.zzs);
        q.b((t0Var.zzc & 8) != 0);
        A();
        if (((c) this.a.f3868n) != null) {
            long currentTimeMillis = System.currentTimeMillis();
            if (t0Var.zzj < currentTimeMillis - pa.v() || t0Var.zzj > pa.v() + currentTimeMillis) {
                n().f3761i.a("Storing bundle outside of the max uploading time span. appId, now, timestamp", m4.a(t0Var.zzs), Long.valueOf(currentTimeMillis), Long.valueOf(t0Var.zzj));
            }
            try {
                byte[] c = q().c(t0Var.f());
                n().f3766n.a("Saving bundle, size", Integer.valueOf(c.length));
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_id", t0Var.zzs);
                contentValues.put("bundle_end_timestamp", Long.valueOf(t0Var.zzj));
                contentValues.put("data", c);
                contentValues.put("has_realtime", Integer.valueOf(z ? 1 : 0));
                if ((t0Var.zzd & 2) != 0) {
                    contentValues.put("retry_count", Integer.valueOf(t0Var.zzao));
                }
                try {
                    if (u().insert("queue", (String) null, contentValues) != -1) {
                        return true;
                    }
                    n().f3758f.a("Failed to insert bundle (got -1). appId", m4.a(t0Var.zzs));
                    return false;
                } catch (SQLiteException e2) {
                    n().f3758f.a("Error storing bundle. appId", m4.a(t0Var.zzs), e2);
                    return false;
                }
            } catch (IOException e3) {
                n().f3758f.a("Data loss. Failed to serialize bundle. appId", m4.a(t0Var.zzs), e3);
                return false;
            }
        } else {
            throw null;
        }
    }

    public final List<Pair<t0, Long>> a(String str, int i2, int i3) {
        c();
        m();
        q.a(i2 > 0);
        q.a(i3 > 0);
        q.b(str);
        Cursor cursor = null;
        try {
            cursor = u().query("queue", new String[]{"rowid", "data", "retry_count"}, "app_id=?", new String[]{str}, (String) null, (String) null, "rowid", String.valueOf(i2));
            if (!cursor.moveToFirst()) {
                List<Pair<t0, Long>> emptyList = Collections.emptyList();
                cursor.close();
                return emptyList;
            }
            ArrayList arrayList = new ArrayList();
            int i4 = 0;
            do {
                long j2 = cursor.getLong(0);
                try {
                    byte[] b2 = q().b(cursor.getBlob(1));
                    if (!arrayList.isEmpty() && b2.length + i4 > i3) {
                        break;
                    }
                    try {
                        t0.a aVar = (t0.a) x9.a(t0.o(), b2);
                        if (!cursor.isNull(2)) {
                            aVar.h(cursor.getInt(2));
                        }
                        i4 += b2.length;
                        arrayList.add(Pair.create((t0) ((w3) aVar.k()), Long.valueOf(j2)));
                    } catch (IOException e2) {
                        n().f3758f.a("Failed to merge queued bundle. appId", m4.a(str), e2);
                    }
                    if (!cursor.moveToNext()) {
                        break;
                    }
                } catch (IOException e3) {
                    n().f3758f.a("Failed to unzip queued bundle. appId", m4.a(str), e3);
                }
            } while (i4 <= i3);
            cursor.close();
            return arrayList;
        } catch (SQLiteException e4) {
            n().f3758f.a("Error querying bundles. appId", m4.a(str), e4);
            List<Pair<t0, Long>> emptyList2 = Collections.emptyList();
            if (cursor != null) {
                cursor.close();
            }
            return emptyList2;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final void a(List<Long> list) {
        c();
        m();
        q.a(list);
        if (list.size() == 0) {
            throw new IllegalArgumentException("Given Integer is zero");
        } else if (x()) {
            String join = TextUtils.join(",", list);
            String a = a.a(a.a(join, 2), "(", join, ")");
            if (b(a.a(a.a(a, 80), "SELECT COUNT(1) FROM queue WHERE rowid IN ", a, " AND retry_count =  2147483647 LIMIT 1"), (String[]) null) > 0) {
                n().f3761i.a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase u = u();
                StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 127);
                sb.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb.append(a);
                sb.append(" AND (retry_count IS NULL OR retry_count < 2147483647)");
                u.execSQL(sb.toString());
            } catch (SQLiteException e2) {
                n().f3758f.a("Error incrementing retry count. error", e2);
            }
        }
    }

    public final boolean a(String str, int i2, b0 b0Var) {
        m();
        c();
        q.b(str);
        q.a(b0Var);
        Integer num = null;
        if (TextUtils.isEmpty(b0Var.zze)) {
            o4 o4Var = n().f3761i;
            Object a = m4.a(str);
            Integer valueOf = Integer.valueOf(i2);
            if (b0Var.a()) {
                num = Integer.valueOf(b0Var.zzd);
            }
            o4Var.a("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", a, valueOf, String.valueOf(num));
            return false;
        }
        byte[] f2 = b0Var.f();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i2));
        contentValues.put("filter_id", b0Var.a() ? Integer.valueOf(b0Var.zzd) : null);
        contentValues.put("event_name", b0Var.zze);
        if (this.a.f3861g.d(str, o.n0)) {
            contentValues.put("session_scoped", (b0Var.zzc & 64) != 0 ? Boolean.valueOf(b0Var.zzk) : null);
        }
        contentValues.put("data", f2);
        try {
            if (u().insertWithOnConflict("event_filters", (String) null, contentValues, 5) == -1) {
                n().f3758f.a("Failed to insert event filter (got -1). appId", m4.a(str));
            }
            return true;
        } catch (SQLiteException e2) {
            n().f3758f.a("Error storing event filter. appId", m4.a(str), e2);
            return false;
        }
    }

    public final boolean a(String str, int i2, e0 e0Var) {
        m();
        c();
        q.b(str);
        q.a(e0Var);
        Integer num = null;
        if (TextUtils.isEmpty(e0Var.zze)) {
            o4 o4Var = n().f3761i;
            Object a = m4.a(str);
            Integer valueOf = Integer.valueOf(i2);
            if (e0Var.a()) {
                num = Integer.valueOf(e0Var.zzd);
            }
            o4Var.a("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", a, valueOf, String.valueOf(num));
            return false;
        }
        byte[] f2 = e0Var.f();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i2));
        contentValues.put("filter_id", e0Var.a() ? Integer.valueOf(e0Var.zzd) : null);
        contentValues.put("property_name", e0Var.zze);
        if (this.a.f3861g.d(str, o.n0)) {
            contentValues.put("session_scoped", (e0Var.zzc & 32) != 0 ? Boolean.valueOf(e0Var.zzi) : null);
        }
        contentValues.put("data", f2);
        try {
            if (u().insertWithOnConflict("property_filters", (String) null, contentValues, 5) != -1) {
                return true;
            }
            n().f3758f.a("Failed to insert property filter (got -1). appId", m4.a(str));
            return false;
        } catch (SQLiteException e2) {
            n().f3758f.a("Error storing property filter. appId", m4.a(str), e2);
            return false;
        }
    }

    public final boolean a(String str, List<Integer> list) {
        q.b(str);
        m();
        c();
        SQLiteDatabase u = u();
        try {
            long b2 = b("select count(1) from audience_filter_values where app_id=?", new String[]{str});
            int max = Math.max(0, Math.min(RecyclerView.MAX_SCROLL_DURATION, this.a.f3861g.b(str, o.F)));
            if (b2 <= ((long) max)) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < list.size(); i2++) {
                Integer num = list.get(i2);
                if (num == null) {
                    return false;
                }
                arrayList.add(Integer.toString(num.intValue()));
            }
            String join = TextUtils.join(",", arrayList);
            String a = a.a(a.a(join, 2), "(", join, ")");
            return u.delete("audience_filter_values", a.a(a.a(a, 140), "audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ", a, " order by rowid desc limit -1 offset ?)"), new String[]{str, Integer.toString(max)}) > 0;
        } catch (SQLiteException e2) {
            n().f3758f.a("Database error querying filters. appId", m4.a(str), e2);
            return false;
        }
    }

    public static void a(ContentValues contentValues, String str, Object obj) {
        q.b(str);
        q.a(obj);
        if (obj instanceof String) {
            contentValues.put(str, (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put(str, (Long) obj);
        } else if (obj instanceof Double) {
            contentValues.put(str, (Double) obj);
        } else {
            throw new IllegalArgumentException("Invalid value type");
        }
    }

    public final Object a(Cursor cursor, int i2) {
        int type = cursor.getType(i2);
        if (type == 0) {
            n().f3758f.a("Loaded invalid null value from database");
            return null;
        } else if (type == 1) {
            return Long.valueOf(cursor.getLong(i2));
        } else {
            if (type == 2) {
                return Double.valueOf(cursor.getDouble(i2));
            }
            if (type == 3) {
                return cursor.getString(i2);
            }
            if (type != 4) {
                n().f3758f.a("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
                return null;
            }
            n().f3758f.a("Loaded invalid blob type value, ignoring it");
            return null;
        }
    }

    public final long a(t0 t0Var) {
        c();
        m();
        q.a(t0Var);
        q.b(t0Var.zzs);
        byte[] f2 = t0Var.f();
        long a = q().a(f2);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", t0Var.zzs);
        contentValues.put("metadata_fingerprint", Long.valueOf(a));
        contentValues.put("metadata", f2);
        try {
            u().insertWithOnConflict("raw_events_metadata", (String) null, contentValues, 4);
            return a;
        } catch (SQLiteException e2) {
            n().f3758f.a("Error storing raw event metadata. appId", m4.a(t0Var.zzs), e2);
            throw e2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0053  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String a(long r5) {
        /*
            r4 = this;
            r4.c()
            r4.m()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r4.u()     // Catch:{ SQLiteException -> 0x003c, all -> 0x003a }
            java.lang.String r2 = "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x003c, all -> 0x003a }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ SQLiteException -> 0x003c, all -> 0x003a }
            r6 = 0
            r3[r6] = r5     // Catch:{ SQLiteException -> 0x003c, all -> 0x003a }
            android.database.Cursor r5 = r1.rawQuery(r2, r3)     // Catch:{ SQLiteException -> 0x003c, all -> 0x003a }
            boolean r1 = r5.moveToFirst()     // Catch:{ SQLiteException -> 0x0038 }
            if (r1 != 0) goto L_0x0030
            i.c.a.b.i.a.m4 r6 = r4.n()     // Catch:{ SQLiteException -> 0x0038 }
            i.c.a.b.i.a.o4 r6 = r6.f3766n     // Catch:{ SQLiteException -> 0x0038 }
            java.lang.String r1 = "No expired configs for apps with pending events"
            r6.a(r1)     // Catch:{ SQLiteException -> 0x0038 }
            r5.close()
            return r0
        L_0x0030:
            java.lang.String r6 = r5.getString(r6)     // Catch:{ SQLiteException -> 0x0038 }
            r5.close()
            return r6
        L_0x0038:
            r6 = move-exception
            goto L_0x003e
        L_0x003a:
            r6 = move-exception
            goto L_0x0051
        L_0x003c:
            r6 = move-exception
            r5 = r0
        L_0x003e:
            i.c.a.b.i.a.m4 r1 = r4.n()     // Catch:{ all -> 0x004f }
            i.c.a.b.i.a.o4 r1 = r1.f3758f     // Catch:{ all -> 0x004f }
            java.lang.String r2 = "Error selecting expired configs"
            r1.a(r2, r6)     // Catch:{ all -> 0x004f }
            if (r5 == 0) goto L_0x004e
            r5.close()
        L_0x004e:
            return r0
        L_0x004f:
            r6 = move-exception
            r0 = r5
        L_0x0051:
            if (r0 == 0) goto L_0x0056
            r0.close()
        L_0x0056:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.a.b.i.a.d.a(long):java.lang.String");
    }

    public final boolean a(String str, Long l2, long j2, p0 p0Var) {
        c();
        m();
        q.a(p0Var);
        q.b(str);
        q.a(l2);
        byte[] f2 = p0Var.f();
        n().f3766n.a("Saving complex main event, appId, data size", e().a(str), Integer.valueOf(f2.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l2);
        contentValues.put("children_to_process", Long.valueOf(j2));
        contentValues.put("main_event", f2);
        try {
            if (u().insertWithOnConflict("main_event_params", (String) null, contentValues, 5) != -1) {
                return true;
            }
            n().f3758f.a("Failed to insert complex main event (got -1). appId", m4.a(str));
            return false;
        } catch (SQLiteException e2) {
            n().f3758f.a("Error storing complex main event. appId", m4.a(str), e2);
            return false;
        }
    }

    public final boolean a(j jVar, long j2, boolean z) {
        c();
        m();
        q.a(jVar);
        q.b(jVar.a);
        p0.a n2 = p0.n();
        n2.b(jVar.e);
        l lVar = jVar.f3723f;
        if (lVar != null) {
            for (String str : lVar.e.keySet()) {
                r0.a s = r0.s();
                s.a(str);
                q().a(s, jVar.f3723f.a(str));
                n2.a(s);
            }
            byte[] f2 = ((p0) ((w3) n2.k())).f();
            if (!k9.b() || !this.a.f3861g.d(jVar.a, o.Z0)) {
                n().f3766n.a("Saving event, name, data size", e().a(jVar.f3722b), Integer.valueOf(f2.length));
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", jVar.a);
            contentValues.put(DefaultAppMeasurementEventListenerRegistrar.NAME, jVar.f3722b);
            contentValues.put("timestamp", Long.valueOf(jVar.d));
            contentValues.put("metadata_fingerprint", Long.valueOf(j2));
            contentValues.put("data", f2);
            contentValues.put("realtime", Integer.valueOf(z ? 1 : 0));
            try {
                if (u().insert("raw_events", (String) null, contentValues) != -1) {
                    return true;
                }
                n().f3758f.a("Failed to insert raw event (got -1). appId", m4.a(jVar.a));
                return false;
            } catch (SQLiteException e2) {
                n().f3758f.a("Error storing raw event. appId", m4.a(jVar.a), e2);
                return false;
            }
        } else {
            throw null;
        }
    }
}
