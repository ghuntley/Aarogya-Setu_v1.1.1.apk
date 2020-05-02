package i.b.a.n.m.b0;

import i.b.a.n.m.b0.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: GroupedLinkedMap */
public class g<K extends l, V> {
    public final a<K, V> a = new a<>(null);

    /* renamed from: b  reason: collision with root package name */
    public final Map<K, a<K, V>> f2534b = new HashMap();

    /* compiled from: GroupedLinkedMap */
    public static class a<K, V> {
        public final K a;

        /* renamed from: b  reason: collision with root package name */
        public List<V> f2535b;
        public a<K, V> c;
        public a<K, V> d;

        public a() {
            this((Object) null);
        }

        public V a() {
            List<V> list = this.f2535b;
            int size = list != null ? list.size() : 0;
            if (size > 0) {
                return this.f2535b.remove(size - 1);
            }
            return null;
        }

        public a(K k2) {
            this.d = this;
            this.c = this;
            this.a = k2;
        }
    }

    public void a(K k2, V v) {
        a<K, V> aVar = this.f2534b.get(k2);
        if (aVar == null) {
            aVar = new a<>(k2);
            a<K, V> aVar2 = aVar.d;
            aVar2.c = aVar.c;
            aVar.c.d = aVar2;
            a<K, V> aVar3 = this.a;
            aVar.d = aVar3.d;
            aVar.c = aVar3;
            aVar3.d = aVar;
            aVar.d.c = aVar;
            this.f2534b.put(k2, aVar);
        } else {
            k2.a();
        }
        if (aVar.f2535b == null) {
            aVar.f2535b = new ArrayList();
        }
        aVar.f2535b.add(v);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        boolean z = false;
        for (a<K, V> aVar = this.a.c; !aVar.equals(this.a); aVar = aVar.c) {
            z = true;
            sb.append('{');
            sb.append(aVar.a);
            sb.append(':');
            List<V> list = aVar.f2535b;
            sb.append(list != null ? list.size() : 0);
            sb.append("}, ");
        }
        if (z) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }

    public V a(K k2) {
        a<K, V> aVar = this.f2534b.get(k2);
        if (aVar == null) {
            aVar = new a<>(k2);
            this.f2534b.put(k2, aVar);
        } else {
            k2.a();
        }
        a<K, V> aVar2 = aVar.d;
        aVar2.c = aVar.c;
        aVar.c.d = aVar2;
        a<K, V> aVar3 = this.a;
        aVar.d = aVar3;
        a<K, V> aVar4 = aVar3.c;
        aVar.c = aVar4;
        aVar4.d = aVar;
        aVar.d.c = aVar;
        return aVar.a();
    }

    public V a() {
        for (a<K, V> aVar = this.a.d; !aVar.equals(this.a); aVar = aVar.d) {
            V a2 = aVar.a();
            if (a2 != null) {
                return a2;
            }
            a<K, V> aVar2 = aVar.d;
            aVar2.c = aVar.c;
            aVar.c.d = aVar2;
            this.f2534b.remove(aVar.a);
            ((l) aVar.a).a();
        }
        return null;
    }
}
