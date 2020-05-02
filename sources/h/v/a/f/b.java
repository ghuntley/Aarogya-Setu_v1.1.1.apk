package h.v.a.f;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import h.v.a.e;

/* compiled from: FrameworkSQLiteDatabase */
public class b implements SQLiteDatabase.CursorFactory {
    public final /* synthetic */ e a;

    public b(a aVar, e eVar) {
        this.a = eVar;
    }

    public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        this.a.a(new e(sQLiteQuery));
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }
}
