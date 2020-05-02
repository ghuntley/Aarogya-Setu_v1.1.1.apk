package i.c.a.b.g.g;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.3.0 */
public final class g3 extends p2<Double> implements d4<Double>, q5, RandomAccess {

    /* renamed from: f  reason: collision with root package name */
    public double[] f3279f;

    /* renamed from: g  reason: collision with root package name */
    public int f3280g;

    static {
        new g3(new double[0], 0).e = false;
    }

    public g3() {
        this.f3279f = new double[10];
        this.f3280g = 0;
    }

    public final void a(double d) {
        c();
        int i2 = this.f3280g;
        double[] dArr = this.f3279f;
        if (i2 == dArr.length) {
            double[] dArr2 = new double[(((i2 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i2);
            this.f3279f = dArr2;
        }
        double[] dArr3 = this.f3279f;
        int i3 = this.f3280g;
        this.f3280g = i3 + 1;
        dArr3[i3] = d;
    }

    public final /* synthetic */ void add(int i2, Object obj) {
        int i3;
        double doubleValue = ((Double) obj).doubleValue();
        c();
        if (i2 < 0 || i2 > (i3 = this.f3280g)) {
            throw new IndexOutOfBoundsException(c(i2));
        }
        double[] dArr = this.f3279f;
        if (i3 < dArr.length) {
            System.arraycopy(dArr, i2, dArr, i2 + 1, i3 - i2);
        } else {
            double[] dArr2 = new double[(((i3 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i2);
            System.arraycopy(this.f3279f, i2, dArr2, i2 + 1, this.f3280g - i2);
            this.f3279f = dArr2;
        }
        this.f3279f[i2] = doubleValue;
        this.f3280g++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Double> collection) {
        c();
        y3.a(collection);
        if (!(collection instanceof g3)) {
            return super.addAll(collection);
        }
        g3 g3Var = (g3) collection;
        int i2 = g3Var.f3280g;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f3280g;
        if (Integer.MAX_VALUE - i3 >= i2) {
            int i4 = i3 + i2;
            double[] dArr = this.f3279f;
            if (i4 > dArr.length) {
                this.f3279f = Arrays.copyOf(dArr, i4);
            }
            System.arraycopy(g3Var.f3279f, 0, this.f3279f, this.f3280g, g3Var.f3280g);
            this.f3280g = i4;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final void b(int i2) {
        if (i2 < 0 || i2 >= this.f3280g) {
            throw new IndexOutOfBoundsException(c(i2));
        }
    }

    public final String c(int i2) {
        int i3 = this.f3280g;
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
        if (!(obj instanceof g3)) {
            return super.equals(obj);
        }
        g3 g3Var = (g3) obj;
        if (this.f3280g != g3Var.f3280g) {
            return false;
        }
        double[] dArr = g3Var.f3279f;
        for (int i2 = 0; i2 < this.f3280g; i2++) {
            if (Double.doubleToLongBits(this.f3279f[i2]) != Double.doubleToLongBits(dArr[i2])) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i2) {
        b(i2);
        return Double.valueOf(this.f3279f[i2]);
    }

    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f3280g; i3++) {
            i2 = (i2 * 31) + y3.a(Double.doubleToLongBits(this.f3279f[i3]));
        }
        return i2;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int i2 = this.f3280g;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.f3279f[i3] == doubleValue) {
                return i3;
            }
        }
        return -1;
    }

    public final boolean remove(Object obj) {
        c();
        for (int i2 = 0; i2 < this.f3280g; i2++) {
            if (obj.equals(Double.valueOf(this.f3279f[i2]))) {
                double[] dArr = this.f3279f;
                System.arraycopy(dArr, i2 + 1, dArr, i2, (this.f3280g - i2) - 1);
                this.f3280g--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    public final void removeRange(int i2, int i3) {
        c();
        if (i3 >= i2) {
            double[] dArr = this.f3279f;
            System.arraycopy(dArr, i3, dArr, i2, this.f3280g - i3);
            this.f3280g -= i3 - i2;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i2, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        c();
        b(i2);
        double[] dArr = this.f3279f;
        double d = dArr[i2];
        dArr[i2] = doubleValue;
        return Double.valueOf(d);
    }

    public final int size() {
        return this.f3280g;
    }

    public g3(double[] dArr, int i2) {
        this.f3279f = dArr;
        this.f3280g = i2;
    }

    public final /* synthetic */ Object remove(int i2) {
        c();
        b(i2);
        double[] dArr = this.f3279f;
        double d = dArr[i2];
        int i3 = this.f3280g;
        if (i2 < i3 - 1) {
            System.arraycopy(dArr, i2 + 1, dArr, i2, (i3 - i2) - 1);
        }
        this.f3280g--;
        this.modCount++;
        return Double.valueOf(d);
    }

    public final /* synthetic */ d4 a(int i2) {
        if (i2 >= this.f3280g) {
            return new g3(Arrays.copyOf(this.f3279f, i2), this.f3280g);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ boolean add(Object obj) {
        a(((Double) obj).doubleValue());
        return true;
    }
}
