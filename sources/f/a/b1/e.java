package f.a.b1;

import f.a.j0;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import n.m.c.f;

/* compiled from: Dispatcher.kt */
public final class e extends j0 implements i, Executor {

    /* renamed from: i  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f831i = AtomicIntegerFieldUpdater.newUpdater(e.class, "inFlightTasks");
    public final ConcurrentLinkedQueue<Runnable> e;

    /* renamed from: f  reason: collision with root package name */
    public final c f832f;

    /* renamed from: g  reason: collision with root package name */
    public final int f833g;

    /* renamed from: h  reason: collision with root package name */
    public final k f834h;
    public volatile int inFlightTasks;

    public e(c cVar, int i2, k kVar) {
        if (cVar == null) {
            f.a("dispatcher");
            throw null;
        } else if (kVar != null) {
            this.f832f = cVar;
            this.f833g = i2;
            this.f834h = kVar;
            this.e = new ConcurrentLinkedQueue<>();
            this.inFlightTasks = 0;
        } else {
            f.a("taskMode");
            throw null;
        }
    }

    public void a(n.k.e eVar, Runnable runnable) {
        if (eVar == null) {
            f.a("context");
            throw null;
        } else if (runnable != null) {
            a(runnable, false);
        } else {
            f.a("block");
            throw null;
        }
    }

    public void close() {
        throw new IllegalStateException("Close cannot be invoked on LimitingBlockingDispatcher".toString());
    }

    public void execute(Runnable runnable) {
        if (runnable != null) {
            a(runnable, false);
        } else {
            f.a("command");
            throw null;
        }
    }

    public k h() {
        return this.f834h;
    }

    public void j() {
        Runnable poll = this.e.poll();
        if (poll != null) {
            this.f832f.a(poll, this, true);
            return;
        }
        f831i.decrementAndGet(this);
        Runnable poll2 = this.e.poll();
        if (poll2 != null) {
            a(poll2, true);
        }
    }

    public String toString() {
        return super.toString() + "[dispatcher = " + this.f832f + ']';
    }

    /* JADX WARNING: Removed duplicated region for block: B:4:0x0010  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.Runnable r3, boolean r4) {
        /*
            r2 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = f831i
            int r0 = r0.incrementAndGet(r2)
            int r1 = r2.f833g
            if (r0 > r1) goto L_0x0010
            f.a.b1.c r0 = r2.f832f
            r0.a(r3, r2, r4)
            return
        L_0x0010:
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.Runnable> r0 = r2.e
            r0.add(r3)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = f831i
            int r3 = r3.decrementAndGet(r2)
            int r0 = r2.f833g
            if (r3 < r0) goto L_0x0020
            return
        L_0x0020:
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.Runnable> r3 = r2.e
            java.lang.Object r3 = r3.poll()
            java.lang.Runnable r3 = (java.lang.Runnable) r3
            if (r3 == 0) goto L_0x002b
            goto L_0x0000
        L_0x002b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f.a.b1.e.a(java.lang.Runnable, boolean):void");
    }
}
