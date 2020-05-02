package i.c.a.b.g.g;

import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.3.0 */
public final class s5<E> extends p2<E> implements RandomAccess {

    /* renamed from: h  reason: collision with root package name */
    public static final s5<Object> f3444h;

    /* renamed from: f  reason: collision with root package name */
    public E[] f3445f;

    /* renamed from: g  reason: collision with root package name */
    public int f3446g;

    static {
        s5<Object> s5Var = new s5<>(new Object[0], 0);
        f3444h = s5Var;
        s5Var.e = false;
    }

    public s5(E[] eArr, int i2) {
        this.f3445f = eArr;
        this.f3446g = i2;
    }

    public final /* synthetic */ d4 a(int i2) {
        if (i2 >= this.f3446g) {
            return new s5(Arrays.copyOf(this.f3445f, i2), this.f3446g);
        }
        throw new IllegalArgumentException();
    }

    public final boolean add(E e) {
        c();
        int i2 = this.f3446g;
        E[] eArr = this.f3445f;
        if (i2 == eArr.length) {
            this.f3445f = Arrays.copyOf(eArr, ((i2 * 3) / 2) + 1);
        }
        E[] eArr2 = this.f3445f;
        int i3 = this.f3446g;
        this.f3446g = i3 + 1;
        eArr2[i3] = e;
        this.modCount++;
        return true;
    }

    public final void b(int i2) {
        if (i2 < 0 || i2 >= this.f3446g) {
            throw new IndexOutOfBoundsException(c(i2));
        }
    }

    public final String c(int i2) {
        int i3 = this.f3446g;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i2);
        sb.append(", Size:");
        sb.append(i3);
        return sb.toString();
    }

    public final E get(int i2) {
        b(i2);
        return this.f3445f[i2];
    }

    public final E remove(int i2) {
        c();
        b(i2);
        E[] eArr = this.f3445f;
        E e = eArr[i2];
        int i3 = this.f3446g;
        if (i2 < i3 - 1) {
            System.arraycopy(eArr, i2 + 1, eArr, i2, (i3 - i2) - 1);
        }
        this.f3446g--;
        this.modCount++;
        return e;
    }

    public final E set(int i2, E e) {
        c();
        b(i2);
        E[] eArr = this.f3445f;
        E e2 = eArr[i2];
        eArr[i2] = e;
        this.modCount++;
        return e2;
    }

    public final int size() {
        return this.f3446g;
    }

    public final void add(int i2, E e) {
        int i3;
        c();
        if (i2 < 0 || i2 > (i3 = this.f3446g)) {
            throw new IndexOutOfBoundsException(c(i2));
        }
        E[] eArr = this.f3445f;
        if (i3 < eArr.length) {
            System.arraycopy(eArr, i2, eArr, i2 + 1, i3 - i2);
        } else {
            E[] eArr2 = new Object[(((i3 * 3) / 2) + 1)];
            System.arraycopy(eArr, 0, eArr2, 0, i2);
            System.arraycopy(this.f3445f, i2, eArr2, i2 + 1, this.f3446g - i2);
            this.f3445f = eArr2;
        }
        this.f3445f[i2] = e;
        this.f3446g++;
        this.modCount++;
    }
}
