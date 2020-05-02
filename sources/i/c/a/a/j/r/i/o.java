package i.c.a.a.j.r.i;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
public final class o extends SQLiteOpenHelper {

    /* renamed from: g  reason: collision with root package name */
    public static int f3000g = 3;

    /* renamed from: h  reason: collision with root package name */
    public static final a f3001h = l.a;

    /* renamed from: i  reason: collision with root package name */
    public static final a f3002i = m.a;

    /* renamed from: j  reason: collision with root package name */
    public static final a f3003j;

    /* renamed from: k  reason: collision with root package name */
    public static final List<a> f3004k;
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f3005f = false;

    /* compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
    public interface a {
        void a(SQLiteDatabase sQLiteDatabase);
    }

    static {
        n nVar = n.a;
        f3003j = nVar;
        f3004k = Arrays.asList(new a[]{f3001h, f3002i, nVar});
    }

    public o(Context context, int i2) {
        super(context, "com.google.android.datatransport.events", (SQLiteDatabase.CursorFactory) null, i2);
        this.e = i2;
    }

    public static /* synthetic */ void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
    }

    public static /* synthetic */ void b(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
        sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
    }

    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f3005f = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        if (!this.f3005f) {
            onConfigure(sQLiteDatabase);
        }
        a(sQLiteDatabase, 0, this.e);
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        if (!this.f3005f) {
            onConfigure(sQLiteDatabase);
        }
        a(sQLiteDatabase, 0, this.e);
    }

    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (!this.f3005f) {
            onConfigure(sQLiteDatabase);
        }
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        if (!this.f3005f) {
            onConfigure(sQLiteDatabase);
        }
        a(sQLiteDatabase, i2, i3);
    }

    public final void a(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        if (i3 <= f3004k.size()) {
            while (i2 < i3) {
                f3004k.get(i2).a(sQLiteDatabase);
                i2++;
            }
            return;
        }
        throw new IllegalArgumentException("Migration from " + i2 + " to " + i3 + " was requested, but cannot be performed. Only " + f3004k.size() + " migrations are provided");
    }
}
