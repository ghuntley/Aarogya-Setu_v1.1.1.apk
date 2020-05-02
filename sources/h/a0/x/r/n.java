package h.a0.x.r;

import h.a0.l;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* compiled from: WorkTimer */
public class n {

    /* renamed from: f  reason: collision with root package name */
    public static final String f1098f = l.a("WorkTimer");
    public final ThreadFactory a = new a(this);

    /* renamed from: b  reason: collision with root package name */
    public final ScheduledExecutorService f1099b = Executors.newSingleThreadScheduledExecutor(this.a);
    public final Map<String, c> c = new HashMap();
    public final Map<String, b> d = new HashMap();
    public final Object e = new Object();

    /* compiled from: WorkTimer */
    public class a implements ThreadFactory {
        public int a = 0;

        public a(n nVar) {
        }

        public Thread newThread(Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
            StringBuilder a2 = i.a.a.a.a.a("WorkManager-WorkTimer-thread-");
            a2.append(this.a);
            newThread.setName(a2.toString());
            this.a++;
            return newThread;
        }
    }

    /* compiled from: WorkTimer */
    public interface b {
        void a(String str);
    }

    /* compiled from: WorkTimer */
    public static class c implements Runnable {
        public final n e;

        /* renamed from: f  reason: collision with root package name */
        public final String f1100f;

        public c(n nVar, String str) {
            this.e = nVar;
            this.f1100f = str;
        }

        public void run() {
            synchronized (this.e.e) {
                if (this.e.c.remove(this.f1100f) != null) {
                    b remove = this.e.d.remove(this.f1100f);
                    if (remove != null) {
                        remove.a(this.f1100f);
                    }
                } else {
                    l.a().a("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", new Object[]{this.f1100f}), new Throwable[0]);
                }
            }
        }
    }

    public void a(String str, long j2, b bVar) {
        synchronized (this.e) {
            l.a().a(f1098f, String.format("Starting timer for %s", new Object[]{str}), new Throwable[0]);
            a(str);
            c cVar = new c(this, str);
            this.c.put(str, cVar);
            this.d.put(str, bVar);
            this.f1099b.schedule(cVar, j2, TimeUnit.MILLISECONDS);
        }
    }

    public void a(String str) {
        synchronized (this.e) {
            if (this.c.remove(str) != null) {
                l.a().a(f1098f, String.format("Stopping timer for %s", new Object[]{str}), new Throwable[0]);
                this.d.remove(str);
            }
        }
    }
}
