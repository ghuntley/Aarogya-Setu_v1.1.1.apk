package i.c.a.b.i.a;

import i.c.a.b.d.l.q;
import java.net.URL;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
public final class w4 implements Runnable {
    public final URL e;

    /* renamed from: f  reason: collision with root package name */
    public final byte[] f3921f;

    /* renamed from: g  reason: collision with root package name */
    public final u4 f3922g;

    /* renamed from: h  reason: collision with root package name */
    public final String f3923h;

    /* renamed from: i  reason: collision with root package name */
    public final Map<String, String> f3924i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ s4 f3925j;

    public w4(s4 s4Var, String str, URL url, byte[] bArr, Map<String, String> map, u4 u4Var) {
        this.f3925j = s4Var;
        q.b(str);
        q.a(url);
        q.a(u4Var);
        this.e = url;
        this.f3921f = bArr;
        this.f3922g = u4Var;
        this.f3923h = str;
        this.f3924i = map;
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00d8 A[SYNTHETIC, Splitter:B:45:0x00d8] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x011c A[SYNTHETIC, Splitter:B:58:0x011c] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0134  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r14 = this;
            java.lang.String r0 = "Error closing HTTP compressed POST connection output stream. appId"
            java.lang.String r1 = "Task exception on worker thread"
            i.c.a.b.i.a.s4 r2 = r14.f3925j
            r2.b()
            r2 = 0
            r3 = 0
            i.c.a.b.i.a.s4 r4 = r14.f3925j     // Catch:{ IOException -> 0x0115, all -> 0x00d1 }
            java.net.URL r5 = r14.e     // Catch:{ IOException -> 0x0115, all -> 0x00d1 }
            java.net.HttpURLConnection r4 = r4.a((java.net.URL) r5)     // Catch:{ IOException -> 0x0115, all -> 0x00d1 }
            java.util.Map<java.lang.String, java.lang.String> r5 = r14.f3924i     // Catch:{ IOException -> 0x00ce, all -> 0x00cb }
            if (r5 == 0) goto L_0x003d
            java.util.Map<java.lang.String, java.lang.String> r5 = r14.f3924i     // Catch:{ IOException -> 0x00ce, all -> 0x00cb }
            java.util.Set r5 = r5.entrySet()     // Catch:{ IOException -> 0x00ce, all -> 0x00cb }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ IOException -> 0x00ce, all -> 0x00cb }
        L_0x0021:
            boolean r6 = r5.hasNext()     // Catch:{ IOException -> 0x00ce, all -> 0x00cb }
            if (r6 == 0) goto L_0x003d
            java.lang.Object r6 = r5.next()     // Catch:{ IOException -> 0x00ce, all -> 0x00cb }
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6     // Catch:{ IOException -> 0x00ce, all -> 0x00cb }
            java.lang.Object r7 = r6.getKey()     // Catch:{ IOException -> 0x00ce, all -> 0x00cb }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ IOException -> 0x00ce, all -> 0x00cb }
            java.lang.Object r6 = r6.getValue()     // Catch:{ IOException -> 0x00ce, all -> 0x00cb }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ IOException -> 0x00ce, all -> 0x00cb }
            r4.addRequestProperty(r7, r6)     // Catch:{ IOException -> 0x00ce, all -> 0x00cb }
            goto L_0x0021
        L_0x003d:
            byte[] r5 = r14.f3921f     // Catch:{ IOException -> 0x00ce, all -> 0x00cb }
            if (r5 == 0) goto L_0x0088
            i.c.a.b.i.a.s4 r5 = r14.f3925j     // Catch:{ IOException -> 0x00ce, all -> 0x00cb }
            i.c.a.b.i.a.x9 r5 = r5.q()     // Catch:{ IOException -> 0x00ce, all -> 0x00cb }
            byte[] r6 = r14.f3921f     // Catch:{ IOException -> 0x00ce, all -> 0x00cb }
            byte[] r5 = r5.c(r6)     // Catch:{ IOException -> 0x00ce, all -> 0x00cb }
            i.c.a.b.i.a.s4 r6 = r14.f3925j     // Catch:{ IOException -> 0x00ce, all -> 0x00cb }
            i.c.a.b.i.a.m4 r6 = r6.n()     // Catch:{ IOException -> 0x00ce, all -> 0x00cb }
            i.c.a.b.i.a.o4 r6 = r6.f3766n     // Catch:{ IOException -> 0x00ce, all -> 0x00cb }
            java.lang.String r7 = "Uploading data. size"
            int r8 = r5.length     // Catch:{ IOException -> 0x00ce, all -> 0x00cb }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ IOException -> 0x00ce, all -> 0x00cb }
            r6.a(r7, r8)     // Catch:{ IOException -> 0x00ce, all -> 0x00cb }
            r6 = 1
            r4.setDoOutput(r6)     // Catch:{ IOException -> 0x00ce, all -> 0x00cb }
            java.lang.String r6 = "Content-Encoding"
            java.lang.String r7 = "gzip"
            r4.addRequestProperty(r6, r7)     // Catch:{ IOException -> 0x00ce, all -> 0x00cb }
            int r6 = r5.length     // Catch:{ IOException -> 0x00ce, all -> 0x00cb }
            r4.setFixedLengthStreamingMode(r6)     // Catch:{ IOException -> 0x00ce, all -> 0x00cb }
            r4.connect()     // Catch:{ IOException -> 0x00ce, all -> 0x00cb }
            java.io.OutputStream r6 = r4.getOutputStream()     // Catch:{ IOException -> 0x00ce, all -> 0x00cb }
            r6.write(r5)     // Catch:{ IOException -> 0x0082, all -> 0x007c }
            r6.close()     // Catch:{ IOException -> 0x0082, all -> 0x007c }
            goto L_0x0088
        L_0x007c:
            r5 = move-exception
            r11 = r2
            r3 = r5
            r2 = r6
            goto L_0x00d5
        L_0x0082:
            r5 = move-exception
            r11 = r2
            r9 = r5
            r2 = r6
            goto L_0x0119
        L_0x0088:
            int r9 = r4.getResponseCode()     // Catch:{ IOException -> 0x00ce, all -> 0x00cb }
            java.util.Map r12 = r4.getHeaderFields()     // Catch:{ IOException -> 0x00c6, all -> 0x00c1 }
            byte[] r11 = i.c.a.b.i.a.s4.a((java.net.HttpURLConnection) r4)     // Catch:{ IOException -> 0x00bd, all -> 0x00b8 }
            r4.disconnect()
            i.c.a.b.i.a.s4 r0 = r14.f3925j
            i.c.a.b.i.a.m5 r0 = r0.k()
            i.c.a.b.i.a.t4 r2 = new i.c.a.b.i.a.t4
            java.lang.String r7 = r14.f3923h
            i.c.a.b.i.a.u4 r8 = r14.f3922g
            r10 = 0
            r13 = 0
            r6 = r2
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            r0.o()
            i.c.a.b.d.l.q.a(r2)
            i.c.a.b.i.a.q5 r3 = new i.c.a.b.i.a.q5
            r3.<init>(r0, r2, r1)
            r0.a((i.c.a.b.i.a.q5<?>) r3)
            return
        L_0x00b8:
            r5 = move-exception
            r3 = r5
            r8 = r9
            r11 = r12
            goto L_0x00d6
        L_0x00bd:
            r5 = move-exception
            r8 = r9
            r11 = r12
            goto L_0x00c9
        L_0x00c1:
            r5 = move-exception
            r11 = r2
            r3 = r5
            r8 = r9
            goto L_0x00d6
        L_0x00c6:
            r5 = move-exception
            r11 = r2
            r8 = r9
        L_0x00c9:
            r9 = r5
            goto L_0x011a
        L_0x00cb:
            r5 = move-exception
            r11 = r2
            goto L_0x00d4
        L_0x00ce:
            r5 = move-exception
            r11 = r2
            goto L_0x0118
        L_0x00d1:
            r5 = move-exception
            r4 = r2
            r11 = r4
        L_0x00d4:
            r3 = r5
        L_0x00d5:
            r8 = 0
        L_0x00d6:
            if (r2 == 0) goto L_0x00ee
            r2.close()     // Catch:{ IOException -> 0x00dc }
            goto L_0x00ee
        L_0x00dc:
            r2 = move-exception
            i.c.a.b.i.a.s4 r5 = r14.f3925j
            i.c.a.b.i.a.m4 r5 = r5.n()
            i.c.a.b.i.a.o4 r5 = r5.f3758f
            java.lang.String r6 = r14.f3923h
            java.lang.Object r6 = i.c.a.b.i.a.m4.a((java.lang.String) r6)
            r5.a(r0, r6, r2)
        L_0x00ee:
            if (r4 == 0) goto L_0x00f3
            r4.disconnect()
        L_0x00f3:
            i.c.a.b.i.a.s4 r0 = r14.f3925j
            i.c.a.b.i.a.m5 r0 = r0.k()
            i.c.a.b.i.a.t4 r2 = new i.c.a.b.i.a.t4
            java.lang.String r6 = r14.f3923h
            i.c.a.b.i.a.u4 r7 = r14.f3922g
            r9 = 0
            r10 = 0
            r12 = 0
            r5 = r2
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r0.o()
            i.c.a.b.d.l.q.a(r2)
            i.c.a.b.i.a.q5 r4 = new i.c.a.b.i.a.q5
            r4.<init>(r0, r2, r1)
            r0.a((i.c.a.b.i.a.q5<?>) r4)
            throw r3
        L_0x0115:
            r5 = move-exception
            r4 = r2
            r11 = r4
        L_0x0118:
            r9 = r5
        L_0x0119:
            r8 = 0
        L_0x011a:
            if (r2 == 0) goto L_0x0132
            r2.close()     // Catch:{ IOException -> 0x0120 }
            goto L_0x0132
        L_0x0120:
            r2 = move-exception
            i.c.a.b.i.a.s4 r3 = r14.f3925j
            i.c.a.b.i.a.m4 r3 = r3.n()
            i.c.a.b.i.a.o4 r3 = r3.f3758f
            java.lang.String r5 = r14.f3923h
            java.lang.Object r5 = i.c.a.b.i.a.m4.a((java.lang.String) r5)
            r3.a(r0, r5, r2)
        L_0x0132:
            if (r4 == 0) goto L_0x0137
            r4.disconnect()
        L_0x0137:
            i.c.a.b.i.a.s4 r0 = r14.f3925j
            i.c.a.b.i.a.m5 r0 = r0.k()
            i.c.a.b.i.a.t4 r2 = new i.c.a.b.i.a.t4
            java.lang.String r6 = r14.f3923h
            i.c.a.b.i.a.u4 r7 = r14.f3922g
            r10 = 0
            r12 = 0
            r5 = r2
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r0.o()
            i.c.a.b.d.l.q.a(r2)
            i.c.a.b.i.a.q5 r3 = new i.c.a.b.i.a.q5
            r3.<init>(r0, r2, r1)
            r0.a((i.c.a.b.i.a.q5<?>) r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.a.b.i.a.w4.run():void");
    }
}
