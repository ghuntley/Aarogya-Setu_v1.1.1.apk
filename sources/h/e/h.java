package h.e;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* compiled from: SimpleArrayMap */
public class h<K, V> {

    /* renamed from: h  reason: collision with root package name */
    public static Object[] f1565h;

    /* renamed from: i  reason: collision with root package name */
    public static int f1566i;

    /* renamed from: j  reason: collision with root package name */
    public static Object[] f1567j;

    /* renamed from: k  reason: collision with root package name */
    public static int f1568k;
    public int[] e;

    /* renamed from: f  reason: collision with root package name */
    public Object[] f1569f;

    /* renamed from: g  reason: collision with root package name */
    public int f1570g;

    public h() {
        this.e = d.a;
        this.f1569f = d.c;
        this.f1570g = 0;
    }

    public int a(Object obj, int i2) {
        int i3 = this.f1570g;
        if (i3 == 0) {
            return -1;
        }
        try {
            int a = d.a(this.e, i3, i2);
            if (a < 0 || obj.equals(this.f1569f[a << 1])) {
                return a;
            }
            int i4 = a + 1;
            while (i4 < i3 && this.e[i4] == i2) {
                if (obj.equals(this.f1569f[i4 << 1])) {
                    return i4;
                }
                i4++;
            }
            int i5 = a - 1;
            while (i5 >= 0 && this.e[i5] == i2) {
                if (obj.equals(this.f1569f[i5 << 1])) {
                    return i5;
                }
                i5--;
            }
            return ~i4;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public void b(int i2) {
        int i3 = this.f1570g;
        int[] iArr = this.e;
        if (iArr.length < i2) {
            Object[] objArr = this.f1569f;
            a(i2);
            if (this.f1570g > 0) {
                System.arraycopy(iArr, 0, this.e, 0, i3);
                System.arraycopy(objArr, 0, this.f1569f, 0, i3 << 1);
            }
            a(iArr, objArr, i3);
        }
        if (this.f1570g != i3) {
            throw new ConcurrentModificationException();
        }
    }

    public K c(int i2) {
        return this.f1569f[i2 << 1];
    }

    public void clear() {
        int i2 = this.f1570g;
        if (i2 > 0) {
            int[] iArr = this.e;
            Object[] objArr = this.f1569f;
            this.e = d.a;
            this.f1569f = d.c;
            this.f1570g = 0;
            a(iArr, objArr, i2);
        }
        if (this.f1570g > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return a(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return b(obj) >= 0;
    }

    public V d(int i2) {
        V[] vArr = this.f1569f;
        int i3 = i2 << 1;
        V v = vArr[i3 + 1];
        int i4 = this.f1570g;
        int i5 = 0;
        if (i4 <= 1) {
            a(this.e, vArr, i4);
            this.e = d.a;
            this.f1569f = d.c;
        } else {
            int i6 = i4 - 1;
            int[] iArr = this.e;
            int i7 = 8;
            if (iArr.length <= 8 || i4 >= iArr.length / 3) {
                if (i2 < i6) {
                    int[] iArr2 = this.e;
                    int i8 = i2 + 1;
                    int i9 = i6 - i2;
                    System.arraycopy(iArr2, i8, iArr2, i2, i9);
                    Object[] objArr = this.f1569f;
                    System.arraycopy(objArr, i8 << 1, objArr, i3, i9 << 1);
                }
                Object[] objArr2 = this.f1569f;
                int i10 = i6 << 1;
                objArr2[i10] = null;
                objArr2[i10 + 1] = null;
            } else {
                if (i4 > 8) {
                    i7 = i4 + (i4 >> 1);
                }
                int[] iArr3 = this.e;
                Object[] objArr3 = this.f1569f;
                a(i7);
                if (i4 == this.f1570g) {
                    if (i2 > 0) {
                        System.arraycopy(iArr3, 0, this.e, 0, i2);
                        System.arraycopy(objArr3, 0, this.f1569f, 0, i3);
                    }
                    if (i2 < i6) {
                        int i11 = i2 + 1;
                        int i12 = i6 - i2;
                        System.arraycopy(iArr3, i11, this.e, i2, i12);
                        System.arraycopy(objArr3, i11 << 1, this.f1569f, i3, i12 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            }
            i5 = i6;
        }
        if (i4 == this.f1570g) {
            this.f1570g = i5;
            return v;
        }
        throw new ConcurrentModificationException();
    }

    public V e(int i2) {
        return this.f1569f[(i2 << 1) + 1];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (this.f1570g != hVar.f1570g) {
                return false;
            }
            int i2 = 0;
            while (i2 < this.f1570g) {
                try {
                    Object c = c(i2);
                    Object e2 = e(i2);
                    Object obj2 = hVar.get(c);
                    if (e2 == null) {
                        if (obj2 != null || !hVar.containsKey(c)) {
                            return false;
                        }
                    } else if (!e2.equals(obj2)) {
                        return false;
                    }
                    i2++;
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.f1570g != map.size()) {
                return false;
            }
            int i3 = 0;
            while (i3 < this.f1570g) {
                try {
                    Object c2 = c(i3);
                    Object e3 = e(i3);
                    Object obj3 = map.get(c2);
                    if (e3 == null) {
                        if (obj3 != null || !map.containsKey(c2)) {
                            return false;
                        }
                    } else if (!e3.equals(obj3)) {
                        return false;
                    }
                    i3++;
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public V get(Object obj) {
        return getOrDefault(obj, (Object) null);
    }

    public V getOrDefault(Object obj, V v) {
        int a = a(obj);
        return a >= 0 ? this.f1569f[(a << 1) + 1] : v;
    }

    public int hashCode() {
        int[] iArr = this.e;
        Object[] objArr = this.f1569f;
        int i2 = this.f1570g;
        int i3 = 1;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            Object obj = objArr[i3];
            i5 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i4];
            i4++;
            i3 += 2;
        }
        return i5;
    }

    public boolean isEmpty() {
        return this.f1570g <= 0;
    }

    public V put(K k2, V v) {
        int i2;
        int i3;
        int i4 = this.f1570g;
        if (k2 == null) {
            i3 = a();
            i2 = 0;
        } else {
            int hashCode = k2.hashCode();
            i2 = hashCode;
            i3 = a((Object) k2, hashCode);
        }
        if (i3 >= 0) {
            int i5 = (i3 << 1) + 1;
            V[] vArr = this.f1569f;
            V v2 = vArr[i5];
            vArr[i5] = v;
            return v2;
        }
        int i6 = ~i3;
        if (i4 >= this.e.length) {
            int i7 = 4;
            if (i4 >= 8) {
                i7 = (i4 >> 1) + i4;
            } else if (i4 >= 4) {
                i7 = 8;
            }
            int[] iArr = this.e;
            Object[] objArr = this.f1569f;
            a(i7);
            if (i4 == this.f1570g) {
                int[] iArr2 = this.e;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr, 0, this.f1569f, 0, objArr.length);
                }
                a(iArr, objArr, i4);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i6 < i4) {
            int[] iArr3 = this.e;
            int i8 = i6 + 1;
            System.arraycopy(iArr3, i6, iArr3, i8, i4 - i6);
            Object[] objArr2 = this.f1569f;
            System.arraycopy(objArr2, i6 << 1, objArr2, i8 << 1, (this.f1570g - i6) << 1);
        }
        int i9 = this.f1570g;
        if (i4 == i9) {
            int[] iArr4 = this.e;
            if (i6 < iArr4.length) {
                iArr4[i6] = i2;
                Object[] objArr3 = this.f1569f;
                int i10 = i6 << 1;
                objArr3[i10] = k2;
                objArr3[i10 + 1] = v;
                this.f1570g = i9 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V putIfAbsent(K k2, V v) {
        V orDefault = getOrDefault(k2, (Object) null);
        return orDefault == null ? put(k2, v) : orDefault;
    }

    public V remove(Object obj) {
        int a = a(obj);
        if (a >= 0) {
            return d(a);
        }
        return null;
    }

    public V replace(K k2, V v) {
        int a = a((Object) k2);
        if (a >= 0) {
            return a(a, v);
        }
        return null;
    }

    public int size() {
        return this.f1570g;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1570g * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.f1570g; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object c = c(i2);
            if (c != this) {
                sb.append(c);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object e2 = e(i2);
            if (e2 != this) {
                sb.append(e2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public boolean remove(Object obj, Object obj2) {
        int a = a(obj);
        if (a < 0) {
            return false;
        }
        Object e2 = e(a);
        if (obj2 != e2 && (obj2 == null || !obj2.equals(e2))) {
            return false;
        }
        d(a);
        return true;
    }

    public boolean replace(K k2, V v, V v2) {
        int a = a((Object) k2);
        if (a < 0) {
            return false;
        }
        V e2 = e(a);
        if (e2 != v && (v == null || !v.equals(e2))) {
            return false;
        }
        a(a, v2);
        return true;
    }

    public h(int i2) {
        if (i2 == 0) {
            this.e = d.a;
            this.f1569f = d.c;
        } else {
            a(i2);
        }
        this.f1570g = 0;
    }

    public int a() {
        int i2 = this.f1570g;
        if (i2 == 0) {
            return -1;
        }
        try {
            int a = d.a(this.e, i2, 0);
            if (a < 0 || this.f1569f[a << 1] == null) {
                return a;
            }
            int i3 = a + 1;
            while (i3 < i2 && this.e[i3] == 0) {
                if (this.f1569f[i3 << 1] == null) {
                    return i3;
                }
                i3++;
            }
            int i4 = a - 1;
            while (i4 >= 0 && this.e[i4] == 0) {
                if (this.f1569f[i4 << 1] == null) {
                    return i4;
                }
                i4--;
            }
            return ~i3;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public int b(Object obj) {
        int i2 = this.f1570g * 2;
        Object[] objArr = this.f1569f;
        if (obj == null) {
            for (int i3 = 1; i3 < i2; i3 += 2) {
                if (objArr[i3] == null) {
                    return i3 >> 1;
                }
            }
            return -1;
        }
        for (int i4 = 1; i4 < i2; i4 += 2) {
            if (obj.equals(objArr[i4])) {
                return i4 >> 1;
            }
        }
        return -1;
    }

    public final void a(int i2) {
        Class<h> cls = h.class;
        if (i2 == 8) {
            synchronized (cls) {
                if (f1567j != null) {
                    Object[] objArr = f1567j;
                    this.f1569f = objArr;
                    f1567j = (Object[]) objArr[0];
                    this.e = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f1568k--;
                    return;
                }
            }
        } else if (i2 == 4) {
            synchronized (cls) {
                if (f1565h != null) {
                    Object[] objArr2 = f1565h;
                    this.f1569f = objArr2;
                    f1565h = (Object[]) objArr2[0];
                    this.e = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f1566i--;
                    return;
                }
            }
        }
        this.e = new int[i2];
        this.f1569f = new Object[(i2 << 1)];
    }

    public static void a(int[] iArr, Object[] objArr, int i2) {
        Class<h> cls = h.class;
        if (iArr.length == 8) {
            synchronized (cls) {
                if (f1568k < 10) {
                    objArr[0] = f1567j;
                    objArr[1] = iArr;
                    for (int i3 = (i2 << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f1567j = objArr;
                    f1568k++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (cls) {
                if (f1566i < 10) {
                    objArr[0] = f1565h;
                    objArr[1] = iArr;
                    for (int i4 = (i2 << 1) - 1; i4 >= 2; i4--) {
                        objArr[i4] = null;
                    }
                    f1565h = objArr;
                    f1566i++;
                }
            }
        }
    }

    public int a(Object obj) {
        return obj == null ? a() : a(obj, obj.hashCode());
    }

    public V a(int i2, V v) {
        int i3 = (i2 << 1) + 1;
        V[] vArr = this.f1569f;
        V v2 = vArr[i3];
        vArr[i3] = v;
        return v2;
    }

    public void a(h<? extends K, ? extends V> hVar) {
        int i2 = hVar.f1570g;
        b(this.f1570g + i2);
        if (this.f1570g != 0) {
            for (int i3 = 0; i3 < i2; i3++) {
                put(hVar.c(i3), hVar.e(i3));
            }
        } else if (i2 > 0) {
            System.arraycopy(hVar.e, 0, this.e, 0, i2);
            System.arraycopy(hVar.f1569f, 0, this.f1569f, 0, i2 << 1);
            this.f1570g = i2;
        }
    }
}
