package o.o0.h;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import o.c0;
import o.f0;
import o.i0;
import o.j0;
import o.o0.g.j;
import o.z;

/* compiled from: RetryAndFollowUpInterceptor */
public final class h implements z {

    /* renamed from: b  reason: collision with root package name */
    public final c0 f5456b;

    public h(c0 c0Var) {
        this.f5456b = c0Var;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v0, resolved type: o.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v1, resolved type: javax.net.ssl.SSLSocketFactory} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v1, resolved type: o.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v2, resolved type: o.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v2, resolved type: javax.net.ssl.HostnameVerifier} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1, types: [o.o0.g.e, java.io.IOException] */
    /* JADX WARNING: type inference failed for: r19v0, types: [javax.net.ssl.HostnameVerifier] */
    /* JADX WARNING: type inference failed for: r3v50 */
    /* JADX WARNING: type inference failed for: r19v3 */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0295, code lost:
        r9.b();
        r12 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0183, code lost:
        if (r4.equals("HEAD") == false) goto L_0x01c3;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x023f  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x0225 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x02a5 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public o.j0 a(o.z.a r27) {
        /*
            r26 = this;
            r1 = r26
            r2 = r27
            o.o0.h.f r2 = (o.o0.h.f) r2
            o.f0 r0 = r2.e
            o.o0.g.j r9 = r2.f5447b
            r3 = 0
            r4 = 0
            r10 = r0
            r11 = r3
            r12 = 0
        L_0x000f:
            o.f0 r0 = r9.f5434g
            r4 = 1
            if (r0 == 0) goto L_0x003e
            o.y r0 = r0.a
            o.y r5 = r10.a
            boolean r0 = o.o0.e.a((o.y) r0, (o.y) r5)
            if (r0 == 0) goto L_0x002a
            o.o0.g.e r0 = r9.f5435h
            boolean r0 = r0.a()
            if (r0 == 0) goto L_0x002a
            r27 = r12
            goto L_0x009a
        L_0x002a:
            o.o0.g.d r0 = r9.f5437j
            if (r0 != 0) goto L_0x0038
            o.o0.g.e r0 = r9.f5435h
            if (r0 == 0) goto L_0x003e
            r9.a((java.io.IOException) r3, (boolean) r4)
            r9.f5435h = r3
            goto L_0x003e
        L_0x0038:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x003e:
            r9.f5434g = r10
            o.o0.g.e r0 = new o.o0.g.e
            o.o0.g.g r5 = r9.f5432b
            o.y r4 = r10.a
            java.lang.String r6 = r4.a
            java.lang.String r7 = "https"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x005f
            o.c0 r3 = r9.a
            javax.net.ssl.SSLSocketFactory r6 = r3.f5272q
            javax.net.ssl.HostnameVerifier r7 = r3.s
            o.l r3 = r3.t
            r20 = r3
            r18 = r6
            r19 = r7
            goto L_0x0065
        L_0x005f:
            r18 = r3
            r19 = r18
            r20 = r19
        L_0x0065:
            o.e r6 = new o.e
            java.lang.String r14 = r4.d
            int r15 = r4.e
            o.c0 r3 = r9.a
            o.t r4 = r3.x
            javax.net.SocketFactory r7 = r3.f5271p
            o.g r8 = r3.u
            java.net.Proxy r13 = r3.f5261f
            r27 = r12
            java.util.List<o.d0> r12 = r3.f5262g
            java.util.List<o.o> r1 = r3.f5263h
            java.net.ProxySelector r3 = r3.f5267l
            r22 = r13
            r13 = r6
            r16 = r4
            r17 = r7
            r21 = r8
            r23 = r12
            r24 = r1
            r25 = r3
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            o.j r7 = r9.c
            o.u r8 = r9.d
            r3 = r0
            r4 = r9
            r3.<init>(r4, r5, r6, r7, r8)
            r9.f5435h = r0
        L_0x009a:
            boolean r0 = r9.d()
            if (r0 != 0) goto L_0x02a5
            r3 = 0
            o.j0 r0 = r2.a(r10, r9, r3)     // Catch:{ RouteException -> 0x0288, IOException -> 0x0274, all -> 0x0270 }
            if (r11 == 0) goto L_0x00cd
            if (r0 == 0) goto L_0x00cc
            o.j0$a r1 = new o.j0$a
            r1.<init>(r0)
            o.j0$a r0 = new o.j0$a
            r0.<init>(r11)
            r0.f5339g = r3
            o.j0 r0 = r0.a()
            o.l0 r3 = r0.f5330k
            if (r3 != 0) goto L_0x00c4
            r1.f5342j = r0
            o.j0 r0 = r1.a()
            goto L_0x00cd
        L_0x00c4:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "priorResponse.body != null"
            r0.<init>(r1)
            throw r0
        L_0x00cc:
            throw r3
        L_0x00cd:
            r11 = r0
            o.o0.c r0 = o.o0.c.a
            o.c0$a r0 = (o.c0.a) r0
            if (r0 == 0) goto L_0x026c
            o.o0.g.d r0 = r11.f5336q
            if (r0 == 0) goto L_0x00df
            o.o0.g.f r1 = r0.a()
            o.m0 r1 = r1.c
            goto L_0x00e0
        L_0x00df:
            r1 = 0
        L_0x00e0:
            int r3 = r11.f5326g
            o.f0 r4 = r11.e
            java.lang.String r4 = r4.f5307b
            r5 = 307(0x133, float:4.3E-43)
            java.lang.String r6 = "GET"
            if (r3 == r5) goto L_0x0175
            r5 = 308(0x134, float:4.32E-43)
            if (r3 == r5) goto L_0x0175
            r5 = 401(0x191, float:5.62E-43)
            if (r3 == r5) goto L_0x016a
            r5 = 503(0x1f7, float:7.05E-43)
            if (r3 == r5) goto L_0x0152
            r5 = 407(0x197, float:5.7E-43)
            if (r3 == r5) goto L_0x012d
            r1 = 408(0x198, float:5.72E-43)
            if (r3 == r1) goto L_0x010c
            switch(r3) {
                case 300: goto L_0x0108;
                case 301: goto L_0x0108;
                case 302: goto L_0x0108;
                case 303: goto L_0x0108;
                default: goto L_0x0103;
            }
        L_0x0103:
            r1 = 0
            r7 = r26
            goto L_0x01c4
        L_0x0108:
            r7 = r26
            goto L_0x0186
        L_0x010c:
            r7 = r26
            o.c0 r3 = r7.f5456b
            boolean r3 = r3.A
            if (r3 != 0) goto L_0x0116
            goto L_0x01c3
        L_0x0116:
            o.j0 r3 = r11.f5333n
            if (r3 == 0) goto L_0x0120
            int r3 = r3.f5326g
            if (r3 != r1) goto L_0x0120
            goto L_0x01c3
        L_0x0120:
            r1 = 0
            int r1 = r7.a(r11, r1)
            if (r1 <= 0) goto L_0x0129
            goto L_0x01c3
        L_0x0129:
            o.f0 r1 = r11.e
            goto L_0x01c4
        L_0x012d:
            r7 = r26
            if (r1 == 0) goto L_0x0134
            java.net.Proxy r3 = r1.f5367b
            goto L_0x0138
        L_0x0134:
            o.c0 r3 = r7.f5456b
            java.net.Proxy r3 = r3.f5261f
        L_0x0138:
            java.net.Proxy$Type r3 = r3.type()
            java.net.Proxy$Type r4 = java.net.Proxy.Type.HTTP
            if (r3 != r4) goto L_0x014a
            o.c0 r3 = r7.f5456b
            o.g r3 = r3.u
            o.f0 r1 = r3.a(r1, r11)
            goto L_0x01c4
        L_0x014a:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r1 = "Received HTTP_PROXY_AUTH (407) code while not using proxy"
            r0.<init>(r1)
            throw r0
        L_0x0152:
            r7 = r26
            o.j0 r1 = r11.f5333n
            if (r1 == 0) goto L_0x015e
            int r1 = r1.f5326g
            if (r1 != r5) goto L_0x015e
            goto L_0x01c3
        L_0x015e:
            r1 = 2147483647(0x7fffffff, float:NaN)
            int r1 = r7.a(r11, r1)
            if (r1 != 0) goto L_0x01c3
            o.f0 r1 = r11.e
            goto L_0x01c4
        L_0x016a:
            r7 = r26
            o.c0 r3 = r7.f5456b
            o.g r3 = r3.v
            o.f0 r1 = r3.a(r1, r11)
            goto L_0x01c4
        L_0x0175:
            r7 = r26
            boolean r1 = r4.equals(r6)
            if (r1 != 0) goto L_0x0186
            java.lang.String r1 = "HEAD"
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L_0x0186
            goto L_0x01c3
        L_0x0186:
            o.c0 r1 = r7.f5456b
            boolean r1 = r1.z
            if (r1 != 0) goto L_0x018d
            goto L_0x01c3
        L_0x018d:
            o.x r1 = r11.f5329j
            java.lang.String r3 = "Location"
            java.lang.String r1 = r1.a((java.lang.String) r3)
            if (r1 == 0) goto L_0x0198
            goto L_0x0199
        L_0x0198:
            r1 = 0
        L_0x0199:
            if (r1 != 0) goto L_0x019c
            goto L_0x01c3
        L_0x019c:
            o.f0 r3 = r11.e
            o.y r3 = r3.a
            o.y$a r1 = r3.a(r1)
            if (r1 == 0) goto L_0x01ab
            o.y r1 = r1.a()
            goto L_0x01ac
        L_0x01ab:
            r1 = 0
        L_0x01ac:
            if (r1 != 0) goto L_0x01af
            goto L_0x01c3
        L_0x01af:
            java.lang.String r3 = r1.a
            o.f0 r5 = r11.e
            o.y r5 = r5.a
            java.lang.String r5 = r5.a
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x01c6
            o.c0 r3 = r7.f5456b
            boolean r3 = r3.y
            if (r3 != 0) goto L_0x01c6
        L_0x01c3:
            r1 = 0
        L_0x01c4:
            r10 = r1
            goto L_0x0223
        L_0x01c6:
            o.f0 r3 = r11.e
            if (r3 == 0) goto L_0x026a
            o.f0$a r5 = new o.f0$a
            r5.<init>(r3)
            boolean r3 = i.c.d.p.e.b((java.lang.String) r4)
            if (r3 == 0) goto L_0x020a
            java.lang.String r3 = "PROPFIND"
            boolean r8 = r4.equals(r3)
            boolean r3 = r4.equals(r3)
            r3 = r3 ^ 1
            if (r3 == 0) goto L_0x01e8
            r3 = 0
            r5.a((java.lang.String) r6, (o.i0) r3)
            goto L_0x01f3
        L_0x01e8:
            if (r8 == 0) goto L_0x01ef
            o.f0 r3 = r11.e
            o.i0 r3 = r3.d
            goto L_0x01f0
        L_0x01ef:
            r3 = 0
        L_0x01f0:
            r5.a((java.lang.String) r4, (o.i0) r3)
        L_0x01f3:
            if (r8 != 0) goto L_0x020a
            o.x$a r3 = r5.c
            java.lang.String r4 = "Transfer-Encoding"
            r3.a(r4)
            o.x$a r3 = r5.c
            java.lang.String r4 = "Content-Length"
            r3.a(r4)
            o.x$a r3 = r5.c
            java.lang.String r4 = "Content-Type"
            r3.a(r4)
        L_0x020a:
            o.f0 r3 = r11.e
            o.y r3 = r3.a
            boolean r3 = o.o0.e.a((o.y) r3, (o.y) r1)
            if (r3 != 0) goto L_0x021b
            o.x$a r3 = r5.c
            java.lang.String r4 = "Authorization"
            r3.a(r4)
        L_0x021b:
            r5.a(r1)
            o.f0 r1 = r5.a()
            goto L_0x01c4
        L_0x0223:
            if (r10 != 0) goto L_0x023f
            if (r0 == 0) goto L_0x023e
            boolean r0 = r0.f5394f
            if (r0 == 0) goto L_0x023e
            boolean r0 = r9.f5441n
            if (r0 != 0) goto L_0x0238
            r0 = 1
            r9.f5441n = r0
            p.c r0 = r9.e
            r0.g()
            goto L_0x023e
        L_0x0238:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x023e:
            return r11
        L_0x023f:
            o.l0 r1 = r11.f5330k
            o.o0.e.a((java.io.Closeable) r1)
            boolean r1 = r9.c()
            if (r1 == 0) goto L_0x0256
            o.o0.h.c r1 = r0.e
            r1.cancel()
            o.o0.g.j r1 = r0.a
            r3 = 1
            r4 = 0
            r1.a(r0, r3, r3, r4)
        L_0x0256:
            int r12 = r27 + 1
            r0 = 20
            if (r12 > r0) goto L_0x025e
            r3 = 0
            goto L_0x029a
        L_0x025e:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r1 = "Too many follow-up requests: "
            java.lang.String r1 = i.a.a.a.a.b((java.lang.String) r1, (int) r12)
            r0.<init>(r1)
            throw r0
        L_0x026a:
            r0 = 0
            throw r0
        L_0x026c:
            r7 = r26
            r0 = 0
            throw r0
        L_0x0270:
            r0 = move-exception
            r7 = r26
            goto L_0x02a1
        L_0x0274:
            r0 = move-exception
            r7 = r26
            r1 = r0
            boolean r0 = r1 instanceof okhttp3.internal.http2.ConnectionShutdownException     // Catch:{ all -> 0x02a0 }
            if (r0 != 0) goto L_0x027f
            r0 = 1
            goto L_0x0280
        L_0x027f:
            r0 = 0
        L_0x0280:
            boolean r0 = r7.a(r1, r9, r0, r10)     // Catch:{ all -> 0x02a0 }
            if (r0 == 0) goto L_0x0287
            goto L_0x0295
        L_0x0287:
            throw r1     // Catch:{ all -> 0x02a0 }
        L_0x0288:
            r0 = move-exception
            r7 = r26
            r1 = r0
            java.io.IOException r0 = r1.f5632f     // Catch:{ all -> 0x02a0 }
            r4 = 0
            boolean r0 = r7.a(r0, r9, r4, r10)     // Catch:{ all -> 0x02a0 }
            if (r0 == 0) goto L_0x029d
        L_0x0295:
            r9.b()
            r12 = r27
        L_0x029a:
            r1 = r7
            goto L_0x000f
        L_0x029d:
            java.io.IOException r0 = r1.e     // Catch:{ all -> 0x02a0 }
            throw r0     // Catch:{ all -> 0x02a0 }
        L_0x02a0:
            r0 = move-exception
        L_0x02a1:
            r9.b()
            throw r0
        L_0x02a5:
            r7 = r26
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Canceled"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.o0.h.h.a(o.z$a):o.j0");
    }

    public final int a(j0 j0Var, int i2) {
        String a = j0Var.f5329j.a("Retry-After");
        if (a == null) {
            a = null;
        }
        if (a == null) {
            return i2;
        }
        if (a.matches("\\d+")) {
            return Integer.valueOf(a).intValue();
        }
        return Integer.MAX_VALUE;
    }

    public final boolean a(IOException iOException, j jVar, boolean z, f0 f0Var) {
        if (!this.f5456b.A) {
            return false;
        }
        if (z) {
            i0 i0Var = f0Var.d;
            if (iOException instanceof FileNotFoundException) {
                return false;
            }
        }
        if (!(!(iOException instanceof ProtocolException) && (!(iOException instanceof InterruptedIOException) ? (!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException) : (iOException instanceof SocketTimeoutException) && !z))) {
            return false;
        }
        if (!(jVar.f5435h.b() && jVar.f5435h.a())) {
            return false;
        }
        return true;
    }
}
