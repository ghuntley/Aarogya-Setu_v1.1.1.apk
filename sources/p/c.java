package p;

import com.crashlytics.android.answers.RetryManager;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

/* compiled from: AsyncTimeout */
public class c extends b0 {

    /* renamed from: h  reason: collision with root package name */
    public static final long f5640h = TimeUnit.SECONDS.toMillis(60);

    /* renamed from: i  reason: collision with root package name */
    public static final long f5641i = TimeUnit.MILLISECONDS.toNanos(f5640h);
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    public static c f5642j;
    public boolean e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    public c f5643f;

    /* renamed from: g  reason: collision with root package name */
    public long f5644g;

    /* compiled from: AsyncTimeout */
    public static final class a extends Thread {
        public a() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
            r1.h();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r3 = this;
            L_0x0000:
                java.lang.Class<p.c> r0 = p.c.class
                monitor-enter(r0)     // Catch:{ InterruptedException -> 0x0000 }
                p.c r1 = p.c.i()     // Catch:{ all -> 0x0019 }
                if (r1 != 0) goto L_0x000b
                monitor-exit(r0)     // Catch:{ all -> 0x0019 }
                goto L_0x0000
            L_0x000b:
                p.c r2 = p.c.f5642j     // Catch:{ all -> 0x0019 }
                if (r1 != r2) goto L_0x0014
                r1 = 0
                p.c.f5642j = r1     // Catch:{ all -> 0x0019 }
                monitor-exit(r0)     // Catch:{ all -> 0x0019 }
                return
            L_0x0014:
                monitor-exit(r0)     // Catch:{ all -> 0x0019 }
                r1.h()     // Catch:{ InterruptedException -> 0x0000 }
                goto L_0x0000
            L_0x0019:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0019 }
                throw r1     // Catch:{ InterruptedException -> 0x0000 }
            */
            throw new UnsupportedOperationException("Method not decompiled: p.c.a.run():void");
        }
    }

    public static synchronized void a(c cVar, long j2, boolean z) {
        Class<c> cls = c.class;
        synchronized (cls) {
            if (f5642j == null) {
                f5642j = new c();
                new a().start();
            }
            long nanoTime = System.nanoTime();
            int i2 = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
            if (i2 != 0 && z) {
                cVar.f5644g = Math.min(j2, cVar.c() - nanoTime) + nanoTime;
            } else if (i2 != 0) {
                cVar.f5644g = j2 + nanoTime;
            } else if (z) {
                cVar.f5644g = cVar.c();
            } else {
                throw new AssertionError();
            }
            long j3 = cVar.f5644g - nanoTime;
            c cVar2 = f5642j;
            while (true) {
                if (cVar2.f5643f == null) {
                    break;
                } else if (j3 < cVar2.f5643f.f5644g - nanoTime) {
                    break;
                } else {
                    cVar2 = cVar2.f5643f;
                }
            }
            cVar.f5643f = cVar2.f5643f;
            cVar2.f5643f = cVar;
            if (cVar2 == f5642j) {
                cls.notify();
            }
        }
    }

    @Nullable
    public static c i() {
        Class<c> cls = c.class;
        c cVar = f5642j.f5643f;
        if (cVar == null) {
            long nanoTime = System.nanoTime();
            cls.wait(f5640h);
            if (f5642j.f5643f != null || System.nanoTime() - nanoTime < f5641i) {
                return null;
            }
            return f5642j;
        }
        long nanoTime2 = cVar.f5644g - System.nanoTime();
        if (nanoTime2 > 0) {
            long j2 = nanoTime2 / RetryManager.NANOSECONDS_IN_MS;
            cls.wait(j2, (int) (nanoTime2 - (RetryManager.NANOSECONDS_IN_MS * j2)));
            return null;
        }
        f5642j.f5643f = cVar.f5643f;
        cVar.f5643f = null;
        return cVar;
    }

    public final void f() {
        if (!this.e) {
            long j2 = this.c;
            boolean z = this.a;
            if (j2 != 0 || z) {
                this.e = true;
                a(this, j2, z);
                return;
            }
            return;
        }
        throw new IllegalStateException("Unbalanced enter/exit");
    }

    public final boolean g() {
        if (!this.e) {
            return false;
        }
        this.e = false;
        return a(this);
    }

    public void h() {
    }

    public static synchronized boolean a(c cVar) {
        synchronized (c.class) {
            for (c cVar2 = f5642j; cVar2 != null; cVar2 = cVar2.f5643f) {
                if (cVar2.f5643f == cVar) {
                    cVar2.f5643f = cVar.f5643f;
                    cVar.f5643f = null;
                    return false;
                }
            }
            return true;
        }
    }

    public final void a(boolean z) {
        if (g() && z) {
            throw a((IOException) null);
        }
    }

    public IOException a(@Nullable IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }
}
