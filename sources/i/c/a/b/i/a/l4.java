package i.c.a.b.i.a;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import i.c.a.b.d.l.q;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class l4 extends SQLiteOpenHelper {
    public final /* synthetic */ i4 e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l4(i4 i4Var, Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
        this.e = i4Var;
    }

    public final SQLiteDatabase getWritableDatabase() {
        try {
            return super.getWritableDatabase();
        } catch (SQLiteDatabaseLockedException e2) {
            throw e2;
        } catch (SQLiteException unused) {
            this.e.n().f3758f.a("Opening the local database failed, dropping and recreating it");
            if (!this.e.a.a.getDatabasePath("google_app_measurement_local.db").delete()) {
                this.e.n().f3758f.a("Failed to delete corrupted local db file", "google_app_measurement_local.db");
            }
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException e3) {
                this.e.n().f3758f.a("Failed to open local database. Events will bypass local storage", e3);
                return null;
            }
        }
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        q.a(this.e.n(), sQLiteDatabase);
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
    }

    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        q.a(this.e.n(), sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", (String[]) null);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
    }
}
