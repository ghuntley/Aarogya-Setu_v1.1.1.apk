package o.o0.g;

import i.a.a.a.a;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import o.j;
import o.m0;
import o.o0.g.i;
import o.u;
import o.y;

/* compiled from: ExchangeFinder */
public final class e {
    public final j a;

    /* renamed from: b  reason: collision with root package name */
    public final o.e f5405b;
    public final g c;
    public final j d;
    public final u e;

    /* renamed from: f  reason: collision with root package name */
    public i.a f5406f;

    /* renamed from: g  reason: collision with root package name */
    public final i f5407g;

    /* renamed from: h  reason: collision with root package name */
    public f f5408h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f5409i;

    /* renamed from: j  reason: collision with root package name */
    public m0 f5410j;

    public e(j jVar, g gVar, o.e eVar, j jVar2, u uVar) {
        this.a = jVar;
        this.c = gVar;
        this.f5405b = eVar;
        this.d = jVar2;
        this.e = uVar;
        this.f5407g = new i(eVar, gVar.e, jVar2, uVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0014, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001b, code lost:
        if (r0.e.isClosed() != false) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0023, code lost:
        if (r0.e.isInputShutdown() != false) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002b, code lost:
        if (r0.e.isOutputShutdown() == false) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002e, code lost:
        r1 = r0.f5414h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0030, code lost:
        if (r1 == null) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0032, code lost:
        r2 = r1.e(java.lang.System.nanoTime());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003c, code lost:
        if (r12 == false) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r3 = r0.e.getSoTimeout();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r0.e.setSoTimeout(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004f, code lost:
        if (r0.f5415i.l() == false) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r0.e.setSoTimeout(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0057, code lost:
        r0.e.setSoTimeout(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005d, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005e, code lost:
        r0.e.setSoTimeout(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0063, code lost:
        throw r4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0067 A[LOOP:0: B:0:0x0000->B:36:0x0067, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x006b A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final o.o0.g.f a(int r7, int r8, int r9, int r10, boolean r11, boolean r12) {
        /*
            r6 = this;
        L_0x0000:
            o.o0.g.f r0 = r6.a(r7, r8, r9, r10, r11)
            o.o0.g.g r1 = r6.c
            monitor-enter(r1)
            int r2 = r0.f5419m     // Catch:{ all -> 0x006c }
            if (r2 != 0) goto L_0x0013
            boolean r2 = r0.a()     // Catch:{ all -> 0x006c }
            if (r2 != 0) goto L_0x0013
            monitor-exit(r1)     // Catch:{ all -> 0x006c }
            return r0
        L_0x0013:
            monitor-exit(r1)     // Catch:{ all -> 0x006c }
            java.net.Socket r1 = r0.e
            boolean r1 = r1.isClosed()
            r2 = 0
            if (r1 != 0) goto L_0x0065
            java.net.Socket r1 = r0.e
            boolean r1 = r1.isInputShutdown()
            if (r1 != 0) goto L_0x0065
            java.net.Socket r1 = r0.e
            boolean r1 = r1.isOutputShutdown()
            if (r1 == 0) goto L_0x002e
            goto L_0x0065
        L_0x002e:
            o.o0.j.e r1 = r0.f5414h
            if (r1 == 0) goto L_0x003b
            long r2 = java.lang.System.nanoTime()
            boolean r2 = r1.e(r2)
            goto L_0x0065
        L_0x003b:
            r1 = 1
            if (r12 == 0) goto L_0x0064
            java.net.Socket r3 = r0.e     // Catch:{ SocketTimeoutException -> 0x0064, IOException -> 0x0065 }
            int r3 = r3.getSoTimeout()     // Catch:{ SocketTimeoutException -> 0x0064, IOException -> 0x0065 }
            java.net.Socket r4 = r0.e     // Catch:{ all -> 0x005d }
            r4.setSoTimeout(r1)     // Catch:{ all -> 0x005d }
            p.h r4 = r0.f5415i     // Catch:{ all -> 0x005d }
            boolean r4 = r4.l()     // Catch:{ all -> 0x005d }
            if (r4 == 0) goto L_0x0057
            java.net.Socket r4 = r0.e     // Catch:{ SocketTimeoutException -> 0x0064, IOException -> 0x0065 }
            r4.setSoTimeout(r3)     // Catch:{ SocketTimeoutException -> 0x0064, IOException -> 0x0065 }
            goto L_0x0065
        L_0x0057:
            java.net.Socket r4 = r0.e     // Catch:{ SocketTimeoutException -> 0x0064, IOException -> 0x0065 }
            r4.setSoTimeout(r3)     // Catch:{ SocketTimeoutException -> 0x0064, IOException -> 0x0065 }
            goto L_0x0064
        L_0x005d:
            r4 = move-exception
            java.net.Socket r5 = r0.e     // Catch:{ SocketTimeoutException -> 0x0064, IOException -> 0x0065 }
            r5.setSoTimeout(r3)     // Catch:{ SocketTimeoutException -> 0x0064, IOException -> 0x0065 }
            throw r4     // Catch:{ SocketTimeoutException -> 0x0064, IOException -> 0x0065 }
        L_0x0064:
            r2 = 1
        L_0x0065:
            if (r2 != 0) goto L_0x006b
            r0.b()
            goto L_0x0000
        L_0x006b:
            return r0
        L_0x006c:
            r7 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x006c }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o.o0.g.e.a(int, int, int, int, boolean, boolean):o.o0.g.f");
    }

    public boolean b() {
        boolean z;
        synchronized (this.c) {
            z = this.f5409i;
        }
        return z;
    }

    public final boolean c() {
        f fVar = this.a.f5436i;
        return fVar != null && fVar.f5418l == 0 && o.o0.e.a(fVar.c.a.a, this.f5405b.a);
    }

    public void d() {
        synchronized (this.c) {
            this.f5409i = true;
        }
    }

    public final f a(int i2, int i3, int i4, int i5, boolean z) {
        Socket e2;
        f fVar;
        f fVar2;
        int i6;
        m0 m0Var;
        boolean z2;
        boolean z3;
        ArrayList arrayList;
        Socket socket;
        i.a aVar;
        String str;
        int i7;
        m0 m0Var2;
        synchronized (this.c) {
            if (!this.a.d()) {
                this.f5409i = false;
                f fVar3 = this.a.f5436i;
                e2 = (this.a.f5436i == null || !this.a.f5436i.f5417k) ? null : this.a.e();
                if (this.a.f5436i != null) {
                    fVar2 = this.a.f5436i;
                    fVar = null;
                } else {
                    fVar = fVar3;
                    fVar2 = null;
                }
                i6 = 1;
                if (fVar2 == null) {
                    if (this.c.a(this.f5405b, this.a, (List<m0>) null, false)) {
                        fVar2 = this.a.f5436i;
                        z2 = true;
                        m0Var = null;
                    } else {
                        if (this.f5410j != null) {
                            m0Var2 = this.f5410j;
                            this.f5410j = null;
                        } else if (c()) {
                            m0Var2 = this.a.f5436i.c;
                        }
                        m0Var = m0Var2;
                        z2 = false;
                    }
                }
                m0Var2 = null;
                m0Var = m0Var2;
                z2 = false;
            } else {
                throw new IOException("Canceled");
            }
        }
        o.o0.e.a(e2);
        if (fVar != null && this.e == null) {
            throw null;
        } else if (z2 && this.e == null) {
            throw null;
        } else if (fVar2 != null) {
            return fVar2;
        } else {
            if (m0Var != null || ((aVar = this.f5406f) != null && aVar.a())) {
                z3 = false;
            } else {
                i iVar = this.f5407g;
                if (iVar.a()) {
                    ArrayList arrayList2 = new ArrayList();
                    while (iVar.b()) {
                        if (iVar.b()) {
                            List<Proxy> list = iVar.e;
                            int i8 = iVar.f5428f;
                            iVar.f5428f = i8 + 1;
                            Proxy proxy = list.get(i8);
                            iVar.f5429g = new ArrayList();
                            if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                                y yVar = iVar.a.a;
                                str = yVar.d;
                                i7 = yVar.e;
                            } else {
                                SocketAddress address = proxy.address();
                                if (address instanceof InetSocketAddress) {
                                    InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                                    InetAddress address2 = inetSocketAddress.getAddress();
                                    if (address2 == null) {
                                        str = inetSocketAddress.getHostName();
                                    } else {
                                        str = address2.getHostAddress();
                                    }
                                    i7 = inetSocketAddress.getPort();
                                } else {
                                    StringBuilder a2 = a.a("Proxy.address() is not an InetSocketAddress: ");
                                    a2.append(address.getClass());
                                    throw new IllegalArgumentException(a2.toString());
                                }
                            }
                            if (i7 < i6 || i7 > 65535) {
                                throw new SocketException("No route to " + str + ":" + i7 + "; port is out of range");
                            }
                            if (proxy.type() == Proxy.Type.SOCKS) {
                                iVar.f5429g.add(InetSocketAddress.createUnresolved(str, i7));
                            } else if (iVar.d != null) {
                                List<InetAddress> a3 = iVar.a.f5293b.a(str);
                                if (a3.isEmpty()) {
                                    throw new UnknownHostException(iVar.a.f5293b + " returned no addresses for " + str);
                                } else if (iVar.d != null) {
                                    int size = a3.size();
                                    for (int i9 = 0; i9 < size; i9++) {
                                        iVar.f5429g.add(new InetSocketAddress(a3.get(i9), i7));
                                    }
                                } else {
                                    throw null;
                                }
                            } else {
                                throw null;
                            }
                            int size2 = iVar.f5429g.size();
                            for (int i10 = 0; i10 < size2; i10++) {
                                m0 m0Var3 = new m0(iVar.a, proxy, iVar.f5429g.get(i10));
                                if (iVar.f5427b.c(m0Var3)) {
                                    iVar.f5430h.add(m0Var3);
                                } else {
                                    arrayList2.add(m0Var3);
                                }
                            }
                            if (!arrayList2.isEmpty()) {
                                break;
                            }
                            i6 = 1;
                        } else {
                            StringBuilder a4 = a.a("No route to ");
                            a4.append(iVar.a.a.d);
                            a4.append("; exhausted proxy configurations: ");
                            a4.append(iVar.e);
                            throw new SocketException(a4.toString());
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        arrayList2.addAll(iVar.f5430h);
                        iVar.f5430h.clear();
                    }
                    this.f5406f = new i.a(arrayList2);
                    z3 = true;
                } else {
                    throw new NoSuchElementException();
                }
            }
            synchronized (this.c) {
                if (!this.a.d()) {
                    if (z3) {
                        i.a aVar2 = this.f5406f;
                        if (aVar2 != null) {
                            arrayList = new ArrayList(aVar2.a);
                            if (this.c.a(this.f5405b, this.a, arrayList, false)) {
                                fVar2 = this.a.f5436i;
                                z2 = true;
                            }
                        } else {
                            throw null;
                        }
                    } else {
                        arrayList = null;
                    }
                    if (!z2) {
                        if (m0Var == null) {
                            i.a aVar3 = this.f5406f;
                            if (aVar3.a()) {
                                List<m0> list2 = aVar3.a;
                                int i11 = aVar3.f5431b;
                                aVar3.f5431b = i11 + 1;
                                m0Var = list2.get(i11);
                            } else {
                                throw new NoSuchElementException();
                            }
                        }
                        fVar2 = new f(this.c, m0Var);
                        this.f5408h = fVar2;
                    }
                } else {
                    throw new IOException("Canceled");
                }
            }
            if (!z2) {
                fVar2.a(i2, i3, i4, i5, z, this.d, this.e);
                this.c.e.a(fVar2.c);
                synchronized (this.c) {
                    this.f5408h = null;
                    if (this.c.a(this.f5405b, this.a, arrayList, true)) {
                        fVar2.f5417k = true;
                        socket = fVar2.e;
                        fVar2 = this.a.f5436i;
                        this.f5410j = m0Var;
                    } else {
                        g gVar = this.c;
                        if (!gVar.f5426f) {
                            gVar.f5426f = true;
                            g.f5424g.execute(gVar.c);
                        }
                        gVar.d.add(fVar2);
                        this.a.a(fVar2);
                        socket = null;
                    }
                }
                o.o0.e.a(socket);
                if (this.e != null) {
                    return fVar2;
                }
                throw null;
            } else if (this.e != null) {
                return fVar2;
            } else {
                throw null;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0031, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a() {
        /*
            r3 = this;
            o.o0.g.g r0 = r3.c
            monitor-enter(r0)
            o.m0 r1 = r3.f5410j     // Catch:{ all -> 0x0032 }
            r2 = 1
            if (r1 == 0) goto L_0x000a
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            return r2
        L_0x000a:
            boolean r1 = r3.c()     // Catch:{ all -> 0x0032 }
            if (r1 == 0) goto L_0x001a
            o.o0.g.j r1 = r3.a     // Catch:{ all -> 0x0032 }
            o.o0.g.f r1 = r1.f5436i     // Catch:{ all -> 0x0032 }
            o.m0 r1 = r1.c     // Catch:{ all -> 0x0032 }
            r3.f5410j = r1     // Catch:{ all -> 0x0032 }
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            return r2
        L_0x001a:
            o.o0.g.i$a r1 = r3.f5406f     // Catch:{ all -> 0x0032 }
            if (r1 == 0) goto L_0x0026
            o.o0.g.i$a r1 = r3.f5406f     // Catch:{ all -> 0x0032 }
            boolean r1 = r1.a()     // Catch:{ all -> 0x0032 }
            if (r1 != 0) goto L_0x0030
        L_0x0026:
            o.o0.g.i r1 = r3.f5407g     // Catch:{ all -> 0x0032 }
            boolean r1 = r1.a()     // Catch:{ all -> 0x0032 }
            if (r1 == 0) goto L_0x002f
            goto L_0x0030
        L_0x002f:
            r2 = 0
        L_0x0030:
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            return r2
        L_0x0032:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.o0.g.e.a():boolean");
    }
}
