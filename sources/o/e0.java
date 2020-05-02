package o;

import java.util.concurrent.atomic.AtomicInteger;
import o.o0.d;
import o.o0.g.j;
import o.o0.k.f;

/* compiled from: RealCall */
public final class e0 implements j {
    public final c0 e;

    /* renamed from: f  reason: collision with root package name */
    public j f5300f;

    /* renamed from: g  reason: collision with root package name */
    public final f0 f5301g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f5302h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f5303i;

    /* compiled from: RealCall */
    public final class a extends d {

        /* renamed from: f  reason: collision with root package name */
        public final k f5304f;

        /* renamed from: g  reason: collision with root package name */
        public volatile AtomicInteger f5305g = new AtomicInteger(0);

        static {
            Class<e0> cls = e0.class;
        }

        public a(k kVar) {
            super("OkHttp %s", e0.this.f5301g.a.f());
            this.f5304f = kVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0031 A[Catch:{ IOException -> 0x0056, all -> 0x0027, all -> 0x0054 }] */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0059 A[Catch:{ IOException -> 0x0056, all -> 0x0027, all -> 0x0054 }] */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x0077 A[Catch:{ IOException -> 0x0056, all -> 0x0027, all -> 0x0054 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a() {
            /*
                r5 = this;
                o.e0 r0 = o.e0.this
                o.o0.g.j r0 = r0.f5300f
                p.c r0 = r0.e
                r0.f()
                r0 = 0
                o.e0 r1 = o.e0.this     // Catch:{ IOException -> 0x0056, all -> 0x0027 }
                o.j0 r0 = r1.b()     // Catch:{ IOException -> 0x0056, all -> 0x0027 }
                r1 = 1
                o.k r2 = r5.f5304f     // Catch:{ IOException -> 0x0023, all -> 0x001f }
                o.e0 r3 = o.e0.this     // Catch:{ IOException -> 0x0023, all -> 0x001f }
                q.v$a r2 = (q.v.a) r2
                r2.a((o.j) r3, (o.j0) r0)     // Catch:{ IOException -> 0x0023, all -> 0x001f }
            L_0x001a:
                o.e0 r0 = o.e0.this
                o.c0 r0 = r0.e
                goto L_0x0081
            L_0x001f:
                r0 = move-exception
                r1 = r0
                r0 = 1
                goto L_0x0028
            L_0x0023:
                r0 = move-exception
                r1 = r0
                r0 = 1
                goto L_0x0057
            L_0x0027:
                r1 = move-exception
            L_0x0028:
                o.e0 r2 = o.e0.this     // Catch:{ all -> 0x0054 }
                o.o0.g.j r2 = r2.f5300f     // Catch:{ all -> 0x0054 }
                r2.a()     // Catch:{ all -> 0x0054 }
                if (r0 != 0) goto L_0x0053
                java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0054 }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0054 }
                r2.<init>()     // Catch:{ all -> 0x0054 }
                java.lang.String r3 = "canceled due to "
                r2.append(r3)     // Catch:{ all -> 0x0054 }
                r2.append(r1)     // Catch:{ all -> 0x0054 }
                java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0054 }
                r0.<init>(r2)     // Catch:{ all -> 0x0054 }
                r0.addSuppressed(r1)     // Catch:{ all -> 0x0054 }
                o.k r2 = r5.f5304f     // Catch:{ all -> 0x0054 }
                o.e0 r3 = o.e0.this     // Catch:{ all -> 0x0054 }
                q.v$a r2 = (q.v.a) r2
                r2.a((o.j) r3, (java.io.IOException) r0)     // Catch:{ all -> 0x0054 }
            L_0x0053:
                throw r1     // Catch:{ all -> 0x0054 }
            L_0x0054:
                r0 = move-exception
                goto L_0x0087
            L_0x0056:
                r1 = move-exception
            L_0x0057:
                if (r0 == 0) goto L_0x0077
                o.o0.k.f r0 = o.o0.k.f.a     // Catch:{ all -> 0x0054 }
                r2 = 4
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0054 }
                r3.<init>()     // Catch:{ all -> 0x0054 }
                java.lang.String r4 = "Callback failure for "
                r3.append(r4)     // Catch:{ all -> 0x0054 }
                o.e0 r4 = o.e0.this     // Catch:{ all -> 0x0054 }
                java.lang.String r4 = r4.c()     // Catch:{ all -> 0x0054 }
                r3.append(r4)     // Catch:{ all -> 0x0054 }
                java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0054 }
                r0.a((int) r2, (java.lang.String) r3, (java.lang.Throwable) r1)     // Catch:{ all -> 0x0054 }
                goto L_0x001a
            L_0x0077:
                o.k r0 = r5.f5304f     // Catch:{ all -> 0x0054 }
                o.e0 r2 = o.e0.this     // Catch:{ all -> 0x0054 }
                q.v$a r0 = (q.v.a) r0
                r0.a((o.j) r2, (java.io.IOException) r1)     // Catch:{ all -> 0x0054 }
                goto L_0x001a
            L_0x0081:
                o.r r0 = r0.e
                r0.b(r5)
                return
            L_0x0087:
                o.e0 r1 = o.e0.this
                o.c0 r1 = r1.e
                o.r r1 = r1.e
                r1.b(r5)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o.e0.a.a():void");
        }

        public String b() {
            return e0.this.f5301g.a.d;
        }
    }

    public e0(c0 c0Var, f0 f0Var, boolean z) {
        this.e = c0Var;
        this.f5301g = f0Var;
        this.f5302h = z;
    }

    public void a(k kVar) {
        synchronized (this) {
            if (!this.f5303i) {
                this.f5303i = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        j jVar = this.f5300f;
        if (jVar != null) {
            jVar.f5433f = f.a.a("response.body().close()");
            if (jVar.d != null) {
                this.e.e.a(new a(kVar));
                return;
            }
            throw null;
        }
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0092  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public o.j0 b() {
        /*
            r11 = this;
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            o.c0 r0 = r11.e
            java.util.List<o.z> r0 = r0.f5264i
            r1.addAll(r0)
            o.o0.h.h r0 = new o.o0.h.h
            o.c0 r2 = r11.e
            r0.<init>(r2)
            r1.add(r0)
            o.o0.h.a r0 = new o.o0.h.a
            o.c0 r2 = r11.e
            o.q r2 = r2.f5268m
            r0.<init>(r2)
            r1.add(r0)
            o.o0.f.b r0 = new o.o0.f.b
            o.c0 r2 = r11.e
            o.o0.f.e r2 = r2.f5270o
            r0.<init>(r2)
            r1.add(r0)
            o.o0.g.b r0 = new o.o0.g.b
            o.c0 r2 = r11.e
            r0.<init>(r2)
            r1.add(r0)
            boolean r0 = r11.f5302h
            if (r0 != 0) goto L_0x0043
            o.c0 r0 = r11.e
            java.util.List<o.z> r0 = r0.f5265j
            r1.addAll(r0)
        L_0x0043:
            o.o0.h.b r0 = new o.o0.h.b
            boolean r2 = r11.f5302h
            r0.<init>(r2)
            r1.add(r0)
            o.o0.h.f r10 = new o.o0.h.f
            o.o0.g.j r2 = r11.f5300f
            r3 = 0
            r4 = 0
            o.f0 r5 = r11.f5301g
            o.c0 r0 = r11.e
            int r7 = r0.C
            int r8 = r0.D
            int r9 = r0.E
            r0 = r10
            r6 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r0 = 0
            r1 = 0
            o.f0 r2 = r11.f5301g     // Catch:{ IOException -> 0x0085, all -> 0x0083 }
            o.j0 r2 = r10.a(r2)     // Catch:{ IOException -> 0x0085, all -> 0x0083 }
            o.o0.g.j r3 = r11.f5300f     // Catch:{ IOException -> 0x0085, all -> 0x0083 }
            boolean r3 = r3.d()     // Catch:{ IOException -> 0x0085, all -> 0x0083 }
            if (r3 != 0) goto L_0x0078
            o.o0.g.j r0 = r11.f5300f
            r0.a((java.io.IOException) r1)
            return r2
        L_0x0078:
            o.o0.e.a((java.io.Closeable) r2)     // Catch:{ IOException -> 0x0085, all -> 0x0083 }
            java.io.IOException r2 = new java.io.IOException     // Catch:{ IOException -> 0x0085, all -> 0x0083 }
            java.lang.String r3 = "Canceled"
            r2.<init>(r3)     // Catch:{ IOException -> 0x0085, all -> 0x0083 }
            throw r2     // Catch:{ IOException -> 0x0085, all -> 0x0083 }
        L_0x0083:
            r2 = move-exception
            goto L_0x0090
        L_0x0085:
            r0 = move-exception
            o.o0.g.j r2 = r11.f5300f     // Catch:{ all -> 0x008d }
            java.io.IOException r0 = r2.a((java.io.IOException) r0)     // Catch:{ all -> 0x008d }
            throw r0     // Catch:{ all -> 0x008d }
        L_0x008d:
            r0 = move-exception
            r2 = r0
            r0 = 1
        L_0x0090:
            if (r0 != 0) goto L_0x0097
            o.o0.g.j r0 = r11.f5300f
            r0.a((java.io.IOException) r1)
        L_0x0097:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.e0.b():o.j0");
    }

    public String c() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f5300f.d() ? "canceled " : "");
        sb.append(this.f5302h ? "web socket" : "call");
        sb.append(" to ");
        sb.append(this.f5301g.a.f());
        return sb.toString();
    }

    public Object clone() {
        c0 c0Var = this.e;
        e0 e0Var = new e0(c0Var, this.f5301g, this.f5302h);
        e0Var.f5300f = new j(c0Var, e0Var);
        return e0Var;
    }

    public j0 f() {
        synchronized (this) {
            if (!this.f5303i) {
                this.f5303i = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        this.f5300f.e.f();
        j jVar = this.f5300f;
        if (jVar != null) {
            jVar.f5433f = f.a.a("response.body().close()");
            if (jVar.d != null) {
                try {
                    this.e.e.a(this);
                    return b();
                } finally {
                    r rVar = this.e.e;
                    rVar.a(rVar.f5618f, this);
                }
            } else {
                throw null;
            }
        } else {
            throw null;
        }
    }
}
