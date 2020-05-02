package i.c.e.t;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: LinkedTreeMap */
public final class r<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: l  reason: collision with root package name */
    public static final Comparator<Comparable> f4872l = new a();
    public Comparator<? super K> e;

    /* renamed from: f  reason: collision with root package name */
    public e<K, V> f4873f;

    /* renamed from: g  reason: collision with root package name */
    public int f4874g = 0;

    /* renamed from: h  reason: collision with root package name */
    public int f4875h = 0;

    /* renamed from: i  reason: collision with root package name */
    public final e<K, V> f4876i = new e<>();

    /* renamed from: j  reason: collision with root package name */
    public r<K, V>.b f4877j;

    /* renamed from: k  reason: collision with root package name */
    public r<K, V>.defpackage.c f4878k;

    /* compiled from: LinkedTreeMap */
    public class a implements Comparator<Comparable> {
        public int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo((Comparable) obj2);
        }
    }

    /* compiled from: LinkedTreeMap */
    public class b extends AbstractSet<Map.Entry<K, V>> {

        /* compiled from: LinkedTreeMap */
        public class a extends r<K, V>.defpackage.d<Map.Entry<K, V>> {
            public a(b bVar) {
                super();
            }

            public Object next() {
                return b();
            }
        }

        public b() {
        }

        public void clear() {
            r.this.clear();
        }

        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && r.this.a((Map.Entry<?, ?>) (Map.Entry) obj) != null;
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new a(this);
        }

        public boolean remove(Object obj) {
            e a2;
            if (!(obj instanceof Map.Entry) || (a2 = r.this.a((Map.Entry<?, ?>) (Map.Entry) obj)) == null) {
                return false;
            }
            r.this.b(a2, true);
            return true;
        }

        public int size() {
            return r.this.f4874g;
        }
    }

    /* compiled from: LinkedTreeMap */
    public final class c extends AbstractSet<K> {

        /* compiled from: LinkedTreeMap */
        public class a extends r<K, V>.defpackage.d<K> {
            public a(c cVar) {
                super();
            }

            public K next() {
                return b().f4886j;
            }
        }

        public c() {
        }

        public void clear() {
            r.this.clear();
        }

        public boolean contains(Object obj) {
            return r.this.a(obj) != null;
        }

        public Iterator<K> iterator() {
            return new a(this);
        }

        public boolean remove(Object obj) {
            r rVar = r.this;
            e a2 = rVar.a(obj);
            if (a2 != null) {
                rVar.b(a2, true);
            }
            if (a2 != null) {
                return true;
            }
            return false;
        }

        public int size() {
            return r.this.f4874g;
        }
    }

    /* compiled from: LinkedTreeMap */
    public abstract class d<T> implements Iterator<T> {
        public e<K, V> e;

        /* renamed from: f  reason: collision with root package name */
        public e<K, V> f4879f = null;

        /* renamed from: g  reason: collision with root package name */
        public int f4880g;

        public d() {
            r rVar = r.this;
            this.e = rVar.f4876i.f4884h;
            this.f4880g = rVar.f4875h;
        }

        public final e<K, V> b() {
            e<K, V> eVar = this.e;
            r rVar = r.this;
            if (eVar == rVar.f4876i) {
                throw new NoSuchElementException();
            } else if (rVar.f4875h == this.f4880g) {
                this.e = eVar.f4884h;
                this.f4879f = eVar;
                return eVar;
            } else {
                throw new ConcurrentModificationException();
            }
        }

        public final boolean hasNext() {
            return this.e != r.this.f4876i;
        }

        public final void remove() {
            e<K, V> eVar = this.f4879f;
            if (eVar != null) {
                r.this.b(eVar, true);
                this.f4879f = null;
                this.f4880g = r.this.f4875h;
                return;
            }
            throw new IllegalStateException();
        }
    }

    static {
        Class<r> cls = r.class;
    }

    public r() {
        Comparator<Comparable> comparator = f4872l;
        this.e = comparator == null ? f4872l : comparator;
    }

    public e<K, V> a(K k2, boolean z) {
        int i2;
        e<K, V> eVar;
        Comparator<? super K> comparator = this.e;
        e<K, V> eVar2 = this.f4873f;
        if (eVar2 != null) {
            Comparable comparable = comparator == f4872l ? (Comparable) k2 : null;
            while (true) {
                if (comparable != null) {
                    i2 = comparable.compareTo(eVar2.f4886j);
                } else {
                    i2 = comparator.compare(k2, eVar2.f4886j);
                }
                if (i2 == 0) {
                    return eVar2;
                }
                e<K, V> eVar3 = i2 < 0 ? eVar2.f4882f : eVar2.f4883g;
                if (eVar3 == null) {
                    break;
                }
                eVar2 = eVar3;
            }
        } else {
            i2 = 0;
        }
        if (!z) {
            return null;
        }
        e<K, V> eVar4 = this.f4876i;
        if (eVar2 != null) {
            eVar = new e<>(eVar2, k2, eVar4, eVar4.f4885i);
            if (i2 < 0) {
                eVar2.f4882f = eVar;
            } else {
                eVar2.f4883g = eVar;
            }
            a(eVar2, true);
        } else if (comparator != f4872l || (k2 instanceof Comparable)) {
            eVar = new e<>(eVar2, k2, eVar4, eVar4.f4885i);
            this.f4873f = eVar;
        } else {
            throw new ClassCastException(k2.getClass().getName() + " is not Comparable");
        }
        this.f4874g++;
        this.f4875h++;
        return eVar;
    }

    public void b(e<K, V> eVar, boolean z) {
        e<K, V> eVar2;
        int i2;
        e<K, V> eVar3;
        if (z) {
            e<K, V> eVar4 = eVar.f4885i;
            eVar4.f4884h = eVar.f4884h;
            eVar.f4884h.f4885i = eVar4;
        }
        e<K, V> eVar5 = eVar.f4882f;
        e<K, V> eVar6 = eVar.f4883g;
        e<K, V> eVar7 = eVar.e;
        int i3 = 0;
        if (eVar5 == null || eVar6 == null) {
            if (eVar5 != null) {
                a(eVar, eVar5);
                eVar.f4882f = null;
            } else if (eVar6 != null) {
                a(eVar, eVar6);
                eVar.f4883g = null;
            } else {
                a(eVar, (e<K, V>) null);
            }
            a(eVar7, false);
            this.f4874g--;
            this.f4875h++;
            return;
        }
        if (eVar5.f4888l > eVar6.f4888l) {
            e<K, V> eVar8 = eVar5.f4883g;
            while (true) {
                e<K, V> eVar9 = eVar8;
                eVar2 = eVar5;
                eVar5 = eVar9;
                if (eVar5 == null) {
                    break;
                }
                eVar8 = eVar5.f4883g;
            }
        } else {
            e<K, V> eVar10 = eVar6.f4882f;
            while (true) {
                e<K, V> eVar11 = eVar6;
                eVar6 = eVar10;
                eVar3 = eVar11;
                if (eVar6 == null) {
                    break;
                }
                eVar10 = eVar6.f4882f;
            }
            eVar2 = eVar3;
        }
        b(eVar2, false);
        e<K, V> eVar12 = eVar.f4882f;
        if (eVar12 != null) {
            i2 = eVar12.f4888l;
            eVar2.f4882f = eVar12;
            eVar12.e = eVar2;
            eVar.f4882f = null;
        } else {
            i2 = 0;
        }
        e<K, V> eVar13 = eVar.f4883g;
        if (eVar13 != null) {
            i3 = eVar13.f4888l;
            eVar2.f4883g = eVar13;
            eVar13.e = eVar2;
            eVar.f4883g = null;
        }
        eVar2.f4888l = Math.max(i2, i3) + 1;
        a(eVar, eVar2);
    }

    public void clear() {
        this.f4873f = null;
        this.f4874g = 0;
        this.f4875h++;
        e<K, V> eVar = this.f4876i;
        eVar.f4885i = eVar;
        eVar.f4884h = eVar;
    }

    public boolean containsKey(Object obj) {
        return a(obj) != null;
    }

    public Set<Map.Entry<K, V>> entrySet() {
        r<K, V>.b bVar = this.f4877j;
        if (bVar != null) {
            return bVar;
        }
        r<K, V>.b bVar2 = new b();
        this.f4877j = bVar2;
        return bVar2;
    }

    public V get(Object obj) {
        e a2 = a(obj);
        if (a2 != null) {
            return a2.f4887k;
        }
        return null;
    }

    public Set<K> keySet() {
        r<K, V>.defpackage.c cVar = this.f4878k;
        if (cVar != null) {
            return cVar;
        }
        r<K, V>.defpackage.c cVar2 = new c();
        this.f4878k = cVar2;
        return cVar2;
    }

    public V put(K k2, V v) {
        if (k2 != null) {
            e a2 = a(k2, true);
            V v2 = a2.f4887k;
            a2.f4887k = v;
            return v2;
        }
        throw new NullPointerException("key == null");
    }

    public V remove(Object obj) {
        e a2 = a(obj);
        if (a2 != null) {
            b(a2, true);
        }
        if (a2 != null) {
            return a2.f4887k;
        }
        return null;
    }

    public int size() {
        return this.f4874g;
    }

    /* compiled from: LinkedTreeMap */
    public static final class e<K, V> implements Map.Entry<K, V> {
        public e<K, V> e;

        /* renamed from: f  reason: collision with root package name */
        public e<K, V> f4882f;

        /* renamed from: g  reason: collision with root package name */
        public e<K, V> f4883g;

        /* renamed from: h  reason: collision with root package name */
        public e<K, V> f4884h;

        /* renamed from: i  reason: collision with root package name */
        public e<K, V> f4885i;

        /* renamed from: j  reason: collision with root package name */
        public final K f4886j;

        /* renamed from: k  reason: collision with root package name */
        public V f4887k;

        /* renamed from: l  reason: collision with root package name */
        public int f4888l;

        public e() {
            this.f4886j = null;
            this.f4885i = this;
            this.f4884h = this;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0031 A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r4) {
            /*
                r3 = this;
                boolean r0 = r4 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 == 0) goto L_0x0032
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                K r0 = r3.f4886j
                if (r0 != 0) goto L_0x0012
                java.lang.Object r0 = r4.getKey()
                if (r0 != 0) goto L_0x0032
                goto L_0x001c
            L_0x0012:
                java.lang.Object r2 = r4.getKey()
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x0032
            L_0x001c:
                V r0 = r3.f4887k
                if (r0 != 0) goto L_0x0027
                java.lang.Object r4 = r4.getValue()
                if (r4 != 0) goto L_0x0032
                goto L_0x0031
            L_0x0027:
                java.lang.Object r4 = r4.getValue()
                boolean r4 = r0.equals(r4)
                if (r4 == 0) goto L_0x0032
            L_0x0031:
                r1 = 1
            L_0x0032:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: i.c.e.t.r.e.equals(java.lang.Object):boolean");
        }

        public K getKey() {
            return this.f4886j;
        }

        public V getValue() {
            return this.f4887k;
        }

        public int hashCode() {
            K k2 = this.f4886j;
            int i2 = 0;
            int hashCode = k2 == null ? 0 : k2.hashCode();
            V v = this.f4887k;
            if (v != null) {
                i2 = v.hashCode();
            }
            return hashCode ^ i2;
        }

        public V setValue(V v) {
            V v2 = this.f4887k;
            this.f4887k = v;
            return v2;
        }

        public String toString() {
            return this.f4886j + "=" + this.f4887k;
        }

        public e(e<K, V> eVar, K k2, e<K, V> eVar2, e<K, V> eVar3) {
            this.e = eVar;
            this.f4886j = k2;
            this.f4888l = 1;
            this.f4884h = eVar2;
            this.f4885i = eVar3;
            eVar3.f4884h = this;
            eVar2.f4885i = this;
        }
    }

    public e<K, V> a(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return a(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        if ((r3 == r5 || (r3 != null && r3.equals(r5))) != false) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i.c.e.t.r.e<K, V> a(java.util.Map.Entry<?, ?> r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r5.getKey()
            i.c.e.t.r$e r0 = r4.a((java.lang.Object) r0)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0023
            V r3 = r0.f4887k
            java.lang.Object r5 = r5.getValue()
            if (r3 == r5) goto L_0x001f
            if (r3 == 0) goto L_0x001d
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r5 = 0
            goto L_0x0020
        L_0x001f:
            r5 = 1
        L_0x0020:
            if (r5 == 0) goto L_0x0023
            goto L_0x0024
        L_0x0023:
            r1 = 0
        L_0x0024:
            if (r1 == 0) goto L_0x0027
            goto L_0x0028
        L_0x0027:
            r0 = 0
        L_0x0028:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.e.t.r.a(java.util.Map$Entry):i.c.e.t.r$e");
    }

    public final void a(e<K, V> eVar, e<K, V> eVar2) {
        e<K, V> eVar3 = eVar.e;
        eVar.e = null;
        if (eVar2 != null) {
            eVar2.e = eVar3;
        }
        if (eVar3 == null) {
            this.f4873f = eVar2;
        } else if (eVar3.f4882f == eVar) {
            eVar3.f4882f = eVar2;
        } else {
            eVar3.f4883g = eVar2;
        }
    }

    public final void a(e<K, V> eVar, boolean z) {
        while (eVar != null) {
            e<K, V> eVar2 = eVar.f4882f;
            e<K, V> eVar3 = eVar.f4883g;
            int i2 = 0;
            int i3 = eVar2 != null ? eVar2.f4888l : 0;
            int i4 = eVar3 != null ? eVar3.f4888l : 0;
            int i5 = i3 - i4;
            if (i5 == -2) {
                e<K, V> eVar4 = eVar3.f4882f;
                e<K, V> eVar5 = eVar3.f4883g;
                int i6 = eVar5 != null ? eVar5.f4888l : 0;
                if (eVar4 != null) {
                    i2 = eVar4.f4888l;
                }
                int i7 = i2 - i6;
                if (i7 == -1 || (i7 == 0 && !z)) {
                    a(eVar);
                } else {
                    b(eVar3);
                    a(eVar);
                }
                if (z) {
                    return;
                }
            } else if (i5 == 2) {
                e<K, V> eVar6 = eVar2.f4882f;
                e<K, V> eVar7 = eVar2.f4883g;
                int i8 = eVar7 != null ? eVar7.f4888l : 0;
                if (eVar6 != null) {
                    i2 = eVar6.f4888l;
                }
                int i9 = i2 - i8;
                if (i9 == 1 || (i9 == 0 && !z)) {
                    b(eVar);
                } else {
                    a(eVar2);
                    b(eVar);
                }
                if (z) {
                    return;
                }
            } else if (i5 == 0) {
                eVar.f4888l = i3 + 1;
                if (z) {
                    return;
                }
            } else {
                eVar.f4888l = Math.max(i3, i4) + 1;
                if (!z) {
                    return;
                }
            }
            eVar = eVar.e;
        }
    }

    public final void b(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f4882f;
        e<K, V> eVar3 = eVar.f4883g;
        e<K, V> eVar4 = eVar2.f4882f;
        e<K, V> eVar5 = eVar2.f4883g;
        eVar.f4882f = eVar5;
        if (eVar5 != null) {
            eVar5.e = eVar;
        }
        a(eVar, eVar2);
        eVar2.f4883g = eVar;
        eVar.e = eVar2;
        int i2 = 0;
        int max = Math.max(eVar3 != null ? eVar3.f4888l : 0, eVar5 != null ? eVar5.f4888l : 0) + 1;
        eVar.f4888l = max;
        if (eVar4 != null) {
            i2 = eVar4.f4888l;
        }
        eVar2.f4888l = Math.max(max, i2) + 1;
    }

    public final void a(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f4882f;
        e<K, V> eVar3 = eVar.f4883g;
        e<K, V> eVar4 = eVar3.f4882f;
        e<K, V> eVar5 = eVar3.f4883g;
        eVar.f4883g = eVar4;
        if (eVar4 != null) {
            eVar4.e = eVar;
        }
        a(eVar, eVar3);
        eVar3.f4882f = eVar;
        eVar.e = eVar3;
        int i2 = 0;
        int max = Math.max(eVar2 != null ? eVar2.f4888l : 0, eVar4 != null ? eVar4.f4888l : 0) + 1;
        eVar.f4888l = max;
        if (eVar5 != null) {
            i2 = eVar5.f4888l;
        }
        eVar3.f4888l = Math.max(max, i2) + 1;
    }
}
