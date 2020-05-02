package i.c.a.b.i.a;

import i.c.a.b.d.l.q;
import java.lang.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class m5 extends n6 {

    /* renamed from: l  reason: collision with root package name */
    public static final AtomicLong f3767l = new AtomicLong(Long.MIN_VALUE);
    public p5 c;
    public p5 d;
    public final PriorityBlockingQueue<q5<?>> e = new PriorityBlockingQueue<>();

    /* renamed from: f  reason: collision with root package name */
    public final BlockingQueue<q5<?>> f3768f = new LinkedBlockingQueue();

    /* renamed from: g  reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f3769g = new o5(this, "Thread death: Uncaught exception on worker thread");

    /* renamed from: h  reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f3770h = new o5(this, "Thread death: Uncaught exception on network thread");

    /* renamed from: i  reason: collision with root package name */
    public final Object f3771i = new Object();

    /* renamed from: j  reason: collision with root package name */
    public final Semaphore f3772j = new Semaphore(2);

    /* renamed from: k  reason: collision with root package name */
    public volatile boolean f3773k;

    public m5(s5 s5Var) {
        super(s5Var);
    }

    public final <V> Future<V> a(Callable<V> callable) {
        o();
        q.a(callable);
        q5 q5Var = new q5(this, callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.c) {
            if (!this.e.isEmpty()) {
                n().f3761i.a("Callable skipped the worker queue.");
            }
            q5Var.run();
        } else {
            a((q5<?>) q5Var);
        }
        return q5Var;
    }

    public final void b() {
        if (Thread.currentThread() != this.d) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    public final void c() {
        if (Thread.currentThread() != this.c) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    public final boolean r() {
        return false;
    }

    public final boolean t() {
        return Thread.currentThread() == this.c;
    }

    public final void b(Runnable runnable) {
        o();
        q.a(runnable);
        q5 q5Var = new q5(this, runnable, "Task exception on network thread");
        synchronized (this.f3771i) {
            this.f3768f.add(q5Var);
            if (this.d == null) {
                p5 p5Var = new p5(this, "Measurement Network", this.f3768f);
                this.d = p5Var;
                p5Var.setUncaughtExceptionHandler(this.f3770h);
                this.d.start();
            } else {
                this.d.a();
            }
        }
    }

    public final void a(Runnable runnable) {
        o();
        q.a(runnable);
        a((q5<?>) new q5(this, runnable, "Task exception on worker thread"));
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:15|16|(1:18)(1:19)|20|21|22) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002f, code lost:
        if (r7.length() == 0) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0031, code lost:
        r6 = "Timed out waiting for ".concat(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0036, code lost:
        r6 = new java.lang.String("Timed out waiting for ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003c, code lost:
        r5.a(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003f, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r5 = n().f3761i;
        r7 = java.lang.String.valueOf(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0050, code lost:
        if (r7.length() != 0) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0052, code lost:
        r6 = "Interrupted waiting for ".concat(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0057, code lost:
        r6 = new java.lang.String("Interrupted waiting for ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005d, code lost:
        r5.a(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0062, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0019, code lost:
        r4 = r4.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
        if (r4 != null) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        r5 = n().f3761i;
        r7 = java.lang.String.valueOf(r7);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0040 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> T a(java.util.concurrent.atomic.AtomicReference<T> r4, long r5, java.lang.String r7, java.lang.Runnable r8) {
        /*
            r3 = this;
            monitor-enter(r4)
            i.c.a.b.i.a.m5 r0 = r3.k()     // Catch:{ all -> 0x0063 }
            r0.o()     // Catch:{ all -> 0x0063 }
            i.c.a.b.d.l.q.a(r8)     // Catch:{ all -> 0x0063 }
            i.c.a.b.i.a.q5 r1 = new i.c.a.b.i.a.q5     // Catch:{ all -> 0x0063 }
            java.lang.String r2 = "Task exception on worker thread"
            r1.<init>(r0, r8, r2)     // Catch:{ all -> 0x0063 }
            r0.a((i.c.a.b.i.a.q5<?>) r1)     // Catch:{ all -> 0x0063 }
            r4.wait(r5)     // Catch:{ InterruptedException -> 0x0040 }
            monitor-exit(r4)     // Catch:{ all -> 0x0063 }
            java.lang.Object r4 = r4.get()
            if (r4 != 0) goto L_0x003f
            i.c.a.b.i.a.m4 r5 = r3.n()
            i.c.a.b.i.a.o4 r5 = r5.f3761i
            java.lang.String r6 = "Timed out waiting for "
            java.lang.String r7 = java.lang.String.valueOf(r7)
            int r8 = r7.length()
            if (r8 == 0) goto L_0x0036
            java.lang.String r6 = r6.concat(r7)
            goto L_0x003c
        L_0x0036:
            java.lang.String r7 = new java.lang.String
            r7.<init>(r6)
            r6 = r7
        L_0x003c:
            r5.a(r6)
        L_0x003f:
            return r4
        L_0x0040:
            i.c.a.b.i.a.m4 r5 = r3.n()     // Catch:{ all -> 0x0063 }
            i.c.a.b.i.a.o4 r5 = r5.f3761i     // Catch:{ all -> 0x0063 }
            java.lang.String r6 = "Interrupted waiting for "
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x0063 }
            int r8 = r7.length()     // Catch:{ all -> 0x0063 }
            if (r8 == 0) goto L_0x0057
            java.lang.String r6 = r6.concat(r7)     // Catch:{ all -> 0x0063 }
            goto L_0x005d
        L_0x0057:
            java.lang.String r7 = new java.lang.String     // Catch:{ all -> 0x0063 }
            r7.<init>(r6)     // Catch:{ all -> 0x0063 }
            r6 = r7
        L_0x005d:
            r5.a(r6)     // Catch:{ all -> 0x0063 }
            r5 = 0
            monitor-exit(r4)     // Catch:{ all -> 0x0063 }
            return r5
        L_0x0063:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0063 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.a.b.i.a.m5.a(java.util.concurrent.atomic.AtomicReference, long, java.lang.String, java.lang.Runnable):java.lang.Object");
    }

    public final void a(q5<?> q5Var) {
        synchronized (this.f3771i) {
            this.e.add(q5Var);
            if (this.c == null) {
                p5 p5Var = new p5(this, "Measurement Worker", this.e);
                this.c = p5Var;
                p5Var.setUncaughtExceptionHandler(this.f3769g);
                this.c.start();
            } else {
                this.c.a();
            }
        }
    }
}
