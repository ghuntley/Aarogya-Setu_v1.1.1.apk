package h.v.a.f;

import android.database.sqlite.SQLiteStatement;
import h.v.a.d;

/* compiled from: FrameworkSQLiteStatement */
public class f extends e implements d {

    /* renamed from: f  reason: collision with root package name */
    public final SQLiteStatement f2254f;

    public f(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f2254f = sQLiteStatement;
    }

    public long a() {
        return this.f2254f.executeInsert();
    }

    public int f() {
        return this.f2254f.executeUpdateDelete();
    }
}
