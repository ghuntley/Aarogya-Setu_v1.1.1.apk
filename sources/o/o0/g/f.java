package o.o0.g;

import androidx.recyclerview.widget.RecyclerView;
import i.a.a.a.a;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import o.c0;
import o.d0;
import o.f0;
import o.i0;
import o.j;
import o.j0;
import o.m0;
import o.o0.h.c;
import o.o0.i.a;
import o.o0.j.e;
import o.o0.j.l;
import o.o0.m.d;
import o.u;
import o.w;
import o.x;
import o.y;
import o.z;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.StreamResetException;
import p.a0;
import p.g;
import p.h;
import p.r;
import p.v;

/* compiled from: RealConnection */
public final class f extends e.g {

    /* renamed from: b  reason: collision with root package name */
    public final g f5411b;
    public final m0 c;
    public Socket d;
    public Socket e;

    /* renamed from: f  reason: collision with root package name */
    public w f5412f;

    /* renamed from: g  reason: collision with root package name */
    public d0 f5413g;

    /* renamed from: h  reason: collision with root package name */
    public e f5414h;

    /* renamed from: i  reason: collision with root package name */
    public h f5415i;

    /* renamed from: j  reason: collision with root package name */
    public g f5416j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f5417k;

    /* renamed from: l  reason: collision with root package name */
    public int f5418l;

    /* renamed from: m  reason: collision with root package name */
    public int f5419m;

    /* renamed from: n  reason: collision with root package name */
    public int f5420n;

    /* renamed from: o  reason: collision with root package name */
    public int f5421o = 1;

    /* renamed from: p  reason: collision with root package name */
    public final List<Reference<j>> f5422p = new ArrayList();

    /* renamed from: q  reason: collision with root package name */
    public long f5423q = RecyclerView.FOREVER_NS;

