package i.b.a.n.m.c0;

import android.util.Log;
import i.b.a.l.a;
import java.io.File;
import java.io.IOException;

/* compiled from: DiskLruCacheWrapper */
public class e implements a {
    public final k a;

    /* renamed from: b  reason: collision with root package name */
    public final File f2553b;
    public final long c;
    public final c d = new c();
    public a e;

    @Deprecated
    public e(File file, long j2) {
        this.f2553b = file;
        this.c = j2;
        this.a = new k();
    }

    public final synchronized a a() {
        if (this.e == null) {
            this.e = a.a(this.f2553b, 1, 1, this.c);
        }
        return this.e;
    }

    public File a(i.b.a.n.e eVar) {
        String a2 = this.a.a(eVar);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + a2 + " for for Key: " + eVar);
        }
        try {
            a.e b2 = a().b(a2);
            if (b2 != null) {
                return b2.a[0];
            }
            return null;
        } catch (IOException e2) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e2);
            return null;
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0073 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(i.b.a.n.e r6, i.b.a.n.m.c0.a.b r7) {
        /*
            r5 = this;
            java.lang.String r0 = "DiskLruCacheWrapper"
            i.b.a.n.m.c0.k r1 = r5.a
            java.lang.String r1 = r1.a(r6)
            i.b.a.n.m.c0.c r2 = r5.d
            r2.a(r1)
            r2 = 2
            boolean r2 = android.util.Log.isLoggable(r0, r2)     // Catch:{ all -> 0x0099 }
            if (r2 == 0) goto L_0x0030
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0099 }
            r2.<init>()     // Catch:{ all -> 0x0099 }
            java.lang.String r3 = "Put: Obtained: "
            r2.append(r3)     // Catch:{ all -> 0x0099 }
            r2.append(r1)     // Catch:{ all -> 0x0099 }
            java.lang.String r3 = " for for Key: "
            r2.append(r3)     // Catch:{ all -> 0x0099 }
            r2.append(r6)     // Catch:{ all -> 0x0099 }
            java.lang.String r6 = r2.toString()     // Catch:{ all -> 0x0099 }
            android.util.Log.v(r0, r6)     // Catch:{ all -> 0x0099 }
        L_0x0030:
            i.b.a.l.a r6 = r5.a()     // Catch:{ IOException -> 0x008b }
            i.b.a.l.a$e r2 = r6.b((java.lang.String) r1)     // Catch:{ IOException -> 0x008b }
            if (r2 == 0) goto L_0x0040
        L_0x003a:
            i.b.a.n.m.c0.c r6 = r5.d
            r6.b(r1)
            return
        L_0x0040:
            r2 = -1
            i.b.a.l.a$c r6 = r6.a((java.lang.String) r1, (long) r2)     // Catch:{ IOException -> 0x008b }
            if (r6 == 0) goto L_0x0074
            r2 = 0
            java.io.File r2 = r6.a(r2)     // Catch:{ all -> 0x006b }
            i.b.a.n.m.f r7 = (i.b.a.n.m.f) r7     // Catch:{ all -> 0x006b }
            i.b.a.n.d<DataType> r3 = r7.a     // Catch:{ all -> 0x006b }
            DataType r4 = r7.f2576b     // Catch:{ all -> 0x006b }
            i.b.a.n.g r7 = r7.c     // Catch:{ all -> 0x006b }
            boolean r7 = r3.a(r4, r2, r7)     // Catch:{ all -> 0x006b }
            if (r7 == 0) goto L_0x0063
            i.b.a.l.a r7 = i.b.a.l.a.this     // Catch:{ all -> 0x006b }
            r2 = 1
            r7.a((i.b.a.l.a.c) r6, (boolean) r2)     // Catch:{ all -> 0x006b }
            r6.c = r2     // Catch:{ all -> 0x006b }
        L_0x0063:
            boolean r7 = r6.c     // Catch:{ IOException -> 0x008b }
            if (r7 != 0) goto L_0x003a
            r6.a()     // Catch:{ IOException -> 0x003a }
            goto L_0x003a
        L_0x006b:
            r7 = move-exception
            boolean r2 = r6.c     // Catch:{ IOException -> 0x008b }
            if (r2 != 0) goto L_0x0073
            r6.a()     // Catch:{ IOException -> 0x0073 }
        L_0x0073:
            throw r7     // Catch:{ IOException -> 0x008b }
        L_0x0074:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x008b }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x008b }
            r7.<init>()     // Catch:{ IOException -> 0x008b }
            java.lang.String r2 = "Had two simultaneous puts for: "
            r7.append(r2)     // Catch:{ IOException -> 0x008b }
            r7.append(r1)     // Catch:{ IOException -> 0x008b }
            java.lang.String r7 = r7.toString()     // Catch:{ IOException -> 0x008b }
            r6.<init>(r7)     // Catch:{ IOException -> 0x008b }
            throw r6     // Catch:{ IOException -> 0x008b }
        L_0x008b:
            r6 = move-exception
            r7 = 5
            boolean r7 = android.util.Log.isLoggable(r0, r7)     // Catch:{ all -> 0x0099 }
            if (r7 == 0) goto L_0x003a
            java.lang.String r7 = "Unable to put to disk cache"
            android.util.Log.w(r0, r7, r6)     // Catch:{ all -> 0x0099 }
            goto L_0x003a
        L_0x0099:
            r6 = move-exception
            i.b.a.n.m.c0.c r7 = r5.d
            r7.b(r1)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: i.b.a.n.m.c0.e.a(i.b.a.n.e, i.b.a.n.m.c0.a$b):void");
    }
}
