package o.o0.f;

import javax.annotation.Nullable;
import o.j0;
import o.z;

/* compiled from: CacheInterceptor */
public final class b implements z {
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public final e f5390b;

    public b(@Nullable e eVar) {
        this.f5390b = eVar;
    }

    public static boolean b(String str) {
        return !"Connection".equalsIgnoreCase(str) && !"Keep-Alive".equalsIgnoreCase(str) && !"Proxy-Authenticate".equalsIgnoreCase(str) && !"Proxy-Authorization".equalsIgnoreCase(str) && !"TE".equalsIgnoreCase(str) && !"Trailers".equalsIgnoreCase(str) && !"Transfer-Encoding".equalsIgnoreCase(str) && !"Upgrade".equalsIgnoreCase(str);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [o.j0, o.f0] */
    /* JADX WARNING: type inference failed for: r1v17 */
    /* JADX WARNING: type inference failed for: r1v18 */
    /* JADX WARNING: type inference failed for: r1v26 */
    /* JADX WARNING: type inference failed for: r1v28 */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x014c, code lost:
        if (r4 > 0) goto L_0x014e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x01fc  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x01ff  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0216  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x024e  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x027d  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x028b A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x02bb  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x02d0 A[SYNTHETIC, Splitter:B:141:0x02d0] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01a3  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01b7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public o.j0 a(o.z.a r27) {
        /*
            r26 = this;
            r1 = r26
            o.o0.f.e r0 = r1.f5390b
            if (r0 == 0) goto L_0x0012
            r3 = r27
            o.o0.h.f r3 = (o.o0.h.f) r3
            o.f0 r3 = r3.e
            o.j0 r0 = r0.a((o.f0) r3)
            r3 = r0
            goto L_0x0013
        L_0x0012:
            r3 = 0
        L_0x0013:
            long r4 = java.lang.System.currentTimeMillis()
            r0 = r27
            o.o0.h.f r0 = (o.o0.h.f) r0
            o.f0 r6 = r0.e
            if (r3 == 0) goto L_0x008b
            long r11 = r3.f5334o
            long r13 = r3.f5335p
            o.x r15 = r3.f5329j
            int r7 = r15.b()
            r9 = 0
            r10 = -1
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
        L_0x0037:
            if (r9 >= r7) goto L_0x009c
            java.lang.String r2 = r15.a((int) r9)
            java.lang.String r8 = r15.b((int) r9)
            r22 = r7
            java.lang.String r7 = "Date"
            boolean r7 = r7.equalsIgnoreCase(r2)
            if (r7 == 0) goto L_0x0052
            java.util.Date r16 = o.o0.h.d.a(r8)
            r21 = r8
            goto L_0x0086
        L_0x0052:
            java.lang.String r7 = "Expires"
            boolean r7 = r7.equalsIgnoreCase(r2)
            if (r7 == 0) goto L_0x005f
            java.util.Date r17 = o.o0.h.d.a(r8)
            goto L_0x0086
        L_0x005f:
            java.lang.String r7 = "Last-Modified"
            boolean r7 = r7.equalsIgnoreCase(r2)
            if (r7 == 0) goto L_0x006e
            java.util.Date r18 = o.o0.h.d.a(r8)
            r20 = r8
            goto L_0x0086
        L_0x006e:
            java.lang.String r7 = "ETag"
            boolean r7 = r7.equalsIgnoreCase(r2)
            if (r7 == 0) goto L_0x0079
            r19 = r8
            goto L_0x0086
        L_0x0079:
            java.lang.String r7 = "Age"
            boolean r2 = r7.equalsIgnoreCase(r2)
            if (r2 == 0) goto L_0x0086
            r2 = -1
            int r10 = o.o0.h.e.a(r8, r2)
        L_0x0086:
            int r9 = r9 + 1
            r7 = r22
            goto L_0x0037
        L_0x008b:
            r10 = -1
            r11 = 0
            r13 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
        L_0x009c:
            java.lang.String r2 = "Warning"
            if (r3 != 0) goto L_0x00a7
            o.o0.f.d r4 = new o.o0.f.d
            r8 = 0
            r4.<init>(r6, r8)
            goto L_0x00c9
        L_0x00a7:
            r8 = 0
            o.y r9 = r6.a
            java.lang.String r9 = r9.a
            java.lang.String r15 = "https"
            boolean r9 = r9.equals(r15)
            if (r9 == 0) goto L_0x00be
            o.w r9 = r3.f5328i
            if (r9 != 0) goto L_0x00be
            o.o0.f.d r4 = new o.o0.f.d
            r4.<init>(r6, r8)
            goto L_0x00c9
        L_0x00be:
            boolean r9 = o.o0.f.d.a(r3, r6)
            if (r9 != 0) goto L_0x00cf
            o.o0.f.d r4 = new o.o0.f.d
            r4.<init>(r6, r8)
        L_0x00c9:
            r25 = r0
            r0 = r6
        L_0x00cc:
            r1 = 0
            goto L_0x0262
        L_0x00cf:
            o.i r8 = r6.a()
            boolean r9 = r8.a
            if (r9 != 0) goto L_0x0259
            o.x r9 = r6.c
            java.lang.String r15 = "If-Modified-Since"
            java.lang.String r9 = r9.a((java.lang.String) r15)
            java.lang.String r7 = "If-None-Match"
            if (r9 != 0) goto L_0x00ee
            o.x r9 = r6.c
            java.lang.String r9 = r9.a((java.lang.String) r7)
            if (r9 == 0) goto L_0x00ec
            goto L_0x00ee
        L_0x00ec:
            r9 = 0
            goto L_0x00ef
        L_0x00ee:
            r9 = 1
        L_0x00ef:
            if (r9 == 0) goto L_0x00f3
            goto L_0x0259
        L_0x00f3:
            o.i r9 = r3.a()
            if (r16 == 0) goto L_0x010c
            long r23 = r16.getTime()
            r25 = r0
            long r0 = r13 - r23
            r23 = r6
            r24 = r7
            r6 = 0
            long r0 = java.lang.Math.max(r6, r0)
            goto L_0x0114
        L_0x010c:
            r25 = r0
            r23 = r6
            r24 = r7
            r0 = 0
        L_0x0114:
            r6 = -1
            if (r10 == r6) goto L_0x0124
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS
            r7 = r9
            long r9 = (long) r10
            long r9 = r6.toMillis(r9)
            long r0 = java.lang.Math.max(r0, r9)
            goto L_0x0125
        L_0x0124:
            r7 = r9
        L_0x0125:
            long r9 = r13 - r11
            long r4 = r4 - r13
            long r0 = r0 + r9
            long r0 = r0 + r4
            o.i r4 = r3.a()
            int r4 = r4.c
            r5 = -1
            if (r4 == r5) goto L_0x013b
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
            long r9 = (long) r4
            long r4 = r5.toMillis(r9)
            goto L_0x014e
        L_0x013b:
            if (r17 == 0) goto L_0x0152
            if (r16 == 0) goto L_0x0143
            long r13 = r16.getTime()
        L_0x0143:
            long r4 = r17.getTime()
            long r4 = r4 - r13
            r9 = 0
            int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r6 <= 0) goto L_0x0184
        L_0x014e:
            r9 = r4
            r4 = 0
            goto L_0x0187
        L_0x0152:
            if (r18 == 0) goto L_0x0184
            o.f0 r4 = r3.e
            o.y r4 = r4.a
            java.util.List<java.lang.String> r5 = r4.f5625g
            if (r5 != 0) goto L_0x015e
            r4 = 0
            goto L_0x016c
        L_0x015e:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.util.List<java.lang.String> r4 = r4.f5625g
            o.y.a((java.lang.StringBuilder) r5, (java.util.List<java.lang.String>) r4)
            java.lang.String r4 = r5.toString()
        L_0x016c:
            if (r4 != 0) goto L_0x0184
            if (r16 == 0) goto L_0x0174
            long r11 = r16.getTime()
        L_0x0174:
            long r4 = r18.getTime()
            long r11 = r11 - r4
            r4 = 0
            int r6 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x0186
            r9 = 10
            long r9 = r11 / r9
            goto L_0x0187
        L_0x0184:
            r4 = 0
        L_0x0186:
            r9 = r4
        L_0x0187:
            int r6 = r8.c
            r11 = -1
            if (r6 == r11) goto L_0x0197
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.SECONDS
            long r13 = (long) r6
            long r12 = r12.toMillis(r13)
            long r9 = java.lang.Math.min(r9, r12)
        L_0x0197:
            int r6 = r8.f5316i
            if (r6 == r11) goto L_0x01a3
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.SECONDS
            long r13 = (long) r6
            long r12 = r12.toMillis(r13)
            goto L_0x01a4
        L_0x01a3:
            r12 = r4
        L_0x01a4:
            boolean r6 = r7.f5314g
            if (r6 != 0) goto L_0x01b3
            int r6 = r8.f5315h
            if (r6 == r11) goto L_0x01b3
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS
            long r5 = (long) r6
            long r4 = r4.toMillis(r5)
        L_0x01b3:
            boolean r6 = r7.a
            if (r6 != 0) goto L_0x01fa
            long r12 = r12 + r0
            long r4 = r4 + r9
            int r6 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x01fa
            o.j0$a r4 = new o.j0$a
            r4.<init>(r3)
            int r5 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r5 < 0) goto L_0x01cd
            o.x$a r5 = r4.f5338f
            java.lang.String r6 = "110 HttpURLConnection \"Response is stale\""
            r5.a(r2, r6)
        L_0x01cd:
            r5 = 86400000(0x5265c00, double:4.2687272E-316)
            int r7 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x01eb
            o.i r0 = r3.a()
            int r0 = r0.c
            r1 = -1
            if (r0 != r1) goto L_0x01e1
            if (r17 != 0) goto L_0x01e1
            r0 = 1
            goto L_0x01e2
        L_0x01e1:
            r0 = 0
        L_0x01e2:
            if (r0 == 0) goto L_0x01eb
            o.x$a r0 = r4.f5338f
            java.lang.String r1 = "113 HttpURLConnection \"Heuristic expiration\""
            r0.a(r2, r1)
        L_0x01eb:
            o.o0.f.d r0 = new o.o0.f.d
            o.j0 r1 = r4.a()
            r4 = 0
            r0.<init>(r4, r1)
            r1 = r4
            r4 = r0
            r0 = r23
            goto L_0x0262
        L_0x01fa:
            if (r19 == 0) goto L_0x01ff
            r15 = r24
            goto L_0x0208
        L_0x01ff:
            if (r18 == 0) goto L_0x0204
            r19 = r20
            goto L_0x0208
        L_0x0204:
            if (r16 == 0) goto L_0x0250
            r19 = r21
        L_0x0208:
            r0 = r23
            o.x r1 = r0.c
            o.x$a r1 = r1.a()
            o.o0.c r4 = o.o0.c.a
            o.c0$a r4 = (o.c0.a) r4
            if (r4 == 0) goto L_0x024e
            java.util.List<java.lang.String> r4 = r1.a
            r4.add(r15)
            java.util.List<java.lang.String> r4 = r1.a
            java.lang.String r5 = r19.trim()
            r4.add(r5)
            o.f0$a r4 = new o.f0$a
            r4.<init>(r0)
            java.util.List<java.lang.String> r1 = r1.a
            int r5 = r1.size()
            java.lang.String[] r5 = new java.lang.String[r5]
            java.lang.Object[] r1 = r1.toArray(r5)
            java.lang.String[] r1 = (java.lang.String[]) r1
            o.x$a r5 = new o.x$a
            r5.<init>()
            java.util.List<java.lang.String> r6 = r5.a
            java.util.Collections.addAll(r6, r1)
            r4.c = r5
            o.f0 r1 = r4.a()
            o.o0.f.d r4 = new o.o0.f.d
            r4.<init>(r1, r3)
            goto L_0x00cc
        L_0x024e:
            r1 = 0
            throw r1
        L_0x0250:
            r0 = r23
            r1 = 0
            o.o0.f.d r4 = new o.o0.f.d
            r4.<init>(r0, r1)
            goto L_0x0262
        L_0x0259:
            r25 = r0
            r0 = r6
            r1 = 0
            o.o0.f.d r4 = new o.o0.f.d
            r4.<init>(r0, r1)
        L_0x0262:
            o.f0 r5 = r4.a
            if (r5 == 0) goto L_0x0273
            o.i r0 = r0.a()
            boolean r0 = r0.f5317j
            if (r0 == 0) goto L_0x0273
            o.o0.f.d r4 = new o.o0.f.d
            r4.<init>(r1, r1)
        L_0x0273:
            o.f0 r0 = r4.a
            o.j0 r1 = r4.f5391b
            r5 = r26
            o.o0.f.e r6 = r5.f5390b
            if (r6 == 0) goto L_0x0280
            r6.a((o.o0.f.d) r4)
        L_0x0280:
            if (r3 == 0) goto L_0x0289
            if (r1 != 0) goto L_0x0289
            o.l0 r4 = r3.f5330k
            o.o0.e.a((java.io.Closeable) r4)
        L_0x0289:
            if (r0 != 0) goto L_0x02b7
            if (r1 != 0) goto L_0x02b7
            o.j0$a r0 = new o.j0$a
            r0.<init>()
            r4 = r25
            o.f0 r1 = r4.e
            r0.a = r1
            o.d0 r1 = o.d0.HTTP_1_1
            r0.f5337b = r1
            r1 = 504(0x1f8, float:7.06E-43)
            r0.c = r1
            java.lang.String r1 = "Unsatisfiable Request (only-if-cached)"
            r0.d = r1
            o.l0 r1 = o.o0.e.d
            r0.f5339g = r1
            r1 = -1
            r0.f5343k = r1
            long r1 = java.lang.System.currentTimeMillis()
            r0.f5344l = r1
            o.j0 r0 = r0.a()
            return r0
        L_0x02b7:
            r4 = r25
            if (r0 != 0) goto L_0x02d0
            if (r1 == 0) goto L_0x02ce
            o.j0$a r0 = new o.j0$a
            r0.<init>(r1)
            o.j0 r1 = a((o.j0) r1)
            r0.a((o.j0) r1)
            o.j0 r0 = r0.a()
            return r0
        L_0x02ce:
            r0 = 0
            throw r0
        L_0x02d0:
            o.o0.g.j r6 = r4.f5447b     // Catch:{ all -> 0x044e }
            o.o0.g.d r7 = r4.c     // Catch:{ all -> 0x044e }
            o.j0 r4 = r4.a(r0, r6, r7)     // Catch:{ all -> 0x044e }
            if (r4 != 0) goto L_0x02e1
            if (r3 == 0) goto L_0x02e1
            o.l0 r3 = r3.f5330k
            o.o0.e.a((java.io.Closeable) r3)
        L_0x02e1:
            java.lang.String r3 = "networkResponse"
            if (r1 == 0) goto L_0x03a1
            int r6 = r4.f5326g
            r7 = 304(0x130, float:4.26E-43)
            if (r6 != r7) goto L_0x039c
            o.j0$a r0 = new o.j0$a
            r0.<init>(r1)
            o.x r6 = r1.f5329j
            o.x r7 = r4.f5329j
            o.x$a r8 = new o.x$a
            r8.<init>()
            int r9 = r6.b()
            r10 = 0
        L_0x02fe:
            if (r10 >= r9) goto L_0x0331
            java.lang.String r11 = r6.a((int) r10)
            java.lang.String r12 = r6.b((int) r10)
            boolean r13 = r2.equalsIgnoreCase(r11)
            if (r13 == 0) goto L_0x0317
            java.lang.String r13 = "1"
            boolean r13 = r12.startsWith(r13)
            if (r13 == 0) goto L_0x0317
            goto L_0x032e
        L_0x0317:
            boolean r13 = a((java.lang.String) r11)
            if (r13 != 0) goto L_0x0329
            boolean r13 = b(r11)
            if (r13 == 0) goto L_0x0329
            java.lang.String r13 = r7.a((java.lang.String) r11)
            if (r13 != 0) goto L_0x032e
        L_0x0329:
            o.o0.c r13 = o.o0.c.a
            r13.a(r8, r11, r12)
        L_0x032e:
            int r10 = r10 + 1
            goto L_0x02fe
        L_0x0331:
            int r2 = r7.b()
            r6 = 0
        L_0x0336:
            if (r6 >= r2) goto L_0x0354
            java.lang.String r9 = r7.a((int) r6)
            boolean r10 = a((java.lang.String) r9)
            if (r10 != 0) goto L_0x0351
            boolean r10 = b(r9)
            if (r10 == 0) goto L_0x0351
            o.o0.c r10 = o.o0.c.a
            java.lang.String r11 = r7.b((int) r6)
            r10.a(r8, r9, r11)
        L_0x0351:
            int r6 = r6 + 1
            goto L_0x0336
        L_0x0354:
            java.util.List<java.lang.String> r2 = r8.a
            int r6 = r2.size()
            java.lang.String[] r6 = new java.lang.String[r6]
            java.lang.Object[] r2 = r2.toArray(r6)
            java.lang.String[] r2 = (java.lang.String[]) r2
            o.x$a r6 = new o.x$a
            r6.<init>()
            java.util.List<java.lang.String> r7 = r6.a
            java.util.Collections.addAll(r7, r2)
            r0.f5338f = r6
            long r6 = r4.f5334o
            r0.f5343k = r6
            long r6 = r4.f5335p
            r0.f5344l = r6
            o.j0 r2 = a((o.j0) r1)
            r0.a((o.j0) r2)
            o.j0 r2 = a((o.j0) r4)
            if (r2 == 0) goto L_0x0386
            r0.a(r3, r2)
        L_0x0386:
            r0.f5340h = r2
            o.j0 r0 = r0.a()
            o.l0 r2 = r4.f5330k
            r2.close()
            o.o0.f.e r2 = r5.f5390b
            r2.a()
            o.o0.f.e r2 = r5.f5390b
            r2.a(r1, r0)
            return r0
        L_0x039c:
            o.l0 r2 = r1.f5330k
            o.o0.e.a((java.io.Closeable) r2)
        L_0x03a1:
            if (r4 == 0) goto L_0x044c
            o.j0$a r2 = new o.j0$a
            r2.<init>(r4)
            o.j0 r1 = a((o.j0) r1)
            r2.a((o.j0) r1)
            o.j0 r1 = a((o.j0) r4)
            if (r1 == 0) goto L_0x03b8
            r2.a(r3, r1)
        L_0x03b8:
            r2.f5340h = r1
            o.j0 r1 = r2.a()
            o.o0.f.e r2 = r5.f5390b
            if (r2 == 0) goto L_0x044b
            boolean r2 = o.o0.h.e.b(r1)
            if (r2 == 0) goto L_0x0416
            boolean r2 = o.o0.f.d.a(r1, r0)
            if (r2 == 0) goto L_0x0416
            o.o0.f.e r0 = r5.f5390b
            o.o0.f.c r0 = r0.a((o.j0) r1)
            if (r0 != 0) goto L_0x03d7
            goto L_0x0415
        L_0x03d7:
            p.z r2 = r0.b()
            if (r2 != 0) goto L_0x03de
            goto L_0x0415
        L_0x03de:
            o.l0 r3 = r1.f5330k
            p.h r3 = r3.h()
            p.g r2 = p.r.a((p.z) r2)
            o.o0.f.a r4 = new o.o0.f.a
            r4.<init>(r5, r3, r0, r2)
            o.x r0 = r1.f5329j
            java.lang.String r2 = "Content-Type"
            java.lang.String r0 = r0.a((java.lang.String) r2)
            if (r0 == 0) goto L_0x03f9
            r2 = r0
            goto L_0x03fa
        L_0x03f9:
            r2 = 0
        L_0x03fa:
            o.l0 r0 = r1.f5330k
            long r6 = r0.a()
            o.j0$a r0 = new o.j0$a
            r0.<init>(r1)
            o.o0.h.g r1 = new o.o0.h.g
            p.v r3 = new p.v
            r3.<init>(r4)
            r1.<init>(r2, r6, r3)
            r0.f5339g = r1
            o.j0 r1 = r0.a()
        L_0x0415:
            return r1
        L_0x0416:
            java.lang.String r2 = r0.f5307b
            java.lang.String r3 = "POST"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L_0x0443
            java.lang.String r3 = "PATCH"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L_0x0443
            java.lang.String r3 = "PUT"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L_0x0443
            java.lang.String r3 = "DELETE"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L_0x0443
            java.lang.String r3 = "MOVE"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0441
            goto L_0x0443
        L_0x0441:
            r7 = 0
            goto L_0x0444
        L_0x0443:
            r7 = 1
        L_0x0444:
            if (r7 == 0) goto L_0x044b
            o.o0.f.e r2 = r5.f5390b     // Catch:{ IOException -> 0x044b }
            r2.b(r0)     // Catch:{ IOException -> 0x044b }
        L_0x044b:
            return r1
        L_0x044c:
            r0 = 0
            throw r0
        L_0x044e:
            r0 = move-exception
            if (r3 == 0) goto L_0x0456
            o.l0 r1 = r3.f5330k
            o.o0.e.a((java.io.Closeable) r1)
        L_0x0456:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.o0.f.b.a(o.z$a):o.j0");
    }

    public static j0 a(j0 j0Var) {
        if (j0Var == null || j0Var.f5330k == null) {
            return j0Var;
        }
        j0.a aVar = new j0.a(j0Var);
        aVar.f5339g = null;
        return aVar.a();
    }

    public static boolean a(String str) {
        return "Content-Length".equalsIgnoreCase(str) || "Content-Encoding".equalsIgnoreCase(str) || "Content-Type".equalsIgnoreCase(str);
    }
}
