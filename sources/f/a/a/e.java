package f.a.a;

import f.a.a.h;
import f.a.s0;
import f.a.x;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import n.m.c.f;

/* compiled from: Atomic.kt */
public abstract class e<T> extends k {
    public static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "_consensus");
    public volatile Object _consensus = d.a;

    public final Object a(Object obj) {
        Object obj2 = this._consensus;
        boolean z = true;
        if (obj2 == d.a) {
            s0.b bVar = (s0.b) this;
            if (((h) obj) != null) {
                if (bVar.d.b() == bVar.e) {
                    obj2 = null;
                } else {
                    obj2 = g.a;
                }
                if (x.a) {
                    if (!(obj2 != d.a)) {
                        throw new AssertionError();
                    }
                }
                if (!a.compareAndSet(this, d.a, obj2)) {
                    obj2 = this._consensus;
                }
            } else {
                f.a("affected");
                throw null;
            }
        }
        h.a aVar = (h.a) this;
        h hVar = (h) obj;
        if (hVar != null) {
            if (obj2 != null) {
                z = false;
            }
            h hVar2 = z ? aVar.c : aVar.f794b;
            if (hVar2 != null && h.e.compareAndSet(hVar, aVar, hVar2) && z) {
                h hVar3 = aVar.c;
                h hVar4 = aVar.f794b;
                if (hVar4 != null) {
                    hVar3.a(hVar4);
                } else {
                    f.a();
                    throw null;
                }
            }
            return obj2;
        }
        f.a("affected");
        throw null;
    }
}
