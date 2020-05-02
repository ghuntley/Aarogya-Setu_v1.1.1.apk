package i.c.a.a.j.r.i;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import com.crashlytics.android.core.DefaultAppMeasurementEventListenerRegistrar;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import i.c.a.a.j.a;
import i.c.a.a.j.b;
import i.c.a.a.j.e;
import i.c.a.a.j.f;
import i.c.a.a.j.h;
import i.c.a.a.j.s.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
public class j implements c, i.c.a.a.j.s.a {

    /* renamed from: i  reason: collision with root package name */
    public static final i.c.a.a.b f2994i = new i.c.a.a.b("proto");
    public final o e;

    /* renamed from: f  reason: collision with root package name */
    public final i.c.a.a.j.t.a f2995f;

    /* renamed from: g  reason: collision with root package name */
    public final i.c.a.a.j.t.a f2996g;

    /* renamed from: h  reason: collision with root package name */
    public final d f2997h;

    /* compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
    public interface b<T, U> {
        U a(T t);
    }

    /* compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
    public static class c {
        public final String a;

        /* renamed from: b  reason: collision with root package name */
        public final String f2998b;

        public /* synthetic */ c(String str, String str2, a aVar) {
            this.a = str;
            this.f2998b = str2;
        }
    }

    public j(i.c.a.a.j.t.a aVar, i.c.a.a.j.t.a aVar2, d dVar, o oVar) {
        this.e = oVar;
        this.f2995f = aVar;
        this.f2996g = aVar2;
        this.f2997h = dVar;
    }

    public static /* synthetic */ SQLiteDatabase b(Throwable th) {
        throw new SynchronizationException("Timed out while trying to open db.", th);
    }

    public static String c(Iterable<g> iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator<g> it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((b) it.next()).a);
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public final SQLiteDatabase a() {
        o oVar = this.e;
        oVar.getClass();
        long a2 = this.f2996g.a();
        while (true) {
            try {
                return oVar.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e2) {
                if (this.f2996g.a() < ((long) ((a) this.f2997h).d) + a2) {
                    SystemClock.sleep(50);
                } else {
                    b((Throwable) e2);
                    throw null;
                }
            }
        }
    }

    public void close() {
        this.e.close();
    }

    /* JADX INFO: finally extract failed */
    public int d() {
        long a2 = this.f2995f.a() - ((a) this.f2997h).e;
        SQLiteDatabase a3 = a();
        a3.beginTransaction();
        try {
            Integer a4 = Integer.valueOf(a3.delete("events", "timestamp_ms < ?", new String[]{String.valueOf(a2)}));
            a3.setTransactionSuccessful();
            a3.endTransaction();
            return a4.intValue();
        } catch (Throwable th) {
            a3.endTransaction();
            throw th;
        }
    }

    public Iterable<h> r() {
        SQLiteDatabase a2 = a();
        a2.beginTransaction();
        try {
            List b2 = b(a2);
            a2.setTransactionSuccessful();
            return b2;
        } finally {
            a2.endTransaction();
        }
    }

    public static /* synthetic */ Long b(Cursor cursor) {
        if (!cursor.moveToNext()) {
            return null;
        }
        return Long.valueOf(cursor.getLong(0));
    }

    public void b(Iterable<g> iterable) {
        if (iterable.iterator().hasNext()) {
            StringBuilder a2 = i.a.a.a.a.a("UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in ");
            a2.append(c(iterable));
            String sb = a2.toString();
            SQLiteDatabase a3 = a();
            a3.beginTransaction();
            try {
                a(sb, a3);
                a3.setTransactionSuccessful();
            } finally {
                a3.endTransaction();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public g a(h hVar, f fVar) {
        g.a.a.b.a.a("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", ((i.c.a.a.j.b) hVar).c, ((i.c.a.a.j.a) fVar).a, ((i.c.a.a.j.b) hVar).a);
        SQLiteDatabase a2 = a();
        a2.beginTransaction();
        try {
            Long a3 = a(this, hVar, fVar, a2);
            a2.setTransactionSuccessful();
            a2.endTransaction();
            long longValue = a3.longValue();
            if (longValue < 1) {
                return null;
            }
            return new b(longValue, hVar, fVar);
        } catch (Throwable th) {
            a2.endTransaction();
            throw th;
        }
    }

    public static /* synthetic */ List c(Cursor cursor) {
        byte[] bArr;
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            h.a a2 = h.a();
            a2.a(cursor.getString(1));
            a2.a(i.c.a.a.j.u.a.a(cursor.getInt(2)));
            String string = cursor.getString(3);
            if (string == null) {
                bArr = null;
            } else {
                bArr = Base64.decode(string, 0);
            }
            b.C0103b bVar = (b.C0103b) a2;
            bVar.f2934b = bArr;
            arrayList.add(bVar.a());
        }
        return arrayList;
    }

    public static /* synthetic */ List b(SQLiteDatabase sQLiteDatabase) {
        return (List) a(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), h.a);
    }

    public static /* synthetic */ List b(j jVar, h hVar, SQLiteDatabase sQLiteDatabase) {
        j jVar2 = jVar;
        h hVar2 = hVar;
        if (jVar2 != null) {
            ArrayList arrayList = new ArrayList();
            Long a2 = jVar.a(sQLiteDatabase, hVar);
            if (a2 != null) {
                String[] strArr = {a2.toString()};
                Cursor query = sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code"}, "context_id = ?", strArr, (String) null, (String) null, (String) null, String.valueOf(((a) jVar2.f2997h).c));
                try {
                    a((List) arrayList, hVar, query);
                    query.close();
                } catch (Throwable th) {
                    Throwable th2 = th;
                    query.close();
                    throw th2;
                }
            }
            HashMap hashMap = new HashMap();
            StringBuilder sb = new StringBuilder("event_id IN (");
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                sb.append(((b) ((g) arrayList.get(i2))).a);
                if (i2 < arrayList.size() - 1) {
                    sb.append(',');
                }
            }
            sb.append(')');
            Cursor query2 = sQLiteDatabase.query("event_metadata", new String[]{"event_id", DefaultAppMeasurementEventListenerRegistrar.NAME, "value"}, sb.toString(), (String[]) null, (String) null, (String) null, (String) null);
            try {
                a((Map) hashMap, query2);
                query2.close();
                ListIterator listIterator = arrayList.listIterator();
                while (listIterator.hasNext()) {
                    b bVar = (b) ((g) listIterator.next());
                    if (hashMap.containsKey(Long.valueOf(bVar.a))) {
                        f.a a3 = bVar.c.a();
                        for (c cVar : (Set) hashMap.get(Long.valueOf(bVar.a))) {
                            a3.a(cVar.a, cVar.f2998b);
                        }
                        listIterator.set(new b(bVar.a, bVar.f2993b, a3.a()));
                    }
                }
                return arrayList;
            } catch (Throwable th3) {
                Throwable th4 = th3;
                query2.close();
                throw th4;
            }
        } else {
            throw null;
        }
    }

    public Iterable<g> c(h hVar) {
        SQLiteDatabase a2 = a();
        a2.beginTransaction();
        try {
            List b2 = b(this, hVar, a2);
            a2.setTransactionSuccessful();
            return b2;
        } finally {
            a2.endTransaction();
        }
    }

    public final Long a(SQLiteDatabase sQLiteDatabase, h hVar) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        i.c.a.a.j.b bVar = (i.c.a.a.j.b) hVar;
        ArrayList arrayList = new ArrayList(Arrays.asList(new String[]{((i.c.a.a.j.b) hVar).a, String.valueOf(i.c.a.a.j.u.a.a(bVar.c))}));
        if (bVar.f2933b != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bVar.f2933b, 0));
        }
        Cursor query = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), (String) null, (String) null, (String) null);
        try {
            return b(query);
        } finally {
            query.close();
        }
    }

    public static /* synthetic */ Object a(String str, SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement(str).execute();
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 10").execute();
        return null;
    }

    public void a(Iterable<g> iterable) {
        if (iterable.iterator().hasNext()) {
            StringBuilder a2 = i.a.a.a.a.a("DELETE FROM events WHERE _id in ");
            a2.append(c(iterable));
            a().compileStatement(a2.toString()).execute();
        }
    }

    /* JADX INFO: finally extract failed */
    public long a(h hVar) {
        Cursor rawQuery = a().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{((i.c.a.a.j.b) hVar).a, String.valueOf(i.c.a.a.j.u.a.a(((i.c.a.a.j.b) hVar).c))});
        try {
            Long a2 = a(rawQuery);
            rawQuery.close();
            return a2.longValue();
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }

    public static /* synthetic */ Long a(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return 0L;
    }

    /* JADX INFO: finally extract failed */
    public boolean b(h hVar) {
        SQLiteDatabase a2 = a();
        a2.beginTransaction();
        try {
            Boolean a3 = a(this, hVar, a2);
            a2.setTransactionSuccessful();
            a2.endTransaction();
            return a3.booleanValue();
        } catch (Throwable th) {
            a2.endTransaction();
            throw th;
        }
    }

    public static /* synthetic */ Boolean a(j jVar, h hVar, SQLiteDatabase sQLiteDatabase) {
        Long a2 = jVar.a(sQLiteDatabase, hVar);
        if (a2 == null) {
            return false;
        }
        return (Boolean) a(jVar.a().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{a2.toString()}), i.a);
    }

    public static /* synthetic */ Object a(long j2, h hVar, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j2));
        i.c.a.a.j.b bVar = (i.c.a.a.j.b) hVar;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{((i.c.a.a.j.b) hVar).a, String.valueOf(i.c.a.a.j.u.a.a(bVar.c))}) < 1) {
            contentValues.put("backend_name", bVar.a);
            contentValues.put("priority", Integer.valueOf(i.c.a.a.j.u.a.a(bVar.c)));
            sQLiteDatabase.insert("transport_contexts", (String) null, contentValues);
        }
        return null;
    }

    public static /* synthetic */ Object a(List list, h hVar, Cursor cursor) {
        i.c.a.a.b bVar;
        while (cursor.moveToNext()) {
            long j2 = cursor.getLong(0);
            a.b bVar2 = new a.b();
            bVar2.f2932f = new HashMap();
            bVar2.a(cursor.getString(1));
            bVar2.a(cursor.getLong(2));
            bVar2.b(cursor.getLong(3));
            String string = cursor.getString(4);
            if (string == null) {
                bVar = f2994i;
            } else {
                bVar = new i.c.a.a.b(string);
            }
            bVar2.a(new e(bVar, cursor.getBlob(5)));
            if (!cursor.isNull(6)) {
                bVar2.f2931b = Integer.valueOf(cursor.getInt(6));
            }
            list.add(new b(j2, hVar, bVar2.a()));
        }
        return null;
    }

    public static /* synthetic */ Object a(Map map, Cursor cursor) {
        while (cursor.moveToNext()) {
            long j2 = cursor.getLong(0);
            Set set = (Set) map.get(Long.valueOf(j2));
            if (set == null) {
                set = new HashSet();
                map.put(Long.valueOf(j2), set);
            }
            set.add(new c(cursor.getString(1), cursor.getString(2), (a) null));
        }
        return null;
    }

    public static /* synthetic */ Object a(Throwable th) {
        throw new SynchronizationException("Timed out while trying to acquire the lock.", th);
    }

    public <T> T a(a.C0107a<T> aVar) {
        SQLiteDatabase a2 = a();
        long a3 = this.f2996g.a();
        while (true) {
            try {
                Object unused = a2.beginTransaction();
                try {
                    T f2 = aVar.f();
                    a2.setTransactionSuccessful();
                    return f2;
                } finally {
                    a2.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e2) {
                if (this.f2996g.a() < ((long) ((a) this.f2997h).d) + a3) {
                    SystemClock.sleep(50);
                } else {
                    a((Throwable) e2);
                    throw null;
                }
            }
        }
    }

    public void a(h hVar, long j2) {
        SQLiteDatabase a2 = a();
        a2.beginTransaction();
        try {
            a(j2, hVar, a2);
            a2.setTransactionSuccessful();
        } finally {
            a2.endTransaction();
        }
    }

    public static /* synthetic */ Long a(j jVar, h hVar, f fVar, SQLiteDatabase sQLiteDatabase) {
        long j2;
        if (jVar.a().compileStatement("PRAGMA page_size").simpleQueryForLong() * jVar.a().compileStatement("PRAGMA page_count").simpleQueryForLong() >= ((a) jVar.f2997h).f2992b) {
            return -1L;
        }
        Long a2 = jVar.a(sQLiteDatabase, hVar);
        if (a2 != null) {
            j2 = a2.longValue();
        } else {
            ContentValues contentValues = new ContentValues();
            i.c.a.a.j.b bVar = (i.c.a.a.j.b) hVar;
            contentValues.put("backend_name", bVar.a);
            contentValues.put("priority", Integer.valueOf(i.c.a.a.j.u.a.a(bVar.c)));
            contentValues.put("next_request_ms", 0);
            byte[] bArr = bVar.f2933b;
            if (bArr != null) {
                contentValues.put("extras", Base64.encodeToString(bArr, 0));
            }
            j2 = sQLiteDatabase.insert("transport_contexts", (String) null, contentValues);
        }
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put("context_id", Long.valueOf(j2));
        i.c.a.a.j.a aVar = (i.c.a.a.j.a) fVar;
        contentValues2.put("transport_name", aVar.a);
        contentValues2.put("timestamp_ms", Long.valueOf(aVar.d));
        contentValues2.put("uptime_ms", Long.valueOf(aVar.e));
        contentValues2.put("payload_encoding", aVar.c.a.a);
        contentValues2.put("payload", aVar.c.f2946b);
        contentValues2.put("code", aVar.f2929b);
        contentValues2.put("num_attempts", 0);
        long insert = sQLiteDatabase.insert("events", (String) null, contentValues2);
        for (Map.Entry next : Collections.unmodifiableMap(aVar.f2930f).entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("event_id", Long.valueOf(insert));
            contentValues3.put(DefaultAppMeasurementEventListenerRegistrar.NAME, (String) next.getKey());
            contentValues3.put("value", (String) next.getValue());
            sQLiteDatabase.insert("event_metadata", (String) null, contentValues3);
        }
        return Long.valueOf(insert);
    }

    public static <T> T a(Cursor cursor, b<Cursor, T> bVar) {
        try {
            return bVar.a(cursor);
        } finally {
            cursor.close();
        }
    }
}
