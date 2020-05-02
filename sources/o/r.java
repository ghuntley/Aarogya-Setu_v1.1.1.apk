package o;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import o.e0;
import o.o0.e;
import q.v;

/* compiled from: Dispatcher */
public final class r {
    public int a = 64;

    /* renamed from: b  reason: collision with root package name */
    public int f5617b = 5;
    @Nullable
    public ExecutorService c;
    public final Deque<e0.a> d = new ArrayDeque();
    public final Deque<e0.a> e = new ArrayDeque();

    /* renamed from: f  reason: collision with root package name */
    public final Deque<e0> f5618f = new ArrayDeque();

    public synchronized ExecutorService a() {
        if (this.c == null) {
            this.c = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), e.a("OkHttp Dispatcher", false));
        }
        return this.c;
    }

    public void b(e0.a aVar) {
        aVar.f5305g.decrementAndGet();
        a(this.e, aVar);
    }

    public synchronized int c() {
        return this.e.size() + this.f5618f.size();
    }

    public final boolean b() {
        int i2;
        boolean z;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator<e0.a> it = this.d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                e0.a next = it.next();
                if (this.e.size() >= this.a) {
                    break;
                } else if (next.f5305g.get() < this.f5617b) {
                    it.remove();
                    next.f5305g.incrementAndGet();
                    arrayList.add(next);
                    this.e.add(next);
                }
            }
            i2 = 0;
            z = c() > 0;
        }
        int size = arrayList.size();
        while (i2 < size) {
            e0.a aVar = (e0.a) arrayList.get(i2);
            ExecutorService a2 = a();
            if (aVar != null) {
                try {
                    a2.execute(aVar);
                } catch (RejectedExecutionException e2) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e2);
                    e0.this.f5300f.a((IOException) interruptedIOException);
                    ((v.a) aVar.f5304f).a((j) e0.this, (IOException) interruptedIOException);
                    e0.this.e.e.b(aVar);
                } catch (Throwable th) {
                    e0.this.e.e.b(aVar);
                    throw th;
                }
                i2++;
            } else {
                throw null;
            }
        }
        return z;
    }

    public void a(e0.a aVar) {
        e0.a aVar2;
        synchronized (this) {
            this.d.add(aVar);
            if (!e0.this.f5302h) {
                String b2 = aVar.b();
                Iterator<e0.a> it = this.e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        Iterator<e0.a> it2 = this.d.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                aVar2 = null;
                                break;
                            }
                            aVar2 = it2.next();
                            if (aVar2.b().equals(b2)) {
                                break;
                            }
                        }
                    } else {
                        aVar2 = it.next();
                        if (aVar2.b().equals(b2)) {
                            break;
                        }
                    }
                }
                if (aVar2 != null) {
                    aVar.f5305g = aVar2.f5305g;
                }
            }
        }
        b();
    }

    public synchronized void a(e0 e0Var) {
        this.f5618f.add(e0Var);
    }

    public final <T> void a(Deque<T> deque, T t) {
        synchronized (this) {
            if (!deque.remove(t)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        boolean b2 = b();
    }
}
