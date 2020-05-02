package i.b.a.n.m;

import android.os.Process;
import i.b.a.n.e;
import i.b.a.n.m.q;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* compiled from: ActiveResources */
public final class a {
    public final boolean a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<e, b> f2526b = new HashMap();
    public final ReferenceQueue<q<?>> c = new ReferenceQueue<>();
    public q.a d;

    /* renamed from: i.b.a.n.m.a$a  reason: collision with other inner class name */
    /* compiled from: ActiveResources */
    public class C0081a implements ThreadFactory {

        /* renamed from: i.b.a.n.m.a$a$a  reason: collision with other inner class name */
        /* compiled from: ActiveResources */
        public class C0082a implements Runnable {
            public final /* synthetic */ Runnable e;

            public C0082a(C0081a aVar, Runnable runnable) {
                this.e = runnable;
            }

            public void run() {
                Process.setThreadPriority(10);
                this.e.run();
            }
        }

        public Thread newThread(Runnable runnable) {
            return new Thread(new C0082a(this, runnable), "glide-active-resources");
        }
    }

    /* compiled from: ActiveResources */
    public static final class b extends WeakReference<q<?>> {
        public final e a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f2527b;
        public v<?> c;

        public b(e eVar, q<?> qVar, ReferenceQueue<? super q<?>> referenceQueue, boolean z) {
            super(qVar, referenceQueue);
            v<Z> vVar;
            g.a.a.b.a.a(eVar, "Argument must not be null");
            this.a = eVar;
            if (!qVar.e || !z) {
                vVar = null;
            } else {
                vVar = qVar.f2649g;
                g.a.a.b.a.a(vVar, "Argument must not be null");
            }
            this.c = vVar;
            this.f2527b = qVar.e;
        }
    }

    public a(boolean z) {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new C0081a());
        this.a = z;
        newSingleThreadExecutor.execute(new b(this));
    }

    public void a(q.a aVar) {
        synchronized (aVar) {
            synchronized (this) {
                this.d = aVar;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001a, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized i.b.a.n.m.q<?> b(i.b.a.n.e r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.util.Map<i.b.a.n.e, i.b.a.n.m.a$b> r0 = r1.f2526b     // Catch:{ all -> 0x001b }
            java.lang.Object r2 = r0.get(r2)     // Catch:{ all -> 0x001b }
            i.b.a.n.m.a$b r2 = (i.b.a.n.m.a.b) r2     // Catch:{ all -> 0x001b }
            if (r2 != 0) goto L_0x000e
            r2 = 0
            monitor-exit(r1)
            return r2
        L_0x000e:
            java.lang.Object r0 = r2.get()     // Catch:{ all -> 0x001b }
            i.b.a.n.m.q r0 = (i.b.a.n.m.q) r0     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x0019
            r1.a((i.b.a.n.m.a.b) r2)     // Catch:{ all -> 0x001b }
        L_0x0019:
            monitor-exit(r1)
            return r0
        L_0x001b:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: i.b.a.n.m.a.b(i.b.a.n.e):i.b.a.n.m.q");
    }

    public synchronized void a(e eVar, q<?> qVar) {
        b put = this.f2526b.put(eVar, new b(eVar, qVar, this.c, this.a));
        if (put != null) {
            put.c = null;
            put.clear();
        }
    }

    public synchronized void a(e eVar) {
        b remove = this.f2526b.remove(eVar);
        if (remove != null) {
            remove.c = null;
            remove.clear();
        }
    }

    public void a(b bVar) {
        synchronized (this) {
            this.f2526b.remove(bVar.a);
            if (bVar.f2527b) {
                if (bVar.c != null) {
                    this.d.a(bVar.a, new q(bVar.c, true, false, bVar.a, this.d));
                }
            }
        }
    }
}
