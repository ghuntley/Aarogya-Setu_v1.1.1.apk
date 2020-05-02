package h.e;

import h.e.g;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: ArraySet */
public final class c<E> implements Collection<E>, Set<E> {

    /* renamed from: i  reason: collision with root package name */
    public static final int[] f1540i = new int[0];

    /* renamed from: j  reason: collision with root package name */
    public static final Object[] f1541j = new Object[0];

    /* renamed from: k  reason: collision with root package name */
    public static Object[] f1542k;

    /* renamed from: l  reason: collision with root package name */
    public static int f1543l;

    /* renamed from: m  reason: collision with root package name */
    public static Object[] f1544m;

    /* renamed from: n  reason: collision with root package name */
    public static int f1545n;
    public int[] e = f1540i;

    /* renamed from: f  reason: collision with root package name */
    public Object[] f1546f = f1541j;

    /* renamed from: g  reason: collision with root package name */
    public int f1547g = 0;

    /* renamed from: h  reason: collision with root package name */
    public g<E, E> f1548h;

    public final int a(Object obj, int i2) {
        int i3 = this.f1547g;
        if (i3 == 0) {
            return -1;
        }
        int a = d.a(this.e, i3, i2);
        if (a < 0 || obj.equals(this.f1546f[a])) {
            return a;
        }
        int i4 = a + 1;
        while (i4 < i3 && this.e[i4] == i2) {
            if (obj.equals(this.f1546f[i4])) {
                return i4;
            }
            i4++;
        }
        int i5 = a - 1;
        while (i5 >= 0 && this.e[i5] == i2) {
            if (obj.equals(this.f1546f[i5])) {
                return i5;
            }
            i5--;
        }
        return ~i4;
    }

