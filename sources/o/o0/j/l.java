package o.o0.j;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.Deque;
import javax.annotation.Nullable;
import o.x;
import okhttp3.internal.http2.StreamResetException;
import p.a0;
import p.b0;
import p.f;
import p.h;
import p.z;

/* compiled from: Http2Stream */
public final class l {
    public long a = 0;

    /* renamed from: b  reason: collision with root package name */
    public long f5566b;
    public final int c;
    public final e d;
    public final Deque<x> e = new ArrayDeque();

    /* renamed from: f  reason: collision with root package name */
    public boolean f5567f;

    /* renamed from: g  reason: collision with root package name */
    public final b f5568g;

    /* renamed from: h  reason: collision with root package name */
    public final a f5569h;

    /* renamed from: i  reason: collision with root package name */
    public final c f5570i = new c();

    /* renamed from: j  reason: collision with root package name */
    public final c f5571j = new c();
    @Nullable

    /* renamed from: k  reason: collision with root package name */
    public a f5572k;
    @Nullable

    /* renamed from: l  reason: collision with root package name */
    public IOException f5573l;

    /* compiled from: Http2Stream */
    public final class b implements a0 {
        public final f e = new f();

        /* renamed from: f  reason: collision with root package name */
        public final f f5577f = new f();

        /* renamed from: g  reason: collision with root package name */
        public final long f5578g;

        /* renamed from: h  reason: collision with root package name */
        public x f5579h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f5580i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f5581j;

        public b(long j2) {
            this.f5578g = j2;
        }

        public void a(h hVar, long j2) {
            boolean z;
            boolean z2;
            boolean z3;
            long j3;
            while (j2 > 0) {
                synchronized (l.this) {
                    z = this.f5581j;
                    z2 = true;
                    z3 = this.f5577f.f5646f + j2 > this.f5578g;
                }
                if (z3) {
                    hVar.skip(j2);
                    l.this.a(a.FLOW_CONTROL_ERROR);
                    return;
                } else if (z) {
                    hVar.skip(j2);
                    return;
                } else {
                    long b2 = hVar.b(this.e, j2);
                    if (b2 != -1) {
                        j2 -= b2;
                        synchronized (l.this) {
                            if (this.f5580i) {
                                j3 = this.e.f5646f;
                                this.e.h();
                            } else {
                                if (this.f5577f.f5646f != 0) {
                                    z2 = false;
                                }
                                this.f5577f.a((a0) this.e);
                                if (z2) {
                                    l.this.notifyAll();
                                }
                                j3 = 0;
                            }
                        }
                        if (j3 > 0) {
                            e(j3);
                        }
                    } else {
                        throw new EOFException();
                    }
                }
            }
        }

        public long b(f fVar, long j2) {
            Throwable th;
            long b2;
            if (j2 >= 0) {
                while (true) {
                    th = null;
                    synchronized (l.this) {
                        l.this.f5570i.f();
                        try {
                            if (l.this.f5572k != null) {
                                if (l.this.f5573l != null) {
                                    th = l.this.f5573l;
                                } else {
                                    th = new StreamResetException(l.this.f5572k);
                                }
                            }
                            if (this.f5580i) {
                                throw new IOException("stream closed");
                            } else if (this.f5577f.f5646f > 0) {
                                b2 = this.f5577f.b(fVar, Math.min(j2, this.f5577f.f5646f));
                                l.this.a += b2;
                                if (th == null && l.this.a >= ((long) (l.this.d.w.a() / 2))) {
                                    l.this.d.a(l.this.c, l.this.a);
                                    l.this.a = 0;
                                }
                            } else if (this.f5581j || th != null) {
                                b2 = -1;
                            } else {
                                l.this.g();
                                l.this.f5570i.j();
                            }
                        } catch (Throwable th2) {
                            l.this.f5570i.j();
                            throw th2;
                        }
                    }
                }
                b2 = -1;
                l.this.f5570i.j();
                if (b2 != -1) {
                    e(b2);
                    return b2;
                } else if (th == null) {
                    return -1;
                } else {
                    throw th;
                }
            } else {
                throw new IllegalArgumentException("byteCount < 0: " + j2);
            }
        }

