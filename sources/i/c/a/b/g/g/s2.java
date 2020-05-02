package i.c.a.b.g.g;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.3.0 */
public final class s2 extends p2<Boolean> implements d4<Boolean>, q5, RandomAccess {

    /* renamed from: f  reason: collision with root package name */
    public boolean[] f3441f;

    /* renamed from: g  reason: collision with root package name */
    public int f3442g;

    static {
        new s2(new boolean[0], 0).e = false;
    }

    public s2() {
        this.f3441f = new boolean[10];
        this.f3442g = 0;
    }

    public final void a(boolean z) {
        c();
        int i2 = this.f3442g;
        boolean[] zArr = this.f3441f;
        if (i2 == zArr.length) {
            boolean[] zArr2 = new boolean[(((i2 * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i2);
            this.f3441f = zArr2;
        }
        boolean[] zArr3 = this.f3441f;
        int i3 = this.f3442g;
        this.f3442g = i3 + 1;
        zArr3[i3] = z;
    }

    public final /* synthetic */ void add(int i2, Object obj) {
        int i3;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        c();
        if (i2 < 0 || i2 > (i3 = this.f3442g)) {
            throw new IndexOutOfBoundsException(c(i2));
        }
        boolean[] zArr = this.f3441f;
        if (i3 < zArr.length) {
            System.arraycopy(zArr, i2, zArr, i2 + 1, i3 - i2);
        } else {
            boolean[] zArr2 = new boolean[(((i3 * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i2);
            System.arraycopy(this.f3441f, i2, zArr2, i2 + 1, this.f3442g - i2);
            this.f3441f = zArr2;
        }
        this.f3441f[i2] = booleanValue;
        this.f3442g++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Boolean> collection) {
        c();
        y3.a(collection);
        if (!(collection instanceof s2)) {
            return super.addAll(collection);
        }
        s2 s2Var = (s2) collection;
        int i2 = s2Var.f3442g;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f3442g;
        if (Integer.MAX_VALUE - i3 >= i2) {
            int i4 = i3 + i2;
            boolean[] zArr = this.f3441f;
            if (i4 > zArr.length) {
                this.f3441f = Arrays.copyOf(zArr, i4);
            }
            System.arraycopy(s2Var.f3441f, 0, this.f3441f, this.f3442g, s2Var.f3442g);
            this.f3442g = i4;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final void b(int i2) {
        if (i2 < 0 || i2 >= this.f3442g) {
            throw new IndexOutOfBoundsException(c(i2));
        }
    }

    public final String c(int i2) {
        int i3 = this.f3442g;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i2);
        sb.append(", Size:");
        sb.append(i3);
        return sb.toString();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s2)) {
            return super.equals(obj);
        }
        s2 s2Var = (s2) obj;
        if (this.f3442g != s2Var.f3442g) {
            return false;
        }
        boolean[] zArr = s2Var.f3441f;
        for (int i2 = 0; i2 < this.f3442g; i2++) {
            if (this.f3441f[i2] != zArr[i2]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i2) {
        b(i2);
        return Boolean.valueOf(this.f3441f[i2]);
    }

    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f3442g; i3++) {
            i2 = (i2 * 31) + y3.a(this.f3441f[i3]);
        }
        return i2;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i2 = this.f3442g;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.f3441f[i3] == booleanValue) {
                return i3;
            }
        }
        return -1;
    }

    public final boolean remove(Object obj) {
        c();
        for (int i2 = 0; i2 < this.f3442g; i2++) {
            if (obj.equals(Boolean.valueOf(this.f3441f[i2]))) {
                boolean[] zArr = this.f3441f;
                System.arraycopy(zArr, i2 + 1, zArr, i2, (this.f3442g - i2) - 1);
                this.f3442g--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    public final void removeRange(int i2, int i3) {
        c();
        if (i3 >= i2) {
            boolean[] zArr = this.f3441f;
            System.arraycopy(zArr, i3, zArr, i2, this.f3442g - i3);
            this.f3442g -= i3 - i2;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i2, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        c();
        b(i2);
        boolean[] zArr = this.f3441f;
        boolean z = zArr[i2];
        zArr[i2] = booleanValue;
        return Boolean.valueOf(z);
    }

    public final int size() {
        return this.f3442g;
    }

    public s2(boolean[] zArr, int i2) {
        this.f3441f = zArr;
        this.f3442g = i2;
    }

    public final /* synthetic */ Object remove(int i2) {
        c();
        b(i2);
        boolean[] zArr = this.f3441f;
        boolean z = zArr[i2];
        int i3 = this.f3442g;
        if (i2 < i3 - 1) {
            System.arraycopy(zArr, i2 + 1, zArr, i2, (i3 - i2) - 1);
        }
        this.f3442g--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    public final /* synthetic */ d4 a(int i2) {
        if (i2 >= this.f3442g) {
            return new s2(Arrays.copyOf(this.f3441f, i2), this.f3442g);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ boolean add(Object obj) {
        a(((Boolean) obj).booleanValue());
        return true;
    }
}
