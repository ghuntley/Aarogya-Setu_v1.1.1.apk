package o.o0.g;

import i.a.a.a.a;
import java.lang.ref.Reference;
import java.net.Proxy;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import javax.net.ssl.SSLPeerUnverifiedException;
import o.c0;
import o.m0;
import o.o0.c;
import o.o0.e;
import o.o0.g.j;
import o.o0.k.f;
import o.o0.m.d;

/* compiled from: RealConnectionPool */
public final class g {

    /* renamed from: g  reason: collision with root package name */
    public static final Executor f5424g = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), e.a("OkHttp ConnectionPool", true));
    public final int a;

    /* renamed from: b  reason: collision with root package name */
    public final long f5425b;
    public final Runnable c = new a(this);
    public final Deque<f> d = new ArrayDeque();
    public final h e = new h();

    /* renamed from: f  reason: collision with root package name */
    public boolean f5426f;

    public g(int i2, long j2, TimeUnit timeUnit) {
        this.a = i2;
        this.f5425b = timeUnit.toNanos(j2);
        if (j2 <= 0) {
            throw new IllegalArgumentException("keepAliveDuration <= 0: " + j2);
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0025 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void a() {
        /*
            r6 = this;
        L_0x0000:
            long r0 = java.lang.System.nanoTime()
            long r0 = r6.a(r0)
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x000f
            return
        L_0x000f:
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x0000
            r2 = 1000000(0xf4240, double:4.940656E-318)
            long r4 = r0 / r2
            long r2 = r2 * r4
            long r0 = r0 - r2
            monitor-enter(r6)
            int r1 = (int) r0
            r6.wait(r4, r1)     // Catch:{ InterruptedException -> 0x0025 }
            goto L_0x0025
        L_0x0023:
            r0 = move-exception
            goto L_0x0027
        L_0x0025:
            monitor-exit(r6)     // Catch:{ all -> 0x0023 }
            goto L_0x0000
        L_0x0027:
            monitor-exit(r6)     // Catch:{ all -> 0x0023 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.o0.g.g.a():void");
    }

    public boolean a(o.e eVar, j jVar, @Nullable List<m0> list, boolean z) {
        boolean z2;
        Iterator<f> it = this.d.iterator();
        while (true) {
            boolean z3 = false;
            if (!it.hasNext()) {
                return false;
            }
            f next = it.next();
            if (!z || next.a()) {
                if (next.f5422p.size() < next.f5421o && !next.f5417k) {
                    c cVar = c.a;
                    o.e eVar2 = next.c.a;
                    if (((c0.a) cVar) == null) {
                        throw null;
                    } else if (eVar2.a(eVar)) {
                        if (!eVar.a.d.equals(next.c.a.a.d)) {
                            if (!(next.f5414h == null || list == null)) {
                                int size = list.size();
                                int i2 = 0;
                                while (true) {
                                    if (i2 >= size) {
                                        z2 = false;
                                        break;
                                    }
                                    m0 m0Var = list.get(i2);
                                    if (m0Var.f5367b.type() == Proxy.Type.DIRECT && next.c.f5367b.type() == Proxy.Type.DIRECT && next.c.c.equals(m0Var.c)) {
                                        z2 = true;
                                        break;
                                    }
                                    i2++;
                                }
                                if (z2 && eVar.f5298j == d.a && next.a(eVar.a)) {
                                    try {
                                        eVar.f5299k.a(eVar.a.d, next.f5412f.c);
                                    } catch (SSLPeerUnverifiedException unused) {
                                    }
                                }
                            }
                        }
                        z3 = true;
                    }
                }
                if (z3) {
                    jVar.a(next);
                    return true;
                }
            }
        }
    }

    public long a(long j2) {
        synchronized (this) {
            f fVar = null;
            long j3 = Long.MIN_VALUE;
            int i2 = 0;
            int i3 = 0;
            for (f next : this.d) {
                if (a(next, j2) > 0) {
                    i3++;
                } else {
                    i2++;
                    long j4 = j2 - next.f5423q;
                    if (j4 > j3) {
                        fVar = next;
                        j3 = j4;
                    }
                }
            }
            if (j3 < this.f5425b) {
                if (i2 <= this.a) {
                    if (i2 > 0) {
                        long j5 = this.f5425b - j3;
                        return j5;
                    } else if (i3 > 0) {
                        long j6 = this.f5425b;
                        return j6;
                    } else {
                        this.f5426f = false;
                        return -1;
                    }
                }
            }
            this.d.remove(fVar);
            e.a(fVar.e);
            return 0;
        }
    }

    public final int a(f fVar, long j2) {
        List<Reference<j>> list = fVar.f5422p;
        int i2 = 0;
        while (i2 < list.size()) {
            Reference reference = list.get(i2);
            if (reference.get() != null) {
                i2++;
            } else {
                StringBuilder a2 = a.a("A connection to ");
                a2.append(fVar.c.a.a);
                a2.append(" was leaked. Did you forget to close a response body?");
                f.a.a(a2.toString(), ((j.b) reference).a);
                list.remove(i2);
                fVar.f5417k = true;
                if (list.isEmpty()) {
                    fVar.f5423q = j2 - this.f5425b;
                    return 0;
                }
            }
        }
        return list.size();
    }
}