        public b0 c() {
            return l.this.f5570i;
        }

        public void close() {
            long j2;
            synchronized (l.this) {
                this.f5580i = true;
                j2 = this.f5577f.f5646f;
                this.f5577f.h();
                l.this.notifyAll();
            }
            if (j2 > 0) {
                e(j2);
            }
            l.this.a();
        }

        public final void e(long j2) {
            l.this.d.f(j2);
        }
    }

    /* compiled from: Http2Stream */
    public class c extends p.c {
        public c() {
        }

        public IOException a(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        public void h() {
            l.this.a(a.CANCEL);
            l.this.d.f();
        }

        public void j() {
            if (g()) {
                throw a((IOException) null);
            }
        }
    }

    public l(int i2, e eVar, boolean z, boolean z2, @Nullable x xVar) {
        if (eVar != null) {
            this.c = i2;
            this.d = eVar;
            this.f5566b = (long) eVar.x.a();
            this.f5568g = new b((long) eVar.w.a());
            a aVar = new a();
            this.f5569h = aVar;
            this.f5568g.f5581j = z2;
            aVar.f5575g = z;
            if (xVar != null) {
                this.e.add(xVar);
            }
            if (d() && xVar != null) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            } else if (!d() && xVar == null) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            throw new NullPointerException("connection == null");
        }
    }

    public void a(a aVar, @Nullable IOException iOException) {
        if (b(aVar, iOException)) {
            e eVar = this.d;
            eVar.z.a(this.c, aVar);
        }
    }

    public final boolean b(a aVar, @Nullable IOException iOException) {
        synchronized (this) {
            if (this.f5572k != null) {
                return false;
            }
            if (this.f5568g.f5581j && this.f5569h.f5575g) {
                return false;
            }
            this.f5572k = aVar;
            this.f5573l = iOException;
            notifyAll();
            this.d.d(this.c);
            return true;
        }
    }

