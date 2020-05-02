package h.v.a;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import java.io.Closeable;
import java.io.File;

/* compiled from: SupportSQLiteOpenHelper */
public interface c extends Closeable {

    /* compiled from: SupportSQLiteOpenHelper */
    public static abstract class a {
        public final int a;

        public a(int i2) {
            this.a = i2;
        }

        public abstract void a(b bVar, int i2, int i3);

        public final void a(String str) {
            if (!str.equalsIgnoreCase(":memory:") && str.trim().length() != 0) {
                Log.w("SupportSQLite", "deleting the database file: " + str);
                try {
                    SQLiteDatabase.deleteDatabase(new File(str));
                } catch (Exception e) {
                    Log.w("SupportSQLite", "delete failed: ", e);
                }
            }
        }
    }

    /* compiled from: SupportSQLiteOpenHelper */
    public static class b {
        public final Context a;

        /* renamed from: b  reason: collision with root package name */
        public final String f2243b;
        public final a c;
        public final boolean d;

        public b(Context context, String str, a aVar, boolean z) {
            this.a = context;
            this.f2243b = str;
            this.c = aVar;
            this.d = z;
        }
    }

    /* renamed from: h.v.a.c$c  reason: collision with other inner class name */
    /* compiled from: SupportSQLiteOpenHelper */
    public interface C0069c {
        c a(b bVar);
    }

    void close();

    String getDatabaseName();

    b getWritableDatabase();

    void setWriteAheadLoggingEnabled(boolean z);
}
