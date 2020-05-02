package h.v.a.f;

import android.database.sqlite.SQLiteProgram;
import h.v.a.d;

/* compiled from: FrameworkSQLiteProgram */
public class e implements d {
    public final SQLiteProgram e;

    public e(SQLiteProgram sQLiteProgram) {
        this.e = sQLiteProgram;
    }

    public void bindBlob(int i2, byte[] bArr) {
        this.e.bindBlob(i2, bArr);
    }

    public void bindDouble(int i2, double d) {
        this.e.bindDouble(i2, d);
    }

    public void bindLong(int i2, long j2) {
        this.e.bindLong(i2, j2);
    }

    public void bindNull(int i2) {
        this.e.bindNull(i2);
    }

    public void bindString(int i2, String str) {
        this.e.bindString(i2, str);
    }

    public void close() {
        this.e.close();
    }
}
