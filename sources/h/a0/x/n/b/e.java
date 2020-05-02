package h.a0.x.n.b;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import h.a0.l;
import h.a0.x.j;
import h.a0.x.r.h;
import h.a0.x.r.k;
import h.a0.x.r.n;
import java.util.ArrayList;
import java.util.List;

/* compiled from: SystemAlarmDispatcher */
public class e implements h.a0.x.a {

    /* renamed from: o  reason: collision with root package name */
    public static final String f1003o = l.a("SystemAlarmDispatcher");
    public final Context e;

    /* renamed from: f  reason: collision with root package name */
    public final h.a0.x.r.p.a f1004f;

    /* renamed from: g  reason: collision with root package name */
    public final n f1005g = new n();

    /* renamed from: h  reason: collision with root package name */
    public final h.a0.x.c f1006h;

    /* renamed from: i  reason: collision with root package name */
    public final j f1007i;

    /* renamed from: j  reason: collision with root package name */
    public final b f1008j = new b(this.e);

    /* renamed from: k  reason: collision with root package name */
    public final Handler f1009k;

    /* renamed from: l  reason: collision with root package name */
    public final List<Intent> f1010l;

    /* renamed from: m  reason: collision with root package name */
    public Intent f1011m;

    /* renamed from: n  reason: collision with root package name */
    public c f1012n;

    /* compiled from: SystemAlarmDispatcher */
    public class a implements Runnable {
        public a() {
        }

        public void run() {
            e eVar;
            d dVar;
            synchronized (e.this.f1010l) {
                e.this.f1011m = e.this.f1010l.get(0);
            }
            Intent intent = e.this.f1011m;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = e.this.f1011m.getIntExtra("KEY_START_ID", 0);
                l.a().a(e.f1003o, String.format("Processing command %s, %s", new Object[]{e.this.f1011m, Integer.valueOf(intExtra)}), new Throwable[0]);
                PowerManager.WakeLock a = k.a(e.this.e, String.format("%s (%s)", new Object[]{action, Integer.valueOf(intExtra)}));
                try {
                    l.a().a(e.f1003o, String.format("Acquiring operation wake lock (%s) %s", new Object[]{action, a}), new Throwable[0]);
                    a.acquire();
                    e.this.f1008j.b(e.this.f1011m, intExtra, e.this);
                    l.a().a(e.f1003o, String.format("Releasing operation wake lock (%s) %s", new Object[]{action, a}), new Throwable[0]);
                    a.release();
                    eVar = e.this;
                    dVar = new d(eVar);
                } catch (Throwable th) {
                    l.a().a(e.f1003o, String.format("Releasing operation wake lock (%s) %s", new Object[]{action, a}), new Throwable[0]);
                    a.release();
                    e eVar2 = e.this;
                    eVar2.f1009k.post(new d(eVar2));
                    throw th;
                }
                eVar.f1009k.post(dVar);
            }
        }
    }

    /* compiled from: SystemAlarmDispatcher */
    public static class b implements Runnable {
        public final e e;

        /* renamed from: f  reason: collision with root package name */
        public final Intent f1013f;

        /* renamed from: g  reason: collision with root package name */
        public final int f1014g;

        public b(e eVar, Intent intent, int i2) {
            this.e = eVar;
            this.f1013f = intent;
            this.f1014g = i2;
        }

        public void run() {
            this.e.a(this.f1013f, this.f1014g);
        }
    }

    /* compiled from: SystemAlarmDispatcher */
    public interface c {
        void d();
    }

    /* compiled from: SystemAlarmDispatcher */
    public static class d implements Runnable {
        public final e e;

        public d(e eVar) {
            this.e = eVar;
        }

        public void run() {
            this.e.b();
        }
    }

    public e(Context context) {
        this.e = context.getApplicationContext();
        j a2 = j.a(context);
        this.f1007i = a2;
        h.a0.x.c cVar = a2.f959f;
        this.f1006h = cVar;
        this.f1004f = a2.d;
        cVar.a((h.a0.x.a) this);
        this.f1010l = new ArrayList();
        this.f1011m = null;
        this.f1009k = new Handler(Looper.getMainLooper());
    }

    public void a(String str, boolean z) {
        this.f1009k.post(new b(this, b.a(this.e, str, z), 0));
    }

    public void b() {
        l.a().a(f1003o, "Checking if commands are complete.", new Throwable[0]);
        a();
        synchronized (this.f1010l) {
            if (this.f1011m != null) {
                l.a().a(f1003o, String.format("Removing command %s", new Object[]{this.f1011m}), new Throwable[0]);
                if (this.f1010l.remove(0).equals(this.f1011m)) {
                    this.f1011m = null;
                } else {
                    throw new IllegalStateException("Dequeue-d command is not the first.");
                }
            }
            h hVar = ((h.a0.x.r.p.b) this.f1004f).a;
            if (!this.f1008j.a() && this.f1010l.isEmpty() && !hVar.a()) {
                l.a().a(f1003o, "No more commands & intents.", new Throwable[0]);
                if (this.f1012n != null) {
                    this.f1012n.d();
                }
            } else if (!this.f1010l.isEmpty()) {
                d();
            }
        }
    }

    public void c() {
        l.a().a(f1003o, "Destroying SystemAlarmDispatcher", new Throwable[0]);
        this.f1006h.b((h.a0.x.a) this);
        n nVar = this.f1005g;
        if (!nVar.f1099b.isShutdown()) {
            nVar.f1099b.shutdownNow();
        }
        this.f1012n = null;
    }

    public final void d() {
        a();
        PowerManager.WakeLock a2 = k.a(this.e, "ProcessCommand");
        try {
            a2.acquire();
            h.a0.x.r.p.a aVar = this.f1007i.d;
            ((h.a0.x.r.p.b) aVar).a.execute(new a());
        } finally {
            a2.release();
        }
    }

    public boolean a(Intent intent, int i2) {
        boolean z = false;
        l.a().a(f1003o, String.format("Adding command %s (%s)", new Object[]{intent, Integer.valueOf(i2)}), new Throwable[0]);
        a();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            l.a().d(f1003o, "Unknown command. Ignoring", new Throwable[0]);
            return false;
        } else if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && a("ACTION_CONSTRAINTS_CHANGED")) {
            return false;
        } else {
            intent.putExtra("KEY_START_ID", i2);
            synchronized (this.f1010l) {
                if (!this.f1010l.isEmpty()) {
                    z = true;
                }
                this.f1010l.add(intent);
                if (!z) {
                    d();
                }
            }
            return true;
        }
    }

    public final boolean a(String str) {
        a();
        synchronized (this.f1010l) {
            for (Intent action : this.f1010l) {
                if (str.equals(action.getAction())) {
                    return true;
                }
            }
            return false;
        }
    }

    public final void a() {
        if (this.f1009k.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }
}
