package l.a.a.a.o.c;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import io.fabric.sdk.android.InitializationException;
import java.util.LinkedList;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import l.a.a.a.j;
import l.a.a.a.o.b.w;

/* compiled from: AsyncTask */
public abstract class a<Params, Progress, Result> {

    /* renamed from: j  reason: collision with root package name */
    public static final int f5118j;

    /* renamed from: k  reason: collision with root package name */
    public static final int f5119k;

    /* renamed from: l  reason: collision with root package name */
    public static final int f5120l;

    /* renamed from: m  reason: collision with root package name */
    public static final ThreadFactory f5121m = new C0145a();

    /* renamed from: n  reason: collision with root package name */
    public static final BlockingQueue<Runnable> f5122n = new LinkedBlockingQueue(128);

    /* renamed from: o  reason: collision with root package name */
    public static final Executor f5123o = new ThreadPoolExecutor(f5119k, f5120l, 1, TimeUnit.SECONDS, f5122n, f5121m);

    /* renamed from: p  reason: collision with root package name */
    public static final Executor f5124p = new f((C0145a) null);

    /* renamed from: q  reason: collision with root package name */
    public static final e f5125q = new e();
    public final h<Params, Result> e = new b();

    /* renamed from: f  reason: collision with root package name */
    public final FutureTask<Result> f5126f = new c(this.e);

    /* renamed from: g  reason: collision with root package name */
    public volatile g f5127g = g.PENDING;

    /* renamed from: h  reason: collision with root package name */
    public final AtomicBoolean f5128h = new AtomicBoolean();

    /* renamed from: i  reason: collision with root package name */
    public final AtomicBoolean f5129i = new AtomicBoolean();

    /* renamed from: l.a.a.a.o.c.a$a  reason: collision with other inner class name */
    /* compiled from: AsyncTask */
    public static class C0145a implements ThreadFactory {
        public final AtomicInteger a = new AtomicInteger(1);

        public Thread newThread(Runnable runnable) {
            StringBuilder a2 = i.a.a.a.a.a("AsyncTask #");
            a2.append(this.a.getAndIncrement());
            return new Thread(runnable, a2.toString());
        }
    }

    /* compiled from: AsyncTask */
    public class b extends h<Params, Result> {
        public b() {
            super((C0145a) null);
        }

        public Result call() {
            a.this.f5129i.set(true);
            Process.setThreadPriority(10);
            a aVar = a.this;
            Params[] paramsArr = this.e;
            j jVar = (j) aVar;
            Result result = null;
            if (jVar != null) {
                Void[] voidArr = (Void[]) paramsArr;
                w a = jVar.a("doInBackground");
                if (!jVar.f5128h.get()) {
                    result = jVar.s.doInBackground();
                }
                a.b();
                aVar.a(result);
                return result;
            }
            throw null;
        }
    }

    /* compiled from: AsyncTask */
    public class c extends FutureTask<Result> {
        public c(Callable callable) {
            super(callable);
        }

        public void done() {
            try {
                a aVar = a.this;
                Object obj = get();
                if (!aVar.f5129i.get()) {
                    aVar.a(obj);
                }
            } catch (InterruptedException e2) {
                Log.w("AsyncTask", e2);
            } catch (ExecutionException e3) {
                throw new RuntimeException("An error occured while executing doInBackground()", e3.getCause());
            } catch (CancellationException unused) {
                a aVar2 = a.this;
                if (!aVar2.f5129i.get()) {
                    aVar2.a(null);
                }
            }
        }
    }

    /* compiled from: AsyncTask */
    public static class d<Data> {
        public final a a;

        /* renamed from: b  reason: collision with root package name */
        public final Data[] f5131b;

        public d(a aVar, Data... dataArr) {
            this.a = aVar;
            this.f5131b = dataArr;
        }
    }

    /* compiled from: AsyncTask */
    public static class e extends Handler {
        public e() {
            super(Looper.getMainLooper());
        }

        public void handleMessage(Message message) {
            d dVar = (d) message.obj;
            int i2 = message.what;
            if (i2 == 1) {
                a aVar = dVar.a;
                Data data = dVar.f5131b[0];
                if (aVar.f5128h.get()) {
                    j jVar = (j) aVar;
                    jVar.s.onCancelled(data);
                    jVar.s.initializationCallback.a((Exception) new InitializationException(jVar.s.getIdentifier() + " Initialization was cancelled"));
                } else {
                    j jVar2 = (j) aVar;
                    jVar2.s.onPostExecute(data);
                    jVar2.s.initializationCallback.a(data);
                }
                aVar.f5127g = g.FINISHED;
            } else if (i2 == 2 && dVar.a == null) {
                throw null;
            }
        }
    }

    /* compiled from: AsyncTask */
    public static class f implements Executor {
        public final LinkedList<Runnable> e = new LinkedList<>();

        /* renamed from: f  reason: collision with root package name */
        public Runnable f5132f;

        /* renamed from: l.a.a.a.o.c.a$f$a  reason: collision with other inner class name */
        /* compiled from: AsyncTask */
        public class C0146a implements Runnable {
            public final /* synthetic */ Runnable e;

            public C0146a(Runnable runnable) {
                this.e = runnable;
            }

            public void run() {
                try {
                    this.e.run();
                } finally {
                    f.this.a();
                }
            }
        }

        public /* synthetic */ f(C0145a aVar) {
        }

        public synchronized void a() {
            Runnable poll = this.e.poll();
            this.f5132f = poll;
            if (poll != null) {
                a.f5123o.execute(poll);
            }
        }

        public synchronized void execute(Runnable runnable) {
            this.e.offer(new C0146a(runnable));
            if (this.f5132f == null) {
                a();
            }
        }
    }

    /* compiled from: AsyncTask */
    public enum g {
        PENDING,
        RUNNING,
        FINISHED
    }

    /* compiled from: AsyncTask */
    public static abstract class h<Params, Result> implements Callable<Result> {
        public Params[] e;

        public /* synthetic */ h(C0145a aVar) {
        }
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        f5118j = availableProcessors;
        f5119k = availableProcessors + 1;
        f5120l = (availableProcessors * 2) + 1;
    }

    public final Result a(Result result) {
        f5125q.obtainMessage(1, new d(this, result)).sendToTarget();
        return result;
    }

    public final boolean a(boolean z) {
        this.f5128h.set(true);
        return this.f5126f.cancel(z);
    }
}
