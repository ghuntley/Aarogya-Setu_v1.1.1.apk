package i.c.d.m;

import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/* compiled from: com.google.firebase:firebase-installations@@16.1.0 */
public class b {
    public final FileChannel a;

    /* renamed from: b  reason: collision with root package name */
    public final FileLock f4723b;

    public b(FileChannel fileChannel, FileLock fileLock) {
        this.a = fileChannel;
        this.f4723b = fileLock;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0030 A[SYNTHETIC, Splitter:B:15:0x0030] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0037 A[SYNTHETIC, Splitter:B:19:0x0037] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static i.c.d.m.b a(android.content.Context r4, java.lang.String r5) {
        /*
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch:{ IOException -> 0x0024 }
            java.io.File r4 = r4.getFilesDir()     // Catch:{ IOException -> 0x0024 }
            r1.<init>(r4, r5)     // Catch:{ IOException -> 0x0024 }
            java.io.RandomAccessFile r4 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x0024 }
            java.lang.String r5 = "rw"
            r4.<init>(r1, r5)     // Catch:{ IOException -> 0x0024 }
            java.nio.channels.FileChannel r4 = r4.getChannel()     // Catch:{ IOException -> 0x0024 }
            java.nio.channels.FileLock r5 = r4.lock()     // Catch:{ IOException -> 0x0021 }
            i.c.d.m.b r1 = new i.c.d.m.b     // Catch:{ IOException -> 0x001f }
            r1.<init>(r4, r5)     // Catch:{ IOException -> 0x001f }
            return r1
        L_0x001f:
            r1 = move-exception
            goto L_0x0027
        L_0x0021:
            r1 = move-exception
            r5 = r0
            goto L_0x0027
        L_0x0024:
            r1 = move-exception
            r4 = r0
            r5 = r4
        L_0x0027:
            java.lang.String r2 = "CrossProcessLock"
            java.lang.String r3 = "encountered error while creating and acquiring the lock, ignoring"
            android.util.Log.e(r2, r3, r1)
            if (r5 == 0) goto L_0x0035
            r5.release()     // Catch:{ IOException -> 0x0034 }
            goto L_0x0035
        L_0x0034:
        L_0x0035:
            if (r4 == 0) goto L_0x003a
            r4.close()     // Catch:{ IOException -> 0x003a }
        L_0x003a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.d.m.b.a(android.content.Context, java.lang.String):i.c.d.m.b");
    }
}
