package i.c.a.b.g.g;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.3.0 */
public final class z3 extends p2<Integer> implements b4, q5, RandomAccess {

    /* renamed from: h  reason: collision with root package name */
    public static final z3 f3548h;

    /* renamed from: f  reason: collision with root package name */
    public int[] f3549f;

    /* renamed from: g  reason: collision with root package name */
    public int f3550g;

    static {
        z3 z3Var = new z3(new int[0], 0);
        f3548h = z3Var;
        z3Var.e = false;
    }

    public z3() {
        this.f3549f = new int[10];
        this.f3550g = 0;
    }

    public final /* synthetic */ void add(int i2, Object obj) {
        int i3;
        int intValue = ((Integer) obj).intValue();
        c();
        if (i2 < 0 || i2 > (i3 = this.f3550g)) {
            throw new IndexOutOfBoundsException(f(i2));
        }
        int[] iArr = this.f3549f;
        if (i3 < iArr.length) {
            System.arraycopy(iArr, i2, iArr, i2 + 1, i3 - i2);
        } else {
            int[] iArr2 = new int[(((i3 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            System.arraycopy(this.f3549f, i2, iArr2, i2 + 1, this.f3550g - i2);
            this.f3549f = iArr2;
        }
        this.f3549f[i2] = intValue;
        this.f3550g++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Integer> collection) {
        c();
        y3.a(collection);
        if (!(collection instanceof z3)) {
            return super.addAll(collection);
        }
        z3 z3Var = (z3) collection;
        int i2 = z3Var.f3550g;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f3550g;
        if (Integer.MAX_VALUE - i3 >= i2) {
            int i4 = i3 + i2;
            int[] iArr = this.f3549f;
            if (i4 > iArr.length) {
                this.f3549f = Arrays.copyOf(iArr, i4);
            }
            System.arraycopy(z3Var.f3549f, 0, this.f3549f, this.f3550g, z3Var.f3550g);
            this.f3550g = i4;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: b */
    public final b4 a(int i2) {
        if (i2 >= this.f3550g) {
            return new z3(Arrays.copyOf(this.f3549f, i2), this.f3550g);
        }
        throw new IllegalArgumentException();
    }

    public final int c(int i2) {
        e(i2);
        return this.f3549f[i2];
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i2) {
        c();
        int i3 = this.f3550g;
        int[] iArr = this.f3549f;
        if (i3 == iArr.length) {
            int[] iArr2 = new int[(((i3 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i3);
            this.f3549f = iArr2;
        }
        int[] iArr3 = this.f3549f;
        int i4 = this.f3550g;
        this.f3550g = i4 + 1;
        iArr3[i4] = i2;
    }

    public final void e(int i2) {
        if (i2 < 0 || i2 >= this.f3550g) {
            throw new IndexOutOfBoundsException(f(i2));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z3)) {
            return super.equals(obj);
        }
        z3 z3Var = (z3) obj;
        if (this.f3550g != z3Var.f3550g) {
            return false;
        }
        int[] iArr = z3Var.f3549f;
        for (int i2 = 0; i2 < this.f3550g; i2++) {
            if (this.f3549f[i2] != iArr[i2]) {
                return false;
            }
        }
        return true;
    }

    public final String f(int i2) {
        int i3 = this.f3550g;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i2);
        sb.append(", Size:");
        sb.append(i3);
        return sb.toString();
    }

    public final /* synthetic */ Object get(int i2) {
        e(i2);
        return Integer.valueOf(this.f3549f[i2]);
    }

    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f3550g; i3++) {
            i2 = (i2 * 31) + this.f3549f[i3];
        }
        return i2;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i2 = this.f3550g;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.f3549f[i3] == intValue) {
                return i3;
            }
        }
        return -1;
    }

    public final boolean remove(Object obj) {
        c();
        for (int i2 = 0; i2 < this.f3550g; i2++) {
            if (obj.equals(Integer.valueOf(this.f3549f[i2]))) {
                int[] iArr = this.f3549f;
                System.arraycopy(iArr, i2 + 1, iArr, i2, (this.f3550g - i2) - 1);
                this.f3550g--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    public final void removeRange(int i2, int i3) {
        c();
        if (i3 >= i2) {
            int[] iArr = this.f3549f;
            System.arraycopy(iArr, i3, iArr, i2, this.f3550g - i3);
            this.f3550g -= i3 - i2;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i2, Object obj) {
        int intValue = ((Integer) obj).intValue();
        c();
        e(i2);
        int[] iArr = this.f3549f;
        int i3 = iArr[i2];
        iArr[i2] = intValue;
        return Integer.valueOf(i3);
    }

    public final int size() {
        return this.f3550g;
    }

    public z3(int[] iArr, int i2) {
        this.f3549f = iArr;
        this.f3550g = i2;
    }

    public final /* synthetic */ Object remove(int i2) {
        c();
        e(i2);
        int[] iArr = this.f3549f;
        int i3 = iArr[i2];
        int i4 = this.f3550g;
        if (i2 < i4 - 1) {
            System.arraycopy(iArr, i2 + 1, iArr, i2, (i4 - i2) - 1);
        }
        this.f3550g--;
        this.modCount++;
        return Integer.valueOf(i3);
    }

    public final /* synthetic */ boolean add(Object obj) {
        d(((Integer) obj).intValue());
        return true;
    }
}
