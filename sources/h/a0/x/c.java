package h.a0.x;

import android.content.Context;
import android.os.PowerManager;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import h.a0.b;
import h.a0.l;
import h.a0.x.m;
import h.a0.x.p.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;

/* compiled from: Processor */
public class c implements a, h.a0.x.p.a {

    /* renamed from: p  reason: collision with root package name */
    public static final String f933p = l.a("Processor");
    public PowerManager.WakeLock e;

    /* renamed from: f  reason: collision with root package name */
    public Context f934f;

    /* renamed from: g  reason: collision with root package name */
    public b f935g;

    /* renamed from: h  reason: collision with root package name */
    public h.a0.x.r.p.a f936h;

    /* renamed from: i  reason: collision with root package name */
    public WorkDatabase f937i;

    /* renamed from: j  reason: collision with root package name */
    public Map<String, m> f938j = new HashMap();

    /* renamed from: k  reason: collision with root package name */
    public Map<String, m> f939k = new HashMap();

    /* renamed from: l  reason: collision with root package name */
    public List<d> f940l;

    /* renamed from: m  reason: collision with root package name */
    public Set<String> f941m;

    /* renamed from: n  reason: collision with root package name */
    public final List<a> f942n;

    /* renamed from: o  reason: collision with root package name */
    public final Object f943o;

    /* compiled from: Processor */
    public static class a implements Runnable {
        public a e;

        /* renamed from: f  reason: collision with root package name */
        public String f944f;

        /* renamed from: g  reason: collision with root package name */
        public i.c.b.a.a.a<Boolean> f945g;

        public a(a aVar, String str, i.c.b.a.a.a<Boolean> aVar2) {
            this.e = aVar;
            this.f944f = str;
            this.f945g = aVar2;
        }

        public void run() {
            boolean z;
            try {
                z = this.f945g.get().booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                z = true;
            }
            this.e.a(this.f944f, z);
        }
    }

    public c(Context context, b bVar, h.a0.x.r.p.a aVar, WorkDatabase workDatabase, List<d> list) {
        this.f934f = context;
        this.f935g = bVar;
        this.f936h = aVar;
        this.f937i = workDatabase;
        this.f940l = list;
        this.f941m = new HashSet();
        this.f942n = new ArrayList();
        this.e = null;
        this.f943o = new Object();
    }

    public boolean a(String str, WorkerParameters.a aVar) {
        synchronized (this.f943o) {
            if (this.f939k.containsKey(str)) {
                l.a().a(f933p, String.format("Work %s is already enqueued for processing", new Object[]{str}), new Throwable[0]);
                return false;
            }
            m.a aVar2 = new m.a(this.f934f, this.f935g, this.f936h, this, this.f937i, str);
            aVar2.f981h = this.f940l;
            if (aVar != null) {
                aVar2.f982i = aVar;
            }
            m mVar = new m(aVar2);
            h.a0.x.r.o.c<Boolean> cVar = mVar.u;
            cVar.a(new a(this, str, cVar), ((h.a0.x.r.p.b) this.f936h).c);
            this.f939k.put(str, mVar);
            ((h.a0.x.r.p.b) this.f936h).a.execute(mVar);
            l.a().a(f933p, String.format("%s: processing %s", new Object[]{c.class.getSimpleName(), str}), new Throwable[0]);
            return true;
        }
    }

    public boolean b(String str) {
        boolean z;
        synchronized (this.f943o) {
            if (!this.f939k.containsKey(str)) {
                if (!this.f938j.containsKey(str)) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    public boolean c(String str) {
        boolean containsKey;
        synchronized (this.f943o) {
            containsKey = this.f938j.containsKey(str);
        }
        return containsKey;
    }

    public boolean d(String str) {
        boolean a2;
        synchronized (this.f943o) {
            boolean z = true;
            l.a().a(f933p, String.format("Processor cancelling %s", new Object[]{str}), new Throwable[0]);
            this.f941m.add(str);
            m remove = this.f938j.remove(str);
            if (remove == null) {
                z = false;
            }
            if (remove == null) {
                remove = this.f939k.remove(str);
            }
            a2 = a(str, remove);
            if (z) {
                a();
            }
        }
        return a2;
    }

    public boolean e(String str) {
        boolean a2;
        synchronized (this.f943o) {
            l.a().a(f933p, String.format("Processor stopping foreground work %s", new Object[]{str}), new Throwable[0]);
            a2 = a(str, this.f938j.remove(str));
        }
        return a2;
    }

    public boolean f(String str) {
        boolean a2;
        synchronized (this.f943o) {
            l.a().a(f933p, String.format("Processor stopping background work %s", new Object[]{str}), new Throwable[0]);
            a2 = a(str, this.f939k.remove(str));
        }
        return a2;
    }

    public void b(a aVar) {
        synchronized (this.f943o) {
            this.f942n.remove(aVar);
        }
    }

    public boolean a(String str) {
        boolean contains;
        synchronized (this.f943o) {
            contains = this.f941m.contains(str);
        }
        return contains;
    }

    public void a(a aVar) {
        synchronized (this.f943o) {
            this.f942n.add(aVar);
        }
    }

    public void a(String str, boolean z) {
        synchronized (this.f943o) {
            this.f939k.remove(str);
            l.a().a(f933p, String.format("%s %s executed; reschedule = %s", new Object[]{getClass().getSimpleName(), str, Boolean.valueOf(z)}), new Throwable[0]);
            for (a a2 : this.f942n) {
                a2.a(str, z);
            }
        }
    }

    public final void a() {
        synchronized (this.f943o) {
            if (!(!this.f938j.isEmpty())) {
                SystemForegroundService systemForegroundService = SystemForegroundService.f387k;
                if (systemForegroundService != null) {
                    l.a().a(f933p, "No more foreground work. Stopping SystemForegroundService", new Throwable[0]);
                    systemForegroundService.f388f.post(new d(systemForegroundService));
                } else {
                    l.a().a(f933p, "No more foreground work. SystemForegroundService is already stopped", new Throwable[0]);
                }
                if (this.e != null) {
                    this.e.release();
                    this.e = null;
                }
            }
        }
    }

    public static boolean a(String str, m mVar) {
        boolean z;
        if (mVar != null) {
            mVar.w = true;
            mVar.f();
            i.c.b.a.a.a<ListenableWorker.a> aVar = mVar.v;
            if (aVar != null) {
                z = aVar.isDone();
                mVar.v.cancel(true);
            } else {
                z = false;
            }
            ListenableWorker listenableWorker = mVar.f970j;
            if (listenableWorker == null || z) {
                l.a().a(m.x, String.format("WorkSpec %s is already done. Not interrupting.", new Object[]{mVar.f969i}), new Throwable[0]);
            } else {
                listenableWorker.a();
            }
            l.a().a(f933p, String.format("WorkerWrapper interrupted for %s", new Object[]{str}), new Throwable[0]);
            return true;
        }
        l.a().a(f933p, String.format("WorkerWrapper could not be found for %s", new Object[]{str}), new Throwable[0]);
        return false;
    }
}
