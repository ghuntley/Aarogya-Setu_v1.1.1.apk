package i.c.d.o;

import java.util.concurrent.Callable;

/* compiled from: com.google.firebase:firebase-messaging@@20.1.3 */
public final /* synthetic */ class n implements Callable {
    public final o e;

    public n(o oVar) {
        this.e = oVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0088, code lost:
        if (r3.read() != -1) goto L_0x0120;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008a, code lost:
        r3 = i.c.a.b.g.e.f.a(r5, 2147483639);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0127, code lost:
        throw new java.lang.OutOfMemoryError("input is too large to fit in a byte array");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r14 = this;
            i.c.d.o.o r0 = r14.e
            java.net.URL r1 = r0.e
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r2 = r1.length()
            int r2 = r2 + 22
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            java.lang.String r2 = "Starting download of: "
            r3.append(r2)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            java.lang.String r2 = "FirebaseMessaging"
            android.util.Log.i(r2, r1)
            java.net.URL r1 = r0.e
            java.net.URLConnection r1 = r1.openConnection()
            int r3 = r1.getContentLength()
            r4 = 1048576(0x100000, float:1.469368E-39)
            if (r3 > r4) goto L_0x0136
            java.io.InputStream r1 = r1.getInputStream()
            r0.f4768g = r1     // Catch:{ all -> 0x0128 }
            java.io.InputStream r3 = i.c.a.b.g.e.f.a(r1)     // Catch:{ all -> 0x0128 }
            java.util.ArrayDeque r5 = new java.util.ArrayDeque     // Catch:{ all -> 0x0128 }
            r6 = 20
            r5.<init>(r6)     // Catch:{ all -> 0x0128 }
            r6 = 8192(0x2000, float:1.14794E-41)
            r7 = 0
            r8 = 0
        L_0x0047:
            r9 = -1
            r10 = 2147483639(0x7ffffff7, float:NaN)
            if (r8 >= r10) goto L_0x0084
            int r10 = r10 - r8
            int r10 = java.lang.Math.min(r6, r10)     // Catch:{ all -> 0x0128 }
            byte[] r11 = new byte[r10]     // Catch:{ all -> 0x0128 }
            r5.add(r11)     // Catch:{ all -> 0x0128 }
            r12 = 0
        L_0x0058:
            if (r12 >= r10) goto L_0x006a
            int r13 = r10 - r12
            int r13 = r3.read(r11, r12, r13)     // Catch:{ all -> 0x0128 }
            if (r13 != r9) goto L_0x0067
            byte[] r3 = i.c.a.b.g.e.f.a(r5, r8)     // Catch:{ all -> 0x0128 }
            goto L_0x008e
        L_0x0067:
            int r12 = r12 + r13
            int r8 = r8 + r13
            goto L_0x0058
        L_0x006a:
            long r9 = (long) r6     // Catch:{ all -> 0x0128 }
            r6 = 1
            long r9 = r9 << r6
            r11 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r6 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r6 <= 0) goto L_0x0078
            r6 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x0047
        L_0x0078:
            r11 = -2147483648(0xffffffff80000000, double:NaN)
            int r6 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r6 >= 0) goto L_0x0082
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x0047
        L_0x0082:
            int r6 = (int) r9     // Catch:{ all -> 0x0128 }
            goto L_0x0047
        L_0x0084:
            int r3 = r3.read()     // Catch:{ all -> 0x0128 }
            if (r3 != r9) goto L_0x0120
            byte[] r3 = i.c.a.b.g.e.f.a(r5, r10)     // Catch:{ all -> 0x0128 }
        L_0x008e:
            if (r1 == 0) goto L_0x0093
            r1.close()
        L_0x0093:
            r1 = 2
            boolean r1 = android.util.Log.isLoggable(r2, r1)
            if (r1 == 0) goto L_0x00c3
            int r1 = r3.length
            java.net.URL r5 = r0.e
            java.lang.String r5 = java.lang.String.valueOf(r5)
            int r6 = r5.length()
            int r6 = r6 + 34
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r6)
            java.lang.String r6 = "Downloaded "
            r8.append(r6)
            r8.append(r1)
            java.lang.String r1 = " bytes from "
            r8.append(r1)
            r8.append(r5)
            java.lang.String r1 = r8.toString()
            android.util.Log.v(r2, r1)
        L_0x00c3:
            int r1 = r3.length
            if (r1 > r4) goto L_0x0118
            int r1 = r3.length
            android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeByteArray(r3, r7, r1)
            if (r1 == 0) goto L_0x00f5
            r3 = 3
            boolean r3 = android.util.Log.isLoggable(r2, r3)
            if (r3 == 0) goto L_0x00f4
            java.net.URL r0 = r0.e
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r3 = r0.length()
            int r3 = r3 + 31
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            java.lang.String r3 = "Successfully downloaded image: "
            r4.append(r3)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            android.util.Log.d(r2, r0)
        L_0x00f4:
            return r1
        L_0x00f5:
            java.io.IOException r1 = new java.io.IOException
            java.net.URL r0 = r0.e
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r2 = r0.length()
            int r2 = r2 + 24
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            java.lang.String r2 = "Failed to decode image: "
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r1.<init>(r0)
            throw r1
        L_0x0118:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Image exceeds max size of 1048576"
            r0.<init>(r1)
            throw r0
        L_0x0120:
            java.lang.OutOfMemoryError r0 = new java.lang.OutOfMemoryError     // Catch:{ all -> 0x0128 }
            java.lang.String r2 = "input is too large to fit in a byte array"
            r0.<init>(r2)     // Catch:{ all -> 0x0128 }
            throw r0     // Catch:{ all -> 0x0128 }
        L_0x0128:
            r0 = move-exception
            if (r1 == 0) goto L_0x0135
            r1.close()     // Catch:{ all -> 0x012f }
            goto L_0x0135
        L_0x012f:
            r1 = move-exception
            i.c.a.b.g.e.k r2 = i.c.a.b.g.e.i.a
            r2.a(r0, r1)
        L_0x0135:
            throw r0
        L_0x0136:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Content-Length exceeds max size of 1048576"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.d.o.n.call():java.lang.Object");
    }
}
