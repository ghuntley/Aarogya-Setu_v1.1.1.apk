package o.o0.j;

/* compiled from: Settings */
public final class p {
    public int a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f5592b = new int[10];

    public p a(int i2, int i3) {
        if (i2 >= 0) {
            int[] iArr = this.f5592b;
            if (i2 < iArr.length) {
                this.a = (1 << i2) | this.a;
                iArr[i2] = i3;
            }
        }
        return this;
    }

    public int a() {
        if ((this.a & 128) != 0) {
            return this.f5592b[7];
        }
        return 65535;
    }
}
