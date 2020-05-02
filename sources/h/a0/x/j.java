package h.a0.x;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.ForceStopRunnable;
import h.a0.b;
import h.a0.l;
import h.a0.r;
import h.a0.u;
import h.a0.x.r.g;
import h.a0.x.r.p.a;
import h.v.a.f.f;
import java.util.Arrays;
import java.util.List;

/* compiled from: WorkManagerImpl */
public class j extends u {

    /* renamed from: j  reason: collision with root package name */
    public static j f955j;

    /* renamed from: k  reason: collision with root package name */
    public static j f956k;

    /* renamed from: l  reason: collision with root package name */
    public static final Object f957l = new Object();
    public Context a;

    /* renamed from: b  reason: collision with root package name */
    public b f958b;
    public WorkDatabase c;
    public a d;
    public List<d> e;

    /* renamed from: f  reason: collision with root package name */
    public c f959f;

    /* renamed from: g  reason: collision with root package name */
    public g f960g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f961h = false;

    /* renamed from: i  reason: collision with root package name */
    public BroadcastReceiver.PendingResult f962i;

    public j(Context context, b bVar, a aVar) {
        WorkDatabase a2 = WorkDatabase.a(context.getApplicationContext(), ((h.a0.x.r.p.b) aVar).a, context.getResources().getBoolean(r.workmanager_test_configuration));
        Context applicationContext = context.getApplicationContext();
        l.a((l) new l.a(bVar.e));
        List<d> asList = Arrays.asList(new d[]{e.a(applicationContext, this), new h.a0.x.n.a.a(applicationContext, aVar, this)});
        c cVar = new c(context, bVar, aVar, a2, asList);
        Context applicationContext2 = context.getApplicationContext();
        this.a = applicationContext2;
        this.f958b = bVar;
        this.d = aVar;
        this.c = a2;
        this.e = asList;
        this.f959f = cVar;
        this.f960g = new g(a2);
        a aVar2 = this.d;
        ((h.a0.x.r.p.b) aVar2).a.execute(new ForceStopRunnable(applicationContext2, this));
    }

    public static j a(Context context) {
        j c2;
        synchronized (f957l) {
            c2 = c();
            if (c2 == null) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext instanceof b.C0025b) {
                    a(applicationContext, ((b.C0025b) applicationContext).a());
                    c2 = a(applicationContext);
                } else {
                    throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                }
            }
        }
        return c2;
    }

    @Deprecated
    public static j c() {
        synchronized (f957l) {
            if (f955j != null) {
                j jVar = f955j;
                return jVar;
            }
            j jVar2 = f956k;
            return jVar2;
        }
    }

    public void b() {
        if (Build.VERSION.SDK_INT >= 23) {
            h.a0.x.n.c.b.a(this.a);
        }
        h.a0.x.q.r rVar = (h.a0.x.q.r) this.c.n();
        rVar.a.b();
        f a2 = rVar.f1078i.a();
        rVar.a.c();
        try {
            a2.f();
            rVar.a.h();
            rVar.a.e();
            h.s.l lVar = rVar.f1078i;
            if (a2 == lVar.c) {
                lVar.a.set(false);
            }
            e.a(this.f958b, this.c, this.e);
        } catch (Throwable th) {
            rVar.a.e();
            rVar.f1078i.a(a2);
            throw th;
        }
    }

    public static void a(Context context, b bVar) {
        synchronized (f957l) {
            if (f955j != null) {
                if (f956k != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
            }
            if (f955j == null) {
                Context applicationContext = context.getApplicationContext();
                if (f956k == null) {
                    f956k = new j(applicationContext, bVar, new h.a0.x.r.p.b(bVar.f893b));
                }
                f955j = f956k;
            }
        }
    }

    public void a(String str) {
        a aVar = this.d;
        ((h.a0.x.r.p.b) aVar).a.execute(new h.a0.x.r.j(this, str, false));
    }

    public void a() {
        synchronized (f957l) {
            this.f961h = true;
            if (this.f962i != null) {
                this.f962i.finish();
                this.f962i = null;
            }
        }
    }

    public void a(BroadcastReceiver.PendingResult pendingResult) {
        synchronized (f957l) {
            this.f962i = pendingResult;
            if (this.f961h) {
                pendingResult.finish();
                this.f962i = null;
            }
        }
    }
}
