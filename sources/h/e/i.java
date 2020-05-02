package h.e;

/* compiled from: SparseArrayCompat */
public class i<E> implements Cloneable {

    /* renamed from: i  reason: collision with root package name */
    public static final Object f1571i = new Object();
    public boolean e;

    /* renamed from: f  reason: collision with root package name */
    public int[] f1572f;

    /* renamed from: g  reason: collision with root package name */
    public Object[] f1573g;

    /* renamed from: h  reason: collision with root package name */
    public int f1574h;

    public i() {
        this(10);
    }

    public E a(int i2) {
        return b(i2, (Object) null);
    }

    public E b(int i2, E e2) {
        int a = d.a(this.f1572f, this.f1574h, i2);
        if (a >= 0) {
            E[] eArr = this.f1573g;
            if (eArr[a] != f1571i) {
                return eArr[a];
            }
        }
        return e2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = r3.f1573g;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c(int r4) {
        /*
            r3 = this;
            int[] r0 = r3.f1572f
            int r1 = r3.f1574h
            int r4 = h.e.d.a((int[]) r0, (int) r1, (int) r4)
            if (r4 < 0) goto L_0x0017
            java.lang.Object[] r0 = r3.f1573g
            r1 = r0[r4]
            java.lang.Object r2 = f1571i
            if (r1 == r2) goto L_0x0017
            r0[r4] = r2
            r4 = 1
            r3.e = r4
        L_0x0017:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h.e.i.c(int):void");
    }

    public E d(int i2) {
        if (this.e) {
            b();
        }
        return this.f1573g[i2];
    }

    public String toString() {
        if (c() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1574h * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.f1574h; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(b(i2));
            sb.append('=');
            Object d = d(i2);
            if (d != this) {
                sb.append(d);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public i(int i2) {
        this.e = false;
        if (i2 == 0) {
            this.f1572f = d.a;
            this.f1573g = d.c;
            return;
        }
        int b2 = d.b(i2);
        this.f1572f = new int[b2];
        this.f1573g = new Object[b2];
    }

    public void a(int i2, E e2) {
        int i3 = this.f1574h;
        if (i3 == 0 || i2 > this.f1572f[i3 - 1]) {
            if (this.e && this.f1574h >= this.f1572f.length) {
                b();
            }
            int i4 = this.f1574h;
            if (i4 >= this.f1572f.length) {
                int b2 = d.b(i4 + 1);
                int[] iArr = new int[b2];
                Object[] objArr = new Object[b2];
                int[] iArr2 = this.f1572f;
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                Object[] objArr2 = this.f1573g;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f1572f = iArr;
                this.f1573g = objArr;
            }
            this.f1572f[i4] = i2;
            this.f1573g[i4] = e2;
            this.f1574h = i4 + 1;
            return;
        }
        c(i2, e2);
    }

    public i<E> clone() {
        try {
            i<E> iVar = (i) super.clone();
            iVar.f1572f = (int[]) this.f1572f.clone();
            iVar.f1573g = (Object[]) this.f1573g.clone();
            return iVar;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public final void b() {
        int i2 = this.f1574h;
        int[] iArr = this.f1572f;
        Object[] objArr = this.f1573g;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            if (obj != f1571i) {
                if (i4 != i3) {
                    iArr[i3] = iArr[i4];
                    objArr[i3] = obj;
                    objArr[i4] = null;
                }
                i3++;
            }
        }
        this.e = false;
        this.f1574h = i3;
    }

    public void c(int i2, E e2) {
        int a = d.a(this.f1572f, this.f1574h, i2);
        if (a >= 0) {
            this.f1573g[a] = e2;
            return;
        }
        int i3 = ~a;
        if (i3 < this.f1574h) {
            Object[] objArr = this.f1573g;
            if (objArr[i3] == f1571i) {
                this.f1572f[i3] = i2;
                objArr[i3] = e2;
                return;
            }
        }
        if (this.e && this.f1574h >= this.f1572f.length) {
            b();
            i3 = ~d.a(this.f1572f, this.f1574h, i2);
        }
        int i4 = this.f1574h;
        if (i4 >= this.f1572f.length) {
            int b2 = d.b(i4 + 1);
            int[] iArr = new int[b2];
            Object[] objArr2 = new Object[b2];
            int[] iArr2 = this.f1572f;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f1573g;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f1572f = iArr;
            this.f1573g = objArr2;
        }
        int i5 = this.f1574h;
        if (i5 - i3 != 0) {
            int[] iArr3 = this.f1572f;
            int i6 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i6, i5 - i3);
            Object[] objArr4 = this.f1573g;
            System.arraycopy(objArr4, i3, objArr4, i6, this.f1574h - i3);
        }
        this.f1572f[i3] = i2;
        this.f1573g[i3] = e2;
        this.f1574h++;
    }

    public int b(int i2) {
        if (this.e) {
            b();
        }
        return this.f1572f[i2];
    }

    public int c() {
        if (this.e) {
            b();
        }
        return this.f1574h;
    }
}
