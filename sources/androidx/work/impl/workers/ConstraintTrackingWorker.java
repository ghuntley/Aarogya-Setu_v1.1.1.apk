package androidx.work.impl.workers;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import h.a0.l;
import h.a0.x.j;
import h.a0.x.o.c;
import h.a0.x.o.d;
import h.a0.x.q.p;
import h.a0.x.q.r;
import java.util.Collections;
import java.util.List;

public class ConstraintTrackingWorker extends ListenableWorker implements c {

    /* renamed from: m  reason: collision with root package name */
    public static final String f401m = l.a("ConstraintTrkngWrkr");

    /* renamed from: h  reason: collision with root package name */
    public WorkerParameters f402h;

    /* renamed from: i  reason: collision with root package name */
    public final Object f403i = new Object();

    /* renamed from: j  reason: collision with root package name */
    public volatile boolean f404j = false;

    /* renamed from: k  reason: collision with root package name */
    public h.a0.x.r.o.c<ListenableWorker.a> f405k = new h.a0.x.r.o.c<>();

    /* renamed from: l  reason: collision with root package name */
    public ListenableWorker f406l;

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            ConstraintTrackingWorker.this.f();
        }
    }

    public class b implements Runnable {
        public final /* synthetic */ i.c.b.a.a.a e;

        public b(i.c.b.a.a.a aVar) {
            this.e = aVar;
        }

        public void run() {
            synchronized (ConstraintTrackingWorker.this.f403i) {
                if (ConstraintTrackingWorker.this.f404j) {
                    ConstraintTrackingWorker.this.e();
                } else {
                    ConstraintTrackingWorker.this.f405k.b(this.e);
                }
            }
        }
    }

    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f402h = workerParameters;
    }

    public void a() {
        ListenableWorker listenableWorker = this.f406l;
        if (listenableWorker != null) {
            listenableWorker.c();
        }
    }

    public void a(List<String> list) {
    }

    public void b(List<String> list) {
        l.a().a(f401m, String.format("Constraints changed for %s", new Object[]{list}), new Throwable[0]);
        synchronized (this.f403i) {
            this.f404j = true;
        }
    }

    public void d() {
        this.f405k.c(new ListenableWorker.a.C0002a());
    }

    public void e() {
        this.f405k.c(new ListenableWorker.a.b());
    }

    public void f() {
        Object obj = this.f366f.f369b.a.get("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
        String str = obj instanceof String ? (String) obj : null;
        if (TextUtils.isEmpty(str)) {
            l.a().b(f401m, "No worker to delegate to.", new Throwable[0]);
            d();
            return;
        }
        ListenableWorker a2 = this.f366f.d.a(this.e, str, this.f402h);
        this.f406l = a2;
        if (a2 == null) {
            l.a().a(f401m, "No worker to delegate to.", new Throwable[0]);
            d();
            return;
        }
        p c = ((r) j.a(this.e).c.n()).c(this.f366f.a.toString());
        if (c == null) {
            d();
            return;
        }
        Context context = this.e;
        d dVar = new d(context, j.a(context).d, this);
        dVar.a((Iterable<p>) Collections.singletonList(c));
        if (dVar.a(this.f366f.a.toString())) {
            l.a().a(f401m, String.format("Constraints met for delegate %s", new Object[]{str}), new Throwable[0]);
            try {
                i.c.b.a.a.a<ListenableWorker.a> b2 = this.f406l.b();
                ((h.a0.x.r.o.a) b2).a(new b(b2), this.f366f.c);
            } catch (Throwable th) {
                l.a().a(f401m, String.format("Delegated worker %s threw exception in startWork.", new Object[]{str}), th);
                synchronized (this.f403i) {
                    if (this.f404j) {
                        l.a().a(f401m, "Constraints were unmet, Retrying.", new Throwable[0]);
                        e();
                    } else {
                        d();
                    }
                }
            }
        } else {
            l.a().a(f401m, String.format("Constraints not met for delegate %s. Requesting retry.", new Object[]{str}), new Throwable[0]);
            e();
        }
    }

    public i.c.b.a.a.a<ListenableWorker.a> b() {
        this.f366f.c.execute(new a());
        return this.f405k;
    }
}
