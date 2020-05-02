package f.a;

import androidx.recyclerview.widget.RecyclerView;
import i.c.d.p.e;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import n.m.c.f;

/* compiled from: DefaultExecutor.kt */
public final class y extends g0 implements Runnable {
    public static volatile Thread _thread;
    public static volatile int debugStatus;

    /* renamed from: j  reason: collision with root package name */
    public static final long f866j;

    /* renamed from: k  reason: collision with root package name */
    public static final y f867k;

    static {
        Long l2;
        y yVar = new y();
        f867k = yVar;
        yVar.c(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l2 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000);
        } catch (SecurityException unused) {
            l2 = 1000L;
        }
        f.a((Object) l2, "try {\n            java.l…AULT_KEEP_ALIVE\n        }");
        f866j = timeUnit.toNanos(l2.longValue());
    }

    public Thread q() {
        Thread thread = _thread;
        return thread != null ? thread : w();
    }

    public void run() {
        z0 z0Var = z0.f873b;
        z0.a.set(this);
        try {
            if (y()) {
                long j2 = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long u = u();
                    if (u == RecyclerView.FOREVER_NS) {
                        int i2 = (j2 > RecyclerView.FOREVER_NS ? 1 : (j2 == RecyclerView.FOREVER_NS ? 0 : -1));
                        if (i2 == 0) {
                            long nanoTime = System.nanoTime();
                            if (i2 == 0) {
                                j2 = f866j + nanoTime;
                            }
                            long j3 = j2 - nanoTime;
                            if (j3 <= 0) {
                                _thread = null;
                                v();
                                if (!t()) {
                                    q();
                                    return;
                                }
                                return;
                            }
                            u = e.a(u, j3);
                        } else {
                            u = e.a(u, f866j);
                        }
                    }
                    if (u > 0) {
                        if (x()) {
                            _thread = null;
                            v();
                            if (!t()) {
                                q();
                                return;
                            }
                            return;
                        }
                        LockSupport.parkNanos(this, u);
                    }
                }
            }
        } finally {
            _thread = null;
            v();
            if (!t()) {
                q();
            }
        }
    }

    public final synchronized void v() {
        if (x()) {
            debugStatus = 3;
            this._queue = null;
            this._delayed = null;
            notifyAll();
        }
    }

    public final synchronized Thread w() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    public final boolean x() {
        int i2 = debugStatus;
        return i2 == 2 || i2 == 3;
    }

    public final synchronized boolean y() {
        if (x()) {
            return false;
        }
        debugStatus = 1;
        notifyAll();
        return true;
    }
}