    public boolean add(E e2) {
        int i2;
        int i3;
        if (e2 == null) {
            i3 = c();
            i2 = 0;
        } else {
            int hashCode = e2.hashCode();
            i2 = hashCode;
            i3 = a(e2, hashCode);
        }
        if (i3 >= 0) {
            return false;
        }
        int i4 = ~i3;
        int i5 = this.f1547g;
        if (i5 >= this.e.length) {
            int i6 = 4;
            if (i5 >= 8) {
                i6 = (i5 >> 1) + i5;
            } else if (i5 >= 4) {
                i6 = 8;
            }
            int[] iArr = this.e;
            Object[] objArr = this.f1546f;
            c(i6);
            int[] iArr2 = this.e;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f1546f, 0, objArr.length);
            }
            a(iArr, objArr, this.f1547g);
        }
        int i7 = this.f1547g;
        if (i4 < i7) {
            int[] iArr3 = this.e;
            int i8 = i4 + 1;
            System.arraycopy(iArr3, i4, iArr3, i8, i7 - i4);
            Object[] objArr2 = this.f1546f;
            System.arraycopy(objArr2, i4, objArr2, i8, this.f1547g - i4);
        }
        this.e[i4] = i2;
        this.f1546f[i4] = e2;
        this.f1547g++;
        return true;
    }

    public boolean addAll(Collection<? extends E> collection) {
        int size = collection.size() + this.f1547g;
        int[] iArr = this.e;
        boolean z = false;
        if (iArr.length < size) {
            Object[] objArr = this.f1546f;
            c(size);
            int i2 = this.f1547g;
            if (i2 > 0) {
                System.arraycopy(iArr, 0, this.e, 0, i2);
                System.arraycopy(objArr, 0, this.f1546f, 0, this.f1547g);
            }
            a(iArr, objArr, this.f1547g);
        }
        for (Object add : collection) {
            z |= add(add);
        }
        return z;
    }

    public final int c() {
        int i2 = this.f1547g;
        if (i2 == 0) {
            return -1;
        }
        int a = d.a(this.e, i2, 0);
        if (a < 0 || this.f1546f[a] == null) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.e[i3] == 0) {
            if (this.f1546f[i3] == null) {
                return i3;
            }
            i3++;
        }
        int i4 = a - 1;
        while (i4 >= 0 && this.e[i4] == 0) {
            if (this.f1546f[i4] == null) {
                return i4;
            }
            i4--;
        }
        return ~i3;
    }

    public void clear() {
        int i2 = this.f1547g;
        if (i2 != 0) {
            a(this.e, this.f1546f, i2);
            this.e = f1540i;
            this.f1546f = f1541j;
            this.f1547g = 0;
        }
    }

    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    public boolean containsAll(Collection<?> collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public E d(int i2) {
        E[] eArr = this.f1546f;
        E e2 = eArr[i2];
        int i3 = this.f1547g;
        if (i3 <= 1) {
            a(this.e, eArr, i3);
            this.e = f1540i;
            this.f1546f = f1541j;
            this.f1547g = 0;
        } else {
            int[] iArr = this.e;
            int i4 = 8;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                int i5 = this.f1547g - 1;
                this.f1547g = i5;
                if (i2 < i5) {
                    int[] iArr2 = this.e;
                    int i6 = i2 + 1;
                    System.arraycopy(iArr2, i6, iArr2, i2, i5 - i2);
                    Object[] objArr = this.f1546f;
                    System.arraycopy(objArr, i6, objArr, i2, this.f1547g - i2);
                }
                this.f1546f[this.f1547g] = null;
            } else {
                if (i3 > 8) {
                    i4 = i3 + (i3 >> 1);
                }
                int[] iArr3 = this.e;
                Object[] objArr2 = this.f1546f;
                c(i4);
                this.f1547g--;
                if (i2 > 0) {
                    System.arraycopy(iArr3, 0, this.e, 0, i2);
                    System.arraycopy(objArr2, 0, this.f1546f, 0, i2);
                }
                int i7 = this.f1547g;
                if (i2 < i7) {
                    int i8 = i2 + 1;
                    System.arraycopy(iArr3, i8, this.e, i2, i7 - i2);
                    System.arraycopy(objArr2, i8, this.f1546f, i2, this.f1547g - i2);
                }
            }
        }
        return e2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (this.f1547g != set.size()) {
                return false;
            }
            int i2 = 0;
            while (i2 < this.f1547g) {
                try {
                    if (!set.contains(this.f1546f[i2])) {
                        return false;
                    }
                    i2++;
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        int[] iArr = this.e;
        int i2 = this.f1547g;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += iArr[i4];
        }
        return i3;
    }

    public int indexOf(Object obj) {
        return obj == null ? c() : a(obj, obj.hashCode());
    }

    public boolean isEmpty() {
        return this.f1547g <= 0;
    }

    public Iterator<E> iterator() {
        if (this.f1548h == null) {
            this.f1548h = new b(this);
        }
        g<E, E> gVar = this.f1548h;
        if (gVar.f1557b == null) {
            gVar.f1557b = new g.c();
        }
        return gVar.f1557b.iterator();
    }

    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        d(indexOf);
        return true;
    }

    public boolean removeAll(Collection<?> collection) {
        boolean z = false;
        for (Object remove : collection) {
            z |= remove(remove);
        }
        return z;
    }

    public boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i2 = this.f1547g - 1; i2 >= 0; i2--) {
            if (!collection.contains(this.f1546f[i2])) {
                d(i2);
                z = true;
            }
        }
        return z;
    }

    public int size() {
        return this.f1547g;
    }

    public Object[] toArray() {
        int i2 = this.f1547g;
        Object[] objArr = new Object[i2];
        System.arraycopy(this.f1546f, 0, objArr, 0, i2);
        return objArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1547g * 14);
        sb.append('{');
        for (int i2 = 0; i2 < this.f1547g; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object obj = this.f1546f[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f1547g) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f1547g);
        }
        System.arraycopy(this.f1546f, 0, tArr, 0, this.f1547g);
        int length = tArr.length;
        int i2 = this.f1547g;
        if (length > i2) {
            tArr[i2] = null;
        }
        return tArr;
    }

    public static void a(int[] iArr, Object[] objArr, int i2) {
        if (iArr.length == 8) {
            synchronized (c.class) {
                if (f1545n < 10) {
                    objArr[0] = f1544m;
                    objArr[1] = iArr;
                    for (int i3 = i2 - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f1544m = objArr;
                    f1545n++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (c.class) {
                if (f1543l < 10) {
                    objArr[0] = f1542k;
                    objArr[1] = iArr;
                    for (int i4 = i2 - 1; i4 >= 2; i4--) {
                        objArr[i4] = null;
                    }
                    f1542k = objArr;
                    f1543l++;
                }
            }
        }
    }

    public final void c(int i2) {
        if (i2 == 8) {
            synchronized (c.class) {
                if (f1544m != null) {
                    Object[] objArr = f1544m;
                    this.f1546f = objArr;
                    f1544m = (Object[]) objArr[0];
                    this.e = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f1545n--;
                    return;
                }
            }
        } else if (i2 == 4) {
            synchronized (c.class) {
                if (f1542k != null) {
                    Object[] objArr2 = f1542k;
                    this.f1546f = objArr2;
                    f1542k = (Object[]) objArr2[0];
                    this.e = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f1543l--;
                    return;
                }
            }
        }
        this.e = new int[i2];
        this.f1546f = new Object[i2];
    }
}