    public z c() {
        synchronized (this) {
            if (!this.f5567f) {
                if (!d()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
            }
        }
        return this.f5569h;
    }

    public boolean d() {
        if (this.d.e == ((this.c & 1) == 1)) {
            return true;
        }
        return false;
    }

    public synchronized boolean e() {
        if (this.f5572k != null) {
            return false;
        }
        if ((this.f5568g.f5581j || this.f5568g.f5580i) && ((this.f5569h.f5575g || this.f5569h.f5574f) && this.f5567f)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003d, code lost:
        r2.f5570i.j();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0042, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized o.x f() {
        /*
            r2 = this;
            monitor-enter(r2)
            o.o0.j.l$c r0 = r2.f5570i     // Catch:{ all -> 0x0043 }
            r0.f()     // Catch:{ all -> 0x0043 }
        L_0x0006:
            java.util.Deque<o.x> r0 = r2.e     // Catch:{ all -> 0x003c }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x003c }
            if (r0 == 0) goto L_0x0016
            o.o0.j.a r0 = r2.f5572k     // Catch:{ all -> 0x003c }
            if (r0 != 0) goto L_0x0016
            r2.g()     // Catch:{ all -> 0x003c }
            goto L_0x0006
        L_0x0016:
            o.o0.j.l$c r0 = r2.f5570i     // Catch:{ all -> 0x0043 }
            r0.j()     // Catch:{ all -> 0x0043 }
            java.util.Deque<o.x> r0 = r2.e     // Catch:{ all -> 0x0043 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0043 }
            if (r0 != 0) goto L_0x002d
            java.util.Deque<o.x> r0 = r2.e     // Catch:{ all -> 0x0043 }
            java.lang.Object r0 = r0.removeFirst()     // Catch:{ all -> 0x0043 }
            o.x r0 = (o.x) r0     // Catch:{ all -> 0x0043 }
            monitor-exit(r2)
            return r0
        L_0x002d:
            java.io.IOException r0 = r2.f5573l     // Catch:{ all -> 0x0043 }
            if (r0 == 0) goto L_0x0034
            java.io.IOException r0 = r2.f5573l     // Catch:{ all -> 0x0043 }
            goto L_0x003b
        L_0x0034:
            okhttp3.internal.http2.StreamResetException r0 = new okhttp3.internal.http2.StreamResetException     // Catch:{ all -> 0x0043 }
            o.o0.j.a r1 = r2.f5572k     // Catch:{ all -> 0x0043 }
            r0.<init>(r1)     // Catch:{ all -> 0x0043 }
        L_0x003b:
            throw r0     // Catch:{ all -> 0x0043 }
        L_0x003c:
            r0 = move-exception
            o.o0.j.l$c r1 = r2.f5570i     // Catch:{ all -> 0x0043 }
            r1.j()     // Catch:{ all -> 0x0043 }
            throw r0     // Catch:{ all -> 0x0043 }
        L_0x0043:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.o0.j.l.f():o.x");
    }

    public void g() {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    /* compiled from: Http2Stream */
    public final class a implements z {
        public final f e = new f();

        /* renamed from: f  reason: collision with root package name */
        public boolean f5574f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f5575g;

        public a() {
        }

        public void a(f fVar, long j2) {
            this.e.a(fVar, j2);
            while (this.e.f5646f >= 16384) {
                a(false);
            }
        }

        public b0 c() {
            return l.this.f5571j;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001b, code lost:
            if (r8.e.f5646f <= 0) goto L_0x001f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x001d, code lost:
            r0 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x001f, code lost:
            r0 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0020, code lost:
            if (r0 == false) goto L_0x002e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0028, code lost:
            if (r8.e.f5646f <= 0) goto L_0x003b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x002a, code lost:
            a(true);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x002e, code lost:
            r0 = r8.f5576h;
            r0.d.a(r0.c, true, (p.f) null, 0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x003b, code lost:
            r2 = r8.f5576h;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x003d, code lost:
            monitor-enter(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
            r8.f5574f = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0040, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0041, code lost:
            r8.f5576h.d.z.flush();
            r8.f5576h.a();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x004f, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0011, code lost:
            if (r8.f5576h.f5569h.f5575g != false) goto L_0x003b;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void close() {
            /*
                r8 = this;
                o.o0.j.l r0 = o.o0.j.l.this
                monitor-enter(r0)
                boolean r1 = r8.f5574f     // Catch:{ all -> 0x0053 }
                if (r1 == 0) goto L_0x0009
                monitor-exit(r0)     // Catch:{ all -> 0x0053 }
                return
            L_0x0009:
                monitor-exit(r0)     // Catch:{ all -> 0x0053 }
                o.o0.j.l r0 = o.o0.j.l.this
                o.o0.j.l$a r0 = r0.f5569h
                boolean r0 = r0.f5575g
                r1 = 1
                if (r0 != 0) goto L_0x003b
                p.f r0 = r8.e
                long r2 = r0.f5646f
                r4 = 0
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 <= 0) goto L_0x001f
                r0 = 1
                goto L_0x0020
            L_0x001f:
                r0 = 0
            L_0x0020:
                if (r0 == 0) goto L_0x002e
            L_0x0022:
                p.f r0 = r8.e
                long r2 = r0.f5646f
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 <= 0) goto L_0x003b
                r8.a(r1)
                goto L_0x0022
            L_0x002e:
                o.o0.j.l r0 = o.o0.j.l.this
                o.o0.j.e r2 = r0.d
                int r3 = r0.c
                r4 = 1
                r5 = 0
                r6 = 0
                r2.a(r3, r4, r5, r6)
            L_0x003b:
                o.o0.j.l r2 = o.o0.j.l.this
                monitor-enter(r2)
                r8.f5574f = r1     // Catch:{ all -> 0x0050 }
                monitor-exit(r2)     // Catch:{ all -> 0x0050 }
                o.o0.j.l r0 = o.o0.j.l.this
                o.o0.j.e r0 = r0.d
                o.o0.j.m r0 = r0.z
                r0.flush()
                o.o0.j.l r0 = o.o0.j.l.this
                r0.a()
                return
            L_0x0050:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x0050 }
                throw r0
            L_0x0053:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0053 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: o.o0.j.l.a.close():void");
        }

        public void flush() {
            synchronized (l.this) {
                l.this.b();
            }
            while (this.e.f5646f > 0) {
                a(false);
                l.this.d.flush();
            }
        }

        /* JADX INFO: finally extract failed */
        public final void a(boolean z) {
            long min;
            boolean z2;
            synchronized (l.this) {
                l.this.f5571j.f();
                while (l.this.f5566b <= 0 && !this.f5575g && !this.f5574f && l.this.f5572k == null) {
                    try {
                        l.this.g();
                    } catch (Throwable th) {
                        l.this.f5571j.j();
                        throw th;
                    }
                }
                l.this.f5571j.j();
                l.this.b();
                min = Math.min(l.this.f5566b, this.e.f5646f);
                l.this.f5566b -= min;
            }
            l.this.f5571j.f();
            if (z) {
                try {
                    if (min == this.e.f5646f) {
                        z2 = true;
                        l.this.d.a(l.this.c, z2, this.e, min);
                        l.this.f5571j.j();
                    }
                } catch (Throwable th2) {
                    l.this.f5571j.j();
                    throw th2;
                }
            }
            z2 = false;
            l.this.d.a(l.this.c, z2, this.e, min);
            l.this.f5571j.j();
        }
    }

    public void a(a aVar) {
        if (b(aVar, (IOException) null)) {
            this.d.a(this.c, aVar);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x0017  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(o.x r3, boolean r4) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f5567f     // Catch:{ all -> 0x002d }
            r1 = 1
            if (r0 == 0) goto L_0x000e
            if (r4 != 0) goto L_0x0009
            goto L_0x000e
        L_0x0009:
            o.o0.j.l$b r0 = r2.f5568g     // Catch:{ all -> 0x002d }
            r0.f5579h = r3     // Catch:{ all -> 0x002d }
            goto L_0x0015
        L_0x000e:
            r2.f5567f = r1     // Catch:{ all -> 0x002d }
            java.util.Deque<o.x> r0 = r2.e     // Catch:{ all -> 0x002d }
            r0.add(r3)     // Catch:{ all -> 0x002d }
        L_0x0015:
            if (r4 == 0) goto L_0x001b
            o.o0.j.l$b r3 = r2.f5568g     // Catch:{ all -> 0x002d }
            r3.f5581j = r1     // Catch:{ all -> 0x002d }
        L_0x001b:
            boolean r3 = r2.e()     // Catch:{ all -> 0x002d }
            r2.notifyAll()     // Catch:{ all -> 0x002d }
            monitor-exit(r2)     // Catch:{ all -> 0x002d }
            if (r3 != 0) goto L_0x002c
            o.o0.j.e r3 = r2.d
            int r4 = r2.c
            r3.d(r4)
        L_0x002c:
            return
        L_0x002d:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x002d }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.o0.j.l.a(o.x, boolean):void");
    }

    public synchronized void b(a aVar) {
        if (this.f5572k == null) {
            this.f5572k = aVar;
            notifyAll();
        }
    }

    public void b() {
        a aVar = this.f5569h;
        if (aVar.f5574f) {
            throw new IOException("stream closed");
        } else if (aVar.f5575g) {
            throw new IOException("stream finished");
        } else if (this.f5572k != null) {
            Throwable th = this.f5573l;
            if (th == null) {
                th = new StreamResetException(this.f5572k);
            }
            throw th;
        }
    }

    public void a() {
        boolean z;
        boolean e2;
        synchronized (this) {
            z = !this.f5568g.f5581j && this.f5568g.f5580i && (this.f5569h.f5575g || this.f5569h.f5574f);
            e2 = e();
        }
        if (z) {
            a(a.CANCEL, (IOException) null);
        } else if (!e2) {
            this.d.d(this.c);
        }
    }
}
