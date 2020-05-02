package i.b.a.q;

import h.e.a;
import i.b.a.n.m.j;
import i.b.a.n.m.t;
import i.b.a.n.o.h.g;
import i.b.a.t.i;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: LoadPathCache */
public class c {
    public static final t<?, ?, ?> c = new t(Object.class, Object.class, Object.class, Collections.singletonList(new j(Object.class, Object.class, Object.class, Collections.emptyList(), new g(), (h.h.l.c<List<Throwable>>) null)), (h.h.l.c<List<Throwable>>) null);
    public final a<i, t<?, ?, ?>> a = new a<>();

    /* renamed from: b  reason: collision with root package name */
    public final AtomicReference<i> f2815b = new AtomicReference<>();

    public void a(Class<?> cls, Class<?> cls2, Class<?> cls3, t<?, ?, ?> tVar) {
        synchronized (this.a) {
            a<i, t<?, ?, ?>> aVar = this.a;
            i iVar = new i(cls, cls2, cls3);
            if (tVar == null) {
                tVar = c;
            }
            aVar.put(iVar, tVar);
        }
    }

    public <Data, TResource, Transcode> t<Data, TResource, Transcode> a(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        t<Data, TResource, Transcode> orDefault;
        i andSet = this.f2815b.getAndSet((Object) null);
        if (andSet == null) {
            andSet = new i();
        }
        andSet.a = cls;
        andSet.f2869b = cls2;
        andSet.c = cls3;
        synchronized (this.a) {
            orDefault = this.a.getOrDefault(andSet, null);
        }
        this.f2815b.set(andSet);
        return orDefault;
    }
}
