package i.b.a.n.m;

import i.b.a.n.a;
import i.b.a.n.e;
import i.b.a.n.l.d;
import i.b.a.n.m.g;
import i.b.a.n.n.n;
import java.io.File;
import java.util.List;

/* compiled from: DataCacheGenerator */
public class d implements g, d.a<Object> {
    public final List<e> e;

    /* renamed from: f  reason: collision with root package name */
    public final h<?> f2563f;

    /* renamed from: g  reason: collision with root package name */
    public final g.a f2564g;

    /* renamed from: h  reason: collision with root package name */
    public int f2565h = -1;

    /* renamed from: i  reason: collision with root package name */
    public e f2566i;

    /* renamed from: j  reason: collision with root package name */
    public List<n<File, ?>> f2567j;

    /* renamed from: k  reason: collision with root package name */
    public int f2568k;

    /* renamed from: l  reason: collision with root package name */
    public volatile n.a<?> f2569l;

    /* renamed from: m  reason: collision with root package name */
    public File f2570m;

    public d(h<?> hVar, g.a aVar) {
        List<e> a = hVar.a();
        this.e = a;
        this.f2563f = hVar;
        this.f2564g = aVar;
    }

    public boolean a() {
        while (true) {
            List<n<File, ?>> list = this.f2567j;
            if (list != null) {
                if (this.f2568k < list.size()) {
                    this.f2569l = null;
                    boolean z = false;
                    while (!z) {
                        if (!(this.f2568k < this.f2567j.size())) {
                            break;
                        }
                        List<n<File, ?>> list2 = this.f2567j;
                        int i2 = this.f2568k;
                        this.f2568k = i2 + 1;
                        File file = this.f2570m;
                        h<?> hVar = this.f2563f;
                        this.f2569l = list2.get(i2).a(file, hVar.e, hVar.f2578f, hVar.f2581i);
                        if (this.f2569l != null && this.f2563f.c(this.f2569l.c.a())) {
                            this.f2569l.c.a(this.f2563f.f2587o, this);
                            z = true;
                        }
                    }
                    return z;
                }
            }
            int i3 = this.f2565h + 1;
            this.f2565h = i3;
            if (i3 >= this.e.size()) {
                return false;
            }
            e eVar = this.e.get(this.f2565h);
            File a = this.f2563f.b().a(new e(eVar, this.f2563f.f2586n));
            this.f2570m = a;
            if (a != null) {
                this.f2566i = eVar;
                this.f2567j = this.f2563f.c.f2409b.a(a);
                this.f2568k = 0;
            }
        }
    }

    public void cancel() {
        n.a<?> aVar = this.f2569l;
        if (aVar != null) {
            aVar.c.cancel();
        }
    }

    public d(List<e> list, h<?> hVar, g.a aVar) {
        this.e = list;
        this.f2563f = hVar;
        this.f2564g = aVar;
    }

    public void a(Object obj) {
        this.f2564g.a(this.f2566i, obj, this.f2569l.c, a.DATA_DISK_CACHE, this.f2566i);
    }

    public void a(Exception exc) {
        this.f2564g.a(this.f2566i, exc, this.f2569l.c, a.DATA_DISK_CACHE);
    }
}
