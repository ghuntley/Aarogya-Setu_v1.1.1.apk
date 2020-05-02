package h.c.a.b;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: SafeIterableMap */
public class b<K, V> implements Iterable<Map.Entry<K, V>> {
    public c<K, V> e;

    /* renamed from: f  reason: collision with root package name */
    public c<K, V> f1524f;

    /* renamed from: g  reason: collision with root package name */
    public WeakHashMap<f<K, V>, Boolean> f1525g = new WeakHashMap<>();

    /* renamed from: h  reason: collision with root package name */
    public int f1526h = 0;

    /* compiled from: SafeIterableMap */
    public static class a<K, V> extends e<K, V> {
        public a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        public c<K, V> b(c<K, V> cVar) {
            return cVar.f1529h;
        }

        public c<K, V> c(c<K, V> cVar) {
            return cVar.f1528g;
        }
    }

    /* renamed from: h.c.a.b.b$b  reason: collision with other inner class name */
    /* compiled from: SafeIterableMap */
    public static class C0040b<K, V> extends e<K, V> {
        public C0040b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        public c<K, V> b(c<K, V> cVar) {
            return cVar.f1528g;
        }

        public c<K, V> c(c<K, V> cVar) {
            return cVar.f1529h;
        }
    }

    /* compiled from: SafeIterableMap */
    public static class c<K, V> implements Map.Entry<K, V> {
        public final K e;

        /* renamed from: f  reason: collision with root package name */
        public final V f1527f;

        /* renamed from: g  reason: collision with root package name */
        public c<K, V> f1528g;

        /* renamed from: h  reason: collision with root package name */
        public c<K, V> f1529h;

        public c(K k2, V v) {
            this.e = k2;
            this.f1527f = v;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (!this.e.equals(cVar.e) || !this.f1527f.equals(cVar.f1527f)) {
                return false;
            }
            return true;
        }

        public K getKey() {
            return this.e;
        }

        public V getValue() {
            return this.f1527f;
        }

