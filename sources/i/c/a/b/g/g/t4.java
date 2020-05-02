package i.c.a.b.g.g;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.3.0 */
public final class t4 extends p2<Long> implements e4, q5, RandomAccess {

    /* renamed from: h  reason: collision with root package name */
    public static final t4 f3455h;

    /* renamed from: f  reason: collision with root package name */
    public long[] f3456f;

    /* renamed from: g  reason: collision with root package name */
    public int f3457g;

    static {
        t4 t4Var = new t4(new long[0], 0);
        f3455h = t4Var;
        t4Var.e = false;
    }

    public t4() {
        this.f3456f = new long[10];
        this.f3457g = 0;
    }

    public final void a(long j2) {
        c();
        int i2 = this.f3457g;
        long[] jArr = this.f3456f;
        if (i2 == jArr.length) {
            long[] jArr2 = new long[(((i2 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i2);
            this.f3456f = jArr2;
        }
        long[] jArr3 = this.f3456f;
        int i3 = this.f3457g;
        this.f3457g = i3 + 1;
        jArr3[i3] = j2;
    }

    public final /* synthetic */ void add(int i2, Object obj) {
        int i3;
        long longValue = ((Long) obj).longValue();
        c();
        if (i2 < 0 || i2 > (i3 = this.f3457g)) {
            throw new IndexOutOfBoundsException(e(i2));
        }
        long[] jArr = this.f3456f;
        if (i3 < jArr.length) {
            System.arraycopy(jArr, i2, jArr, i2 + 1, i3 - i2);
        } else {
            long[] jArr2 = new long[(((i3 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i2);
            System.arraycopy(this.f3456f, i2, jArr2, i2 + 1, this.f3457g - i2);
            this.f3456f = jArr2;
        }
        this.f3456f[i2] = longValue;
        this.f3457g++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Long> collection) {
        c();
        y3.a(collection);
        if (!(collection instanceof t4)) {
            return super.addAll(collection);
        }
        t4 t4Var = (t4) collection;
        int i2 = t4Var.f3457g;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f3457g;
        if (Integer.MAX_VALUE - i3 >= i2) {
            int i4 = i3 + i2;
            long[] jArr = this.f3456f;
            if (i4 > jArr.length) {
                this.f3456f = Arrays.copyOf(jArr, i4);
            }
            System.arraycopy(t4Var.f3456f, 0, this.f3456f, this.f3457g, t4Var.f3457g);
            this.f3457g = i4;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final long b(int i2) {
        d(i2);
        return this.f3456f[i2];
    }

    /* renamed from: c */
    public final e4 a(int i2) {
        if (i2 >= this.f3457g) {
            return new t4(Arrays.copyOf(this.f3456f, i2), this.f3457g);
        }
        throw new IllegalArgumentException();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i2) {
        if (i2 < 0 || i2 >= this.f3457g) {
            throw new IndexOutOfBoundsException(e(i2));
        }
    }

    public final String e(int i2) {
        int i3 = this.f3457g;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i2);
        sb.append(", Size:");
        sb.append(i3);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t4)) {
            return super.equals(obj);
        }
        t4 t4Var = (t4) obj;
        if (this.f3457g != t4Var.f3457g) {
            return false;
        }
        long[] jArr = t4Var.f3456f;
        for (int i2 = 0; i2 < this.f3457g; i2++) {
            if (this.f3456f[i2] != jArr[i2]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i2) {
        d(i2);
        return Long.valueOf(this.f3456f[i2]);
    }

    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f3457g; i3++) {
            i2 = (i2 * 31) + y3.a(this.f3456f[i3]);
        }
        return i2;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i2 = this.f3457g;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.f3456f[i3] == longValue) {
                return i3;
            }
        }
        return -1;
    }

    public final boolean remove(Object obj) {
        c();
        for (int i2 = 0; i2 < this.f3457g; i2++) {
            if (obj.equals(Long.valueOf(this.f3456f[i2]))) {
                long[] jArr = this.f3456f;
                System.arraycopy(jArr, i2 + 1, jArr, i2, (this.f3457g - i2) - 1);
                this.f3457g--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    public final void removeRange(int i2, int i3) {
        c();
        if (i3 >= i2) {
            long[] jArr = this.f3456f;
            System.arraycopy(jArr, i3, jArr, i2, this.f3457g - i3);
            this.f3457g -= i3 - i2;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i2, Object obj) {
        long longValue = ((Long) obj).longValue();
        c();
        d(i2);
        long[] jArr = this.f3456f;
        long j2 = jArr[i2];
        jArr[i2] = longValue;
        return Long.valueOf(j2);
    }

    public final int size() {
        return this.f3457g;
    }

    public t4(long[] jArr, int i2) {
        this.f3456f = jArr;
        this.f3457g = i2;
    }

    public final /* synthetic */ Object remove(int i2) {
        c();
        d(i2);
        long[] jArr = this.f3456f;
        long j2 = jArr[i2];
        int i3 = this.f3457g;
        if (i2 < i3 - 1) {
            System.arraycopy(jArr, i2 + 1, jArr, i2, (i3 - i2) - 1);
        }
        this.f3457g--;
        this.modCount++;
        return Long.valueOf(j2);
    }

    public final /* synthetic */ boolean add(Object obj) {
        a(((Long) obj).longValue());
        return true;
    }
}
