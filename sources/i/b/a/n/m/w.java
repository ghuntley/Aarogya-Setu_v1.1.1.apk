package i.b.a.n.m;

import com.bumptech.glide.Registry;
import i.a.a.a.a;
import i.b.a.n.e;
import i.b.a.n.k;
import i.b.a.n.l.d;
import i.b.a.n.m.g;
import i.b.a.n.n.n;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: ResourceCacheGenerator */
public class w implements g, d.a<Object> {
    public final g.a e;

    /* renamed from: f  reason: collision with root package name */
    public final h<?> f2660f;

    /* renamed from: g  reason: collision with root package name */
    public int f2661g;

    /* renamed from: h  reason: collision with root package name */
    public int f2662h = -1;

    /* renamed from: i  reason: collision with root package name */
    public e f2663i;

    /* renamed from: j  reason: collision with root package name */
    public List<n<File, ?>> f2664j;

    /* renamed from: k  reason: collision with root package name */
    public int f2665k;

    /* renamed from: l  reason: collision with root package name */
    public volatile n.a<?> f2666l;

    /* renamed from: m  reason: collision with root package name */
    public File f2667m;

    /* renamed from: n  reason: collision with root package name */
    public x f2668n;

    public w(h<?> hVar, g.a aVar) {
        this.f2660f = hVar;
        this.e = aVar;
    }

    public boolean a() {
        List<e> a = this.f2660f.a();
        if (a.isEmpty()) {
            return false;
        }
        h<?> hVar = this.f2660f;
        Registry registry = hVar.c.f2409b;
        Class<?> cls = hVar.d.getClass();
        Class<?> cls2 = hVar.f2579g;
        Class<Transcode> cls3 = hVar.f2583k;
        List<Class<?>> a2 = registry.f446h.a(cls, cls2, cls3);
        ArrayList arrayList = a2;
        if (a2 == null) {
            ArrayList arrayList2 = new ArrayList();
            for (Class<?> b2 : registry.a.a(cls)) {
                Iterator it = ((ArrayList) registry.c.b(b2, cls2)).iterator();
                while (it.hasNext()) {
                    Class cls4 = (Class) it.next();
                    if (!((ArrayList) registry.f444f.b(cls4, cls3)).isEmpty() && !arrayList2.contains(cls4)) {
                        arrayList2.add(cls4);
                    }
                }
            }
            registry.f446h.a(cls, cls2, cls3, Collections.unmodifiableList(arrayList2));
            arrayList = arrayList2;
        }
        if (!arrayList.isEmpty()) {
            while (true) {
                List<n<File, ?>> list = this.f2664j;
                if (list != null) {
                    if (this.f2665k < list.size()) {
                        this.f2666l = null;
                        boolean z = false;
                        while (!z) {
                            if (!(this.f2665k < this.f2664j.size())) {
                                break;
                            }
                            List<n<File, ?>> list2 = this.f2664j;
                            int i2 = this.f2665k;
                            this.f2665k = i2 + 1;
                            File file = this.f2667m;
                            h<?> hVar2 = this.f2660f;
                            this.f2666l = list2.get(i2).a(file, hVar2.e, hVar2.f2578f, hVar2.f2581i);
                            if (this.f2666l != null && this.f2660f.c(this.f2666l.c.a())) {
                                this.f2666l.c.a(this.f2660f.f2587o, this);
                                z = true;
                            }
                        }
                        return z;
                    }
                }
                int i3 = this.f2662h + 1;
                this.f2662h = i3;
                if (i3 >= arrayList.size()) {
                    int i4 = this.f2661g + 1;
                    this.f2661g = i4;
                    if (i4 >= a.size()) {
                        return false;
                    }
                    this.f2662h = 0;
                }
                e eVar = a.get(this.f2661g);
                Class cls5 = arrayList.get(this.f2662h);
                k<Z> b3 = this.f2660f.b(cls5);
                h<?> hVar3 = this.f2660f;
                this.f2668n = new x(hVar3.c.a, eVar, hVar3.f2586n, hVar3.e, hVar3.f2578f, b3, cls5, hVar3.f2581i);
                File a3 = this.f2660f.b().a(this.f2668n);
                this.f2667m = a3;
                if (a3 != null) {
                    this.f2663i = eVar;
                    this.f2664j = this.f2660f.c.f2409b.a(a3);
                    this.f2665k = 0;
                }
            }
        } else if (File.class.equals(this.f2660f.f2583k)) {
            return false;
        } else {
            StringBuilder a4 = a.a("Failed to find any load path from ");
            a4.append(this.f2660f.d.getClass());
            a4.append(" to ");
            a4.append(this.f2660f.f2583k);
            throw new IllegalStateException(a4.toString());
        }
    }

    public void cancel() {
        n.a<?> aVar = this.f2666l;
        if (aVar != null) {
            aVar.c.cancel();
        }
    }

    public void a(Object obj) {
        this.e.a(this.f2663i, obj, this.f2666l.c, i.b.a.n.a.RESOURCE_DISK_CACHE, this.f2668n);
    }

    public void a(Exception exc) {
        this.e.a(this.f2668n, exc, this.f2666l.c, i.b.a.n.a.RESOURCE_DISK_CACHE);
    }
}