        public int hashCode() {
            return this.e.hashCode() ^ this.f1527f.hashCode();
        }

        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.e + "=" + this.f1527f;
        }
    }

    /* compiled from: SafeIterableMap */
    public class d implements Iterator<Map.Entry<K, V>>, f<K, V> {
        public c<K, V> e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f1530f = true;

        public d() {
        }

        public void a(c<K, V> cVar) {
            c<K, V> cVar2 = this.e;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.f1529h;
                this.e = cVar3;
                this.f1530f = cVar3 == null;
            }
        }

        public boolean hasNext() {
            if (!this.f1530f) {
                c<K, V> cVar = this.e;
                if (cVar == null || cVar.f1528g == null) {
                    return false;
                }
                return true;
            } else if (b.this.e != null) {
                return true;
            } else {
                return false;
            }
        }

        public Object next() {
            if (this.f1530f) {
                this.f1530f = false;
                this.e = b.this.e;
            } else {
                c<K, V> cVar = this.e;
                this.e = cVar != null ? cVar.f1528g : null;
            }
            return this.e;
        }
    }

    /* compiled from: SafeIterableMap */
    public static abstract class e<K, V> implements Iterator<Map.Entry<K, V>>, f<K, V> {
        public c<K, V> e;

        /* renamed from: f  reason: collision with root package name */
        public c<K, V> f1532f;

        public e(c<K, V> cVar, c<K, V> cVar2) {
            this.e = cVar2;
            this.f1532f = cVar;
        }

        public void a(c<K, V> cVar) {
            c<K, V> cVar2 = null;
            if (this.e == cVar && cVar == this.f1532f) {
                this.f1532f = null;
                this.e = null;
            }
            c<K, V> cVar3 = this.e;
            if (cVar3 == cVar) {
                this.e = b(cVar3);
            }
            c<K, V> cVar4 = this.f1532f;
            if (cVar4 == cVar) {
                c<K, V> cVar5 = this.e;
                if (!(cVar4 == cVar5 || cVar5 == null)) {
                    cVar2 = c(cVar4);
                }
                this.f1532f = cVar2;
            }
        }

        public abstract c<K, V> b(c<K, V> cVar);

        public abstract c<K, V> c(c<K, V> cVar);

        public boolean hasNext() {
            return this.f1532f != null;
        }

        public Object next() {
            c<K, V> cVar = this.f1532f;
            c<K, V> cVar2 = this.e;
            this.f1532f = (cVar == cVar2 || cVar2 == null) ? null : c(cVar);
            return cVar;
        }
    }

    /* compiled from: SafeIterableMap */
    public interface f<K, V> {
        void a(c<K, V> cVar);
    }

    public c<K, V> a(K k2) {
        c<K, V> cVar = this.e;
        while (cVar != null && !cVar.e.equals(k2)) {
            cVar = cVar.f1528g;
        }
        return cVar;
    }

    public V b(K k2, V v) {
        c a2 = a(k2);
        if (a2 != null) {
            return a2.f1527f;
        }
        a(k2, v);
        return null;
    }

    public b<K, V>.defpackage.d c() {
        b<K, V>.defpackage.d dVar = new d();
        this.f1525g.put(dVar, false);
        return dVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0048, code lost:
        if (r3.hasNext() != false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0050, code lost:
        if (((h.c.a.b.b.e) r7).hasNext() != false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0053, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r7 instanceof h.c.a.b.b
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            h.c.a.b.b r7 = (h.c.a.b.b) r7
            int r1 = r6.f1526h
            int r3 = r7.f1526h
            if (r1 == r3) goto L_0x0013
            return r2
        L_0x0013:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L_0x001b:
            r3 = r1
            h.c.a.b.b$e r3 = (h.c.a.b.b.e) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0044
            r4 = r7
            h.c.a.b.b$e r4 = (h.c.a.b.b.e) r4
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0044
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r4.next()
            if (r3 != 0) goto L_0x003b
            if (r4 != 0) goto L_0x0043
        L_0x003b:
            if (r3 == 0) goto L_0x001b
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x001b
        L_0x0043:
            return r2
        L_0x0044:
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L_0x0053
            h.c.a.b.b$e r7 = (h.c.a.b.b.e) r7
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L_0x0053
            goto L_0x0054
        L_0x0053:
            r0 = 0
        L_0x0054:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h.c.a.b.b.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        Iterator it = iterator();
        int i2 = 0;
        while (true) {
            e eVar = (e) it;
            if (!eVar.hasNext()) {
                return i2;
            }
            i2 += ((Map.Entry) eVar.next()).hashCode();
        }
    }

    public Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.e, this.f1524f);
        this.f1525g.put(aVar, false);
        return aVar;
    }

    public V remove(K k2) {
        c a2 = a(k2);
        if (a2 == null) {
            return null;
        }
        this.f1526h--;
        if (!this.f1525g.isEmpty()) {
            for (f<K, V> a3 : this.f1525g.keySet()) {
                a3.a(a2);
            }
        }
        c<K, V> cVar = a2.f1529h;
        if (cVar != null) {
            cVar.f1528g = a2.f1528g;
        } else {
            this.e = a2.f1528g;
        }
        c<K, V> cVar2 = a2.f1528g;
        if (cVar2 != null) {
            cVar2.f1529h = a2.f1529h;
        } else {
            this.f1524f = a2.f1529h;
        }
        a2.f1528g = null;
        a2.f1529h = null;
        return a2.f1527f;
    }

    public String toString() {
        StringBuilder a2 = i.a.a.a.a.a("[");
        Iterator it = iterator();
        while (true) {
            e eVar = (e) it;
            if (eVar.hasNext()) {
                a2.append(((Map.Entry) eVar.next()).toString());
                if (eVar.hasNext()) {
                    a2.append(", ");
                }
            } else {
                a2.append("]");
                return a2.toString();
            }
        }
    }

    public c<K, V> a(K k2, V v) {
        c<K, V> cVar = new c<>(k2, v);
        this.f1526h++;
        c<K, V> cVar2 = this.f1524f;
        if (cVar2 == null) {
            this.e = cVar;
            this.f1524f = cVar;
            return cVar;
        }
        cVar2.f1528g = cVar;
        cVar.f1529h = cVar2;
        this.f1524f = cVar;
        return cVar;
    }
}
