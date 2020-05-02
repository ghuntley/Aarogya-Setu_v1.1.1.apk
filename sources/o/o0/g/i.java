package o.o0.g;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o.e;
import o.j;
import o.m0;
import o.u;
import o.y;

/* compiled from: RouteSelector */
public final class i {
    public final e a;

    /* renamed from: b  reason: collision with root package name */
    public final h f5427b;
    public final j c;
    public final u d;
    public List<Proxy> e = Collections.emptyList();

    /* renamed from: f  reason: collision with root package name */
    public int f5428f;

    /* renamed from: g  reason: collision with root package name */
    public List<InetSocketAddress> f5429g = Collections.emptyList();

    /* renamed from: h  reason: collision with root package name */
    public final List<m0> f5430h = new ArrayList();

    /* compiled from: RouteSelector */
    public static final class a {
        public final List<m0> a;

        /* renamed from: b  reason: collision with root package name */
        public int f5431b = 0;

        public a(List<m0> list) {
            this.a = list;
        }

        public boolean a() {
            return this.f5431b < this.a.size();
        }
    }

    public i(e eVar, h hVar, j jVar, u uVar) {
        List<Proxy> list;
        this.a = eVar;
        this.f5427b = hVar;
        this.c = jVar;
        this.d = uVar;
        y yVar = eVar.a;
        Proxy proxy = eVar.f5296h;
        if (proxy != null) {
            this.e = Collections.singletonList(proxy);
        } else {
            List<Proxy> select = eVar.f5295g.select(yVar.g());
            if (select == null || select.isEmpty()) {
                list = o.o0.e.a((T[]) new Proxy[]{Proxy.NO_PROXY});
            } else {
                list = o.o0.e.a(select);
            }
            this.e = list;
        }
        this.f5428f = 0;
    }

    public boolean a() {
        return b() || !this.f5430h.isEmpty();
    }

    public final boolean b() {
        return this.f5428f < this.e.size();
    }
}
