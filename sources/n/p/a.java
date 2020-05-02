package n.p;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import n.m.c.f;

/* compiled from: SequencesJVM.kt */
public final class a<T> implements b<T> {
    public final AtomicReference<b<T>> a;

    public a(b<? extends T> bVar) {
        if (bVar != null) {
            this.a = new AtomicReference<>(bVar);
        } else {
            f.a("sequence");
            throw null;
        }
    }

    public Iterator<T> iterator() {
        b andSet = this.a.getAndSet((Object) null);
        if (andSet != null) {
            return andSet.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
