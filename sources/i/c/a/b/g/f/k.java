package i.c.a.b.g.f;

import android.app.PendingIntent;
import android.content.Context;
import android.os.IBinder;
import i.c.a.b.d.k.h.k;
import i.c.a.b.d.l.q;
import i.c.a.b.h.b;
import java.util.HashMap;
import java.util.Map;

public final class k {
    public final b0<g> a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f3189b;
    public boolean c = false;
    public final Map<k.a<Object>, p> d = new HashMap();
    public final Map<k.a<Object>, o> e = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    public final Map<k.a<b>, l> f3190f = new HashMap();

    public k(Context context, b0<g> b0Var) {
        this.f3189b = context;
        this.a = b0Var;
    }

    public final void a() {
        synchronized (this.d) {
            for (p next : this.d.values()) {
                if (next != null) {
                    ((g) this.a.a()).a(new v(2, (t) null, next.asBinder(), (PendingIntent) null, (IBinder) null, (IBinder) null));
                }
            }
            this.d.clear();
        }
        synchronized (this.f3190f) {
            for (l next2 : this.f3190f.values()) {
                if (next2 != null) {
                    ((g) this.a.a()).a(v.a(next2, (d) null));
                }
            }
            this.f3190f.clear();
        }
        synchronized (this.e) {
            for (o next3 : this.e.values()) {
                if (next3 != null) {
                    ((g) this.a.a()).a(new e0(2, (c0) null, next3.asBinder(), (IBinder) null));
                }
            }
            this.e.clear();
        }
    }

    public final void b() {
        if (this.c) {
            this.a.a.l();
            ((g) this.a.a()).b(false);
            this.c = false;
        }
    }

    public final void a(k.a<b> aVar, d dVar) {
        this.a.a.l();
        q.a(aVar, (Object) "Invalid null listener key");
        synchronized (this.f3190f) {
            l remove = this.f3190f.remove(aVar);
            if (remove != null) {
                remove.g();
                ((g) this.a.a()).a(v.a(remove, dVar));
            }
        }
    }

    public final l a(i.c.a.b.d.k.h.k<b> kVar) {
        l lVar;
        synchronized (this.f3190f) {
            lVar = this.f3190f.get(kVar.c);
            if (lVar == null) {
                lVar = new l(kVar);
            }
            this.f3190f.put(kVar.c, lVar);
        }
        return lVar;
    }
}