    public f(g gVar, m0 m0Var) {
        this.f5411b = gVar;
        this.c = m0Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0131, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0131, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0131, code lost:
        continue;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0136 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(int r16, int r17, int r18, int r19, boolean r20, o.j r21, o.u r22) {
        /*
            r15 = this;
            r7 = r15
            r8 = r21
            r9 = r22
            o.d0 r0 = r7.f5413g
            if (r0 != 0) goto L_0x0144
            o.m0 r0 = r7.c
            o.e r0 = r0.a
            java.util.List<o.o> r0 = r0.f5294f
            o.o0.g.c r10 = new o.o0.g.c
            r10.<init>(r0)
            o.m0 r1 = r7.c
            o.e r1 = r1.a
            javax.net.ssl.SSLSocketFactory r2 = r1.f5297i
            if (r2 != 0) goto L_0x0055
            o.o r1 = o.o.f5376h
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0048
            o.m0 r0 = r7.c
            o.e r0 = r0.a
            o.y r0 = r0.a
            java.lang.String r0 = r0.d
            o.o0.k.f r1 = o.o0.k.f.a
            boolean r1 = r1.b((java.lang.String) r0)
            if (r1 == 0) goto L_0x0035
            goto L_0x005f
        L_0x0035:
            okhttp3.internal.connection.RouteException r1 = new okhttp3.internal.connection.RouteException
            java.net.UnknownServiceException r2 = new java.net.UnknownServiceException
            java.lang.String r3 = "CLEARTEXT communication to "
            java.lang.String r4 = " not permitted by network security policy"
            java.lang.String r0 = i.a.a.a.a.a((java.lang.String) r3, (java.lang.String) r0, (java.lang.String) r4)
            r2.<init>(r0)
            r1.<init>(r2)
            throw r1
        L_0x0048:
            okhttp3.internal.connection.RouteException r0 = new okhttp3.internal.connection.RouteException
            java.net.UnknownServiceException r1 = new java.net.UnknownServiceException
            java.lang.String r2 = "CLEARTEXT communication not enabled for client"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x0055:
            java.util.List<o.d0> r0 = r1.e
            o.d0 r1 = o.d0.H2_PRIOR_KNOWLEDGE
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x0137
        L_0x005f:
            r11 = 0
            r12 = r11
        L_0x0061:
            o.m0 r0 = r7.c     // Catch:{ IOException -> 0x00cd }
            boolean r0 = r0.a()     // Catch:{ IOException -> 0x00cd }
            if (r0 == 0) goto L_0x0081
            r1 = r15
            r2 = r16
            r3 = r17
            r4 = r18
            r5 = r21
            r6 = r22
            r1.a(r2, r3, r4, r5, r6)     // Catch:{ IOException -> 0x00cd }
            java.net.Socket r0 = r7.d     // Catch:{ IOException -> 0x00cd }
            if (r0 != 0) goto L_0x007c
            goto L_0x0097
        L_0x007c:
            r1 = r16
            r2 = r17
            goto L_0x0088
        L_0x0081:
            r1 = r16
            r2 = r17
            r15.a((int) r1, (int) r2, (o.j) r8, (o.u) r9)     // Catch:{ IOException -> 0x00c9 }
        L_0x0088:
            r3 = r19
            r15.a((o.o0.g.c) r10, (int) r3, (o.j) r8, (o.u) r9)     // Catch:{ IOException -> 0x00c7 }
            o.m0 r0 = r7.c     // Catch:{ IOException -> 0x00c7 }
            java.net.InetSocketAddress r0 = r0.c     // Catch:{ IOException -> 0x00c7 }
            o.m0 r0 = r7.c     // Catch:{ IOException -> 0x00c7 }
            java.net.Proxy r0 = r0.f5367b     // Catch:{ IOException -> 0x00c7 }
            if (r9 == 0) goto L_0x00c6
        L_0x0097:
            o.m0 r0 = r7.c
            boolean r0 = r0.a()
            if (r0 == 0) goto L_0x00b1
            java.net.Socket r0 = r7.d
            if (r0 == 0) goto L_0x00a4
            goto L_0x00b1
        L_0x00a4:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r1 = "Too many tunnel connections attempted: 21"
            r0.<init>(r1)
            okhttp3.internal.connection.RouteException r1 = new okhttp3.internal.connection.RouteException
            r1.<init>(r0)
            throw r1
        L_0x00b1:
            o.o0.j.e r0 = r7.f5414h
            if (r0 == 0) goto L_0x00c5
            o.o0.g.g r1 = r7.f5411b
            monitor-enter(r1)
            o.o0.j.e r0 = r7.f5414h     // Catch:{ all -> 0x00c2 }
            int r0 = r0.a()     // Catch:{ all -> 0x00c2 }
            r7.f5421o = r0     // Catch:{ all -> 0x00c2 }
            monitor-exit(r1)     // Catch:{ all -> 0x00c2 }
            goto L_0x00c5
        L_0x00c2:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00c2 }
            throw r0
        L_0x00c5:
            return
        L_0x00c6:
            throw r11     // Catch:{ IOException -> 0x00c7 }
        L_0x00c7:
            r0 = move-exception
            goto L_0x00d3
        L_0x00c9:
            r0 = move-exception
        L_0x00ca:
            r3 = r19
            goto L_0x00d3
        L_0x00cd:
            r0 = move-exception
            r1 = r16
            r2 = r17
            goto L_0x00ca
        L_0x00d3:
            java.net.Socket r4 = r7.e
            o.o0.e.a((java.net.Socket) r4)
            java.net.Socket r4 = r7.d
            o.o0.e.a((java.net.Socket) r4)
            r7.e = r11
            r7.d = r11
            r7.f5415i = r11
            r7.f5416j = r11
            r7.f5412f = r11
            r7.f5413g = r11
            r7.f5414h = r11
            o.m0 r4 = r7.c
            java.net.InetSocketAddress r4 = r4.c
            if (r9 == 0) goto L_0x0136
            r4 = 0
            r5 = 1
            if (r12 != 0) goto L_0x00fb
            okhttp3.internal.connection.RouteException r12 = new okhttp3.internal.connection.RouteException
            r12.<init>(r0)
            goto L_0x010a
        L_0x00fb:
            java.io.IOException r6 = r12.e
            java.lang.reflect.Method r13 = o.o0.e.f5385j
            if (r13 == 0) goto L_0x0108
            java.lang.Object[] r14 = new java.lang.Object[r5]     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0108 }
            r14[r4] = r0     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0108 }
            r13.invoke(r6, r14)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0108 }
        L_0x0108:
            r12.f5632f = r0
        L_0x010a:
            if (r20 == 0) goto L_0x0135
            r10.d = r5
            boolean r5 = r10.c
            if (r5 != 0) goto L_0x0113
            goto L_0x0131
        L_0x0113:
            boolean r5 = r0 instanceof java.net.ProtocolException
            if (r5 == 0) goto L_0x0118
            goto L_0x0131
        L_0x0118:
            boolean r5 = r0 instanceof java.io.InterruptedIOException
            if (r5 == 0) goto L_0x011d
            goto L_0x0131
        L_0x011d:
            boolean r5 = r0 instanceof javax.net.ssl.SSLHandshakeException
            if (r5 == 0) goto L_0x012a
            java.lang.Throwable r5 = r0.getCause()
            boolean r5 = r5 instanceof java.security.cert.CertificateException
            if (r5 == 0) goto L_0x012a
            goto L_0x0131
        L_0x012a:
            boolean r5 = r0 instanceof javax.net.ssl.SSLPeerUnverifiedException
            if (r5 == 0) goto L_0x012f
            goto L_0x0131
        L_0x012f:
            boolean r4 = r0 instanceof javax.net.ssl.SSLException
        L_0x0131:
            if (r4 == 0) goto L_0x0135
            goto L_0x0061
        L_0x0135:
            throw r12
        L_0x0136:
            throw r11
        L_0x0137:
            okhttp3.internal.connection.RouteException r0 = new okhttp3.internal.connection.RouteException
            java.net.UnknownServiceException r1 = new java.net.UnknownServiceException
            java.lang.String r2 = "H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x0144:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "already connected"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.o0.g.f.a(int, int, int, int, boolean, o.j, o.u):void");
    }

    public void b() {
        synchronized (this.f5411b) {
            this.f5417k = true;
        }
    }

    public String toString() {
        StringBuilder a = a.a("Connection{");
        a.append(this.c.a.a.d);
        a.append(":");
        a.append(this.c.a.a.e);
        a.append(", proxy=");
        a.append(this.c.f5367b);
        a.append(" hostAddress=");
        a.append(this.c.c);
        a.append(" cipherSuite=");
        w wVar = this.f5412f;
        a.append(wVar != null ? wVar.f5621b : "none");
        a.append(" protocol=");
        a.append(this.f5413g);
        a.append('}');
        return a.toString();
    }

    public final void a(int i2, int i3, j jVar, u uVar) {
        Socket socket;
        m0 m0Var = this.c;
        Proxy proxy = m0Var.f5367b;
        o.e eVar = m0Var.a;
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.HTTP) {
            socket = eVar.c.createSocket();
        } else {
            socket = new Socket(proxy);
        }
        this.d = socket;
        InetSocketAddress inetSocketAddress = this.c.c;
        if (uVar != null) {
            socket.setSoTimeout(i3);
            try {
                o.o0.k.f.a.a(this.d, this.c.c, i2);
                try {
                    this.f5415i = new v(r.b(this.d));
                    this.f5416j = new p.u(r.a(this.d));
                } catch (NullPointerException e2) {
                    if ("throw with null exception".equals(e2.getMessage())) {
                        throw new IOException(e2);
                    }
                }
            } catch (ConnectException e3) {
                StringBuilder a = a.a("Failed to connect to ");
                a.append(this.c.c);
                ConnectException connectException = new ConnectException(a.toString());
                connectException.initCause(e3);
                throw connectException;
            }
        } else {
            throw null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: javax.net.ssl.SSLSocket} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: javax.net.ssl.SSLSocket} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: javax.net.ssl.SSLSocket} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: javax.net.ssl.SSLSocket} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x012e A[Catch:{ all -> 0x0125 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0134 A[Catch:{ all -> 0x0125 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0138  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(o.o0.g.c r6, int r7, o.j r8, o.u r9) {
        /*
            r5 = this;
            o.m0 r8 = r5.c
            o.e r8 = r8.a
            javax.net.ssl.SSLSocketFactory r0 = r8.f5297i
            if (r0 != 0) goto L_0x0027
            java.util.List<o.d0> r6 = r8.e
            o.d0 r8 = o.d0.H2_PRIOR_KNOWLEDGE
            boolean r6 = r6.contains(r8)
            if (r6 == 0) goto L_0x001e
            java.net.Socket r6 = r5.d
            r5.e = r6
            o.d0 r6 = o.d0.H2_PRIOR_KNOWLEDGE
            r5.f5413g = r6
            r5.a((int) r7)
            return
        L_0x001e:
            java.net.Socket r6 = r5.d
            r5.e = r6
            o.d0 r6 = o.d0.HTTP_1_1
            r5.f5413g = r6
            return
        L_0x0027:
            r1 = 0
            if (r9 == 0) goto L_0x0141
            java.net.Socket r9 = r5.d     // Catch:{ AssertionError -> 0x0127 }
            o.y r2 = r8.a     // Catch:{ AssertionError -> 0x0127 }
            java.lang.String r2 = r2.d     // Catch:{ AssertionError -> 0x0127 }
            o.y r3 = r8.a     // Catch:{ AssertionError -> 0x0127 }
            int r3 = r3.e     // Catch:{ AssertionError -> 0x0127 }
            r4 = 1
            java.net.Socket r9 = r0.createSocket(r9, r2, r3, r4)     // Catch:{ AssertionError -> 0x0127 }
            javax.net.ssl.SSLSocket r9 = (javax.net.ssl.SSLSocket) r9     // Catch:{ AssertionError -> 0x0127 }
            o.o r6 = r6.a(r9)     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            boolean r0 = r6.f5377b     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            if (r0 == 0) goto L_0x004e
            o.o0.k.f r0 = o.o0.k.f.a     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            o.y r2 = r8.a     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            java.lang.String r2 = r2.d     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            java.util.List<o.d0> r3 = r8.e     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            r0.a((javax.net.ssl.SSLSocket) r9, (java.lang.String) r2, (java.util.List<o.d0>) r3)     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
        L_0x004e:
            r9.startHandshake()     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            javax.net.ssl.SSLSession r0 = r9.getSession()     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            o.w r2 = o.w.a((javax.net.ssl.SSLSession) r0)     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            javax.net.ssl.HostnameVerifier r3 = r8.f5298j     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            o.y r4 = r8.a     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            java.lang.String r4 = r4.d     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            boolean r0 = r3.verify(r4, r0)     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            if (r0 != 0) goto L_0x00d5
            java.util.List<java.security.cert.Certificate> r6 = r2.c     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            boolean r7 = r6.isEmpty()     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            java.lang.String r0 = "Hostname "
            if (r7 != 0) goto L_0x00b7
            r7 = 0
            java.lang.Object r6 = r6.get(r7)     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            java.security.cert.X509Certificate r6 = (java.security.cert.X509Certificate) r6     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            javax.net.ssl.SSLPeerUnverifiedException r7 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            r1.<init>()     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            r1.append(r0)     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            o.y r8 = r8.a     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            java.lang.String r8 = r8.d     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            r1.append(r8)     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            java.lang.String r8 = " not verified:\n    certificate: "
            r1.append(r8)     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            java.lang.String r8 = o.l.a(r6)     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            r1.append(r8)     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            java.lang.String r8 = "\n    DN: "
            r1.append(r8)     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            java.security.Principal r8 = r6.getSubjectDN()     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            java.lang.String r8 = r8.getName()     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            r1.append(r8)     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            java.lang.String r8 = "\n    subjectAltNames: "
            r1.append(r8)     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            java.util.List r6 = o.o0.m.d.a(r6)     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            r1.append(r6)     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            java.lang.String r6 = r1.toString()     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            r7.<init>(r6)     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            throw r7     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
        L_0x00b7:
            javax.net.ssl.SSLPeerUnverifiedException r6 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            r7.<init>()     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            r7.append(r0)     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            o.y r8 = r8.a     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            java.lang.String r8 = r8.d     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            r7.append(r8)     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            java.lang.String r8 = " not verified (no certificates)"
            r7.append(r8)     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            java.lang.String r7 = r7.toString()     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            r6.<init>(r7)     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            throw r6     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
        L_0x00d5:
            o.l r0 = r8.f5299k     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            o.y r8 = r8.a     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            java.lang.String r8 = r8.d     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            java.util.List<java.security.cert.Certificate> r3 = r2.c     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            r0.a(r8, r3)     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            boolean r6 = r6.f5377b     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            if (r6 == 0) goto L_0x00ea
            o.o0.k.f r6 = o.o0.k.f.a     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            java.lang.String r1 = r6.b((javax.net.ssl.SSLSocket) r9)     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
        L_0x00ea:
            r5.e = r9     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            p.a0 r6 = p.r.b(r9)     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            p.v r8 = new p.v     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            r8.<init>(r6)     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            r5.f5415i = r8     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            java.net.Socket r6 = r5.e     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            p.z r6 = p.r.a((java.net.Socket) r6)     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            p.u r8 = new p.u     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            r8.<init>(r6)     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            r5.f5416j = r8     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            r5.f5412f = r2     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            if (r1 == 0) goto L_0x010d
            o.d0 r6 = o.d0.a(r1)     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            goto L_0x010f
        L_0x010d:
            o.d0 r6 = o.d0.HTTP_1_1     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
        L_0x010f:
            r5.f5413g = r6     // Catch:{ AssertionError -> 0x0122, all -> 0x0120 }
            o.o0.k.f r6 = o.o0.k.f.a
            r6.a((javax.net.ssl.SSLSocket) r9)
            o.d0 r6 = r5.f5413g
            o.d0 r8 = o.d0.HTTP_2
            if (r6 != r8) goto L_0x011f
            r5.a((int) r7)
        L_0x011f:
            return
        L_0x0120:
            r6 = move-exception
            goto L_0x0136
        L_0x0122:
            r6 = move-exception
            r1 = r9
            goto L_0x0128
        L_0x0125:
            r6 = move-exception
            goto L_0x0135
        L_0x0127:
            r6 = move-exception
        L_0x0128:
            boolean r7 = o.o0.e.a((java.lang.AssertionError) r6)     // Catch:{ all -> 0x0125 }
            if (r7 == 0) goto L_0x0134
            java.io.IOException r7 = new java.io.IOException     // Catch:{ all -> 0x0125 }
            r7.<init>(r6)     // Catch:{ all -> 0x0125 }
            throw r7     // Catch:{ all -> 0x0125 }
        L_0x0134:
            throw r6     // Catch:{ all -> 0x0125 }
        L_0x0135:
            r9 = r1
        L_0x0136:
            if (r9 == 0) goto L_0x013d
            o.o0.k.f r7 = o.o0.k.f.a
            r7.a((javax.net.ssl.SSLSocket) r9)
        L_0x013d:
            o.o0.e.a((java.net.Socket) r9)
            throw r6
        L_0x0141:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.o0.g.f.a(o.o0.g.c, int, o.j, o.u):void");
    }

    public final void a(int i2) {
        this.e.setSoTimeout(0);
        e.C0153e eVar = new e.C0153e(true);
        Socket socket = this.e;
        String str = this.c.a.a.d;
        h hVar = this.f5415i;
        g gVar = this.f5416j;
        eVar.a = socket;
        eVar.f5524b = str;
        eVar.c = hVar;
        eVar.d = gVar;
        eVar.e = this;
        eVar.f5527h = i2;
        e eVar2 = new e(eVar);
        this.f5414h = eVar2;
        eVar2.z.a();
        eVar2.z.b(eVar2.w);
        int a = eVar2.w.a();
        if (a != 65535) {
            eVar2.z.a(0, (long) (a - 65535));
        }
        new Thread(eVar2.A).start();
    }

    /* JADX WARNING: type inference failed for: r3v5, types: [o.o0.g.f, o.c0] */
    /* JADX WARNING: type inference failed for: r3v24 */
    /* JADX WARNING: type inference failed for: r3v27 */
    public final void a(int i2, int i3, int i4, j jVar, u uVar) {
        f0 f0Var;
        int i5 = i3;
        f0.a aVar = new f0.a();
        aVar.a(this.c.a.a);
        boolean z = false;
        aVar.a("CONNECT", (i0) null);
        boolean z2 = true;
        aVar.a("Host", o.o0.e.a(this.c.a.a, true));
        aVar.a("Proxy-Connection", "Keep-Alive");
        aVar.a(l.a.a.a.o.b.a.HEADER_USER_AGENT, "okhttp/3.14.7");
        f0 a = aVar.a();
        j0.a aVar2 = new j0.a();
        aVar2.a = a;
        aVar2.f5337b = d0.HTTP_1_1;
        aVar2.c = 407;
        aVar2.d = "Preemptive Authenticate";
        aVar2.f5339g = o.o0.e.d;
        aVar2.f5343k = -1;
        aVar2.f5344l = -1;
        x.a aVar3 = aVar2.f5338f;
        if (aVar3 != null) {
            x.b("Proxy-Authenticate");
            x.a("OkHttp-Preemptive", "Proxy-Authenticate");
            aVar3.a("Proxy-Authenticate");
            aVar3.a.add("Proxy-Authenticate");
            aVar3.a.add("OkHttp-Preemptive".trim());
            j0 a2 = aVar2.a();
            m0 m0Var = this.c;
            f0 a3 = m0Var.a.d.a(m0Var, a2);
            if (a3 != null) {
                a = a3;
            }
            y yVar = f0Var.a;
            int i6 = 0;
            while (i6 < 21) {
                a(i2, i5, jVar, uVar);
                String str = "CONNECT " + o.o0.e.a(yVar, z2) + " HTTP/1.1";
                ? r3 = z;
                while (true) {
                    o.o0.i.a aVar4 = new o.o0.i.a(r3, r3, this.f5415i, this.f5416j);
                    this.f5415i.c().a((long) i5, TimeUnit.MILLISECONDS);
                    this.f5416j.c().a((long) i4, TimeUnit.MILLISECONDS);
                    aVar4.a(f0Var.c, str);
                    aVar4.d.flush();
                    j0.a a4 = aVar4.a(false);
                    a4.a = f0Var;
                    j0 a5 = a4.a();
                    long a6 = o.o0.h.e.a(a5);
                    if (a6 != -1) {
                        a0 a7 = aVar4.a(a6);
                        o.o0.e.b(a7, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
                        ((a.e) a7).close();
                    }
                    int i7 = a5.f5326g;
                    if (i7 != 200) {
                        if (i7 == 407) {
                            m0 m0Var2 = this.c;
                            f0 a8 = m0Var2.a.d.a(m0Var2, a5);
                            if (a8 != null) {
                                String a9 = a5.f5329j.a("Connection");
                                if (a9 == null) {
                                    a9 = null;
                                }
                                if ("close".equalsIgnoreCase(a9)) {
                                    f0Var = a8;
                                    break;
                                }
                                f0 f0Var2 = a8;
                                r3 = 0;
                                f0Var = f0Var2;
                            } else {
                                throw new IOException("Failed to authenticate with proxy");
                            }
                        } else {
                            StringBuilder a10 = i.a.a.a.a.a("Unexpected response code for CONNECT: ");
                            a10.append(a5.f5326g);
                            throw new IOException(a10.toString());
                        }
                    } else if (!this.f5415i.getBuffer().l() || !this.f5416j.b().l()) {
                        throw new IOException("TLS tunnel buffered too many bytes!");
                    } else {
                        f0Var = null;
                    }
                }
                if (f0Var != null) {
                    o.o0.e.a(this.d);
                    this.d = null;
                    this.f5416j = null;
                    this.f5415i = null;
                    InetSocketAddress inetSocketAddress = this.c.c;
                    i6++;
                    z = false;
                    z2 = true;
                } else {
                    return;
                }
            }
            return;
        }
        throw null;
    }

    public boolean a(y yVar) {
        int i2 = yVar.e;
        y yVar2 = this.c.a.a;
        if (i2 != yVar2.e) {
            return false;
        }
        if (yVar.d.equals(yVar2.d)) {
            return true;
        }
        w wVar = this.f5412f;
        if (wVar == null || !d.a.a(yVar.d, (X509Certificate) wVar.c.get(0))) {
            return false;
        }
        return true;
    }

    public c a(c0 c0Var, z.a aVar) {
        if (this.f5414h != null) {
            return new o.o0.j.j(c0Var, this, aVar, this.f5414h);
        }
        o.o0.h.f fVar = (o.o0.h.f) aVar;
        this.e.setSoTimeout(fVar.f5450h);
        this.f5415i.c().a((long) fVar.f5450h, TimeUnit.MILLISECONDS);
        this.f5416j.c().a((long) fVar.f5451i, TimeUnit.MILLISECONDS);
        return new o.o0.i.a(c0Var, this, this.f5415i, this.f5416j);
    }

    public void a(l lVar) {
        lVar.a(o.o0.j.a.REFUSED_STREAM, (IOException) null);
    }

    public void a(e eVar) {
        synchronized (this.f5411b) {
            this.f5421o = eVar.a();
        }
    }

    public boolean a() {
        return this.f5414h != null;
    }

    public void a(@Nullable IOException iOException) {
        synchronized (this.f5411b) {
            if (iOException instanceof StreamResetException) {
                o.o0.j.a aVar = ((StreamResetException) iOException).e;
                if (aVar == o.o0.j.a.REFUSED_STREAM) {
                    int i2 = this.f5420n + 1;
                    this.f5420n = i2;
                    if (i2 > 1) {
                        this.f5417k = true;
                        this.f5418l++;
                    }
                } else if (aVar != o.o0.j.a.CANCEL) {
                    this.f5417k = true;
                    this.f5418l++;
                }
            } else if (!a() || (iOException instanceof ConnectionShutdownException)) {
                this.f5417k = true;
                if (this.f5419m == 0) {
                    if (iOException != null) {
                        g gVar = this.f5411b;
                        m0 m0Var = this.c;
                        if (gVar != null) {
                            if (m0Var.f5367b.type() != Proxy.Type.DIRECT) {
                                o.e eVar = m0Var.a;
                                eVar.f5295g.connectFailed(eVar.a.g(), m0Var.f5367b.address(), iOException);
                            }
                            gVar.e.b(m0Var);
                        } else {
                            throw null;
                        }
                    }
                    this.f5418l++;
                }
            }
        }
    }
}
