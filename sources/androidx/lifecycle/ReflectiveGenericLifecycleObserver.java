package androidx.lifecycle;

import h.o.b;
import h.o.h;
import h.o.j;
import h.o.l;

public class ReflectiveGenericLifecycleObserver implements j {
    public final Object a;

    /* renamed from: b  reason: collision with root package name */
    public final b.a f262b;

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.a = obj;
        this.f262b = b.c.a(obj.getClass());
    }

    public void a(l lVar, h.a aVar) {
        b.a aVar2 = this.f262b;
        Object obj = this.a;
        b.a.a(aVar2.a.get(aVar), lVar, aVar, obj);
        b.a.a(aVar2.a.get(h.a.ON_ANY), lVar, aVar, obj);
    }
}
