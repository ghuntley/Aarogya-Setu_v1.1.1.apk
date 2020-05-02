package h.a0.x.o;

import android.content.Context;
import h.a0.l;
import h.a0.x.o.e.b;
import h.a0.x.o.e.c;
import h.a0.x.o.e.e;
import h.a0.x.o.e.f;
import h.a0.x.o.e.g;
import h.a0.x.o.e.h;
import h.a0.x.q.p;
import h.a0.x.r.p.a;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WorkConstraintsTracker */
public class d implements c.a {
    public static final String d = l.a("WorkConstraintsTracker");
    public final c a;

    /* renamed from: b  reason: collision with root package name */
    public final c<?>[] f1022b;
    public final Object c = new Object();

    public d(Context context, a aVar, c cVar) {
        Context applicationContext = context.getApplicationContext();
        this.a = cVar;
        this.f1022b = new c[]{new h.a0.x.o.e.a(applicationContext, aVar), new b(applicationContext, aVar), new h(applicationContext, aVar), new h.a0.x.o.e.d(applicationContext, aVar), new g(applicationContext, aVar), new f(applicationContext, aVar), new e(applicationContext, aVar)};
    }

    public void a(Iterable<p> iterable) {
        synchronized (this.c) {
            for (c<?> cVar : this.f1022b) {
                if (cVar.d != null) {
                    cVar.d = null;
                    cVar.a((c.a) null, cVar.f1023b);
                }
            }
            for (c<?> a2 : this.f1022b) {
                a2.a(iterable);
            }
            for (c<?> cVar2 : this.f1022b) {
                if (cVar2.d != this) {
                    cVar2.d = this;
                    cVar2.a(this, cVar2.f1023b);
                }
            }
        }
    }

    public void b(List<String> list) {
        synchronized (this.c) {
            if (this.a != null) {
                this.a.b(list);
            }
        }
    }

    public void a() {
        synchronized (this.c) {
            for (c<?> cVar : this.f1022b) {
                if (!cVar.a.isEmpty()) {
                    cVar.a.clear();
                    cVar.c.b(cVar);
                }
            }
        }
    }

    public boolean a(String str) {
        synchronized (this.c) {
            for (c<?> cVar : this.f1022b) {
                T t = cVar.f1023b;
                if (t != null && cVar.b(t) && cVar.a.contains(str)) {
                    l.a().a(d, String.format("Work %s constrained by %s", new Object[]{str, cVar.getClass().getSimpleName()}), new Throwable[0]);
                    return false;
                }
            }
            return true;
        }
    }

    public void a(List<String> list) {
        synchronized (this.c) {
            ArrayList arrayList = new ArrayList();
            for (String next : list) {
                if (a(next)) {
                    l.a().a(d, String.format("Constraints met for %s", new Object[]{next}), new Throwable[0]);
                    arrayList.add(next);
                }
            }
            if (this.a != null) {
                this.a.a(arrayList);
            }
        }
    }
}
