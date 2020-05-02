package i.c.a.a.j.r.i;

import android.database.sqlite.SQLiteDatabase;
import i.c.a.a.j.r.i.o;

/* compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
public final /* synthetic */ class n implements o.a {
    public static final n a = new n();

    public void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
    }
}
