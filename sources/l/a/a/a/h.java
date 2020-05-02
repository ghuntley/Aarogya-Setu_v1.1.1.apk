package l.a.a.a;

import java.util.Map;
import java.util.concurrent.Callable;

/* compiled from: FabricKitsFinder */
public class h implements Callable<Map<String, m>> {
    public final String e;

    public h(String str) {
        this.e = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00e3 A[Catch:{ all -> 0x00ba }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0049 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object call() {
        /*
            r15 = this;
            java.lang.String r0 = "Fabric"
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            long r2 = android.os.SystemClock.elapsedRealtime()
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            r5 = 0
            r6 = 2
            java.lang.String r7 = "com.google.android.gms.ads.AdView"
            java.lang.Class.forName(r7)     // Catch:{ Exception -> 0x0036 }
            l.a.a.a.m r7 = new l.a.a.a.m     // Catch:{ Exception -> 0x0036 }
            java.lang.String r8 = "com.google.firebase.firebase-ads"
            java.lang.String r9 = "0.0.0"
            java.lang.String r10 = "binary"
            r7.<init>(r8, r9, r10)     // Catch:{ Exception -> 0x0036 }
            java.lang.String r8 = r7.a     // Catch:{ Exception -> 0x0036 }
            r4.put(r8, r7)     // Catch:{ Exception -> 0x0036 }
            l.a.a.a.c r7 = l.a.a.a.f.a()     // Catch:{ Exception -> 0x0036 }
            java.lang.String r8 = "Found kit: com.google.firebase.firebase-ads"
            boolean r7 = r7.a(r0, r6)     // Catch:{ Exception -> 0x0036 }
            if (r7 == 0) goto L_0x0036
            android.util.Log.v(r0, r8, r5)     // Catch:{ Exception -> 0x0036 }
        L_0x0036:
            r1.putAll(r4)
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.util.zip.ZipFile r7 = new java.util.zip.ZipFile
            java.lang.String r8 = r15.e
            r7.<init>(r8)
            java.util.Enumeration r8 = r7.entries()
        L_0x0049:
            boolean r9 = r8.hasMoreElements()
            if (r9 == 0) goto L_0x0116
            java.lang.Object r9 = r8.nextElement()
            java.util.zip.ZipEntry r9 = (java.util.zip.ZipEntry) r9
            java.lang.String r10 = r9.getName()
            java.lang.String r11 = "fabric/"
            boolean r10 = r10.startsWith(r11)
            if (r10 == 0) goto L_0x0049
            java.lang.String r10 = r9.getName()
            int r10 = r10.length()
            r11 = 7
            if (r10 <= r11) goto L_0x0049
            java.io.InputStream r10 = r7.getInputStream(r9)     // Catch:{ IOException -> 0x00c1, all -> 0x00bf }
            java.util.Properties r11 = new java.util.Properties     // Catch:{ IOException -> 0x00bd }
            r11.<init>()     // Catch:{ IOException -> 0x00bd }
            r11.load(r10)     // Catch:{ IOException -> 0x00bd }
            java.lang.String r12 = "fabric-identifier"
            java.lang.String r12 = r11.getProperty(r12)     // Catch:{ IOException -> 0x00bd }
            java.lang.String r13 = "fabric-version"
            java.lang.String r13 = r11.getProperty(r13)     // Catch:{ IOException -> 0x00bd }
            java.lang.String r14 = "fabric-build-type"
            java.lang.String r11 = r11.getProperty(r14)     // Catch:{ IOException -> 0x00bd }
            boolean r14 = android.text.TextUtils.isEmpty(r12)     // Catch:{ IOException -> 0x00bd }
            if (r14 != 0) goto L_0x009f
            boolean r14 = android.text.TextUtils.isEmpty(r13)     // Catch:{ IOException -> 0x00bd }
            if (r14 != 0) goto L_0x009f
            l.a.a.a.m r14 = new l.a.a.a.m     // Catch:{ IOException -> 0x00bd }
            r14.<init>(r12, r13, r11)     // Catch:{ IOException -> 0x00bd }
            l.a.a.a.o.b.i.a((java.io.Closeable) r10)
            goto L_0x00ea
        L_0x009f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x00bd }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00bd }
            r12.<init>()     // Catch:{ IOException -> 0x00bd }
            java.lang.String r13 = "Invalid format of fabric file,"
            r12.append(r13)     // Catch:{ IOException -> 0x00bd }
            java.lang.String r13 = r9.getName()     // Catch:{ IOException -> 0x00bd }
            r12.append(r13)     // Catch:{ IOException -> 0x00bd }
            java.lang.String r12 = r12.toString()     // Catch:{ IOException -> 0x00bd }
            r11.<init>(r12)     // Catch:{ IOException -> 0x00bd }
            throw r11     // Catch:{ IOException -> 0x00bd }
        L_0x00ba:
            r0 = move-exception
            r5 = r10
            goto L_0x0112
        L_0x00bd:
            r11 = move-exception
            goto L_0x00c3
        L_0x00bf:
            r0 = move-exception
            goto L_0x0112
        L_0x00c1:
            r11 = move-exception
            r10 = r5
        L_0x00c3:
            l.a.a.a.c r12 = l.a.a.a.f.a()     // Catch:{ all -> 0x00ba }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ba }
            r13.<init>()     // Catch:{ all -> 0x00ba }
            java.lang.String r14 = "Error when parsing fabric properties "
            r13.append(r14)     // Catch:{ all -> 0x00ba }
            java.lang.String r9 = r9.getName()     // Catch:{ all -> 0x00ba }
            r13.append(r9)     // Catch:{ all -> 0x00ba }
            java.lang.String r9 = r13.toString()     // Catch:{ all -> 0x00ba }
            r13 = 6
            boolean r12 = r12.a(r0, r13)     // Catch:{ all -> 0x00ba }
            if (r12 == 0) goto L_0x00e6
            android.util.Log.e(r0, r9, r11)     // Catch:{ all -> 0x00ba }
        L_0x00e6:
            l.a.a.a.o.b.i.a((java.io.Closeable) r10)
            r14 = r5
        L_0x00ea:
            if (r14 == 0) goto L_0x0049
            java.lang.String r9 = r14.a
            r4.put(r9, r14)
            l.a.a.a.c r9 = l.a.a.a.f.a()
            java.lang.Object[] r10 = new java.lang.Object[r6]
            r11 = 0
            java.lang.String r12 = r14.a
            r10[r11] = r12
            r11 = 1
            java.lang.String r12 = r14.f5046b
            r10[r11] = r12
            java.lang.String r11 = "Found kit:[%s] version:[%s]"
            java.lang.String r10 = java.lang.String.format(r11, r10)
            boolean r9 = r9.a(r0, r6)
            if (r9 == 0) goto L_0x0049
            android.util.Log.v(r0, r10, r5)
            goto L_0x0049
        L_0x0112:
            l.a.a.a.o.b.i.a((java.io.Closeable) r5)
            throw r0
        L_0x0116:
            r7.close()     // Catch:{ IOException -> 0x011a }
            goto L_0x011b
        L_0x011a:
        L_0x011b:
            r1.putAll(r4)
            l.a.a.a.c r4 = l.a.a.a.f.a()
            java.lang.String r7 = "finish scanning in "
            java.lang.StringBuilder r7 = i.a.a.a.a.a(r7)
            long r8 = android.os.SystemClock.elapsedRealtime()
            long r8 = r8 - r2
            r7.append(r8)
            java.lang.String r2 = r7.toString()
            boolean r3 = r4.a(r0, r6)
            if (r3 == 0) goto L_0x013d
            android.util.Log.v(r0, r2, r5)
        L_0x013d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l.a.a.a.h.call():java.lang.Object");
    }
}
