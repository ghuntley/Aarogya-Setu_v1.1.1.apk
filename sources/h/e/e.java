package h.e;

/* compiled from: LongSparseArray */
public class e<E> implements Cloneable {

    /* renamed from: i  reason: collision with root package name */
    public static final Object f1550i = new Object();
    public boolean e = false;

    /* renamed from: f  reason: collision with root package name */
    public long[] f1551f;

    /* renamed from: g  reason: collision with root package name */
    public Object[] f1552g;

    /* renamed from: h  reason: collision with root package name */
    public int f1553h;

    public e() {
        int c = d.c(10);
        this.f1551f = new long[c];
        this.f1552g = new Object[c];
    }

    public E a(long j2) {
        return b(j2, (Object) null);
    }

    public E b(long j2, E e2) {
        int a = d.a(this.f1551f, this.f1553h, j2);
        if (a >= 0) {
            E[] eArr = this.f1552g;
            if (eArr[a] != f1550i) {
                return eArr[a];
            }
        }
        return e2;
    }

    public final void c() {
        int i2 = this.f1553h;
        long[] jArr = this.f1551f;
        Object[] objArr = this.f1552g;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            if (obj != f1550i) {
                if (i4 != i3) {
                    jArr[i3] = jArr[i4];
                    objArr[i3] = obj;
                    objArr[i4] = null;
                }
                i3++;
            }
        }
        this.e = false;
        this.f1553h = i3;
    }

    public int d() {
        if (this.e) {
            c();
        }
        return this.f1553h;
    }

    public String toString() {
        if (d() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1553h * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.f1553h; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            if (this.e) {
                c();
            }
            sb.append(this.f1551f[i2]);
            sb.append('=');
            Object a = a(i2);
            if (a != this) {
                sb.append(a);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public E a(int i2) {
        if (this.e) {
            c();
        }
        return this.f1552g[i2];
    }

    public e<E> clone() {
        try {
            e<E> eVar = (e) super.clone();
            eVar.f1551f = (long[]) this.f1551f.clone();
            eVar.f1552g = (Object[]) this.f1552g.clone();
            return eVar;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public void b() {
        int i2 = this.f1553h;
        Object[] objArr = this.f1552g;
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = null;
        }
        this.f1553h = 0;
        this.e = false;
    }

    public void a(long j2, E e2) {
        int i2 = this.f1553h;
        if (i2 == 0 || j2 > this.f1551f[i2 - 1]) {
            if (this.e && this.f1553h >= this.f1551f.length) {
                c();
            }
            int i3 = this.f1553h;
            if (i3 >= this.f1551f.length) {
                int c = d.c(i3 + 1);
                long[] jArr = new long[c];
                Object[] objArr = new Object[c];
                long[] jArr2 = this.f1551f;
                System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
                Object[] objArr2 = this.f1552g;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f1551f = jArr;
                this.f1552g = objArr;
            }
            this.f1551f[i3] = j2;
            this.f1552g[i3] = e2;
            this.f1553h = i3 + 1;
            return;
        }
        c(j2, e2);
    }

    public void c(long j2, E e2) {
        int a = d.a(this.f1551f, this.f1553h, j2);
        if (a >= 0) {
            this.f1552g[a] = e2;
            return;
        }
        int i2 = ~a;
        if (i2 < this.f1553h) {
            Object[] objArr = this.f1552g;
            if (objArr[i2] == f1550i) {
                this.f1551f[i2] = j2;
                objArr[i2] = e2;
                return;
            }
        }
        if (this.e && this.f1553h >= this.f1551f.length) {
            c();
            i2 = ~d.a(this.f1551f, this.f1553h, j2);
        }
        int i3 = this.f1553h;
        if (i3 >= this.f1551f.length) {
            int c = d.c(i3 + 1);
            long[] jArr = new long[c];
            Object[] objArr2 = new Object[c];
            long[] jArr2 = this.f1551f;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f1552g;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f1551f = jArr;
            this.f1552g = objArr2;
        }
        int i4 = this.f1553h;
        if (i4 - i2 != 0) {
            long[] jArr3 = this.f1551f;
            int i5 = i2 + 1;
            System.arraycopy(jArr3, i2, jArr3, i5, i4 - i2);
            Object[] objArr4 = this.f1552g;
            System.arraycopy(objArr4, i2, objArr4, i5, this.f1553h - i2);
        }
        this.f1551f[i2] = j2;
        this.f1552g[i2] = e2;
        this.f1553h++;
    }
}
