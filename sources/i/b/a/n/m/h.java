package i.b.a.n.m;

import com.bumptech.glide.Registry;
import i.b.a.n.e;
import i.b.a.n.g;
import i.b.a.n.k;
import i.b.a.n.m.c0.a;
import i.b.a.n.m.i;
import i.b.a.n.m.l;
import i.b.a.n.n.n;
import i.b.a.n.o.b;
import i.b.a.q.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: DecodeHelper */
public final class h<Transcode> {
    public final List<n.a<?>> a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final List<e> f2577b = new ArrayList();
    public i.b.a.e c;
    public Object d;
    public int e;

    /* renamed from: f  reason: collision with root package name */
    public int f2578f;

    /* renamed from: g  reason: collision with root package name */
    public Class<?> f2579g;

    /* renamed from: h  reason: collision with root package name */
    public i.d f2580h;

    /* renamed from: i  reason: collision with root package name */
    public g f2581i;

    /* renamed from: j  reason: collision with root package name */
    public Map<Class<?>, k<?>> f2582j;

    /* renamed from: k  reason: collision with root package name */
    public Class<Transcode> f2583k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f2584l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f2585m;

    /* renamed from: n  reason: collision with root package name */
    public e f2586n;

    /* renamed from: o  reason: collision with root package name */
    public i.b.a.g f2587o;

    /* renamed from: p  reason: collision with root package name */
    public k f2588p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f2589q;
    public boolean r;

    public <Data> t<Data, ?, Transcode> a(Class<Data> cls) {
        Class<Data> cls2 = cls;
        Registry registry = this.c.f2409b;
        Class<?> cls3 = this.f2579g;
        Class<Transcode> cls4 = this.f2583k;
        t<Data, ?, Transcode> a2 = registry.f447i.a(cls2, cls3, cls4);
        if (registry.f447i == null) {
            throw null;
        } else if (c.c.equals(a2)) {
            return null;
        } else {
            if (a2 == null) {
                ArrayList arrayList = new ArrayList();
                Iterator it = ((ArrayList) registry.c.b(cls2, cls3)).iterator();
                while (it.hasNext()) {
                    Class cls5 = (Class) it.next();
                    Iterator it2 = ((ArrayList) registry.f444f.b(cls5, cls4)).iterator();
                    while (it2.hasNext()) {
                        Class cls6 = (Class) it2.next();
                        j jVar = r1;
                        j jVar2 = new j(cls, cls5, cls6, registry.c.a(cls2, cls5), registry.f444f.a(cls5, cls6), registry.f448j);
                        arrayList.add(jVar);
                    }
                }
                if (arrayList.isEmpty()) {
                    a2 = null;
                } else {
                    a2 = new t<>(cls, cls3, cls4, arrayList, registry.f448j);
                }
                registry.f447i.a(cls2, cls3, cls4, a2);
            }
            return a2;
        }
    }

    public a b() {
        return ((l.c) this.f2580h).a();
    }

    public boolean c(Class<?> cls) {
        return a(cls) != null;
    }

    public <Z> k<Z> b(Class<Z> cls) {
        k<Z> kVar = this.f2582j.get(cls);
        if (kVar == null) {
            Iterator<Map.Entry<Class<?>, k<?>>> it = this.f2582j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry next = it.next();
                if (((Class) next.getKey()).isAssignableFrom(cls)) {
                    kVar = (k) next.getValue();
                    break;
                }
            }
        }
        if (kVar != null) {
            return kVar;
        }
        if (!this.f2582j.isEmpty() || !this.f2589q) {
            return (b) b.f2724b;
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }

    public List<n.a<?>> c() {
        if (!this.f2584l) {
            this.f2584l = true;
            this.a.clear();
            List a2 = this.c.f2409b.a(this.d);
            int size = a2.size();
            for (int i2 = 0; i2 < size; i2++) {
                n.a a3 = ((n) a2.get(i2)).a(this.d, this.e, this.f2578f, this.f2581i);
                if (a3 != null) {
                    this.a.add(a3);
                }
            }
        }
        return this.a;
    }

    public List<e> a() {
        if (!this.f2585m) {
            this.f2585m = true;
            this.f2577b.clear();
            List<n.a<?>> c2 = c();
            int size = c2.size();
            for (int i2 = 0; i2 < size; i2++) {
                n.a aVar = c2.get(i2);
                if (!this.f2577b.contains(aVar.a)) {
                    this.f2577b.add(aVar.a);
                }
                for (int i3 = 0; i3 < aVar.f2692b.size(); i3++) {
                    if (!this.f2577b.contains(aVar.f2692b.get(i3))) {
                        this.f2577b.add(aVar.f2692b.get(i3));
                    }
                }
            }
        }
        return this.f2577b;
    }
}
