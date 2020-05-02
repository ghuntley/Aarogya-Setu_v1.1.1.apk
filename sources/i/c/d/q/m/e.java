package i.c.d.q.m;

import i.c.a.b.d.l.q;
import i.c.a.b.l.d;
import i.c.a.b.l.g;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.firebase:firebase-config@@19.1.3 */
public class e {
    public static final Map<String, e> d = new HashMap();
    public static final Executor e = d.e;
    public final ExecutorService a;

    /* renamed from: b  reason: collision with root package name */
    public final n f4790b;
    public g<f> c = null;

    /* compiled from: com.google.firebase:firebase-config@@19.1.3 */
    public static class b<TResult> implements i.c.a.b.l.e<TResult>, d, i.c.a.b.l.b {
        public final CountDownLatch a = new CountDownLatch(1);

        public /* synthetic */ b(a aVar) {
        }

        public void a(TResult tresult) {
            this.a.countDown();
        }

        public void a(Exception exc) {
            this.a.countDown();
        }

        public void a() {
            this.a.countDown();
        }
    }

    public e(ExecutorService executorService, n nVar) {
        this.a = executorService;
        this.f4790b = nVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        return (i.c.d.q.m.f) a(b(), r3, java.util.concurrent.TimeUnit.SECONDS);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        android.util.Log.d("FirebaseRemoteConfig", "Reading from storage file failed.", r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0032, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i.c.d.q.m.f a(long r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            i.c.a.b.l.g<i.c.d.q.m.f> r0 = r2.c     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x0017
            i.c.a.b.l.g<i.c.d.q.m.f> r0 = r2.c     // Catch:{ all -> 0x0033 }
            boolean r0 = r0.d()     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x0017
            i.c.a.b.l.g<i.c.d.q.m.f> r3 = r2.c     // Catch:{ all -> 0x0033 }
            java.lang.Object r3 = r3.b()     // Catch:{ all -> 0x0033 }
            i.c.d.q.m.f r3 = (i.c.d.q.m.f) r3     // Catch:{ all -> 0x0033 }
            monitor-exit(r2)     // Catch:{ all -> 0x0033 }
            return r3
        L_0x0017:
            monitor-exit(r2)     // Catch:{ all -> 0x0033 }
            i.c.a.b.l.g r0 = r2.b()     // Catch:{ InterruptedException -> 0x0029, ExecutionException -> 0x0027, TimeoutException -> 0x0025 }
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x0029, ExecutionException -> 0x0027, TimeoutException -> 0x0025 }
            java.lang.Object r3 = a(r0, (long) r3, (java.util.concurrent.TimeUnit) r1)     // Catch:{ InterruptedException -> 0x0029, ExecutionException -> 0x0027, TimeoutException -> 0x0025 }
            i.c.d.q.m.f r3 = (i.c.d.q.m.f) r3     // Catch:{ InterruptedException -> 0x0029, ExecutionException -> 0x0027, TimeoutException -> 0x0025 }
            return r3
        L_0x0025:
            r3 = move-exception
            goto L_0x002a
        L_0x0027:
            r3 = move-exception
            goto L_0x002a
        L_0x0029:
            r3 = move-exception
        L_0x002a:
            java.lang.String r4 = "FirebaseRemoteConfig"
            java.lang.String r0 = "Reading from storage file failed."
            android.util.Log.d(r4, r0, r3)
            r3 = 0
            return r3
        L_0x0033:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0033 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.d.q.m.e.a(long):i.c.d.q.m.f");
    }

    public synchronized g<f> b() {
        if (this.c == null || (this.c.c() && !this.c.d())) {
            ExecutorService executorService = this.a;
            n nVar = this.f4790b;
            nVar.getClass();
            this.c = q.a((Executor) executorService, new c(nVar));
        }
        return this.c;
    }

    public final synchronized void b(f fVar) {
        this.c = q.b(fVar);
    }

    public g<f> a(f fVar) {
        return q.a((Executor) this.a, new a(this, fVar)).a((Executor) this.a, new b(this, true, fVar));
    }

    public static synchronized e a(ExecutorService executorService, n nVar) {
        e eVar;
        synchronized (e.class) {
            String str = nVar.f4807b;
            if (!d.containsKey(str)) {
                d.put(str, new e(executorService, nVar));
            }
            eVar = d.get(str);
        }
        return eVar;
    }

    public static /* synthetic */ g a(e eVar, boolean z, f fVar) {
        if (z) {
            eVar.b(fVar);
        }
        return q.b(fVar);
    }

    public void a() {
        synchronized (this) {
            this.c = q.b(null);
        }
        this.f4790b.a();
    }

    public static <TResult> TResult a(g<TResult> gVar, long j2, TimeUnit timeUnit) {
        b bVar = new b((a) null);
        gVar.a(e, (i.c.a.b.l.e<? super TResult>) bVar);
        gVar.a(e, (d) bVar);
        gVar.a(e, (i.c.a.b.l.b) bVar);
        if (!bVar.a.await(j2, timeUnit)) {
            throw new TimeoutException("Task await timed out.");
        } else if (gVar.d()) {
            return gVar.b();
        } else {
            throw new ExecutionException(gVar.a());
        }
    }
}
