package i.b.a;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import i.b.a.n.m.k;
import i.b.a.o.c;
import i.b.a.o.f;
import i.b.a.o.h;
import i.b.a.o.i;
import i.b.a.o.m;
import i.b.a.o.n;
import i.b.a.o.p;
import i.b.a.r.d;
import i.b.a.r.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: RequestManager */
public class j implements ComponentCallbacks2, i {

    /* renamed from: p  reason: collision with root package name */
    public static final e f2423p = ((e) ((e) new e().a((Class<?>) Bitmap.class)).c());
    public final c e;

    /* renamed from: f  reason: collision with root package name */
    public final Context f2424f;

    /* renamed from: g  reason: collision with root package name */
    public final h f2425g;

    /* renamed from: h  reason: collision with root package name */
    public final n f2426h;

    /* renamed from: i  reason: collision with root package name */
    public final m f2427i;

    /* renamed from: j  reason: collision with root package name */
    public final p f2428j = new p();

    /* renamed from: k  reason: collision with root package name */
    public final Runnable f2429k = new a();

    /* renamed from: l  reason: collision with root package name */
    public final Handler f2430l = new Handler(Looper.getMainLooper());

    /* renamed from: m  reason: collision with root package name */
    public final c f2431m;

    /* renamed from: n  reason: collision with root package name */
    public final CopyOnWriteArrayList<d<Object>> f2432n;

    /* renamed from: o  reason: collision with root package name */
    public e f2433o;

    /* compiled from: RequestManager */
    public class a implements Runnable {
        public a() {
        }

        public void run() {
            j jVar = j.this;
            jVar.f2425g.a(jVar);
        }
    }

    /* compiled from: RequestManager */
    public class b implements c.a {
        public final n a;

        public b(n nVar) {
            this.a = nVar;
        }

        public void a(boolean z) {
            if (z) {
                synchronized (j.this) {
                    n nVar = this.a;
                    Iterator it = ((ArrayList) i.b.a.t.j.a(nVar.a)).iterator();
                    while (it.hasNext()) {
                        i.b.a.r.b bVar = (i.b.a.r.b) it.next();
                        if (!bVar.c() && !bVar.d()) {
                            bVar.clear();
                            if (!nVar.c) {
                                bVar.b();
                            } else {
                                nVar.f2813b.add(bVar);
                            }
                        }
                    }
                }
            }
        }
    }

    static {
        e eVar = (e) ((e) new e().a((Class<?>) i.b.a.n.o.g.c.class)).c();
        e eVar2 = (e) ((e) ((e) new e().a(k.f2615b)).a(g.LOW)).a(true);
    }

    public j(c cVar, h hVar, m mVar, Context context) {
        c cVar2;
        n nVar = new n();
        i.b.a.o.d dVar = cVar.f2395k;
        this.e = cVar;
        this.f2425g = hVar;
        this.f2427i = mVar;
        this.f2426h = nVar;
        this.f2424f = context;
        Context applicationContext = context.getApplicationContext();
        b bVar = new b(nVar);
        if (((f) dVar) != null) {
            boolean z = h.h.f.a.a(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0;
            if (Log.isLoggable("ConnectivityMonitor", 3)) {
                Log.d("ConnectivityMonitor", z ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
            }
            if (z) {
                cVar2 = new i.b.a.o.e(applicationContext, bVar);
            } else {
                cVar2 = new i.b.a.o.j();
            }
            this.f2431m = cVar2;
            if (i.b.a.t.j.b()) {
                this.f2430l.post(this.f2429k);
            } else {
                hVar.a(this);
            }
            hVar.a(this.f2431m);
            this.f2432n = new CopyOnWriteArrayList<>(cVar.f2391g.e);
            a(cVar.f2391g.a());
            cVar.a(this);
            return;
        }
        throw null;
    }

    public synchronized void a(e eVar) {
        this.f2433o = (e) ((e) eVar.clone()).b();
    }

    public synchronized boolean b(i.b.a.r.h.h<?> hVar) {
        i.b.a.r.b b2 = hVar.b();
        if (b2 == null) {
            return true;
        }
        if (!this.f2426h.a(b2)) {
            return false;
        }
        this.f2428j.e.remove(hVar);
        hVar.a((i.b.a.r.b) null);
        return true;
    }

    public synchronized void c() {
        i();
        this.f2428j.c();
    }

    public synchronized void d() {
        this.f2428j.d();
        for (T a2 : i.b.a.t.j.a(this.f2428j.e)) {
            a((i.b.a.r.h.h<?>) a2);
        }
        this.f2428j.e.clear();
        n nVar = this.f2426h;
        Iterator it = ((ArrayList) i.b.a.t.j.a(nVar.a)).iterator();
        while (it.hasNext()) {
            nVar.a((i.b.a.r.b) it.next());
        }
        nVar.f2813b.clear();
        this.f2425g.b(this);
        this.f2425g.b(this.f2431m);
        this.f2430l.removeCallbacks(this.f2429k);
        this.e.b(this);
    }

    public i<Bitmap> e() {
        return a(Bitmap.class).a((i.b.a.r.a<?>) f2423p);
    }

    public i<Drawable> f() {
        return a(Drawable.class);
    }

    public synchronized e g() {
        return this.f2433o;
    }

    public synchronized void h() {
        n nVar = this.f2426h;
        nVar.c = true;
        Iterator it = ((ArrayList) i.b.a.t.j.a(nVar.a)).iterator();
        while (it.hasNext()) {
            i.b.a.r.b bVar = (i.b.a.r.b) it.next();
            if (bVar.isRunning()) {
                bVar.a();
                nVar.f2813b.add(bVar);
            }
        }
    }

    public synchronized void i() {
        n nVar = this.f2426h;
        nVar.c = false;
        Iterator it = ((ArrayList) i.b.a.t.j.a(nVar.a)).iterator();
        while (it.hasNext()) {
            i.b.a.r.b bVar = (i.b.a.r.b) it.next();
            if (!bVar.c() && !bVar.isRunning()) {
                bVar.b();
            }
        }
        nVar.f2813b.clear();
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onLowMemory() {
    }

    public void onTrimMemory(int i2) {
    }

    public synchronized String toString() {
        return super.toString() + "{tracker=" + this.f2426h + ", treeNode=" + this.f2427i + "}";
    }

    public synchronized void a() {
        h();
        this.f2428j.a();
    }

    public i<Drawable> a(Integer num) {
        return f().a(num);
    }

    public <ResourceType> i<ResourceType> a(Class<ResourceType> cls) {
        return new i<>(this.e, this, cls, this.f2424f);
    }

    public void a(i.b.a.r.h.h<?> hVar) {
        if (hVar != null) {
            boolean b2 = b(hVar);
            i.b.a.r.b b3 = hVar.b();
            if (!b2 && !this.e.a(hVar) && b3 != null) {
                hVar.a((i.b.a.r.b) null);
                b3.clear();
            }
        }
    }

    public synchronized void a(i.b.a.r.h.h<?> hVar, i.b.a.r.b bVar) {
        this.f2428j.e.add(hVar);
        n nVar = this.f2426h;
        nVar.a.add(bVar);
        if (!nVar.c) {
            bVar.b();
        } else {
            bVar.clear();
            if (Log.isLoggable("RequestTracker", 2)) {
                Log.v("RequestTracker", "Paused, delaying request");
            }
            nVar.f2813b.add(bVar);
        }
    }
}
