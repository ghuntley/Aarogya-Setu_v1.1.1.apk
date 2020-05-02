package i.c.a.b.g.g;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.3.0 */
public final class v3 extends p2<Float> implements d4<Float>, q5, RandomAccess {

    /* renamed from: f  reason: collision with root package name */
    public float[] f3491f;

    /* renamed from: g  reason: collision with root package name */
    public int f3492g;

    static {
        new v3(new float[0], 0).e = false;
    }

    public v3() {
        this.f3491f = new float[10];
        this.f3492g = 0;
    }

    public final void a(float f2) {
        c();
        int i2 = this.f3492g;
        float[] fArr = this.f3491f;
        if (i2 == fArr.length) {
            float[] fArr2 = new float[(((i2 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i2);
            this.f3491f = fArr2;
        }
        float[] fArr3 = this.f3491f;
        int i3 = this.f3492g;
        this.f3492g = i3 + 1;
        fArr3[i3] = f2;
    }

    public final /* synthetic */ void add(int i2, Object obj) {
        int i3;
        float floatValue = ((Float) obj).floatValue();
        c();
        if (i2 < 0 || i2 > (i3 = this.f3492g)) {
            throw new IndexOutOfBoundsException(c(i2));
        }
        float[] fArr = this.f3491f;
        if (i3 < fArr.length) {
            System.arraycopy(fArr, i2, fArr, i2 + 1, i3 - i2);
        } else {
            float[] fArr2 = new float[(((i3 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i2);
            System.arraycopy(this.f3491f, i2, fArr2, i2 + 1, this.f3492g - i2);
            this.f3491f = fArr2;
        }
        this.f3491f[i2] = floatValue;
        this.f3492g++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Float> collection) {
        c();
        y3.a(collection);
        if (!(collection instanceof v3)) {
            return super.addAll(collection);
        }
        v3 v3Var = (v3) collection;
        int i2 = v3Var.f3492g;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f3492g;
        if (Integer.MAX_VALUE - i3 >= i2) {
            int i4 = i3 + i2;
            float[] fArr = this.f3491f;
            if (i4 > fArr.length) {
                this.f3491f = Arrays.copyOf(fArr, i4);
            }
            System.arraycopy(v3Var.f3491f, 0, this.f3491f, this.f3492g, v3Var.f3492g);
            this.f3492g = i4;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final void b(int i2) {
        if (i2 < 0 || i2 >= this.f3492g) {
            throw new IndexOutOfBoundsException(c(i2));
        }
    }

    public final String c(int i2) {
        int i3 = this.f3492g;
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
        if (!(obj instanceof v3)) {
            return super.equals(obj);
        }
        v3 v3Var = (v3) obj;
        if (this.f3492g != v3Var.f3492g) {
            return false;
        }
        float[] fArr = v3Var.f3491f;
        for (int i2 = 0; i2 < this.f3492g; i2++) {
            if (Float.floatToIntBits(this.f3491f[i2]) != Float.floatToIntBits(fArr[i2])) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i2) {
        b(i2);
        return Float.valueOf(this.f3491f[i2]);
    }

    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f3492g; i3++) {
            i2 = (i2 * 31) + Float.floatToIntBits(this.f3491f[i3]);
        }
        return i2;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i2 = this.f3492g;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.f3491f[i3] == floatValue) {
                return i3;
            }
        }
        return -1;
    }

    public final boolean remove(Object obj) {
        c();
        for (int i2 = 0; i2 < this.f3492g; i2++) {
            if (obj.equals(Float.valueOf(this.f3491f[i2]))) {
                float[] fArr = this.f3491f;
                System.arraycopy(fArr, i2 + 1, fArr, i2, (this.f3492g - i2) - 1);
                this.f3492g--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    public final void removeRange(int i2, int i3) {
        c();
        if (i3 >= i2) {
            float[] fArr = this.f3491f;
            System.arraycopy(fArr, i3, fArr, i2, this.f3492g - i3);
            this.f3492g -= i3 - i2;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i2, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        c();
        b(i2);
        float[] fArr = this.f3491f;
        float f2 = fArr[i2];
        fArr[i2] = floatValue;
        return Float.valueOf(f2);
    }

    public final int size() {
        return this.f3492g;
    }

    public v3(float[] fArr, int i2) {
        this.f3491f = fArr;
        this.f3492g = i2;
    }

    public final /* synthetic */ Object remove(int i2) {
        c();
        b(i2);
        float[] fArr = this.f3491f;
        float f2 = fArr[i2];
        int i3 = this.f3492g;
        if (i2 < i3 - 1) {
            System.arraycopy(fArr, i2 + 1, fArr, i2, (i3 - i2) - 1);
        }
        this.f3492g--;
        this.modCount++;
        return Float.valueOf(f2);
    }

    public final /* synthetic */ d4 a(int i2) {
        if (i2 >= this.f3492g) {
            return new v3(Arrays.copyOf(this.f3491f, i2), this.f3492g);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ boolean add(Object obj) {
        a(((Float) obj).floatValue());
        return true;
    }
}
