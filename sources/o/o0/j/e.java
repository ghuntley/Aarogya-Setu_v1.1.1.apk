package o.o0.j;

import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import o.o0.j.k;
import o.o0.j.o;

/* compiled from: Http2Connection */
public final class e implements Closeable {
    public static final ExecutorService C = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), o.o0.e.a("OkHttp Http2Connection", true));
    public final i A;
    public final Set<Integer> B = new LinkedHashSet();
    public final boolean e;

    /* renamed from: f  reason: collision with root package name */
    public final g f5502f;

    /* renamed from: g  reason: collision with root package name */
    public final Map<Integer, l> f5503g = new LinkedHashMap();

    /* renamed from: h  reason: collision with root package name */
    public final String f5504h;

    /* renamed from: i  reason: collision with root package name */
    public int f5505i;

    /* renamed from: j  reason: collision with root package name */
    public int f5506j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f5507k;

    /* renamed from: l  reason: collision with root package name */
    public final ScheduledExecutorService f5508l;

    /* renamed from: m  reason: collision with root package name */
    public final ExecutorService f5509m;

    /* renamed from: n  reason: collision with root package name */
    public final o f5510n;

    /* renamed from: o  reason: collision with root package name */
    public long f5511o = 0;

    /* renamed from: p  reason: collision with root package name */
    public long f5512p = 0;

    /* renamed from: q  reason: collision with root package name */
    public long f5513q = 0;
    public long r = 0;
    public long s = 0;
    public long t = 0;
    public long u = 0;
    public long v;
    public p w = new p();
    public final p x = new p();
    public final Socket y;
    public final m z;

    /* compiled from: Http2Connection */
    public class a extends o.o0.d {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ int f5514f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ a f5515g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(String str, Object[] objArr, int i2, a aVar) {
            super(str, objArr);
            this.f5514f = i2;
            this.f5515g = aVar;
        }

        public void a() {
            try {
                e eVar = e.this;
                eVar.z.a(this.f5514f, this.f5515g);
            } catch (IOException e) {
                e.a(e.this, e);
            }
        }
    }

    /* compiled from: Http2Connection */
    public class b extends o.o0.d {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ int f5517f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ long f5518g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(String str, Object[] objArr, int i2, long j2) {
            super(str, objArr);
            this.f5517f = i2;
            this.f5518g = j2;
        }

        public void a() {
            try {
                e.this.z.a(this.f5517f, this.f5518g);
            } catch (IOException e) {
                e.a(e.this, e);
            }
        }
    }

    /* compiled from: Http2Connection */
    public class c extends o.o0.d {
        public c(String str, Object... objArr) {
            super(str, objArr);
        }

        public void a() {
            e.this.a(false, 2, 0);
        }
    }

    /* compiled from: Http2Connection */
    public class d extends o.o0.d {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ int f5521f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ List f5522g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(String str, Object[] objArr, int i2, List list) {
            super(str, objArr);
            this.f5521f = i2;
            this.f5522g = list;
        }

        public void a() {
            e eVar = e.this;
            o oVar = eVar.f5510n;
            int i2 = this.f5521f;
            if (((o.a) oVar) != null) {
                try {
                    eVar.z.a(i2, a.CANCEL);
                    synchronized (e.this) {
                        e.this.B.remove(Integer.valueOf(this.f5521f));
                    }
                } catch (IOException unused) {
                }
            } else {
                throw null;
            }
        }
    }

    /* renamed from: o.o0.j.e$e  reason: collision with other inner class name */
    /* compiled from: Http2Connection */
    public static class C0153e {
        public Socket a;

        /* renamed from: b  reason: collision with root package name */
        public String f5524b;
        public p.h c;
        public p.g d;
        public g e = g.a;

        /* renamed from: f  reason: collision with root package name */
        public o f5525f = o.a;

        /* renamed from: g  reason: collision with root package name */
        public boolean f5526g;

        /* renamed from: h  reason: collision with root package name */
        public int f5527h;

        public C0153e(boolean z) {
            this.f5526g = z;
        }
    }

    /* compiled from: Http2Connection */
    public final class f extends o.o0.d {
        public f() {
            super("OkHttp %s ping", e.this.f5504h);
        }

        public void a() {
            boolean z;
            synchronized (e.this) {
                if (e.this.f5512p < e.this.f5511o) {
                    z = true;
                } else {
                    e.this.f5511o++;
                    z = false;
                }
            }
            if (z) {
                e.a(e.this, (IOException) null);
            } else {
                e.this.a(false, 1, 0);
            }
        }
    }

    /* compiled from: Http2Connection */
    public static abstract class g {
        public static final g a = new a();

        /* compiled from: Http2Connection */
        public class a extends g {
            public void a(l lVar) {
                lVar.a(a.REFUSED_STREAM, (IOException) null);
            }
        }

        public void a(e eVar) {
        }

        public abstract void a(l lVar);
    }

    /* compiled from: Http2Connection */
    public final class h extends o.o0.d {

        /* renamed from: f  reason: collision with root package name */
        public final boolean f5529f;

        /* renamed from: g  reason: collision with root package name */
        public final int f5530g;

        /* renamed from: h  reason: collision with root package name */
        public final int f5531h;

        public h(boolean z, int i2, int i3) {
            super("OkHttp %s ping %08x%08x", e.this.f5504h, Integer.valueOf(i2), Integer.valueOf(i3));
            this.f5529f = z;
            this.f5530g = i2;
            this.f5531h = i3;
        }

        public void a() {
            e.this.a(this.f5529f, this.f5530g, this.f5531h);
        }
    }

    static {
        Class<e> cls = e.class;
    }

    public e(C0153e eVar) {
        C0153e eVar2 = eVar;
        this.f5510n = eVar2.f5525f;
        boolean z2 = eVar2.f5526g;
        this.e = z2;
        this.f5502f = eVar2.e;
        int i2 = z2 ? 1 : 2;
        this.f5506j = i2;
        if (eVar2.f5526g) {
            this.f5506j = i2 + 2;
        }
        if (eVar2.f5526g) {
            this.w.a(7, 16777216);
        }
        this.f5504h = eVar2.f5524b;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new o.o0.b(o.o0.e.a("OkHttp %s Writer", this.f5504h), false));
        this.f5508l = scheduledThreadPoolExecutor;
        if (eVar2.f5527h != 0) {
            f fVar = new f();
            int i3 = eVar2.f5527h;
            scheduledThreadPoolExecutor.scheduleAtFixedRate(fVar, (long) i3, (long) i3, TimeUnit.MILLISECONDS);
        }
        this.f5509m = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new o.o0.b(o.o0.e.a("OkHttp %s Push Observer", this.f5504h), true));
        this.x.a(7, 65535);
        this.x.a(5, 16384);
        this.v = (long) this.x.a();
        this.y = eVar2.a;
        this.z = new m(eVar2.d, this.e);
        this.A = new i(new k(eVar2.c, this.e));
    }

    public synchronized int a() {
        int i2;
        p pVar = this.x;
        i2 = Integer.MAX_VALUE;
        if ((pVar.a & 16) != 0) {
            i2 = pVar.f5592b[4];
        }
        return i2;
    }

    public synchronized l b(int i2) {
        return this.f5503g.get(Integer.valueOf(i2));
    }

    public boolean c(int i2) {
        return i2 != 0 && (i2 & 1) == 0;
    }

    public void close() {
        a(a.NO_ERROR, a.CANCEL, (IOException) null);
    }

    public synchronized l d(int i2) {
        l remove;
        remove = this.f5503g.remove(Integer.valueOf(i2));
        notifyAll();
        return remove;
    }

    public synchronized boolean e(long j2) {
        if (this.f5507k) {
            return false;
        }
        if (this.r >= this.f5513q || j2 < this.t) {
            return true;
        }
        return false;
    }

    public synchronized void f(long j2) {
        long j3 = this.u + j2;
        this.u = j3;
        if (j3 >= ((long) (this.w.a() / 2))) {
            a(0, this.u);
            this.u = 0;
        }
    }

    public void flush() {
        this.z.flush();
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0043  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final o.o0.j.l a(int r11, java.util.List<o.o0.j.b> r12, boolean r13) {
        /*
            r10 = this;
            r6 = r13 ^ 1
            r4 = 0
            o.o0.j.m r7 = r10.z
            monitor-enter(r7)
            monitor-enter(r10)     // Catch:{ all -> 0x0078 }
            int r0 = r10.f5506j     // Catch:{ all -> 0x0075 }
            r1 = 1073741823(0x3fffffff, float:1.9999999)
            if (r0 <= r1) goto L_0x0013
            o.o0.j.a r0 = o.o0.j.a.REFUSED_STREAM     // Catch:{ all -> 0x0075 }
            r10.a((o.o0.j.a) r0)     // Catch:{ all -> 0x0075 }
        L_0x0013:
            boolean r0 = r10.f5507k     // Catch:{ all -> 0x0075 }
            if (r0 != 0) goto L_0x006f
            int r8 = r10.f5506j     // Catch:{ all -> 0x0075 }
            int r0 = r10.f5506j     // Catch:{ all -> 0x0075 }
            int r0 = r0 + 2
            r10.f5506j = r0     // Catch:{ all -> 0x0075 }
            o.o0.j.l r9 = new o.o0.j.l     // Catch:{ all -> 0x0075 }
            r5 = 0
            r0 = r9
            r1 = r8
            r2 = r10
            r3 = r6
            r0.<init>(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x0075 }
            if (r13 == 0) goto L_0x003c
            long r0 = r10.v     // Catch:{ all -> 0x0075 }
            r2 = 0
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 == 0) goto L_0x003c
            long r0 = r9.f5566b     // Catch:{ all -> 0x0075 }
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 != 0) goto L_0x003a
            goto L_0x003c
        L_0x003a:
            r13 = 0
            goto L_0x003d
        L_0x003c:
            r13 = 1
        L_0x003d:
            boolean r0 = r9.e()     // Catch:{ all -> 0x0075 }
            if (r0 == 0) goto L_0x004c
            java.util.Map<java.lang.Integer, o.o0.j.l> r0 = r10.f5503g     // Catch:{ all -> 0x0075 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0075 }
            r0.put(r1, r9)     // Catch:{ all -> 0x0075 }
        L_0x004c:
            monitor-exit(r10)     // Catch:{ all -> 0x0075 }
            if (r11 != 0) goto L_0x0055
            o.o0.j.m r11 = r10.z     // Catch:{ all -> 0x0078 }
            r11.a((boolean) r6, (int) r8, (java.util.List<o.o0.j.b>) r12)     // Catch:{ all -> 0x0078 }
            goto L_0x005e
        L_0x0055:
            boolean r0 = r10.e     // Catch:{ all -> 0x0078 }
            if (r0 != 0) goto L_0x0067
            o.o0.j.m r0 = r10.z     // Catch:{ all -> 0x0078 }
            r0.a((int) r11, (int) r8, (java.util.List<o.o0.j.b>) r12)     // Catch:{ all -> 0x0078 }
        L_0x005e:
            monitor-exit(r7)     // Catch:{ all -> 0x0078 }
            if (r13 == 0) goto L_0x0066
            o.o0.j.m r11 = r10.z
            r11.flush()
        L_0x0066:
            return r9
        L_0x0067:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0078 }
            java.lang.String r12 = "client streams shouldn't have associated stream IDs"
            r11.<init>(r12)     // Catch:{ all -> 0x0078 }
            throw r11     // Catch:{ all -> 0x0078 }
        L_0x006f:
            okhttp3.internal.http2.ConnectionShutdownException r11 = new okhttp3.internal.http2.ConnectionShutdownException     // Catch:{ all -> 0x0075 }
            r11.<init>()     // Catch:{ all -> 0x0075 }
            throw r11     // Catch:{ all -> 0x0075 }
        L_0x0075:
            r11 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0075 }
            throw r11     // Catch:{ all -> 0x0078 }
        L_0x0078:
            r11 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0078 }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: o.o0.j.e.a(int, java.util.List, boolean):o.o0.j.l");
    }

    public void f() {
        synchronized (this) {
            if (this.r >= this.f5513q) {
                this.f5513q++;
                this.t = System.nanoTime() + 1000000000;
                try {
                    this.f5508l.execute(new c("OkHttp %s ping", this.f5504h));
                } catch (RejectedExecutionException unused) {
                }
            }
        }
    }

    /* compiled from: Http2Connection */
    public class i extends o.o0.d implements k.b {

        /* renamed from: f  reason: collision with root package name */
        public final k f5533f;

        /* compiled from: Http2Connection */
        public class a extends o.o0.d {

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ l f5535f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(String str, Object[] objArr, l lVar) {
                super(str, objArr);
                this.f5535f = lVar;
            }

            public void a() {
                try {
                    e.this.f5502f.a(this.f5535f);
                } catch (IOException e) {
                    o.o0.k.f fVar = o.o0.k.f.a;
                    StringBuilder a = i.a.a.a.a.a("Http2Connection.Listener failure for ");
                    a.append(e.this.f5504h);
                    fVar.a(4, a.toString(), (Throwable) e);
                    try {
                        this.f5535f.a(a.PROTOCOL_ERROR, e);
                    } catch (IOException unused) {
                    }
                }
            }
        }

        /* compiled from: Http2Connection */
        public class b extends o.o0.d {
            public b(String str, Object... objArr) {
                super(str, objArr);
            }

            public void a() {
                e eVar = e.this;
                eVar.f5502f.a(eVar);
            }
        }

        public i(k kVar) {
            super("OkHttp %s", e.this.f5504h);
            this.f5533f = kVar;
        }

        public void a() {
            a aVar;
            a aVar2;
            a aVar3 = a.INTERNAL_ERROR;
            e = null;
            try {
                this.f5533f.a((k.b) this);
                while (this.f5533f.a(false, (k.b) this)) {
                }
                aVar = a.NO_ERROR;
                try {
                    aVar2 = a.CANCEL;
                } catch (IOException e) {
                    e = e;
                }
            } catch (IOException e2) {
                e = e2;
                aVar = aVar3;
                try {
                    aVar = a.PROTOCOL_ERROR;
                    aVar2 = a.PROTOCOL_ERROR;
                    e.this.a(aVar, aVar2, e);
                    o.o0.e.a((Closeable) this.f5533f);
                } catch (Throwable th) {
                    th = th;
                    e.this.a(aVar, aVar3, e);
                    o.o0.e.a((Closeable) this.f5533f);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                aVar = aVar3;
                e.this.a(aVar, aVar3, e);
                o.o0.e.a((Closeable) this.f5533f);
                throw th;
            }
            e.this.a(aVar, aVar2, e);
            o.o0.e.a((Closeable) this.f5533f);
        }

        public void a(boolean z, int i2, int i3, List<b> list) {
            if (e.this.c(i2)) {
                e eVar = e.this;
                if (eVar != null) {
                    try {
                        eVar.a((o.o0.d) new f(eVar, "OkHttp %s Push Headers[%s]", new Object[]{eVar.f5504h, Integer.valueOf(i2)}, i2, list, z));
                    } catch (RejectedExecutionException unused) {
                    }
                } else {
                    throw null;
                }
            } else {
                synchronized (e.this) {
                    l b2 = e.this.b(i2);
                    if (b2 != null) {
                        b2.a(o.o0.e.b(list), z);
                    } else if (!e.this.f5507k) {
                        if (i2 > e.this.f5505i) {
                            if (i2 % 2 != e.this.f5506j % 2) {
                                int i4 = i2;
                                l lVar = new l(i4, e.this, false, z, o.o0.e.b(list));
                                e.this.f5505i = i2;
                                e.this.f5503g.put(Integer.valueOf(i2), lVar);
                                e.C.execute(new a("OkHttp %s stream %d", new Object[]{e.this.f5504h, Integer.valueOf(i2)}, lVar));
                            }
                        }
                    }
                }
            }
        }

        /* JADX WARNING: type inference failed for: r2v13, types: [java.lang.Object[]] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a(boolean r11, o.o0.j.p r12) {
            /*
                r10 = this;
                o.o0.j.e r0 = o.o0.j.e.this
                o.o0.j.m r0 = r0.z
                monitor-enter(r0)
                o.o0.j.e r1 = o.o0.j.e.this     // Catch:{ all -> 0x00c0 }
                monitor-enter(r1)     // Catch:{ all -> 0x00c0 }
                o.o0.j.e r2 = o.o0.j.e.this     // Catch:{ all -> 0x00bd }
                o.o0.j.p r2 = r2.x     // Catch:{ all -> 0x00bd }
                int r2 = r2.a()     // Catch:{ all -> 0x00bd }
                r3 = 0
                if (r11 == 0) goto L_0x001e
                o.o0.j.e r11 = o.o0.j.e.this     // Catch:{ all -> 0x00bd }
                o.o0.j.p r11 = r11.x     // Catch:{ all -> 0x00bd }
                r11.a = r3     // Catch:{ all -> 0x00bd }
                int[] r11 = r11.f5592b     // Catch:{ all -> 0x00bd }
                java.util.Arrays.fill(r11, r3)     // Catch:{ all -> 0x00bd }
            L_0x001e:
                o.o0.j.e r11 = o.o0.j.e.this     // Catch:{ all -> 0x00bd }
                o.o0.j.p r11 = r11.x     // Catch:{ all -> 0x00bd }
                r4 = 0
                if (r11 == 0) goto L_0x00bc
                r5 = 0
            L_0x0026:
                r6 = 10
                r7 = 1
                if (r5 >= r6) goto L_0x0041
                int r6 = r7 << r5
                int r8 = r12.a     // Catch:{ all -> 0x00bd }
                r6 = r6 & r8
                if (r6 == 0) goto L_0x0033
                goto L_0x0034
            L_0x0033:
                r7 = 0
            L_0x0034:
                if (r7 != 0) goto L_0x0037
                goto L_0x003e
            L_0x0037:
                int[] r6 = r12.f5592b     // Catch:{ all -> 0x00bd }
                r6 = r6[r5]     // Catch:{ all -> 0x00bd }
                r11.a(r5, r6)     // Catch:{ all -> 0x00bd }
            L_0x003e:
                int r5 = r5 + 1
                goto L_0x0026
            L_0x0041:
                o.o0.j.e r11 = o.o0.j.e.this     // Catch:{ all -> 0x00bd }
                o.o0.j.p r11 = r11.x     // Catch:{ all -> 0x00bd }
                int r11 = r11.a()     // Catch:{ all -> 0x00bd }
                r12 = -1
                r5 = 0
                if (r11 == r12) goto L_0x0076
                if (r11 == r2) goto L_0x0076
                int r11 = r11 - r2
                long r11 = (long) r11     // Catch:{ all -> 0x00bd }
                o.o0.j.e r2 = o.o0.j.e.this     // Catch:{ all -> 0x00bd }
                java.util.Map<java.lang.Integer, o.o0.j.l> r2 = r2.f5503g     // Catch:{ all -> 0x00bd }
                boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x00bd }
                if (r2 != 0) goto L_0x0077
                o.o0.j.e r2 = o.o0.j.e.this     // Catch:{ all -> 0x00bd }
                java.util.Map<java.lang.Integer, o.o0.j.l> r2 = r2.f5503g     // Catch:{ all -> 0x00bd }
                java.util.Collection r2 = r2.values()     // Catch:{ all -> 0x00bd }
                o.o0.j.e r4 = o.o0.j.e.this     // Catch:{ all -> 0x00bd }
                java.util.Map<java.lang.Integer, o.o0.j.l> r4 = r4.f5503g     // Catch:{ all -> 0x00bd }
                int r4 = r4.size()     // Catch:{ all -> 0x00bd }
                o.o0.j.l[] r4 = new o.o0.j.l[r4]     // Catch:{ all -> 0x00bd }
                java.lang.Object[] r2 = r2.toArray(r4)     // Catch:{ all -> 0x00bd }
                r4 = r2
                o.o0.j.l[] r4 = (o.o0.j.l[]) r4     // Catch:{ all -> 0x00bd }
                goto L_0x0077
            L_0x0076:
                r11 = r5
            L_0x0077:
                monitor-exit(r1)     // Catch:{ all -> 0x00bd }
                o.o0.j.e r1 = o.o0.j.e.this     // Catch:{ IOException -> 0x0084 }
                o.o0.j.m r1 = r1.z     // Catch:{ IOException -> 0x0084 }
                o.o0.j.e r2 = o.o0.j.e.this     // Catch:{ IOException -> 0x0084 }
                o.o0.j.p r2 = r2.x     // Catch:{ IOException -> 0x0084 }
                r1.a(r2)     // Catch:{ IOException -> 0x0084 }
                goto L_0x008a
            L_0x0084:
                r1 = move-exception
                o.o0.j.e r2 = o.o0.j.e.this     // Catch:{ all -> 0x00c0 }
                o.o0.j.e.a((o.o0.j.e) r2, (java.io.IOException) r1)     // Catch:{ all -> 0x00c0 }
            L_0x008a:
                monitor-exit(r0)     // Catch:{ all -> 0x00c0 }
                if (r4 == 0) goto L_0x00a7
                int r0 = r4.length
                r1 = 0
            L_0x008f:
                if (r1 >= r0) goto L_0x00a7
                r2 = r4[r1]
                monitor-enter(r2)
                long r8 = r2.f5566b     // Catch:{ all -> 0x00a4 }
                long r8 = r8 + r11
                r2.f5566b = r8     // Catch:{ all -> 0x00a4 }
                int r8 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
                if (r8 <= 0) goto L_0x00a0
                r2.notifyAll()     // Catch:{ all -> 0x00a4 }
            L_0x00a0:
                monitor-exit(r2)     // Catch:{ all -> 0x00a4 }
                int r1 = r1 + 1
                goto L_0x008f
            L_0x00a4:
                r11 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x00a4 }
                throw r11
            L_0x00a7:
                java.util.concurrent.ExecutorService r11 = o.o0.j.e.C
                o.o0.j.e$i$b r12 = new o.o0.j.e$i$b
                java.lang.Object[] r0 = new java.lang.Object[r7]
                o.o0.j.e r1 = o.o0.j.e.this
                java.lang.String r1 = r1.f5504h
                r0[r3] = r1
                java.lang.String r1 = "OkHttp %s settings"
                r12.<init>(r1, r0)
                r11.execute(r12)
                return
            L_0x00bc:
                throw r4     // Catch:{ all -> 0x00bd }
            L_0x00bd:
                r11 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x00bd }
                throw r11     // Catch:{ all -> 0x00c0 }
            L_0x00c0:
                r11 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x00c0 }
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: o.o0.j.e.i.a(boolean, o.o0.j.p):void");
        }

        public void a(boolean z, int i2, int i3) {
            if (z) {
                synchronized (e.this) {
                    if (i2 == 1) {
                        try {
                            e.this.f5512p++;
                        } catch (Throwable th) {
                            throw th;
                        }
                    } else if (i2 == 2) {
                        e.this.r++;
                    } else if (i2 == 3) {
                        e.this.s++;
                        e.this.notifyAll();
                    }
                }
                return;
            }
            try {
                e.this.f5508l.execute(new h(true, i2, i3));
            } catch (RejectedExecutionException unused) {
            }
        }

        public void a(int i2, a aVar, p.i iVar) {
            l[] lVarArr;
            iVar.h();
            synchronized (e.this) {
                lVarArr = (l[]) e.this.f5503g.values().toArray(new l[e.this.f5503g.size()]);
                e.this.f5507k = true;
            }
            for (l lVar : lVarArr) {
                if (lVar.c > i2 && lVar.d()) {
                    lVar.b(a.REFUSED_STREAM);
                    e.this.d(lVar.c);
                }
            }
        }

        public void a(int i2, long j2) {
            if (i2 == 0) {
                synchronized (e.this) {
                    e.this.v += j2;
                    e.this.notifyAll();
                }
                return;
            }
            l b2 = e.this.b(i2);
            if (b2 != null) {
                synchronized (b2) {
                    b2.f5566b += j2;
                    if (j2 > 0) {
                        b2.notifyAll();
                    }
                }
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:26|27|28) */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r3 = java.lang.Math.min((int) java.lang.Math.min(r12, r8.v), r8.z.f5587h);
        r6 = (long) r3;
        r8.v -= r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0064, code lost:
        throw new java.io.InterruptedIOException();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0058 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(int r9, boolean r10, p.f r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x000d
            o.o0.j.m r12 = r8.z
            r12.a((boolean) r10, (int) r9, (p.f) r11, (int) r0)
            return
        L_0x000d:
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 <= 0) goto L_0x0067
            monitor-enter(r8)
        L_0x0012:
            long r3 = r8.v     // Catch:{ InterruptedException -> 0x0058 }
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 > 0) goto L_0x0030
            java.util.Map<java.lang.Integer, o.o0.j.l> r3 = r8.f5503g     // Catch:{ InterruptedException -> 0x0058 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch:{ InterruptedException -> 0x0058 }
            boolean r3 = r3.containsKey(r4)     // Catch:{ InterruptedException -> 0x0058 }
            if (r3 == 0) goto L_0x0028
            r8.wait()     // Catch:{ InterruptedException -> 0x0058 }
            goto L_0x0012
        L_0x0028:
            java.io.IOException r9 = new java.io.IOException     // Catch:{ InterruptedException -> 0x0058 }
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch:{ InterruptedException -> 0x0058 }
            throw r9     // Catch:{ InterruptedException -> 0x0058 }
        L_0x0030:
            long r3 = r8.v     // Catch:{ all -> 0x0056 }
            long r3 = java.lang.Math.min(r12, r3)     // Catch:{ all -> 0x0056 }
            int r4 = (int) r3     // Catch:{ all -> 0x0056 }
            o.o0.j.m r3 = r8.z     // Catch:{ all -> 0x0056 }
            int r3 = r3.f5587h     // Catch:{ all -> 0x0056 }
            int r3 = java.lang.Math.min(r4, r3)     // Catch:{ all -> 0x0056 }
            long r4 = r8.v     // Catch:{ all -> 0x0056 }
            long r6 = (long) r3     // Catch:{ all -> 0x0056 }
            long r4 = r4 - r6
            r8.v = r4     // Catch:{ all -> 0x0056 }
            monitor-exit(r8)     // Catch:{ all -> 0x0056 }
            long r12 = r12 - r6
            o.o0.j.m r4 = r8.z
            if (r10 == 0) goto L_0x0051
            int r5 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r5 != 0) goto L_0x0051
            r5 = 1
            goto L_0x0052
        L_0x0051:
            r5 = 0
        L_0x0052:
            r4.a((boolean) r5, (int) r9, (p.f) r11, (int) r3)
            goto L_0x000d
        L_0x0056:
            r9 = move-exception
            goto L_0x0065
        L_0x0058:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0056 }
            r9.interrupt()     // Catch:{ all -> 0x0056 }
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch:{ all -> 0x0056 }
            r9.<init>()     // Catch:{ all -> 0x0056 }
            throw r9     // Catch:{ all -> 0x0056 }
        L_0x0065:
            monitor-exit(r8)     // Catch:{ all -> 0x0056 }
            throw r9
        L_0x0067:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.o0.j.e.a(int, boolean, p.f, long):void");
    }

    public void a(int i2, a aVar) {
        try {
            this.f5508l.execute(new a("OkHttp %s stream %d", new Object[]{this.f5504h, Integer.valueOf(i2)}, i2, aVar));
        } catch (RejectedExecutionException unused) {
        }
    }

    public void a(int i2, long j2) {
        try {
            this.f5508l.execute(new b("OkHttp Window Update %s stream %d", new Object[]{this.f5504h, Integer.valueOf(i2)}, i2, j2));
        } catch (RejectedExecutionException unused) {
        }
    }

    public void a(boolean z2, int i2, int i3) {
        try {
            this.z.a(z2, i2, i3);
        } catch (IOException e2) {
            a aVar = a.PROTOCOL_ERROR;
            a(aVar, aVar, e2);
        }
    }

    public void a(a aVar) {
        synchronized (this.z) {
            synchronized (this) {
                if (!this.f5507k) {
                    this.f5507k = true;
                    int i2 = this.f5505i;
                    this.z.a(i2, aVar, o.o0.e.a);
                }
            }
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x003a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(o.o0.j.a r4, o.o0.j.a r5, @javax.annotation.Nullable java.io.IOException r6) {
        /*
            r3 = this;
            r3.a((o.o0.j.a) r4)     // Catch:{ IOException -> 0x0003 }
        L_0x0003:
            r4 = 0
            monitor-enter(r3)
            java.util.Map<java.lang.Integer, o.o0.j.l> r0 = r3.f5503g     // Catch:{ all -> 0x004a }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x004a }
            if (r0 != 0) goto L_0x0026
            java.util.Map<java.lang.Integer, o.o0.j.l> r4 = r3.f5503g     // Catch:{ all -> 0x004a }
            java.util.Collection r4 = r4.values()     // Catch:{ all -> 0x004a }
            java.util.Map<java.lang.Integer, o.o0.j.l> r0 = r3.f5503g     // Catch:{ all -> 0x004a }
            int r0 = r0.size()     // Catch:{ all -> 0x004a }
            o.o0.j.l[] r0 = new o.o0.j.l[r0]     // Catch:{ all -> 0x004a }
            java.lang.Object[] r4 = r4.toArray(r0)     // Catch:{ all -> 0x004a }
            o.o0.j.l[] r4 = (o.o0.j.l[]) r4     // Catch:{ all -> 0x004a }
            java.util.Map<java.lang.Integer, o.o0.j.l> r0 = r3.f5503g     // Catch:{ all -> 0x004a }
            r0.clear()     // Catch:{ all -> 0x004a }
        L_0x0026:
            monitor-exit(r3)     // Catch:{ all -> 0x004a }
            if (r4 == 0) goto L_0x0035
            int r0 = r4.length
            r1 = 0
        L_0x002b:
            if (r1 >= r0) goto L_0x0035
            r2 = r4[r1]
            r2.a((o.o0.j.a) r5, (java.io.IOException) r6)     // Catch:{ IOException -> 0x0032 }
        L_0x0032:
            int r1 = r1 + 1
            goto L_0x002b
        L_0x0035:
            o.o0.j.m r4 = r3.z     // Catch:{ IOException -> 0x003a }
            r4.close()     // Catch:{ IOException -> 0x003a }
        L_0x003a:
            java.net.Socket r4 = r3.y     // Catch:{ IOException -> 0x003f }
            r4.close()     // Catch:{ IOException -> 0x003f }
        L_0x003f:
            java.util.concurrent.ScheduledExecutorService r4 = r3.f5508l
            r4.shutdown()
            java.util.concurrent.ExecutorService r4 = r3.f5509m
            r4.shutdown()
            return
        L_0x004a:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x004a }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.o0.j.e.a(o.o0.j.a, o.o0.j.a, java.io.IOException):void");
    }

    public static /* synthetic */ void a(e eVar, IOException iOException) {
        if (eVar != null) {
            a aVar = a.PROTOCOL_ERROR;
            eVar.a(aVar, aVar, iOException);
            return;
        }
        throw null;
    }

    public void a(int i2, List<b> list) {
        synchronized (this) {
            if (this.B.contains(Integer.valueOf(i2))) {
                a(i2, a.PROTOCOL_ERROR);
                return;
            }
            this.B.add(Integer.valueOf(i2));
            try {
                a((o.o0.d) new d("OkHttp %s Push Request[%s]", new Object[]{this.f5504h, Integer.valueOf(i2)}, i2, list));
            } catch (RejectedExecutionException unused) {
            }
        }
    }

    public final synchronized void a(o.o0.d dVar) {
        if (!this.f5507k) {
            this.f5509m.execute(dVar);
        }
    }
}
