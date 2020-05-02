package o.o0.h;

import o.z;

/* compiled from: CallServerInterceptor */
public final class b implements z {

    /* renamed from: b  reason: collision with root package name */
    public final boolean f5445b;

    public b(boolean z) {
        this.f5445b = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x013d, code lost:
        if ("close".equalsIgnoreCase(r3) != false) goto L_0x013f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public o.j0 a(o.z.a r10) {
        /*
            r9 = this;
            o.o0.h.f r10 = (o.o0.h.f) r10
            o.o0.g.d r0 = r10.c
            if (r0 == 0) goto L_0x01c5
            o.f0 r10 = r10.e
            long r1 = java.lang.System.currentTimeMillis()
            r3 = 0
            o.u r4 = r0.c     // Catch:{ IOException -> 0x01b0 }
            if (r4 == 0) goto L_0x01af
            o.o0.h.c r4 = r0.e     // Catch:{ IOException -> 0x01b0 }
            r4.a((o.f0) r10)     // Catch:{ IOException -> 0x01b0 }
            o.u r4 = r0.c     // Catch:{ IOException -> 0x01b0 }
            if (r4 == 0) goto L_0x01ae
            java.lang.String r4 = r10.f5307b
            boolean r4 = i.c.d.p.e.b((java.lang.String) r4)
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L_0x007b
            o.i0 r4 = r10.d
            if (r4 == 0) goto L_0x007b
            o.x r4 = r10.c
            java.lang.String r7 = "Expect"
            java.lang.String r4 = r4.a((java.lang.String) r7)
            java.lang.String r7 = "100-continue"
            boolean r4 = r7.equalsIgnoreCase(r4)
            if (r4 == 0) goto L_0x0046
            r0.b()
            o.u r4 = r0.c
            if (r4 == 0) goto L_0x0045
            o.j0$a r4 = r0.a(r5)
            r7 = 1
            goto L_0x0048
        L_0x0045:
            throw r3
        L_0x0046:
            r4 = r3
            r7 = 0
        L_0x0048:
            if (r4 != 0) goto L_0x0062
            o.i0 r5 = r10.d
            if (r5 == 0) goto L_0x0061
            p.z r5 = r0.a(r10, r6)
            p.g r5 = p.r.a((p.z) r5)
            o.i0 r8 = r10.d
            r8.a(r5)
            p.u r5 = (p.u) r5
            r5.close()
            goto L_0x0082
        L_0x0061:
            throw r3
        L_0x0062:
            o.o0.g.j r8 = r0.a
            r8.a(r0, r5, r6, r3)
            o.o0.g.f r5 = r0.a()
            boolean r5 = r5.a()
            if (r5 != 0) goto L_0x0082
            o.o0.h.c r5 = r0.e
            o.o0.g.f r5 = r5.c()
            r5.b()
            goto L_0x0082
        L_0x007b:
            o.o0.g.j r4 = r0.a
            r4.a(r0, r5, r6, r3)
            r4 = r3
            r7 = 0
        L_0x0082:
            o.i0 r5 = r10.d
            o.o0.h.c r5 = r0.e     // Catch:{ IOException -> 0x0199 }
            r5.a()     // Catch:{ IOException -> 0x0199 }
            if (r7 != 0) goto L_0x0091
            o.u r5 = r0.c
            if (r5 == 0) goto L_0x0090
            goto L_0x0091
        L_0x0090:
            throw r3
        L_0x0091:
            if (r4 != 0) goto L_0x0097
            o.j0$a r4 = r0.a(r6)
        L_0x0097:
            r4.a = r10
            o.o0.g.f r5 = r0.a()
            o.w r5 = r5.f5412f
            r4.e = r5
            r4.f5343k = r1
            long r7 = java.lang.System.currentTimeMillis()
            r4.f5344l = r7
            o.j0 r4 = r4.a()
            int r5 = r4.f5326g
            r7 = 100
            if (r5 != r7) goto L_0x00cf
            o.j0$a r4 = r0.a(r6)
            r4.a = r10
            o.o0.g.f r10 = r0.a()
            o.w r10 = r10.f5412f
            r4.e = r10
            r4.f5343k = r1
            long r1 = java.lang.System.currentTimeMillis()
            r4.f5344l = r1
            o.j0 r4 = r4.a()
            int r5 = r4.f5326g
        L_0x00cf:
            o.u r10 = r0.c
            if (r10 == 0) goto L_0x0198
            boolean r10 = r9.f5445b
            if (r10 == 0) goto L_0x00e9
            r10 = 101(0x65, float:1.42E-43)
            if (r5 != r10) goto L_0x00e9
            o.j0$a r10 = new o.j0$a
            r10.<init>(r4)
            o.l0 r1 = o.o0.e.d
            r10.f5339g = r1
            o.j0 r10 = r10.a()
            goto L_0x011e
        L_0x00e9:
            o.j0$a r10 = new o.j0$a
            r10.<init>(r4)
            o.u r1 = r0.c     // Catch:{ IOException -> 0x0183 }
            if (r1 == 0) goto L_0x0182
            java.lang.String r1 = "Content-Type"
            o.x r2 = r4.f5329j     // Catch:{ IOException -> 0x0183 }
            java.lang.String r1 = r2.a((java.lang.String) r1)     // Catch:{ IOException -> 0x0183 }
            if (r1 == 0) goto L_0x00fd
            goto L_0x00fe
        L_0x00fd:
            r1 = r3
        L_0x00fe:
            o.o0.h.c r2 = r0.e     // Catch:{ IOException -> 0x0183 }
            long r6 = r2.a((o.j0) r4)     // Catch:{ IOException -> 0x0183 }
            o.o0.h.c r2 = r0.e     // Catch:{ IOException -> 0x0183 }
            p.a0 r2 = r2.b(r4)     // Catch:{ IOException -> 0x0183 }
            o.o0.g.d$b r4 = new o.o0.g.d$b     // Catch:{ IOException -> 0x0183 }
            r4.<init>(r2, r6)     // Catch:{ IOException -> 0x0183 }
            o.o0.h.g r2 = new o.o0.h.g     // Catch:{ IOException -> 0x0183 }
            p.h r4 = p.r.a((p.a0) r4)     // Catch:{ IOException -> 0x0183 }
            r2.<init>(r1, r6, r4)     // Catch:{ IOException -> 0x0183 }
            r10.f5339g = r2
            o.j0 r10 = r10.a()
        L_0x011e:
            o.f0 r1 = r10.e
            o.x r1 = r1.c
            java.lang.String r2 = "Connection"
            java.lang.String r1 = r1.a((java.lang.String) r2)
            java.lang.String r4 = "close"
            boolean r1 = r4.equalsIgnoreCase(r1)
            if (r1 != 0) goto L_0x013f
            o.x r1 = r10.f5329j
            java.lang.String r1 = r1.a((java.lang.String) r2)
            if (r1 == 0) goto L_0x0139
            r3 = r1
        L_0x0139:
            boolean r1 = r4.equalsIgnoreCase(r3)
            if (r1 == 0) goto L_0x0148
        L_0x013f:
            o.o0.h.c r0 = r0.e
            o.o0.g.f r0 = r0.c()
            r0.b()
        L_0x0148:
            r0 = 204(0xcc, float:2.86E-43)
            if (r5 == r0) goto L_0x0150
            r0 = 205(0xcd, float:2.87E-43)
            if (r5 != r0) goto L_0x015c
        L_0x0150:
            o.l0 r0 = r10.f5330k
            long r0 = r0.a()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L_0x015d
        L_0x015c:
            return r10
        L_0x015d:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "HTTP "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r2 = " had non-zero Content-Length: "
            r1.append(r2)
            o.l0 r10 = r10.f5330k
            long r2 = r10.a()
            r1.append(r2)
            java.lang.String r10 = r1.toString()
            r0.<init>(r10)
            throw r0
        L_0x0182:
            throw r3     // Catch:{ IOException -> 0x0183 }
        L_0x0183:
            r10 = move-exception
            o.u r1 = r0.c
            if (r1 == 0) goto L_0x0197
            o.o0.g.e r1 = r0.d
            r1.d()
            o.o0.h.c r0 = r0.e
            o.o0.g.f r0 = r0.c()
            r0.a((java.io.IOException) r10)
            throw r10
        L_0x0197:
            throw r3
        L_0x0198:
            throw r3
        L_0x0199:
            r10 = move-exception
            o.u r1 = r0.c
            if (r1 == 0) goto L_0x01ad
            o.o0.g.e r1 = r0.d
            r1.d()
            o.o0.h.c r0 = r0.e
            o.o0.g.f r0 = r0.c()
            r0.a((java.io.IOException) r10)
            throw r10
        L_0x01ad:
            throw r3
        L_0x01ae:
            throw r3     // Catch:{ IOException -> 0x01b0 }
        L_0x01af:
            throw r3     // Catch:{ IOException -> 0x01b0 }
        L_0x01b0:
            r10 = move-exception
            o.u r1 = r0.c
            if (r1 == 0) goto L_0x01c4
            o.o0.g.e r1 = r0.d
            r1.d()
            o.o0.h.c r0 = r0.e
            o.o0.g.f r0 = r0.c()
            r0.a((java.io.IOException) r10)
            throw r10
        L_0x01c4:
            throw r3
        L_0x01c5:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r10.<init>()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: o.o0.h.b.a(o.z$a):o.j0");
    }
}
