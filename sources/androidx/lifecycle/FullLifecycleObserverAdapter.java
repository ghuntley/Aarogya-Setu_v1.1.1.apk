package androidx.lifecycle;

import h.o.d;
import h.o.h;
import h.o.j;
import h.o.l;

public class FullLifecycleObserverAdapter implements j {
    public final d a;

    /* renamed from: b  reason: collision with root package name */
    public final j f253b;

    public FullLifecycleObserverAdapter(d dVar, j jVar) {
        this.a = dVar;
        this.f253b = jVar;
    }

    public void a(l lVar, h.a aVar) {
        switch (aVar.ordinal()) {
            case 0:
                this.a.c(lVar);
                break;
            case 1:
                this.a.f(lVar);
                break;
            case 2:
                this.a.a(lVar);
                break;
            case 3:
                this.a.d(lVar);
                break;
            case 4:
                this.a.e(lVar);
                break;
            case 5:
                this.a.b(lVar);
                break;
            case 6:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        j jVar = this.f253b;
        if (jVar != null) {
            jVar.a(lVar, aVar);
        }
    }
}
