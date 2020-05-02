package l.a.a.a;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import java.io.File;

/* compiled from: FabricContext */
public class g extends ContextWrapper {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5045b;

    public g(Context context, String str, String str2) {
        super(context);
        this.f5045b = str;
        this.a = str2;
    }

    public File getCacheDir() {
        return new File(super.getCacheDir(), this.a);
    }

    public File getDatabasePath(String str) {
        File file = new File(super.getDatabasePath(str).getParentFile(), this.a);
        file.mkdirs();
        return new File(file, str);
    }

    @TargetApi(8)
    public File getExternalCacheDir() {
        return new File(super.getExternalCacheDir(), this.a);
    }

    @TargetApi(8)
    public File getExternalFilesDir(String str) {
        return new File(super.getExternalFilesDir(str), this.a);
    }

    public File getFilesDir() {
        return new File(super.getFilesDir(), this.a);
    }

    public SharedPreferences getSharedPreferences(String str, int i2) {
        return super.getSharedPreferences(this.f5045b + ":" + str, i2);
    }

    public SQLiteDatabase openOrCreateDatabase(String str, int i2, SQLiteDatabase.CursorFactory cursorFactory) {
        return SQLiteDatabase.openOrCreateDatabase(getDatabasePath(str), cursorFactory);
    }

    @TargetApi(11)
    public SQLiteDatabase openOrCreateDatabase(String str, int i2, SQLiteDatabase.CursorFactory cursorFactory, DatabaseErrorHandler databaseErrorHandler) {
        return SQLiteDatabase.openOrCreateDatabase(getDatabasePath(str).getPath(), cursorFactory, databaseErrorHandler);
    }
}
