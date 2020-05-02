package i.c.a.b.g.g;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.3.0 */
public final class z2 extends c3 {

    /* renamed from: i  reason: collision with root package name */
    public final int f3546i;

    /* renamed from: j  reason: collision with root package name */
    public final int f3547j;

    public z2(byte[] bArr, int i2, int i3) {
        super(bArr);
        u2.a(i2, i2 + i3, bArr.length);
        this.f3546i = i2;
        this.f3547j = i3;
    }

    public final byte a(int i2) {
        int i3 = this.f3547j;
        if (((i3 - (i2 + 1)) | i2) >= 0) {
            return this.f3237h[this.f3546i + i2];
        }
        if (i2 < 0) {
            StringBuilder sb = new StringBuilder(22);
            sb.append("Index < 0: ");
            sb.append(i2);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("Index > length: ");
        sb2.append(i2);
        sb2.append(", ");
        sb2.append(i3);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    public final byte b(int i2) {
        return this.f3237h[this.f3546i + i2];
    }

    public final int c() {
        return this.f3546i;
    }

    public final int a() {
        return this.f3547j;
    }
}
