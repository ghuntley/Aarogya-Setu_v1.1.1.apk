package o.o0.g;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import o.c0;
import o.f0;
import o.n;
import o.o0.e;
import o.o0.h.f;
import o.u;
import o.z;
import okhttp3.internal.connection.RouteException;
import p.c;

/* compiled from: Transmitter */
public final class j {
    public final c0 a;

    /* renamed from: b  reason: collision with root package name */
    public final g f5432b;
    public final o.j c;
    public final u d;
    public final c e = new a();
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    public Object f5433f;

    /* renamed from: g  reason: collision with root package name */
    public f0 f5434g;

    /* renamed from: h  reason: collision with root package name */
    public e f5435h;

    /* renamed from: i  reason: collision with root package name */
    public f f5436i;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    public d f5437j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f5438k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f5439l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f5440m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f5441n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f5442o;

    /* compiled from: Transmitter */
    public class a extends c {
        public a() {
        }

        public void h() {
            j.this.a();
        }
    }

    /* compiled from: Transmitter */
    public static final class b extends WeakReference<j> {
        public final Object a;

        public b(j jVar, Object obj) {
            super(jVar);
            this.a = obj;
        }
    }

    public j(c0 c0Var, o.j jVar) {
        this.a = c0Var;
        o.o0.c cVar = o.o0.c.a;
        n nVar = c0Var.w;
        if (((c0.a) cVar) != null) {
            this.f5432b = nVar.a;
            this.c = jVar;
            this.d = c0Var.f5266k.a(jVar);
            this.e.a((long) c0Var.B, TimeUnit.MILLISECONDS);
            return;
        }
        throw null;
    }

    public d a(z.a aVar, boolean z) {
        synchronized (this.f5432b) {
            if (this.f5442o) {
                throw new IllegalStateException("released");
            } else if (this.f5437j != null) {
                throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
            }
        }
        e eVar = this.f5435h;
        c0 c0Var = this.a;
        if (eVar != null) {
            f fVar = (f) aVar;
            try {
                d dVar = new d(this, this.c, this.d, this.f5435h, eVar.a(fVar.f5449g, fVar.f5450h, fVar.f5451i, c0Var.F, c0Var.A, z).a(c0Var, aVar));
                synchronized (this.f5432b) {
                    this.f5437j = dVar;
                    this.f5438k = false;
                    this.f5439l = false;
                }
                return dVar;
            } catch (RouteException e2) {
                eVar.d();
                throw e2;
            } catch (IOException e3) {
                eVar.d();
                throw new RouteException(e3);
            }
        } else {
            throw null;
        }
    }

    public void b() {
        synchronized (this.f5432b) {
            if (!this.f5442o) {
                this.f5437j = null;
            } else {
                throw new IllegalStateException();
            }
        }
    }

    public boolean c() {
        boolean z;
        synchronized (this.f5432b) {
            z = this.f5437j != null;
        }
        return z;
    }

    public boolean d() {
        boolean z;
        synchronized (this.f5432b) {
            z = this.f5440m;
        }
        return z;
    }

