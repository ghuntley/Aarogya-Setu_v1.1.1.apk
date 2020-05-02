package h.a0.x;

import android.content.Context;
import android.os.Build;
import h.a0.l;
import java.io.File;
import java.util.HashMap;

/* compiled from: WorkDatabasePathHelper */
public class i {
    public static final String a = l.a("WrkDbPathHelper");

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f954b = {"-journal", "-shm", "-wal"};

    public static String a() {
        return "androidx.work.workdb";
    }

    public static void a(Context context) {
        String str;
        File file;
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        if (Build.VERSION.SDK_INT >= 23 && databasePath.exists()) {
            l.a().a(a, "Migrating WorkDatabase to the no-backup directory", new Throwable[0]);
            HashMap hashMap = new HashMap();
            if (Build.VERSION.SDK_INT >= 23) {
                File databasePath2 = context.getDatabasePath("androidx.work.workdb");
                if (Build.VERSION.SDK_INT < 23) {
                    file = context.getDatabasePath("androidx.work.workdb");
                } else {
                    file = new File(context.getNoBackupFilesDir(), "androidx.work.workdb");
                }
                hashMap.put(databasePath2, file);
                for (String str2 : f954b) {
                    hashMap.put(new File(databasePath2.getPath() + str2), new File(file.getPath() + str2));
                }
            }
            for (File file2 : hashMap.keySet()) {
                File file3 = (File) hashMap.get(file2);
                if (file2.exists() && file3 != null) {
                    if (file3.exists()) {
                        l.a().d(a, String.format("Over-writing contents of %s", new Object[]{file3}), new Throwable[0]);
                    }
                    if (file2.renameTo(file3)) {
                        str = String.format("Migrated %s to %s", new Object[]{file2, file3});
                    } else {
                        str = String.format("Renaming %s to %s failed", new Object[]{file2, file3});
                    }
                    l.a().a(a, str, new Throwable[0]);
                }
            }
        }
    }
}
