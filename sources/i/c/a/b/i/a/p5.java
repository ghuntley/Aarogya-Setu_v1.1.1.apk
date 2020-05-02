package i.c.a.b.i.a;

import i.c.a.b.d.l.q;
import java.util.concurrent.BlockingQueue;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class p5 extends Thread {
    public final Object e;

    /* renamed from: f  reason: collision with root package name */
    public final BlockingQueue<q5<?>> f3828f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f3829g = false;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ m5 f3830h;

    public p5(m5 m5Var, String str, BlockingQueue<q5<?>> blockingQueue) {
        this.f3830h = m5Var;
        q.a(str);
        q.a(blockingQueue);
        this.e = new Object();
        this.f3828f = blockingQueue;
        setName(str);
    }

    public final void a() {
        synchronized (this.e) {
            this.e.notifyAll();
        }
    }

    public final void b() {
        synchronized (this.f3830h.f3771i) {
            if (!this.f3829g) {
                this.f3830h.f3772j.release();
                this.f3830h.f3771i.notifyAll();
                if (this == this.f3830h.c) {
                    this.f3830h.c = null;
                } else if (this == this.f3830h.d) {
                    this.f3830h.d = null;
                } else {
                    this.f3830h.n().f3758f.a("Current scheduler thread is neither worker nor network");
                }
                this.f3829g = true;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x006f, code lost:
        b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0072, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r5 = this;
            r0 = 0
        L_0x0001:
            if (r0 != 0) goto L_0x0011
            i.c.a.b.i.a.m5 r1 = r5.f3830h     // Catch:{ InterruptedException -> 0x000c }
            java.util.concurrent.Semaphore r1 = r1.f3772j     // Catch:{ InterruptedException -> 0x000c }
            r1.acquire()     // Catch:{ InterruptedException -> 0x000c }
            r0 = 1
            goto L_0x0001
        L_0x000c:
            r1 = move-exception
            r5.a(r1)
            goto L_0x0001
        L_0x0011:
            int r0 = android.os.Process.myTid()     // Catch:{ all -> 0x007b }
            int r0 = android.os.Process.getThreadPriority(r0)     // Catch:{ all -> 0x007b }
        L_0x0019:
            java.util.concurrent.BlockingQueue<i.c.a.b.i.a.q5<?>> r1 = r5.f3828f     // Catch:{ all -> 0x007b }
            java.lang.Object r1 = r1.poll()     // Catch:{ all -> 0x007b }
            i.c.a.b.i.a.q5 r1 = (i.c.a.b.i.a.q5) r1     // Catch:{ all -> 0x007b }
            if (r1 == 0) goto L_0x0032
            boolean r2 = r1.f3843f     // Catch:{ all -> 0x007b }
            if (r2 == 0) goto L_0x0029
            r2 = r0
            goto L_0x002b
        L_0x0029:
            r2 = 10
        L_0x002b:
            android.os.Process.setThreadPriority(r2)     // Catch:{ all -> 0x007b }
            r1.run()     // Catch:{ all -> 0x007b }
            goto L_0x0019
        L_0x0032:
            java.lang.Object r1 = r5.e     // Catch:{ all -> 0x007b }
            monitor-enter(r1)     // Catch:{ all -> 0x007b }
            java.util.concurrent.BlockingQueue<i.c.a.b.i.a.q5<?>> r2 = r5.f3828f     // Catch:{ all -> 0x0078 }
            java.lang.Object r2 = r2.peek()     // Catch:{ all -> 0x0078 }
            if (r2 != 0) goto L_0x004f
            i.c.a.b.i.a.m5 r2 = r5.f3830h     // Catch:{ all -> 0x0078 }
            boolean r2 = r2.f3773k     // Catch:{ all -> 0x0078 }
            if (r2 != 0) goto L_0x004f
            java.lang.Object r2 = r5.e     // Catch:{ InterruptedException -> 0x004b }
            r3 = 30000(0x7530, double:1.4822E-319)
            r2.wait(r3)     // Catch:{ InterruptedException -> 0x004b }
            goto L_0x004f
        L_0x004b:
            r2 = move-exception
            r5.a(r2)     // Catch:{ all -> 0x0078 }
        L_0x004f:
            monitor-exit(r1)     // Catch:{ all -> 0x0078 }
            i.c.a.b.i.a.m5 r1 = r5.f3830h     // Catch:{ all -> 0x007b }
            java.lang.Object r1 = r1.f3771i     // Catch:{ all -> 0x007b }
            monitor-enter(r1)     // Catch:{ all -> 0x007b }
            java.util.concurrent.BlockingQueue<i.c.a.b.i.a.q5<?>> r2 = r5.f3828f     // Catch:{ all -> 0x0075 }
            java.lang.Object r2 = r2.peek()     // Catch:{ all -> 0x0075 }
            if (r2 != 0) goto L_0x0073
            i.c.a.b.i.a.m5 r0 = r5.f3830h     // Catch:{ all -> 0x0075 }
            i.c.a.b.i.a.s5 r0 = r0.a     // Catch:{ all -> 0x0075 }
            i.c.a.b.i.a.pa r0 = r0.f3861g     // Catch:{ all -> 0x0075 }
            i.c.a.b.i.a.f4<java.lang.Boolean> r2 = i.c.a.b.i.a.o.U0     // Catch:{ all -> 0x0075 }
            boolean r0 = r0.a((i.c.a.b.i.a.f4<java.lang.Boolean>) r2)     // Catch:{ all -> 0x0075 }
            if (r0 == 0) goto L_0x006e
            r5.b()     // Catch:{ all -> 0x0075 }
        L_0x006e:
            monitor-exit(r1)     // Catch:{ all -> 0x0075 }
            r5.b()
            return
        L_0x0073:
            monitor-exit(r1)     // Catch:{ all -> 0x0075 }
            goto L_0x0019
        L_0x0075:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0075 }
            throw r0     // Catch:{ all -> 0x007b }
        L_0x0078:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0078 }
            throw r0     // Catch:{ all -> 0x007b }
        L_0x007b:
            r0 = move-exception
            r5.b()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.a.b.i.a.p5.run():void");
    }

    public final void a(InterruptedException interruptedException) {
        this.f3830h.n().f3761i.a(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }
}