    @Nullable
    public Socket e() {
        int size = this.f5436i.f5422p.size();
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (this.f5436i.f5422p.get(i2).get() == this) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 != -1) {
            f fVar = this.f5436i;
            fVar.f5422p.remove(i2);
            this.f5436i = null;
            if (fVar.f5422p.isEmpty()) {
                fVar.f5423q = System.nanoTime();
                g gVar = this.f5432b;
                if (gVar != null) {
                    if (fVar.f5417k || gVar.a == 0) {
                        gVar.d.remove(fVar);
                        z = true;
                    } else {
                        gVar.notifyAll();
                    }
                    if (z) {
                        return fVar.e;
                    }
                } else {
                    throw null;
                }
            }
            return null;
        }
        throw new IllegalStateException();
    }

    public void a(f fVar) {
        if (this.f5436i == null) {
            this.f5436i = fVar;
            fVar.f5422p.add(new b(this, this.f5433f));
            return;
        }
        throw new IllegalStateException();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0038, code lost:
        if (r1 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return a(r6, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        return r6;
     */
    @javax.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.io.IOException a(o.o0.g.d r3, boolean r4, boolean r5, @javax.annotation.Nullable java.io.IOException r6) {
        /*
            r2 = this;
            o.o0.g.g r0 = r2.f5432b
            monitor-enter(r0)
            o.o0.g.d r1 = r2.f5437j     // Catch:{ all -> 0x003f }
            if (r3 == r1) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            return r6
        L_0x0009:
            r3 = 0
            r1 = 1
            if (r4 == 0) goto L_0x0013
            boolean r4 = r2.f5438k     // Catch:{ all -> 0x003f }
            r4 = r4 ^ r1
            r2.f5438k = r1     // Catch:{ all -> 0x003f }
            goto L_0x0014
        L_0x0013:
            r4 = 0
        L_0x0014:
            if (r5 == 0) goto L_0x001d
            boolean r5 = r2.f5439l     // Catch:{ all -> 0x003f }
            if (r5 != 0) goto L_0x001b
            r4 = 1
        L_0x001b:
            r2.f5439l = r1     // Catch:{ all -> 0x003f }
        L_0x001d:
            boolean r5 = r2.f5438k     // Catch:{ all -> 0x003f }
            if (r5 == 0) goto L_0x0036
            boolean r5 = r2.f5439l     // Catch:{ all -> 0x003f }
            if (r5 == 0) goto L_0x0036
            if (r4 == 0) goto L_0x0036
            o.o0.g.d r4 = r2.f5437j     // Catch:{ all -> 0x003f }
            o.o0.g.f r4 = r4.a()     // Catch:{ all -> 0x003f }
            int r5 = r4.f5419m     // Catch:{ all -> 0x003f }
            int r5 = r5 + r1
            r4.f5419m = r5     // Catch:{ all -> 0x003f }
            r4 = 0
            r2.f5437j = r4     // Catch:{ all -> 0x003f }
            goto L_0x0037
        L_0x0036:
            r1 = 0
        L_0x0037:
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            if (r1 == 0) goto L_0x003e
            java.io.IOException r6 = r2.a((java.io.IOException) r6, (boolean) r3)
        L_0x003e:
            return r6
        L_0x003f:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.o0.g.j.a(o.o0.g.d, boolean, boolean, java.io.IOException):java.io.IOException");
    }

    @Nullable
    public IOException a(@Nullable IOException iOException) {
        synchronized (this.f5432b) {
            this.f5442o = true;
        }
        return a(iOException, false);
    }

    @Nullable
    public final IOException a(@Nullable IOException iOException, boolean z) {
        f fVar;
        Socket e2;
        boolean z2;
        boolean z3;
        synchronized (this.f5432b) {
            if (z) {
                if (this.f5437j != null) {
                    throw new IllegalStateException("cannot release connection while it is in use");
                }
            }
            fVar = this.f5436i;
            e2 = (this.f5436i == null || this.f5437j != null || (!z && !this.f5442o)) ? null : e();
            if (this.f5436i != null) {
                fVar = null;
            }
            z2 = false;
            z3 = this.f5442o && this.f5437j == null;
        }
        e.a(e2);
        if (fVar == null || this.d != null) {
            if (z3) {
                if (iOException != null) {
                    z2 = true;
                }
                if (!this.f5441n && this.e.g()) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
                    if (iOException != null) {
                        interruptedIOException.initCause(iOException);
                    }
                    iOException = interruptedIOException;
                }
                if (z2) {
                    if (this.d == null) {
                        throw null;
                    }
                } else if (this.d == null) {
                    throw null;
                }
            }
            return iOException;
        }
        throw null;
    }

    public void a() {
        d dVar;
        f fVar;
        synchronized (this.f5432b) {
            this.f5440m = true;
            dVar = this.f5437j;
            if (this.f5435h == null || this.f5435h.f5408h == null) {
                fVar = this.f5436i;
            } else {
                fVar = this.f5435h.f5408h;
            }
        }
        if (dVar != null) {
            dVar.e.cancel();
        } else if (fVar != null) {
            e.a(fVar.d);
        }
    }
}
