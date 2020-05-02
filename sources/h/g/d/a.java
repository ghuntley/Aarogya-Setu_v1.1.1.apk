package h.g.d;

import h.e.h;
import h.h.l.c;
import h.h.l.d;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: DirectedAcyclicGraph */
public final class a<T> {
    public final c<ArrayList<T>> a = new d(10);

    /* renamed from: b  reason: collision with root package name */
    public final h<T, ArrayList<T>> f1700b = new h<>();
    public final ArrayList<T> c = new ArrayList<>();
    public final HashSet<T> d = new HashSet<>();

    public void a(T t) {
        if (!(this.f1700b.a((Object) t) >= 0)) {
            this.f1700b.put(t, null);
        }
    }

    public final void a(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (!arrayList.contains(t)) {
            if (!hashSet.contains(t)) {
                hashSet.add(t);
                ArrayList orDefault = this.f1700b.getOrDefault(t, null);
                if (orDefault != null) {
                    int size = orDefault.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        a(orDefault.get(i2), arrayList, hashSet);
                    }
                }
                hashSet.remove(t);
                arrayList.add(t);
                return;
            }
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
    }
}
