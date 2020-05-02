package h.v.a.f;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import h.v.a.b;
import h.v.a.e;

/* compiled from: FrameworkSQLiteDatabase */
public class a implements b {

    /* renamed from: f  reason: collision with root package name */
    public static final String[] f2244f = new String[0];
    public final SQLiteDatabase e;

    /* renamed from: h.v.a.f.a$a  reason: collision with other inner class name */
    /* compiled from: FrameworkSQLiteDatabase */
    public class C0070a implements SQLiteDatabase.CursorFactory {
        public final /* synthetic */ e a;

        public C0070a(a aVar, e eVar) {
            this.a = eVar;
        }

        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.a.a(new e(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    public a(SQLiteDatabase sQLiteDatabase) {
        this.e = sQLiteDatabase;
    }

    public Cursor a(e eVar) {
        return this.e.rawQueryWithFactory(new C0070a(this, eVar), eVar.a(), f2244f, (String) null);
    }

    public Cursor b(String str) {
        return a(new h.v.a.a(str));
    }

    public void close() {
        this.e.close();
    }

    public String a() {
        return this.e.getPath();
    }
}
