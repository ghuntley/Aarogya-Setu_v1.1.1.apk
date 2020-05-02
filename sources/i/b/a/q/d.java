package i.b.a.q;

import h.e.a;
import i.b.a.t.i;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ModelToResourceClassCache */
public class d {
    public final AtomicReference<i> a = new AtomicReference<>();

    /* renamed from: b  reason: collision with root package name */
    public final a<i, List<Class<?>>> f2816b = new a<>();

    public List<Class<?>> a(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        List<Class<?>> orDefault;
        i andSet = this.a.getAndSet((Object) null);
        if (andSet == null) {
            andSet = new i(cls, cls2, cls3);
        } else {
            andSet.a = cls;
            andSet.f2869b = cls2;
            andSet.c = cls3;
        }
        synchronized (this.f2816b) {
            orDefault = this.f2816b.getOrDefault(andSet, null);
        }
        this.a.set(andSet);
        return orDefault;
    }

    public void a(Class<?> cls, Class<?> cls2, Class<?> cls3, List<Class<?>> list) {
        synchronized (this.f2816b) {
            this.f2816b.put(new i(cls, cls2, cls3), list);
        }
    }
}
